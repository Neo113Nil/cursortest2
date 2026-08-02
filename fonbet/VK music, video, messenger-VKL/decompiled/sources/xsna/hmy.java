package xsna;

import java.util.ArrayList;

/* compiled from: Latch.kt */
/* loaded from: classes11.dex */
public final class hmy implements izs<Throwable, s3q0> {
    public final /* synthetic */ imy b;
    public final /* synthetic */ lq9 c;

    public hmy(imy imyVar, lq9 lq9Var) {
        this.b = imyVar;
        this.c = lq9Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        imy imyVar = this.b;
        Object obj = imyVar.b;
        lq9 lq9Var = this.c;
        synchronized (obj) {
            ((ArrayList) imyVar.c).remove(lq9Var);
        }
        return s3q0.a;
    }
}
