package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class gu2 extends SuspendLambda implements wzs {
    public final /* synthetic */ j00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(j00 j00Var, spj spjVar) {
        super(2, spjVar);
        this.b = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new gu2(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new gu2(this.b, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        as3 as3Var = (as3) this.b;
        as3Var.getClass();
        new CallbackStackTraceMarker(new yr3(as3Var));
        return s3q0.a;
    }
}
