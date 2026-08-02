package androidx.compose.ui.draw;

import androidx.compose.ui.node.s;
import defpackage.e530;
import defpackage.ehr0;
import defpackage.j530;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.y7m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/d;", "Lj530;", "Landroidx/compose/ui/graphics/b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d extends j530 {
    public final float a;
    public final ehr0 b;
    public final boolean c;
    public final long w;
    public final long x;

    public d(float f, ehr0 ehr0Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = ehr0Var;
        this.c = z;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new androidx.compose.ui.graphics.b(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return y7m.b(this.a, dVar.a) && jl40.l(this.b, dVar.b) && this.c == dVar.c && ldc.c(this.w, dVar.w) && ldc.c(this.x, dVar.x);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        s sVar;
        androidx.compose.ui.graphics.b bVar = (androidx.compose.ui.graphics.b) e530Var;
        ShadowGraphicsLayerElement$createBlock$1 shadowGraphicsLayerElement$createBlock$1 = new ShadowGraphicsLayerElement$createBlock$1(this);
        bVar.a = shadowGraphicsLayerElement$createBlock$1;
        if (bVar.getNode().isAttached() && (sVar = qje.N(bVar, 2).J) != null) {
            sVar.A1(shadowGraphicsLayerElement$createBlock$1, true);
        }
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = ldc.n;
        return Long.hashCode(this.x) + qv10.c(e, 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) y7m.c(this.a));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        xvz.w(this.w, ", spotColor=", sb);
        sb.append((Object) ldc.i(this.x));
        sb.append(')');
        return sb.toString();
    }
}
