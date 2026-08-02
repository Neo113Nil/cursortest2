package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;

/* compiled from: BottomSheetSharedTransition.kt */
/* loaded from: classes6.dex */
public final class x88 extends vlp0 {
    public static final String[] b = {"heightTransition:height", "heightTransition:viewType"};

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        HashMap hashMap = gnp0Var.a;
        View view = gnp0Var.b;
        View view2 = (View) view.getParent();
        view2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(iah0.z(view2.getContext()), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
        int measuredHeight = view2.getMeasuredHeight();
        int p = iah0.p(view.getContext());
        if (measuredHeight > p) {
            measuredHeight = p;
        }
        hashMap.put("heightTransition:height", Integer.valueOf(measuredHeight));
        hashMap.put("heightTransition:viewType", TtmlNode.END);
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        HashMap hashMap = gnp0Var.a;
        View view = gnp0Var.b;
        hashMap.put("heightTransition:height", Integer.valueOf(view.getHeight()));
        hashMap.put("heightTransition:viewType", "start");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.getLayoutParams().height = view2.getHeight();
        }
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null || gnp0Var2 == null) {
            return null;
        }
        View view = gnp0Var2.b;
        ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) gnp0Var.a.get("heightTransition:height")).intValue(), ((Integer) gnp0Var2.a.get("heightTransition:height")).intValue());
        View view2 = (View) view.getParent();
        ofInt.addUpdateListener(new w88(view2, 0));
        addListener(new jmp0(new jd(view2, 11)));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        List l = e43.l(ofInt, ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(l);
        return animatorSet;
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return b;
    }
}
