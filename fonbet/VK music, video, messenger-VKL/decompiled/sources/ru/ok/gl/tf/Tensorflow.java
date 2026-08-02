package ru.ok.gl.tf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.android.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLSurface;
import ru.ok.BitmapConsumer;
import ru.ok.TFFrameType;
import ru.ok.face.entity.CatFigure;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.face.visualization.FaceFigureVisualizer;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.factory.BodyPatternMatchingFactory;
import ru.ok.gl.tf.factory.CatMeshFactory;
import ru.ok.gl.tf.factory.FaceMeshFactory;
import ru.ok.gl.tf.factory.FaceMorphingFactory;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.gl.tf.factory.PersonSegmentationFactory;
import ru.ok.gl.tf.factory.SkySegmentationFactory;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.Consumer5;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gl.util.IoHelper;
import ru.ok.gl.util.Supplier1;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.gpu.GpuInfo;
import ru.ok.gpu.SharedEglContext;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.pattern.visualization.PatternMatchVisualizer;
import ru.ok.segmentation_full.pipeline.PipelineFull;
import ru.ok.segmentation_full.visualization.FullSegmentationResultVisualizer;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.gesture.GestureManager;
import ru.ok.tensorflow.recognition.RecognizerFrugal;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.InterpreterGPU;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Logger;
import ru.ok.tensorflow.util.async.ConditionLock;
import ru.ok.tensorflow.visualization.MultiBoxVisualizer;
import xsna.b440;
import xsna.bjn0;
import xsna.cs2;
import xsna.cxd0;
import xsna.gh1;
import xsna.hod;
import xsna.ic3;
import xsna.kv2;
import xsna.o8c0;
import xsna.u9o0;
import xsna.wd2;
import xsna.wv4;
import xsna.x9o0;
import xsna.y9o0;

/* loaded from: classes9.dex */
public final class Tensorflow implements BitmapConsumer {
    public static final int FRAME_HEIGHT = 768;
    public static final int FRAME_WIDTH = 432;
    private static final int MSG_FRAME = 0;
    private static final String TAG = "Tensorflow";
    private int TARGET_FPS_SYNC;
    private TensorflowModel[] additionalModelsRequired;
    private volatile boolean bigCropRequired;
    private volatile BodyPatternMatchingPipeline bodyBlackPatternMatchingPipeline;
    private volatile PatternMatchVisualizer bodyPatternMatchVisualizer;
    private volatile BodyPatternMatchingPipeline bodyWhitePatternMatchingPipeline;
    private volatile FrugalKeypointPipeline catDetectionPipeline;
    private volatile FaceFigureVisualizer catFigureVisualizer;
    private Runnable catFigureVisualizerCallback;
    protected SimpleGLProgram copyProgram;
    private DelegateManager delegateManager;
    private HandlerThread executor;
    private volatile FrugalKeypointPipeline faceDetectionPipeline;
    private volatile FaceFigureVisualizer faceFigureVisualizer;
    private Runnable faceFigureVisualizerCallback;
    private final TensorflowFaceLandmarksType faceLandmarksType;
    private FeatureRequirements featureRequirements;
    private final FpsMeasurer fpsMeasurer;
    protected GlThreadWithSharedContext glThread;
    protected final GpuCache gpuCache;
    private volatile RecognizerFrugal handRecognizer;
    private ExceptionHandler initErrorHandler;

    @Nullable
    private final InitializeCallback initializeCallback;
    private volatile boolean isBlackPatternMatchEnabled;
    private volatile boolean isCatEnabled;
    private volatile boolean isFace3DEnabled;
    private volatile boolean isMorphingEnabled;
    private volatile boolean isPersonSegmEnabled;
    private volatile boolean isReleased;
    private volatile boolean isSkySegmEnabled;
    private volatile boolean isWhitePatternMatchEnabled;
    private volatile HandRecognitionFactory.RecognitionMode mode;
    private Supplier1<ModelDataProvider, TensorflowModel> modelSupplier;
    private volatile int numFacesRequired;
    private volatile boolean onlyGestureinFrugal;
    private volatile PipelineFull personSegmentation;
    private volatile PipelineFull personSegmentationSmall;
    private volatile boolean prepared;
    private volatile boolean requiredSetup;
    private ExceptionHandler runtimeErrorHandler;
    private final TensorflowSegmentationType segmentationType;
    private volatile FullSegmentationResultVisualizer segmentationVisualizer;
    private Runnable segmentationVisualizerCallback;
    protected volatile SharedEglContext sharedEglContext;
    private volatile PipelineFull skySegmentation;
    private volatile boolean smallCropRequired;
    private final Handler tensorflowDispatcher;
    private final float textSizeDp;
    private final int threadCount;
    private boolean useGPUPass;
    private final boolean useGpu;
    private volatile MultiBoxVisualizer visualizer;
    private Runnable visualizerCallback;
    private final Logger logger = new Logger() { // from class: ru.ok.gl.tf.Tensorflow.1
    };
    private final CopyOnWriteArraySet<Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap>> recognitionConsumers = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Consumer<List<FaceFigure>>> fullFacesConsumers = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Consumer<List<CatFigure>>> fullCatsConsumers = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Consumer<List<PatternMatch>>> bodyPatternMatchConsumers = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Consumer<Bitmap>> fullSegConsumers = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Consumer<FaceMorphingFigure>> morphConsumers = new CopyOnWriteArraySet<>();
    private final ConditionLock isRecognitionOngoning = new ConditionLock(false);
    private final ConditionLock isMustSyncPartOngoing = new ConditionLock(false);
    private final AtomicBoolean isDrawingEnabled = new AtomicBoolean(true);
    private final int TARGET_FPS_UNSYNC = 33;
    private final int MAX_SIZE_OF_CACHE_FILES = 5242880;
    private int targetFps = 33;
    private final boolean useCommonGLHandler = true;
    private CountDownLatch initializationCountDownLatch = new CountDownLatch(1);
    private volatile boolean isFrugal = true;
    private volatile boolean smallPersonSegmEnabled = false;
    private volatile boolean solvePnpAnglesEnabled = false;
    private volatile Size frameSize = new Size(0, 0);
    private Size preparedPipelinesSetFrameSize = new Size(0, 0);
    private Size handRecognitionSetFrameSize = new Size(0, 0);
    private Size originalFrameSize = new Size(0, 0);
    private volatile Map<TensorflowModel, FaceMorphingPipeline> morphingPipelines = new HashMap();
    private Bitmap segmentationResult = null;
    private volatile List<FaceFigure> faceDetectionResults = new ArrayList();
    private volatile List<FaceFigure> catDetectionResults = new ArrayList();
    private volatile List<PatternMatch> bodyPatternMatchResults = new ArrayList();
    private volatile List<FaceMorphingFigure> faceMorphings = new ArrayList();
    protected EGLSurface eglSurface = null;
    protected Map<TFFrameType, FrameBuffer> copyFrames = new HashMap();
    protected boolean gpuInitedStarted = false;
    private final AtomicBoolean releaseAfterProcess = new AtomicBoolean(false);
    private final String morphingKey = "test_morphing";

    /* renamed from: ru.ok.gl.tf.Tensorflow$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$tensorflow$entity$Gesture;

        static {
            int[] iArr = new int[Gesture.values().length];
            $SwitchMap$ru$ok$tensorflow$entity$Gesture = iArr;
            try {
                iArr[Gesture.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.VICTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.PALM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.KHABIB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.THUMB_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.THUMB_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.THUMB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.POINTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.FIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.ONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.ROCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.CROSS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.HOMMIE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.HEART_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.HEART_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$Gesture[Gesture.NOT_HAND.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static class FeatureRequirements {
        public static final FeatureRequirements ALL = new FeatureRequirements(true, true, false, true, true, true, true, true, null);
        public static final FeatureRequirements CAMERA_CLIPS = new FeatureRequirements(true, true, false, true, false, false, false, false, null);
        public static final FeatureRequirements CAMERA_CLIPS_ANON = new FeatureRequirements(false, true, false, false, false, false, false, false, null);
        public static final FeatureRequirements CAMERA_EFFECT = new FeatureRequirements(true, false, false, false, false, false, false, false, null);
        private TensorflowModel[] additionalModels;
        private final boolean isCatDetectionRequired;
        private final boolean isFaceDetectionRequired;
        private final boolean isHandRecognizerRequired;
        private final boolean isMorphingRequired;
        private final boolean isPatterMatchDetectionRequired;
        private final boolean isPersonSegmentationRequired;
        private final boolean isSkySegmentationRequired;
        private final boolean isSmallPersonSegmentationRequired;

        public FeatureRequirements(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, TensorflowModel[] tensorflowModelArr) {
            this.isHandRecognizerRequired = z;
            this.isPersonSegmentationRequired = z2;
            this.isSkySegmentationRequired = z3;
            this.isFaceDetectionRequired = z4;
            this.isCatDetectionRequired = z5;
            this.isMorphingRequired = z6;
            this.isPatterMatchDetectionRequired = z7;
            this.isSmallPersonSegmentationRequired = z8;
            this.additionalModels = tensorflowModelArr;
        }

        public FeatureRequirements getWithCatDetectionRequired(boolean z) {
            return this.isCatDetectionRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, this.isSkySegmentationRequired, this.isFaceDetectionRequired, z, this.isMorphingRequired, this.isPatterMatchDetectionRequired, this.isSmallPersonSegmentationRequired, this.additionalModels) : this;
        }

        public FeatureRequirements getWithFaceDetectionRequired(boolean z) {
            return this.isFaceDetectionRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, this.isSkySegmentationRequired, z, this.isCatDetectionRequired, this.isMorphingRequired, this.isPatterMatchDetectionRequired, this.isSmallPersonSegmentationRequired, this.additionalModels) : this;
        }

        public FeatureRequirements getWithMorphingRequired(boolean z, TensorflowModel[] tensorflowModelArr) {
            return (this.isMorphingRequired == z && Arrays.equals(this.additionalModels, tensorflowModelArr)) ? this : new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, this.isSkySegmentationRequired, this.isFaceDetectionRequired, this.isCatDetectionRequired, z, this.isPatterMatchDetectionRequired, this.isSmallPersonSegmentationRequired, tensorflowModelArr);
        }

        public FeatureRequirements getWithPatterMatchDetectionRequired(boolean z) {
            return this.isPatterMatchDetectionRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, this.isSkySegmentationRequired, this.isFaceDetectionRequired, this.isCatDetectionRequired, this.isMorphingRequired, z, this.isSmallPersonSegmentationRequired, this.additionalModels) : this;
        }

        public FeatureRequirements getWithPersonSegmentationRequired(boolean z) {
            return this.isPersonSegmentationRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, z, this.isSkySegmentationRequired, this.isFaceDetectionRequired, this.isCatDetectionRequired, this.isMorphingRequired, this.isPatterMatchDetectionRequired, this.isSmallPersonSegmentationRequired, this.additionalModels) : this;
        }

        public FeatureRequirements getWithSkyPersonSegmentationRequired(boolean z) {
            return this.isSkySegmentationRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, z, this.isFaceDetectionRequired, this.isCatDetectionRequired, this.isMorphingRequired, this.isPatterMatchDetectionRequired, this.isSmallPersonSegmentationRequired, this.additionalModels) : this;
        }

        public FeatureRequirements getWithSmallPersonSegmentationRequired(boolean z) {
            return this.isSmallPersonSegmentationRequired != z ? new FeatureRequirements(this.isHandRecognizerRequired, this.isPersonSegmentationRequired, this.isSkySegmentationRequired, this.isFaceDetectionRequired, this.isCatDetectionRequired, this.isMorphingRequired, this.isPatterMatchDetectionRequired, z, this.additionalModels) : this;
        }

        public boolean hasCatDetectionRequired() {
            return this.isCatDetectionRequired;
        }

        public boolean hasPersonSegmentationRequired() {
            return this.isPersonSegmentationRequired;
        }
    }

    public interface InitializeCallback {
        void onInitialized();
    }

    public Tensorflow(@NonNull final Context context, @NonNull final Supplier1<ModelDataProvider, TensorflowModel> supplier1, final OverlayView overlayView, boolean z, boolean z2, File file, final ExceptionHandler exceptionHandler, ExceptionHandler exceptionHandler2, int i, @Nullable FpsMeasurer fpsMeasurer, @NonNull FeatureRequirements featureRequirements, TensorflowSegmentationType tensorflowSegmentationType, TensorflowFaceLandmarksType tensorflowFaceLandmarksType, @Nullable InitializeCallback initializeCallback) {
        boolean z3 = false;
        this.TARGET_FPS_SYNC = 33;
        this.useGPUPass = true;
        this.useGpu = z;
        if (i > 0) {
            this.TARGET_FPS_SYNC = i;
        }
        this.useGPUPass = z2;
        if (z2 && z) {
            z3 = true;
        }
        this.useGPUPass = z3;
        if (file != null) {
            GpuCache gpuCache = new GpuCache();
            this.gpuCache = gpuCache;
            gpuCache.cacheDir = file;
            gpuCache.usedFiles = new HashSet<>();
        } else {
            this.gpuCache = null;
        }
        this.threadCount = 4;
        this.textSizeDp = 10.0f;
        this.fpsMeasurer = fpsMeasurer;
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.executor = handlerThread;
        handlerThread.start();
        this.initializeCallback = initializeCallback;
        this.featureRequirements = featureRequirements;
        this.segmentationType = tensorflowSegmentationType;
        this.faceLandmarksType = tensorflowFaceLandmarksType;
        this.modelSupplier = supplier1;
        this.initErrorHandler = exceptionHandler;
        this.runtimeErrorHandler = exceptionHandler2;
        Handler handler = new Handler(this.executor.getLooper(), new b440(this, 1));
        this.tensorflowDispatcher = handler;
        handler.post(new Runnable() { // from class: xsna.v9o0
            @Override // java.lang.Runnable
            public final void run() {
                Tensorflow.this.lambda$new$0(context, overlayView, supplier1, exceptionHandler);
            }
        });
    }

    private void cleanUpUnusedGpuCache() {
        GpuCache gpuCache = this.gpuCache;
        if (gpuCache != null) {
            String[] files = IoHelper.getFiles(gpuCache.cacheDir, "*");
            long j = 0;
            for (String str : files) {
                j += new File(this.gpuCache.cacheDir, str).length();
            }
            if (j > 5242880) {
                for (String str2 : files) {
                    if (!this.gpuCache.usedFiles.contains(str2)) {
                        IoHelper.deleteRecursively(new File(this.gpuCache.cacheDir, str2));
                    }
                }
            }
        }
    }

    private void copyGPU(FrameHolder frameHolder, FrameBuffer frameBuffer) {
        this.copyProgram.setTextureId(frameHolder.getGPUFrame());
        this.copyProgram.setMVPMat(GlUtil.getOpenGLMatrix(new Matrix()));
        frameBuffer.render(this.copyProgram, new u9o0());
    }

    private void duplicateGPUBuffers(Map<TFFrameType, FrameHolder> map) {
        for (Map.Entry<TFFrameType, FrameHolder> entry : map.entrySet()) {
            TFFrameType key = entry.getKey();
            FrameHolder value = entry.getValue();
            FrameBuffer frameBuffer = this.copyFrames.get(key);
            if (value != null && value.hasGPU()) {
                if (this.copyProgram == null) {
                    this.copyProgram = new SimpleGLProgram();
                }
                if (frameBuffer == null) {
                    frameBuffer = new FrameBuffer(value.getWidth(), value.getHeight());
                    this.copyFrames.put(key, frameBuffer);
                    frameBuffer.detachTexture();
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, frameBuffer.getTextureId());
                    GLES20.glTexParameterf(3553, 10241, 9728.0f);
                    GLES20.glTexParameterf(3553, 10240, 9728.0f);
                }
                frameBuffer.attachTexture();
                copyGPU(value, frameBuffer);
                frameBuffer.detachTexture();
                value.replaceGPUFrame(frameBuffer.getTextureId());
            }
        }
    }

    public static int getColor(CompositeGesture compositeGesture) {
        return -256;
    }

    private GpuInfo getGpuInfo() {
        SharedEglContext sharedEglContext = new SharedEglContext(EGL14.eglGetCurrentContext());
        EGLSurface createOffscreenSurface = sharedEglContext.createOffscreenSurface(1, 1);
        if (createOffscreenSurface == null) {
            return null;
        }
        sharedEglContext.makeCurrent(createOffscreenSurface, createOffscreenSurface);
        String glGetString = GLES20.glGetString(7937);
        sharedEglContext.makeNothingCurrent();
        sharedEglContext.releaseSurface(createOffscreenSurface);
        sharedEglContext.release();
        return InterpreterGPU.getGpuType(glGetString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ac A[Catch: Exception -> 0x0275, TryCatch #6 {Exception -> 0x0275, blocks: (B:140:0x026c, B:141:0x0280, B:144:0x028a, B:147:0x0290, B:148:0x029f, B:150:0x02ac, B:152:0x02b0, B:155:0x02b8, B:157:0x02bc, B:185:0x02c8, B:187:0x02ce, B:188:0x02d8, B:190:0x02dc, B:191:0x02e6, B:193:0x02ee, B:195:0x02f2, B:198:0x02f8), top: B:139:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036f A[LOOP:0: B:179:0x0369->B:181:0x036f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ee A[Catch: Exception -> 0x0275, TryCatch #6 {Exception -> 0x0275, blocks: (B:140:0x026c, B:141:0x0280, B:144:0x028a, B:147:0x0290, B:148:0x029f, B:150:0x02ac, B:152:0x02b0, B:155:0x02b8, B:157:0x02bc, B:185:0x02c8, B:187:0x02ce, B:188:0x02d8, B:190:0x02dc, B:191:0x02e6, B:193:0x02ee, B:195:0x02f2, B:198:0x02f8), top: B:139:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleFrames(Map<TFFrameType, FrameHolder> map) {
        List<Recognition> list;
        List list2;
        List list3;
        List list4;
        List list5;
        Iterator<Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap>> it;
        List list6;
        ExceptionHandler exceptionHandler;
        List list7;
        List list8;
        List list9;
        List list10;
        long currentTimeMillis;
        if (map.isEmpty()) {
            this.isMustSyncPartOngoing.set(false);
            return;
        }
        long j = 1000 / this.targetFps;
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            try {
                duplicateGPUBuffers(map);
                this.isMustSyncPartOngoing.set(false);
                FrameHolder frameHolder = map.get(TFFrameType.BIG);
                FrameHolder frameHolder2 = map.get(TFFrameType.NORMAL);
                final FrameHolder frameHolder3 = map.get(TFFrameType.SMALL);
                FrameHolder frameHolder4 = map.get(TFFrameType.SKY);
                final FrameHolder frameHolder5 = map.get(TFFrameType.ORIGINAL);
                if (frameHolder != null) {
                    this.frameSize = new Size(frameHolder.getWidth(), frameHolder.getHeight());
                }
                if (frameHolder5 != null) {
                    this.originalFrameSize = new Size(frameHolder5.getWidth(), frameHolder5.getHeight());
                }
                if (this.prepared && this.frameSize != this.preparedPipelinesSetFrameSize) {
                    this.preparedPipelinesSetFrameSize = this.frameSize;
                    int width = this.frameSize.getWidth();
                    int height = this.frameSize.getHeight();
                    if (this.featureRequirements.isFaceDetectionRequired && this.faceDetectionPipeline != null) {
                        this.faceDetectionPipeline.setInputSize(width, height);
                    }
                    if (this.featureRequirements.isMorphingRequired && !this.morphingPipelines.isEmpty()) {
                        processAdditinalModels(new cxd0(this, 8));
                    }
                    if (this.featureRequirements.isCatDetectionRequired && this.catDetectionPipeline != null) {
                        this.catDetectionPipeline.setInputSize(width, height);
                    }
                    if (this.featureRequirements.isPersonSegmentationRequired && this.personSegmentation != null) {
                        this.personSegmentation.setInputSize(width, height);
                        if (needPersonSegmentationSmall()) {
                            this.personSegmentationSmall.setInputSize(width, height);
                        }
                    }
                    if (this.featureRequirements.isSkySegmentationRequired && this.skySegmentation != null) {
                        this.skySegmentation.setInputSize(width, height);
                    }
                    if (this.featureRequirements.isPatterMatchDetectionRequired) {
                        if (this.bodyWhitePatternMatchingPipeline != null) {
                            this.bodyWhitePatternMatchingPipeline.setInputSize(width, height);
                        }
                        if (this.bodyBlackPatternMatchingPipeline != null) {
                            this.bodyBlackPatternMatchingPipeline.setInputSize(width, height);
                        }
                    }
                    if (this.faceFigureVisualizer != null) {
                        this.faceFigureVisualizer.setFrameSize(width, height);
                    }
                    if (this.catFigureVisualizer != null) {
                        this.catFigureVisualizer.setFrameSize(width, height);
                    }
                    if (this.bodyPatternMatchVisualizer != null) {
                        this.bodyPatternMatchVisualizer.setFrameSize(width, height);
                    }
                    if (this.segmentationVisualizer != null) {
                        if (needPersonSegmentationSmall()) {
                            this.segmentationVisualizer.setFrameSize(this.personSegmentationSmall.getInputWidth(), this.personSegmentationSmall.getInputHeight());
                        } else if (this.personSegmentation != null) {
                            this.segmentationVisualizer.setFrameSize(this.personSegmentation.getInputWidth(), this.personSegmentation.getInputHeight());
                        }
                    }
                }
                if (this.featureRequirements.isHandRecognizerRequired && this.handRecognizer != null && this.handRecognitionSetFrameSize != this.frameSize) {
                    this.handRecognitionSetFrameSize = this.frameSize;
                    this.handRecognizer.setInputSize(this.frameSize.getWidth(), this.frameSize.getHeight());
                    if (this.visualizer != null) {
                        this.visualizer.setFrameSize(this.frameSize.getWidth(), this.frameSize.getHeight());
                    }
                }
                List<Recognition> list11 = Collections.EMPTY_LIST;
                if (frameHolder != null && frameHolder3 != null && this.featureRequirements.isHandRecognizerRequired && this.handRecognizer != null) {
                    try {
                        list = this.handRecognizer.process(frameHolder, frameHolder3);
                    } catch (Exception unused) {
                        Log.e(TAG, "Failed to process recognitions");
                    }
                    boolean z = !isFaceEnabled() || this.isFace3DEnabled;
                    boolean z2 = this.isCatEnabled;
                    boolean z3 = this.isMorphingEnabled;
                    boolean z4 = this.isWhitePatternMatchEnabled;
                    boolean z5 = this.isBlackPatternMatchEnabled;
                    if (this.prepared) {
                        list2 = list11;
                        list3 = list2;
                        list4 = list3;
                        list5 = list11;
                    } else {
                        boolean z6 = (frameHolder == null || frameHolder3 == null) ? false : true;
                        boolean z7 = (frameHolder5 == null || frameHolder3 == null) ? false : true;
                        boolean z8 = z6;
                        try {
                            list2 = (this.featureRequirements.isCatDetectionRequired && z2 && this.catDetectionPipeline != null && z8) ? this.catDetectionPipeline.process(frameHolder, frameHolder3, false) : list11;
                            try {
                                try {
                                    try {
                                        if (this.featureRequirements.isFaceDetectionRequired && z) {
                                            try {
                                                if (this.faceDetectionPipeline != null && z8) {
                                                    this.faceDetectionPipeline.setMaxDetections(this.numFacesRequired);
                                                    list7 = this.faceDetectionPipeline.process(frameHolder, frameHolder3, this.isFace3DEnabled);
                                                    if (this.featureRequirements.isMorphingRequired && z3) {
                                                        try {
                                                            if (!this.morphingPipelines.isEmpty() && z7) {
                                                                list4 = (List) processAdditinalModels(new Function() { // from class: xsna.w9o0
                                                                    @Override // ru.ok.tensorflow.util.Function
                                                                    public final Object apply(Object obj) {
                                                                        List lambda$handleFrames$4;
                                                                        lambda$handleFrames$4 = Tensorflow.this.lambda$handleFrames$4(frameHolder5, frameHolder3, (FaceMorphingPipeline) obj);
                                                                        return lambda$handleFrames$4;
                                                                    }
                                                                }, new ArrayList());
                                                                if (this.featureRequirements.isPatterMatchDetectionRequired || !z4 || this.bodyWhitePatternMatchingPipeline == null || !z8) {
                                                                    list8 = list2;
                                                                    list9 = list11;
                                                                } else {
                                                                    list8 = list2;
                                                                    try {
                                                                        list9 = this.bodyWhitePatternMatchingPipeline.process(frameHolder.getCPUFrame(), frameHolder3.getCPUFrame());
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        list2 = list8;
                                                                        list3 = list11;
                                                                        list6 = list7;
                                                                        exceptionHandler = this.initErrorHandler;
                                                                        list5 = list6;
                                                                        if (exceptionHandler != null) {
                                                                        }
                                                                        if (this.isDrawingEnabled.get()) {
                                                                        }
                                                                        this.faceDetectionResults = list5;
                                                                        this.catDetectionResults = list2;
                                                                        this.bodyPatternMatchResults = new ArrayList(list3);
                                                                        this.faceMorphings = list4;
                                                                        it = this.recognitionConsumers.iterator();
                                                                        while (it.hasNext()) {
                                                                        }
                                                                    }
                                                                }
                                                                list10 = list9;
                                                                list10 = list9;
                                                                if (this.featureRequirements.isPatterMatchDetectionRequired && z5) {
                                                                    list10 = list9;
                                                                    list10 = list9;
                                                                    if (this.bodyBlackPatternMatchingPipeline != null && z8) {
                                                                        list10 = this.bodyBlackPatternMatchingPipeline.process(frameHolder.getCPUFrame(), frameHolder3.getCPUFrame());
                                                                    }
                                                                }
                                                                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                                                                if (this.featureRequirements.isPersonSegmentationRequired || !this.isPersonSegmEnabled) {
                                                                    if (this.featureRequirements.isSkySegmentationRequired && this.isSkySegmEnabled && this.skySegmentation != null && frameHolder4 != null) {
                                                                        this.segmentationResult = this.skySegmentation.process(frameHolder4, j - currentTimeMillis);
                                                                    }
                                                                } else if (this.segmentationType == TensorflowSegmentationType.NEW_SEGMENTATION_BIG && frameHolder2 != null && this.personSegmentation != null) {
                                                                    this.segmentationResult = this.personSegmentation.process(frameHolder2, j - currentTimeMillis);
                                                                } else if (frameHolder3 != null) {
                                                                    if (needPersonSegmentationSmall()) {
                                                                        this.segmentationResult = this.personSegmentationSmall.process(frameHolder3, j - currentTimeMillis);
                                                                    } else if (this.personSegmentation != null) {
                                                                        this.segmentationResult = this.personSegmentation.process(frameHolder3, j - currentTimeMillis);
                                                                    }
                                                                }
                                                                list2 = list8;
                                                                list3 = list10;
                                                                list5 = list7;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            list3 = list11;
                                                            list4 = list3;
                                                            list6 = list7;
                                                            exceptionHandler = this.initErrorHandler;
                                                            list5 = list6;
                                                            if (exceptionHandler != null) {
                                                                exceptionHandler.accept(e);
                                                                list5 = list6;
                                                            }
                                                            if (this.isDrawingEnabled.get()) {
                                                            }
                                                            this.faceDetectionResults = list5;
                                                            this.catDetectionResults = list2;
                                                            this.bodyPatternMatchResults = new ArrayList(list3);
                                                            this.faceMorphings = list4;
                                                            it = this.recognitionConsumers.iterator();
                                                            while (it.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                    list4 = list11;
                                                    if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                                    }
                                                    list8 = list2;
                                                    list9 = list11;
                                                    list10 = list9;
                                                    list10 = list9;
                                                    if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                                        list10 = list9;
                                                        list10 = list9;
                                                        if (this.bodyBlackPatternMatchingPipeline != null) {
                                                            list10 = this.bodyBlackPatternMatchingPipeline.process(frameHolder.getCPUFrame(), frameHolder3.getCPUFrame());
                                                        }
                                                    }
                                                    currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                                                    if (this.featureRequirements.isPersonSegmentationRequired) {
                                                    }
                                                    if (this.featureRequirements.isSkySegmentationRequired) {
                                                        this.segmentationResult = this.skySegmentation.process(frameHolder4, j - currentTimeMillis);
                                                    }
                                                    list2 = list8;
                                                    list3 = list10;
                                                    list5 = list7;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                list3 = list11;
                                                list4 = list3;
                                                list6 = list11;
                                                exceptionHandler = this.initErrorHandler;
                                                list5 = list6;
                                                if (exceptionHandler != null) {
                                                }
                                                if (this.isDrawingEnabled.get()) {
                                                }
                                                this.faceDetectionResults = list5;
                                                this.catDetectionResults = list2;
                                                this.bodyPatternMatchResults = new ArrayList(list3);
                                                this.faceMorphings = list4;
                                                it = this.recognitionConsumers.iterator();
                                                while (it.hasNext()) {
                                                }
                                            }
                                        }
                                        if (this.featureRequirements.isMorphingRequired) {
                                            if (!this.morphingPipelines.isEmpty()) {
                                                list4 = (List) processAdditinalModels(new Function() { // from class: xsna.w9o0
                                                    @Override // ru.ok.tensorflow.util.Function
                                                    public final Object apply(Object obj) {
                                                        List lambda$handleFrames$4;
                                                        lambda$handleFrames$4 = Tensorflow.this.lambda$handleFrames$4(frameHolder5, frameHolder3, (FaceMorphingPipeline) obj);
                                                        return lambda$handleFrames$4;
                                                    }
                                                }, new ArrayList());
                                                if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                                }
                                                list8 = list2;
                                                list9 = list11;
                                                list10 = list9;
                                                list10 = list9;
                                                if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                                }
                                                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                                                if (this.featureRequirements.isPersonSegmentationRequired) {
                                                }
                                                if (this.featureRequirements.isSkySegmentationRequired) {
                                                }
                                                list2 = list8;
                                                list3 = list10;
                                                list5 = list7;
                                            }
                                        }
                                        if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                        }
                                        list8 = list2;
                                        list9 = list11;
                                        list10 = list9;
                                        list10 = list9;
                                        if (this.featureRequirements.isPatterMatchDetectionRequired) {
                                        }
                                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                                        if (this.featureRequirements.isPersonSegmentationRequired) {
                                        }
                                        if (this.featureRequirements.isSkySegmentationRequired) {
                                        }
                                        list2 = list8;
                                        list3 = list10;
                                        list5 = list7;
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                    list4 = list11;
                                } catch (Exception e5) {
                                    e = e5;
                                }
                                list7 = list11;
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            list2 = list11;
                            list3 = list2;
                        }
                    }
                    if (this.isDrawingEnabled.get()) {
                        if (this.visualizer != null) {
                            this.visualizer.setRecognitions(list);
                        }
                        if (this.faceFigureVisualizer != null) {
                            this.faceFigureVisualizer.setResults(list5);
                        }
                        if (this.catFigureVisualizer != null) {
                            this.catFigureVisualizer.setResults(list2);
                        }
                        if (this.bodyPatternMatchVisualizer != null) {
                            this.bodyPatternMatchVisualizer.setResults(list3);
                        }
                        if (this.segmentationVisualizer != null && this.segmentationResult != null) {
                            this.segmentationVisualizer.setResults(this.segmentationResult);
                        }
                    }
                    this.faceDetectionResults = list5;
                    this.catDetectionResults = list2;
                    this.bodyPatternMatchResults = new ArrayList(list3);
                    this.faceMorphings = list4;
                    it = this.recognitionConsumers.iterator();
                    while (it.hasNext()) {
                        it.next().accept(this, list, null, null, null);
                    }
                }
                list = list11;
                if (isFaceEnabled()) {
                }
                boolean z22 = this.isCatEnabled;
                boolean z32 = this.isMorphingEnabled;
                boolean z42 = this.isWhitePatternMatchEnabled;
                boolean z52 = this.isBlackPatternMatchEnabled;
                if (this.prepared) {
                }
                if (this.isDrawingEnabled.get()) {
                }
                this.faceDetectionResults = list5;
                this.catDetectionResults = list2;
                this.bodyPatternMatchResults = new ArrayList(list3);
                this.faceMorphings = list4;
                it = this.recognitionConsumers.iterator();
                while (it.hasNext()) {
                }
            } catch (Exception e8) {
                ExceptionHandler exceptionHandler2 = this.initErrorHandler;
                if (exceptionHandler2 != null) {
                    exceptionHandler2.accept(e8);
                }
                this.releaseAfterProcess.set(true);
                this.isMustSyncPartOngoing.set(false);
            }
        } catch (Throwable th) {
            this.isMustSyncPartOngoing.set(false);
            throw th;
        }
    }

    private void handlePrepare(Context context, OverlayView overlayView, Supplier1<ModelDataProvider, TensorflowModel> supplier1, WeakReference<ExceptionHandler> weakReference) {
        if (overlayView != null) {
            this.visualizer = new MultiBoxVisualizer.Builder(context).setGestureColorer(new bjn0(2)).setTextSizeDp(this.textSizeDp).setOverlayView(overlayView).build();
            this.visualizer.setDrawEnabled(this.isDrawingEnabled.get());
            this.visualizerCallback = new hod(this, 17);
            this.faceFigureVisualizer = new FaceFigureVisualizer.Builder(context, this.logger).setTextSizeDp(this.textSizeDp).setOverlayView(overlayView).build();
            this.faceFigureVisualizer.setDrawEnabled(this.isDrawingEnabled.get());
            this.faceFigureVisualizerCallback = new ic3(this, 10);
            this.catFigureVisualizer = new FaceFigureVisualizer.Builder(context, this.logger).setTextSizeDp(this.textSizeDp).setOverlayView(overlayView).build();
            this.catFigureVisualizer.setDrawEnabled(this.isDrawingEnabled.get());
            this.catFigureVisualizerCallback = new wd2(this, 10);
            this.bodyPatternMatchVisualizer = new PatternMatchVisualizer.Builder(context, this.logger).setTextSizeDp(this.textSizeDp).setOverlayView(overlayView).build();
            this.bodyPatternMatchVisualizer.setDrawEnabled(this.isDrawingEnabled.get());
            this.segmentationVisualizer = new FullSegmentationResultVisualizer.Builder(context, this.logger).setTextSizeDp(this.textSizeDp).setOverlayView(overlayView).build();
            this.segmentationVisualizer.setDrawEnabled(this.isDrawingEnabled.get());
            this.segmentationVisualizerCallback = new gh1(this, 8);
        } else {
            this.segmentationVisualizerCallback = null;
            this.catFigureVisualizerCallback = null;
            this.faceFigureVisualizerCallback = null;
            this.visualizerCallback = null;
        }
        this.delegateManager = new DelegateManager(context);
        runPreparePipelines(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRelease() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        try {
            this.initializationCountDownLatch.await();
        } catch (InterruptedException unused) {
        }
        DelegateManager delegateManager = this.delegateManager;
        if (delegateManager != null) {
            delegateManager.release();
            this.delegateManager = null;
        }
        releasePipelines();
        releaseVisualizers();
        HandlerThread handlerThread = this.executor;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.executor = null;
        }
        GlThreadWithSharedContext glThreadWithSharedContext = this.glThread;
        if (glThreadWithSharedContext != null) {
            glThreadWithSharedContext.quitSafely();
            this.glThread = null;
        }
        if (this.sharedEglContext != null) {
            this.sharedEglContext.makeNothingCurrent();
            if (this.eglSurface != null) {
                this.sharedEglContext.releaseSurface(this.eglSurface);
            }
            this.sharedEglContext.release();
            this.sharedEglContext = null;
            this.eglSurface = null;
        }
        Iterator<FrameBuffer> it = this.copyFrames.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        SimpleGLProgram simpleGLProgram = this.copyProgram;
        if (simpleGLProgram != null) {
            simpleGLProgram.release();
        }
        cleanUpUnusedGpuCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleTensorflow(Message message) {
        if (this.eglSurface == null && this.sharedEglContext != null) {
            this.eglSurface = this.sharedEglContext.createOffscreenSurface(1, 1);
            SharedEglContext sharedEglContext = this.sharedEglContext;
            EGLSurface eGLSurface = this.eglSurface;
            sharedEglContext.makeCurrent(eGLSurface, eGLSurface);
        }
        if (message.what == 0) {
            Map<TFFrameType, FrameHolder> map = (Map) message.obj;
            if (!this.isReleased) {
                FpsMeasurer fpsMeasurer = this.fpsMeasurer;
                if (fpsMeasurer != null) {
                    fpsMeasurer.beginMeasure();
                }
                handleFrames(map);
                FpsMeasurer fpsMeasurer2 = this.fpsMeasurer;
                if (fpsMeasurer2 != null) {
                    fpsMeasurer2.endMeasure();
                }
            }
            this.isRecognitionOngoning.set(false);
        }
        return true;
    }

    private void initIfNeeded() {
        boolean z;
        boolean z2;
        if ((isFaceEnabled() || this.isFace3DEnabled) && !this.featureRequirements.isFaceDetectionRequired) {
            this.featureRequirements = this.featureRequirements.getWithFaceDetectionRequired(true);
            z = true;
        } else {
            z = false;
        }
        if (this.isCatEnabled && !this.featureRequirements.isCatDetectionRequired) {
            this.featureRequirements = this.featureRequirements.getWithCatDetectionRequired(true);
            z = true;
        }
        if (this.isPersonSegmEnabled && !this.featureRequirements.isPersonSegmentationRequired) {
            this.featureRequirements = this.featureRequirements.getWithPersonSegmentationRequired(true);
            z = true;
        }
        if (this.smallPersonSegmEnabled && !this.featureRequirements.isSmallPersonSegmentationRequired) {
            this.featureRequirements = this.featureRequirements.getWithSmallPersonSegmentationRequired(true);
            z = true;
        }
        if ((this.isWhitePatternMatchEnabled || this.isBlackPatternMatchEnabled) && !this.featureRequirements.isPatterMatchDetectionRequired) {
            this.featureRequirements = this.featureRequirements.getWithPatterMatchDetectionRequired(true);
            z = true;
        }
        if (this.isSkySegmEnabled && !this.featureRequirements.isSkySegmentationRequired) {
            this.featureRequirements = this.featureRequirements.getWithSkyPersonSegmentationRequired(true);
            z = true;
        }
        TensorflowModel[] tensorflowModelArr = this.additionalModelsRequired;
        if (tensorflowModelArr != null) {
            z2 = true;
            for (TensorflowModel tensorflowModel : tensorflowModelArr) {
                if (this.morphingPipelines.get(tensorflowModel) == null) {
                    z2 = false;
                }
            }
        } else {
            z2 = true;
        }
        if ((this.isMorphingEnabled && !this.featureRequirements.isMorphingRequired) || (this.isMorphingEnabled && !z2)) {
            this.featureRequirements = this.featureRequirements.getWithMorphingRequired(true, this.additionalModelsRequired);
            z = true;
        } else if (this.isMorphingEnabled) {
            this.featureRequirements = this.featureRequirements.getWithMorphingRequired(true, this.additionalModelsRequired);
        }
        if (z) {
            this.initializationCountDownLatch = new CountDownLatch(1);
            runPreparePipelines(new kv2(this, 12));
        }
    }

    private boolean isFaceEnabled() {
        return this.numFacesRequired > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$handleFrames$3(FaceMorphingPipeline faceMorphingPipeline) {
        faceMorphingPipeline.setInputSize(this.originalFrameSize.getWidth(), this.originalFrameSize.getHeight());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$handleFrames$4(FrameHolder frameHolder, FrameHolder frameHolder2, FaceMorphingPipeline faceMorphingPipeline) {
        return faceMorphingPipeline.process(frameHolder, frameHolder2, this.isFace3DEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handlePrepare$5() {
        this.visualizer.setInitialized(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handlePrepare$6() {
        this.faceFigureVisualizer.setInitialized(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handlePrepare$7() {
        this.catFigureVisualizer.setInitialized(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handlePrepare$8() {
        this.segmentationVisualizer.setInitialized(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initIfNeeded$1() {
        this.gpuInitedStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Context context, OverlayView overlayView, Supplier1 supplier1, ExceptionHandler exceptionHandler) {
        handlePrepare(context.getApplicationContext(), overlayView, supplier1, new WeakReference<>(exceptionHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runPreparePipelines$9(Runnable runnable) {
        Tensorflow tensorflow;
        try {
            try {
                tensorflow = this;
                try {
                    tensorflow.preparePipelines(this.modelSupplier, new WeakReference<>(this.initErrorHandler), new WeakReference<>(this.runtimeErrorHandler), this.visualizerCallback, this.faceFigureVisualizerCallback, this.catFigureVisualizerCallback, this.segmentationVisualizerCallback);
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    ExceptionHandler exceptionHandler = tensorflow.initErrorHandler;
                    if (exceptionHandler != null) {
                        exceptionHandler.accept(exc);
                    }
                    tensorflow.initializationCountDownLatch.countDown();
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                tensorflow.initializationCountDownLatch.countDown();
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
            tensorflow = this;
        } catch (Throwable th3) {
            th = th3;
            tensorflow = this;
            Throwable th22 = th;
            tensorflow.initializationCountDownLatch.countDown();
            throw th22;
        }
        tensorflow.initializationCountDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$useFrame$2(TFFrameType tFFrameType, FaceMorphingPipeline faceMorphingPipeline) {
        return Integer.valueOf(faceMorphingPipeline.useFrame(tFFrameType));
    }

    private boolean needPersonSegmentationSmall() {
        return this.personSegmentationSmall != null && this.smallPersonSegmEnabled;
    }

    private void preparePipelines(Supplier1<ModelDataProvider, TensorflowModel> supplier1, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isHandRecognizerRequired && this.handRecognizer == null) {
            this.handRecognizer = new HandRecognitionFactory(this.threadCount, false, this.useGPUPass, this.gpuCache, this.logger).create(this.delegateManager, supplier1, runnable, weakReference, weakReference2);
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isPersonSegmentationRequired && (this.personSegmentation == null || this.personSegmentationSmall == null)) {
            PersonSegmentationFactory personSegmentationFactory = new PersonSegmentationFactory(this.threadCount, this.useGpu, this.useGPUPass, this.gpuCache, this.logger);
            if (this.personSegmentation == null) {
                this.personSegmentation = personSegmentationFactory.create(this.segmentationType, this.delegateManager, supplier1, runnable4, weakReference, weakReference2);
            }
            if (this.featureRequirements.isSmallPersonSegmentationRequired && this.segmentationType == TensorflowSegmentationType.NEW_SEGMENTATION_BIG && this.personSegmentationSmall == null) {
                this.personSegmentationSmall = personSegmentationFactory.create(TensorflowSegmentationType.NEW_SEGMENTATION, this.delegateManager, supplier1, runnable4, weakReference, weakReference2);
            }
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isSkySegmentationRequired && this.skySegmentation == null) {
            this.skySegmentation = new SkySegmentationFactory(this.threadCount, true, false, this.gpuCache).create(this.delegateManager, supplier1, runnable4, weakReference, weakReference2);
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isFaceDetectionRequired && this.faceDetectionPipeline == null) {
            this.faceDetectionPipeline = new FaceMeshFactory(this.threadCount, this.useGpu, this.useGPUPass, this.gpuCache, this.faceLandmarksType, this.logger).create(this.delegateManager, supplier1, runnable2, weakReference, weakReference2);
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isMorphingRequired && this.featureRequirements.additionalModels != null) {
            for (TensorflowModel tensorflowModel : this.featureRequirements.additionalModels) {
                if (!this.morphingPipelines.containsKey(tensorflowModel)) {
                    this.morphingPipelines.put(tensorflowModel, new FaceMorphingFactory(tensorflowModel, this.threadCount, this.useGpu, this.useGPUPass, this.gpuCache, this.logger).create(this.delegateManager, supplier1, runnable2, weakReference, weakReference2));
                }
            }
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isCatDetectionRequired && this.catDetectionPipeline == null) {
            this.catDetectionPipeline = new CatMeshFactory(this.threadCount, false, this.useGPUPass, this.gpuCache, this.logger).create(this.delegateManager, supplier1, runnable3, weakReference, weakReference2);
        }
        if (this.isReleased) {
            return;
        }
        if (this.featureRequirements.isPatterMatchDetectionRequired && (this.bodyWhitePatternMatchingPipeline == null || this.bodyBlackPatternMatchingPipeline == null)) {
            this.bodyWhitePatternMatchingPipeline = new BodyPatternMatchingFactory(this.threadCount, false, this.logger).create(BodyPatternMatchingFactory.Pattern.CLIPS_WHITE, this.delegateManager, supplier1, new x9o0(0), weakReference, weakReference2);
            this.bodyBlackPatternMatchingPipeline = new BodyPatternMatchingFactory(this.threadCount, false, this.logger).create(BodyPatternMatchingFactory.Pattern.CLIPS_BLACK, this.delegateManager, supplier1, new y9o0(0), weakReference, weakReference2);
        }
        if (this.isReleased) {
            return;
        }
        boolean z = this.prepared;
        this.prepared = true;
        if (this.requiredSetup) {
            changeSettings();
        }
        InitializeCallback initializeCallback = this.initializeCallback;
        if (initializeCallback == null || z) {
            return;
        }
        initializeCallback.onInitialized();
    }

    private <T> T processAdditinalModels(Function<FaceMorphingPipeline, T> function, T t) {
        if (this.featureRequirements.additionalModels != null) {
            for (TensorflowModel tensorflowModel : this.featureRequirements.additionalModels) {
                if (this.morphingPipelines.containsKey(tensorflowModel)) {
                    t = function.apply(this.morphingPipelines.get(tensorflowModel));
                }
            }
        }
        return t;
    }

    public static Gesture recognitionToGesture(@NonNull Recognition recognition) {
        return GestureManager.recognitionToGesture(recognition);
    }

    private void releasePipelines() {
        IoHelper.closeQuietly(this.handRecognizer);
        this.handRecognizer = null;
        IoHelper.closeQuietly(this.faceDetectionPipeline);
        this.faceDetectionPipeline = null;
        Iterator<FaceMorphingPipeline> it = this.morphingPipelines.values().iterator();
        while (it.hasNext()) {
            IoHelper.closeQuietly(it.next());
        }
        this.morphingPipelines.clear();
        IoHelper.closeQuietly(this.catDetectionPipeline);
        this.catDetectionPipeline = null;
        IoHelper.closeQuietly(this.personSegmentation);
        this.personSegmentation = null;
        IoHelper.closeQuietly(this.personSegmentationSmall);
        this.personSegmentationSmall = null;
        IoHelper.closeQuietly(this.skySegmentation);
        this.skySegmentation = null;
        IoHelper.closeQuietly(this.bodyBlackPatternMatchingPipeline);
        this.bodyBlackPatternMatchingPipeline = null;
        IoHelper.closeQuietly(this.bodyWhitePatternMatchingPipeline);
        this.bodyWhitePatternMatchingPipeline = null;
    }

    private void releaseVisualizers() {
        if (this.visualizer != null) {
            this.visualizer.release();
            this.visualizer = null;
        }
        if (this.faceFigureVisualizer != null) {
            this.faceFigureVisualizer.release();
            this.faceFigureVisualizer = null;
        }
        if (this.catFigureVisualizer != null) {
            this.catFigureVisualizer.release();
            this.catFigureVisualizer = null;
        }
        if (this.bodyPatternMatchVisualizer != null) {
            this.bodyPatternMatchVisualizer.release();
            this.bodyPatternMatchVisualizer = null;
        }
        if (this.segmentationVisualizer != null) {
            this.segmentationVisualizer.release();
            this.segmentationVisualizer = null;
        }
    }

    private void runPreparePipelines(Runnable runnable) {
        DelegateManager delegateManager = this.delegateManager;
        if (delegateManager == null) {
            return;
        }
        delegateManager.submit(new wv4(12, this, runnable));
    }

    private void startInitGPU() {
        if (this.isReleased || this.glThread == null) {
            return;
        }
        if (this.handRecognizer != null) {
            this.handRecognizer.startInitGPU(this.glThread);
        }
        if (this.personSegmentation != null) {
            this.personSegmentation.startInitGPU(this.glThread);
        }
        if (this.personSegmentationSmall != null) {
            this.personSegmentationSmall.startInitGPU(this.glThread);
        }
        if (this.skySegmentation != null) {
            this.skySegmentation.startInitGPU(this.glThread);
        }
        if (this.faceDetectionPipeline != null) {
            this.faceDetectionPipeline.startInitGPU(this.glThread);
        }
        if (!this.morphingPipelines.isEmpty()) {
            Iterator<FaceMorphingPipeline> it = this.morphingPipelines.values().iterator();
            while (it.hasNext()) {
                it.next().startInitGPU(this.glThread);
            }
        }
        if (this.catDetectionPipeline != null) {
            this.catDetectionPipeline.startInitGPU(this.glThread);
        }
        GlThreadWithSharedContext glThreadWithSharedContext = this.glThread;
        if (glThreadWithSharedContext != null) {
            glThreadWithSharedContext.setReadyRunAsync(true);
        }
        this.gpuInitedStarted = true;
    }

    @Override // ru.ok.gl.util.Consumer2
    public void accept(FrameHolder frameHolder, Matrix matrix) {
    }

    @Override // ru.ok.BitmapConsumer
    public void acceptTens(Map<TFFrameType, FrameHolder> map) {
        tryStartInitGpu();
        if (!this.isRecognitionOngoning.get() && isAllowedToRecognize()) {
            this.isRecognitionOngoning.set(true);
            this.isMustSyncPartOngoing.set(true);
            this.tensorflowDispatcher.obtainMessage(0, map).sendToTarget();
            if (this.featureRequirements.isCatDetectionRequired && this.isCatEnabled) {
                this.isRecognitionOngoning.await(false, 30L);
            } else if (this.smallPersonSegmEnabled && this.featureRequirements.isPersonSegmentationRequired && this.isPersonSegmEnabled) {
                this.isRecognitionOngoning.await(false, 0L);
            } else if (this.onlyGestureinFrugal) {
                this.isMustSyncPartOngoing.await(false);
            } else {
                this.isRecognitionOngoning.await(false);
            }
        }
        Iterator<Consumer<Bitmap>> it = this.fullSegConsumers.iterator();
        while (it.hasNext()) {
            it.next().accept(this.segmentationResult);
        }
        ArrayList arrayList = new ArrayList(this.faceDetectionResults.size());
        for (FaceFigure faceFigure : this.faceDetectionResults) {
            arrayList.add(new FaceFigure(faceFigure.detection.copy(), (float[]) faceFigure.mesh.clone(), faceFigure.score, (float[]) faceFigure.rotationMatrix.clone(), faceFigure.is3DMesh));
        }
        Iterator<Consumer<List<FaceFigure>>> it2 = this.fullFacesConsumers.iterator();
        while (it2.hasNext()) {
            it2.next().accept(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(this.catDetectionResults.size());
        for (FaceFigure faceFigure2 : this.catDetectionResults) {
            arrayList2.add(new CatFigure(faceFigure2.detection.copy(), (float[]) faceFigure2.mesh.clone(), faceFigure2.score, (float[]) faceFigure2.rotationMatrix.clone()));
        }
        Iterator<Consumer<List<CatFigure>>> it3 = this.fullCatsConsumers.iterator();
        while (it3.hasNext()) {
            it3.next().accept(arrayList2);
        }
        Iterator<Consumer<List<PatternMatch>>> it4 = this.bodyPatternMatchConsumers.iterator();
        while (it4.hasNext()) {
            it4.next().accept(this.bodyPatternMatchResults);
        }
        ArrayList arrayList3 = new ArrayList(this.faceMorphings.size());
        for (FaceMorphingFigure faceMorphingFigure : this.faceMorphings) {
            arrayList3.add(new FaceMorphingFigure(faceMorphingFigure.detection.copy(), null, faceMorphingFigure.score, (float[]) faceMorphingFigure.rotationMatrix.clone(), faceMorphingFigure.is3DMesh, faceMorphingFigure.outputImg, faceMorphingFigure.outputMask, faceMorphingFigure.outputWarpMap, faceMorphingFigure.cropScaleFactor, faceMorphingFigure.cropTranslateFactor));
        }
        if (!arrayList3.isEmpty()) {
            FaceMorphingFigure faceMorphingFigure2 = (FaceMorphingFigure) arrayList3.get(0);
            Iterator<Consumer<FaceMorphingFigure>> it5 = this.morphConsumers.iterator();
            while (it5.hasNext()) {
                it5.next().accept(faceMorphingFigure2);
            }
        }
        if (this.releaseAfterProcess.get()) {
            release();
            this.releaseAfterProcess.set(false);
        }
    }

    public void addBodyPatternMatchConsumer(@NonNull Consumer<List<PatternMatch>> consumer) {
        this.bodyPatternMatchConsumers.add(consumer);
    }

    public void addCatsConsumer(@NonNull Consumer<List<CatFigure>> consumer) {
        this.fullCatsConsumers.add(consumer);
    }

    public void addFacesConsumer(@NonNull Consumer<List<FaceFigure>> consumer) {
        this.fullFacesConsumers.add(consumer);
    }

    public void addMorphConsumer(@NonNull Consumer<FaceMorphingFigure> consumer) {
        this.morphConsumers.add(consumer);
    }

    public void addRecognitionConsumer(Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap> consumer5) {
        if (consumer5 != null) {
            this.recognitionConsumers.add(consumer5);
        }
    }

    public void addSegmentationConsumer(@NonNull Consumer<Bitmap> consumer) {
        this.fullSegConsumers.add(consumer);
    }

    public void changeSettings(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, HandRecognitionFactory.RecognitionMode recognitionMode, boolean z8, boolean z9, boolean z10, TensorflowModel[] tensorflowModelArr) {
        this.numFacesRequired = i;
        this.isFace3DEnabled = z10;
        this.isCatEnabled = z4;
        this.isMorphingEnabled = z5;
        this.isWhitePatternMatchEnabled = z6;
        this.isBlackPatternMatchEnabled = z7;
        this.isFrugal = z;
        RecognizerFrugal recognizerFrugal = this.handRecognizer;
        if (recognizerFrugal != null) {
            recognizerFrugal.setFrugal(this.isFrugal);
        }
        if (this.isPersonSegmEnabled != z2 || this.isSkySegmEnabled != z3) {
            this.segmentationResult = null;
        }
        this.isPersonSegmEnabled = z2;
        this.isSkySegmEnabled = z3;
        this.mode = recognitionMode;
        this.smallPersonSegmEnabled = z8;
        this.solvePnpAnglesEnabled = z9;
        this.additionalModelsRequired = tensorflowModelArr;
        this.tensorflowDispatcher.post(new a(this, 17));
    }

    public void enableDrawing(boolean z) {
        this.isDrawingEnabled.set(z);
        MultiBoxVisualizer multiBoxVisualizer = this.visualizer;
        if (multiBoxVisualizer != null) {
            multiBoxVisualizer.setDrawEnabled(z);
        }
        FaceFigureVisualizer faceFigureVisualizer = this.faceFigureVisualizer;
        if (faceFigureVisualizer != null) {
            faceFigureVisualizer.setDrawEnabled(z);
        }
        FaceFigureVisualizer faceFigureVisualizer2 = this.catFigureVisualizer;
        if (faceFigureVisualizer2 != null) {
            faceFigureVisualizer2.setDrawEnabled(z);
        }
        PatternMatchVisualizer patternMatchVisualizer = this.bodyPatternMatchVisualizer;
        if (patternMatchVisualizer != null) {
            patternMatchVisualizer.setDrawEnabled(z);
        }
        FullSegmentationResultVisualizer fullSegmentationResultVisualizer = this.segmentationVisualizer;
        if (fullSegmentationResultVisualizer != null) {
            fullSegmentationResultVisualizer.setDrawEnabled(z);
        }
    }

    public Size getFrameSize() {
        return this.frameSize;
    }

    public Size getOriginalFrameSize() {
        return this.originalFrameSize;
    }

    public boolean isAllowedToRecognize() {
        return !this.isReleased && this.prepared;
    }

    public boolean isCatsGpued() {
        return this.featureRequirements.isCatDetectionRequired && this.catDetectionPipeline != null && this.catDetectionPipeline.isGpued();
    }

    public boolean isMorphingGpued(TensorflowModel tensorflowModel) {
        return this.featureRequirements.isMorphingRequired && this.morphingPipelines.containsKey(tensorflowModel) && this.morphingPipelines.get(tensorflowModel).isGpued();
    }

    public boolean isPersonSegmentationGpued() {
        return this.featureRequirements.isPersonSegmentationRequired && this.personSegmentation != null && this.personSegmentation.isGpued();
    }

    @Override // ru.ok.BitmapConsumer
    public boolean isReady() {
        if (this.featureRequirements.isHandRecognizerRequired && this.handRecognizer != null) {
            return true;
        }
        if (this.prepared) {
            return this.isWhitePatternMatchEnabled || this.isBlackPatternMatchEnabled || this.isCatEnabled || isFaceEnabled() || this.isFace3DEnabled || this.isSkySegmEnabled || this.isMorphingEnabled || this.isPersonSegmEnabled;
        }
        return false;
    }

    public boolean isSolvePnpAnglesEnabled() {
        return this.solvePnpAnglesEnabled;
    }

    public void release() {
        this.recognitionConsumers.clear();
        this.fullSegConsumers.clear();
        this.fullFacesConsumers.clear();
        this.fullCatsConsumers.clear();
        this.bodyPatternMatchConsumers.clear();
        this.morphConsumers.clear();
        this.tensorflowDispatcher.post(new cs2(this, 18));
        this.isRecognitionOngoning.await(false, 100L);
    }

    public void removeRecognitionConsumer(Consumer5<Tensorflow, List<Recognition>, List<FaceFigure>, List<CatFigure>, Bitmap> consumer5) {
        this.recognitionConsumers.remove(consumer5);
    }

    public void removeSegmentationConsumer(Consumer<Bitmap> consumer) {
        this.fullSegConsumers.remove(consumer);
    }

    public void setSync(boolean z) {
        this.targetFps = z ? this.TARGET_FPS_SYNC : 33;
    }

    public void tryStartInitCats() {
        if (this.featureRequirements.isCatDetectionRequired || this.isCatEnabled) {
            return;
        }
        this.isCatEnabled = true;
        initIfNeeded();
        this.isCatEnabled = false;
    }

    @Override // ru.ok.BitmapConsumer
    public void tryStartInitGpu() {
        if (this.useGPUPass && this.sharedEglContext == null) {
            this.sharedEglContext = new SharedEglContext(EGL14.eglGetCurrentContext());
            GlThreadWithSharedContext glThreadWithSharedContext = new GlThreadWithSharedContext(this.sharedEglContext.getContext());
            this.glThread = glThreadWithSharedContext;
            glThreadWithSharedContext.start();
        }
        if (this.useGPUPass && this.prepared && !this.gpuInitedStarted) {
            try {
                if (this.glThread.waitUntilReady()) {
                    startInitGPU();
                }
            } catch (Exception unused) {
                Log.e(TAG, "Cannot initialize gl thread.");
            }
        }
    }

    public void tryStartInitPersonSegmentation() {
        if (this.featureRequirements.isPersonSegmentationRequired || this.isPersonSegmEnabled) {
            return;
        }
        this.isPersonSegmEnabled = true;
        initIfNeeded();
        this.isPersonSegmEnabled = false;
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        int useFrame;
        if (!isAllowedToRecognize()) {
            return 0;
        }
        int useFrame2 = this.handRecognizer != null ? this.handRecognizer.useFrame(tFFrameType) : 0;
        boolean z = isFaceEnabled() || this.isFace3DEnabled;
        boolean z2 = this.isCatEnabled;
        boolean z3 = this.isMorphingEnabled;
        boolean z4 = this.isWhitePatternMatchEnabled;
        boolean z5 = this.isBlackPatternMatchEnabled;
        if (this.featureRequirements.isCatDetectionRequired && z2 && this.catDetectionPipeline != null) {
            useFrame2 |= this.catDetectionPipeline.useFrame(tFFrameType);
        }
        if (this.featureRequirements.isFaceDetectionRequired && z && this.faceDetectionPipeline != null) {
            useFrame2 |= this.faceDetectionPipeline.useFrame(tFFrameType);
        }
        if (this.featureRequirements.isMorphingRequired && z3 && !this.morphingPipelines.isEmpty()) {
            useFrame2 |= ((Integer) processAdditinalModels(new o8c0(tFFrameType, 5), 0)).intValue();
        }
        if (this.featureRequirements.isPatterMatchDetectionRequired && z4 && this.bodyWhitePatternMatchingPipeline != null) {
            useFrame2 |= this.bodyWhitePatternMatchingPipeline.useFrame(tFFrameType);
        }
        if (this.featureRequirements.isPatterMatchDetectionRequired && z5 && this.bodyBlackPatternMatchingPipeline != null) {
            useFrame2 |= this.bodyBlackPatternMatchingPipeline.useFrame(tFFrameType);
        }
        if (!this.featureRequirements.isPersonSegmentationRequired || !this.isPersonSegmEnabled) {
            if (this.featureRequirements.isSkySegmentationRequired && this.isSkySegmEnabled && this.skySegmentation != null) {
                useFrame = this.skySegmentation.useFrame(tFFrameType);
                return useFrame | useFrame2;
            }
            return useFrame2;
        }
        if (this.personSegmentation == null || (this.segmentationType != TensorflowSegmentationType.NEW_SEGMENTATION_BIG && tFFrameType == TFFrameType.NORMAL)) {
            if (this.personSegmentationSmall != null) {
                useFrame = this.personSegmentationSmall.useFrame(tFFrameType);
            }
            return useFrame2;
        }
        useFrame = this.personSegmentation.useFrame(tFFrameType);
        return useFrame | useFrame2;
    }

    public static int getColor(Gesture gesture) {
        switch (AnonymousClass2.$SwitchMap$ru$ok$tensorflow$entity$Gesture[gesture.ordinal()]) {
            case 1:
                return Color.rgb(255, 128, 0);
            case 2:
                return -256;
            case 3:
                return Color.rgb(204, 255, 229);
            case 4:
                return -16776961;
            case 5:
                return -16711936;
            case 6:
                return -65536;
            case 7:
                return -1;
            case 8:
                return -65281;
            case 9:
                return -16777216;
            case 10:
                return Color.rgb(255, 250, 153);
            case 11:
                return Color.rgb(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            case 12:
                return Color.rgb(0, 255, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
            case 13:
                return Color.rgb(174, 255, 0);
            case 14:
                return Color.rgb(255, 20, 147);
            case 15:
                return Color.rgb(147, 20, 255);
            case 16:
                return -65536;
            default:
                return -7829368;
        }
    }

    private <T> T processAdditinalModels(Function<FaceMorphingPipeline, T> function) {
        return (T) processAdditinalModels(function, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSettings() {
        if (!this.prepared) {
            this.requiredSetup = true;
            return;
        }
        this.requiredSetup = false;
        initIfNeeded();
        if (this.featureRequirements.isHandRecognizerRequired) {
            if (this.handRecognizer != null) {
                this.handRecognizer.setFrugal(this.isFrugal);
                HandRecognitionFactory.setMode(this.handRecognizer, this.mode);
            } else {
                Log.e(TAG, "Something went wrong with threads, create a task for this because it is not the way it should be");
            }
        }
        this.bigCropRequired = this.isWhitePatternMatchEnabled || this.isBlackPatternMatchEnabled || isFaceEnabled() || this.isFace3DEnabled || this.isCatEnabled || this.isMorphingEnabled;
        this.smallCropRequired = this.isPersonSegmEnabled && this.segmentationType != TensorflowSegmentationType.NEW_SEGMENTATION_BIG;
        this.onlyGestureinFrugal = (!this.isFrugal || this.bigCropRequired || this.smallCropRequired || this.isPersonSegmEnabled || this.isSkySegmEnabled) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preparePipelines$10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preparePipelines$11() {
    }
}
