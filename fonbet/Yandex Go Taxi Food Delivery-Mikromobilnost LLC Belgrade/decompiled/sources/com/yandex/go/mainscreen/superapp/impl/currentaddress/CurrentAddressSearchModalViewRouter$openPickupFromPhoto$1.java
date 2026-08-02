package com.yandex.go.mainscreen.superapp.impl.currentaddress;

import defpackage.inb0;
import defpackage.jl40;
import defpackage.jnb0;
import defpackage.knb0;
import defpackage.lnb0;
import defpackage.mnb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmnb0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lmnb0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.currentaddress.CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1", f = "CurrentAddressSearchModalViewRouter.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1 currentAddressSearchModalViewRouter$openPickupFromPhoto$1 = new CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1(this.this$0, continuation);
        currentAddressSearchModalViewRouter$openPickupFromPhoto$1.L$0 = obj;
        return currentAddressSearchModalViewRouter$openPickupFromPhoto$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1) create((mnb0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mnb0 mnb0Var = (mnb0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (mnb0Var instanceof inb0) {
                c cVar = this.this$0;
                pv0 pv0Var = ((inb0) mnb0Var).a;
                this.L$0 = null;
                this.label = 1;
                if (c.T(cVar, pv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (!jl40.l(mnb0Var, jnb0.a) && !jl40.l(mnb0Var, lnb0.a) && !jl40.l(mnb0Var, knb0.a)) {
                w511.b();
                return null;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
