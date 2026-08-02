package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a20;
import defpackage.cmt;
import defpackage.j99;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ss21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class i0 extends a20 {
    public final /* synthetic */ ss21 c;

    public i0(ss21 ss21Var) {
        this.c = ss21Var;
    }

    @Override // defpackage.a20
    public final String a() {
        return "changeAction";
    }

    @Override // defpackage.a20
    public final void b(Object obj, Throwable th) {
        Object value;
        TaxiOrder taxiOrder;
        j99 j99Var = (j99) obj;
        super.b(j99Var, th);
        o2y0 n = this.c.e.n(j99Var.b);
        if (n != null) {
            r0 r0Var = n.a;
            do {
                value = r0Var.getValue();
                taxiOrder = (TaxiOrder) value;
                taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.USER_READY));
            } while (!r0Var.k(value, taxiOrder));
            n.f();
        }
    }

    @Override // defpackage.a20
    public final void c(Object obj) {
        Object value;
        TaxiOrder taxiOrder;
        j99 j99Var = (j99) obj;
        super.c(j99Var);
        o2y0 n = this.c.e.n(j99Var.b);
        if (n != null) {
            r0 r0Var = n.a;
            do {
                value = r0Var.getValue();
                taxiOrder = (TaxiOrder) value;
                taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.USER_READY));
            } while (!r0Var.k(value, taxiOrder));
            n.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r8, null, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.a20
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, j99 j99Var, ContinuationImpl continuationImpl) {
        UserReadySenderImpl$ChangeActionDelegate$update$1 userReadySenderImpl$ChangeActionDelegate$update$1;
        int i;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof UserReadySenderImpl$ChangeActionDelegate$update$1) {
            userReadySenderImpl$ChangeActionDelegate$update$1 = (UserReadySenderImpl$ChangeActionDelegate$update$1) continuationImpl;
            int i2 = userReadySenderImpl$ChangeActionDelegate$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userReadySenderImpl$ChangeActionDelegate$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userReadySenderImpl$ChangeActionDelegate$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userReadySenderImpl$ChangeActionDelegate$update$1.label;
                ss21 ss21Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.provider.a aVar = ss21Var.e;
                    userReadySenderImpl$ChangeActionDelegate$update$1.L$0 = null;
                    userReadySenderImpl$ChangeActionDelegate$update$1.L$1 = j99Var;
                    userReadySenderImpl$ChangeActionDelegate$update$1.label = 1;
                    obj = aVar.m(str, userReadySenderImpl$ChangeActionDelegate$update$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    j99Var = (j99) userReadySenderImpl$ChangeActionDelegate$update$1.L$1;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.a(new ChangeOrderState$Pending(null, ChangeOrderState$Source.USER_READY));
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                cmt<OrderChangesDto.PendingChangeDto> i3 = ((ChangeOrderApi) ss21Var.b.get()).i(j99Var);
                userReadySenderImpl$ChangeActionDelegate$update$1.L$0 = null;
                userReadySenderImpl$ChangeActionDelegate$update$1.L$1 = null;
                userReadySenderImpl$ChangeActionDelegate$update$1.label = 2;
            }
        }
        userReadySenderImpl$ChangeActionDelegate$update$1 = new UserReadySenderImpl$ChangeActionDelegate$update$1(this, continuationImpl);
        Object obj2 = userReadySenderImpl$ChangeActionDelegate$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userReadySenderImpl$ChangeActionDelegate$update$1.label;
        ss21 ss21Var2 = this.c;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        cmt<OrderChangesDto.PendingChangeDto> i32 = ((ChangeOrderApi) ss21Var2.b.get()).i(j99Var);
        userReadySenderImpl$ChangeActionDelegate$update$1.L$0 = null;
        userReadySenderImpl$ChangeActionDelegate$update$1.L$1 = null;
        userReadySenderImpl$ChangeActionDelegate$update$1.label = 2;
    }
}
