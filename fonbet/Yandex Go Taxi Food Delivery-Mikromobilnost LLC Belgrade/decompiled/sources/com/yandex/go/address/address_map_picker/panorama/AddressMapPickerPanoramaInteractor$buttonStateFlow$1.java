package com.yandex.go.address.address_map_picker.panorama;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.models.Address;
import defpackage.f21;
import defpackage.g91;
import defpackage.h91;
import defpackage.jl40;
import defpackage.k91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.q11;
import defpackage.tb90;
import defpackage.w511;
import defpackage.xb90;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf21;", "mapPickerState", "Lru/yandex/taxi/panorama/d;", "experiment", "Lxb90;", "<anonymous>", "(Lf21;Lru/yandex/taxi/panorama/d;)Lxb90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.panorama.AddressMapPickerPanoramaInteractor$buttonStateFlow$1", f = "AddressMapPickerPanoramaInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerPanoramaInteractor$buttonStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerPanoramaInteractor$buttonStateFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddressMapPickerPanoramaInteractor$buttonStateFlow$1 addressMapPickerPanoramaInteractor$buttonStateFlow$1 = new AddressMapPickerPanoramaInteractor$buttonStateFlow$1(this.this$0, (Continuation) obj3);
        addressMapPickerPanoramaInteractor$buttonStateFlow$1.L$0 = (f21) obj;
        addressMapPickerPanoramaInteractor$buttonStateFlow$1.L$1 = (ru.yandex.taxi.panorama.d) obj2;
        return addressMapPickerPanoramaInteractor$buttonStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var;
        Address address;
        tb90 panoramaData;
        String str;
        f21 f21Var = (f21) this.L$0;
        ru.yandex.taxi.panorama.d dVar = (ru.yandex.taxi.panorama.d) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.this$0.e.a.b() && (pv0Var = f21Var.c) != null && (address = pv0Var.a) != null && (panoramaData = address.getPanoramaData()) != null) {
            d dVar2 = this.this$0;
            AddressMapPickerPointType addressMapPickerPointType = f21Var.a;
            dVar2.getClass();
            int i = q11.a[addressMapPickerPointType.ordinal()];
            if (i == 1) {
                str = "a";
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                str = "b";
            }
            d dVar3 = this.this$0;
            k91 k91Var = f21Var.b;
            dVar3.getClass();
            String concat = (jl40.l(k91Var, g91.a) || jl40.l(k91Var, h91.a)) ? "clarify_point_".concat(str) : null;
            if (concat != null && dVar.b && dVar.e.contains(concat)) {
                return new xb90(panoramaData, str, concat, dVar);
            }
        }
        return null;
    }
}
