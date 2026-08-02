package xsna;

/* compiled from: HttpUrlPostCall.kt */
/* loaded from: classes14.dex */
public final class gnk {
    public final String a;
    public final String b;

    public gnk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnk)) {
            return false;
        }
        gnk gnkVar = (gnk) obj;
        return epx.f(this.a, gnkVar.a) && epx.f(this.b, gnkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomHeader(key=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }
}
