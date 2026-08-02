package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PointerEvent.kt */
/* loaded from: classes11.dex */
public final class xlb0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final List<w7v> m;
    public final long n;
    public boolean o;
    public boolean p;
    public xlb0 q;

    public xlb0() {
        throw null;
    }

    public xlb0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        xlb0 xlb0Var = this.q;
        if (xlb0Var == null) {
            this.o = true;
            this.p = true;
        } else if (xlb0Var != null) {
            xlb0Var.a();
        }
    }

    public final List<w7v> b() {
        List<w7v> list = this.m;
        return list == null ? EmptyList.b : list;
    }

    public final boolean c() {
        xlb0 xlb0Var = this.q;
        return xlb0Var != null ? xlb0Var.c() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) wlb0.u(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) ov70.h(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) ov70.h(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ((Object) kmb0.a(this.i)) + ", historical=" + b() + ", scrollDelta=" + ((Object) ov70.h(this.j)) + ", scaleFactor=" + this.k + ", panOffset=" + ((Object) ov70.h(this.l)) + ')';
    }

    public xlb0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = list;
        this.n = j8;
    }
}
