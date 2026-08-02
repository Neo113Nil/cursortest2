package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj0y;", "Lj530;", "Lk0y;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class j0y extends j530 {
    public final Object a;

    public j0y(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.j530
    public final e530 a() {
        k0y k0yVar = new k0y();
        k0yVar.a = this.a;
        return k0yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0y) && jl40.l(this.a, ((j0y) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((k0y) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("LayoutIdElement(layoutId="), this.a, ')');
    }
}
