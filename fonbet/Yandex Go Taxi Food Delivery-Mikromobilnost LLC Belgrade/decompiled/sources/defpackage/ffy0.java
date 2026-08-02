package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class ffy0 extends jfy0 {
    public static final efy0 Companion = new efy0();
    public final String a;
    public final String b;

    public ffy0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dfy0.a.getDescriptor());
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
        if (!(obj instanceof ffy0)) {
            return false;
        }
        ffy0 ffy0Var = (ffy0) obj;
        return jl40.l(this.a, ffy0Var.a) && jl40.l(this.b, ffy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("GenUuid(pattern=", this.a, ", template=", this.b, Extension.C_BRAKE);
    }
}
