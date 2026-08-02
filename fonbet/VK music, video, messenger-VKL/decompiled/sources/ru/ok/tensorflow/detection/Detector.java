package ru.ok.tensorflow.detection;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.ssd.Util;
import ru.ok.tensorflow.ssd.anchor.Anchor;
import ru.ok.tensorflow.ssd.anchor.AnchorGenerator;
import ru.ok.tensorflow.tflite.Model;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import ru.ok.tensorflow.util.measure.TimeHolder;
import ru.ok.tensorflow.util.measure.Timer;
import xsna.g5m;
import xsna.y7;

/* loaded from: classes9.dex */
public class Detector extends Model implements FrameConsumer {
    private AnchorGenerator anchorGenerator;
    private List<Anchor> anchors;
    private Map<Integer, String> detectionClasses;
    private GLSSBO inputBuffer;
    private TFImageData inputData;
    private int inputHeight;
    private int inputWidth;
    private final Logger logger;
    private float minDetectionScore;
    private float nmsThreshold;
    private int numAnchors;
    private int numClasses;
    private int numLocations;
    private FloatBuffer outputLocationsBuffer;
    private GLSSBO outputLocationsBufferGPU;
    private Map<Integer, Object> outputMap;
    private FloatBuffer outputScoresBuffer;
    private GLSSBO outputScoresBufferGPU;
    private boolean zeroMean;

    public Detector(@NonNull ModelDataProvider modelDataProvider, List<Pair<Integer, Integer>> list, boolean z, boolean z2, float f, float f2, Map<Integer, String> map, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z3, @NonNull Logger logger) {
        super(modelDataProvider, weakReference, weakReference2);
        this.logger = logger;
        this.useGPUPass = z3;
        this.minDetectionScore = f;
        this.nmsThreshold = f2;
        this.detectionClasses = map;
        this.zeroMean = z2;
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        this.inputHeight = inputTensorShape[1];
        this.inputWidth = inputTensorShape[2];
        this.numAnchors = this.interpreterWrapper.getOutputTensorShape(0)[1];
        this.numLocations = this.interpreterWrapper.getOutputTensorShape(0)[2];
        this.numClasses = this.interpreterWrapper.getOutputTensorShape(1)[2];
        AnchorGenerator anchorGenerator = new AnchorGenerator(list, 0.5f, 0.5f);
        this.anchorGenerator = anchorGenerator;
        this.anchors = anchorGenerator.generateAnchors(this.inputHeight, this.inputWidth);
        this.outputLocationsBuffer = FloatBuffer.allocate(this.numAnchors * this.numLocations);
        this.outputScoresBuffer = FloatBuffer.allocate(this.numAnchors * this.numClasses);
        this.inputData = new TFImageData(this.inputHeight, this.inputWidth, z, z2);
        HashMap hashMap = new HashMap();
        this.outputMap = hashMap;
        hashMap.put(0, this.outputLocationsBuffer);
        this.outputMap.put(1, this.outputScoresBuffer);
    }

    private List<Detection> detectInner(FrameHolder frameHolder, boolean z, @Nullable Boolean bool) {
        startInitGPU(null);
        if (z) {
            boolean z2 = bool == null || !bool.booleanValue();
            if (z2) {
                copyInput(frameHolder);
            }
            detectGPU(frameHolder, true ^ z2);
        } else {
            this.inputData.fromBitmap(frameHolder.getCPUFrame());
            this.outputScoresBuffer.clear();
            this.outputLocationsBuffer.clear();
            this.interpreterWrapper.runForMultipleInputsOutputs(new Object[]{this.inputData.buffer}, this.outputMap);
        }
        return Util.nms(this.anchorGenerator.toDetections(this.outputScoresBuffer.array(), this.outputLocationsBuffer.array(), this.anchors, this.numAnchors, this.numLocations, this.numClasses, this.minDetectionScore, frameHolder.getHeight(), frameHolder.getWidth(), this.detectionClasses), this.nmsThreshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectGPU$0(SimpleGLProgram simpleGLProgram) {
        this.outputLocationsBufferGPU.copyDataTo(this.outputLocationsBuffer);
        this.outputScoresBufferGPU.copyDataTo(this.outputScoresBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectGPU$1(boolean z, Map map) {
        this.outputScoresBuffer.clear();
        this.outputLocationsBuffer.clear();
        if (z) {
            this.interpreterWrapper.runForMultipleInputsOutputsGPU(new Object[]{Integer.valueOf(this.inputBuffer.getId())}, map, null, new y7(this, 16));
            return;
        }
        this.interpreterWrapper.runForMultipleInputsOutputsGPU(new Object[]{Integer.valueOf(this.inputBuffer.getId())}, map);
        this.outputLocationsBufferGPU.copyDataTo(this.outputLocationsBuffer);
        this.outputScoresBufferGPU.copyDataTo(this.outputScoresBuffer);
    }

    public void copyInput(FrameHolder frameHolder) {
        initGPUResources();
        copyTextureToBuffer(frameHolder, this.inputBuffer);
    }

    public List<Detection> detectCPU(FrameHolder frameHolder) {
        return detectInner(frameHolder, false, Boolean.FALSE);
    }

    public List<Detection> detectGPU(FrameHolder frameHolder, @Nullable Boolean bool) {
        return detectInner(frameHolder, true, bool);
    }

    public int getInputHeight() {
        return this.inputHeight;
    }

    public int getInputWidth() {
        return this.inputWidth;
    }

    @Override // ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        if (this.outputLocationsBufferGPU == null) {
            this.outputLocationsBufferGPU = createSSBO(this.outputLocationsBuffer.capacity() * 4);
        }
        if (this.outputScoresBufferGPU == null) {
            this.outputScoresBufferGPU = createSSBO(this.outputScoresBuffer.capacity() * 4);
        }
        initConvertShader(this.inputWidth, this.inputHeight, this.zeroMean);
        if (this.inputBuffer == null) {
            this.inputBuffer = createSSBO(this.inputData.buffer.capacity());
        }
        super.initGPUResources();
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        if (tFFrameType == TFFrameType.SMALL) {
            return wantRunWithGPUPass() ? 2 : 1;
        }
        return 0;
    }

    public boolean wantRunWithGPUPass() {
        return this.useGPUPass && this.interpreterWrapper.isGPUInited();
    }

    private Timer.Result detectGPU(FrameHolder frameHolder, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputLocationsBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.outputScoresBufferGPU.getId()));
        return TimeHolder.measureTime(this, "run", new g5m(this, z, hashMap, 0));
    }
}
