package xsna;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public final class ngd0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public ngd0(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngd0)) {
            return false;
        }
        ngd0 ngd0Var = (ngd0) obj;
        return epx.f(this.a, ngd0Var.a) && this.b == ngd0Var.b && this.c == ngd0Var.c && this.d == ngd0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
