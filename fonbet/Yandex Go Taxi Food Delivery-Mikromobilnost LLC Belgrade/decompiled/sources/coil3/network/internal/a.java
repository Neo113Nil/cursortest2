package coil3.network.internal;

import defpackage.gwk0;
import defpackage.ny61;
import defpackage.ojt0;
import defpackage.yp6;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ojt0 ojt0Var, ContinuationImpl continuationImpl) {
        UtilsKt$readBuffer$1 utilsKt$readBuffer$1;
        int i;
        AutoCloseable autoCloseable;
        Throwable th;
        yp6 yp6Var;
        if (continuationImpl instanceof UtilsKt$readBuffer$1) {
            utilsKt$readBuffer$1 = (UtilsKt$readBuffer$1) continuationImpl;
            int i2 = utilsKt$readBuffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utilsKt$readBuffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = utilsKt$readBuffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = utilsKt$readBuffer$1.label;
                if (i != 0) {
                    b.b(obj);
                    try {
                        yp6 yp6Var2 = new yp6();
                        utilsKt$readBuffer$1.L$0 = ojt0Var;
                        utilsKt$readBuffer$1.L$1 = yp6Var2;
                        utilsKt$readBuffer$1.label = 1;
                        ojt0Var.a.y0(yp6Var2);
                        if (zy11.a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        autoCloseable = ojt0Var;
                        yp6Var = yp6Var2;
                    } catch (Throwable th2) {
                        autoCloseable = ojt0Var;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yp6Var = (yp6) utilsKt$readBuffer$1.L$1;
                    autoCloseable = (AutoCloseable) utilsKt$readBuffer$1.L$0;
                    try {
                        b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            gwk0.m(autoCloseable, th);
                            throw th4;
                        }
                    }
                }
                gwk0.m(autoCloseable, null);
                return yp6Var;
            }
        }
        utilsKt$readBuffer$1 = new UtilsKt$readBuffer$1(continuationImpl);
        Object obj2 = utilsKt$readBuffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = utilsKt$readBuffer$1.label;
        if (i != 0) {
        }
        gwk0.m(autoCloseable, null);
        return yp6Var;
    }
}
