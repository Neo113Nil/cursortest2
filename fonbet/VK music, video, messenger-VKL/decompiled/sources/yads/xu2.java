package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.ui50;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class xu2 extends SuspendLambda implements wzs {
    public ui50 b;
    public yu2 c;
    public t61 d;
    public int e;
    public final /* synthetic */ yu2 f;
    public final /* synthetic */ t61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(yu2 yu2Var, t61 t61Var, spj spjVar) {
        super(2, spjVar);
        this.f = yu2Var;
        this.g = t61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new xu2(this.f, this.g, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new xu2(this.f, this.g, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r10.b(r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ui50 ui50Var;
        yu2 yu2Var;
        t61 t61Var;
        ui50 ui50Var2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.f.a.a(v5.j, null);
                ui50Var = yu2.d;
                yu2Var = this.f;
                t61Var = this.g;
                this.b = ui50Var;
                this.c = yu2Var;
                this.d = t61Var;
                this.e = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ui50Var2 = this.b;
                    try {
                        kotlin.a.a(obj);
                        lv2 lv2Var = (lv2) obj;
                        ui50Var2.c(null);
                        return lv2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        ui50Var2.c(null);
                        throw th;
                    }
                }
                t61Var = this.d;
                yu2Var = this.c;
                ui50 ui50Var3 = this.b;
                kotlin.a.a(obj);
                ui50Var = ui50Var3;
            }
            yu2Var.a.a(v5.j);
            this.b = ui50Var;
            this.c = yu2Var;
            this.d = t61Var;
            this.e = 2;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            lq9Var.r(new vu2(yu2Var));
            yu2Var.c.a(yu2Var.b, t61Var, new wu2(lq9Var));
            Object n = lq9Var.n();
            if (n != coroutineSingletons) {
                ui50Var2 = ui50Var;
                obj = n;
                lv2 lv2Var2 = (lv2) obj;
                ui50Var2.c(null);
                return lv2Var2;
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
