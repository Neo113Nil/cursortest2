package com.yandex.go.permission.location_with_agreement.ui;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementPresenter$onThemeChanged$1", f = "LocationWithAgreementPresenter.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationWithAgreementPresenter$onThemeChanged$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementPresenter$onThemeChanged$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationWithAgreementPresenter$onThemeChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationWithAgreementPresenter$onThemeChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hdz hdzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hdz hdzVar2 = (hdz) this.this$0.Dg();
            c cVar = this.this$0;
            this.L$0 = hdzVar2;
            this.label = 1;
            Object Kg = c.Kg(cVar, this);
            if (Kg == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = Kg;
            hdzVar = hdzVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hdzVar = (hdz) this.L$0;
            kotlin.b.b(obj);
        }
        hdzVar.qc((sbz) obj);
        return zy11.a;
    }
}
