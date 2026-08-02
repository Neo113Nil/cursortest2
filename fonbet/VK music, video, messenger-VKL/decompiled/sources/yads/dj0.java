package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class dj0 {
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public final w5 a;
    public final Context b;
    public final a5 c;
    public final e11 d;

    public /* synthetic */ dj0(Context context, w5 w5Var) {
        this(w5Var, context.getApplicationContext(), new a5(), new e11());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj spjVar) {
        zi0 zi0Var;
        int i;
        w5 w5Var;
        Throwable th;
        v5 v5Var;
        if (spjVar instanceof zi0) {
            zi0Var = (zi0) spjVar;
            int i2 = zi0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zi0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = zi0Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zi0Var.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (e.getAndSet(false)) {
                        w5 w5Var2 = this.a;
                        v5 v5Var2 = v5.z;
                        w5Var2.b(v5Var2);
                        try {
                            ovj a = w10.a();
                            aj0 aj0Var = new aj0(this, null);
                            zi0Var.b = w5Var2;
                            zi0Var.c = v5Var2;
                            zi0Var.f = 1;
                            if (myc0.k(a, aj0Var, zi0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            w5Var = w5Var2;
                            v5Var = v5Var2;
                        } catch (Throwable th2) {
                            w5Var = w5Var2;
                            th = th2;
                            v5Var = v5Var2;
                            th.getMessage();
                            s3q0 s3q0Var = s3q0.a;
                            w5Var.a(v5Var);
                            return s3q0.a;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v5Var = zi0Var.c;
                w5Var = zi0Var.b;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable th3) {
                    th = th3;
                    th.getMessage();
                    s3q0 s3q0Var2 = s3q0.a;
                    w5Var.a(v5Var);
                    return s3q0.a;
                }
                s3q0 s3q0Var22 = s3q0.a;
                w5Var.a(v5Var);
                return s3q0.a;
            }
        }
        zi0Var = new zi0(this, spjVar);
        Object obj2 = zi0Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zi0Var.f;
        if (i != 0) {
        }
        s3q0 s3q0Var222 = s3q0.a;
        w5Var.a(v5Var);
        return s3q0.a;
    }

    public dj0(w5 w5Var, Context context, a5 a5Var, e11 e11Var) {
        this.a = w5Var;
        this.b = context;
        this.c = a5Var;
        this.d = e11Var;
    }

    public final void a(String str) {
        this.d.a(2000, str);
    }
}
