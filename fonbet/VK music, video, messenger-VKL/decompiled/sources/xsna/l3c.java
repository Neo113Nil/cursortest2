package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* compiled from: CheckoutConfirmationTransition.kt */
/* loaded from: classes6.dex */
public final class l3c extends vlp0 {
    public static final String[] b = {"heightTransition:height", "heightTransition:viewType"};

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        HashMap hashMap = gnp0Var.a;
        View view = gnp0Var.b;
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(iah0.z(view.getContext()), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
        int measuredHeight = view.getMeasuredHeight();
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
        hashMap.put("heightTransition:height", Integer.valueOf(gnp0Var.b.getHeight()));
        hashMap.put("heightTransition:viewType", "start");
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null || gnp0Var2 == null) {
            return null;
        }
        int intValue = ((Integer) gnp0Var.a.get("heightTransition:height")).intValue();
        int intValue2 = ((Integer) gnp0Var2.a.get("heightTransition:height")).intValue();
        View view = gnp0Var2.b;
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
        ofInt.addUpdateListener(new os6(view, 1));
        ofInt.addListener(new y86(view, 1));
        ofInt.setDuration(175L);
        return ofInt;
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return b;
    }
}
