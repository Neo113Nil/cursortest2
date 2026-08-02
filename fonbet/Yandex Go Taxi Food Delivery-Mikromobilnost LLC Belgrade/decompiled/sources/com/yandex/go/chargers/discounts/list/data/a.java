package com.yandex.go.chargers.discounts.list.data;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.data.ChargersDiscountsApi;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$ProgressDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$RentalPromoItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListParams;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListResponse;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsToggleDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsViewedParams;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.cy9;
import defpackage.ejb1;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.hfa0;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.lpa;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.po21;
import defpackage.rpa;
import defpackage.tcc;
import defpackage.tsa;
import defpackage.v4r0;
import defpackage.xu9;
import defpackage.ycc;
import defpackage.yu9;
import defpackage.yx9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final po21 a;
    public final h3y b;
    public final com.yandex.go.chargers.error.data.a c;
    public final f d;
    public final lpa e;
    public final rpa f;
    public final com.yandex.go.chargers.payments.data.a g;
    public final r0 h = bvf0.c(EmptySet.a);

    public a(po21 po21Var, h3y h3yVar, com.yandex.go.chargers.error.data.a aVar, f fVar, lpa lpaVar, rpa rpaVar, com.yandex.go.chargers.payments.data.a aVar2) {
        this.a = po21Var;
        this.b = h3yVar;
        this.c = aVar;
        this.d = fVar;
        this.e = lpaVar;
        this.f = rpaVar;
        this.g = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(16:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(6:18|19|20|(1:22)|23|24))(1:26))(3:42|(1:44)|39)|27|(1:29)(1:41)|(1:31)|32|33|(1:35)(1:40)|36|(2:38|39)|20|(0)|23|24))|50|6|7|(0)(0)|27|(0)(0)|(0)|32|33|(0)(0)|36|(0)|20|(0)|23|24|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0187, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
    
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.L$5 = null;
        r2.L$6 = null;
        r2.L$7 = null;
        r2.L$8 = null;
        r2.label = 3;
        r0 = r17.c.a(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0172, code lost:
    
        if (r0 != r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: all -> 0x007f, CancellationException -> 0x0186, TryCatch #2 {CancellationException -> 0x0186, all -> 0x007f, blocks: (B:19:0x007a, B:20:0x0139, B:23:0x014e, B:33:0x00e7, B:35:0x0103, B:36:0x010e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hfa0 hfa0Var, String str, tsa tsaVar, ContinuationImpl continuationImpl) {
        ChargersDiscountsListRepository$getDiscountsList$1 chargersDiscountsListRepository$getDiscountsList$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        hfa0 hfa0Var2;
        Object h;
        String str2;
        tsa tsaVar2;
        List c;
        String a;
        if (continuationImpl instanceof ChargersDiscountsListRepository$getDiscountsList$1) {
            chargersDiscountsListRepository$getDiscountsList$1 = (ChargersDiscountsListRepository$getDiscountsList$1) continuationImpl;
            int i2 = chargersDiscountsListRepository$getDiscountsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListRepository$getDiscountsList$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersDiscountsListRepository$getDiscountsList$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListRepository$getDiscountsList$1.label;
                if (i != 0) {
                    b.b(obj);
                    r0 r0Var = this.h;
                    r0Var.getClass();
                    r0Var.m(null, EmptySet.a);
                    hfa0Var2 = hfa0Var;
                    chargersDiscountsListRepository$getDiscountsList$1.L$0 = hfa0Var2;
                    chargersDiscountsListRepository$getDiscountsList$1.L$1 = str;
                    chargersDiscountsListRepository$getDiscountsList$1.L$2 = tsaVar;
                    chargersDiscountsListRepository$getDiscountsList$1.label = 1;
                    h = ((e) this.a).h(chargersDiscountsListRepository$getDiscountsList$1);
                    if (h != coroutineSingletons) {
                        str2 = str;
                        tsaVar2 = tsaVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj);
                        fmt fmtVar = (fmt) obj;
                        c((ChargersDiscountsListResponse) fmtVar.a);
                        a = fmtVar.e.a("X-YaTraceId");
                        if (a == null) {
                            a = "";
                        }
                        return new yu9((ChargersDiscountsListResponse) fmtVar.a, a);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    cy9 cy9Var = (cy9) obj;
                    yx9.a(ChargersError.Companion, ChargersError.DiscountsList, cy9Var.a, 4);
                    return new xu9(cy9Var);
                }
                tsaVar2 = (tsa) chargersDiscountsListRepository$getDiscountsList$1.L$2;
                String str3 = (String) chargersDiscountsListRepository$getDiscountsList$1.L$1;
                hfa0 hfa0Var3 = (hfa0) chargersDiscountsListRepository$getDiscountsList$1.L$0;
                b.b(obj);
                str2 = str3;
                h = obj;
                hfa0Var2 = hfa0Var3;
                mo21 mo21Var = (mo21) h;
                m6a0 d = hfa0Var2.d();
                c = d == null ? ejb1.c(d) : null;
                if (c == null) {
                    c = EmptyList.a;
                }
                List list = c;
                ow9 ow9Var = (ow9) kotlinx.coroutines.flow.e.d(this.f.y).a.getValue();
                Date b = this.g.b();
                ChargersDiscountsApi chargersDiscountsApi = (ChargersDiscountsApi) this.b.get();
                this.d.getClass();
                LinkedHashMap a2 = f.a();
                this.e.getClass();
                cmt<ChargersDiscountsListResponse> b2 = chargersDiscountsApi.b(a2, new ChargersDiscountsListParams(lpa.a(ow9Var, b), str2, tsaVar2 == null ? new ChargersStationDto(tsaVar2.a, tsaVar2.b, 4) : null, mo21Var.a(), list));
                chargersDiscountsListRepository$getDiscountsList$1.L$0 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$1 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$2 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$3 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$4 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$5 = null;
                chargersDiscountsListRepository$getDiscountsList$1.L$6 = null;
                chargersDiscountsListRepository$getDiscountsList$1.label = 2;
                obj = b2.a(chargersDiscountsListRepository$getDiscountsList$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fmt fmtVar2 = (fmt) obj;
                c((ChargersDiscountsListResponse) fmtVar2.a);
                a = fmtVar2.e.a("X-YaTraceId");
                if (a == null) {
                }
                return new yu9((ChargersDiscountsListResponse) fmtVar2.a, a);
            }
        }
        chargersDiscountsListRepository$getDiscountsList$1 = new ChargersDiscountsListRepository$getDiscountsList$1(this, continuationImpl);
        obj = chargersDiscountsListRepository$getDiscountsList$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListRepository$getDiscountsList$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) h;
        m6a0 d2 = hfa0Var2.d();
        if (d2 == null) {
        }
        if (c == null) {
        }
        List list2 = c;
        ow9 ow9Var2 = (ow9) kotlinx.coroutines.flow.e.d(this.f.y).a.getValue();
        Date b3 = this.g.b();
        ChargersDiscountsApi chargersDiscountsApi2 = (ChargersDiscountsApi) this.b.get();
        this.d.getClass();
        LinkedHashMap a22 = f.a();
        this.e.getClass();
        cmt<ChargersDiscountsListResponse> b22 = chargersDiscountsApi2.b(a22, new ChargersDiscountsListParams(lpa.a(ow9Var2, b3), str2, tsaVar2 == null ? new ChargersStationDto(tsaVar2.a, tsaVar2.b, 4) : null, mo21Var2.a(), list2));
        chargersDiscountsListRepository$getDiscountsList$1.L$0 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$1 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$2 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$3 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$4 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$5 = null;
        chargersDiscountsListRepository$getDiscountsList$1.L$6 = null;
        chargersDiscountsListRepository$getDiscountsList$1.label = 2;
        obj = b22.a(chargersDiscountsListRepository$getDiscountsList$1);
        if (obj == coroutineSingletons) {
        }
        fmt fmtVar22 = (fmt) obj;
        c((ChargersDiscountsListResponse) fmtVar22.a);
        a = fmtVar22.e.a("X-YaTraceId");
        if (a == null) {
        }
        return new yu9((ChargersDiscountsListResponse) fmtVar22.a, a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(3:16|(6:18|19|(2:22|20)|23|24|(1:26))|27)))|31|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        ChargersDiscountsListRepository$setTabItemsShown$1 chargersDiscountsListRepository$setTabItemsShown$1;
        int i;
        if (continuationImpl instanceof ChargersDiscountsListRepository$setTabItemsShown$1) {
            chargersDiscountsListRepository$setTabItemsShown$1 = (ChargersDiscountsListRepository$setTabItemsShown$1) continuationImpl;
            int i2 = chargersDiscountsListRepository$setTabItemsShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListRepository$setTabItemsShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountsListRepository$setTabItemsShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListRepository$setTabItemsShown$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                r0 r0Var = this.h;
                if (!((Set) r0Var.getValue()).contains(str)) {
                    r0Var.m(null, v4r0.i((Set) r0Var.getValue(), str));
                    ChargersDiscountsApi chargersDiscountsApi = (ChargersDiscountsApi) this.b.get();
                    this.d.getClass();
                    LinkedHashMap a = f.a();
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ir9 ir9Var = (ir9) it.next();
                        arrayList2.add(new ChargersDiscountDto(ir9Var.a, ir9Var.b));
                    }
                    cmt<zy11> a2 = chargersDiscountsApi.a(a, new ChargersDiscountsViewedParams(arrayList2));
                    chargersDiscountsListRepository$setTabItemsShown$1.L$0 = null;
                    chargersDiscountsListRepository$setTabItemsShown$1.L$1 = null;
                    chargersDiscountsListRepository$setTabItemsShown$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.d(a2, chargersDiscountsListRepository$setTabItemsShown$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        chargersDiscountsListRepository$setTabItemsShown$1 = new ChargersDiscountsListRepository$setTabItemsShown$1(this, continuationImpl);
        Object obj2 = chargersDiscountsListRepository$setTabItemsShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListRepository$setTabItemsShown$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final void c(ChargersDiscountsListResponse chargersDiscountsListResponse) {
        Collection collection;
        Object obj;
        ir9 ir9Var;
        List list = chargersDiscountsListResponse.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            collection = EmptyList.a;
            if (!hasNext) {
                break;
            }
            Collection collection2 = ((ChargersDiscountsTabDto) it.next()).d;
            if (collection2 != null) {
                collection = collection2;
            }
            ycc.r(collection, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof ChargersDiscountsItemDto$RentalPromoItemDto) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            ChargersDiscountsToggleDto chargersDiscountsToggleDto = ((ChargersDiscountsItemDto$RentalPromoItemDto) obj).f;
            if (chargersDiscountsToggleDto != null && chargersDiscountsToggleDto.b) {
                break;
            }
        }
        ChargersDiscountsItemDto$RentalPromoItemDto chargersDiscountsItemDto$RentalPromoItemDto = (ChargersDiscountsItemDto$RentalPromoItemDto) obj;
        if (chargersDiscountsItemDto$RentalPromoItemDto != null) {
            ChargersDiscountDto chargersDiscountDto = chargersDiscountsItemDto$RentalPromoItemDto.a;
            ChargersDiscountTypeDto chargersDiscountTypeDto = chargersDiscountDto.a;
            String str = chargersDiscountDto.b;
            ChargersDiscountsToggleDto chargersDiscountsToggleDto2 = chargersDiscountsItemDto$RentalPromoItemDto.f;
            ir9Var = new ir9(chargersDiscountTypeDto, str, chargersDiscountsToggleDto2 != null ? chargersDiscountsToggleDto2.c : null);
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                Collection collection3 = ((ChargersDiscountsTabDto) it4.next()).d;
                if (collection3 == null) {
                    collection3 = collection;
                }
                ycc.r(collection3, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (next2 instanceof ChargersDiscountsItemDto$ProgressDiscountItemDto) {
                    arrayList4.add(next2);
                }
            }
            ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto = (ChargersDiscountsItemDto$ProgressDiscountItemDto) kotlin.collections.a.R(arrayList4);
            if (chargersDiscountsItemDto$ProgressDiscountItemDto != null) {
                ChargersDiscountDto chargersDiscountDto2 = chargersDiscountsItemDto$ProgressDiscountItemDto.a;
                ir9Var = new ir9(chargersDiscountDto2.a, chargersDiscountDto2.b, null);
            } else {
                ir9Var = null;
            }
        }
        rpa rpaVar = this.f;
        ow9 ow9Var = (ow9) kotlinx.coroutines.flow.e.d(rpaVar.y).a.getValue();
        if (jl40.l(ir9Var != null ? ir9Var.b : null, ow9Var != null ? ow9Var.b : null)) {
            if ((ir9Var != null ? ir9Var.a : null) == (ow9Var != null ? ow9Var.a : null)) {
                return;
            }
        }
        rpaVar.Ig(ir9Var);
    }
}
