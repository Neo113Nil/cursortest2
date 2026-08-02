package xsna;

/* compiled from: ReplyCreateResponse.kt */
/* loaded from: classes18.dex */
public final class b4g0 {
    public final int a;
    public final String b;

    public b4g0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4g0)) {
            return false;
        }
        b4g0 b4g0Var = (b4g0) obj;
        return this.a == b4g0Var.a && epx.f(this.b, b4g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyCreateResponse(commentId=");
        sb.append(this.a);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.b, ')');
    }
}
