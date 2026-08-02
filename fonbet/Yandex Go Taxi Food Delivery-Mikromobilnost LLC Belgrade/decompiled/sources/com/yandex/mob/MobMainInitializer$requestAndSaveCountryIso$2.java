package com.yandex.mob;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.xo20;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lmn20;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$requestAndSaveCountryIso$2", f = "MobMainInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$requestAndSaveCountryIso$2 extends SuspendLambda implements zls {
    final /* synthetic */ oo20 $this_requestAndSaveCountryIso;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$requestAndSaveCountryIso$2(oo20 oo20Var, Continuation continuation) {
        super(3, continuation);
        this.$this_requestAndSaveCountryIso = oo20Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MobMainInitializer$requestAndSaveCountryIso$2 mobMainInitializer$requestAndSaveCountryIso$2 = new MobMainInitializer$requestAndSaveCountryIso$2(this.$this_requestAndSaveCountryIso, (Continuation) obj3);
        mobMainInitializer$requestAndSaveCountryIso$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        mobMainInitializer$requestAndSaveCountryIso$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((xo20) this.$this_requestAndSaveCountryIso).c().a("CountryIsoChange", th);
        return zy11.a;
    }
}
