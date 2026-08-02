package xsna;

/* compiled from: VideoPlayerForMusicConfig.kt */
/* loaded from: classes11.dex */
public final class d4t0 {
    public static final a c = new a();
    public static final d4t0 d = new d4t0(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: VideoPlayerForMusicConfig.kt */
    public static final class a {
    }

    public d4t0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4t0)) {
            return false;
        }
        d4t0 d4t0Var = (d4t0) obj;
        return this.a == d4t0Var.a && this.b == d4t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayerForMusicConfig(isAvailableForSubscription=");
        sb.append(this.a);
        sb.append(", extendedMigrationLogs=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
