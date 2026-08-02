package androidx.compose.foundation.gestures;

import defpackage.e530;
import defpackage.j530;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wkp0;
import defpackage.zx40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t;", "Lj530;", "Landroidx/compose/foundation/gestures/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class t extends j530 {
    public final wkp0 a;
    public final Orientation b;
    public final boolean c;
    public final boolean w;
    public final zx40 x;

    public t(wkp0 wkp0Var, Orientation orientation, boolean z, boolean z2, zx40 zx40Var) {
        this.a = wkp0Var;
        this.b = orientation;
        this.c = z;
        this.w = z2;
        this.x = zx40Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new x(null, null, this.x, this.a, null, this.b, this.c, this.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jl40.l(this.a, tVar.a) && this.b == tVar.b && this.c == tVar.c && this.w == tVar.w && jl40.l(this.x, tVar.x);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((x) e530Var).Z0(null, null, this.x, this.a, null, this.b, this.c, this.w);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.w);
        zx40 zx40Var = this.x;
        return (e + (zx40Var != null ? zx40Var.hashCode() : 0)) * 31;
    }
}
