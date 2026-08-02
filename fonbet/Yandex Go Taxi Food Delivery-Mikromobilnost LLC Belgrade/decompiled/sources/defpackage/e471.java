package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.aj0;
import yads.bj0;
import yads.f5;

/* loaded from: classes7.dex */
public final class e471 {
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public final e971 a;
    public final Context b;
    public final e181 c;
    public final z381 d;

    public e471(Context context, e971 e971Var) {
        Context applicationContext = context.getApplicationContext();
        e181 e181Var = new e181();
        z381 z381Var = new z381();
        this.a = e971Var;
        this.b = applicationContext;
        this.c = e181Var;
        this.d = z381Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        aj0 aj0Var;
        int i;
        f5 f5Var;
        e971 e971Var;
        if (continuationImpl instanceof aj0) {
            aj0Var = (aj0) continuationImpl;
            int i2 = aj0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aj0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = aj0Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aj0Var.f;
                if (i != 0) {
                    b.b(obj);
                    if (e.getAndSet(false)) {
                        f5 f5Var2 = f5.E;
                        e971 e971Var2 = this.a;
                        e971Var2.b(f5Var2, null);
                        try {
                            sjh sjhVar = uyj.a;
                            mdh mdhVar = mdh.b;
                            bj0 bj0Var = new bj0(this, null);
                            aj0Var.b = e971Var2;
                            aj0Var.c = f5Var2;
                            aj0Var.f = 1;
                            if (tje.k0(mdhVar, bj0Var, aj0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable unused) {
                        }
                        f5Var = f5Var2;
                        e971Var = e971Var2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f5Var = aj0Var.c;
                e971Var = aj0Var.b;
                try {
                    b.b(obj);
                } catch (Throwable unused2) {
                }
                e971Var.a(f5Var);
                return zy11.a;
            }
        }
        aj0Var = new aj0(this, continuationImpl);
        Object obj2 = aj0Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aj0Var.f;
        if (i != 0) {
        }
        e971Var.a(f5Var);
        return zy11.a;
    }
}
