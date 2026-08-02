package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class i52 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ k52 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ sz1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i52(k52 k52Var, Context context, sz1 sz1Var, spj spjVar) {
        super(2, spjVar);
        this.c = k52Var;
        this.d = context;
        this.e = sz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new i52(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((i52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            t82 t82Var = this.c.b;
            Context context = this.d;
            sz1 sz1Var = this.e;
            this.b = 1;
            if (t82Var.a(context, sz1Var, this) == coroutineSingletons) {
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
