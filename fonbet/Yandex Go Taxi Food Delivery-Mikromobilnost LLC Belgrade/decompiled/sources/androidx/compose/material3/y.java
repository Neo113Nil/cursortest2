package androidx.compose.material3;

import defpackage.dvw;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.j18;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.r0t0;
import defpackage.s0t0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class y {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final oz40 b = androidx.compose.runtime.f.j(null);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.material3.y] */
    /* JADX WARN: Type inference failed for: r7v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s0t0 s0t0Var, ContinuationImpl continuationImpl) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        int i;
        oz40 oz40Var;
        Object obj;
        try {
            try {
                if (continuationImpl instanceof SnackbarHostState$showSnackbar$2) {
                    snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) continuationImpl;
                    int i2 = snackbarHostState$showSnackbar$2.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$2.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = snackbarHostState$showSnackbar$2.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = snackbarHostState$showSnackbar$2.label;
                        oz40Var = this.b;
                        if (i != 0) {
                            kotlin.b.b(obj2);
                            snackbarHostState$showSnackbar$2.L$0 = s0t0Var;
                            kotlinx.coroutines.sync.a aVar = this.a;
                            snackbarHostState$showSnackbar$2.L$1 = aVar;
                            snackbarHostState$showSnackbar$2.label = 1;
                            Object a = aVar.a(snackbarHostState$showSnackbar$2);
                            obj = aVar;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050 g050Var = (g050) snackbarHostState$showSnackbar$2.L$1;
                                kotlin.b.b(obj2);
                                this = g050Var;
                                return obj2;
                            }
                            Object obj3 = (g050) snackbarHostState$showSnackbar$2.L$1;
                            s0t0Var = (s0t0) snackbarHostState$showSnackbar$2.L$0;
                            kotlin.b.b(obj2);
                            obj = obj3;
                        }
                        snackbarHostState$showSnackbar$2.L$0 = s0t0Var;
                        snackbarHostState$showSnackbar$2.L$1 = obj;
                        snackbarHostState$showSnackbar$2.L$2 = snackbarHostState$showSnackbar$2;
                        snackbarHostState$showSnackbar$2.label = 2;
                        j18 j18Var = new j18(1, dvw.b(snackbarHostState$showSnackbar$2));
                        j18Var.u();
                        oz40Var.setValue(new r0t0(s0t0Var, j18Var));
                        obj2 = j18Var.s();
                        this = obj;
                    }
                }
                if (i != 0) {
                }
                snackbarHostState$showSnackbar$2.L$0 = s0t0Var;
                snackbarHostState$showSnackbar$2.L$1 = obj;
                snackbarHostState$showSnackbar$2.L$2 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.label = 2;
                j18 j18Var2 = new j18(1, dvw.b(snackbarHostState$showSnackbar$2));
                j18Var2.u();
                oz40Var.setValue(new r0t0(s0t0Var, j18Var2));
                obj2 = j18Var2.s();
                this = obj;
            } finally {
                oz40Var.setValue(null);
            }
        } finally {
            this.d(null);
        }
        snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuationImpl);
        Object obj22 = snackbarHostState$showSnackbar$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snackbarHostState$showSnackbar$2.label;
        oz40Var = this.b;
    }
}
