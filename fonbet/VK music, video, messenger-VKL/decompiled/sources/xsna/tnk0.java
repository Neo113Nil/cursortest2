package xsna;

/* compiled from: SseInitConfig.kt */
/* loaded from: classes.dex */
public final class tnk0 {
    public final boolean a;

    public tnk0() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnk0) && this.a == ((tnk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SseInitConfig(gzipEnabled="), this.a, ')');
    }

    public tnk0(boolean z) {
        this.a = z;
    }
}
