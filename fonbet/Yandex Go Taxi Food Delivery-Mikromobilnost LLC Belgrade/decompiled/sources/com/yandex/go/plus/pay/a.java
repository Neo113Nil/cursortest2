package com.yandex.go.plus.pay;

import com.yandex.go.plus.pay.domain.model.PlusPayEmptyOfferException;
import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.internal.feature.offers.i;
import defpackage.aed0;
import defpackage.ahd0;
import defpackage.b5d0;
import defpackage.c0g;
import defpackage.eed0;
import defpackage.fbd0;
import defpackage.k7d0;
import defpackage.n2d0;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.qh2;
import defpackage.rad0;
import defpackage.sad0;
import defpackage.sdd0;
import defpackage.t5g;
import defpackage.tse;
import defpackage.udd0;
import defpackage.ugd0;
import defpackage.v7d0;
import defpackage.y4a0;
import defpackage.ydd0;
import defpackage.zdd0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements ahd0 {
    public final sad0 a;

    public a(sad0 sad0Var) {
        this.a = sad0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (kotlinx.coroutines.a.i(500, r6) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r11v15, types: [v7d0] */
    /* JADX WARN: Type inference failed for: r12v13, types: [rad0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eed0 eed0Var, ContinuationImpl continuationImpl) {
        PlusPayWrapperImpl$getPlusPayRouter$1 plusPayWrapperImpl$getPlusPayRouter$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        t5g t5gVar;
        v7d0 a;
        List list;
        List list2;
        String str;
        Object c;
        eed0 eed0Var2;
        rad0 rad0Var;
        b bVar;
        PlusPayCompositeOffers.Offer offer;
        if (continuationImpl instanceof PlusPayWrapperImpl$getPlusPayRouter$1) {
            plusPayWrapperImpl$getPlusPayRouter$1 = (PlusPayWrapperImpl$getPlusPayRouter$1) continuationImpl;
            int i2 = plusPayWrapperImpl$getPlusPayRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayWrapperImpl$getPlusPayRouter$1.label = i2 - Integer.MIN_VALUE;
                PlusPayWrapperImpl$getPlusPayRouter$1 plusPayWrapperImpl$getPlusPayRouter$12 = plusPayWrapperImpl$getPlusPayRouter$1;
                Object obj = plusPayWrapperImpl$getPlusPayRouter$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayWrapperImpl$getPlusPayRouter$12.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eed0Var.getClass();
                    t5gVar = new t5g(new sdd0(), this.a, eed0Var);
                    k7d0 k7d0Var = new k7d0(i3, (fbd0) t5gVar.m.get());
                    com.yandex.plus.pay.internal.a aVar = new com.yandex.plus.pay.internal.a();
                    k7d0Var.invoke(aVar);
                    a = aVar.a();
                    plusPayWrapperImpl$getPlusPayRouter$12.L$0 = eed0Var;
                    plusPayWrapperImpl$getPlusPayRouter$12.L$1 = t5gVar;
                    plusPayWrapperImpl$getPlusPayRouter$12.L$2 = null;
                    plusPayWrapperImpl$getPlusPayRouter$12.L$3 = a;
                    plusPayWrapperImpl$getPlusPayRouter$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r11 = (v7d0) plusPayWrapperImpl$getPlusPayRouter$12.L$3;
                        rad0Var = (rad0) plusPayWrapperImpl$getPlusPayRouter$12.L$1;
                        eed0Var2 = (eed0) plusPayWrapperImpl$getPlusPayRouter$12.L$0;
                        kotlin.b.b(obj);
                        bVar = r11;
                        offer = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(((PlusPayCompositeOffers) obj).getOffers());
                        if (offer != null) {
                            throw new PlusPayEmptyOfferException();
                        }
                        t5g t5gVar2 = (t5g) rad0Var;
                        c0g c0gVar = (c0g) t5gVar2.a;
                        pwy0 c3 = c0gVar.c3();
                        q5z.h(c3);
                        tse f2 = c0gVar.f2();
                        q5z.h(f2);
                        return new com.yandex.go.plus.pay.presentation.a(bVar, offer, ngd0.r(new ugd0(0, bVar, new y4a0(c3, f2, (b5d0) t5gVar2.n.get()))), eed0Var2.c.c);
                    }
                    a = (v7d0) plusPayWrapperImpl$getPlusPayRouter$12.L$3;
                    ?? r12 = (rad0) plusPayWrapperImpl$getPlusPayRouter$12.L$1;
                    eed0 eed0Var3 = (eed0) plusPayWrapperImpl$getPlusPayRouter$12.L$0;
                    kotlin.b.b(obj);
                    t5gVar = r12;
                    eed0Var = eed0Var3;
                }
                b bVar2 = (b) a;
                aed0 aed0Var = (aed0) bVar2.e.getValue();
                udd0 udd0Var = eed0Var.c;
                n2d0 n2d0Var = udd0Var.f;
                String str2 = udd0Var.a;
                PlusPayAnalyticsParams.Companion.getClass();
                PlusPayAnalyticsParams b = com.yandex.plus.pay.api.analytics.a.b();
                ydd0 ydd0Var = new ydd0();
                list = n2d0Var.b;
                if (list != null) {
                    ydd0Var.b = kotlin.collections.a.N0(list);
                }
                list2 = n2d0Var.a;
                if (list2 != null) {
                    ydd0Var.b(list2);
                }
                str = n2d0Var.c;
                if (str != null) {
                    ydd0Var.a = str;
                }
                zdd0 a2 = ydd0Var.a();
                List list3 = udd0Var.g.a;
                qh2 qh2Var = list3 == null ? new qh2(list3, 11) : null;
                plusPayWrapperImpl$getPlusPayRouter$12.L$0 = eed0Var;
                plusPayWrapperImpl$getPlusPayRouter$12.L$1 = t5gVar;
                plusPayWrapperImpl$getPlusPayRouter$12.L$2 = null;
                plusPayWrapperImpl$getPlusPayRouter$12.L$3 = bVar2;
                plusPayWrapperImpl$getPlusPayRouter$12.label = 2;
                c = ((i) aed0Var).c(str2, b, a2, qh2Var, plusPayWrapperImpl$getPlusPayRouter$12);
                if (c != coroutineSingletons) {
                    eed0Var2 = eed0Var;
                    rad0Var = t5gVar;
                    obj = c;
                    bVar = bVar2;
                    offer = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(((PlusPayCompositeOffers) obj).getOffers());
                    if (offer != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        plusPayWrapperImpl$getPlusPayRouter$1 = new PlusPayWrapperImpl$getPlusPayRouter$1(this, continuationImpl);
        PlusPayWrapperImpl$getPlusPayRouter$1 plusPayWrapperImpl$getPlusPayRouter$122 = plusPayWrapperImpl$getPlusPayRouter$1;
        Object obj2 = plusPayWrapperImpl$getPlusPayRouter$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayWrapperImpl$getPlusPayRouter$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        b bVar22 = (b) a;
        aed0 aed0Var2 = (aed0) bVar22.e.getValue();
        udd0 udd0Var2 = eed0Var.c;
        n2d0 n2d0Var2 = udd0Var2.f;
        String str22 = udd0Var2.a;
        PlusPayAnalyticsParams.Companion.getClass();
        PlusPayAnalyticsParams b2 = com.yandex.plus.pay.api.analytics.a.b();
        ydd0 ydd0Var2 = new ydd0();
        list = n2d0Var2.b;
        if (list != null) {
        }
        list2 = n2d0Var2.a;
        if (list2 != null) {
        }
        str = n2d0Var2.c;
        if (str != null) {
        }
        zdd0 a22 = ydd0Var2.a();
        List list32 = udd0Var2.g.a;
        if (list32 == null) {
        }
        plusPayWrapperImpl$getPlusPayRouter$122.L$0 = eed0Var;
        plusPayWrapperImpl$getPlusPayRouter$122.L$1 = t5gVar;
        plusPayWrapperImpl$getPlusPayRouter$122.L$2 = null;
        plusPayWrapperImpl$getPlusPayRouter$122.L$3 = bVar22;
        plusPayWrapperImpl$getPlusPayRouter$122.label = 2;
        c = ((i) aed0Var2).c(str22, b2, a22, qh2Var, plusPayWrapperImpl$getPlusPayRouter$122);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
