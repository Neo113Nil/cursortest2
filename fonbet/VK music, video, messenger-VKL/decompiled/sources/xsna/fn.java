package xsna;

/* compiled from: AccountAnonymousFeature.kt */
/* loaded from: classes6.dex */
public final class fn {
    public final String a;
    public final boolean b;
    public final String c;

    public fn(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return epx.f(this.a, fnVar.a) && this.b == fnVar.b && epx.f(this.c, fnVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountAnonymousFeature(name=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", value=");
        return ho8.a(sb, this.c, ')');
    }
}
