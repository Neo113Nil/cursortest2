package com.yandex.go.address.address_map_picker.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.address_map_picker.domain.c cVar = this.this$0.H;
            this.label = 1;
            if (cVar.e(zy0.a, this) == coroutineSingletons) {
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
