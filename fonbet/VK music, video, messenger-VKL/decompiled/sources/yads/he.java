package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class he extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ ie c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ie ieVar, spj spjVar) {
        super(2, spjVar);
        this.c = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new he(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new he(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            ie ieVar = this.c;
            this.b = 1;
            obj = myc0.k(ieVar.a, new ge(ieVar, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        vd vdVar = (vd) obj;
        return (vdVar.a == null && vdVar.b == null) ? je.a : new ke(vdVar);
    }
}
