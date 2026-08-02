package defpackage;

/* loaded from: classes2.dex */
public final class jxw {
    public final String a;
    public final String b;

    public jxw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxw)) {
            return false;
        }
        jxw jxwVar = (jxw) obj;
        return this.a.equals(jxwVar.a) && this.b.equals(jxwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetQrCodeParams(widgetUrl=");
        sb.append(this.a);
        sb.append(", underlineText=");
        return b64.p(sb, this.b, ')');
    }
}
