package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m5c {
    public final String a;
    public final String b;

    public m5c(String str, String str2) {
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
        if (!(obj instanceof m5c)) {
            return false;
        }
        m5c m5cVar = (m5c) obj;
        return jl40.l(this.a, m5cVar.a) && jl40.l(this.b, m5cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ClosedBadge(badgeId=", this.a, ", screen=", this.b, Extension.C_BRAKE);
    }
}
