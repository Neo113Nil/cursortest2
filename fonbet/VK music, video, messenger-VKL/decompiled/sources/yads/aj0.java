package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.e43;
import xsna.oxo0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class aj0 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ dj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(dj0 dj0Var, spj spjVar) {
        super(2, spjVar);
        this.c = dj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new aj0(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new aj0(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            dj0 dj0Var = this.c;
            AtomicBoolean atomicBoolean = dj0.e;
            dj0Var.getClass();
            ListBuilder e = e43.e();
            String a = cc3.a(dj0Var.c.a(dj0Var.b));
            if (a != null) {
                e.add(a);
            }
            ListBuilder g = e.g();
            if (g.isEmpty()) {
                return s3q0.a;
            }
            dj0 dj0Var2 = this.c;
            this.b = 1;
            dj0Var2.getClass();
            Object b = oxo0.b(2500L, new cj0(dj0Var2, g, null), this);
            if (b != obj2) {
                b = s3q0.a;
            }
            if (b == obj2) {
                return obj2;
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
