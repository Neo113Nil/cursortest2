package com.yandex.go.address.position_confirmation;

import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.MapAnalytics$BubbleButtonName;
import com.yandex.go.analytics.MapAnalytics$BubbleScreen;
import defpackage.if00;
import defpackage.jf00;
import defpackage.kf00;
import defpackage.kyb0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tcc;
import defpackage.xv21;
import defpackage.yne;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public final class a {
    public final kf00 a;
    public final po21 b;
    public final ru.yandex.taxi.search.suggest.i c;
    public final com.yandex.go.navigation.screen.c d;
    public final ru.yandex.taxi.preorder.source.userposition.a e;

    public a(kf00 kf00Var, po21 po21Var, ru.yandex.taxi.search.suggest.i iVar, com.yandex.go.navigation.screen.c cVar, ru.yandex.taxi.preorder.source.userposition.a aVar) {
        this.a = kf00Var;
        this.b = po21Var;
        this.c = iVar;
        this.d = cVar;
        this.e = aVar;
    }

    public static jf00 a(yne yneVar) {
        String lowerCase = yneVar.c.name().toLowerCase(Locale.ROOT);
        Integer valueOf = Integer.valueOf(yneVar.b);
        Integer valueOf2 = Integer.valueOf(yneVar.a);
        String a = xv21.a(yneVar.e);
        Double d = yneVar.f;
        Integer num = yneVar.h;
        zzs zzsVar = yneVar.d;
        return new jf00(lowerCase, valueOf, valueOf2, a, d, num, new if00(zzsVar.b, zzsVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, MapAnalytics$BubbleButtonName mapAnalytics$BubbleButtonName, ContinuationImpl continuationImpl) {
        PinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1 pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen;
        MapAnalytics$BubbleButtonName mapAnalytics$BubbleButtonName2;
        Object g;
        zzs zzsVar;
        String str3;
        MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen2;
        pv0 pv0Var;
        if (continuationImpl instanceof PinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1) {
            pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1 = (PinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1) continuationImpl;
            int i2 = pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = kyb0.a[this.d.b().ordinal()];
                    MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen3 = i3 != 1 ? i3 != 2 ? null : MapAnalytics$BubbleScreen.Summary : MapAnalytics$BubbleScreen.TaxiMain;
                    if (mapAnalytics$BubbleScreen3 != null) {
                        str2 = str;
                        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$0 = str2;
                        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$1 = mapAnalytics$BubbleButtonName;
                        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$2 = mapAnalytics$BubbleScreen3;
                        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label = 1;
                        Object h = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1);
                        if (h != coroutineSingletons) {
                            mapAnalytics$BubbleScreen = mapAnalytics$BubbleScreen3;
                            obj = h;
                            mapAnalytics$BubbleButtonName2 = mapAnalytics$BubbleButtonName;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar = (zzs) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$3;
                    mapAnalytics$BubbleScreen2 = (MapAnalytics$BubbleScreen) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$2;
                    mapAnalytics$BubbleButtonName2 = (MapAnalytics$BubbleButtonName) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$1;
                    str3 = (String) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$0;
                    kotlin.b.b(obj);
                    List list = (List) obj;
                    pv0Var = (pv0) this.c.i().orElse(null);
                    if (pv0Var != null) {
                        Address address = pv0Var.a;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a((yne) it.next()));
                        }
                        double d = address.B().a;
                        double d2 = address.B().b;
                        Double d3 = new Double(zzsVar.a);
                        Double d4 = new Double(zzsVar.b);
                        zzs a = pv0Var.a();
                        Double d5 = a != null ? new Double(a.a) : null;
                        zzs a2 = pv0Var.a();
                        Double d6 = a2 != null ? new Double(a2.b) : null;
                        kf00 kf00Var = this.a;
                        kf00Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", str3);
                        hashMap.put(MetaDataField.SCREEN_FIELD, mapAnalytics$BubbleScreen2.getEventValue());
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((jf00) it2.next()).h);
                        }
                        hashMap.put("coord_providers", arrayList2);
                        hashMap.put("pin_lat", Double.valueOf(d));
                        hashMap.put("pin_lon", Double.valueOf(d2));
                        hashMap.put("geo_lat", d3);
                        hashMap.put("geo_lon", d4);
                        if (d5 != null) {
                            hashMap.put("pin_2_lat", d5);
                        }
                        if (d6 != null) {
                            hashMap.put("pin_2_lon", d6);
                        }
                        hashMap.put("button_name", mapAnalytics$BubbleButtonName2.getEventValue());
                        kf00Var.a.a("Map.WhereAreYouBubble.Tapped", hashMap, 2, new HashMap());
                        return zy11Var;
                    }
                    return zy11Var;
                }
                MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen4 = (MapAnalytics$BubbleScreen) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$2;
                mapAnalytics$BubbleButtonName2 = (MapAnalytics$BubbleButtonName) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$1;
                String str4 = (String) pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$0;
                kotlin.b.b(obj);
                mapAnalytics$BubbleScreen = mapAnalytics$BubbleScreen4;
                str2 = str4;
                zzs a3 = ((mo21) obj).a();
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$0 = str2;
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$1 = mapAnalytics$BubbleButtonName2;
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$2 = mapAnalytics$BubbleScreen;
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$3 = a3;
                pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label = 2;
                g = this.e.g(pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1);
                if (g != coroutineSingletons) {
                    zzsVar = a3;
                    obj = g;
                    str3 = str2;
                    mapAnalytics$BubbleScreen2 = mapAnalytics$BubbleScreen;
                    List list3 = (List) obj;
                    pv0Var = (pv0) this.c.i().orElse(null);
                    if (pv0Var != null) {
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1 = new PinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1(this, continuationImpl);
        Object obj2 = pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        zzs a32 = ((mo21) obj2).a();
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$0 = str2;
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$1 = mapAnalytics$BubbleButtonName2;
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$2 = mapAnalytics$BubbleScreen;
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.L$3 = a32;
        pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1.label = 2;
        g = this.e.g(pinPositionConfirmationAnalytics$whereAreYouBubbleTapped$1);
        if (g != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PinPositionConfirmationAnalytics$whereYouAreBubbleShown$1 pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen;
        Object g;
        zzs zzsVar;
        String str3;
        MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen2;
        pv0 pv0Var;
        if (continuationImpl instanceof PinPositionConfirmationAnalytics$whereYouAreBubbleShown$1) {
            pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1 = (PinPositionConfirmationAnalytics$whereYouAreBubbleShown$1) continuationImpl;
            int i2 = pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = kyb0.a[this.d.b().ordinal()];
                    MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen3 = i3 != 1 ? i3 != 2 ? null : MapAnalytics$BubbleScreen.Summary : MapAnalytics$BubbleScreen.TaxiMain;
                    if (mapAnalytics$BubbleScreen3 != null) {
                        str2 = str;
                        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$0 = str2;
                        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$1 = mapAnalytics$BubbleScreen3;
                        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label = 1;
                        Object h = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1);
                        if (h != coroutineSingletons) {
                            mapAnalytics$BubbleScreen = mapAnalytics$BubbleScreen3;
                            obj = h;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar = (zzs) pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$2;
                    mapAnalytics$BubbleScreen2 = (MapAnalytics$BubbleScreen) pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$1;
                    str3 = (String) pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$0;
                    kotlin.b.b(obj);
                    List list = (List) obj;
                    pv0Var = (pv0) this.c.i().orElse(null);
                    if (pv0Var != null) {
                        Address address = pv0Var.a;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a((yne) it.next()));
                        }
                        double d = address.B().a;
                        double d2 = address.B().b;
                        Double d3 = new Double(zzsVar.a);
                        Double d4 = new Double(zzsVar.b);
                        zzs a = pv0Var.a();
                        Double d5 = a != null ? new Double(a.a) : null;
                        zzs a2 = pv0Var.a();
                        Double d6 = a2 != null ? new Double(a2.b) : null;
                        kf00 kf00Var = this.a;
                        kf00Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", str3);
                        hashMap.put(MetaDataField.SCREEN_FIELD, mapAnalytics$BubbleScreen2.getEventValue());
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((jf00) it2.next()).h);
                        }
                        hashMap.put("coord_providers", arrayList2);
                        hashMap.put("pin_lat", Double.valueOf(d));
                        hashMap.put("pin_lon", Double.valueOf(d2));
                        hashMap.put("geo_lat", d3);
                        hashMap.put("geo_lon", d4);
                        if (d5 != null) {
                            hashMap.put("pin_2_lat", d5);
                        }
                        if (d6 != null) {
                            hashMap.put("pin_2_lon", d6);
                        }
                        kf00Var.a.a("Map.WhereAreYouBubble.Shown", hashMap, 2, new HashMap());
                        return zy11Var;
                    }
                    return zy11Var;
                }
                MapAnalytics$BubbleScreen mapAnalytics$BubbleScreen4 = (MapAnalytics$BubbleScreen) pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$1;
                String str4 = (String) pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$0;
                kotlin.b.b(obj);
                mapAnalytics$BubbleScreen = mapAnalytics$BubbleScreen4;
                str2 = str4;
                zzs a3 = ((mo21) obj).a();
                pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$0 = str2;
                pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$1 = mapAnalytics$BubbleScreen;
                pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$2 = a3;
                pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label = 2;
                g = this.e.g(pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1);
                if (g != coroutineSingletons) {
                    zzsVar = a3;
                    obj = g;
                    str3 = str2;
                    mapAnalytics$BubbleScreen2 = mapAnalytics$BubbleScreen;
                    List list3 = (List) obj;
                    pv0Var = (pv0) this.c.i().orElse(null);
                    if (pv0Var != null) {
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1 = new PinPositionConfirmationAnalytics$whereYouAreBubbleShown$1(this, continuationImpl);
        Object obj2 = pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        zzs a32 = ((mo21) obj2).a();
        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$0 = str2;
        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$1 = mapAnalytics$BubbleScreen;
        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.L$2 = a32;
        pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1.label = 2;
        g = this.e.g(pinPositionConfirmationAnalytics$whereYouAreBubbleShown$1);
        if (g != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
