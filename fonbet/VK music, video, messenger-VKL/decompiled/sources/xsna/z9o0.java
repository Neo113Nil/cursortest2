package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.ml.MLFeatures;
import com.vk.ml.api.tf.TensorflowFacade;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.gl.objects.GLVersion;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.tensorflow.tflite.ModelDataProvider;

/* compiled from: TensorflowExperiments.kt */
/* loaded from: classes.dex */
public final class z9o0 implements TensorflowFacade, w8i {
    public final a4k b = new a4k();
    public final bpn0 c = new bpn0(new m15(this, 13));
    public final bpn0 d = new bpn0(new cia(this, 12));

    /* compiled from: TensorflowExperiments.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TensorflowFaceLandmarksType.values().length];
            try {
                iArr[TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS_WITH_ATTENTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TensorflowSegmentationType.values().length];
            try {
                iArr2[TensorflowSegmentationType.OLD_SEGMENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TensorflowSegmentationType.NEW_SEGMENTATION_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TensorflowSegmentationType.NEW_SEGMENTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: TensorflowExperiments.kt */
    /* loaded from: classes3.dex */
    public static final class b implements TensorflowFacade.a {
        public static final /* synthetic */ qcy<Object>[] c;
        public final kta b;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, "delegate", "getDelegate()Lcom/vk/ml/loader/TensorflowModelFromFileLoader;", 0);
            fpf0.a.getClass();
            c = new qcy[]{propertyReference1Impl};
        }

        public b(z9o0 z9o0Var) {
            this.b = new kta(new vqf0(z9o0Var), new hbj0(z9o0Var, 9));
        }

        public final iao0 a() {
            qcy<Object> qcyVar = c[0];
            return this.b.a();
        }

        @Override // com.vk.ml.api.tf.TensorflowFacade.a
        public final MLFeatures.MLFeature b(TensorflowModel tensorflowModel) {
            return a().b(tensorflowModel);
        }

        @Override // com.vk.ml.api.tf.TensorflowFacade.a
        public final boolean c(MLFeatures.MLFeature mLFeature) {
            a();
            com.vk.ml.b bVar = MLFeatures.a;
            return bVar.f() && com.vk.ml.b.g(bVar.d(mLFeature)) && bVar.h(mLFeature);
        }

        @Override // ru.ok.gl.util.Supplier1
        public final ModelDataProvider get(TensorflowModel tensorflowModel) {
            return new hao0(a(), tensorflowModel);
        }

        @Override // com.vk.ml.api.tf.TensorflowFacade.a
        public final boolean isReady() {
            return a().isReady();
        }

        @Override // com.vk.ml.api.tf.TensorflowFacade.a
        public final int l() {
            int i = 0;
            for (MLFeatures.MLFeature mLFeature : a().c) {
                com.vk.ml.b bVar = MLFeatures.a;
                i += (bVar.f() && com.vk.ml.b.g(bVar.d(mLFeature)) && bVar.h(mLFeature)) ? 1 : 0;
            }
            return i;
        }

        @Override // com.vk.ml.api.tf.TensorflowFacade.a
        public final int m() {
            return a().c.length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0.minVersion >= 1) goto L12;
     */
    @Override // com.vk.ml.api.tf.TensorflowFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TensorflowFacade.OkEngineConfig a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        GLVersion preciseGlVersion = GlUtil.getPreciseGlVersion(context);
        boolean z = preciseGlVersion.majVersion >= 3;
        a4k a4kVar = this.b;
        TensorflowFacade.OkEngineConfig okEngineConfig = (1000000 < a4kVar.a() || a4kVar.a() == -1) ? ((tjd) this.d.getValue()).d() ? TensorflowFacade.OkEngineConfig.OFF : z ? TensorflowFacade.OkEngineConfig.GPU : TensorflowFacade.OkEngineConfig.CPU : TensorflowFacade.OkEngineConfig.OFF;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return okEngineConfig;
        }
        L.u(l, L.LogType.i, new Object[]{"TensorflowExperiments", "chosen config: " + okEngineConfig + ", " + preciseGlVersion});
        return okEngineConfig;
    }

    @Override // com.vk.ml.api.tf.TensorflowFacade
    public final TensorflowSegmentationType b() {
        return !o25.a().b() ? TensorflowSegmentationType.OLD_SEGMENTATION : this.b.a() >= 3050000 ? TensorflowSegmentationType.NEW_SEGMENTATION_BIG : TensorflowSegmentationType.NEW_SEGMENTATION;
    }

    @Override // com.vk.ml.api.tf.TensorflowFacade
    public final TensorflowFacade.a c() {
        return (TensorflowFacade.a) this.c.getValue();
    }

    @Override // com.vk.ml.api.tf.TensorflowFacade
    public final boolean d() {
        return o25.a().b();
    }

    @Override // com.vk.ml.api.tf.TensorflowFacade
    public final TensorflowFaceLandmarksType e() {
        return this.b.a() >= 3050000 ? TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS_WITH_ATTENTIONS : TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS;
    }

    public final boolean f() {
        return a() != TensorflowFacade.OkEngineConfig.OFF;
    }
}
