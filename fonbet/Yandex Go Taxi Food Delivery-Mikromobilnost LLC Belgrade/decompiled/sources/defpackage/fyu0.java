package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfyu0;", "Lj530;", "Lgyu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class fyu0 extends j530 {
    public final sls a;

    public fyu0(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new gyu0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fyu0) {
            return this.a == ((fyu0) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((gyu0) e530Var).c = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
