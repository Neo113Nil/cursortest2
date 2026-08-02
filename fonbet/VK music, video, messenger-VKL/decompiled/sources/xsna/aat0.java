package xsna;

/* compiled from: VideoPushNewVideoConfig.kt */
/* loaded from: classes11.dex */
public final class aat0 {
    public static final a d = new a();
    public static final aat0 e = new aat0(true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* compiled from: VideoPushNewVideoConfig.kt */
    public static final class a {
    }

    public aat0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aat0)) {
            return false;
        }
        aat0 aat0Var = (aat0) obj;
        return this.a == aat0Var.a && this.b == aat0Var.b && this.c == aat0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPushNewVideoConfig(notInterestedBg=");
        sb.append(this.a);
        sb.append(", watchLaterBg=");
        sb.append(this.b);
        sb.append(", downloadBg=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
