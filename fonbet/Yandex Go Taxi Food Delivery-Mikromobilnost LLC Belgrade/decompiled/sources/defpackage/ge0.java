package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ge0 {
    public static final ge0 m = new ge0((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, false, 4095);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public /* synthetic */ ge0(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? EmptyList.a : list, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.List] */
    public static ge0 a(ge0 ge0Var, String str, String str2, String str3, ArrayList arrayList, boolean z, boolean z2, String str4, int i) {
        String str5 = ge0Var.a;
        if ((i & 2) != 0) {
            str = ge0Var.b;
        }
        String str6 = str;
        String str7 = (i & 4) != 0 ? ge0Var.c : str2;
        String str8 = (i & 8) != 0 ? ge0Var.d : str3;
        String str9 = ge0Var.e;
        String str10 = ge0Var.f;
        String str11 = ge0Var.g;
        ArrayList arrayList2 = (i & 128) != 0 ? ge0Var.h : arrayList;
        boolean z3 = (i & 256) != 0 ? ge0Var.i : z;
        boolean z4 = (i & 512) != 0 ? ge0Var.j : z2;
        boolean z5 = ge0Var.k;
        String str12 = (i & 2048) != 0 ? ge0Var.l : str4;
        ge0Var.getClass();
        return new ge0(str5, str6, str7, str8, str9, str10, str11, arrayList2, z3, z4, z5, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return jl40.l(this.a, ge0Var.a) && jl40.l(this.b, ge0Var.b) && jl40.l(this.c, ge0Var.c) && jl40.l(this.d, ge0Var.d) && jl40.l(this.e, ge0Var.e) && jl40.l(this.f, ge0Var.f) && jl40.l(this.g, ge0Var.g) && jl40.l(this.h, ge0Var.h) && this.i == ge0Var.i && this.j == ge0Var.j && this.k == ge0Var.k && jl40.l(this.l, ge0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + unr0.e(unr0.e(unr0.e(unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddFavoritesModalViewState(title=", this.a, ", subtitle=", this.b, ", addressTitle=");
        g8e.D(v, this.c, ", addressSubtitle=", this.d, ", saveButtonText=");
        g8e.D(v, this.e, ", noFavoriteTypeMessage=", this.f, ", newCategoriesHint=");
        tse0.x(this.g, ", favoritesCategoriesModels=", ", isShowEditField=", v, this.h);
        nnm.v(", isShowKeyboard=", ", isForceHideBabblesList=", v, this.i, this.j);
        return n.m(", errorMessage=", this.l, Extension.C_BRAKE, v, this.k);
    }

    public ge0() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, false, 4095);
    }

    public ge0(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = list;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str8;
    }
}
