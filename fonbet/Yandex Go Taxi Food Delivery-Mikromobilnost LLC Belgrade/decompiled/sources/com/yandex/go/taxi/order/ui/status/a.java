package com.yandex.go.taxi.order.ui.status;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.eg3;
import defpackage.m880;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m880 b;

    public /* synthetic */ a(m880 m880Var, int i) {
        this.a = i;
        this.b = m880Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (!eg3.f(this.b.F, ((TaxiOrder) obj).h.b)) {
                    this.b.E.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(o400.a, new OrderStatusPresenter$observeOrderState$1$2$1(this.b, null), continuation);
                    if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                break;
            default:
                m880 m880Var = this.b;
                m880Var.E.getClass();
                sjh sjhVar2 = uyj.a;
                Object k02 = tje.k0(o400.a, new OrderStatusPresenter$observeOrderState$2$2$1(m880Var, null), continuation);
                if (k02 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return zy11.a;
    }
}
