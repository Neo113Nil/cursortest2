package xsna;

/* compiled from: VideoInfoDelegate.kt */
@vby
/* loaded from: classes2.dex */
public final class kww {
    public final us2 a;

    public final boolean equals(Object obj) {
        if (obj instanceof kww) {
            return epx.f(this.a, ((kww) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InfoState(annotatedText=" + ((Object) this.a) + ')';
    }
}
