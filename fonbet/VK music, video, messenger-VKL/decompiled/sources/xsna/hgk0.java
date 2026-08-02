package xsna;

/* compiled from: ErrorType.kt */
/* loaded from: classes8.dex */
public final class hgk0 implements axp {
    public final boolean b;

    public hgk0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgk0) && this.b == ((hgk0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("InvalidHttpCodeError(canReloadUrl=", ")", this.b);
    }
}
