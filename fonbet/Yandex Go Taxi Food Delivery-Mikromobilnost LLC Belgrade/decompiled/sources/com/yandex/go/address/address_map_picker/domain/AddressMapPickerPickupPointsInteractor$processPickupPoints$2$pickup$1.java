package com.yandex.go.address.address_map_picker.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgmb0;", "<anonymous>", "(Ltse;)Lgmb0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1", f = "AddressMapPickerPickupPointsInteractor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    final /* synthetic */ List<wpb0> $pickupPoints;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1(g gVar, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$pickupPoints = list;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1(this.this$0, this.$pickupPoints, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.preorder.source.pickup.a aVar = this.this$0.b;
        List<wpb0> list = this.$pickupPoints;
        String str = this.$imageTag;
        this.label = 1;
        Object e = aVar.e(str, list, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
