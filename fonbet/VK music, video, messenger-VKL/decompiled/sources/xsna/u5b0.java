package xsna;

import java.util.List;

/* compiled from: PlayingIndicationConfig.kt */
/* loaded from: classes3.dex */
public final class u5b0 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final long g;
    public final List<pco> h;
    public final l5g i;

    public u5b0() {
        throw null;
    }

    public u5b0(float f, float f2, float f3, float f4, float f5, long j, List list, l5g l5gVar) {
        this.a = 4;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = j;
        this.h = list;
        this.i = l5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5b0)) {
            return false;
        }
        u5b0 u5b0Var = (u5b0) obj;
        return this.a == u5b0Var.a && pco.b(this.b, u5b0Var.b) && pco.b(this.c, u5b0Var.c) && pco.b(this.d, u5b0Var.d) && pco.b(this.e, u5b0Var.e) && pco.b(this.f, u5b0Var.f) && l5g.d(this.g, u5b0Var.g) && epx.f(this.h, u5b0Var.h) && epx.f(this.i, u5b0Var.i);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
        int i = l5g.l;
        int a2 = fw3.a(bh10.a(a, 31, this.g), 31, this.h);
        l5g l5gVar = this.i;
        return a2 + (l5gVar == null ? 0 : Long.hashCode(l5gVar.a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayingIndicationConfig(count=");
        sb.append(this.a);
        sb.append(", columnWidth=");
        oq.f(this.b, ", columnMaxHeight=", sb);
        oq.f(this.c, ", columnMinHeight=", sb);
        oq.f(this.d, ", columnGapWidth=", sb);
        oq.f(this.e, ", columnCornerRadius=", sb);
        oq.f(this.f, ", columnColor=", sb);
        dn.h(this.g, ", initialHeights=", sb);
        sb.append(this.h);
        sb.append(", overlay=");
        sb.append(this.i);
        sb.append(')');
        return sb.toString();
    }
}
