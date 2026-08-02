package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class yn extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ zn c;
    public final /* synthetic */ vb3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(zn znVar, vb3 vb3Var, spj spjVar) {
        super(2, spjVar);
        this.c = znVar;
        this.d = vb3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new yn(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new yn(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            zn znVar = this.c;
            vb3 vb3Var = this.d;
            this.b = 1;
            if (zn.a(znVar, vb3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
