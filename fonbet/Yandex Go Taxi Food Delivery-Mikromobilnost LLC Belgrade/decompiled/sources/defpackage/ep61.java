package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.a;
import yads.ac2;
import yads.xb2;

/* loaded from: classes7.dex */
public final class ep61 {
    public final Context a;

    public ep61(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(2:15|(1:17))|20))|28|6|7|(0)(0)|11|(3:13|15|(0)(0))|20) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        xb2 xb2Var;
        int i;
        qw2 qw2Var;
        String str;
        if (continuationImpl instanceof xb2) {
            xb2Var = (xb2) continuationImpl;
            int i2 = xb2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xb2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = xb2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xb2Var.d;
                if (i != 0) {
                    b.b(obj);
                    ac2 ac2Var = new ac2(this, null);
                    xb2Var.d = 1;
                    obj = a.w(j, ac2Var, xb2Var);
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
                qw2Var = (qw2) obj;
                if (qw2Var != null && (str = qw2Var.a) != null) {
                    if (evu0.J(str)) {
                        return str;
                    }
                }
                return null;
            }
        }
        xb2Var = new xb2(this, continuationImpl);
        Object obj2 = xb2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xb2Var.d;
        if (i != 0) {
        }
        qw2Var = (qw2) obj2;
        if (qw2Var != null) {
            if (evu0.J(str)) {
            }
        }
        return null;
    }
}
