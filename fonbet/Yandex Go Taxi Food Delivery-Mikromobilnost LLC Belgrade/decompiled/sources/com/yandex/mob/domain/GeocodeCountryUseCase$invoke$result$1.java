package com.yandex.mob.domain;

import defpackage.bms;
import defpackage.co20;
import defpackage.go20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lpr20;", "proxy", "Lgo20;", "headers", "Loq20;", "query", "Lxl20;", "Lfo20;", "<anonymous>", "(Lpr20;Lgo20;Loq20;)Lxl20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.GeocodeCountryUseCase$invoke$result$1", f = "GeocodeCountryUseCase.kt", l = {25, 22}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GeocodeCountryUseCase$invoke$result$1 extends SuspendLambda implements bms {
    final /* synthetic */ co20 $body;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeocodeCountryUseCase$invoke$result$1(i iVar, co20 co20Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = iVar;
        this.$body = co20Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        GeocodeCountryUseCase$invoke$result$1 geocodeCountryUseCase$invoke$result$1 = new GeocodeCountryUseCase$invoke$result$1(this.this$0, this.$body, (Continuation) obj4);
        geocodeCountryUseCase$invoke$result$1.L$0 = (pr20) obj;
        geocodeCountryUseCase$invoke$result$1.L$1 = (go20) obj2;
        geocodeCountryUseCase$invoke$result$1.L$2 = (oq20) obj3;
        return geocodeCountryUseCase$invoke$result$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.mob.okhttp.c cVar;
        pr20 pr20Var = (pr20) this.L$0;
        go20 go20Var = (go20) this.L$1;
        oq20 oq20Var = (oq20) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            com.yandex.mob.okhttp.c cVar2 = iVar.a;
            m mVar = iVar.c;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = cVar2;
            this.L$4 = pr20Var;
            this.L$5 = oq20Var;
            this.label = 1;
            obj = mVar.a(go20Var, kotlin.collections.b.f(), this);
            if (obj != coroutineSingletons) {
                cVar = cVar2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oq20Var = (oq20) this.L$5;
        pr20Var = (pr20) this.L$4;
        com.yandex.mob.okhttp.c cVar3 = (com.yandex.mob.okhttp.c) this.L$3;
        kotlin.b.b(obj);
        cVar = cVar3;
        pr20 pr20Var2 = pr20Var;
        oq20 oq20Var2 = oq20Var;
        co20 co20Var = this.$body;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        Object a = cVar.a(pr20Var2, oq20Var2, (go20) obj, co20Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
