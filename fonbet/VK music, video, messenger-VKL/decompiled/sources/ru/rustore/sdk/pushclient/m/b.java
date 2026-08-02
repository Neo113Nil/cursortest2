package ru.rustore.sdk.pushclient.m;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.eay0;
import xsna.izs;
import xsna.jfy0;
import xsna.nyy0;
import xsna.s3q0;
import xsna.spj;
import xsna.vty0;
import xsna.zvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.di.ComponentModule$subscribeComponent$2$1", f = "ComponentModule.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements izs<spj<? super jfy0>, Object> {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new b(1, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super jfy0> spjVar) {
        return new b(1, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            vty0 a = p.a();
            this.a = 1;
            nyy0 nyy0Var = a.a.a;
            nyy0Var.getClass();
            obj = zvj.d(new ru.rustore.sdk.pushclient.l.l(nyy0Var, false, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        eay0 eay0Var = (eay0) obj;
        return new jfy0(eay0Var.a, eay0Var.b);
    }
}
