package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.izs;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class pf1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ qf1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ izs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf1(qf1 qf1Var, String str, String str2, izs izsVar, spj spjVar) {
        super(2, spjVar);
        this.c = qf1Var;
        this.d = str;
        this.e = str2;
        this.f = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new pf1(this.c, this.d, this.e, this.f, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((pf1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (xsna.myc0.k(xsna.wgl.c, new yads.yf1(r7, r1, null), r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            ag1 ag1Var = this.c.c;
            String str = this.d;
            this.b = 1;
            ag1Var.getClass();
            bdn bdnVar = bdn.a;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.f.invoke(this.d);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        ag1 ag1Var2 = this.c.c;
        String str2 = this.e;
        this.b = 2;
        ag1Var2.getClass();
        bdn bdnVar2 = bdn.a;
        Object k = myc0.k(wgl.c, new zf1(ag1Var2, str2, null), this);
        if (k != obj2) {
            k = s3q0.a;
        }
    }
}
