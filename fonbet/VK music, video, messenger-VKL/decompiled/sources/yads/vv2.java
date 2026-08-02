package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class vv2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ dw2 c;
    public final /* synthetic */ wv2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv2(dw2 dw2Var, wv2 wv2Var, spj spjVar) {
        super(2, spjVar);
        this.c = dw2Var;
        this.d = wv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new vv2(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new vv2(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                dw2 dw2Var = this.c;
                t61 t61Var = t61.c;
                this.b = 1;
                obj = dw2Var.a(t61Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.d.d.a((uv2) obj);
            wv2.f.remove(this.c);
            return s3q0.a;
        } catch (Throwable th) {
            wv2.f.remove(this.c);
            throw th;
        }
    }
}
