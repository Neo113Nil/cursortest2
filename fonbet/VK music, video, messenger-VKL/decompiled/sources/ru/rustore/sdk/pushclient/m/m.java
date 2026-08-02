package ru.rustore.sdk.pushclient.m;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$provideIPCClientsDataSource$2", f = "RepositoryModule.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class m extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new m(1, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return new m(1, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            ru.rustore.sdk.pushclient.k.b bVar = (ru.rustore.sdk.pushclient.k.b) h.e.getValue();
            this.a = 1;
            if (bVar.d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
