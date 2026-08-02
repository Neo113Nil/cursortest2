package com.yandex.go.address_confirmation;

import defpackage.bbt0;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.ybo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "pinState", "", "priceLoaded", "Lybo;", "estimatedWaiting", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "pinAlert", "<anonymous>", "(Lru/yandex/taxi/address/repository/AddressResolveRepository$State;ZLybo;Lru/yandex/taxi/widget/map/SourceOnMapControl$a;)Lru/yandex/taxi/widget/map/SourceOnMapControl$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.SourceAddressConfirmationPinV2DataRepository$stateFlow$2", f = "SourceAddressConfirmationPinV2DataRepository.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationPinV2DataRepository$stateFlow$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationPinV2DataRepository$stateFlow$2(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        SourceAddressConfirmationPinV2DataRepository$stateFlow$2 sourceAddressConfirmationPinV2DataRepository$stateFlow$2 = new SourceAddressConfirmationPinV2DataRepository$stateFlow$2(this.this$0, (Continuation) obj5);
        sourceAddressConfirmationPinV2DataRepository$stateFlow$2.L$0 = (AddressResolveRepository.State) obj;
        sourceAddressConfirmationPinV2DataRepository$stateFlow$2.Z$0 = booleanValue;
        sourceAddressConfirmationPinV2DataRepository$stateFlow$2.L$1 = (ybo) obj3;
        sourceAddressConfirmationPinV2DataRepository$stateFlow$2.L$2 = (SourceOnMapControl.a) obj4;
        return sourceAddressConfirmationPinV2DataRepository$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AddressResolveRepository.State state = (AddressResolveRepository.State) this.L$0;
        boolean z = this.Z$0;
        ybo yboVar = (ybo) this.L$1;
        SourceOnMapControl.a aVar = (SourceOnMapControl.a) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (aVar != null) {
                return aVar;
            }
            int i2 = bbt0.a[state.ordinal()];
            if (i2 == 1) {
                return this.this$0.h;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return this.this$0.i;
                }
                if (i2 != 4 && i2 != 5) {
                    w511.b();
                    return null;
                }
                return this.this$0.j;
            }
            e eVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = e.e(eVar, z, yboVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (SourceOnMapControl.a) obj;
    }
}
