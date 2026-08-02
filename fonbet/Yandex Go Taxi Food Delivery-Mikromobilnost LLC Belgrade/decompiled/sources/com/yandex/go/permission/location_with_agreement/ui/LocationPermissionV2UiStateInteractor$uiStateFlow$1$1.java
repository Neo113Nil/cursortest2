package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import defpackage.abz;
import defpackage.d6z;
import defpackage.hyp0;
import defpackage.iie;
import defpackage.kkz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1f0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkkz;", "logo", "", "isLoading", "Labz;", "<anonymous>", "(Lkkz;Z)Labz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationPermissionV2UiStateInteractor$uiStateFlow$1$1", f = "LocationPermissionV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationPermissionV2UiStateInteractor$uiStateFlow$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ iie $contentUiState;
    final /* synthetic */ ExplainingLocationPermissionScreenWithAgreementV2Experiment $experiment;
    final /* synthetic */ hyp0 $secondaryButtonUiState;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionV2UiStateInteractor$uiStateFlow$1$1(iie iieVar, hyp0 hyp0Var, ExplainingLocationPermissionScreenWithAgreementV2Experiment explainingLocationPermissionScreenWithAgreementV2Experiment, Continuation continuation) {
        super(3, continuation);
        this.$contentUiState = iieVar;
        this.$secondaryButtonUiState = hyp0Var;
        this.$experiment = explainingLocationPermissionScreenWithAgreementV2Experiment;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        LocationPermissionV2UiStateInteractor$uiStateFlow$1$1 locationPermissionV2UiStateInteractor$uiStateFlow$1$1 = new LocationPermissionV2UiStateInteractor$uiStateFlow$1$1(this.$contentUiState, this.$secondaryButtonUiState, this.$experiment, (Continuation) obj3);
        locationPermissionV2UiStateInteractor$uiStateFlow$1$1.L$0 = (kkz) obj;
        locationPermissionV2UiStateInteractor$uiStateFlow$1$1.Z$0 = booleanValue;
        return locationPermissionV2UiStateInteractor$uiStateFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kkz kkzVar = (kkz) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        iie iieVar = this.$contentUiState;
        hyp0 hyp0Var = this.$secondaryButtonUiState;
        ExplainingLocationPermissionScreenWithAgreementV2Experiment explainingLocationPermissionScreenWithAgreementV2Experiment = this.$experiment;
        return new abz(kkzVar, iieVar, hyp0Var, new r1f0(d6z.Y(explainingLocationPermissionScreenWithAgreementV2Experiment, explainingLocationPermissionScreenWithAgreementV2Experiment.g), z));
    }
}
