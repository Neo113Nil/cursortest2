package com.yandex.go.navigator.favorites.building_card;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bt6;
import defpackage.ct6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.building_card.BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1", f = "BuildingCardUiStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ ct6 $buildingInfo;
    int label;
    final /* synthetic */ bt6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1(bt6 bt6Var, ct6 ct6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bt6Var;
        this.$buildingInfo = ct6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1(this.this$0, this.$buildingInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.f;
            zzs zzsVar = this.$buildingInfo.a;
            this.label = 1;
            obj = e.b(eVar, zzsVar, this, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return ((pv0) obj).a;
    }
}
