package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.uu0;
import yads.xu0;
import yads.zu0;

/* loaded from: classes7.dex */
public final class aw81 {
    public final mg81 a;
    public final lm71 b;

    public aw81(Context context) {
        mg81 mg81Var = new mg81(context);
        lm71 lm71Var = new lm71(context);
        this.a = mg81Var;
        this.b = lm71Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)(1:19)|16|17)(2:21|22))(2:23|24))(2:29|(2:31|32)(2:33|(2:35|27)))|25|(5:28|13|(0)(0)|16|17)|27))|37|6|7|(0)(0)|25|(0)|27) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #0 {Exception -> 0x0081, blocks: (B:12:0x002c, B:13:0x0072, B:19:0x007c, B:24:0x0038, B:25:0x0059, B:33:0x004a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ud71 ud71Var, ContinuationImpl continuationImpl) {
        uu0 uu0Var;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        zu0 zu0Var;
        ud71 ud71Var2;
        if (continuationImpl instanceof uu0) {
            uu0Var = (uu0) continuationImpl;
            int i2 = uu0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uu0Var.e = i2 - Integer.MIN_VALUE;
                obj = uu0Var.c;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uu0Var.e;
                boolean z = false;
                lm71 lm71Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (lm71Var.p(ud71Var.a) != null) {
                        return Boolean.TRUE;
                    }
                    mg81 mg81Var = this.a;
                    String str = ud71Var.b;
                    uu0Var.b = ud71Var;
                    uu0Var.e = 1;
                    obj = mg81Var.a(str, uu0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ud71Var2 = uu0Var.b;
                        b.b(obj);
                        if (lm71Var.p(ud71Var2.a) == null) {
                            z = true;
                        } else {
                            ud71Var2.a.name();
                        }
                        return Boolean.valueOf(z);
                    }
                    ud71Var = uu0Var.b;
                    b.b(obj);
                }
                zu0Var = ud71Var.a;
                uu0Var.b = ud71Var;
                uu0Var.e = 2;
                sjh sjhVar = uyj.a;
                if (tje.k0(mdh.b, new xu0((byte[]) obj, this, zu0Var, null), uu0Var) != coroutineSingletons) {
                    ud71Var2 = ud71Var;
                    if (lm71Var.p(ud71Var2.a) == null) {
                    }
                    return Boolean.valueOf(z);
                }
                return coroutineSingletons;
            }
        }
        uu0Var = new uu0(this, continuationImpl);
        obj = uu0Var.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uu0Var.e;
        boolean z2 = false;
        lm71 lm71Var2 = this.b;
        if (i != 0) {
        }
        zu0Var = ud71Var.a;
        uu0Var.b = ud71Var;
        uu0Var.e = 2;
        sjh sjhVar2 = uyj.a;
        if (tje.k0(mdh.b, new xu0((byte[]) obj, this, zu0Var, null), uu0Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
