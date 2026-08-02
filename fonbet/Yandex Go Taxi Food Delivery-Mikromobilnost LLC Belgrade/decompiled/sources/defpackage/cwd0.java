package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class cwd0 {
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

    public cwd0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
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

    public final boolean a() {
        return this.e;
    }

    public final List b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.m;
    }

    public final long e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwd0)) {
            return false;
        }
        cwd0 cwd0Var = (cwd0) obj;
        return ey91.e(this.a, cwd0Var.a) && this.b == cwd0Var.b && wu60.c(this.c, cwd0Var.c) && wu60.c(this.d, cwd0Var.d) && this.e == cwd0Var.e && Float.compare(this.f, cwd0Var.f) == 0 && this.g == cwd0Var.g && this.h == cwd0Var.h && this.i.equals(cwd0Var.i) && wu60.c(this.j, cwd0Var.j) && Float.compare(this.k, cwd0Var.k) == 0 && wu60.c(this.l, cwd0Var.l) && wu60.c(this.m, cwd0Var.m);
    }

    public final long f() {
        return this.d;
    }

    public final long g() {
        return this.c;
    }

    public final float h() {
        return this.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + qv10.c(g8e.c(this.k, qv10.c(ly3.b(unr0.e(oyr.b(this.g, g8e.c(this.f, unr0.e(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l);
    }

    public final float i() {
        return this.k;
    }

    public final long j() {
        return this.j;
    }

    public final int k() {
        return this.g;
    }

    public final long l() {
        return this.b;
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) ey91.g(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) wu60.h(this.c)) + ", position=" + ((Object) wu60.h(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) jwd0.b(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) wu60.h(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) wu60.h(this.l)) + ", originalEventPosition=" + ((Object) wu60.h(this.m)) + ')';
    }
}
