package com.yandex.go.shortcuts.dto.request;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.hp40;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.rpe0;
import defpackage.srx;
import defpackage.tse0;
import defpackage.uc4;
import defpackage.unr0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/ProductsParamsState;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductsParamsState {
    public static final l Companion = new l();
    public static final i3y[] q;
    public final zzs a;
    public final List b;
    public final int c;
    public final List d;
    public final srx e;
    public final List f;
    public final ProductsScreenType$Type g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final hp40 l;
    public final String m;
    public final List n;
    public final List o;
    public final uc4 p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(18)), null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(19)), null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(20)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(21)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(22)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(23)), null};
    }

    public /* synthetic */ ProductsParamsState(int i, zzs zzsVar, List list, int i2, List list2, srx srxVar, List list3, ProductsScreenType$Type productsScreenType$Type, String str, String str2, String str3, String str4, hp40 hp40Var, String str5, List list4, List list5, uc4 uc4Var) {
        if ((i & 1) == 0) {
            this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        this.e = (i & 16) == 0 ? new srx(null, null) : srxVar;
        int i3 = i & 32;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.f = emptyList;
        } else {
            this.f = list3;
        }
        this.g = (i & 64) == 0 ? ProductsScreenType$Type.MAIN : productsScreenType$Type;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = hp40Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str5;
        }
        if ((i & 8192) == 0) {
            this.n = emptyList;
        } else {
            this.n = list4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list5;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = uc4Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsParamsState)) {
            return false;
        }
        ProductsParamsState productsParamsState = (ProductsParamsState) obj;
        return jl40.l(this.a, productsParamsState.a) && jl40.l(this.b, productsParamsState.b) && this.c == productsParamsState.c && jl40.l(this.d, productsParamsState.d) && jl40.l(this.e, productsParamsState.e) && jl40.l(this.f, productsParamsState.f) && this.g == productsParamsState.g && jl40.l(this.h, productsParamsState.h) && jl40.l(this.i, productsParamsState.i) && jl40.l(this.j, productsParamsState.j) && jl40.l(this.k, productsParamsState.k) && jl40.l(this.l, productsParamsState.l) && jl40.l(this.m, productsParamsState.m) && jl40.l(this.n, productsParamsState.n) && jl40.l(this.o, productsParamsState.o) && jl40.l(this.p, productsParamsState.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int b = oyr.b(this.c, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        List list2 = this.d;
        int c = unr0.c((this.e.hashCode() + ((b + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31, 31, this.f);
        ProductsScreenType$Type productsScreenType$Type = this.g;
        int hashCode2 = (c + (productsScreenType$Type == null ? 0 : productsScreenType$Type.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        hp40 hp40Var = this.l;
        int hashCode7 = (hashCode6 + (hp40Var == null ? 0 : hp40Var.hashCode())) * 31;
        String str5 = this.m;
        int c2 = unr0.c((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n);
        List list3 = this.o;
        int hashCode8 = (c2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        uc4 uc4Var = this.p;
        return hashCode8 + (uc4Var != null ? uc4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsParamsState(location=");
        sb.append(this.a);
        sb.append(", savedPlaces=");
        sb.append(this.b);
        sb.append(", accuracy=");
        sb.append(this.c);
        sb.append(", fields=");
        sb.append(this.d);
        sb.append(", languageInfo=");
        sb.append(this.e);
        sb.append(", knownOrders=");
        sb.append(this.f);
        sb.append(", screenType=");
        sb.append(this.g);
        sb.append(", currentZoneMode=");
        sb.append(this.h);
        sb.append(", appearanceMode=");
        g8e.D(sb, this.i, ", ultimaMode=", this.j, ", chooseUltimaAppearanceMode=");
        sb.append(this.k);
        sb.append(", multiclassOptions=");
        sb.append(this.l);
        sb.append(", selectedClass=");
        tse0.x(this.m, ", shownObjectsOverMap=", ", knownOrdersInfo=", sb, this.n);
        sb.append(this.o);
        sb.append(", bbox=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ProductsParamsState() {
        this(0);
    }

    public ProductsParamsState(zzs zzsVar, List list, int i, List list2, srx srxVar, List list3, ProductsScreenType$Type productsScreenType$Type, String str, String str2, String str3, String str4, hp40 hp40Var, String str5, List list4, List list5, uc4 uc4Var) {
        this.a = zzsVar;
        this.b = list;
        this.c = i;
        this.d = list2;
        this.e = srxVar;
        this.f = list3;
        this.g = productsScreenType$Type;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = hp40Var;
        this.m = str5;
        this.n = list4;
        this.o = list5;
        this.p = uc4Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProductsParamsState(int i) {
        this(r0, null, 0, null, r5, r6, r7, null, null, null, null, null, null, r6, null, null);
        zzs zzsVar = new zzs(0.0d, 0.0d, 0, null, null, 24);
        srx srxVar = new srx(null, null);
        ProductsScreenType$Type productsScreenType$Type = ProductsScreenType$Type.MAIN;
        EmptyList emptyList = EmptyList.a;
    }
}
