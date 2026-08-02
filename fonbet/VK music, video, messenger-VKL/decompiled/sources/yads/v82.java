package yads;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class v82 extends SuspendLambda implements wzs {
    public we3 b;
    public int c;
    public final /* synthetic */ we3 d;
    public final /* synthetic */ z82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v82(we3 we3Var, z82 z82Var, spj spjVar) {
        super(2, spjVar);
        this.d = we3Var;
        this.e = z82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new v82(this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new v82(this.d, this.e, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        we3 we3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.a.a(obj);
            we3 we3Var2 = this.d;
            if (we3Var2 == null) {
                return null;
            }
            z82 z82Var = this.e;
            List list = we3Var2.a;
            this.b = we3Var2;
            this.c = 1;
            z82Var.getClass();
            bdn bdnVar = bdn.a;
            Object k = myc0.k(wgl.c, new y82(z82Var, list, null), this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            we3Var = we3Var2;
            obj = k;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            we3Var = this.b;
            kotlin.a.a(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            throw new a22("Invalid VAST in response");
        }
        return new we3(list2, we3Var.b, we3Var.c);
    }
}
