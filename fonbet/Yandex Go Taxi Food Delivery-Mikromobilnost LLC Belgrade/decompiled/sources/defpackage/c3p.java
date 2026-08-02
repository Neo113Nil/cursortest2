package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c3p {
    public final String a;
    public final boolean b;

    public c3p(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3p)) {
            return false;
        }
        c3p c3pVar = (c3p) obj;
        return jl40.l(this.a, c3pVar.a) && this.b == c3pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("WebCustomTabsAction(url=", this.a, ", wrapAuthUrl=", this.b, Extension.C_BRAKE);
    }
}
