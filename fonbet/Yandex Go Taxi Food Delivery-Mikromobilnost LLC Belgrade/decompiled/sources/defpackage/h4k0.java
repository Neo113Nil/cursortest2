package defpackage;

/* loaded from: classes2.dex */
public final class h4k0 {
    public final String a;
    public final String b;

    public h4k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4k0)) {
            return false;
        }
        h4k0 h4k0Var = (h4k0) obj;
        return this.a.equals(h4k0Var.a) && this.b.equals(h4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckoutTitleLinkItem(text=");
        sb.append(this.a);
        sb.append(", url=");
        return b64.p(sb, this.b, ')');
    }
}
