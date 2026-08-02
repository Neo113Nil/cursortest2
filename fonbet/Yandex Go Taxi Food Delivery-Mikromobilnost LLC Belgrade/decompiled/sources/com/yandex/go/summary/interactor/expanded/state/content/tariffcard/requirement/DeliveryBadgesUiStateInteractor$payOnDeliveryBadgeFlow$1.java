package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owh;
import defpackage.vt90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.payment_method_selector.requirement.state.ToggleSource;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isPayOnDeliveryChosen", "hasMultipoints", "isEnabled", "Lvt90;", "prohibitedData", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Luti;", "<anonymous>", "(ZZZLvt90;Lru/yandex/taxi/theme/ThemeType;)Luti;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1", f = "DeliveryBadgesUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ owh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1(owh owhVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = owhVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        DeliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1 deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1 = new DeliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1(this.this$0, (Continuation) obj6);
        deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1.Z$0 = booleanValue;
        deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1.Z$1 = booleanValue2;
        deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1.Z$2 = booleanValue3;
        deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1.L$0 = (vt90) obj4;
        return deliveryBadgesUiStateInteractor$payOnDeliveryBadgeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        vt90 vt90Var = (vt90) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z3) {
            return this.this$0.e.a(z, ToggleSource.SUMMARY, z2, vt90Var.a, vt90Var.b);
        }
        return null;
    }
}
