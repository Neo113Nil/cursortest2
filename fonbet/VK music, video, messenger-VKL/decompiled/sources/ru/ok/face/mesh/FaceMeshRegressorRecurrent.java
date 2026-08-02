package ru.ok.face.mesh;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.TFFrameType;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.gpu.BaseFaceProcessor;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.util.ExceptionHandler;

/* loaded from: classes9.dex */
public class FaceMeshRegressorRecurrent extends BaseFaceProcessor implements IFaceMeshRegressor {
    private ByteBuffer recurrentMapsInputBuffer;
    protected GLSSBO recurrentMapsInputBufferGPU;
    private ByteBuffer recurrentMapsOutputBuffer;
    protected GLSSBO recurrentMapsOutputBufferGPU;

    public FaceMeshRegressorRecurrent(@NonNull ModelDataProvider modelDataProvider, float f, float f2, boolean z, boolean z2, boolean z3, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z4, GpuCache gpuCache) {
        super(modelDataProvider, f, f2, z, z2, z3, weakReference, weakReference2, z4, gpuCache);
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(1);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(inputTensorShape[0] * inputTensorShape[1] * inputTensorShape[2] * inputTensorShape[3] * 4);
        this.recurrentMapsInputBuffer = allocateDirect;
        allocateDirect.clear();
        this.recurrentMapsOutputBuffer = ByteBuffer.allocateDirect(this.recurrentMapsInputBuffer.capacity());
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor, ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        if (this.recurrentMapsInputBufferGPU == null) {
            this.recurrentMapsInputBufferGPU = createSSBO(this.recurrentMapsInputBuffer.capacity());
        }
        if (this.recurrentMapsOutputBufferGPU == null) {
            this.recurrentMapsOutputBufferGPU = createSSBO(this.recurrentMapsInputBuffer.capacity());
        }
        super.initGPUResources();
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Object[] prepareCPUInput() {
        return new Object[]{this.inputData.buffer, this.recurrentMapsInputBuffer};
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Map<Integer, Object> prepareCPUOutput() {
        this.inputData.fromBitmap(this.crop);
        this.outputBufferLocations.clear();
        this.outputBufferScore.clear();
        this.recurrentMapsInputBuffer.clear();
        this.recurrentMapsOutputBuffer.clear();
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.outputBufferLocations);
        hashMap.put(1, this.outputBufferScore);
        hashMap.put(2, this.recurrentMapsOutputBuffer);
        return hashMap;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Object[] prepareGPUInput() {
        return new Object[]{Integer.valueOf(this.inputBuffer.getId()), Integer.valueOf(this.recurrentMapsInputBufferGPU.getId())};
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Map<Integer, Object> prepareGPUOutput(FrameHolder frameHolder) {
        copyTextureToBuffer(frameHolder, this.inputBuffer);
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputLocationsBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.outputScoresBufferGPU.getId()));
        hashMap.put(2, Integer.valueOf(this.recurrentMapsOutputBufferGPU.getId()));
        return hashMap;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public void processCPUOutput() {
        ByteBuffer byteBuffer = this.recurrentMapsInputBuffer;
        this.recurrentMapsInputBuffer = this.recurrentMapsOutputBuffer;
        this.recurrentMapsOutputBuffer = byteBuffer;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public void processGPUOutput() {
        this.recurrentMapsOutputBufferGPU.copyDataTo(this.recurrentMapsInputBufferGPU);
        this.outputLocationsBufferGPU.copyDataTo(this.outputBufferLocations);
        this.outputScoresBufferGPU.copyDataTo(this.outputBufferScore);
    }

    @Override // ru.ok.face.mesh.IFaceMeshRegressor
    public List<FaceFigure> run(FrameHolder frameHolder, List<Detection> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Detection> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(run(frameHolder, it.next(), z));
        }
        return arrayList;
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        if (tFFrameType == TFFrameType.BIG) {
            return (this.useGPUPass && this.interpreterWrapper.isGPUInited()) ? 2 : 1;
        }
        return 0;
    }

    @Override // ru.ok.face.mesh.IFaceMeshRegressor
    public FaceFigure run(FrameHolder frameHolder, Detection detection, boolean z) {
        return processBaseResults(detection, runModel(frameHolder, detection, z, this.useGPUPass && this.interpreterWrapper.isGPUInited() && frameHolder.hasGPU()), false);
    }
}
