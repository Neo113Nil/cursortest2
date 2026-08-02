package xsna;

/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class lyw {
    public final Exception a;
    public final ny7 b;

    public lyw(Exception exc, ny7 ny7Var) {
        this.a = exc;
        this.b = ny7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyw)) {
            return false;
        }
        lyw lywVar = (lyw) obj;
        return this.a.equals(lywVar.a) && this.b.equals(lywVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InitFailedArgs(exception=" + this.a + ", onResult=" + this.b + ")";
    }
}
