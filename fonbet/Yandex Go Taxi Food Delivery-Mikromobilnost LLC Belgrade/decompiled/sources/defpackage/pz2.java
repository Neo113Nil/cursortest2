package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lpz2;", "Lj530;", "Lmqe;", "Lenq0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pz2 extends j530 implements enq0 {
    public final boolean a;
    public final tls b;

    public pz2(tls tlsVar, boolean z) {
        this.a = z;
        this.b = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new mqe(this.b, this.a, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz2)) {
            return false;
        }
        pz2 pz2Var = (pz2) obj;
        return this.a == pz2Var.a && this.b == pz2Var.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        mqe mqeVar = (mqe) e530Var;
        mqeVar.a = this.a;
        mqeVar.c = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.enq0
    public final cnq0 l() {
        cnq0 cnq0Var = new cnq0();
        cnq0Var.c = this.a;
        this.b.invoke(cnq0Var);
        return cnq0Var;
    }
}
