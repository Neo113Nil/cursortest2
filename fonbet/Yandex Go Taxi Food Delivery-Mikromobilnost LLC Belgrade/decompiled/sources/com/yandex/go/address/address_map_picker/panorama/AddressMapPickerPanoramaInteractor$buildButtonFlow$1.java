package com.yandex.go.address.address_map_picker.panorama;

import defpackage.c9y0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.myy;
import defpackage.ny61;
import defpackage.tb90;
import defpackage.vsx;
import defpackage.wls;
import defpackage.xb90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmyy;", "iconState", "Lzy11;", "<anonymous>", "(Lmyy;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.panorama.AddressMapPickerPanoramaInteractor$buildButtonFlow$1", f = "AddressMapPickerPanoramaInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerPanoramaInteractor$buildButtonFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ xb90 $params;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerPanoramaInteractor$buildButtonFlow$1(xb90 xb90Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$params = xb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerPanoramaInteractor$buildButtonFlow$1 addressMapPickerPanoramaInteractor$buildButtonFlow$1 = new AddressMapPickerPanoramaInteractor$buildButtonFlow$1(this.$params, this.this$0, continuation);
        addressMapPickerPanoramaInteractor$buildButtonFlow$1.L$0 = obj;
        return addressMapPickerPanoramaInteractor$buildButtonFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerPanoramaInteractor$buildButtonFlow$1 addressMapPickerPanoramaInteractor$buildButtonFlow$1 = (AddressMapPickerPanoramaInteractor$buildButtonFlow$1) create((myy) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerPanoramaInteractor$buildButtonFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        myy myyVar = (myy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.h.a = new vsx(myyVar, this.$params);
        d dVar = this.this$0;
        xb90 xb90Var = this.$params;
        c9y0 c9y0Var = dVar.d;
        String str = c9y0Var.a;
        tb90 tb90Var = xb90Var.a;
        String str2 = xb90Var.c;
        if (!jl40.l(str, tb90Var.a) || !jl40.l(c9y0Var.b, str2)) {
            dVar.c.c(tb90Var.a, str2, xb90Var.b, tb90Var.c);
        }
        c9y0Var.a = tb90Var.a;
        c9y0Var.b = str2;
        return zy11.a;
    }
}
