package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o9x0 implements r9x0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sbv e;
    public final List f;
    public final sls g;
    public final sls h;
    public final String i;
    public final hvm j;

    public o9x0(String str, String str2, String str3, String str4, sbv sbvVar, List list, sls slsVar, sls slsVar2, String str5, hvm hvmVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sbvVar;
        this.f = list;
        this.g = slsVar;
        this.h = slsVar2;
        this.i = str5;
        this.j = hvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9x0)) {
            return false;
        }
        o9x0 o9x0Var = (o9x0) obj;
        return jl40.l(this.a, o9x0Var.a) && jl40.l(this.b, o9x0Var.b) && jl40.l(this.c, o9x0Var.c) && jl40.l(this.d, o9x0Var.d) && this.e.equals(o9x0Var.e) && this.f.equals(o9x0Var.f) && this.g.equals(o9x0Var.g) && this.h.equals(o9x0Var.h) && jl40.l(this.i, o9x0Var.i) && jl40.l(this.j, o9x0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int a = nnm.a(nnm.a(unr0.c((this.e.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str3 = this.i;
        int hashCode2 = (a + (str3 == null ? 0 : str3.hashCode())) * 31;
        hvm hvmVar = this.j;
        return hashCode2 + (hvmVar != null ? hvmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectDueAction(title=", this.a, ", subtitle=", this.b, ", formStateKey=");
        g8e.D(v, this.c, ", descriptionSubtitle=", this.d, ", descriptionIcon=");
        v.append(this.e);
        v.append(", slots=");
        v.append(this.f);
        v.append(", onSelected=");
        v.append(this.g);
        v.append(", onRemoved=");
        v.append(this.h);
        v.append(", metricaLabel=");
        v.append(this.i);
        v.append(", buttonsConfig=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
