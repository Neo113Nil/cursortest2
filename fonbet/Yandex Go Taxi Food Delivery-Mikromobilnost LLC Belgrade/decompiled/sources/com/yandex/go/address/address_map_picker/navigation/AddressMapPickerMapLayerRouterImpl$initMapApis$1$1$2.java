package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.mapkit.ScreenRect;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/ScreenRect;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/ScreenRect;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2 addressMapPickerMapLayerRouterImpl$initMapApis$1$1$2 = (AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2) create((ScreenRect) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerMapLayerRouterImpl$initMapApis$1$1$2.invokeSuspend(zy11Var);
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
        ah00 ah00Var = this.this$0.E;
        ((gh00) ah00Var).L(((gh00) ah00Var).e.b());
        return zy11.a;
    }
}
