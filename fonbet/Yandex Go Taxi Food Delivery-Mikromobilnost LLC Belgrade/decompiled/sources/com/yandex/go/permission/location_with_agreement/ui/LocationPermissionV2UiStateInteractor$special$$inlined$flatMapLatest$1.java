package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.hyp0;
import defpackage.iie;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1", f = "LocationPermissionV2UiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1 locationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1 = new LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        locationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        locationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return locationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ExplainingLocationPermissionScreenWithAgreementV2Experiment explainingLocationPermissionScreenWithAgreementV2Experiment = (ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj2;
            String Y = d6z.Y(explainingLocationPermissionScreenWithAgreementV2Experiment, explainingLocationPermissionScreenWithAgreementV2Experiment.e);
            String Y2 = d6z.Y(explainingLocationPermissionScreenWithAgreementV2Experiment, explainingLocationPermissionScreenWithAgreementV2Experiment.f);
            String str = explainingLocationPermissionScreenWithAgreementV2Experiment.d;
            if (str.length() <= 0) {
                str = null;
            }
            iie iieVar = new iie(Y, Y2, str != null ? mja1.a(str, null, 6) : null);
            String str2 = explainingLocationPermissionScreenWithAgreementV2Experiment.h;
            if (evu0.J(str2)) {
                str2 = null;
            }
            hyp0 hyp0Var = str2 != null ? new hyp0(d6z.Y(explainingLocationPermissionScreenWithAgreementV2Experiment, str2)) : null;
            b bVar = this.this$0;
            m0 m0Var = new m0(bVar.e, bVar.c.b, new LocationPermissionV2UiStateInteractor$uiStateFlow$1$1(iieVar, hyp0Var, explainingLocationPermissionScreenWithAgreementV2Experiment, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(m0Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
