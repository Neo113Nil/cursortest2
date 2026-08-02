package xsna;

/* compiled from: HostQueueConfig.kt */
/* loaded from: classes11.dex */
public final class ggv {
    public static final a e = new a();
    public static final ggv f = new ggv(0);
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;

    /* compiled from: HostQueueConfig.kt */
    public static final class a {
    }

    public ggv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggv)) {
            return false;
        }
        ggv ggvVar = (ggv) obj;
        return this.a == ggvVar.a && this.b == ggvVar.b && this.c == ggvVar.c && this.d == ggvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostQueueConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", maxSize=");
        sb.append(this.b);
        sb.append(", perHostSize=");
        sb.append(this.c);
        sb.append(", disableTMRI=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ ggv(int i) {
        this(64, 5, false, false);
    }

    public ggv(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }
}
