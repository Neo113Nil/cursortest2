package xsna;

/* compiled from: CheckoutAuthDataResponse.kt */
/* loaded from: classes6.dex */
public final class w2c {
    public final String a;
    public final String b;

    public w2c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2c)) {
            return false;
        }
        w2c w2cVar = (w2c) obj;
        return epx.f(this.a, w2cVar.a) && epx.f(this.b, w2cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutAuthDataResponse(authData=");
        sb.append(this.a);
        sb.append(", authSign=");
        return ho8.a(sb, this.b, ')');
    }
}
