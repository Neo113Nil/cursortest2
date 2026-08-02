package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.n7i;
import xsna.o7i;
import xsna.oxo0;
import xsna.p7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* renamed from: yads.if, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cif extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ jf c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(jf jfVar, long j, spj spjVar) {
        super(2, spjVar);
        this.c = jfVar;
        this.d = j;
    }

    public static final void a(n7i n7iVar) {
        n7iVar.h(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new Cif(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new Cif(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            o7i a = p7i.a();
            this.c.b.post(new xsna.sc2(a, 14));
            long j = this.d;
            hf hfVar = new hf(a, null);
            this.b = 1;
            obj = oxo0.c(j, hfVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return Boolean.valueOf(obj != null);
    }
}
