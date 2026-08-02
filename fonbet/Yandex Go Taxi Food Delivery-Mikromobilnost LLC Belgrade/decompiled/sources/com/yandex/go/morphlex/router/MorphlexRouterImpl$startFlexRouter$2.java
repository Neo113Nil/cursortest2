package com.yandex.go.morphlex.router;

import com.yandex.go.morphlex.data.e;
import defpackage.g8e;
import defpackage.h830;
import defpackage.k6x;
import defpackage.kjr;
import defpackage.lhr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.smp;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrhr;", "<anonymous>", "(Ltse;)Lrhr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.router.MorphlexRouterImpl$startFlexRouter$2", f = "MorphlexRouterImpl.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexRouterImpl$startFlexRouter$2 extends SuspendLambda implements wls {
    final /* synthetic */ h830 $screenConfig;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexRouterImpl$startFlexRouter$2(h830 h830Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenConfig = h830Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MorphlexRouterImpl$startFlexRouter$2(this.$screenConfig, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexRouterImpl$startFlexRouter$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar2 = (e) this.this$0.E.get();
            h830 h830Var = this.$screenConfig;
            this.L$0 = eVar2;
            this.label = 1;
            Object e = eVar2.e(h830Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
            obj = e;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
        }
        k6x k6xVar = (k6x) obj;
        com.yandex.div.core.expression.variables.a a = ((smp) this.this$0.J.get()).a();
        return eVar.d(this.this$0.o(), this.$screenConfig, k6xVar, new lhr(this.this$0), a, this.this$0.K.a(new kjr(g8e.o("morphlex_", this.$screenConfig.a)), a));
    }
}
