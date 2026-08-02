package androidx.compose.foundation.gestures;

import defpackage.e530;
import defpackage.f22;
import defpackage.j530;
import defpackage.jl40;
import defpackage.snr;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a;", "T", "Lj530;", "Landroidx/compose/foundation/gestures/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a<T> extends j530 {
    public final e a;
    public final Orientation b;
    public final boolean c;
    public final snr w;

    public a(e eVar, Orientation orientation, boolean z, snr snrVar) {
        this.a = eVar;
        this.b = orientation;
        this.c = z;
        this.w = snrVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        f22 f22Var = c.a;
        boolean z = this.c;
        Orientation orientation = this.b;
        d dVar = new d(f22Var, z, null, orientation);
        dVar.O = this.a;
        dVar.P = orientation;
        dVar.Q = this.w;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && jl40.l(this.w, aVar.w);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        boolean z;
        boolean z2;
        d dVar = (d) e530Var;
        snr snrVar = this.w;
        dVar.Q = snrVar;
        e eVar = dVar.O;
        e eVar2 = this.a;
        if (jl40.l(eVar, eVar2)) {
            z = false;
        } else {
            dVar.O = eVar2;
            dVar.a1(snrVar);
            z = true;
        }
        Orientation orientation = dVar.P;
        Orientation orientation2 = this.b;
        if (orientation != orientation2) {
            dVar.P = orientation2;
            z2 = true;
        } else {
            z2 = z;
        }
        dVar.Y0(dVar.w, this.c, null, orientation2, z2);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 28629151, this.c);
        snr snrVar = this.w;
        return e + (snrVar != null ? snrVar.hashCode() : 0);
    }
}
