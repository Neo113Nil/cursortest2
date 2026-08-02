package defpackage;

/* loaded from: classes7.dex */
public final class ie81 implements kq71 {
    public Object a;
    public Object b;
    public int c;
    public long w;
    public long x;
    public boolean y;
    public uu71 z = uu71.y;

    public final int a(int i) {
        return this.z.a(i).a(-1);
    }

    public final int b(long j) {
        uu71 uu71Var = this.z;
        long j2 = this.w;
        uu71Var.getClass();
        int i = uu71Var.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i2 = uu71Var.w;
            while (i2 < i) {
                if (uu71Var.a(i2).a == Long.MIN_VALUE || uu71Var.a(i2).a > j) {
                    pr71 a = uu71Var.a(i2);
                    if (a.b == -1 || a.a(-1) < a.b) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 < i) {
                return i2;
            }
        }
        return -1;
    }

    public final long c(int i, int i2) {
        pr71 a = this.z.a(i);
        if (a.b != -1) {
            return a.x[i2];
        }
        return -9223372036854775807L;
    }

    public final void d(Object obj, Object obj2, int i, long j, long j2, uu71 uu71Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.w = j;
        this.x = j2;
        this.z = uu71Var;
        this.y = z;
    }

    public final int e(long j) {
        int i;
        uu71 uu71Var = this.z;
        long j2 = this.w;
        int i2 = uu71Var.a - 1;
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            long j3 = uu71Var.a(i2).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            pr71 a = uu71Var.a(i2);
            if (a.b != -1) {
                while (i < a.b) {
                    int i3 = a.w[i];
                    i = (i3 == 0 || i3 == 1) ? 0 : i + 1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie81.class.equals(obj.getClass())) {
            ie81 ie81Var = (ie81) obj;
            if (rf71.o(this.a, ie81Var.a) && rf71.o(this.b, ie81Var.b) && this.c == ie81Var.c && this.w == ie81Var.w && this.x == ie81Var.x && this.y == ie81Var.y && rf71.o(this.z, ie81Var.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.w;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.x;
        return this.z.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.y ? 1 : 0)) * 31);
    }
}
