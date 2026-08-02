package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.yy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {213, 215}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wpb0 $point;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1(f fVar, wpb0 wpb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$point = wpb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1(this.this$0, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r5.e(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r5.e(defpackage.bz0.a, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.address_map_picker.domain.c cVar = this.this$0.H;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        AddressMapPickerAddressStateRepository.a(this.this$0.J, this.$point.b);
        com.yandex.go.address.address_map_picker.domain.c cVar2 = this.this$0.H;
        yy0 yy0Var = new yy0(this.$point.b);
        this.label = 2;
    }
}
