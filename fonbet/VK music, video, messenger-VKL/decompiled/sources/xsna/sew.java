package xsna;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class sew {
    public final b5w a;
    public final x7w b;

    public sew(b5w b5wVar, x7w x7wVar) {
        this.a = b5wVar;
        this.b = x7wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sew)) {
            return false;
        }
        sew sewVar = (sew) obj;
        return epx.f(this.a, sewVar.a) && epx.f(this.b, sewVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImWeightStorageModel(composedId=" + this.a + ", weight=" + this.b + ')';
    }
}
