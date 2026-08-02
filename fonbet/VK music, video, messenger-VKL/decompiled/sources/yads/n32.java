package yads;

import android.view.View;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes10.dex */
public final class n32 implements z00 {
    public final km a;

    public n32(km kmVar) {
        this.a = kmVar;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        this.a.D.a(j5Var);
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        km kmVar = this.a;
        si0 si0Var = kmVar.I;
        wc1 wc1Var = kmVar.C;
        si0Var.getClass();
        View findViewWithTag = wc1Var.findViewWithTag("rootDivkitView");
        Div2View div2View = findViewWithTag instanceof Div2View ? (Div2View) findViewWithTag : null;
        if (div2View != null) {
            div2View.setVariable("is_banner_closed", "closed");
        }
        kmVar.D.a();
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        this.a.D.c();
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        this.a.D.d();
    }

    @Override // yads.z00
    public final void onAdClicked() {
    }
}
