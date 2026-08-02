package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ak1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ThemedImageUrlEntity e;
    public final List f;
    public final String g;
    public final xk1 h;
    public final List i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final unq n;
    public final String o;

    public ak1(String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, List list, String str5, xk1 xk1Var, List list2, String str6, String str7, String str8, String str9, unq unqVar, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = themedImageUrlEntity;
        this.f = list;
        this.g = str5;
        this.h = xk1Var;
        this.i = list2;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = unqVar;
        this.o = str10;
    }

    public static ak1 a(ak1 ak1Var, String str, ArrayList arrayList, String str2, String str3, String str4, int i) {
        String str5 = ak1Var.a;
        String str6 = ak1Var.b;
        String str7 = ak1Var.c;
        String str8 = (i & 8) != 0 ? ak1Var.d : str;
        ThemedImageUrlEntity themedImageUrlEntity = ak1Var.e;
        String str9 = (i & 64) != 0 ? ak1Var.g : str2;
        xk1 xk1Var = ak1Var.h;
        List list = ak1Var.i;
        String str10 = ak1Var.j;
        String str11 = (i & 1024) != 0 ? ak1Var.k : str3;
        String str12 = (i & 2048) != 0 ? ak1Var.l : str4;
        String str13 = ak1Var.m;
        unq unqVar = ak1Var.n;
        String str14 = ak1Var.o;
        ak1Var.getClass();
        return new ak1(str5, str6, str7, str8, themedImageUrlEntity, arrayList, str9, xk1Var, list, str10, str11, str12, str13, unqVar, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return jl40.l(this.a, ak1Var.a) && this.b.equals(ak1Var.b) && jl40.l(this.c, ak1Var.c) && jl40.l(this.d, ak1Var.d) && this.e.equals(ak1Var.e) && jl40.l(this.f, ak1Var.f) && jl40.l(this.g, ak1Var.g) && jl40.l(this.h, ak1Var.h) && this.i.equals(ak1Var.i) && jl40.l(this.j, ak1Var.j) && jl40.l(this.k, ak1Var.k) && jl40.l(this.l, ak1Var.l) && jl40.l(this.m, ak1Var.m) && jl40.l(this.n, ak1Var.n) && jl40.l(this.o, ak1Var.o);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int c = unr0.c(xvz.c(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f);
        String str2 = this.g;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        xk1 xk1Var = this.h;
        int c2 = unr0.c((hashCode + (xk1Var == null ? 0 : xk1Var.hashCode())) * 31, 31, this.i);
        String str3 = this.j;
        int hashCode2 = (c2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        unq unqVar = this.n;
        int hashCode6 = (hashCode5 + (unqVar == null ? 0 : unqVar.hashCode())) * 31;
        String str7 = this.o;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AgreementInfoEntity(agreementId=", this.a, ", type=", this.b, ", title=");
        g8e.D(v, this.c, ", description=", this.d, ", image=");
        v.append(this.e);
        v.append(", buttons=");
        v.append(this.f);
        v.append(", agreementSheetDescription=");
        v.append(this.g);
        v.append(", prerequisites=");
        v.append(this.h);
        v.append(", suggests=");
        oyr.D(", action=", this.j, ", infoText=", v, this.i);
        g8e.D(v, this.k, ", onSelectedAction=", this.l, ", onNewM2mBankSelectedAction=");
        v.append(this.m);
        v.append(", fee=");
        v.append(this.n);
        v.append(", infoSubtitle=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }
}
