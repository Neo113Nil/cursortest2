package ru.rustore.sdk.pushclient.m;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.eay0;
import xsna.izs;
import xsna.jvy0;
import xsna.s3q0;
import xsna.spj;
import xsna.vty0;
import xsna.zvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$testPushRepository$2$1", f = "RepositoryModule.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class o extends SuspendLambda implements izs<spj<? super jvy0>, Object> {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new o(1, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super jvy0> spjVar) {
        return new o(1, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            vty0 a = p.a();
            this.a = 1;
            obj = zvj.d(new ru.rustore.sdk.pushclient.l.l(a.a.a, false, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ((eay0) obj).getClass();
        throw new IllegalArgumentException("TestPushIPCClient must be created at TestMasterHostIPCClientsFactory");
    }
}
