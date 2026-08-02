package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class g1j0 extends kr {
    public static final f1j0 Companion = new f1j0();
    public final String a;
    public final String b;
    public final c c;

    public /* synthetic */ g1j0(int i, String str, String str2, c cVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, e1j0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1j0.class != obj.getClass()) {
            return false;
        }
        g1j0 g1j0Var = (g1j0) obj;
        return jl40.l(this.a, g1j0Var.a) && jl40.l(this.b, g1j0Var.b) && jl40.l(this.c, g1j0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ReplaceSectionAction(sectionId=", this.a, ", targetId=", this.b, ", params=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
