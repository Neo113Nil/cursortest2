package com.yandex.go.taxi.tariffs.interactor;

import defpackage.cwd;
import defpackage.m4r0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldk31;", "<anonymous>", "()Ldk31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1", f = "SetTariffInfoInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1 extends SuspendLambda implements tls {
    final /* synthetic */ cwd $tariffsInfo$inlined;
    int label;
    final /* synthetic */ m4r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1(m4r0 m4r0Var, Continuation continuation, cwd cwdVar) {
        super(1, continuation);
        this.this$0 = m4r0Var;
        this.$tariffsInfo$inlined = cwdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1(this.this$0, continuation, this.$tariffsInfo$inlined);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return this.this$0.e.a(this.$tariffsInfo$inlined);
    }
}
