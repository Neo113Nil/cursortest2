package com.yandex.go.address.address_map_picker.pin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.z11;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "addressState", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "pinAlert", "<anonymous>", "(Lru/yandex/taxi/address/repository/AddressResolveRepository$State;Lru/yandex/taxi/widget/map/SourceOnMapControl$a;)Lru/yandex/taxi/widget/map/SourceOnMapControl$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.pin.AddressMapPickerPinV2DataRepository$stateFlow$1", f = "AddressMapPickerPinV2DataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerPinV2DataRepository$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerPinV2DataRepository$stateFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddressMapPickerPinV2DataRepository$stateFlow$1 addressMapPickerPinV2DataRepository$stateFlow$1 = new AddressMapPickerPinV2DataRepository$stateFlow$1(this.this$0, (Continuation) obj3);
        addressMapPickerPinV2DataRepository$stateFlow$1.L$0 = (AddressResolveRepository.State) obj;
        addressMapPickerPinV2DataRepository$stateFlow$1.L$1 = (SourceOnMapControl.a) obj2;
        return addressMapPickerPinV2DataRepository$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AddressResolveRepository.State state = (AddressResolveRepository.State) this.L$0;
        SourceOnMapControl.a aVar = (SourceOnMapControl.a) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (aVar != null) {
            return aVar;
        }
        int i = z11.a[state.ordinal()];
        if (i == 1) {
            return this.this$0.c;
        }
        if (i == 2) {
            return this.this$0.d;
        }
        g gVar = this.this$0;
        return i != 3 ? gVar.c : gVar.e;
    }
}
