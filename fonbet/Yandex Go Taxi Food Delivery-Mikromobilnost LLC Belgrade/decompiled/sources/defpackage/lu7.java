package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class lu7 implements ig5 {
    public static final ku7 Companion = new ku7();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ lu7(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ju7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        return jl40.l(this.a, lu7Var.a) && jl40.l(this.b, lu7Var.b) && jl40.l(this.c, lu7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("CanMakeExternalRedirectAction(deeplink=", this.a, ", packageName=", this.b, ", boolVariableName="), this.c, Extension.C_BRAKE);
    }
}
