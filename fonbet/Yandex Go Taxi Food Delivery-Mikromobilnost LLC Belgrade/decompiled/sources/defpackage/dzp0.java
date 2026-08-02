package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class dzp0 extends see {
    public final czp0 a;
    public final List b;
    public final String c;
    public final xyp0 d;
    public final yyp0 e;
    public final zyp0 f;

    public dzp0(czp0 czp0Var, List list, String str, xyp0 xyp0Var, yyp0 yyp0Var, zyp0 zyp0Var) {
        this.a = czp0Var;
        this.b = list;
        this.c = str;
        this.d = xyp0Var;
        this.e = yyp0Var;
        this.f = zyp0Var;
    }

    public static dzp0 a(dzp0 dzp0Var, czp0 czp0Var, List list, String str, xyp0 xyp0Var, zyp0 zyp0Var, int i) {
        if ((i & 1) != 0) {
            czp0Var = dzp0Var.a;
        }
        czp0 czp0Var2 = czp0Var;
        if ((i & 2) != 0) {
            list = dzp0Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = dzp0Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            xyp0Var = dzp0Var.d;
        }
        return new dzp0(czp0Var2, list2, str2, xyp0Var, dzp0Var.e, zyp0Var);
    }

    public static dzp0 b(dzp0 dzp0Var, ArrayList arrayList) {
        czp0 czp0Var = dzp0Var.a;
        String str = dzp0Var.c;
        xyp0 xyp0Var = dzp0Var.d;
        yyp0 yyp0Var = dzp0Var.e;
        dzp0Var.getClass();
        return new dzp0(czp0Var, arrayList, str, xyp0Var, yyp0Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dzp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dzp0 dzp0Var = (dzp0) obj;
        return jl40.l(this.a, dzp0Var.a) && jl40.l(this.b, dzp0Var.b) && jl40.l(this.c, dzp0Var.c) && jl40.l(this.d, dzp0Var.d) && jl40.l(this.e, dzp0Var.e) && jl40.l(this.f, dzp0Var.f);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
        xyp0 xyp0Var = this.d;
        int hashCode2 = (hashCode + (xyp0Var != null ? xyp0Var.hashCode() : 0)) * 31;
        yyp0 yyp0Var = this.e;
        int hashCode3 = (hashCode2 + (yyp0Var != null ? yyp0Var.hashCode() : 0)) * 31;
        zyp0 zyp0Var = this.f;
        return hashCode3 + (zyp0Var != null ? zyp0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SectionContent(settings=" + this.a + ", sections=" + this.b + ", nextPageToken=" + this.c + ", actions=" + this.d + ", animations=" + this.e + ", loadingSettings=" + this.f + Extension.C_BRAKE;
    }
}
