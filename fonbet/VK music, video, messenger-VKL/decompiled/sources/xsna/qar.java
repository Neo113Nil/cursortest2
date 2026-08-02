package xsna;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.nar;

/* compiled from: FileStorage.kt */
/* loaded from: classes12.dex */
public final class qar<T> implements ogl0<T> {
    public final File a;
    public final qmi0<T> b;
    public final uax c;
    public final nar.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final wi50 f = bay.a();

    public qar(File file, qmi0 qmi0Var, uax uaxVar, nar.a aVar) {
        this.a = file;
        this.b = qmi0Var;
        this.c = uaxVar;
        this.d = aVar;
    }

    @Override // xsna.ogl0
    public final uax a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TryCatch #3 {all -> 0x0119, blocks: (B:19:0x00dd, B:21:0x00e3, B:23:0x00e5, B:25:0x00f8, B:26:0x0118, B:28:0x011e, B:31:0x0126, B:59:0x0135, B:61:0x013b, B:62:0x013e, B:38:0x0133, B:41:0x0130, B:46:0x009c, B:48:0x00b8), top: B:45:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0119, blocks: (B:19:0x00dd, B:21:0x00e3, B:23:0x00e5, B:25:0x00f8, B:26:0x0118, B:28:0x011e, B:31:0x0126, B:59:0x0135, B:61:0x013b, B:62:0x013e, B:38:0x0133, B:41:0x0130, B:46:0x009c, B:48:0x00b8), top: B:45:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v9, types: [xsna.wzs] */
    @Override // xsna.ogl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ovk ovkVar, ContinuationImpl continuationImpl) {
        par parVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? r13;
        qar<T> qarVar;
        ui50 ui50Var;
        jbr jbrVar;
        Throwable th;
        ovf ovfVar;
        File file;
        qar<T> qarVar2;
        try {
            try {
                try {
                    try {
                        if (continuationImpl instanceof par) {
                            parVar = (par) continuationImpl;
                            int i2 = parVar.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                parVar.label = i2 - Integer.MIN_VALUE;
                                Object obj = parVar.result;
                                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = parVar.label;
                                if (i != 0) {
                                    kotlin.a.a(obj);
                                    if (this.e.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File file2 = this.a;
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException(z9r.a(file2, "Unable to create parent directories of "));
                                        }
                                    }
                                    parVar.L$0 = this;
                                    parVar.L$1 = ovkVar;
                                    wi50 wi50Var = this.f;
                                    parVar.L$2 = wi50Var;
                                    parVar.label = 1;
                                    if (wi50Var.b(parVar) != coroutineSingletons) {
                                        qarVar = this;
                                        ui50Var = wi50Var;
                                    }
                                    return coroutineSingletons;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ovfVar = (ovf) parVar.L$3;
                                    file = (File) parVar.L$2;
                                    ui50Var = (ui50) parVar.L$1;
                                    qarVar2 = (qar) parVar.L$0;
                                    try {
                                        kotlin.a.a(obj);
                                        s3q0 s3q0Var = s3q0.a;
                                        try {
                                            ovfVar.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file.exists()) {
                                            try {
                                                Files.move(file.toPath(), qarVar2.a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                            } catch (IOException unused) {
                                                throw new IOException("Unable to rename " + file + " to " + qarVar2.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        s3q0 s3q0Var2 = s3q0.a;
                                        ui50Var.c(null);
                                        return s3q0.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            ovfVar.close();
                                        } catch (Throwable th4) {
                                            mnh0.d(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                ui50 ui50Var2 = (ui50) parVar.L$2;
                                ?? r3 = (wzs) parVar.L$1;
                                qarVar = (qar) parVar.L$0;
                                kotlin.a.a(obj);
                                ui50Var = ui50Var2;
                                ovkVar = r3;
                                r13 = new File(qarVar.a.getAbsolutePath() + ".tmp");
                                jbrVar = new jbr(r13, qarVar.b);
                                parVar.L$0 = qarVar;
                                parVar.L$1 = ui50Var;
                                parVar.L$2 = r13;
                                parVar.L$3 = jbrVar;
                                parVar.label = 2;
                                if (ovkVar.invoke(jbrVar, parVar) != coroutineSingletons) {
                                    file = r13;
                                    qarVar2 = qarVar;
                                    ovfVar = jbrVar;
                                    s3q0 s3q0Var3 = s3q0.a;
                                    ovfVar.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        parVar.L$0 = qarVar;
                        parVar.L$1 = ui50Var;
                        parVar.L$2 = r13;
                        parVar.L$3 = jbrVar;
                        parVar.label = 2;
                        if (ovkVar.invoke(jbrVar, parVar) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    } catch (Throwable th5) {
                        th = th5;
                        ovfVar = jbrVar;
                        ovfVar.close();
                        throw th;
                    }
                    jbrVar = new jbr(r13, qarVar.b);
                } catch (IOException e) {
                    e = e;
                    if (r13.exists()) {
                        r13.delete();
                    }
                    throw e;
                }
                r13 = new File(qarVar.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ui50Var.c(null);
                throw th6;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            r13 = coroutineSingletons;
        }
        parVar = new par(this, continuationImpl);
        Object obj2 = parVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = parVar.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|7|(0)(0)|14|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x007f, blocks: (B:22:0x007e, B:28:0x008f, B:31:0x008c, B:27:0x0087), top: B:7:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [xsna.qar] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.oar] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.qar] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.pgl0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // xsna.ogl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pgl0 pgl0Var, ContinuationImpl continuationImpl) {
        ?? r0;
        int i;
        Throwable th;
        ovf ovfVar;
        boolean z;
        qar<T> qarVar;
        try {
            if (continuationImpl instanceof oar) {
                oar oarVar = (oar) continuationImpl;
                int i2 = oarVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oarVar.label = i2 - Integer.MIN_VALUE;
                    r0 = oarVar;
                    Object obj = r0.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = r0.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (this.e.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean f = this.f.f();
                        try {
                            bar barVar = new bar(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(f);
                                r0.L$0 = this;
                                r0.L$1 = barVar;
                                r0.Z$0 = f;
                                r0.label = 1;
                                Object invoke = pgl0Var.invoke(barVar, valueOf, r0);
                                if (invoke == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = invoke;
                                z = f;
                                qarVar = this;
                                ovfVar = barVar;
                            } catch (Throwable th2) {
                                th = th2;
                                pgl0Var = f;
                                r0 = this;
                                ovfVar = barVar;
                                ovfVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            pgl0Var = f;
                            r0 = this;
                            if (pgl0Var != 0) {
                                r0.f.c(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pgl0Var = r0.Z$0;
                        ovfVar = (ovf) r0.L$1;
                        r0 = (qar) r0.L$0;
                        try {
                            kotlin.a.a(obj);
                            qarVar = r0;
                            z = pgl0Var;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                ovfVar.close();
                            } catch (Throwable th5) {
                                mnh0.d(th, th5);
                            }
                            throw th;
                        }
                    }
                    ovfVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        qarVar.f.c(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            ovfVar.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (pgl0Var != 0) {
            }
            throw th;
        }
        r0 = new oar(this, continuationImpl);
        Object obj2 = r0.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r0.label;
    }

    @Override // xsna.ovf
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
