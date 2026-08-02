package xsna;

import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OkioStorage.kt */
/* loaded from: classes.dex */
public class uy70<T> implements l7f0<T> {
    public final tar a;
    public final aq90 b;
    public final vy70<T> c;
    public final p04 d = new p04();

    public uy70(tar tarVar, aq90 aq90Var, vy70<T> vy70Var) {
        this.a = tarVar;
        this.b = aq90Var;
        this.c = vy70Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|(2:19|20)|(1:18)(1:16))(2:32|33))(3:34|35|36))(2:57|(6:61|62|64|65|(1:67)|68)(2:59|60))|(2:44|45)|38|(2:40|41)(1:42)))|86|6|7|(0)(0)|(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[Catch: FileNotFoundException -> 0x008e, TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x008e, blocks: (B:42:0x0095, B:56:0x008a, B:53:0x0085), top: B:7:0x0021, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xsna.uy70] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(uy70 uy70Var, ContinuationImpl continuationImpl) {
        ty70 ty70Var;
        ?? r2;
        Throwable th;
        Closeable closeable;
        nh50 a;
        e8f0 e8f0Var;
        Closeable closeable2;
        Throwable th2;
        if (continuationImpl instanceof ty70) {
            ty70Var = (ty70) continuationImpl;
            int i = ty70Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty70Var.label = i - Integer.MIN_VALUE;
                Object obj = ty70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = ty70Var.label;
                Throwable th3 = null;
                if (r2 != 0) {
                    kotlin.a.a(obj);
                    if (uy70Var.d.a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        e8f0Var = new e8f0(uy70Var.a.h(uy70Var.b));
                    } catch (FileNotFoundException unused) {
                        tar tarVar = uy70Var.a;
                        vy70<T> vy70Var = uy70Var.c;
                        aq90 aq90Var = uy70Var.b;
                        if (!tarVar.d(aq90Var)) {
                            return vy70Var.getDefaultValue();
                        }
                        e8f0 e8f0Var2 = new e8f0(uy70Var.a.h(aq90Var));
                        try {
                            ty70Var.L$0 = e8f0Var2;
                            ty70Var.L$1 = null;
                            ty70Var.label = 2;
                            a = vy70Var.a(e8f0Var2);
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = e8f0Var2;
                            if (closeable != null) {
                            }
                            th3 = th;
                            obj = null;
                            if (th3 != null) {
                            }
                        }
                        if (a != coroutineSingletons) {
                            obj = a;
                            closeable = e8f0Var2;
                            if (closeable != null) {
                            }
                            if (th3 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    try {
                        vy70<T> vy70Var2 = uy70Var.c;
                        ty70Var.L$0 = uy70Var;
                        ty70Var.L$1 = e8f0Var;
                        ty70Var.label = 1;
                        obj = vy70Var2.a(e8f0Var);
                        if (obj != coroutineSingletons) {
                            r2 = uy70Var;
                            closeable2 = e8f0Var;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th5) {
                        th = th5;
                        r2 = uy70Var;
                        closeable2 = e8f0Var;
                        if (closeable2 != null) {
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) ty70Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th6) {
                                    th3 = th6;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th8) {
                                    mnh0.d(th, th8);
                                }
                            }
                            th3 = th;
                            obj = null;
                            if (th3 != null) {
                            }
                        }
                        if (th3 != null) {
                            return obj;
                        }
                        throw th3;
                    }
                    closeable2 = (Closeable) ty70Var.L$1;
                    r2 = (uy70) ty70Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        r2 = r2;
                    } catch (Throwable th9) {
                        th = th9;
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                            } catch (Throwable th10) {
                                mnh0.d(th, th10);
                            }
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                }
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th11) {
                        th2 = th11;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    return obj;
                }
                throw th2;
            }
        }
        ty70Var = new ty70(uy70Var, continuationImpl);
        Object obj2 = ty70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = ty70Var.label;
        Throwable th32 = null;
        if (r2 != 0) {
        }
        if (closeable2 != null) {
        }
        th2 = null;
        if (th2 != null) {
        }
    }

    @Override // xsna.ovf
    public final void close() {
        this.d.a.set(true);
    }

    @Override // xsna.l7f0
    public final Object e(pgl0 pgl0Var) {
        return f(this, pgl0Var);
    }
}
