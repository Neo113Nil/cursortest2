package com.yandex.go.address.address_map_picker.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.utr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "bottomMargin", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3 extends SuspendLambda implements wls {
    final /* synthetic */ utr $this_occupyFocusCoordinatorOnLifecycle;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3(utr utrVar, Continuation continuation) {
        super(2, continuation);
        this.$this_occupyFocusCoordinatorOnLifecycle = utrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3 addressMapPickerMapLayerRouterImpl$initMapApis$1$1$3 = new AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3(this.$this_occupyFocusCoordinatorOnLifecycle, continuation);
        addressMapPickerMapLayerRouterImpl$initMapApis$1$1$3.I$0 = ((Number) obj).intValue();
        return addressMapPickerMapLayerRouterImpl$initMapApis$1$1$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3 addressMapPickerMapLayerRouterImpl$initMapApis$1$1$3 = (AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerMapLayerRouterImpl$initMapApis$1$1$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$this_occupyFocusCoordinatorOnLifecycle.P2(i);
        return zy11.a;
    }
}
