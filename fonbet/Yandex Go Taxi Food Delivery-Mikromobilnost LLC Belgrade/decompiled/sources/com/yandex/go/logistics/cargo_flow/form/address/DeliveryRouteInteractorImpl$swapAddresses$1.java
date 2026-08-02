package com.yandex.go.logistics.cargo_flow.form.address;

import com.yandex.go.address.models.Address;
import defpackage.g8l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.form.address.DeliveryRouteInteractorImpl$swapAddresses$1", f = "DeliveryRouteInteractorImpl.kt", l = {204}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRouteInteractorImpl$swapAddresses$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $addIndex;
    final /* synthetic */ List<Address> $currentAddresses;
    final /* synthetic */ int $removeIndex;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRouteInteractorImpl$swapAddresses$1(c cVar, List list, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$currentAddresses = list;
        this.$addIndex = i;
        this.$removeIndex = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryRouteInteractorImpl$swapAddresses$1(this.this$0, this.$currentAddresses, this.$addIndex, this.$removeIndex, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryRouteInteractorImpl$swapAddresses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            List<Address> list = this.$currentAddresses;
            int i2 = this.$addIndex;
            int i3 = this.$removeIndex;
            this.label = 1;
            cVar.getClass();
            if (cVar.k(list, new g8l0(i2, i2), new g8l0(i3, i3), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
