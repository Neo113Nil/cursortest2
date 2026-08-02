package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.m;
import androidx.compose.foundation.gestures.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leam;", "Lj530;", "Landroidx/compose/foundation/gestures/m;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class eam extends j530 {
    public static final c0m B = new c0m(3);
    public final boolean A;
    public final n a;
    public final Orientation b;
    public final boolean c;
    public final zx40 w;
    public final boolean x;
    public final zls y;
    public final zls z;

    public eam(n nVar, Orientation orientation, boolean z, zx40 zx40Var, boolean z2, zls zlsVar, zls zlsVar2, boolean z3) {
        this.a = nVar;
        this.b = orientation;
        this.c = z;
        this.w = zx40Var;
        this.x = z2;
        this.y = zlsVar;
        this.z = zlsVar2;
        this.A = z3;
    }

    @Override // defpackage.j530
    public final e530 a() {
        c0m c0mVar = B;
        boolean z = this.c;
        zx40 zx40Var = this.w;
        Orientation orientation = this.b;
        m mVar = new m(c0mVar, z, zx40Var, orientation);
        mVar.O = this.a;
        mVar.P = orientation;
        mVar.Q = this.x;
        mVar.R = this.y;
        mVar.S = this.z;
        mVar.T = this.A;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eam.class != obj.getClass()) {
            return false;
        }
        eam eamVar = (eam) obj;
        return jl40.l(this.a, eamVar.a) && this.b == eamVar.b && this.c == eamVar.c && jl40.l(this.w, eamVar.w) && this.x == eamVar.x && jl40.l(this.y, eamVar.y) && jl40.l(this.z, eamVar.z) && this.A == eamVar.A;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        boolean z;
        boolean z2;
        m mVar = (m) e530Var;
        n nVar = mVar.O;
        n nVar2 = this.a;
        if (jl40.l(nVar, nVar2)) {
            z = false;
        } else {
            mVar.O = nVar2;
            z = true;
        }
        Orientation orientation = mVar.P;
        Orientation orientation2 = this.b;
        if (orientation != orientation2) {
            mVar.P = orientation2;
            z = true;
        }
        boolean z3 = mVar.T;
        boolean z4 = this.A;
        if (z3 != z4) {
            mVar.T = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        mVar.R = this.y;
        mVar.S = this.z;
        mVar.Q = this.x;
        mVar.Y0(B, this.c, this.w, orientation2, z2);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        zx40 zx40Var = this.w;
        return Boolean.hashCode(this.A) + ((this.z.hashCode() + ((this.y.hashCode() + unr0.e((e + (zx40Var != null ? zx40Var.hashCode() : 0)) * 31, 31, this.x)) * 31)) * 31);
    }
}
