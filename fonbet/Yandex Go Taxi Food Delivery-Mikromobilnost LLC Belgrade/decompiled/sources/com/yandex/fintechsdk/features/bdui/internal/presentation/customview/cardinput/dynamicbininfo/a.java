package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsDataSource;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsErrorType;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsResetReason;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.a5n;
import defpackage.b5n;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.eh8;
import defpackage.et5;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.hh8;
import defpackage.ike;
import defpackage.jh8;
import defpackage.jl40;
import defpackage.li3;
import defpackage.ny61;
import defpackage.ot5;
import defpackage.pj8;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.urm;
import defpackage.wj8;
import defpackage.wls;
import defpackage.yz91;
import defpackage.z22;
import defpackage.zc7;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final z22 a;
    public final a5n b;
    public final wls c;
    public final boolean d;
    public final eh8 e;
    public final hh8 f;
    public final eh8 g;
    public final jh8 h;
    public final jh8 i;
    public pzt0 k;
    public final ike j = bvf0.b();
    public final LinkedHashMap l = new LinkedHashMap();
    public final LinkedHashMap m = new LinkedHashMap();
    public final LinkedHashMap n = new LinkedHashMap();
    public final LinkedHashMap o = new LinkedHashMap();
    public final LinkedHashMap p = new LinkedHashMap();

    public a(z22 z22Var, a5n a5nVar, wls wlsVar, boolean z, eh8 eh8Var, hh8 hh8Var, eh8 eh8Var2, jh8 jh8Var, jh8 jh8Var2) {
        this.a = z22Var;
        this.b = a5nVar;
        this.c = wlsVar;
        this.d = z;
        this.e = eh8Var;
        this.f = hh8Var;
        this.g = eh8Var2;
        this.h = jh8Var;
        this.i = jh8Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ot5 ot5Var, ContinuationImpl continuationImpl) {
        DynamicBinInfoManager$requestBin$1 dynamicBinInfoManager$requestBin$1;
        int i;
        LinkedHashMap linkedHashMap;
        a5n a5nVar;
        Object obj;
        Object obj2;
        ot5 ot5Var2;
        int i2;
        b5n b5nVar;
        String str;
        zc7 zc7Var;
        Object value;
        int i3;
        Object obj3;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        wls wlsVar;
        LinkedHashMap linkedHashMap4;
        Object obj4;
        Object obj5;
        Throwable a;
        boolean z;
        LinkedHashMap linkedHashMap5;
        ot5 ot5Var3;
        String str2;
        String str3;
        et5 et5Var;
        wj8 wj8Var;
        a5n a5nVar2 = aVar.b;
        eh8 eh8Var = aVar.g;
        LinkedHashMap linkedHashMap6 = aVar.p;
        wls wlsVar2 = aVar.f;
        LinkedHashMap linkedHashMap7 = aVar.l;
        LinkedHashMap linkedHashMap8 = aVar.n;
        boolean z2 = aVar.d;
        z22 z22Var = aVar.a;
        LinkedHashMap linkedHashMap9 = aVar.m;
        if (continuationImpl instanceof DynamicBinInfoManager$requestBin$1) {
            dynamicBinInfoManager$requestBin$1 = (DynamicBinInfoManager$requestBin$1) continuationImpl;
            int i4 = dynamicBinInfoManager$requestBin$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dynamicBinInfoManager$requestBin$1.label = i4 - Integer.MIN_VALUE;
                Object obj6 = dynamicBinInfoManager$requestBin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicBinInfoManager$requestBin$1.label;
                Object obj7 = obj6;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj7);
                    String str4 = ot5Var.b;
                    DynamicBinInfoManager$requestBin$1 dynamicBinInfoManager$requestBin$12 = dynamicBinInfoManager$requestBin$1;
                    long j = ot5Var.d;
                    String str5 = ot5Var.a;
                    String str6 = ot5Var.c;
                    b5n b5nVar2 = new b5n(str4);
                    linkedHashMap8.put(str4, str6);
                    linkedHashMap = linkedHashMap8;
                    int length = str5.length();
                    String str7 = (String) aVar.h.invoke(str5);
                    RequestState requestState = (RequestState) linkedHashMap9.get(str4);
                    RequestState requestState2 = RequestState.SUCCESS;
                    int i5 = b5nVar2.b;
                    String str8 = b5nVar2.a;
                    if (requestState == requestState2 && (zc7Var = (zc7) linkedHashMap7.get(str4)) != null) {
                        et5 et5Var2 = zc7Var.b;
                        int length2 = str4.length();
                        if (length2 == 3 || length2 == 8) {
                            yz91.c(z22Var, new li3(9, DynamicBinInfoEventName.REQUEST_CACHED.a(), kotlin.collections.b.i(new Pair(AppSettingsContract$Setting.COLUMN_PREFIX, str8), new Pair("prefix_length", String.valueOf(i5)), new Pair("payment_system", et5Var2.a))), z2);
                        }
                        wlsVar2.invoke(et5Var2, ot5Var);
                        return zy11Var;
                    }
                    RequestState requestState3 = (RequestState) linkedHashMap9.get(str4);
                    RequestState requestState4 = RequestState.PENDING;
                    if (requestState3 != requestState4) {
                        linkedHashMap9.put(str4, requestState4);
                        aVar.o.put(str4, Long.valueOf(j));
                        int length3 = str4.length();
                        if (length3 == 3 || length3 == 8) {
                            if (a5nVar2.a == null) {
                                a5nVar2.a = Long.valueOf(j);
                            }
                            String a2 = DynamicBinInfoEventName.REQUEST_STARTED.a();
                            a5nVar = a5nVar2;
                            Pair pair = new Pair(AppSettingsContract$Setting.COLUMN_PREFIX, str8);
                            String valueOf = String.valueOf(i5);
                            obj = AppSettingsContract$Setting.COLUMN_PREFIX;
                            obj2 = "prefix_length";
                            yz91.c(z22Var, new li3(11, a2, kotlin.collections.b.i(pair, new Pair("prefix_length", valueOf), new Pair("card_number_length", String.valueOf(length)), new Pair("request_id", str6))), z2);
                        } else {
                            obj = AppSettingsContract$Setting.COLUMN_PREFIX;
                            a5nVar = a5nVar2;
                            obj2 = "prefix_length";
                        }
                        wls wlsVar3 = aVar.c;
                        ot5Var2 = ot5Var;
                        dynamicBinInfoManager$requestBin$12.L$0 = ot5Var2;
                        dynamicBinInfoManager$requestBin$12.L$1 = b5nVar2;
                        dynamicBinInfoManager$requestBin$12.L$2 = str7;
                        dynamicBinInfoManager$requestBin$12.I$0 = length;
                        dynamicBinInfoManager$requestBin$12.label = 1;
                        Object invoke = wlsVar3.invoke(str4, dynamicBinInfoManager$requestBin$12);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj7 = invoke;
                        i2 = length;
                        b5nVar = b5nVar2;
                        str = str7;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = dynamicBinInfoManager$requestBin$1.I$0;
                str = (String) dynamicBinInfoManager$requestBin$1.L$2;
                b5nVar = (b5n) dynamicBinInfoManager$requestBin$1.L$1;
                ot5 ot5Var4 = (ot5) dynamicBinInfoManager$requestBin$1.L$0;
                b.b(obj7);
                obj = AppSettingsContract$Setting.COLUMN_PREFIX;
                a5nVar = a5nVar2;
                obj2 = "prefix_length";
                linkedHashMap = linkedHashMap8;
                ot5Var2 = ot5Var4;
                value = ((Result) obj7).getValue();
                if (value instanceof Result.Failure) {
                    et5 et5Var3 = (et5) value;
                    RequestState requestState5 = (RequestState) linkedHashMap9.get(ot5Var2.b);
                    i3 = i2;
                    String str9 = ot5Var2.b;
                    obj3 = value;
                    LinkedHashMap linkedHashMap10 = linkedHashMap;
                    obj5 = "card_number_length";
                    String str10 = (String) linkedHashMap10.get(str9);
                    linkedHashMap4 = linkedHashMap10;
                    String str11 = ot5Var2.c;
                    if (jl40.l(str10, str11) && requestState5 == RequestState.PENDING) {
                        linkedHashMap9.put(str9, RequestState.SUCCESS);
                        String str12 = et5Var3.a;
                        linkedHashMap6.put(str9, str12);
                        linkedHashMap7.put(str9, new zc7(str9, et5Var3, ot5Var2));
                        pj8 pj8Var = (pj8) aVar.i.invoke(str12);
                        linkedHashMap2 = linkedHashMap7;
                        int length4 = str9.length();
                        linkedHashMap3 = linkedHashMap9;
                        if (length4 == 3 || length4 == 8) {
                            if (pj8Var == null || (wj8Var = pj8Var.a) == null || (str2 = wj8Var.a) == null || evu0.J(str2)) {
                                str2 = null;
                            }
                            boolean z3 = pj8Var != null;
                            long j2 = ot5Var2.d;
                            Boolean valueOf2 = str != null ? Boolean.valueOf(str.equals(str12)) : null;
                            boolean z4 = et5Var3.b;
                            String a3 = DynamicBinInfoEventName.REQUEST_SUCCESS.a();
                            boolean z5 = z3;
                            MapBuilder mapBuilder = new MapBuilder();
                            str3 = str9;
                            et5Var = et5Var3;
                            mapBuilder.put(obj, b5nVar.a);
                            obj4 = obj2;
                            mapBuilder.put(obj4, String.valueOf(b5nVar.b));
                            mapBuilder.put("payment_system", str12);
                            mapBuilder.put("without_cvn", String.valueOf(z4));
                            mapBuilder.put("has_icon_url", String.valueOf(str2 != null));
                            mapBuilder.put("request_id", str11);
                            mapBuilder.put("network_found_in_tovarish", String.valueOf(z5));
                            mapBuilder.put("request_duration_ms", String.valueOf(System.currentTimeMillis() - j2));
                            if (str2 != null) {
                                mapBuilder.put("icon_url", str2);
                            }
                            if (str != null) {
                                mapBuilder.put("static_payment_system", str);
                            }
                            String bool = valueOf2 != null ? valueOf2.toString() : null;
                            if (bool != null) {
                                mapBuilder.put("systems_match", bool);
                            }
                            yz91.c(z22Var, new li3(12, a3, mapBuilder.j()), z2);
                        } else {
                            str3 = str9;
                            et5Var = et5Var3;
                            obj4 = obj2;
                        }
                        aVar.h(ot5Var2.a);
                        String str13 = (String) aVar.e.invoke();
                        if (str13.length() <= 0 || !cvu0.x(str13, str3, false)) {
                            wlsVar = wlsVar2;
                            if (str13.length() < 3) {
                                eh8Var.invoke();
                            } else {
                                zc7 c = aVar.c(str13);
                                if (c != null) {
                                    wlsVar.invoke(c.b, c.c);
                                } else {
                                    eh8Var.invoke();
                                }
                            }
                        } else {
                            wlsVar = wlsVar2;
                            wlsVar.invoke(et5Var, ot5Var2);
                        }
                    } else {
                        linkedHashMap2 = linkedHashMap7;
                        linkedHashMap3 = linkedHashMap9;
                        wlsVar = wlsVar2;
                        obj4 = obj2;
                    }
                } else {
                    i3 = i2;
                    obj3 = value;
                    linkedHashMap2 = linkedHashMap7;
                    linkedHashMap3 = linkedHashMap9;
                    wlsVar = wlsVar2;
                    linkedHashMap4 = linkedHashMap;
                    obj4 = obj2;
                    obj5 = "card_number_length";
                }
                a = Result.a(obj3);
                if (a != null) {
                    String str14 = ot5Var2.b;
                    String str15 = ot5Var2.a;
                    LinkedHashMap linkedHashMap11 = linkedHashMap3;
                    RequestState requestState6 = (RequestState) linkedHashMap11.get(str14);
                    String str16 = ot5Var2.b;
                    String str17 = (String) linkedHashMap4.get(str16);
                    wls wlsVar4 = wlsVar;
                    String str18 = ot5Var2.c;
                    if (jl40.l(str17, str18) && requestState6 == RequestState.PENDING) {
                        linkedHashMap11.put(str16, RequestState.FAILED);
                        linkedHashMap6.put(str16, null);
                        boolean isEmpty = linkedHashMap2.isEmpty();
                        int length5 = str16.length();
                        if (length5 == 3 || length5 == 8) {
                            String message = a.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType = DynamicBinInfoAnalyticsErrorType.NETWORK_ERROR;
                            z = isEmpty;
                            long j3 = ot5Var2.d;
                            String a4 = DynamicBinInfoEventName.REQUEST_FAILED.a();
                            MapBuilder mapBuilder2 = new MapBuilder();
                            linkedHashMap5 = linkedHashMap11;
                            ot5Var3 = ot5Var2;
                            mapBuilder2.put(obj, b5nVar.a);
                            mapBuilder2.put(obj4, String.valueOf(b5nVar.b));
                            mapBuilder2.put("error_type", dynamicBinInfoAnalyticsErrorType.getValue());
                            mapBuilder2.put("error_message", message);
                            mapBuilder2.put("will_fallback", String.valueOf(z));
                            mapBuilder2.put("request_id", str18);
                            mapBuilder2.put("request_duration_ms", String.valueOf(System.currentTimeMillis() - j3));
                            if (str != null) {
                                mapBuilder2.put("static_payment_system", str);
                            }
                            yz91.c(z22Var, new li3(10, a4, mapBuilder2.j()), z2);
                        } else {
                            z = isEmpty;
                            ot5Var3 = ot5Var2;
                            linkedHashMap5 = linkedHashMap11;
                        }
                        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap5.entrySet()) {
                            if (entry.getValue() == RequestState.FAILED) {
                                linkedHashMap12.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap12.keySet();
                        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
                        Iterator it = keySet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new b5n((String) it.next()));
                        }
                        int size = linkedHashMap5.size();
                        int size2 = arrayList.size();
                        if (z) {
                            DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource = DynamicBinInfoAnalyticsDataSource.LOCAL;
                            Long l = a5nVar.a;
                            Long valueOf3 = l != null ? Long.valueOf(System.currentTimeMillis() - l.longValue()) : null;
                            String a5 = DynamicBinInfoEventName.FALLBACK_TO_STATIC.a();
                            MapBuilder mapBuilder3 = new MapBuilder();
                            mapBuilder3.put(obj5, String.valueOf(i3));
                            mapBuilder3.put("failed_prefixes", kotlin.collections.a.X(arrayList, ",", null, null, new urm(14), 30));
                            mapBuilder3.put("total_requests_count", String.valueOf(size));
                            mapBuilder3.put("failed_requests_count", String.valueOf(size2));
                            mapBuilder3.put("icon_source", dynamicBinInfoAnalyticsDataSource.getValue());
                            if (str != null) {
                                mapBuilder3.put("static_payment_system", str);
                            }
                            String l2 = valueOf3 != null ? valueOf3.toString() : null;
                            if (l2 != null) {
                                mapBuilder3.put("time_since_first_request_ms", l2);
                            }
                            yz91.c(z22Var, new li3(4, a5, mapBuilder3.j()), z2);
                        }
                        aVar.h(str15);
                        zc7 c2 = aVar.c(str15);
                        et5 et5Var4 = c2 != null ? c2.b : null;
                        if (et5Var4 != null) {
                            wlsVar4.invoke(et5Var4, ot5Var3);
                            return zy11Var;
                        }
                        eh8Var.invoke();
                    }
                }
                return zy11Var;
            }
        }
        dynamicBinInfoManager$requestBin$1 = new DynamicBinInfoManager$requestBin$1(aVar, continuationImpl);
        Object obj62 = dynamicBinInfoManager$requestBin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicBinInfoManager$requestBin$1.label;
        Object obj72 = obj62;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        value = ((Result) obj72).getValue();
        if (value instanceof Result.Failure) {
        }
        a = Result.a(obj3);
        if (a != null) {
        }
        return zy11Var2;
    }

    public final ArrayList b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.m.entrySet()) {
            if (((RequestState) entry.getValue()) == RequestState.FAILED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(new b5n((String) it.next()));
        }
        return arrayList;
    }

    public final zc7 c(String str) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.l.entrySet()) {
            if (cvu0.x(str, (String) entry.getKey(), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((String) ((Map.Entry) next).getKey()).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) ((Map.Entry) next2).getKey()).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (zc7) entry2.getValue();
        }
        return null;
    }

    public final ArrayList d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.m.entrySet()) {
            if (((RequestState) entry.getValue()) == RequestState.PENDING) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(new b5n((String) it.next()));
        }
        return arrayList;
    }

    public final ArrayList e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.m.entrySet()) {
            if (((RequestState) entry.getValue()) == RequestState.SUCCESS) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(new b5n((String) it.next()));
        }
        return arrayList;
    }

    public final boolean f() {
        Collection values = this.m.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((RequestState) it.next()) == RequestState.PENDING) {
                return true;
            }
        }
        return false;
    }

    public final void g(String str, boolean z) {
        String v = cvu0.v(str, " ", "", false);
        if (v.length() < 3) {
            return;
        }
        int i = 8;
        if (!z || v.length() < 8) {
            if (v.length() != 3) {
                if (v.length() != 8) {
                    if (!z) {
                        return;
                    }
                }
            }
            i = 3;
        }
        String A0 = gvu0.A0(i, v);
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = tje.N(this.j, null, null, new DynamicBinInfoManager$load$1(v, A0, this, null), 3);
    }

    public final void h(String str) {
        RequestState requestState;
        String A0 = gvu0.A0(3, str);
        String A02 = gvu0.A0(8, str);
        LinkedHashMap linkedHashMap = this.m;
        RequestState requestState2 = (RequestState) linkedHashMap.get(A0);
        RequestState requestState3 = (RequestState) linkedHashMap.get(A02);
        if (requestState2 == null || requestState3 == null || requestState2 == (requestState = RequestState.PENDING) || requestState3 == requestState) {
            return;
        }
        LinkedHashMap linkedHashMap2 = this.o;
        Long l = (Long) linkedHashMap2.get(A0);
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = (Long) linkedHashMap2.get(A02);
            if (l2 != null) {
                long longValue2 = l2.longValue();
                int currentTimeMillis = (int) (System.currentTimeMillis() - longValue);
                Integer valueOf = Integer.valueOf(currentTimeMillis);
                if (currentTimeMillis < 0) {
                    valueOf = null;
                }
                int currentTimeMillis2 = (int) (System.currentTimeMillis() - longValue2);
                Integer valueOf2 = Integer.valueOf(currentTimeMillis2);
                if (currentTimeMillis2 < 0) {
                    valueOf2 = null;
                }
                LinkedHashMap linkedHashMap3 = this.p;
                String str2 = (String) linkedHashMap3.get(A0);
                String str3 = (String) linkedHashMap3.get(A02);
                Boolean valueOf3 = (str2 == null || str3 == null) ? null : Boolean.valueOf(str2.equalsIgnoreCase(str3));
                RequestState requestState4 = RequestState.SUCCESS;
                String str4 = (requestState2 == requestState4 && requestState3 == requestState4) ? "both" : requestState3 == requestState4 ? "8" : requestState2 == requestState4 ? "3" : "none";
                String value = requestState2.getValue();
                String value2 = requestState3.getValue();
                if (str4.length() > 6) {
                    str4 = gvu0.A0(6, str4).concat("**");
                }
                String a = DynamicBinInfoEventName.REQUESTS_RACE.a();
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("prefix_3_status", value);
                mapBuilder.put("prefix_8_status", value2);
                mapBuilder.put("used_prefix", str4);
                String num = valueOf != null ? valueOf.toString() : null;
                if (num != null) {
                    mapBuilder.put("prefix_3_duration_ms", num);
                }
                String num2 = valueOf2 != null ? valueOf2.toString() : null;
                if (num2 != null) {
                    mapBuilder.put("prefix_8_duration_ms", num2);
                }
                if (str2 != null) {
                    mapBuilder.put("payment_system_3", str2);
                }
                if (str3 != null) {
                    mapBuilder.put("payment_system_8", str3);
                }
                String bool = valueOf3 != null ? valueOf3.toString() : null;
                if (bool != null) {
                    mapBuilder.put("systems_match", bool);
                }
                yz91.c(this.a, new li3(13, a, mapBuilder.j()), this.d);
            }
        }
    }

    public final void i(int i, DynamicBinInfoAnalyticsResetReason dynamicBinInfoAnalyticsResetReason) {
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        LinkedHashMap linkedHashMap = this.m;
        Set keySet = linkedHashMap.keySet();
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(new b5n((String) it.next()));
        }
        linkedHashMap.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.l.clear();
        if (dynamicBinInfoAnalyticsResetReason != DynamicBinInfoAnalyticsResetReason.PREFIX_CHANGED) {
            yz91.c(this.a, new li3(2, DynamicBinInfoEventName.DATA_RESET.a(), kotlin.collections.b.i(new Pair("previous_prefixes", kotlin.collections.a.X(arrayList, ",", null, null, new urm(i2), 30)), new Pair("card_number_length", String.valueOf(i)), new Pair("reset_reason", dynamicBinInfoAnalyticsResetReason.getValue()))), this.d);
            this.b.a = null;
        }
    }
}
