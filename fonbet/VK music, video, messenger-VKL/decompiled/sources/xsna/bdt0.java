package xsna;

/* compiled from: VideoResetOnNetworkChangeConfig.kt */
/* loaded from: classes11.dex */
public final class bdt0 {
    public static final a b = new a();
    public static final bdt0 c = new bdt0(true);
    public final boolean a;

    /* compiled from: VideoResetOnNetworkChangeConfig.kt */
    public static final class a {
    }

    public bdt0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdt0) && this.a == ((bdt0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VideoResetOnNetworkChangeConfig(resetOnNetworkChange="), this.a, ')');
    }
}
