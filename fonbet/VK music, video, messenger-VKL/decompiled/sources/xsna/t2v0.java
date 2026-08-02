package xsna;

/* compiled from: VkLoginConfirmationContract.kt */
/* loaded from: classes15.dex */
public final class t2v0 {
    public final String a;
    public final String b;

    public t2v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2v0)) {
            return false;
        }
        t2v0 t2v0Var = (t2v0) obj;
        return epx.f(this.a, t2v0Var.a) && epx.f(this.b, t2v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoItem(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
