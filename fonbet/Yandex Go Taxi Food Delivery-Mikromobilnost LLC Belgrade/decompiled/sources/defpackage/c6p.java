package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class c6p {
    public static final b6p Companion = new b6p();
    public final String a;
    public final String b;

    public /* synthetic */ c6p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, a6p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6p)) {
            return false;
        }
        c6p c6pVar = (c6p) obj;
        return jl40.l(this.a, c6pVar.a) && jl40.l(this.b, c6pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FTOauthTokenNode(template=", this.a, ", pattern=", this.b, Extension.C_BRAKE);
    }
}
