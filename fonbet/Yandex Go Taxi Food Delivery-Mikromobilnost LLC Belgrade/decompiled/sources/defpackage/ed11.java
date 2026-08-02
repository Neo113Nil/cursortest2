package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Led11;", "Lj530;", "Lfd11;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class ed11 extends j530 {
    public final c6y a;

    public ed11(c6y c6yVar) {
        this.a = c6yVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new fd11(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed11) && jl40.l(this.a, ((ed11) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((fd11) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
