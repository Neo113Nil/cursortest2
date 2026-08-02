package androidx.datastore.core;

import defpackage.btq0;
import defpackage.f1r;
import defpackage.f8w;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.j5c;
import defpackage.ljo;
import defpackage.ny61;
import defpackage.sbc;
import defpackage.wls;
import defpackage.z2r;
import defpackage.zls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g implements j5c {
    public final File a;
    public final btq0 b;
    public final f8w c;
    public final sbc d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public g(File file, btq0 btq0Var, f8w f8wVar, sbc sbcVar) {
        this.a = file;
        this.b = btq0Var;
        this.c = f8wVar;
        this.d = sbcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:52|53))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0076, blocks: (B:22:0x0075, B:28:0x0088, B:31:0x0085, B:27:0x0080), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.g] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zls zlsVar, ContinuationImpl continuationImpl) {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        boolean z;
        Throwable th;
        j5c j5cVar;
        boolean z2;
        try {
            if (continuationImpl instanceof FileStorageConnection$readScope$1) {
                fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) continuationImpl;
                int i2 = fileStorageConnection$readScope$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fileStorageConnection$readScope$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fileStorageConnection$readScope$1.label;
                    aVar = this.f;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (this.e.get()) {
                            ny61.r("StorageConnection has already been disposed.");
                            return null;
                        }
                        z = aVar.h();
                        try {
                            f1r f1rVar = new f1r(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(z);
                                fileStorageConnection$readScope$1.L$0 = f1rVar;
                                fileStorageConnection$readScope$1.Z$0 = z;
                                fileStorageConnection$readScope$1.label = 1;
                                Object invoke = ((StorageConnectionKt$readData$2) zlsVar).invoke(f1rVar, valueOf, fileStorageConnection$readScope$1);
                                if (invoke == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = invoke;
                                z2 = z;
                                j5cVar = f1rVar;
                            } catch (Throwable th2) {
                                th = th2;
                                this = z;
                                j5cVar = f1rVar;
                                j5cVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = fileStorageConnection$readScope$1.Z$0;
                        j5cVar = (j5c) fileStorageConnection$readScope$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            z2 = this;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                j5cVar.close();
                            } catch (Throwable th5) {
                                ljo.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    j5cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        aVar.d(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            j5cVar.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            z = this;
            if (z) {
                aVar.d(null);
            }
            throw th;
        }
        fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuationImpl);
        Object obj2 = fileStorageConnection$readScope$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileStorageConnection$readScope$1.label;
        aVar = this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(5:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(2:23|24)|20|21)(1:28))(2:39|40))(1:41))(2:59|(3:61|(2:63|(2:65|66))|67)(2:69|70))|42|43|44|46|47|(5:50|14|15|16|(0)(0))|49))|46|47|(0)|49)|43|44)|7|(0)(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
    
        if (r12.a(r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[Catch: all -> 0x0100, IOException -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:18:0x00c6, B:24:0x00cc, B:26:0x00e1, B:27:0x00ff, B:28:0x010c, B:35:0x011a, B:38:0x0117), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[Catch: all -> 0x0100, IOException -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:18:0x00c6, B:24:0x00cc, B:26:0x00e1, B:27:0x00ff, B:28:0x010c, B:35:0x011a, B:38:0x0117), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wls wlsVar, ContinuationImpl continuationImpl) {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        ?? r12;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? r3;
        kotlinx.coroutines.sync.a aVar;
        wls wlsVar2;
        z2r z2rVar;
        Throwable th;
        j5c j5cVar;
        g050 g050Var;
        File file;
        try {
            try {
                try {
                    try {
                        if (continuationImpl instanceof FileStorageConnection$writeScope$1) {
                            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuationImpl;
                            int i2 = fileStorageConnection$writeScope$1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                fileStorageConnection$writeScope$1.label = i2 - Integer.MIN_VALUE;
                                r12 = fileStorageConnection$writeScope$1.result;
                                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = fileStorageConnection$writeScope$1.label;
                                File file2 = this.a;
                                if (i != 0) {
                                    kotlin.b.b(r12);
                                    if (this.e.get()) {
                                        ny61.r("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            ny61.v(g8e.n(file2, "Unable to create parent directories of "));
                                            return null;
                                        }
                                    }
                                    fileStorageConnection$writeScope$1.L$0 = wlsVar;
                                    aVar = this.f;
                                    fileStorageConnection$writeScope$1.L$1 = aVar;
                                    fileStorageConnection$writeScope$1.label = 1;
                                    wlsVar2 = wlsVar;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        j5cVar = (j5c) fileStorageConnection$writeScope$1.L$2;
                                        file = (File) fileStorageConnection$writeScope$1.L$1;
                                        g050Var = (g050) fileStorageConnection$writeScope$1.L$0;
                                        try {
                                            kotlin.b.b(r12);
                                            try {
                                                j5cVar.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file.exists()) {
                                                try {
                                                    Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                } catch (IOException unused) {
                                                    throw new IOException("Unable to rename " + file + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            g050Var.d(null);
                                            return zy11.a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                j5cVar.close();
                                            } catch (Throwable th4) {
                                                ljo.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ?? r11 = (g050) fileStorageConnection$writeScope$1.L$1;
                                    wls wlsVar3 = (wls) fileStorageConnection$writeScope$1.L$0;
                                    kotlin.b.b(r12);
                                    aVar = r11;
                                    wlsVar2 = wlsVar3;
                                }
                                r3 = new File(file2.getAbsolutePath() + ".tmp");
                                z2rVar = new z2r(r3, this.b);
                                fileStorageConnection$writeScope$1.L$0 = aVar;
                                fileStorageConnection$writeScope$1.L$1 = r3;
                                fileStorageConnection$writeScope$1.L$2 = z2rVar;
                                fileStorageConnection$writeScope$1.label = 2;
                                if (wlsVar2.invoke(z2rVar, fileStorageConnection$writeScope$1) != coroutineSingletons) {
                                    g050Var = aVar;
                                    file = r3;
                                    j5cVar = z2rVar;
                                    j5cVar.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        fileStorageConnection$writeScope$1.L$0 = aVar;
                        fileStorageConnection$writeScope$1.L$1 = r3;
                        fileStorageConnection$writeScope$1.L$2 = z2rVar;
                        fileStorageConnection$writeScope$1.label = 2;
                        if (wlsVar2.invoke(z2rVar, fileStorageConnection$writeScope$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    } catch (Throwable th5) {
                        th = th5;
                        j5cVar = z2rVar;
                        j5cVar.close();
                        throw th;
                    }
                    z2rVar = new z2r(r3, this.b);
                } catch (IOException e) {
                    e = e;
                    if (r3.exists()) {
                        r3.delete();
                    }
                    throw e;
                }
                if (i != 0) {
                }
                r3 = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r12 = fileStorageConnection$writeScope$1;
                r12.d(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r12.d(null);
            throw th;
        }
        fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuationImpl);
        r12 = fileStorageConnection$writeScope$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileStorageConnection$writeScope$1.label;
        File file22 = this.a;
    }

    @Override // defpackage.j5c
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
