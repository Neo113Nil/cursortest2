package xsna;

import java.util.ArrayList;

/* compiled from: InternalPointerInput.kt */
/* loaded from: classes11.dex */
public final class zlb0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public zlb0() {
        throw null;
    }

    public zlb0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb0)) {
            return false;
        }
        zlb0 zlb0Var = (zlb0) obj;
        return wlb0.g(this.a, zlb0Var.a) && this.b == zlb0Var.b && ov70.c(this.c, zlb0Var.c) && ov70.c(this.d, zlb0Var.d) && this.e == zlb0Var.e && Float.compare(this.f, zlb0Var.f) == 0 && this.g == zlb0Var.g && this.h == zlb0Var.h && epx.f(this.i, zlb0Var.i) && ov70.c(this.j, zlb0Var.j) && Float.compare(this.k, zlb0Var.k) == 0 && ov70.c(this.l, zlb0Var.l) && ov70.c(this.m, zlb0Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + bh10.a(io.reactivex.rxjava3.subjects.b.a(this.k, bh10.a(qr.a(this.i, qoy.b(shy.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, qoy.b(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) wlb0.u(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) ov70.h(this.c)) + ", position=" + ((Object) ov70.h(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) kmb0.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) ov70.h(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) ov70.h(this.l)) + ", originalEventPosition=" + ((Object) ov70.h(this.m)) + ')';
    }
}
