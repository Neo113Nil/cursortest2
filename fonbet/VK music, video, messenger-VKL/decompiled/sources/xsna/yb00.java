package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import com.vk.toggle.Features;
import com.vk.toggle.features.VoipFeatures;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.TensorflowSegmentationType;
import xsna.y560;

/* compiled from: MLFeaturesBackgroundLoader.kt */
/* loaded from: classes.dex */
public final class yb00 implements y560.a {
    public final z9o0 a;
    public volatile boolean b;
    public boolean c;

    /* compiled from: MLFeaturesBackgroundLoader.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TensorflowSegmentationType.values().length];
            try {
                iArr[TensorflowSegmentationType.OLD_SEGMENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TensorflowSegmentationType.NEW_SEGMENTATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TensorflowSegmentationType.NEW_SEGMENTATION_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MLFeaturesBackgroundLoader.kt */
    /* loaded from: classes3.dex */
    public static final class b implements izs<Throwable, s3q0> {
        public boolean b;

        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            yb00 yb00Var = yb00.this;
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    pro0.e(new po4(yb00Var, 4));
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            return s3q0.a;
        }
    }

    public yb00(z9o0 z9o0Var) {
        this.a = z9o0Var;
    }

    public static ArrayList l() {
        if (BuildInfo.t()) {
            return new ArrayList();
        }
        if (BuildInfo.g()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(MLFeatures.MLFeature.MORPHING_BABY);
        arrayList.add(MLFeatures.MLFeature.MORPHING_BEAUTIFIER);
        arrayList.add(MLFeatures.MLFeature.MORPHING_OLD);
        arrayList.add(MLFeatures.MLFeature.MORPHING_YOUNG);
        arrayList.add(MLFeatures.MLFeature.MORPHING_RETOUCH);
        arrayList.add(MLFeatures.MLFeature.MORPHING_FAT);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CARTOON);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CUSTOM_1);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CUSTOM_2);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CUSTOM_3);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CUSTOM_4);
        arrayList.add(MLFeatures.MLFeature.MORPHING_CUSTOM_5);
        return arrayList;
    }

    @Override // xsna.y560.a
    public final void b() {
        if (o25.a().b()) {
            m(null, false);
        }
    }

    @Override // xsna.y560.a
    public final boolean f(String str) {
        return true;
    }

    public final void i(EnumSet enumSet) {
        enumSet.add(MLFeatures.MLFeature.ANIMOJI_VOWELS);
        j(enumSet);
        enumSet.add(MLFeatures.MLFeature.FACEDETECT);
        enumSet.add(MLFeatures.MLFeature.FACELANDMARK);
        enumSet.add(MLFeatures.MLFeature.FACE_LANDMARK_WITH_ATTENTION);
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(Features.Type.FEATURE_VOIP_NOISE_SUPPRESSION)) {
            enumSet.add(MLFeatures.MLFeature.NS_PIPELINE_SPLIT);
            enumSet.add(MLFeatures.MLFeature.NS_PIPELINE_48K);
        }
        if (bVar.a(VoipFeatures.ENABLE_NS_DF_TINY)) {
            enumSet.add(MLFeatures.MLFeature.NS_DF_TINY);
        }
        if (this.a.d()) {
            enumSet.add(MLFeatures.MLFeature.PALMDETECT);
            enumSet.add(MLFeatures.MLFeature.MULTITASK);
        }
    }

    public final void j(Set<MLFeatures.MLFeature> set) {
        int i = a.$EnumSwitchMapping$0[this.a.b().ordinal()];
        if (i == 1) {
            set.add(MLFeatures.MLFeature.FULL_SEGMENTATION);
            return;
        }
        if (i == 2) {
            set.add(MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            set.add(MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH);
            set.add(MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH);
        }
    }

    public final List<MLFeatures.MLFeature> k(boolean z) {
        if (z) {
            EnumSet noneOf = EnumSet.noneOf(MLFeatures.MLFeature.class);
            noneOf.add(MLFeatures.MLFeature.FULL_SEGMENTATION_U);
            noneOf.add(MLFeatures.MLFeature.NS_PIPELINE_SPLIT);
            return j5g.O0(noneOf);
        }
        if (BuildInfo.t()) {
            EnumSet noneOf2 = EnumSet.noneOf(MLFeatures.MLFeature.class);
            i(noneOf2);
            return j5g.O0(noneOf2);
        }
        if (BuildInfo.g()) {
            EnumSet noneOf3 = EnumSet.noneOf(MLFeatures.MLFeature.class);
            i(noneOf3);
            return j5g.O0(noneOf3);
        }
        if (BuildInfo.q()) {
            EnumSet noneOf4 = EnumSet.noneOf(MLFeatures.MLFeature.class);
            i(noneOf4);
            j(noneOf4);
            noneOf4.add(MLFeatures.MLFeature.FACEDETECT);
            noneOf4.add(MLFeatures.MLFeature.FACELANDMARK);
            noneOf4.add(MLFeatures.MLFeature.FACE_LANDMARK_WITH_ATTENTION);
            noneOf4.add(MLFeatures.MLFeature.PALMDETECT);
            noneOf4.add(MLFeatures.MLFeature.MULTITASK);
            noneOf4.add(MLFeatures.MLFeature.CATDETECT);
            noneOf4.add(MLFeatures.MLFeature.CATLANDMARK_RECURRENT);
            noneOf4.add(MLFeatures.MLFeature.SKY_SEGMENTATION_HMS_256_V7);
            return j5g.O0(noneOf4);
        }
        EnumSet noneOf5 = EnumSet.noneOf(MLFeatures.MLFeature.class);
        i(noneOf5);
        if (g620.f().getExperiments().c()) {
            j(noneOf5);
            noneOf5.add(MLFeatures.MLFeature.FACEDETECT);
            noneOf5.add(MLFeatures.MLFeature.FACELANDMARK);
            noneOf5.add(MLFeatures.MLFeature.FACE_LANDMARK_WITH_ATTENTION);
            noneOf5.add(MLFeatures.MLFeature.PALMDETECT);
            noneOf5.add(MLFeatures.MLFeature.MULTITASK);
            noneOf5.add(MLFeatures.MLFeature.CATDETECT);
            noneOf5.add(MLFeatures.MLFeature.CATLANDMARK_RECURRENT);
            noneOf5.add(MLFeatures.MLFeature.FACE_MORPH);
            noneOf5.add(MLFeatures.MLFeature.SKY_SEGMENTATION_HMS_256_V7);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_BABY);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_BEAUTIFIER);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_OLD);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_YOUNG);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_RETOUCH);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_FAT);
            noneOf5.add(MLFeatures.MLFeature.MORPHING_CARTOON);
        }
        return j5g.O0(noneOf5);
    }

    public final synchronized void m(List list, boolean z) {
        L.e("MLFeaturesBackLoader", "sync " + z + ' ' + list);
        boolean b2 = o25.a().b() ^ true;
        StringBuilder sb = new StringBuilder("sync check syncAlreadyStarted=");
        sb.append(this.b);
        sb.append(" MLFeatures.isInitialized=");
        com.vk.ml.b bVar = MLFeatures.a;
        sb.append(MLFeatures.c());
        sb.append(" syncFailed=");
        sb.append(this.c);
        L.e("MLFeaturesBackLoader", sb.toString());
        if (!this.b && !MLFeatures.c() && (!this.c || z)) {
            L.e("MLFeaturesBackLoader", "init called");
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            MLFeatures.b(context, k(b2), l(), list, new b());
            this.b = true;
        }
    }

    @Override // xsna.y560.a
    public final void c() {
    }
}
