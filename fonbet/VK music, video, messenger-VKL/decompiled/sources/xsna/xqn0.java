package xsna;

/* compiled from: RuntimeUtils.kt */
/* loaded from: classes3.dex */
public final class xqn0 {
    public final int a;
    public final int b;
    public final boolean c;

    public xqn0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqn0)) {
            return false;
        }
        xqn0 xqn0Var = (xqn0) obj;
        return this.a == xqn0Var.a && this.b == xqn0Var.b && this.c == xqn0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemMemory(availMemMb=");
        sb.append(this.a);
        sb.append(", thresholdMb=");
        sb.append(this.b);
        sb.append(", lowMemory=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
