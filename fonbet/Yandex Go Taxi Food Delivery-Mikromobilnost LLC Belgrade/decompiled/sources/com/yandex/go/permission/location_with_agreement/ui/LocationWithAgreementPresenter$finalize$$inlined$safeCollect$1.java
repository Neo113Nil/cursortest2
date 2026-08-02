package com.yandex.go.permission.location_with_agreement.ui;

import defpackage.bd;
import defpackage.fd;
import defpackage.kk5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xpy;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1", f = "LocationWithAgreementPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1 locationWithAgreementPresenter$finalize$$inlined$safeCollect$1 = new LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1(this.this$0, (Continuation) obj3);
        locationWithAgreementPresenter$finalize$$inlined$safeCollect$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        locationWithAgreementPresenter$finalize$$inlined$safeCollect$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.H.d();
        c cVar = this.this$0;
        bd bdVar = cVar.y;
        if (bdVar != null) {
            ((fd) cVar.C).d(bdVar, null);
            ((com.yandex.go.agreement.interactor.a) cVar.z).a(bdVar);
        }
        kk5 kk5Var = cVar.x.a;
        if (kk5Var.u()) {
            kk5Var.r(new xpy(27));
        }
        return zy11.a;
    }
}
