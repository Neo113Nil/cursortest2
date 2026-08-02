package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class m02 extends SuspendLambda implements wzs {
    public final /* synthetic */ n02 b;
    public final /* synthetic */ v9 c;
    public final /* synthetic */ e22 d;
    public final /* synthetic */ y02 e;
    public final /* synthetic */ i02 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(n02 n02Var, v9 v9Var, e22 e22Var, y02 y02Var, i02 i02Var, spj spjVar) {
        super(2, spjVar);
        this.b = n02Var;
        this.c = v9Var;
        this.d = e22Var;
        this.e = y02Var;
        this.f = i02Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new m02(this.b, this.c, this.d, this.e, this.f, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((m02) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        new l02(this.b, this.c, this.d, this.e, this.f, new br2()).run();
        return s3q0.a;
    }
}
