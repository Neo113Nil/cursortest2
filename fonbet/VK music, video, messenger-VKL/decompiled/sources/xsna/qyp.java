package xsna;

/* compiled from: EventData.kt */
/* loaded from: classes11.dex */
public final class qyp {
    public final String a;
    public final eta0 b;

    public qyp(String str, eta0 eta0Var) {
        this.a = str;
        this.b = eta0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyp)) {
            return false;
        }
        qyp qypVar = (qyp) obj;
        return epx.f(this.a, qypVar.a) && epx.f(this.b, qypVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventData(data=" + this.a + ", platform=" + this.b + ')';
    }
}
