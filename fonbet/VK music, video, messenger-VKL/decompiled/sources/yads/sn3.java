package yads;

/* loaded from: classes10.dex */
public final class sn3 implements oo {
    public final up2 a = null;

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        ff3 ff3Var;
        if (mn3Var.b == null) {
            String message = mn3Var.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            ff3Var = new ff3(message);
        } else {
            ff3Var = new ff3("Ping error");
        }
        up2 up2Var = this.a;
        if (up2Var != null) {
            up2Var.a(ff3Var);
        }
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        g92 g92Var = (g92) obj;
        up2 up2Var = this.a;
        if (up2Var != null) {
            up2Var.onSuccess(g92Var);
        }
    }
}
