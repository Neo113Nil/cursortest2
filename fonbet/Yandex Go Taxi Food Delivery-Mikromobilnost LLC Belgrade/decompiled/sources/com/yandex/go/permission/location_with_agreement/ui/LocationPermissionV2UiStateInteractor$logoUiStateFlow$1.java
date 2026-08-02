package com.yandex.go.permission.location_with_agreement.ui;

import defpackage.kkz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkkz;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationPermissionV2UiStateInteractor$logoUiStateFlow$1", f = "LocationPermissionV2UiStateInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationPermissionV2UiStateInteractor$logoUiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionV2UiStateInteractor$logoUiStateFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationPermissionV2UiStateInteractor$logoUiStateFlow$1 locationPermissionV2UiStateInteractor$logoUiStateFlow$1 = new LocationPermissionV2UiStateInteractor$logoUiStateFlow$1(this.this$0, continuation);
        locationPermissionV2UiStateInteractor$logoUiStateFlow$1.L$0 = obj;
        return locationPermissionV2UiStateInteractor$logoUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationPermissionV2UiStateInteractor$logoUiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Integer b = bVar.a.b(bVar.b.getThemeType().f());
            kkz kkzVar = b != null ? new kkz(b.intValue()) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(kkzVar, this) == coroutineSingletons) {
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
