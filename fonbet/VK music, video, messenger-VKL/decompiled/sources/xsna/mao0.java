package xsna;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class mao0 {
    public final String a;
    public final String b;

    public mao0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mao0)) {
            return false;
        }
        mao0 mao0Var = (mao0) obj;
        return epx.f(this.a, mao0Var.a) && epx.f(this.b, mao0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TermsLinksResponse(name=");
        sb.append(this.a);
        sb.append(", url=");
        return ho8.a(sb, this.b, ')');
    }
}
