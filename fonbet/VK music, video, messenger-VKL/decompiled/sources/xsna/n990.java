package xsna;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class n990 extends z6w0 {
    public final Throwable b;

    public n990(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n990) && epx.f(this.b, ((n990) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("PageLoadingError(throwable="), this.b, ')');
    }
}
