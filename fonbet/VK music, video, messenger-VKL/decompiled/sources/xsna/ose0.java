package xsna;

/* compiled from: QuickMessagesInfo.kt */
/* loaded from: classes18.dex */
public final class ose0 {
    public final String a;
    public final String b;

    public ose0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ose0)) {
            return false;
        }
        ose0 ose0Var = (ose0) obj;
        return epx.f(this.a, ose0Var.a) && epx.f(this.b, ose0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickMessageResponseTime(responseTimeHighlight=");
        sb.append(this.a);
        sb.append(", responseTimeDescription=");
        return ho8.a(sb, this.b, ')');
    }
}
