package xsna;

/* compiled from: MarketLinkedContentPatch.kt */
/* loaded from: classes18.dex */
public final class w610 implements u610 {
    public final Throwable a;

    public w610(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w610) && epx.f(this.a, ((w610) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("ErrorLoading(error="), this.a, ')');
    }
}
