package xsna;

/* compiled from: LogcatSettings.kt */
/* loaded from: classes.dex */
public final class e100 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public e100() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e100)) {
            return false;
        }
        e100 e100Var = (e100) obj;
        return this.a == e100Var.a && this.b == e100Var.b && this.c == e100Var.c && this.d == e100Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogcatSettings(waitTime=");
        sb.append(this.a);
        sb.append(", bufferLines=");
        sb.append(this.b);
        sb.append(", bufferBytes=");
        sb.append(this.c);
        sb.append(", maxFileSize=");
        return vu5.b(sb, this.d, ')');
    }

    public e100(int i) {
        this.a = 4000;
        this.b = 5000;
        this.c = 131072;
        this.d = 2097152;
    }
}
