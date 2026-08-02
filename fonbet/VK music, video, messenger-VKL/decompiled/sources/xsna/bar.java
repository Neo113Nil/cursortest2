package xsna;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FileStorage.kt */
/* loaded from: classes12.dex */
public class bar<T> implements l7f0<T> {
    public final File a;
    public final qmi0<T> b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public bar(File file, qmi0<T> qmi0Var) {
        this.a = file;
        this.b = qmi0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0072, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xsna.bar] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(bar barVar, ContinuationImpl continuationImpl) {
        aar aarVar;
        ?? r2;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Closeable closeable2;
        Throwable th2;
        if (continuationImpl instanceof aar) {
            aarVar = (aar) continuationImpl;
            int i = aarVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aarVar.label = i - Integer.MIN_VALUE;
                Object obj = aarVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = aarVar.label;
                if (r2 != 0) {
                    kotlin.a.a(obj);
                    if (barVar.c.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        fileInputStream = new FileInputStream(barVar.a);
                    } catch (FileNotFoundException unused) {
                        File file = barVar.a;
                        qmi0<T> qmi0Var = barVar.b;
                        if (!file.exists()) {
                            return qmi0Var.getDefaultValue();
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(barVar.a);
                        try {
                            aarVar.L$0 = fileInputStream2;
                            aarVar.L$1 = null;
                            aarVar.label = 2;
                            Object readFrom = qmi0Var.readFrom(fileInputStream2, aarVar);
                            if (readFrom != coroutineSingletons) {
                                obj = readFrom;
                                closeable = fileInputStream2;
                                ro.e(closeable, null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = fileInputStream2;
                            throw th;
                        }
                    }
                    try {
                        qmi0<T> qmi0Var2 = barVar.b;
                        aarVar.L$0 = barVar;
                        aarVar.L$1 = fileInputStream;
                        aarVar.label = 1;
                        Object readFrom2 = qmi0Var2.readFrom(fileInputStream, aarVar);
                        if (readFrom2 != coroutineSingletons) {
                            closeable2 = fileInputStream;
                            obj = readFrom2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        r2 = barVar;
                        closeable2 = fileInputStream;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) aarVar.L$0;
                    try {
                        kotlin.a.a(obj);
                        ro.e(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                closeable2 = (Closeable) aarVar.L$1;
                r2 = (bar) aarVar.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                ro.e(closeable2, null);
                return obj;
            }
        }
        aarVar = new aar(barVar, continuationImpl);
        Object obj2 = aarVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = aarVar.label;
        if (r2 != 0) {
        }
        ro.e(closeable2, null);
        return obj2;
    }

    @Override // xsna.ovf
    public final void close() {
        this.c.set(true);
    }

    @Override // xsna.l7f0
    public final Object e(pgl0 pgl0Var) {
        return f(this, pgl0Var);
    }
}
