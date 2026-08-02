package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class wd extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ yd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(yd ydVar, spj spjVar) {
        super(2, spjVar);
        this.c = ydVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new wd(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new wd(this.c, (spj) obj2).invokeSuspend(s3q0.a);
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
        ie ieVar = this.c.a;
        this.b = 1;
        Object k = myc0.k(ieVar.a, new he(ieVar, null), this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
