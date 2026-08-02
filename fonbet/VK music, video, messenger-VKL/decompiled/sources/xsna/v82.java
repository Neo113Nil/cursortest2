package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes11.dex */
public final class v82 {
    public final Context a;

    public v82(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n4s n4sVar, ContinuationImpl continuationImpl) {
        u82 u82Var;
        int i;
        if (continuationImpl instanceof u82) {
            u82Var = (u82) continuationImpl;
            int i2 = u82Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u82Var.label = i2 - Integer.MIN_VALUE;
                Object obj = u82Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u82Var.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (n4sVar instanceof t82) {
                        ((t82) n4sVar).getClass();
                        u82Var.label = 1;
                        throw null;
                    }
                    if (!(n4sVar instanceof uag0)) {
                        throw new IllegalArgumentException("Unknown font type: " + n4sVar);
                    }
                    uag0 uag0Var = (uag0) n4sVar;
                    u82Var.L$0 = n4sVar;
                    u82Var.label = 2;
                    lq9 lq9Var = new lq9(1, s7s0.c(u82Var));
                    lq9Var.o();
                    int i3 = uag0Var.a;
                    w82 w82Var = new w82(lq9Var, uag0Var);
                    ThreadLocal<TypedValue> threadLocal = dbg0.a;
                    if (context.isRestricted()) {
                        w82Var.a(-4);
                    } else {
                        dbg0.b(context, i3, new TypedValue(), 0, w82Var, false, false);
                    }
                    obj = lq9Var.n();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i == 1) {
                        kotlin.a.a(obj);
                        return obj;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n4sVar = (n4s) u82Var.L$0;
                    kotlin.a.a(obj);
                }
                return uua0.a((Typeface) obj, ((uag0) n4sVar).c, context);
            }
        }
        u82Var = new u82(this, continuationImpl);
        Object obj2 = u82Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u82Var.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        return uua0.a((Typeface) obj2, ((uag0) n4sVar).c, context2);
    }

    public final Typeface b(n4s n4sVar) {
        if (n4sVar instanceof t82) {
            throw null;
        }
        if (!(n4sVar instanceof uag0)) {
            return null;
        }
        uag0 uag0Var = (uag0) n4sVar;
        int i = uag0Var.a;
        Context context = this.a;
        return uua0.a(dbg0.a(i, context), uag0Var.c, context);
    }
}
