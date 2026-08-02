package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.ye2;
import yads.yo;

/* loaded from: classes7.dex */
public final class n191 {
    public final fe81 a;
    public final v981 b;

    public n191(fe81 fe81Var, v981 v981Var) {
        this.a = fe81Var;
        this.b = v981Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, yo yoVar, ContinuationImpl continuationImpl) {
        ye2 ye2Var;
        int i;
        if (continuationImpl instanceof ye2) {
            ye2Var = (ye2) continuationImpl;
            int i2 = ye2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ye2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = ye2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ye2Var.d;
                if (i != 0) {
                    b.b(obj);
                    mv81 mv81Var = new mv81(this.a, this.b, yoVar);
                    ye2Var.d = 1;
                    obj = mv81Var.a(context, ye2Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (String) obj;
            }
        }
        ye2Var = new ye2(this, continuationImpl);
        Object obj2 = ye2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ye2Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
