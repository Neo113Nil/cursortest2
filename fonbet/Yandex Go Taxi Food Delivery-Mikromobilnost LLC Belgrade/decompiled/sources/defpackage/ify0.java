package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class ify0 extends jfy0 {
    public static final hfy0 Companion = new hfy0();
    public final String a;
    public final String b;

    public ify0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gfy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.jfy0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.jfy0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ify0)) {
            return false;
        }
        ify0 ify0Var = (ify0) obj;
        return jl40.l(this.a, ify0Var.a) && jl40.l(this.b, ify0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Oauth(pattern=", this.a, ", template=", this.b, Extension.C_BRAKE);
    }
}
