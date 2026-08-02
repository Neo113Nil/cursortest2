package com.yandex.go.taxi.order.change.source.analytics.pin;

import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/pin/api/v2/PinV2Component$Position;", "move", "", "anchored"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.change.source.analytics.pin.ChangeSourcePointPinV2DataRepository$positionFlow$1", f = "ChangeSourcePointPinV2DataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ChangeSourcePointPinV2DataRepository$positionFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isShowPinStan;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSourcePointPinV2DataRepository$positionFlow$1(boolean z, Continuation continuation) {
        super(3, continuation);
        this.$isShowPinStan = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ChangeSourcePointPinV2DataRepository$positionFlow$1 changeSourcePointPinV2DataRepository$positionFlow$1 = new ChangeSourcePointPinV2DataRepository$positionFlow$1(this.$isShowPinStan, (Continuation) obj3);
        changeSourcePointPinV2DataRepository$positionFlow$1.Z$0 = booleanValue;
        changeSourcePointPinV2DataRepository$positionFlow$1.Z$1 = booleanValue2;
        return changeSourcePointPinV2DataRepository$positionFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? PinV2Component.Position.MOVE : (!z2 || this.$isShowPinStan) ? PinV2Component.Position.DEFAULT : PinV2Component.Position.ANCHORED;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
