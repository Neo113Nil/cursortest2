package com.yandex.plus.home.plaque.feature.internal;

import com.yandex.plus.log.api.LogPriority;
import defpackage.boc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omc0;
import defpackage.pgz;
import defpackage.rkc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.PlaqueFeatureImpl$setExternalPlaqueContext$1", f = "PlaqueFeatureImpl.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueFeatureImpl$setExternalPlaqueContext$1 extends SuspendLambda implements wls {
    final /* synthetic */ omc0 $context;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueFeatureImpl$setExternalPlaqueContext$1(b bVar, omc0 omc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$context = omc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueFeatureImpl$setExternalPlaqueContext$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueFeatureImpl$setExternalPlaqueContext$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pgz pgzVar = this.this$0.f;
            omc0 omc0Var = this.$context;
            LogPriority logPriority = LogPriority.INFO;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "PlaqueFeatureImpl", "setExternalPlaqueContext(" + omc0Var + ')');
            }
            rkc0 rkc0Var = this.this$0.c;
            omc0 omc0Var2 = this.$context;
            r0 r0Var = rkc0Var.e;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, new boc0(kotlin.collections.b.n(kotlin.collections.b.i(new Pair("PlaquesShown", kotlin.collections.a.N0(rkc0Var.a)), new Pair("PlaquesInteracted", kotlin.collections.a.N0(rkc0Var.b)), new Pair("PerformActionsSucceed", kotlin.collections.a.N0(rkc0Var.c)), new Pair("PerformActionsFailed", kotlin.collections.a.N0(rkc0Var.d))), omc0Var2.a), omc0Var2.b, omc0Var2.c, omc0Var2.d)));
            b bVar = this.this$0;
            com.yandex.plus.home.plaque.feature.internal.domain.observable.a aVar = bVar.j;
            Map map = ((boc0) bVar.c.e.getValue()).b;
            this.label = 1;
            Object f = aVar.a.f(map, this);
            if (f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                f = zy11Var;
            }
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
