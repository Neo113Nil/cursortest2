package defpackage;

/* loaded from: classes9.dex */
public final class pa7 extends fas {
    public final /* synthetic */ sa7 b;
    public final /* synthetic */ q66 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa7(sa7 sa7Var, q66 q66Var, uis0 uis0Var) {
        super(uis0Var);
        this.b = sa7Var;
        this.c = q66Var;
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sa7 sa7Var = this.b;
        q66 q66Var = this.c;
        synchronized (sa7Var) {
            if (q66Var.a) {
                return;
            }
            q66Var.a = true;
            super.close();
            ((lxj) this.c.b).b();
        }
    }
}
