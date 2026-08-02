package com.yandex.go.shortcuts.impl.repository;

import android.location.Location;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.shortcuts.factory.SavedPlaceFactory$CreationCacheStrategy;
import defpackage.acz;
import defpackage.el00;
import defpackage.fif;
import defpackage.fnx0;
import defpackage.g6u;
import defpackage.h3y;
import defpackage.haf0;
import defpackage.hp40;
import defpackage.jst;
import defpackage.n7q0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pex0;
import defpackage.q1m0;
import defpackage.qyy0;
import defpackage.sjh;
import defpackage.srx;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.uzs;
import defpackage.wiq0;
import defpackage.xv11;
import defpackage.yaf0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class s {
    public final n7q0 a;
    public final acz b;
    public final ru.yandex.taxi.zonemodes.j c;
    public final fif d;
    public final h3y e;
    public final com.yandex.go.taxi.tariffs.repository.g f;
    public final com.yandex.go.shortcuts.impl.preferences.a g;
    public final h3y h;
    public final tt2 i;
    public final ru.yandex.taxi.personalstate.domain.interactor.j j;
    public final wiq0 k;
    public final ru.yandex.taxi.superapp.knownOrder.u l;
    public final h3y m;
    public final xv11 n;

    public s(n7q0 n7q0Var, acz aczVar, ru.yandex.taxi.zonemodes.j jVar, fif fifVar, h3y h3yVar, com.yandex.go.taxi.tariffs.repository.g gVar, com.yandex.go.shortcuts.impl.preferences.a aVar, h3y h3yVar2, tt2 tt2Var, ru.yandex.taxi.personalstate.domain.interactor.j jVar2, wiq0 wiq0Var, ru.yandex.taxi.superapp.knownOrder.u uVar, h3y h3yVar3, xv11 xv11Var) {
        this.a = n7q0Var;
        this.b = aczVar;
        this.c = jVar;
        this.d = fifVar;
        this.e = h3yVar;
        this.f = gVar;
        this.g = aVar;
        this.h = h3yVar2;
        this.i = tt2Var;
        this.j = jVar2;
        this.k = wiq0Var;
        this.l = uVar;
        this.m = h3yVar3;
        this.n = xv11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0241, code lost:
    
        if (r2 == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, yaf0 yaf0Var, List list2, List list3, zzs zzsVar, haf0 haf0Var, boolean z, uc4 uc4Var, ContinuationImpl continuationImpl) {
        ProductsParamsStateFactoryImpl$createProductsParamsState$1 productsParamsStateFactoryImpl$createProductsParamsState$1;
        Object obj;
        int i;
        String str;
        Object obj2;
        List list4;
        List list5;
        zzs zzsVar2;
        boolean z2;
        haf0 haf0Var2;
        uc4 uc4Var2;
        yaf0 yaf0Var2;
        List list6;
        Object b;
        String str2;
        List list7;
        zzs zzsVar3;
        uc4 uc4Var3;
        boolean z3;
        yaf0 yaf0Var3;
        List list8;
        List list9;
        String str3;
        String str4;
        String str5;
        List list10;
        String str6;
        uc4 uc4Var4;
        haf0 haf0Var3;
        zzs zzsVar4;
        List list11;
        Object e;
        List list12;
        List list13;
        List list14;
        int i2;
        yaf0 yaf0Var4;
        if (continuationImpl instanceof ProductsParamsStateFactoryImpl$createProductsParamsState$1) {
            productsParamsStateFactoryImpl$createProductsParamsState$1 = (ProductsParamsStateFactoryImpl$createProductsParamsState$1) continuationImpl;
            int i3 = productsParamsStateFactoryImpl$createProductsParamsState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$createProductsParamsState$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = productsParamsStateFactoryImpl$createProductsParamsState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$createProductsParamsState$1.label;
                xv11 xv11Var = this.n;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    String str7 = haf0Var.a;
                    String str8 = str7 == null ? "" : str7;
                    ru.yandex.taxi.zonemodes.j jVar = this.c;
                    str = jVar.e(jVar.b.g(), str8, ((com.yandex.go.taxi.tariffs.internal.repository.k) jVar.c).h()).a;
                    com.yandex.go.shortcuts.impl.preferences.a aVar = this.g;
                    if (str == null || str.length() == 0) {
                        obj2 = null;
                        str = aVar.b.l("ru.yandex.taxi.shortcuts.preferences.ProductsPreferences.appearance_mode_" + str7, null);
                    } else {
                        aVar.b.r("ru.yandex.taxi.shortcuts.preferences.ProductsPreferences.appearance_mode_" + str7, str);
                        obj2 = null;
                    }
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var;
                    list4 = list2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list4;
                    list5 = list3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list5;
                    zzsVar2 = zzsVar;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = obj2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str;
                    z2 = z;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.label = 1;
                    Object a = ((com.yandex.go.ultima_mode.domain.c) xv11Var).a(productsParamsStateFactoryImpl$createProductsParamsState$1);
                    if (a != obj) {
                        haf0Var2 = haf0Var;
                        uc4Var2 = uc4Var;
                        yaf0Var2 = yaf0Var;
                        list6 = list;
                        obj3 = a;
                    }
                    return obj;
                }
                if (i == 1) {
                    boolean z4 = productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0;
                    str = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$8;
                    uc4 uc4Var5 = (uc4) productsParamsStateFactoryImpl$createProductsParamsState$1.L$6;
                    haf0Var2 = (haf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$5;
                    zzs zzsVar5 = (zzs) productsParamsStateFactoryImpl$createProductsParamsState$1.L$4;
                    list5 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$3;
                    List list15 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$2;
                    yaf0Var2 = (yaf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$1;
                    list6 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$0;
                    kotlin.b.b(obj3);
                    z2 = z4;
                    uc4Var2 = uc4Var5;
                    zzsVar2 = zzsVar5;
                    list4 = list15;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i4 = productsParamsStateFactoryImpl$createProductsParamsState$1.I$0;
                            List list16 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$11;
                            str4 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$10;
                            str2 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$9;
                            str6 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$8;
                            uc4Var4 = (uc4) productsParamsStateFactoryImpl$createProductsParamsState$1.L$6;
                            haf0Var3 = (haf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$5;
                            zzsVar4 = (zzs) productsParamsStateFactoryImpl$createProductsParamsState$1.L$4;
                            List list17 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$3;
                            list11 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$2;
                            yaf0Var4 = (yaf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$1;
                            List list18 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$0;
                            kotlin.b.b(obj3);
                            i2 = i4;
                            list13 = list18;
                            list12 = list16;
                            str5 = "";
                            list14 = list17;
                            String str9 = str4;
                            String str10 = str2;
                            String str11 = str6;
                            uc4 uc4Var6 = uc4Var4;
                            zzs zzsVar6 = zzsVar4;
                            List list19 = list11;
                            srx srxVar = (srx) obj3;
                            ProductsScreenType$Type a2 = yaf0Var4.a();
                            String a3 = this.d.a();
                            return new ProductsParamsState(zzsVar6, list12, i2, list13, srxVar, list19, a2, a3 != null ? str5 : a3, str11, str9, str10, haf0Var3.b, haf0Var3.a, kotlin.collections.a.J0(this.a.a), list14, uc4Var6);
                        }
                        z3 = productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0;
                        str4 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$10;
                        str2 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$9;
                        str3 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$8;
                        uc4Var3 = (uc4) productsParamsStateFactoryImpl$createProductsParamsState$1.L$6;
                        haf0Var2 = (haf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$5;
                        zzsVar3 = (zzs) productsParamsStateFactoryImpl$createProductsParamsState$1.L$4;
                        list7 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$3;
                        list8 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$2;
                        yaf0Var3 = (yaf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$1;
                        list9 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$0;
                        kotlin.b.b(obj3);
                        str5 = "";
                        list10 = (List) obj3;
                        yaf0 yaf0Var5 = yaf0Var3;
                        str6 = str3;
                        uc4Var4 = uc4Var3;
                        haf0Var3 = haf0Var2;
                        zzsVar4 = zzsVar3;
                        list11 = list8;
                        int i5 = zzsVar4.c;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list9;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var5;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list11;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list7;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var3;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = null;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str6;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$9 = str2;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$10 = str4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$11 = list10;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z3;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.I$0 = i5;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.label = 4;
                        e = e(productsParamsStateFactoryImpl$createProductsParamsState$1);
                        if (e != obj) {
                            list12 = list10;
                            list13 = list9;
                            list14 = list7;
                            i2 = i5;
                            yaf0Var4 = yaf0Var5;
                            obj3 = e;
                            String str92 = str4;
                            String str102 = str2;
                            String str112 = str6;
                            uc4 uc4Var62 = uc4Var4;
                            zzs zzsVar62 = zzsVar4;
                            List list192 = list11;
                            srx srxVar2 = (srx) obj3;
                            ProductsScreenType$Type a22 = yaf0Var4.a();
                            String a32 = this.d.a();
                            return new ProductsParamsState(zzsVar62, list12, i2, list13, srxVar2, list192, a22, a32 != null ? str5 : a32, str112, str92, str102, haf0Var3.b, haf0Var3.a, kotlin.collections.a.J0(this.a.a), list14, uc4Var62);
                        }
                        return obj;
                    }
                    z3 = productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0;
                    String str12 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$9;
                    String str13 = (String) productsParamsStateFactoryImpl$createProductsParamsState$1.L$8;
                    uc4 uc4Var7 = (uc4) productsParamsStateFactoryImpl$createProductsParamsState$1.L$6;
                    haf0 haf0Var4 = (haf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$5;
                    zzs zzsVar7 = (zzs) productsParamsStateFactoryImpl$createProductsParamsState$1.L$4;
                    List list20 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$3;
                    List list21 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$2;
                    yaf0 yaf0Var6 = (yaf0) productsParamsStateFactoryImpl$createProductsParamsState$1.L$1;
                    List list22 = (List) productsParamsStateFactoryImpl$createProductsParamsState$1.L$0;
                    kotlin.b.b(obj3);
                    uc4Var3 = uc4Var7;
                    yaf0Var3 = yaf0Var6;
                    list7 = list20;
                    list9 = list22;
                    list8 = list21;
                    zzsVar3 = zzsVar7;
                    haf0Var2 = haf0Var4;
                    str3 = str13;
                    str2 = str12;
                    str4 = (String) obj3;
                    if (z3) {
                        str5 = "";
                        list10 = null;
                        yaf0 yaf0Var52 = yaf0Var3;
                        str6 = str3;
                        uc4Var4 = uc4Var3;
                        haf0Var3 = haf0Var2;
                        zzsVar4 = zzsVar3;
                        list11 = list8;
                        int i52 = zzsVar4.c;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list9;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var52;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list11;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list7;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var3;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = null;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str6;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$9 = str2;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$10 = str4;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.L$11 = list10;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z3;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.I$0 = i52;
                        productsParamsStateFactoryImpl$createProductsParamsState$1.label = 4;
                        e = e(productsParamsStateFactoryImpl$createProductsParamsState$1);
                        if (e != obj) {
                        }
                        return obj;
                    }
                    ProductsScreenType$Type a4 = yaf0Var3.a();
                    str5 = "";
                    SavedPlaceFactory$CreationCacheStrategy savedPlaceFactory$CreationCacheStrategy = (a4 == ProductsScreenType$Type.SCOOTERS_DISCOVERY || a4 == ProductsScreenType$Type.SCOOTERS_RIDE_FINISH_SCREEN || yaf0Var3.a() == ProductsScreenType$Type.CHARGERS_DISCOVERY) ? SavedPlaceFactory$CreationCacheStrategy.ONLY_FROM_CACHE : SavedPlaceFactory$CreationCacheStrategy.FROM_CACHE_IF_POSSIBLE;
                    q1m0 q1m0Var = (q1m0) this.m.get();
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list9;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list8;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list7;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = null;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$9 = str2;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$10 = str4;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.L$11 = null;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z3;
                    productsParamsStateFactoryImpl$createProductsParamsState$1.label = 3;
                    obj3 = ((com.yandex.go.shortcuts.impl.factory.f) q1m0Var).a(savedPlaceFactory$CreationCacheStrategy, productsParamsStateFactoryImpl$createProductsParamsState$1);
                }
                String str14 = (String) obj3;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list6;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var2;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list4;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list5;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar2;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var2;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var2;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = null;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str;
                productsParamsStateFactoryImpl$createProductsParamsState$1.L$9 = str14;
                productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z2;
                productsParamsStateFactoryImpl$createProductsParamsState$1.label = 2;
                b = ((com.yandex.go.ultima_mode.domain.c) xv11Var).b(productsParamsStateFactoryImpl$createProductsParamsState$1);
                if (b != obj) {
                    str2 = str14;
                    obj3 = b;
                    zzs zzsVar8 = zzsVar2;
                    list7 = list5;
                    zzsVar3 = zzsVar8;
                    uc4Var3 = uc4Var2;
                    z3 = z2;
                    yaf0Var3 = yaf0Var2;
                    list8 = list4;
                    list9 = list6;
                    str3 = str;
                    str4 = (String) obj3;
                    if (z3) {
                    }
                }
                return obj;
            }
        }
        productsParamsStateFactoryImpl$createProductsParamsState$1 = new ProductsParamsStateFactoryImpl$createProductsParamsState$1(this, continuationImpl);
        Object obj32 = productsParamsStateFactoryImpl$createProductsParamsState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$createProductsParamsState$1.label;
        xv11 xv11Var2 = this.n;
        if (i != 0) {
        }
        String str142 = (String) obj32;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$0 = list6;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$1 = yaf0Var2;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$2 = list4;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$3 = list5;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$4 = zzsVar2;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$5 = haf0Var2;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$6 = uc4Var2;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$7 = null;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$8 = str;
        productsParamsStateFactoryImpl$createProductsParamsState$1.L$9 = str142;
        productsParamsStateFactoryImpl$createProductsParamsState$1.Z$0 = z2;
        productsParamsStateFactoryImpl$createProductsParamsState$1.label = 2;
        b = ((com.yandex.go.ultima_mode.domain.c) xv11Var2).b(productsParamsStateFactoryImpl$createProductsParamsState$1);
        if (b != obj) {
        }
        return obj;
    }

    public final haf0 b(fnx0 fnx0Var) {
        if (fnx0Var == null) {
            return haf0.c;
        }
        pex0 pex0Var = fnx0Var.c;
        return new haf0(pex0Var.b, new hp40(Boolean.valueOf(pex0Var.K0), pex0Var.K0 ? this.f.b() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.yandex.go.shortcuts.impl.repository.s] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ArrayList arrayList, ArrayList arrayList2, yaf0 yaf0Var, ContinuationImpl continuationImpl) {
        ProductsParamsStateFactoryImpl$getProductsParamsState$1 productsParamsStateFactoryImpl$getProductsParamsState$1;
        int i;
        zzs zzsVar;
        zzs zzsVar2;
        yaf0 yaf0Var2;
        boolean z;
        ArrayList arrayList3;
        ArrayList arrayList4;
        uc4 uc4Var;
        if (continuationImpl instanceof ProductsParamsStateFactoryImpl$getProductsParamsState$1) {
            productsParamsStateFactoryImpl$getProductsParamsState$1 = (ProductsParamsStateFactoryImpl$getProductsParamsState$1) continuationImpl;
            int i2 = productsParamsStateFactoryImpl$getProductsParamsState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$getProductsParamsState$1.label = i2 - Integer.MIN_VALUE;
                ProductsParamsStateFactoryImpl$getProductsParamsState$1 productsParamsStateFactoryImpl$getProductsParamsState$12 = productsParamsStateFactoryImpl$getProductsParamsState$1;
                Object obj = productsParamsStateFactoryImpl$getProductsParamsState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$getProductsParamsState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Location a = this.b.a();
                    if (a != null) {
                        zzs.Companion.getClass();
                        zzsVar = uzs.b(a);
                    } else {
                        zzsVar = zzs.f;
                    }
                    zzsVar2 = zzsVar;
                    haf0 b = b(((com.yandex.go.taxi.tariffs.internal.repository.k) this.k).n());
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$0 = list;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$1 = arrayList;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$2 = arrayList2;
                    yaf0Var2 = yaf0Var;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$3 = yaf0Var2;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$4 = null;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.L$5 = zzsVar2;
                    z = false;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.Z$0 = false;
                    productsParamsStateFactoryImpl$getProductsParamsState$12.label = 1;
                    obj = d(b, productsParamsStateFactoryImpl$getProductsParamsState$12);
                    if (obj != coroutineSingletons) {
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        uc4Var = null;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                boolean z2 = productsParamsStateFactoryImpl$getProductsParamsState$12.Z$0;
                zzsVar2 = (zzs) productsParamsStateFactoryImpl$getProductsParamsState$12.L$5;
                uc4 uc4Var2 = (uc4) productsParamsStateFactoryImpl$getProductsParamsState$12.L$4;
                yaf0 yaf0Var3 = (yaf0) productsParamsStateFactoryImpl$getProductsParamsState$12.L$3;
                ?? r7 = (List) productsParamsStateFactoryImpl$getProductsParamsState$12.L$2;
                ?? r8 = (List) productsParamsStateFactoryImpl$getProductsParamsState$12.L$1;
                List list2 = (List) productsParamsStateFactoryImpl$getProductsParamsState$12.L$0;
                kotlin.b.b(obj);
                z = z2;
                list = list2;
                uc4Var = uc4Var2;
                arrayList3 = r8;
                yaf0Var2 = yaf0Var3;
                arrayList4 = r7;
                zzs zzsVar3 = zzsVar2;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$0 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$1 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$2 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$3 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$4 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.L$5 = null;
                productsParamsStateFactoryImpl$getProductsParamsState$12.Z$0 = z;
                productsParamsStateFactoryImpl$getProductsParamsState$12.label = 2;
                Object a2 = a(list, yaf0Var2, arrayList3, arrayList4, zzsVar3, (haf0) obj, z, uc4Var, productsParamsStateFactoryImpl$getProductsParamsState$12);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        productsParamsStateFactoryImpl$getProductsParamsState$1 = new ProductsParamsStateFactoryImpl$getProductsParamsState$1(this, continuationImpl);
        ProductsParamsStateFactoryImpl$getProductsParamsState$1 productsParamsStateFactoryImpl$getProductsParamsState$122 = productsParamsStateFactoryImpl$getProductsParamsState$1;
        Object obj2 = productsParamsStateFactoryImpl$getProductsParamsState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$getProductsParamsState$122.label;
        if (i != 0) {
        }
        zzs zzsVar32 = zzsVar2;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$0 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$1 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$2 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$3 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$4 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.L$5 = null;
        productsParamsStateFactoryImpl$getProductsParamsState$122.Z$0 = z;
        productsParamsStateFactoryImpl$getProductsParamsState$122.label = 2;
        Object a22 = a(list, yaf0Var2, arrayList3, arrayList4, zzsVar32, (haf0) obj2, z, uc4Var, productsParamsStateFactoryImpl$getProductsParamsState$122);
        if (a22 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(haf0 haf0Var, ContinuationImpl continuationImpl) {
        ProductsParamsStateFactoryImpl$handleEmptyTariff$1 productsParamsStateFactoryImpl$handleEmptyTariff$1;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof ProductsParamsStateFactoryImpl$handleEmptyTariff$1) {
            productsParamsStateFactoryImpl$handleEmptyTariff$1 = (ProductsParamsStateFactoryImpl$handleEmptyTariff$1) continuationImpl;
            int i2 = productsParamsStateFactoryImpl$handleEmptyTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$handleEmptyTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsParamsStateFactoryImpl$handleEmptyTariff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$handleEmptyTariff$1.label;
                ru.yandex.taxi.personalstate.domain.interactor.j jVar = this.j;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (haf0Var != haf0.c) {
                        return haf0Var;
                    }
                    productsParamsStateFactoryImpl$handleEmptyTariff$1.L$0 = haf0Var;
                    productsParamsStateFactoryImpl$handleEmptyTariff$1.label = 1;
                    obj = jVar.c(productsParamsStateFactoryImpl$handleEmptyTariff$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) productsParamsStateFactoryImpl$handleEmptyTariff$1.L$1;
                        kotlin.b.b(obj);
                        return new haf0(str2, (hp40) obj);
                    }
                    haf0Var = (haf0) productsParamsStateFactoryImpl$handleEmptyTariff$1.L$0;
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return haf0Var;
                }
                productsParamsStateFactoryImpl$handleEmptyTariff$1.L$0 = null;
                productsParamsStateFactoryImpl$handleEmptyTariff$1.L$1 = str;
                productsParamsStateFactoryImpl$handleEmptyTariff$1.label = 2;
                Object b = jVar.b(productsParamsStateFactoryImpl$handleEmptyTariff$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    str2 = str;
                    return new haf0(str2, (hp40) obj);
                }
                return coroutineSingletons;
            }
        }
        productsParamsStateFactoryImpl$handleEmptyTariff$1 = new ProductsParamsStateFactoryImpl$handleEmptyTariff$1(this, continuationImpl);
        Object obj2 = productsParamsStateFactoryImpl$handleEmptyTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$handleEmptyTariff$1.label;
        ru.yandex.taxi.personalstate.domain.interactor.j jVar2 = this.j;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ProductsParamsStateFactoryImpl$languageInfo$1 productsParamsStateFactoryImpl$languageInfo$1;
        int i;
        List b;
        if (continuationImpl instanceof ProductsParamsStateFactoryImpl$languageInfo$1) {
            productsParamsStateFactoryImpl$languageInfo$1 = (ProductsParamsStateFactoryImpl$languageInfo$1) continuationImpl;
            int i2 = productsParamsStateFactoryImpl$languageInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$languageInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsParamsStateFactoryImpl$languageInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$languageInfo$1.label;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        b = ((ru.yandex.taxi.h) this.e.get()).b();
                    } catch (Throwable th) {
                        jst.e.s(th);
                        if (!qyy0.a()) {
                            this.i.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            ProductsParamsStateFactoryImpl$languageInfo$mobileNetworks$1 productsParamsStateFactoryImpl$languageInfo$mobileNetworks$1 = new ProductsParamsStateFactoryImpl$languageInfo$mobileNetworks$1(this, null);
                            productsParamsStateFactoryImpl$languageInfo$1.L$0 = null;
                            productsParamsStateFactoryImpl$languageInfo$1.label = 1;
                            obj = tje.k0(g6uVar, productsParamsStateFactoryImpl$languageInfo$mobileNetworks$1, productsParamsStateFactoryImpl$languageInfo$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return new srx(b, ((el00) this.h.get()).d());
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                list = (List) obj;
                b = list;
                return new srx(b, ((el00) this.h.get()).d());
            }
        }
        productsParamsStateFactoryImpl$languageInfo$1 = new ProductsParamsStateFactoryImpl$languageInfo$1(this, continuationImpl);
        Object obj2 = productsParamsStateFactoryImpl$languageInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$languageInfo$1.label;
        List list2 = null;
        if (i != 0) {
        }
        list2 = (List) obj2;
        b = list2;
        return new srx(b, ((el00) this.h.get()).d());
    }
}
