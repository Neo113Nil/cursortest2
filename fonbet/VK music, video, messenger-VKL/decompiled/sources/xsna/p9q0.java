package xsna;

/* compiled from: UploadAttachmentsPostParams.kt */
/* loaded from: classes6.dex */
public final class p9q0 {
    public final String a;
    public final String b;

    public p9q0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9q0)) {
            return false;
        }
        p9q0 p9q0Var = (p9q0) obj;
        return epx.f(this.a, p9q0Var.a) && epx.f(this.b, p9q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadAttachmentsPostParams(type=");
        sb.append(this.a);
        sb.append(", link=");
        return ho8.a(sb, this.b, ')');
    }
}
