package com.yandex.go.navigator.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.navigator.domain.b0;
import defpackage.atd0;
import defpackage.dpa1;
import defpackage.jst;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.p53;
import defpackage.pe50;
import defpackage.qq80;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class d {
    public final wnt a;
    public final atd0 b;
    public final com.yandex.go.route.interactor.b c;
    public final b0 d;

    public d(wnt wntVar, atd0 atd0Var, com.yandex.go.route.interactor.b bVar, b0 b0Var) {
        this.a = wntVar;
        this.b = atd0Var;
        this.c = bVar;
        this.d = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e3 A[Catch: Exception -> 0x01ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ee, blocks: (B:13:0x0047, B:14:0x01ca, B:15:0x01d6, B:20:0x01e3, B:27:0x0086, B:29:0x0174, B:30:0x017b, B:31:0x0101, B:34:0x0109, B:36:0x012c, B:37:0x0139, B:42:0x018b, B:44:0x0194, B:48:0x0094, B:50:0x00c0, B:52:0x00ca, B:58:0x00e8, B:59:0x00ed, B:61:0x00a2, B:63:0x00b6, B:55:0x00d1), top: B:7:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[Catch: Exception -> 0x01ee, TRY_ENTER, TryCatch #0 {Exception -> 0x01ee, blocks: (B:13:0x0047, B:14:0x01ca, B:15:0x01d6, B:20:0x01e3, B:27:0x0086, B:29:0x0174, B:30:0x017b, B:31:0x0101, B:34:0x0109, B:36:0x012c, B:37:0x0139, B:42:0x018b, B:44:0x0194, B:48:0x0094, B:50:0x00c0, B:52:0x00ca, B:58:0x00e8, B:59:0x00ed, B:61:0x00a2, B:63:0x00b6, B:55:0x00d1), top: B:7:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:13:0x0047, B:14:0x01ca, B:15:0x01d6, B:20:0x01e3, B:27:0x0086, B:29:0x0174, B:30:0x017b, B:31:0x0101, B:34:0x0109, B:36:0x012c, B:37:0x0139, B:42:0x018b, B:44:0x0194, B:48:0x0094, B:50:0x00c0, B:52:0x00ca, B:58:0x00e8, B:59:0x00ed, B:61:0x00a2, B:63:0x00b6, B:55:0x00d1), top: B:7:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x012c -> B:29:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x016d -> B:28:0x0174). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        NavigatorDeeplinkInteractor$processDeeplink$1 navigatorDeeplinkInteractor$processDeeplink$1;
        int i;
        zzs zzsVar2;
        String str2;
        Object h;
        Address address;
        ListBuilder a;
        Collection collection;
        Collection arrayList;
        Iterator it;
        zzs zzsVar3;
        ListBuilder listBuilder;
        ListBuilder listBuilder2;
        boolean hasNext;
        tpr g;
        ListBuilder listBuilder3;
        Address address2;
        List list;
        tpr g2;
        ListBuilder j;
        try {
            if (continuationImpl instanceof NavigatorDeeplinkInteractor$processDeeplink$1) {
                navigatorDeeplinkInteractor$processDeeplink$1 = (NavigatorDeeplinkInteractor$processDeeplink$1) continuationImpl;
                int i2 = navigatorDeeplinkInteractor$processDeeplink$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    navigatorDeeplinkInteractor$processDeeplink$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = navigatorDeeplinkInteractor$processDeeplink$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = navigatorDeeplinkInteractor$processDeeplink$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        zzsVar2 = zzsVar;
                        navigatorDeeplinkInteractor$processDeeplink$1.L$0 = zzsVar2;
                        str2 = str;
                        navigatorDeeplinkInteractor$processDeeplink$1.L$1 = str2;
                        navigatorDeeplinkInteractor$processDeeplink$1.label = 1;
                        h = this.c.c().h();
                        if (h == null) {
                            h = this.d.a(navigatorDeeplinkInteractor$processDeeplink$1);
                        }
                        if (h == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                list = (List) navigatorDeeplinkInteractor$processDeeplink$1.L$5;
                                ?? r3 = (List) navigatorDeeplinkInteractor$processDeeplink$1.L$3;
                                address2 = (Address) navigatorDeeplinkInteractor$processDeeplink$1.L$2;
                                kotlin.b.b(obj);
                                listBuilder3 = r3;
                                list.add(new ne50((Address) obj));
                                listBuilder = listBuilder3;
                                address = address2;
                                j = listBuilder.j();
                                if (j.isEmpty()) {
                                    return new pe50(new oe50(address), j);
                                }
                                return null;
                            }
                            arrayList = (Collection) navigatorDeeplinkInteractor$processDeeplink$1.L$12;
                            Iterator it2 = (Iterator) navigatorDeeplinkInteractor$processDeeplink$1.L$9;
                            Collection collection2 = (Collection) navigatorDeeplinkInteractor$processDeeplink$1.L$8;
                            ?? r11 = (List) navigatorDeeplinkInteractor$processDeeplink$1.L$6;
                            ?? r12 = (List) navigatorDeeplinkInteractor$processDeeplink$1.L$4;
                            ?? r13 = (List) navigatorDeeplinkInteractor$processDeeplink$1.L$3;
                            Address address3 = (Address) navigatorDeeplinkInteractor$processDeeplink$1.L$2;
                            zzsVar3 = (zzs) navigatorDeeplinkInteractor$processDeeplink$1.L$0;
                            kotlin.b.b(obj);
                            char c = 2;
                            ListBuilder listBuilder4 = r11;
                            ListBuilder listBuilder5 = r12;
                            ListBuilder listBuilder6 = r13;
                            Address c2 = (Address) obj;
                            ListBuilder listBuilder7 = listBuilder4;
                            listBuilder = listBuilder6;
                            it = it2;
                            address = address3;
                            ListBuilder listBuilder8 = listBuilder5;
                            arrayList.add(new ne50(c2));
                            arrayList = collection2;
                            a = listBuilder8;
                            listBuilder2 = listBuilder7;
                            hasNext = it.hasNext();
                            atd0 atd0Var = this.b;
                            if (hasNext) {
                                NavigatorDeeplinkInteractor$DeeplinkRouteStopDto navigatorDeeplinkInteractor$DeeplinkRouteStopDto = (NavigatorDeeplinkInteractor$DeeplinkRouteStopDto) it.next();
                                Address address4 = address;
                                zzs zzsVar4 = new zzs(navigatorDeeplinkInteractor$DeeplinkRouteStopDto.a, navigatorDeeplinkInteractor$DeeplinkRouteStopDto.b, 0, null, null, 28);
                                String str3 = navigatorDeeplinkInteractor$DeeplinkRouteStopDto.c;
                                if (str3 != null) {
                                    c2 = dpa1.c(PlainAddress.Companion, zzsVar4, str3);
                                    address = address4;
                                    listBuilder7 = listBuilder2;
                                    c = 2;
                                    listBuilder8 = a;
                                    collection2 = arrayList;
                                    arrayList.add(new ne50(c2));
                                    arrayList = collection2;
                                    a = listBuilder8;
                                    listBuilder2 = listBuilder7;
                                    hasNext = it.hasNext();
                                    atd0 atd0Var2 = this.b;
                                    if (hasNext) {
                                        listBuilder2.addAll((List) arrayList);
                                        if (zzsVar3 != null) {
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$0 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$1 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$2 = address;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$3 = listBuilder;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$4 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$5 = a;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$6 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$7 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$8 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$9 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$10 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$11 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$12 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.L$13 = null;
                                            navigatorDeeplinkInteractor$processDeeplink$1.label = 3;
                                            g = ((i) atd0Var2).g(zzsVar3, null, RoutePointType.POINT_B, false, false, qq80.b, null);
                                            Object y = kotlinx.coroutines.flow.e.y(new c(g), navigatorDeeplinkInteractor$processDeeplink$1);
                                            if (y != coroutineSingletons) {
                                                listBuilder3 = listBuilder;
                                                address2 = address;
                                                obj = y;
                                                list = a;
                                                list.add(new ne50((Address) obj));
                                                listBuilder = listBuilder3;
                                                address = address2;
                                            }
                                        }
                                        j = listBuilder.j();
                                        if (j.isEmpty()) {
                                        }
                                    }
                                } else {
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$0 = zzsVar3;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$1 = null;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$2 = address4;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$3 = listBuilder;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$4 = a;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$5 = null;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$6 = listBuilder2;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$7 = null;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$8 = arrayList;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$9 = it;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$10 = null;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$11 = null;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$12 = arrayList;
                                    navigatorDeeplinkInteractor$processDeeplink$1.L$13 = null;
                                    c = 2;
                                    navigatorDeeplinkInteractor$processDeeplink$1.label = 2;
                                    g2 = ((i) atd0Var2).g(zzsVar4, null, RoutePointType.POINT_B, false, false, qq80.b, null);
                                    Object y2 = kotlinx.coroutines.flow.e.y(new c(g2), navigatorDeeplinkInteractor$processDeeplink$1);
                                    if (y2 != coroutineSingletons) {
                                        listBuilder6 = listBuilder;
                                        obj = y2;
                                        address3 = address4;
                                        it2 = it;
                                        listBuilder4 = listBuilder2;
                                        listBuilder5 = a;
                                        collection2 = arrayList;
                                        Address c22 = (Address) obj;
                                        ListBuilder listBuilder72 = listBuilder4;
                                        listBuilder = listBuilder6;
                                        it = it2;
                                        address = address3;
                                        ListBuilder listBuilder82 = listBuilder5;
                                        arrayList.add(new ne50(c22));
                                        arrayList = collection2;
                                        a = listBuilder82;
                                        listBuilder2 = listBuilder72;
                                        hasNext = it.hasNext();
                                        atd0 atd0Var22 = this.b;
                                        if (hasNext) {
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        str2 = (String) navigatorDeeplinkInteractor$processDeeplink$1.L$1;
                        zzs zzsVar5 = (zzs) navigatorDeeplinkInteractor$processDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        h = obj;
                        zzsVar2 = zzsVar5;
                    }
                    address = (Address) h;
                    a = rcc.a();
                    collection = EmptyList.a;
                    if (str2 != null && str2.length() != 0) {
                        try {
                            collection = (List) ((xnt) this.a).c(str2, new p53(NavigatorDeeplinkInteractor$DeeplinkRouteStopDto.Companion.serializer(), 0));
                        } catch (Exception unused) {
                            jst.e.getClass();
                        }
                    }
                    Collection collection3 = collection;
                    arrayList = new ArrayList(tcc.n(collection3, 10));
                    it = collection3.iterator();
                    zzsVar3 = zzsVar2;
                    listBuilder = a;
                    listBuilder2 = listBuilder;
                    hasNext = it.hasNext();
                    atd0 atd0Var222 = this.b;
                    if (hasNext) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            address = (Address) h;
            a = rcc.a();
            collection = EmptyList.a;
            if (str2 != null) {
                collection = (List) ((xnt) this.a).c(str2, new p53(NavigatorDeeplinkInteractor$DeeplinkRouteStopDto.Companion.serializer(), 0));
            }
            Collection collection32 = collection;
            arrayList = new ArrayList(tcc.n(collection32, 10));
            it = collection32.iterator();
            zzsVar3 = zzsVar2;
            listBuilder = a;
            listBuilder2 = listBuilder;
            hasNext = it.hasNext();
            atd0 atd0Var2222 = this.b;
            if (hasNext) {
            }
            return coroutineSingletons;
        } catch (Exception unused2) {
            return null;
        }
        navigatorDeeplinkInteractor$processDeeplink$1 = new NavigatorDeeplinkInteractor$processDeeplink$1(this, continuationImpl);
        Object obj2 = navigatorDeeplinkInteractor$processDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorDeeplinkInteractor$processDeeplink$1.label;
    }
}
