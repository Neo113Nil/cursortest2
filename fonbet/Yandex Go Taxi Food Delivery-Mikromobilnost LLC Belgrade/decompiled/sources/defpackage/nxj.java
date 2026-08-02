package defpackage;

/* loaded from: classes4.dex */
public final class nxj extends gas {
    public boolean b;
    public final /* synthetic */ dyj c;
    public final /* synthetic */ rxj w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxj(y9t0 y9t0Var, dyj dyjVar, rxj rxjVar) {
        super(y9t0Var);
        this.c = dyjVar;
        this.w = rxjVar;
    }

    @Override // defpackage.gas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        dyj dyjVar = this.c;
        rxj rxjVar = this.w;
        synchronized (dyjVar) {
            int i = rxjVar.h - 1;
            rxjVar.h = i;
            if (i == 0 && rxjVar.f) {
                dyjVar.G(rxjVar);
            }
        }
    }
}
