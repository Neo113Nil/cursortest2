package xsna;

/* compiled from: ReefAttributes.kt */
/* loaded from: classes5.dex */
public final class xmf0 {
    public final boolean a;

    public xmf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmf0) && this.a == ((xmf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("ReefAttributes(isNetworkObserverEnabled=", ")", this.a);
    }
}
