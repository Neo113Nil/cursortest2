package xsna;

/* compiled from: ErrorExtraData.kt */
/* loaded from: classes8.dex */
public final class awp {
    public final boolean a;

    public awp(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awp) && this.a == ((awp) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("ErrorExtraData(isFatal=", ")", this.a);
    }
}
