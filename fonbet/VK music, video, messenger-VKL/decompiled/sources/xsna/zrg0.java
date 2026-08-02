package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DataStoreImpl.kt */
/* loaded from: classes.dex */
public abstract class zrg0 {
    public final wi50 a = bay.a();
    public final o7i b = p7i.a();

    public abstract Object a(ContinuationImpl continuationImpl);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {all -> 0x0076, blocks: (B:25:0x0068, B:27:0x0070, B:30:0x007a), top: B:24:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0076, blocks: (B:25:0x0068, B:27:0x0070, B:30:0x007a), top: B:24:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        yrg0 yrg0Var;
        int i;
        wi50 wi50Var;
        zrg0 zrg0Var;
        ui50 ui50Var;
        Throwable th;
        zrg0 zrg0Var2;
        try {
            if (continuationImpl instanceof yrg0) {
                yrg0Var = (yrg0) continuationImpl;
                int i2 = yrg0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yrg0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = yrg0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = yrg0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (this.b.m()) {
                            return s3q0.a;
                        }
                        yrg0Var.L$0 = this;
                        wi50Var = this.a;
                        yrg0Var.L$1 = wi50Var;
                        yrg0Var.label = 1;
                        if (wi50Var.b(yrg0Var) != coroutineSingletons) {
                            zrg0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = (ui50) yrg0Var.L$1;
                        zrg0Var2 = (zrg0) yrg0Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            o7i o7iVar = zrg0Var2.b;
                            s3q0 s3q0Var = s3q0.a;
                            o7iVar.i0(s3q0Var);
                            ui50Var.c(null);
                            return s3q0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ?? r2 = (ui50) yrg0Var.L$1;
                    zrg0Var = (zrg0) yrg0Var.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r2;
                    if (!zrg0Var.b.m()) {
                        s3q0 s3q0Var2 = s3q0.a;
                        wi50Var.c(null);
                        return s3q0Var2;
                    }
                    yrg0Var.L$0 = zrg0Var;
                    yrg0Var.L$1 = wi50Var;
                    yrg0Var.label = 2;
                    if (zrg0Var.a(yrg0Var) != coroutineSingletons) {
                        ui50Var = wi50Var;
                        zrg0Var2 = zrg0Var;
                        o7i o7iVar2 = zrg0Var2.b;
                        s3q0 s3q0Var3 = s3q0.a;
                        o7iVar2.i0(s3q0Var3);
                        ui50Var.c(null);
                        return s3q0Var3;
                    }
                    return coroutineSingletons;
                }
            }
            if (!zrg0Var.b.m()) {
            }
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
        yrg0Var = new yrg0(this, continuationImpl);
        Object obj2 = yrg0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yrg0Var.label;
        if (i != 0) {
        }
    }
}
