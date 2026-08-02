package ru.rustore.sdk.pushclient.l;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.nyy0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$createIPCClients$2$1", f = "IPCClientsDataSource.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class j extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public int a;
    public final /* synthetic */ nyy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nyy0 nyy0Var, spj<? super j> spjVar) {
        super(2, spjVar);
        this.b = nyy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return new j(this.b, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            a.a(obj);
            nyy0 nyy0Var = this.b;
            this.a = 1;
            if (nyy0Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }
}
