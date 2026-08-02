package xsna;

/* compiled from: ClipVideoPreview.kt */
@vby
/* loaded from: classes16.dex */
public final class jfd implements rzt0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof jfd) {
            return epx.f(this.a, ((jfd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "RequestPreviewImage(url=", this.a);
    }
}
