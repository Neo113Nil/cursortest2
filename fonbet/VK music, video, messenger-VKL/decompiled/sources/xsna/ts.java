package xsna;

/* compiled from: AccountSignedResponse.kt */
/* loaded from: classes6.dex */
public final class ts {
    public final String a;
    public final String b;

    public ts(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) obj;
        return epx.f(this.a, tsVar.a) && epx.f(this.b, tsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSignedResponse(sign=");
        sb.append(this.a);
        sb.append(", data=");
        return ho8.a(sb, this.b, ')');
    }
}
