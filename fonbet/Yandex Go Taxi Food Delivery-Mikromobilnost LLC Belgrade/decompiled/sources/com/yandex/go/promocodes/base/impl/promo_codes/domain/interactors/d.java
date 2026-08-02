package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import defpackage.gno0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.knf0;
import defpackage.lnf0;
import defpackage.ny61;
import defpackage.rmf0;
import defpackage.wlf0;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c a;
    public final c b;
    public final gno0 c;

    public d(com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar, c cVar2, gno0 gno0Var) {
        this.a = cVar;
        this.b = cVar2;
        this.c = gno0Var;
    }

    public final wlf0 a(String str, List list) {
        com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar = this.a;
        lnf0 a = ((knf0) cVar.l.getValue()).a(cVar.i(), ((c) cVar.g.get()).a.a(), list);
        Object obj = null;
        Iterable iterable = a != null ? a.c : null;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ycc.r(((rmf0) it.next()).b, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (jl40.l(((wlf0) next).f, str)) {
                obj = next;
                break;
            }
        }
        return (wlf0) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, ContinuationImpl continuationImpl) {
        PromoCodesInteractor$requestPromoCodesListUpdate$3 promoCodesInteractor$requestPromoCodesListUpdate$3;
        int i;
        Object l;
        Throwable a;
        if (continuationImpl instanceof PromoCodesInteractor$requestPromoCodesListUpdate$3) {
            promoCodesInteractor$requestPromoCodesListUpdate$3 = (PromoCodesInteractor$requestPromoCodesListUpdate$3) continuationImpl;
            int i2 = promoCodesInteractor$requestPromoCodesListUpdate$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesInteractor$requestPromoCodesListUpdate$3.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodesInteractor$requestPromoCodesListUpdate$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesInteractor$requestPromoCodesListUpdate$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promoCodesInteractor$requestPromoCodesListUpdate$3.L$0 = null;
                    promoCodesInteractor$requestPromoCodesListUpdate$3.L$1 = null;
                    promoCodesInteractor$requestPromoCodesListUpdate$3.label = 1;
                    l = this.a.l(str, list, promoCodesInteractor$requestPromoCodesListUpdate$3);
                    if (l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    l = ((Result) obj).getValue();
                }
                a = Result.a(l);
                if (a != null) {
                    jst.e.k(a, "Failed to update promocodes");
                }
                return zy11.a;
            }
        }
        promoCodesInteractor$requestPromoCodesListUpdate$3 = new PromoCodesInteractor$requestPromoCodesListUpdate$3(this, continuationImpl);
        Object obj2 = promoCodesInteractor$requestPromoCodesListUpdate$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesInteractor$requestPromoCodesListUpdate$3.label;
        if (i != 0) {
        }
        a = Result.a(l);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (b((java.lang.String) r8, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        PromoCodesInteractor$requestPromoCodesListUpdate$1 promoCodesInteractor$requestPromoCodesListUpdate$1;
        int i;
        Object a;
        if (continuationImpl instanceof PromoCodesInteractor$requestPromoCodesListUpdate$1) {
            promoCodesInteractor$requestPromoCodesListUpdate$1 = (PromoCodesInteractor$requestPromoCodesListUpdate$1) continuationImpl;
            int i2 = promoCodesInteractor$requestPromoCodesListUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesInteractor$requestPromoCodesListUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodesInteractor$requestPromoCodesListUpdate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesInteractor$requestPromoCodesListUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promoCodesInteractor$requestPromoCodesListUpdate$1.L$0 = list;
                    promoCodesInteractor$requestPromoCodesListUpdate$1.label = 1;
                    a = this.b.a(promoCodesInteractor$requestPromoCodesListUpdate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    list = (List) promoCodesInteractor$requestPromoCodesListUpdate$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    promoCodesInteractor$requestPromoCodesListUpdate$1.L$0 = null;
                    promoCodesInteractor$requestPromoCodesListUpdate$1.L$1 = a;
                    promoCodesInteractor$requestPromoCodesListUpdate$1.L$2 = null;
                    promoCodesInteractor$requestPromoCodesListUpdate$1.label = 2;
                }
                return zy11.a;
            }
        }
        promoCodesInteractor$requestPromoCodesListUpdate$1 = new PromoCodesInteractor$requestPromoCodesListUpdate$1(this, continuationImpl);
        Object obj3 = promoCodesInteractor$requestPromoCodesListUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesInteractor$requestPromoCodesListUpdate$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return zy11.a;
    }
}
