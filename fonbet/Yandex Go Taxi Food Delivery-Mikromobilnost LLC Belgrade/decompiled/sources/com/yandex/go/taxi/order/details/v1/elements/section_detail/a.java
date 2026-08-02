package com.yandex.go.taxi.order.details.v1.elements.section_detail;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.k0q0;
import defpackage.l0q0;
import defpackage.ny61;
import defpackage.q8j;
import defpackage.t0q0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final l0q0 a;
    public final k0q0 b;
    public final gci0 c;

    public a(l0q0 l0q0Var, k0q0 k0q0Var) {
        this.a = l0q0Var;
        this.b = k0q0Var;
        this.c = l0q0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        SectionDetailInteractor$onOrderUpdated$1 sectionDetailInteractor$onOrderUpdated$1;
        int i;
        l0q0 l0q0Var;
        if (continuation instanceof SectionDetailInteractor$onOrderUpdated$1) {
            sectionDetailInteractor$onOrderUpdated$1 = (SectionDetailInteractor$onOrderUpdated$1) continuation;
            int i2 = sectionDetailInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sectionDetailInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sectionDetailInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sectionDetailInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    b.b(obj);
                    sectionDetailInteractor$onOrderUpdated$1.L$0 = null;
                    l0q0 l0q0Var2 = this.a;
                    sectionDetailInteractor$onOrderUpdated$1.L$1 = l0q0Var2;
                    sectionDetailInteractor$onOrderUpdated$1.label = 1;
                    Object n = bvf0.n(new SectionDetailStateMapper$map$2(taxiOrder, this.b, null), sectionDetailInteractor$onOrderUpdated$1);
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = n;
                    l0q0Var = l0q0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l0q0Var = (l0q0) sectionDetailInteractor$onOrderUpdated$1.L$1;
                    b.b(obj);
                }
                l0q0Var.a.l((t0q0) obj);
                return zy11.a;
            }
        }
        sectionDetailInteractor$onOrderUpdated$1 = new SectionDetailInteractor$onOrderUpdated$1(this, continuation);
        Object obj2 = sectionDetailInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sectionDetailInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        l0q0Var.a.l((t0q0) obj2);
        return zy11.a;
    }
}
