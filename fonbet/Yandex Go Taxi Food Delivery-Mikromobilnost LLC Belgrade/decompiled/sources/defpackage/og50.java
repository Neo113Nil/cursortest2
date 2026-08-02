package defpackage;

import java.util.Set;

/* loaded from: classes12.dex */
public final class og50 implements v7p {
    public final /* synthetic */ int a;
    public final y2r0 b;

    public /* synthetic */ og50(y2r0 y2r0Var, int i) {
        this.a = i;
        this.b = y2r0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.b;
        switch (i) {
            case 0:
                return new ng50((Set) y2r0Var.get());
            case 1:
                return new udp0((Set) y2r0Var.get());
            default:
                return new qft0((Set) y2r0Var.get());
        }
    }
}
