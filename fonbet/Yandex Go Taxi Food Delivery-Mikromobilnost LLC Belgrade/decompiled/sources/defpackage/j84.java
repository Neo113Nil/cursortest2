package defpackage;

/* loaded from: classes10.dex */
public final class j84 {
    public final Throwable a;

    public j84(Throwable th) {
        if (th != null) {
            this.a = th;
        } else {
            ny61.t("Null error");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j84) {
            return this.a.equals(((j84) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
