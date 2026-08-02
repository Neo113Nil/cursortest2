package xsna;

import java.util.List;

/* compiled from: PlayingIndicationViewState.kt */
/* loaded from: classes16.dex */
public final class t6b0 {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long h;
    public final List<pco> i;
    public final l5g j;

    public t6b0() {
        throw null;
    }

    public t6b0(boolean z, float f, float f2, float f3, float f4, float f5, long j, List list, l5g l5gVar) {
        this.a = z;
        this.b = 4;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = j;
        this.i = list;
        this.j = l5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6b0)) {
            return false;
        }
        t6b0 t6b0Var = (t6b0) obj;
        return this.a == t6b0Var.a && this.b == t6b0Var.b && pco.b(this.c, t6b0Var.c) && pco.b(this.d, t6b0Var.d) && pco.b(this.e, t6b0Var.e) && pco.b(this.f, t6b0Var.f) && pco.b(this.g, t6b0Var.g) && l5g.d(this.h, t6b0Var.h) && epx.f(this.i, t6b0Var.i) && epx.f(this.j, t6b0Var.j);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
        int i = l5g.l;
        int a2 = fw3.a(bh10.a(a, 31, this.h), 31, this.i);
        l5g l5gVar = this.j;
        return a2 + (l5gVar == null ? 0 : Long.hashCode(l5gVar.a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayingIndicationViewState(isAnimating=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", columnWidth=");
        oq.f(this.c, ", columnMaxHeight=", sb);
        oq.f(this.d, ", columnMinHeight=", sb);
        oq.f(this.e, ", columnGapWidth=", sb);
        oq.f(this.f, ", columnCornerRadius=", sb);
        oq.f(this.g, ", columnColor=", sb);
        dn.h(this.h, ", initialHeights=", sb);
        sb.append(this.i);
        sb.append(", overlay=");
        sb.append(this.j);
        sb.append(')');
        return sb.toString();
    }
}
