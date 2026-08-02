package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import xsna.xlk0;

/* loaded from: classes10.dex */
public abstract class to implements pp0 {
    public final l83 a;
    public final int b;
    public final int[] c;
    public final nx0[] d;
    public final long[] e;
    public int f;

    public to(l83 l83Var, int[] iArr) {
        int i = 0;
        ni.b(iArr.length > 0);
        this.a = (l83) ni.a(l83Var);
        int length = iArr.length;
        this.b = length;
        this.d = new nx0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = l83Var.a(iArr[i2]);
        }
        Arrays.sort(this.d, new xlk0(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = l83Var.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // yads.pp0
    public void a() {
    }

    @Override // yads.pp0
    public final int b(int i) {
        return this.c[i];
    }

    @Override // yads.pp0
    public final nx0 c() {
        return this.d[e()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            to toVar = (to) obj;
            if (this.a == toVar.a && Arrays.equals(this.c, toVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.pp0
    public final int f() {
        return this.c.length;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // yads.pp0
    public void a(float f) {
    }

    @Override // yads.pp0
    public final l83 b() {
        return this.a;
    }

    @Override // yads.pp0
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // yads.pp0
    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !b) {
            b = (i2 == i || b(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = mc3.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // yads.pp0
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    @Override // yads.pp0
    public int a(long j, List list) {
        return list.size();
    }

    @Override // yads.pp0
    public final nx0 a(int i) {
        return this.d[i];
    }

    @Override // yads.pp0
    public final int a(nx0 nx0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == nx0Var) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(nx0 nx0Var, nx0 nx0Var2) {
        return nx0Var2.i - nx0Var.i;
    }

    @Override // yads.pp0
    public void disable() {
    }
}
