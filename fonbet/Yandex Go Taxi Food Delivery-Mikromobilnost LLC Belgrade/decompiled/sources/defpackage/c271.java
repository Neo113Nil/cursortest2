package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.cz0;
import yads.yo;

/* loaded from: classes7.dex */
public final class c271 {
    public final fe81 a;
    public final v981 b;

    public c271(fe81 fe81Var, v981 v981Var) {
        this.a = fe81Var;
        this.b = v981Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, yo yoVar, ContinuationImpl continuationImpl) {
        cz0 cz0Var;
        int i;
        if (continuationImpl instanceof cz0) {
            cz0Var = (cz0) continuationImpl;
            int i2 = cz0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cz0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = cz0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cz0Var.d;
                if (i != 0) {
                    b.b(obj);
                    pp81 pp81Var = new pp81(this.a, this.b, yoVar);
                    cz0Var.d = 1;
                    obj = pp81Var.a(context, cz0Var);
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
        cz0Var = new cz0(this, continuationImpl);
        Object obj2 = cz0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cz0Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
