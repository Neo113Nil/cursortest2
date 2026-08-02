package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bd;
import defpackage.fd;
import defpackage.hdz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementPresenter$attachView$1", f = "LocationWithAgreementPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationWithAgreementPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ hdz $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementPresenter$attachView$1(hdz hdzVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = hdzVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationWithAgreementPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationWithAgreementPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hdz hdzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hdz hdzVar2 = this.$mvpView;
            c cVar = this.this$0;
            this.L$0 = hdzVar2;
            this.label = 1;
            Object Kg = c.Kg(cVar, this);
            if (Kg == coroutineSingletons) {
                return coroutineSingletons;
            }
            hdzVar = hdzVar2;
            obj = Kg;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hdzVar = (hdz) this.L$0;
            kotlin.b.b(obj);
        }
        hdzVar.qc((sbz) obj);
        c cVar2 = this.this$0;
        bd bdVar = cVar2.y;
        if (bdVar != null) {
            ((fd) cVar2.C).g(bdVar);
        }
        return zy11.a;
    }
}
