package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class xq1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ rr1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, rr1 rr1Var, spj spjVar) {
        super(2, spjVar);
        this.c = aVar;
        this.d = context;
        this.e = rr1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new xq1(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((xq1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.c;
            Context context = this.d;
            rr1 rr1Var = this.e;
            this.b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.g;
            if (aVar.a(context, rr1Var, this) == coroutineSingletons) {
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
