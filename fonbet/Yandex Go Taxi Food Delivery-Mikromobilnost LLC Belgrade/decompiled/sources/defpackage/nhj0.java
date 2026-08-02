package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class nhj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public nhj0(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhj0)) {
            return false;
        }
        nhj0 nhj0Var = (nhj0) obj;
        return jl40.l(this.a, nhj0Var.a) && jl40.l(this.b, nhj0Var.b) && jl40.l(this.c, nhj0Var.c) && jl40.l(this.d, nhj0Var.d) && jl40.l(this.e, nhj0Var.e) && this.f.equals(nhj0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementGroupScreenUiState(title=", this.a, ", subtitle=", this.b, ", textOnButton=");
        g8e.D(v, this.c, ", previewText=", this.d, ", iconTag=");
        return tse0.j(this.e, ", requirementList=", Extension.C_BRAKE, v, this.f);
    }
}
