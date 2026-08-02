package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class tv1 extends SuspendLambda implements wzs {
    public final /* synthetic */ ov2 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(Context context, ov2 ov2Var, spj spjVar) {
        super(2, spjVar);
        this.b = ov2Var;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new tv1(this.c, this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ov2 ov2Var = this.b;
        return new tv1(this.c, ov2Var, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        bu1 a = ((mv3) this.b).a();
        lb3.a(this.c, a);
        xf.a(this.c, a);
        AtomicBoolean atomicBoolean = ji.a;
        ji.a(this.c, a);
        return s3q0.a;
    }
}
