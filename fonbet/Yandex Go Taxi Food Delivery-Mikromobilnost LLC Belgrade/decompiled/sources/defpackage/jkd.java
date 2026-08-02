package defpackage;

/* loaded from: classes2.dex */
public final class jkd {
    public final String a;
    public final String b;
    public final String c;

    public jkd(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkd)) {
            return false;
        }
        jkd jkdVar = (jkd) obj;
        return this.a.equals(jkdVar.a) && this.b.equals(jkdVar.b) && this.c.equals(jkdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset(buttonText=");
        sb.append(this.a);
        sb.append(", buttonTextWithDetails=");
        sb.append(this.b);
        sb.append(", subscriptionName=");
        return b64.p(sb, this.c, ')');
    }
}
