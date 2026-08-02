package defpackage;

import androidx.compose.foundation.layout.Direction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcb51;", "Lj530;", "Ldb51;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class cb51 extends j530 {
    public final Direction a;
    public final boolean b;
    public final wls c;
    public final Object w;

    public cb51(Direction direction, boolean z, wls wlsVar, Object obj) {
        this.a = direction;
        this.b = z;
        this.c = wlsVar;
        this.w = obj;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new db51(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cb51.class != obj.getClass()) {
            return false;
        }
        cb51 cb51Var = (cb51) obj;
        return this.a == cb51Var.a && this.b == cb51Var.b && jl40.l(this.w, cb51Var.w);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        db51 db51Var = (db51) e530Var;
        db51Var.F0(this.a);
        db51Var.G0(this.b);
        db51Var.E0(this.c);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }
}
