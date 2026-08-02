package defpackage;

import androidx.compose.material3.SnackbarResult;

/* loaded from: classes10.dex */
public final /* synthetic */ class p0t0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0t0 b;

    public /* synthetic */ p0t0(o0t0 o0t0Var, int i) {
        this.a = i;
        this.b = o0t0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        o0t0 o0t0Var = this.b;
        switch (i) {
            case 0:
                j18 j18Var = ((r0t0) o0t0Var).b;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(SnackbarResult.Dismissed);
                }
                return Boolean.TRUE;
            default:
                j18 j18Var2 = ((r0t0) o0t0Var).b;
                if (j18Var2.t() instanceof mf60) {
                    j18Var2.resumeWith(SnackbarResult.ActionPerformed);
                }
                return zy11.a;
        }
    }
}
