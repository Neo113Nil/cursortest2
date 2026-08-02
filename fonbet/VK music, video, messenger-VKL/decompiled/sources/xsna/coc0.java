package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class coc0 extends FunctionReferenceImpl implements izs<List<? extends zai0>, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(List<? extends zai0> list) {
        List<? extends zai0> list2 = list;
        final enc0 enc0Var = (enc0) this.receiver;
        xai0 xai0Var = enc0Var.W;
        if (xai0Var != null) {
            xai0Var.submitList(list2);
        }
        enc0Var.D.setCount(Integer.valueOf(list2.size()));
        final boolean z = !list2.isEmpty();
        ValueAnimator valueAnimator = enc0Var.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        enc0Var.P = null;
        final float scaleX = enc0Var.C.getScaleX();
        if (enc0Var.R) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.zmc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                    if (f != null) {
                        enc0.this.i(f.floatValue(), scaleX, z);
                    }
                }
            });
            enc0Var.P = ofFloat;
            ofFloat.start();
        } else {
            enc0Var.i(1.0f, scaleX, z);
            enc0Var.R = true;
        }
        return s3q0.a;
    }
}
