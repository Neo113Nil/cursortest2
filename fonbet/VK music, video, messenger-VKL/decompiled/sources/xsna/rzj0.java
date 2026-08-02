package xsna;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class rzj0 {
    public final izs<Long, s3q0> a;

    public rzj0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzj0) && epx.f(this.a, ((rzj0) obj).a);
    }

    public final int hashCode() {
        izs<Long, s3q0> izsVar = this.a;
        if (izsVar == null) {
            return 0;
        }
        return izsVar.hashCode();
    }

    public final String toString() {
        return up.c(new StringBuilder("SkippableState(onSeekRequested="), this.a, ')');
    }

    public rzj0(gy gyVar) {
        this.a = gyVar;
    }
}
