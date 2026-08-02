package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class aw2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dw2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(boolean z, dw2 dw2Var, spj spjVar) {
        super(2, spjVar);
        this.c = z;
        this.d = dw2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new aw2(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new aw2(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.c) {
                dj0 dj0Var = this.d.q;
                this.b = 1;
                if (dj0Var.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
