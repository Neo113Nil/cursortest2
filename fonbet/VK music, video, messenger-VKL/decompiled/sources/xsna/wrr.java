package xsna;

/* compiled from: FloatingButton.kt */
/* loaded from: classes17.dex */
public final class wrr {
    public final String a;
    public final xgq b;

    public wrr(String str, xgq xgqVar) {
        this.a = str;
        this.b = xgqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrr)) {
            return false;
        }
        wrr wrrVar = (wrr) obj;
        return epx.f(this.a, wrrVar.a) && epx.f(this.b, wrrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FloatingButton(showOnItemUniqueKey=" + this.a + ", data=" + this.b + ')';
    }
}
