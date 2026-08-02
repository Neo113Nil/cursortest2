package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lde90;", "Lj530;", "Lce90;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class de90 extends j530 {
    public final q a;

    public de90(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new ce90(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof de90) {
            return this.a == ((de90) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ce90 ce90Var = (ce90) e530Var;
        ce90Var.a = this.a;
        qje.P(ce90Var).D();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
