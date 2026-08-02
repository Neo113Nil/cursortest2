package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oxn0;
import defpackage.pm00;
import defpackage.syi;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.t0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/eboks/objects/api/MapObjectAction;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersEboksObjectsActionHandler$handleWalkRoute$1", f = "ScootersEboksObjectsActionHandler.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersEboksObjectsActionHandler$handleWalkRoute$1 extends SuspendLambda implements wls {
    final /* synthetic */ oxn0 $walkRoute;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersEboksObjectsActionHandler$handleWalkRoute$1(q qVar, oxn0 oxn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$walkRoute = oxn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersEboksObjectsActionHandler$handleWalkRoute$1(this.this$0, this.$walkRoute, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersEboksObjectsActionHandler$handleWalkRoute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.layers.presentation.walkroute.simple.b bVar = this.this$0.a;
            oxn0 oxn0Var = this.$walkRoute;
            pm00 pm00Var = new pm00(oxn0Var.a, oxn0Var.toString(), "", new t0(new syi(2, this.$walkRoute.a)), (String) null, (String) null, (String) null, (Boolean) null, 496);
            this.label = 1;
            if (bVar.a(pm00Var, this) == coroutineSingletons) {
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
