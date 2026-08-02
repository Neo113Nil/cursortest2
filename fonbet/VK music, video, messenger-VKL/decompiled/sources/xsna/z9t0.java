package xsna;

/* compiled from: VideoPushNewLiveConfig.kt */
/* loaded from: classes11.dex */
public final class z9t0 {
    public static final a c = new a();
    public static final z9t0 d = new z9t0(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: VideoPushNewLiveConfig.kt */
    public static final class a {
    }

    public z9t0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9t0)) {
            return false;
        }
        z9t0 z9t0Var = (z9t0) obj;
        return this.a == z9t0Var.a && this.b == z9t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPushNewLiveConfig(handleNotInterestedInBackground=");
        sb.append(this.a);
        sb.append(", handleWatchLaterInBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
