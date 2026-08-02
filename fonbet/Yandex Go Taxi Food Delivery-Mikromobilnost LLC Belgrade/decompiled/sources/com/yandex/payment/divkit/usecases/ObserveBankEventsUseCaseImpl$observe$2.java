package com.yandex.payment.divkit.usecases;

import defpackage.aq4;
import defpackage.cq4;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.wls;
import defpackage.y22;
import defpackage.yp4;
import defpackage.zp4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcq4;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lcq4;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.ObserveBankEventsUseCaseImpl$observe$2", f = "ObserveBankEventsUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class ObserveBankEventsUseCaseImpl$observe$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveBankEventsUseCaseImpl$observe$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ObserveBankEventsUseCaseImpl$observe$2 observeBankEventsUseCaseImpl$observe$2 = new ObserveBankEventsUseCaseImpl$observe$2(this.this$0, continuation);
        observeBankEventsUseCaseImpl$observe$2.L$0 = obj;
        return observeBankEventsUseCaseImpl$observe$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ObserveBankEventsUseCaseImpl$observe$2 observeBankEventsUseCaseImpl$observe$2 = (ObserveBankEventsUseCaseImpl$observe$2) create((cq4) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        observeBankEventsUseCaseImpl$observe$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cq4 cq4Var = (cq4) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(cq4Var, zp4.a)) {
            rwo rwoVar = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.R());
        } else if (jl40.l(cq4Var, aq4.a)) {
            rwo rwoVar2 = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar2).a(sv90.S());
        } else if (jl40.l(cq4Var, yp4.b)) {
            rwo rwoVar3 = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar3).a(sv90.Q());
        } else if (jl40.l(cq4Var, yp4.d)) {
            rwo rwoVar4 = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar4).a(sv90.U());
        } else if (jl40.l(cq4Var, yp4.a)) {
            rwo rwoVar5 = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar5).a(sv90.P());
        } else if (jl40.l(cq4Var, yp4.c)) {
            rwo rwoVar6 = this.this$0.a;
            qv90.a.getClass();
            ((y22) rwoVar6).a(sv90.T());
        }
        return zy11.a;
    }
}
