package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class kwg extends mjm0 {
    public static final jwg Companion = new jwg();
    public final String a;
    public final String b;

    public /* synthetic */ kwg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, iwg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kwg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kwg kwgVar = (kwg) obj;
        return jl40.l(this.a, kwgVar.a) && jl40.l(this.b, kwgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("DebugScaffold(message='", this.a, "', details=", this.b, Extension.C_BRAKE);
    }

    public kwg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
