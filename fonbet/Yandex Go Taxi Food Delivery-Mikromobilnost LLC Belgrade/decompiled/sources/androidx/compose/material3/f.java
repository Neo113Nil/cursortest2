package androidx.compose.material3;

import defpackage.e530;
import defpackage.ehr0;
import defpackage.g8e;
import defpackage.h8w;
import defpackage.imy0;
import defpackage.j530;
import defpackage.jl40;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.unr0;
import defpackage.y7m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/f;", "Lj530;", "Landroidx/compose/material3/g;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f extends j530 {
    public final boolean a;
    public final boolean b;
    public final h8w c;
    public final imy0 w;
    public final ehr0 x;
    public final float y = 2.0f;
    public final float z = 1.0f;

    public f(boolean z, boolean z2, h8w h8wVar, imy0 imy0Var, ehr0 ehr0Var) {
        this.a = z;
        this.b = z2;
        this.c = h8wVar;
        this.w = imy0Var;
        this.x = ehr0Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new g(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && jl40.l(this.c, fVar.c) && jl40.l(this.w, fVar.w) && jl40.l(this.x, fVar.x) && y7m.b(this.y, fVar.y) && y7m.b(this.z, fVar.z);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        boolean z;
        g gVar = (g) e530Var;
        boolean z2 = gVar.c;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            gVar.c = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = gVar.w;
        boolean z6 = this.b;
        if (z5 != z6) {
            gVar.w = z6;
            z = true;
        }
        h8w h8wVar = gVar.x;
        h8w h8wVar2 = this.c;
        if (h8wVar != h8wVar2) {
            gVar.x = h8wVar2;
            pzt0 pzt0Var = gVar.B;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            gVar.B = tje.N(gVar.getCoroutineScope(), null, null, new IndicatorLineNode$update$1(gVar, null), 3);
        }
        imy0 imy0Var = gVar.C;
        imy0 imy0Var2 = this.w;
        if (!jl40.l(imy0Var, imy0Var2)) {
            gVar.C = imy0Var2;
            z = true;
        }
        ehr0 ehr0Var = gVar.E;
        ehr0 ehr0Var2 = this.x;
        if (!jl40.l(ehr0Var, ehr0Var2)) {
            if (!jl40.l(gVar.E, ehr0Var2)) {
                gVar.E = ehr0Var2;
                gVar.G.E0();
            }
            z = true;
        }
        float f = gVar.y;
        float f2 = this.y;
        if (!y7m.b(f, f2)) {
            gVar.y = f2;
            z = true;
        }
        float f3 = gVar.z;
        float f4 = this.z;
        if (y7m.b(f3, f4)) {
            z4 = z;
        } else {
            gVar.z = f4;
        }
        if (z4) {
            gVar.I0();
        }
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        imy0 imy0Var = this.w;
        int hashCode2 = (hashCode + (imy0Var == null ? 0 : imy0Var.hashCode())) * 31;
        ehr0 ehr0Var = this.x;
        return Float.hashCode(this.z) + g8e.c(this.y, (hashCode2 + (ehr0Var != null ? ehr0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=" + this.b + ", interactionSource=" + this.c + ", colors=" + this.w + ", textFieldShape=" + this.x + ", focusedIndicatorLineThickness=" + ((Object) y7m.c(this.y)) + ", unfocusedIndicatorLineThickness=" + ((Object) y7m.c(this.z)) + ')';
    }
}
