package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.w40;

/* loaded from: classes7.dex */
public final class fh61 extends zz61 {
    public final String a;
    public final String b;
    public final fx81 c;
    public final vl71 d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final List i;
    public final w40 j;
    public final String k;

    public fh61(String str, String str2, fx81 fx81Var, vl71 vl71Var, String str3, String str4, String str5, ArrayList arrayList, List list, w40 w40Var, String str6, int i) {
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        arrayList = (i & 128) != 0 ? null : arrayList;
        list = (i & 256) != 0 ? null : list;
        w40Var = (i & 512) != 0 ? w40.e : w40Var;
        str6 = (i & 1024) != 0 ? null : str6;
        this.a = str;
        this.b = str2;
        this.c = fx81Var;
        this.d = vl71Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = arrayList;
        this.i = list;
        this.j = w40Var;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh61)) {
            return false;
        }
        fh61 fh61Var = (fh61) obj;
        return jl40.l(this.a, fh61Var.a) && jl40.l(this.b, fh61Var.b) && jl40.l(this.c, fh61Var.c) && jl40.l(this.d, fh61Var.d) && jl40.l(this.e, fh61Var.e) && jl40.l(this.f, fh61Var.f) && jl40.l(this.g, fh61Var.g) && jl40.l(this.h, fh61Var.h) && jl40.l(this.i, fh61Var.i) && this.j == fh61Var.j && jl40.l(this.k, fh61Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fx81 fx81Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (fx81Var == null ? 0 : fx81Var.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList arrayList = this.h;
        int hashCode7 = (hashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        List list = this.i;
        int hashCode8 = (this.j.hashCode() + ((hashCode7 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str5 = this.k;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MediationAdapter(name=", this.a, ", logoUrl=", this.b, ", infoFirst=");
        v.append(this.c);
        v.append(", infoSecond=");
        v.append(this.d);
        v.append(", waringMessage=");
        g8e.D(v, this.e, ", adUnitId=", this.f, ", networkAdUnitIdName=");
        v.append(this.g);
        v.append(", parameters=");
        v.append(this.h);
        v.append(", cpmFloors=");
        v.append(this.i);
        v.append(", type=");
        v.append(this.j);
        v.append(", sdk=");
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }
}
