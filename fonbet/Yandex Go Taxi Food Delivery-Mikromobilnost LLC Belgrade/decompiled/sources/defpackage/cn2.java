package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class cn2 implements e1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ x08 b;

    public /* synthetic */ cn2(x08 x08Var, int i) {
        this.a = i;
        this.b = x08Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        x08 x08Var = this.b;
        switch (i) {
            case 0:
                x08Var.cancel();
                break;
            case 1:
                x08Var.cancel();
                break;
            default:
                x08Var.cancel();
                break;
        }
    }
}
