package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wgl;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class vf1 extends SuspendLambda implements wzs {
    public ui50 b;
    public ag1 c;
    public int d;
    public final /* synthetic */ ag1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf1(ag1 ag1Var, spj spjVar) {
        super(2, spjVar);
        this.e = ag1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new vf1(this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new vf1(this.e, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r7.b(r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ag1 ag1Var;
        ui50 ui50Var;
        ui50 ui50Var2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ag1Var = this.e;
                ui50Var = ag1Var.d;
                this.b = ui50Var;
                this.c = ag1Var;
                this.d = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ui50Var2 = this.b;
                    try {
                        kotlin.a.a(obj);
                        String str = (String) obj;
                        ui50Var2.c(null);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        ui50Var2.c(null);
                        throw th;
                    }
                }
                ag1Var = this.c;
                ui50 ui50Var3 = this.b;
                kotlin.a.a(obj);
                ui50Var = ui50Var3;
            }
            this.b = ui50Var;
            this.c = null;
            this.d = 2;
            ag1Var.getClass();
            bdn bdnVar = bdn.a;
            Object k = myc0.k(wgl.c, new xf1(ag1Var, null), this);
            if (k != coroutineSingletons) {
                ui50Var2 = ui50Var;
                obj = k;
                String str2 = (String) obj;
                ui50Var2.c(null);
                return str2;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            ui50Var2 = ui50Var;
            th = th3;
            ui50Var2.c(null);
            throw th;
        }
    }
}
