package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b3p {
    public final String a;
    public final c501 b;

    public b3p(String str, c501 c501Var) {
        this.a = str;
        this.b = c501Var;
    }

    public final c501 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3p)) {
            return false;
        }
        b3p b3pVar = (b3p) obj;
        return jl40.l(this.a, b3pVar.a) && jl40.l(this.b, b3pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineItem(url=" + this.a + ", backgroundColors=" + this.b + Extension.C_BRAKE;
    }
}
