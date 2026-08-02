package xsna;

import androidx.compose.foundation.gestures.Orientation;
import xsna.fho;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public final class dho extends d730<androidx.compose.foundation.gestures.j> {
    public static final sm0 i = new sm0(17);
    public final gho a;
    public final Orientation b;
    public final boolean c;
    public final sg50 d;
    public final boolean e;
    public final yzs<yvj, ov70, spj<? super s3q0>, Object> f;
    public final yzs<yvj, Float, spj<? super s3q0>, Object> g;
    public final boolean h;

    public dho(gho ghoVar, Orientation orientation, boolean z, sg50 sg50Var, boolean z2, fho.a aVar, yzs yzsVar, boolean z3) {
        this.a = ghoVar;
        this.b = orientation;
        this.c = z;
        this.d = sg50Var;
        this.e = z2;
        this.f = aVar;
        this.g = yzsVar;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dho.class != obj.getClass()) {
            return false;
        }
        dho dhoVar = (dho) obj;
        return epx.f(this.a, dhoVar.a) && this.b == dhoVar.b && this.c == dhoVar.c && epx.f(this.d, dhoVar.d) && this.e == dhoVar.e && epx.f(this.f, dhoVar.f) && epx.f(this.g, dhoVar.g) && this.h == dhoVar.h;
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        sg50 sg50Var = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b((b + (sg50Var != null ? sg50Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }

    @Override // xsna.d730
    public final androidx.compose.foundation.gestures.j r() {
        sm0 sm0Var = i;
        boolean z = this.c;
        sg50 sg50Var = this.d;
        Orientation orientation = this.b;
        androidx.compose.foundation.gestures.j jVar = new androidx.compose.foundation.gestures.j(sm0Var, z, sg50Var, orientation);
        jVar.K = this.a;
        jVar.L = orientation;
        jVar.M = this.e;
        jVar.N = this.f;
        jVar.O = this.g;
        jVar.P = this.h;
        return jVar;
    }

    @Override // xsna.d730
    public final void s(androidx.compose.foundation.gestures.j jVar) {
        boolean z;
        boolean z2;
        androidx.compose.foundation.gestures.j jVar2 = jVar;
        gho ghoVar = jVar2.K;
        gho ghoVar2 = this.a;
        if (epx.f(ghoVar, ghoVar2)) {
            z = false;
        } else {
            jVar2.K = ghoVar2;
            z = true;
        }
        Orientation orientation = jVar2.L;
        Orientation orientation2 = this.b;
        if (orientation != orientation2) {
            jVar2.L = orientation2;
            z = true;
        }
        boolean z3 = jVar2.P;
        boolean z4 = this.h;
        if (z3 != z4) {
            jVar2.P = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        jVar2.N = this.f;
        jVar2.O = this.g;
        jVar2.M = this.e;
        jVar2.C2(i, this.c, this.d, orientation2, z2);
    }
}
