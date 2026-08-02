package yads;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class x82 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ z82 c;
    public final /* synthetic */ nf3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(z82 z82Var, nf3 nf3Var, spj spjVar) {
        super(2, spjVar);
        this.c = z82Var;
        this.d = nf3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new x82(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new x82(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        z82 z82Var = this.c;
        List singletonList = Collections.singletonList(this.d);
        this.b = 1;
        Object a = z82.a(z82Var, singletonList, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
