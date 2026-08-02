package xsna;

/* compiled from: PlaybackErrorStat.kt */
/* loaded from: classes3.dex */
public final class awa0 implements wnv {
    public final Throwable a;

    public awa0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awa0) && epx.f(this.a, ((awa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("PlaybackErrorStat(exception="), this.a, ')');
    }
}
