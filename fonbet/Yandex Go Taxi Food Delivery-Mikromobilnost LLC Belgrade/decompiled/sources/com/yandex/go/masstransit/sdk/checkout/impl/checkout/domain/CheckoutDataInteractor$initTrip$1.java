package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import defpackage.lkb;
import defpackage.mkb;
import defpackage.mvg;
import defpackage.nkb;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.CheckoutDataInteractor$initTrip$1", f = "CheckoutDataInteractor.kt", l = {109, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CheckoutDataInteractor$initTrip$1 extends SuspendLambda implements wls {
    final /* synthetic */ nkb $parameter;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDataInteractor$initTrip$1(nkb nkbVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.$parameter = nkbVar;
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDataInteractor$initTrip$1(this.$parameter, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDataInteractor$initTrip$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k.a(r5.this$0, (defpackage.mkb) r6, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r1.h(r6, r5) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nkb nkbVar = this.$parameter;
            if (nkbVar instanceof mkb) {
                this.label = 1;
            } else {
                if (!(nkbVar instanceof lkb)) {
                    w511.b();
                    return null;
                }
                k kVar = this.this$0;
                Map map = ((lkb) nkbVar).a;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
