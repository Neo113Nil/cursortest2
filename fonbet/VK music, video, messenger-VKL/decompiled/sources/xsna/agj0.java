package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.bgj0;

/* compiled from: ShortVideoItemImmediateFeature.kt */
/* loaded from: classes17.dex */
public final class agj0 {
    public final yfj0 a;

    public agj0(yfj0 yfj0Var) {
        this.a = yfj0Var;
    }

    public final void a(kih0 kih0Var, wp50 wp50Var) {
        yfj0 yfj0Var = this.a;
        bgj0 bgj0Var = yfj0Var.b;
        if (bgj0Var instanceof bgj0.b) {
            yfj0Var.a(new bgj0.a(kih0Var, wp50Var));
        } else {
            if (!(bgj0Var instanceof bgj0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (epx.f(((bgj0.a) bgj0Var).a.A().r1(), kih0Var.A().r1())) {
                return;
            }
            yfj0Var.a(new bgj0.a(kih0Var, wp50Var));
        }
    }
}
