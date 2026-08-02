package xsna;

import java.time.temporal.Temporal;
import xsna.zef0;

/* compiled from: ResultAggregator.kt */
/* loaded from: classes12.dex */
public final class sdg0<T extends zef0, U extends Temporal> implements qb1<T, androidx.health.connect.client.aggregate.c> {
    public final cvo0<U> a;
    public final jb1<T> b;

    public sdg0(cvo0<U> cvo0Var, jb1<T> jb1Var) {
        this.a = cvo0Var;
        this.b = jb1Var;
    }

    @Override // xsna.qb1
    public final void a(T t) {
        if (tb1.a(t, this.a)) {
            this.b.b(t);
        }
    }

    @Override // xsna.qb1
    public final androidx.health.connect.client.aggregate.c getResult() {
        return this.b.a();
    }
}
