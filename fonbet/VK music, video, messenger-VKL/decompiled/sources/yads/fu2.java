package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class fu2 extends SuspendLambda implements wzs {
    public final /* synthetic */ j00 b;
    public final /* synthetic */ e83 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu2(j00 j00Var, e83 e83Var, spj spjVar) {
        super(2, spjVar);
        this.b = j00Var;
        this.c = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new fu2(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new fu2(this.b, this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        j00 j00Var = this.b;
        String str = this.c.a;
        as3 as3Var = (as3) j00Var;
        as3Var.getClass();
        new CallbackStackTraceMarker(new zr3(as3Var, str));
        return s3q0.a;
    }
}
