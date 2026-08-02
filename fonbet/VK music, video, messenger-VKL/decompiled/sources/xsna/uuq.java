package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.voip.feedback_gestures.GestureFeedback;
import com.vk.voip.ui.onboarding.features.FeatureId;

/* compiled from: FeatureOnboardingCollector.kt */
/* loaded from: classes7.dex */
public final class uuq {
    public final lcx0 a;
    public final b6r b;
    public final q8w0 c;
    public final hot d;
    public final av3 e;

    /* compiled from: FeatureOnboardingCollector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureId.values().length];
            try {
                iArr[FeatureId.WATCH_TOGETHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureId.REACTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureId.VMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureId.GESTURE_FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureId.ASR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uuq(Context context, FragmentManager fragmentManager, i9d0 i9d0Var, lrt lrtVar, td8 td8Var) {
        this.a = new lcx0(context, td8Var);
        this.b = new b6r(i9d0Var, td8Var);
        this.c = new q8w0(fragmentManager, td8Var);
        this.d = new hot(new su9(lrtVar, (izs) new vuq(1, GestureFeedback.Companion, GestureFeedback.a.class, "checkIfGestureFeedback", "checkIfGestureFeedback(Ljava/lang/String;)Z", 0)), td8Var);
        this.e = new av3(FeatureId.ASR, td8Var);
    }
}
