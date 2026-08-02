package ru.rustore.sdk.pushclient.a;

import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import ru.rustore.sdk.pushclient.a.h;
import xsna.b6l;
import xsna.d5o0;
import xsna.izs;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.yok0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$pushTestComponent$2$1", f = "VkpnsClientSdk.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class o extends SuspendLambda implements izs<spj<? super Result<? extends String>>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, spj<? super o> spjVar) {
        super(1, spjVar);
        this.b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new o(this.b, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Result<? extends String>> spjVar) {
        return new o(this.b, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            yok0 yok0Var = this.b.s;
            if (yok0Var != null) {
                this.a = 1;
                if (yok0Var.y(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        try {
            h.b bVar = h.t;
            d5o0 d5o0Var = new d5o0();
            Pair pair = new Pair(d5o0Var, new d5o0.a());
            d5o0 d5o0Var2 = (d5o0) pair.d();
            myc0.h(h.v, wgl.c, null, new g((d5o0.a) pair.g(), null), 2);
            failure = (String) d5o0Var2.c();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
