package yads;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class ep3 extends SuspendLambda implements wzs {
    public /* synthetic */ Object b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep3(Context context, spj spjVar) {
        super(2, spjVar);
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        ep3 ep3Var = new ep3(this.c, spjVar);
        ep3Var.b = obj;
        return ep3Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ep3 ep3Var = new ep3(this.c, (spj) obj2);
        ep3Var.b = (yvj) obj;
        return ep3Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        try {
            failure = WebSettings.getDefaultUserAgent(this.c.getApplicationContext());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
