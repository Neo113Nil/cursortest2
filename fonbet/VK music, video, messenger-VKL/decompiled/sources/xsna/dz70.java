package xsna;

import java.io.Closeable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OkioStorage.kt */
/* loaded from: classes.dex */
public final class dz70<T> extends uy70<T> implements y2y0<T> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:17:0x0096, B:28:0x00a2, B:59:0x0053), top: B:58:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:17:0x0096, B:28:0x00a2, B:59:0x0053), top: B:58:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // xsna.y2y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, ContinuationImpl continuationImpl) {
        cz70 cz70Var;
        int i;
        ?? r0;
        Throwable th;
        Closeable closeable;
        y8r y8rVar;
        Throwable th2;
        if (continuationImpl instanceof cz70) {
            cz70Var = (cz70) continuationImpl;
            int i2 = cz70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cz70Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cz70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cz70Var.label;
                Throwable th3 = null;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    if (this.d.a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    y8r g = this.a.g(this.b);
                    try {
                        d8f0 d8f0Var = new d8f0(y8r.r(g));
                        try {
                            vy70<T> vy70Var = this.c;
                            cz70Var.L$0 = g;
                            cz70Var.L$1 = g;
                            cz70Var.L$2 = d8f0Var;
                            cz70Var.label = 1;
                            if (vy70Var.b(obj, d8f0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            y8r y8rVar2 = g;
                            y8rVar = y8rVar2;
                            closeable = d8f0Var;
                            r0 = y8rVar2;
                        } catch (Throwable th4) {
                            r0 = g;
                            th = th4;
                            closeable = d8f0Var;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th5) {
                                    try {
                                        mnh0.d(th, th5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        g = r0;
                                        if (g != null) {
                                        }
                                        th3 = th;
                                        if (th3 == null) {
                                        }
                                    }
                                }
                            }
                            th2 = th;
                            Closeable closeable2 = r0;
                            if (th2 == null) {
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (g != null) {
                            try {
                                g.close();
                            } catch (Throwable th8) {
                                mnh0.d(th, th8);
                            }
                        }
                        th3 = th;
                        if (th3 == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) cz70Var.L$2;
                    y8rVar = (y8r) cz70Var.L$1;
                    r0 = (Closeable) cz70Var.L$0;
                    try {
                        kotlin.a.a(obj2);
                        r0 = r0;
                    } catch (Throwable th9) {
                        th = th9;
                        if (closeable != null) {
                        }
                        th2 = th;
                        Closeable closeable22 = r0;
                        if (th2 == null) {
                        }
                    }
                }
                y8rVar.flush();
                s3q0 s3q0Var = s3q0.a;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                Closeable closeable222 = r0;
                if (th2 == null) {
                    throw th2;
                }
                s3q0 s3q0Var2 = s3q0.a;
                if (closeable222 != null) {
                    try {
                        closeable222.close();
                    } catch (Throwable th11) {
                        th3 = th11;
                    }
                }
                if (th3 == null) {
                    return s3q0.a;
                }
                throw th3;
            }
        }
        cz70Var = new cz70(this, continuationImpl);
        Object obj22 = cz70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cz70Var.label;
        Throwable th32 = null;
        if (i != 0) {
        }
        y8rVar.flush();
        s3q0 s3q0Var3 = s3q0.a;
        if (closeable != null) {
        }
        th2 = null;
        Closeable closeable2222 = r0;
        if (th2 == null) {
        }
    }
}
