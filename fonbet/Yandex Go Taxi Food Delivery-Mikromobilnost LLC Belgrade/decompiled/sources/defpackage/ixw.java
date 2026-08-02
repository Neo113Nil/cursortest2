package defpackage;

/* loaded from: classes2.dex */
public final class ixw {
    public final String a;
    public final String b;

    public ixw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixw)) {
            return false;
        }
        ixw ixwVar = (ixw) obj;
        return this.a.equals(ixwVar.a) && this.b.equals(ixwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebWidgetQrParams(widgetUrl=");
        sb.append(this.a);
        sb.append(", underlineText=");
        return b64.p(sb, this.b, ')');
    }
}
