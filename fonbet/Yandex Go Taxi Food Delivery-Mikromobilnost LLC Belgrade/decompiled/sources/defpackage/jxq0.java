package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jxq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final ouq0 g;
    public final ytv h;

    public jxq0(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ouq0 ouq0Var, ytv ytvVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = ouq0Var;
        this.h = ytvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxq0)) {
            return false;
        }
        jxq0 jxq0Var = (jxq0) obj;
        return jl40.l(this.a, jxq0Var.a) && jl40.l(this.b, jxq0Var.b) && jl40.l(this.c, jxq0Var.c) && jl40.l(this.d, jxq0Var.d) && jl40.l(this.e, jxq0Var.e) && this.f.equals(jxq0Var.f) && jl40.l(this.g, jxq0Var.g) && this.h.equals(jxq0Var.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.h.hashCode() + ((this.g.hashCode() + ly3.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ServiceUiState(name=", this.a, ", title=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", copyright=", this.d, ", legalInfo=");
        v.append(this.e);
        v.append(", links=");
        v.append(this.f);
        v.append(", data=");
        v.append(this.g);
        v.append(", event=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
