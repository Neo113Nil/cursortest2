package xsna;

/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class kxw {
    public final van a;
    public final ny7 b;

    public kxw(van vanVar, ny7 ny7Var) {
        this.a = vanVar;
        this.b = ny7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxw)) {
            return false;
        }
        kxw kxwVar = (kxw) obj;
        return this.a.equals(kxwVar.a) && this.b.equals(kxwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InitCompletedArgs(diskCache=" + this.a + ", onResult=" + this.b + ")";
    }
}
