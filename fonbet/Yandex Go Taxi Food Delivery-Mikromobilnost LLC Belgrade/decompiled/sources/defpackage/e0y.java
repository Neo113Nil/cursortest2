package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le0y;", "Lj530;", "Lt0y;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class e0y extends j530 {
    public final zls a;

    public e0y(zls zlsVar) {
        this.a = zlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        t0y t0yVar = new t0y();
        t0yVar.a = this.a;
        return t0yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0y) {
            return this.a == ((e0y) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((t0y) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
