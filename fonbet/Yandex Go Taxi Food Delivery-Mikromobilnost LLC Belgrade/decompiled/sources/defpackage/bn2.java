package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class bn2 implements x08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bn2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x08
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ct21) obj).close();
                break;
            default:
                aj20 aj20Var = (aj20) obj;
                xo3 xo3Var = aj20Var.f;
                if (xo3Var != null) {
                    xo3Var.cancel();
                }
                aj20Var.f = null;
                break;
        }
    }
}
