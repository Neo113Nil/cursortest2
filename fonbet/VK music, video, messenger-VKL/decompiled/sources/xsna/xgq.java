package xsna;

/* compiled from: FBData.kt */
/* loaded from: classes17.dex */
public final class xgq {
    public final String a;
    public final ygq b;
    public final zgq c;

    public xgq(String str, ygq ygqVar, zgq zgqVar) {
        this.a = str;
        this.b = ygqVar;
        this.c = zgqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgq)) {
            return false;
        }
        xgq xgqVar = (xgq) obj;
        return epx.f(this.a, xgqVar.a) && epx.f(this.b, xgqVar.b) && epx.f(this.c, xgqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FBData(id=" + this.a + ", media=" + this.b + ", modalCard=" + this.c + ')';
    }
}
