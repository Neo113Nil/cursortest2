package ru.ok.call_effects;

import android.content.Context;
import android.graphics.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import ru.ok.call_effects.internal.CpuReader;
import ru.ok.call_effects.internal.DeviceOrientationDetector;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.gl.util.GlThread;
import ru.ok.gl.util.Logger;
import ru.ok.gleffects.EffectRegistry;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.ozl;
import xsna.s3q0;
import xsna.xq;
import xsna.zcl;

/* compiled from: CallEffects.kt */
/* loaded from: classes9.dex */
public final class CallEffects {
    private static final String LOG_TAG = "CallEffects";
    private static final int MIN_TENSORFLOW_RAM_DEFAULT = 1000000;
    private volatile BeautyFilter beautyFilter;
    private final Configuration configuration;
    private final Context context;
    private volatile Effect effect;
    private volatile CallEffectsRenderer effectsRenderer;
    private volatile FiguresConsumer<Figure<? extends Object>> gesturesConsumer;
    private final File gpuCacheFolder;
    private volatile InitializeListener initializeListener;
    private volatile boolean isGesturesRecognitionEnabled;
    private final ReentrantLock lock;
    private final Logger logger;
    private volatile Effect mask;
    private volatile String maskEnginePath;
    private volatile MirroringParameters mirroringParameters;
    private volatile TensorflowConfigurator tensorflowConfigurator;
    private final TensorflowModels tensorflowModels;
    private final TensorflowNativeDependencies tensorflowNativeDependencies;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<CpuReader> cpuReader$delegate = new bpn0(new gzs<CpuReader>() { // from class: ru.ok.call_effects.CallEffects$Companion$cpuReader$2
        @Override // xsna.gzs
        public final CpuReader invoke() {
            return new CpuReader();
        }
    });

    /* compiled from: CallEffects.kt */
    public static final class BeautyFilter {
        private final float intensity;

        public BeautyFilter() {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, null);
        }

        public static /* synthetic */ BeautyFilter copy$default(BeautyFilter beautyFilter, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = beautyFilter.intensity;
            }
            return beautyFilter.copy(f);
        }

        public final float component1() {
            return this.intensity;
        }

        public final BeautyFilter copy(float f) {
            return new BeautyFilter(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BeautyFilter) && Float.valueOf(this.intensity).equals(Float.valueOf(((BeautyFilter) obj).intensity));
        }

        public final float getIntensity() {
            return this.intensity;
        }

        public int hashCode() {
            return Float.hashCode(this.intensity);
        }

        public String toString() {
            return xq.c(')', this.intensity, new StringBuilder("BeautyFilter(intensity="));
        }

        public BeautyFilter(float f) {
            this.intensity = f;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
                throw new IllegalArgumentException("Intensity must be from 0f exclusive to 1f inclusive");
            }
        }

        public /* synthetic */ BeautyFilter(float f, int i, zcl zclVar) {
            this((i & 1) != 0 ? 1.0f : f);
        }
    }

    /* compiled from: CallEffects.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final CpuReader getCpuReader() {
            return (CpuReader) CallEffects.cpuReader$delegate.getValue();
        }

        public final boolean areEffectsAvailableOnThisDevice(Context context) {
            int totalMem = getCpuReader().getTotalMem();
            return (totalMem == -1 || totalMem > CallEffects.MIN_TENSORFLOW_RAM_DEFAULT) && GlUtil.getGlVersion(context) >= 3;
        }

        public final boolean is360BackgroundAvailable(Context context) {
            return DeviceOrientationDetector.isSupportSensor(context);
        }

        private Companion() {
        }
    }

    /* compiled from: CallEffects.kt */
    public static final class Effect {
        private final EffectRegistry.EffectId id;
        private final File resourcePack;

        public Effect(EffectRegistry.EffectId effectId, File file) {
            this.id = effectId;
            this.resourcePack = file;
        }

        public static /* synthetic */ Effect copy$default(Effect effect, EffectRegistry.EffectId effectId, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                effectId = effect.id;
            }
            if ((i & 2) != 0) {
                file = effect.resourcePack;
            }
            return effect.copy(effectId, file);
        }

        public final EffectRegistry.EffectId component1() {
            return this.id;
        }

        public final File component2() {
            return this.resourcePack;
        }

        public final Effect copy(EffectRegistry.EffectId effectId, File file) {
            return new Effect(effectId, file);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Effect)) {
                return false;
            }
            Effect effect = (Effect) obj;
            return this.id == effect.id && epx.f(this.resourcePack, effect.resourcePack);
        }

        public final EffectRegistry.EffectId getId() {
            return this.id;
        }

        public final File getResourcePack() {
            return this.resourcePack;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            File file = this.resourcePack;
            return hashCode + (file == null ? 0 : file.hashCode());
        }

        public String toString() {
            return "Effect(id=" + this.id + ", resourcePack=" + this.resourcePack + ')';
        }
    }

    /* compiled from: CallEffects.kt */
    public static final class Frame {
        private final boolean isFrontCamera;
        private final int rotationAngle;
        private final Size size;
        private final int textureId;
        private final Matrix transformationMatrix;

        public Frame(int i, Size size, int i2, Matrix matrix, boolean z) {
            this.textureId = i;
            this.size = size;
            this.rotationAngle = i2;
            this.transformationMatrix = matrix;
            this.isFrontCamera = z;
        }

        public final int getRotationAngle() {
            return this.rotationAngle;
        }

        public final Size getSize() {
            return this.size;
        }

        public final int getTextureId() {
            return this.textureId;
        }

        public final Matrix getTransformationMatrix() {
            return this.transformationMatrix;
        }

        public final boolean isFrontCamera() {
            return this.isFrontCamera;
        }
    }

    /* compiled from: CallEffects.kt */
    public interface InitializeListener {
        void onInitialized();

        void onReleased();
    }

    /* compiled from: CallEffects.kt */
    public static final class MirroringParameters {
        private final boolean shouldMirrorBackCameraEffect;
        private final boolean shouldMirrorBackCameraFrame;
        private final boolean shouldMirrorFrontCameraEffect;
        private final boolean shouldMirrorFrontCameraFrame;

        public MirroringParameters() {
            this(false, false, false, false, 15, null);
        }

        public final boolean getShouldMirrorBackCameraEffect() {
            return this.shouldMirrorBackCameraEffect;
        }

        public final boolean getShouldMirrorBackCameraFrame() {
            return this.shouldMirrorBackCameraFrame;
        }

        public final boolean getShouldMirrorFrontCameraEffect() {
            return this.shouldMirrorFrontCameraEffect;
        }

        public final boolean getShouldMirrorFrontCameraFrame() {
            return this.shouldMirrorFrontCameraFrame;
        }

        public MirroringParameters(boolean z, boolean z2, boolean z3, boolean z4) {
            this.shouldMirrorFrontCameraFrame = z;
            this.shouldMirrorFrontCameraEffect = z2;
            this.shouldMirrorBackCameraFrame = z3;
            this.shouldMirrorBackCameraEffect = z4;
        }

        public /* synthetic */ MirroringParameters(boolean z, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    /* compiled from: CallEffects.kt */
    public static final class Result {
        private final Size size;
        private final int textureId;
        private final Matrix transformMatrix;

        public Result(int i, Size size, Matrix matrix) {
            this.textureId = i;
            this.size = size;
            this.transformMatrix = matrix;
        }

        public final Size getSize() {
            return this.size;
        }

        public final int getTextureId() {
            return this.textureId;
        }

        public final Matrix getTransformMatrix() {
            return this.transformMatrix;
        }
    }

    public CallEffects(Context context, TensorflowModels tensorflowModels, TensorflowNativeDependencies tensorflowNativeDependencies, Logger logger, Configuration configuration, File file) {
        this.context = context;
        this.tensorflowModels = tensorflowModels;
        this.tensorflowNativeDependencies = tensorflowNativeDependencies;
        this.logger = logger;
        this.configuration = configuration;
        this.gpuCacheFolder = file;
        this.mirroringParameters = new MirroringParameters(false, false, false, false, 15, null);
        this.lock = new ReentrantLock();
    }

    public static final boolean areEffectsAvailableOnThisDevice(Context context) {
        return Companion.areEffectsAvailableOnThisDevice(context);
    }

    private final TensorflowConfigurator createConfigurator() {
        return new TensorflowConfigurator(this.context, this.tensorflowModels, this.tensorflowNativeDependencies, this.initializeListener, this.logger, this.gpuCacheFolder, this.configuration);
    }

    private final CallEffectsRenderer createRenderer() {
        TensorflowConfigurator tensorflowConfigurator = this.tensorflowConfigurator;
        if (tensorflowConfigurator == null) {
            tensorflowConfigurator = createConfigurator();
        }
        CallEffectsRenderer callEffectsRenderer = new CallEffectsRenderer(this.context, this.logger, this.tensorflowModels.getTensorflowSegmentationType(), tensorflowConfigurator, this.tensorflowConfigurator == null, this.configuration);
        FiguresConsumer<Figure<? extends Object>> figuresConsumer = this.gesturesConsumer;
        if (figuresConsumer != null) {
            callEffectsRenderer.setGesturesConsumer(figuresConsumer);
        }
        if (this.maskEnginePath != null) {
            callEffectsRenderer.setMaskEngineModelPath(this.maskEnginePath);
        }
        return callEffectsRenderer;
    }

    private final CallEffectsRenderer ensureRendererCreated() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CallEffectsRenderer callEffectsRenderer = this.effectsRenderer;
            if (callEffectsRenderer != null) {
                return callEffectsRenderer;
            }
            CallEffectsRenderer createRenderer = createRenderer();
            this.effectsRenderer = createRenderer;
            return createRenderer;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final boolean is360BackgroundAvailable(Context context) {
        return Companion.is360BackgroundAvailable(context);
    }

    @GlThread
    public final Result applyEffectToFrame(Frame frame) {
        Effect effect = this.effect;
        BeautyFilter beautyFilter = this.beautyFilter;
        Effect effect2 = this.mask;
        boolean z = this.isGesturesRecognitionEnabled;
        if (effect == null && effect2 == null && beautyFilter == null && !z) {
            return null;
        }
        return ensureRendererCreated().apply(frame, effect, effect2, beautyFilter, this.mirroringParameters, z, this.configuration.isGesturesRecognitionDirtyModeEnabled());
    }

    public final void clearGLResources() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CallEffectsRenderer callEffectsRenderer = this.effectsRenderer;
            if (callEffectsRenderer != null) {
                callEffectsRenderer.release();
            }
            this.effectsRenderer = null;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void initialize() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.tensorflowConfigurator == null) {
                try {
                    this.tensorflowConfigurator = createConfigurator();
                    TensorflowConfigurator tensorflowConfigurator = this.tensorflowConfigurator;
                    if (tensorflowConfigurator != null) {
                        tensorflowConfigurator.configureWithRetry();
                    }
                } catch (Throwable unused) {
                    Logger logger = this.logger;
                    if (logger != null) {
                        logger.e(LOG_TAG, "Can't pre initialize");
                    }
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean isBeautyFilterEnabled() {
        return this.beautyFilter != null;
    }

    public final boolean isEffectEnabled() {
        return this.effect != null;
    }

    public final boolean isEnabled() {
        return isEffectEnabled() || isBeautyFilterEnabled() || isMaskEnabled() || isGesturesRecognitionEnabled();
    }

    public final boolean isGesturesRecognitionEnabled() {
        return this.isGesturesRecognitionEnabled && this.configuration.isGesturesRecognitionEnabled();
    }

    public final boolean isMaskEnabled() {
        return this.mask != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x001c, B:9:0x0023, B:10:0x0026, B:20:0x000e, B:22:0x0012, B:3:0x0005, B:5:0x0009), top: B:2:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void release() {
        InitializeListener initializeListener;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            try {
                TensorflowConfigurator tensorflowConfigurator = this.tensorflowConfigurator;
                if (tensorflowConfigurator != null) {
                    tensorflowConfigurator.release();
                }
            } finally {
                this.tensorflowConfigurator = null;
                initializeListener = this.initializeListener;
                if (initializeListener != null) {
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            }
            this.tensorflowConfigurator = null;
            initializeListener = this.initializeListener;
            if (initializeListener != null) {
                initializeListener.onReleased();
            }
            s3q0 s3q0Var2 = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public final void setBeautyFilter(BeautyFilter beautyFilter) {
        CallEffectsRenderer callEffectsRenderer;
        this.beautyFilter = beautyFilter;
        if (beautyFilter != null || (callEffectsRenderer = this.effectsRenderer) == null) {
            return;
        }
        callEffectsRenderer.disableBeautyFilter();
    }

    public final void setEffect(Effect effect) {
        CallEffectsRenderer callEffectsRenderer;
        this.effect = effect;
        if (effect != null || (callEffectsRenderer = this.effectsRenderer) == null) {
            return;
        }
        callEffectsRenderer.unselectVirtualBackgroundEffect();
    }

    @ozl
    public final void setFrontCameraMirroringEnabled(boolean z) {
        this.mirroringParameters = new MirroringParameters(z, false, false, false, 14, null);
    }

    public final void setGesturesConsumer(FiguresConsumer<Figure<? extends Object>> figuresConsumer) {
        this.gesturesConsumer = figuresConsumer;
        CallEffectsRenderer callEffectsRenderer = this.effectsRenderer;
        if (callEffectsRenderer != null) {
            callEffectsRenderer.setGesturesConsumer(figuresConsumer);
        }
    }

    public final void setGesturesRecognitionEnabled(boolean z) {
        this.isGesturesRecognitionEnabled = z;
    }

    public final void setInitializeListener(InitializeListener initializeListener) {
        this.initializeListener = initializeListener;
    }

    public final void setMask(Effect effect) {
        CallEffectsRenderer callEffectsRenderer;
        this.mask = effect;
        if (effect != null || (callEffectsRenderer = this.effectsRenderer) == null) {
            return;
        }
        callEffectsRenderer.unselectMaskEffect();
    }

    public final void setMaskEngineModelPath(String str) {
        CallEffectsRenderer callEffectsRenderer = this.effectsRenderer;
        if (callEffectsRenderer != null) {
            callEffectsRenderer.setMaskEngineModelPath(str);
        }
        this.maskEnginePath = str;
    }

    public final void setMirroringParameters(MirroringParameters mirroringParameters) {
        this.mirroringParameters = mirroringParameters;
    }

    public /* synthetic */ CallEffects(Context context, TensorflowModels tensorflowModels, TensorflowNativeDependencies tensorflowNativeDependencies, Logger logger, Configuration configuration, File file, int i, zcl zclVar) {
        this(context, tensorflowModels, tensorflowNativeDependencies, logger, (i & 16) != 0 ? new ConfigurationBuilder(false, false, 3, null) : configuration, (i & 32) != 0 ? null : file);
    }
}
