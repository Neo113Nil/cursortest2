package com.yandex.mob.utils;

import defpackage.lg2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmo20;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.utils.NearMobLocationFilter$applyFilter$1", f = "MobLocationFilter.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class NearMobLocationFilter$applyFilter$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $points;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearMobLocationFilter$applyFilter$1(tpr tprVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$points = tprVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NearMobLocationFilter$applyFilter$1 nearMobLocationFilter$applyFilter$1 = new NearMobLocationFilter$applyFilter$1(this.$points, this.this$0, continuation);
        nearMobLocationFilter$applyFilter$1.L$0 = obj;
        return nearMobLocationFilter$applyFilter$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NearMobLocationFilter$applyFilter$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            tpr tprVar = this.$points;
            lg2 lg2Var = new lg2(i2, z, this.this$0, vprVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(lg2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
