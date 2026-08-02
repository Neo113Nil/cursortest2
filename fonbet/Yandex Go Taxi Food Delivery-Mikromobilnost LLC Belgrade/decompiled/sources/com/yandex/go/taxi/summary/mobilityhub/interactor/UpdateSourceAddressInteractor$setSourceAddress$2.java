package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z721;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.UpdateSourceAddressInteractor$setSourceAddress$2", f = "UpdateSourceAddressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateSourceAddressInteractor$setSourceAddress$2 extends SuspendLambda implements wls {
    final /* synthetic */ ZoneAddress $zoneAddress;
    int label;
    final /* synthetic */ z721 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourceAddressInteractor$setSourceAddress$2(z721 z721Var, ZoneAddress zoneAddress, Continuation continuation) {
        super(2, continuation);
        this.this$0 = z721Var;
        this.$zoneAddress = zoneAddress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateSourceAddressInteractor$setSourceAddress$2(this.this$0, this.$zoneAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UpdateSourceAddressInteractor$setSourceAddress$2 updateSourceAddressInteractor$setSourceAddress$2 = (UpdateSourceAddressInteractor$setSourceAddress$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        updateSourceAddressInteractor$setSourceAddress$2.invokeSuspend(zy11Var);
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
        this.this$0.e.m(this.$zoneAddress, null);
        return zy11.a;
    }
}
