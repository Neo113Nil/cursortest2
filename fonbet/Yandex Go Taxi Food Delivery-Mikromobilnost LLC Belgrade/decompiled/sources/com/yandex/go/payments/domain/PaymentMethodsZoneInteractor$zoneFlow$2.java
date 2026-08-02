package com.yandex.go.payments.domain;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.zone.model.Zone;
import defpackage.dqe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uzs;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/zone/model/Zone;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentMethodsZoneInteractor$zoneFlow$2", f = "PaymentMethodsZoneInteractor.kt", l = {35, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsZoneInteractor$zoneFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsZoneInteractor$zoneFlow$2(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsZoneInteractor$zoneFlow$2 paymentMethodsZoneInteractor$zoneFlow$2 = new PaymentMethodsZoneInteractor$zoneFlow$2(this.this$0, continuation);
        paymentMethodsZoneInteractor$zoneFlow$2.L$0 = obj;
        return paymentMethodsZoneInteractor$zoneFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsZoneInteractor$zoneFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs b;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i0 i0Var = this.this$0;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            dqe0 dqe0Var = i0Var.b;
            Zone a = i0Var.a();
            if (a != null) {
                obj = a;
            } else {
                Address e = dqe0Var.e();
                String zoneName = e != null ? e.getZoneName() : null;
                Address e2 = dqe0Var.e();
                if (e2 == null || (b = e2.B()) == null) {
                    Location a2 = i0Var.c.a();
                    if (a2 != null) {
                        zzs.Companion.getClass();
                        b = uzs.b(a2);
                    } else {
                        obj = null;
                    }
                }
                obj = i0Var.d.d(zoneName, b, this);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
