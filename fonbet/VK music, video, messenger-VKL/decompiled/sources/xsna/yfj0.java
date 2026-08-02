package xsna;

import android.view.View;
import com.vk.mvi.MviLazyViewContainer;
import xsna.bgj0;

/* compiled from: ShortVideoImmediateReducer.kt */
/* loaded from: classes17.dex */
public final class yfj0 {
    public final ah5 a;
    public bgj0 b;

    public yfj0(bgj0 bgj0Var, ah5 ah5Var) {
        this.a = ah5Var;
        this.b = bgj0Var;
    }

    public final void a(bgj0 bgj0Var) {
        wp50 wp50Var;
        bgj0.a aVar;
        wp50 wp50Var2;
        bgj0 bgj0Var2 = this.b;
        if (bgj0Var != bgj0Var2) {
            if ((bgj0Var instanceof bgj0.a) && (wp50Var2 = (aVar = (bgj0.a) bgj0Var).b) != null) {
                kih0 kih0Var = aVar.a;
                ah5 ah5Var = this.a;
                wp50Var2.c((MviLazyViewContainer) ah5Var.b);
                wp50Var2.d((View) ah5Var.c, new m960(kih0Var, 28), new tbe0(kih0Var, 7));
                wp50Var2.h(new n3b0(ah5Var, 12));
            } else if ((bgj0Var instanceof bgj0.b) && (bgj0Var2 instanceof bgj0.a) && (wp50Var = ((bgj0.a) bgj0Var2).b) != null) {
                wp50Var.g();
            }
        }
        this.b = bgj0Var;
    }
}
