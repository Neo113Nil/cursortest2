package yads;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class p80 extends SuspendLambda implements wzs {
    public ui50 b;
    public q80 c;
    public q80 d;
    public boolean e;
    public int f;
    public final /* synthetic */ q80 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(q80 q80Var, boolean z, spj spjVar) {
        super(2, spjVar);
        this.g = q80Var;
        this.h = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new p80(this.g, this.h, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new p80(this.g, this.h, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q80 q80Var;
        ui50 ui50Var;
        boolean z;
        q80 q80Var2;
        ui50 ui50Var2;
        Object obj2;
        q80 q80Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                q80Var = this.g;
                ui50 ui50Var3 = q80Var.f;
                boolean z2 = this.h;
                this.b = ui50Var3;
                this.c = q80Var;
                this.e = z2;
                this.f = 1;
                if (ui50Var3.b(this) != coroutineSingletons) {
                    ui50Var = ui50Var3;
                    z = z2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q80Var2 = this.d;
                q80Var3 = this.c;
                ui50Var2 = this.b;
                try {
                    kotlin.a.a(obj);
                    obj2 = ((Result) obj).d();
                    if (obj2 instanceof Result.Failure) {
                        obj2 = null;
                    }
                    q80Var2.e = (j80) obj2;
                    q80Var = q80Var3;
                    u50 a = q80Var.c.a(q80Var.a.a(), q80Var.e);
                    ui50Var2.c(null);
                    return a;
                } catch (Throwable th) {
                    th = th;
                    ui50Var = ui50Var2;
                    ui50Var.c(null);
                    throw th;
                }
            }
            z = this.e;
            q80 q80Var4 = this.c;
            ui50Var = this.b;
            kotlin.a.a(obj);
            q80Var = q80Var4;
            if (q80Var.e != null && !z) {
                ui50Var2 = ui50Var;
                u50 a2 = q80Var.c.a(q80Var.a.a(), q80Var.e);
                ui50Var2.c(null);
                return a2;
            }
            do2 do2Var = q80Var.b;
            this.b = ui50Var;
            this.c = q80Var;
            this.d = q80Var;
            this.f = 2;
            Object a3 = do2Var.a(this);
            if (a3 != coroutineSingletons) {
                q80Var2 = q80Var;
                ui50Var2 = ui50Var;
                obj2 = a3;
                q80Var3 = q80Var2;
                if (obj2 instanceof Result.Failure) {
                }
                q80Var2.e = (j80) obj2;
                q80Var = q80Var3;
                u50 a22 = q80Var.c.a(q80Var.a.a(), q80Var.e);
                ui50Var2.c(null);
                return a22;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            ui50Var.c(null);
            throw th;
        }
    }
}
