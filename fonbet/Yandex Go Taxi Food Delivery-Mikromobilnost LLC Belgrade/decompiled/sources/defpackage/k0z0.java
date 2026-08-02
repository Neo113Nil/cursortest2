package defpackage;

import androidx.compose.material3.z;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk0z0;", "Lj530;", "Landroidx/compose/material3/z;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class k0z0 extends j530 {
    public final h8w a;
    public final boolean b;
    public final twt0 c;

    public k0z0(h8w h8wVar, boolean z, twt0 twt0Var) {
        this.a = h8wVar;
        this.b = z;
        this.c = twt0Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        z zVar = new z();
        zVar.a = this.a;
        zVar.b = this.b;
        zVar.c = this.c;
        zVar.z = Float.NaN;
        zVar.A = Float.NaN;
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0z0)) {
            return false;
        }
        k0z0 k0z0Var = (k0z0) obj;
        return jl40.l(this.a, k0z0Var.a) && this.b == k0z0Var.b && jl40.l(this.c, k0z0Var.c);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        z zVar = (z) e530Var;
        zVar.a = this.a;
        boolean z = zVar.b;
        boolean z2 = this.b;
        if (z != z2) {
            qje.P(zVar).C();
        }
        zVar.b = z2;
        zVar.c = this.c;
        if (zVar.y == null && !Float.isNaN(zVar.A)) {
            zVar.y = id00.a(zVar.A);
        }
        if (zVar.x != null || Float.isNaN(zVar.z)) {
            return;
        }
        zVar.x = id00.a(zVar.z);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
