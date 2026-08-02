package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import androidx.datastore.core.j;
import defpackage.anr0;
import defpackage.cvu0;
import defpackage.f8w;
import defpackage.fi9;
import defpackage.fse;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zmr0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class j implements f8w {
    public static final i j = new i();
    public final fse a;
    public final File b;
    public final fi9 c;
    public final String d;
    public final String e;
    public final String f;
    public final kotlinx.coroutines.sync.a g;
    public final i3y h;
    public final i3y i;

    public j(fse fseVar, File file) {
        this.a = fseVar;
        this.b = file;
        MulticastFileObserver.Companion.getClass();
        this.c = kotlinx.coroutines.flow.e.i(new MulticastFileObserver$Companion$observe$1(file, null));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = gtq0.a();
        final int i = 0;
        this.h = kotlin.a.a(new sls(this) { // from class: om40
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i2 = i;
                j jVar = this.b;
                switch (i2) {
                    case 0:
                        File file2 = new File(jVar.b.getAbsolutePath() + jVar.d);
                        j.f(file2);
                        return file2;
                    default:
                        anr0.a.getClass();
                        File file3 = new File(jVar.b.getAbsolutePath() + jVar.e);
                        j.f(file3);
                        zmr0 zmr0Var = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                NativeSharedCounter nativeSharedCounter = ymr0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            zmr0Var = new zmr0(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            ny61.v("Failed to mmap counter file");
                                        }
                                    } else {
                                        ny61.v("Failed to truncate counter file");
                                    }
                                } else {
                                    ny61.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return zmr0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.i = kotlin.a.a(new sls(this) { // from class: om40
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i22 = i2;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        File file2 = new File(jVar.b.getAbsolutePath() + jVar.d);
                        j.f(file2);
                        return file2;
                    default:
                        anr0.a.getClass();
                        File file3 = new File(jVar.b.getAbsolutePath() + jVar.e);
                        j.f(file3);
                        zmr0 zmr0Var = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                NativeSharedCounter nativeSharedCounter = ymr0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            zmr0Var = new zmr0(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            ny61.v("Failed to mmap counter file");
                                        }
                                    } else {
                                        ny61.v("Failed to truncate counter file");
                                    }
                                } else {
                                    ny61.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return zmr0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                ny61.v(g8e.n(file, "Unable to create parent directories of "));
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.f8w
    public final tpr a() {
        return this.c;
    }

    @Override // defpackage.f8w
    public final Object b(ContinuationImpl continuationImpl) {
        i3y i3yVar = this.i;
        if (i3yVar.isInitialized()) {
            zmr0 zmr0Var = (zmr0) ((anr0) i3yVar.getValue());
            return new Integer(zmr0Var.b.nativeGetCounterValue(zmr0Var.c));
        }
        return tje.k0(this.a, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0077, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b9, blocks: (B:16:0x00b5, B:30:0x00d3, B:31:0x00d6), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #4 {all -> 0x00b9, blocks: (B:16:0x00b5, B:30:0x00d3, B:31:0x00d6), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, tls] */
    @Override // defpackage.f8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tls tlsVar, ContinuationImpl continuationImpl) {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        ?? r10;
        CoroutineSingletons coroutineSingletons;
        int i;
        tls tlsVar2;
        Throwable th;
        Object a;
        Object obj;
        g050 g050Var;
        tls tlsVar3;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        g050 g050Var2;
        Object obj2;
        try {
            try {
                try {
                    if (continuationImpl instanceof MultiProcessCoordinator$lock$1) {
                        multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) continuationImpl;
                        int i2 = multiProcessCoordinator$lock$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            multiProcessCoordinator$lock$1.label = i2 - Integer.MIN_VALUE;
                            r10 = multiProcessCoordinator$lock$1.result;
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = multiProcessCoordinator$lock$1.label;
                            if (i != 0) {
                                kotlin.b.b(r10);
                                multiProcessCoordinator$lock$1.L$0 = tlsVar;
                                kotlinx.coroutines.sync.a aVar = this.g;
                                multiProcessCoordinator$lock$1.L$1 = aVar;
                                multiProcessCoordinator$lock$1.label = 1;
                                Object a2 = aVar.a(multiProcessCoordinator$lock$1);
                                tlsVar2 = tlsVar;
                                r10 = aVar;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fileLock = (FileLock) multiProcessCoordinator$lock$1.L$2;
                                        closeable = (Closeable) multiProcessCoordinator$lock$1.L$1;
                                        g050Var2 = (g050) multiProcessCoordinator$lock$1.L$0;
                                        try {
                                            kotlin.b.b(r10);
                                            obj2 = r10;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                ooc.g(closeable, null);
                                                g050Var2.d(null);
                                                return obj2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r10 = g050Var2;
                                                r10.d(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (Closeable) multiProcessCoordinator$lock$1.L$2;
                                    g050Var = (g050) multiProcessCoordinator$lock$1.L$1;
                                    tlsVar3 = (tls) multiProcessCoordinator$lock$1.L$0;
                                    try {
                                        kotlin.b.b(r10);
                                        obj = r10;
                                        fileLock2 = (FileLock) obj;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileLock = null;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                    try {
                                        multiProcessCoordinator$lock$1.L$0 = g050Var;
                                        multiProcessCoordinator$lock$1.L$1 = closeable;
                                        multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                        multiProcessCoordinator$lock$1.label = 3;
                                        invoke = tlsVar3.invoke(multiProcessCoordinator$lock$1);
                                        if (invoke != coroutineSingletons) {
                                            g050Var2 = g050Var;
                                            fileLock = fileLock2;
                                            obj2 = invoke;
                                            if (fileLock != null) {
                                            }
                                            ooc.g(closeable, null);
                                            g050Var2.d(null);
                                            return obj2;
                                        }
                                        return coroutineSingletons;
                                    } catch (Throwable th5) {
                                        fileLock = fileLock2;
                                        th = th5;
                                        if (fileLock != null) {
                                        }
                                        throw th;
                                    }
                                }
                                g050 g050Var3 = (g050) multiProcessCoordinator$lock$1.L$1;
                                tls tlsVar4 = (tls) multiProcessCoordinator$lock$1.L$0;
                                kotlin.b.b(r10);
                                r10 = g050Var3;
                                tlsVar2 = tlsVar4;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream((File) this.h.getValue());
                            i iVar = j;
                            multiProcessCoordinator$lock$1.L$0 = tlsVar2;
                            multiProcessCoordinator$lock$1.L$1 = r10;
                            multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                            multiProcessCoordinator$lock$1.label = 2;
                            a = i.a(iVar, fileOutputStream, multiProcessCoordinator$lock$1);
                            if (a != coroutineSingletons) {
                                g050 g050Var4 = r10;
                                obj = a;
                                g050Var = g050Var4;
                                tlsVar3 = tlsVar2;
                                closeable = fileOutputStream;
                                fileLock2 = (FileLock) obj;
                                multiProcessCoordinator$lock$1.L$0 = g050Var;
                                multiProcessCoordinator$lock$1.L$1 = closeable;
                                multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                multiProcessCoordinator$lock$1.label = 3;
                                invoke = tlsVar3.invoke(multiProcessCoordinator$lock$1);
                                if (invoke != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    i iVar2 = j;
                    multiProcessCoordinator$lock$1.L$0 = tlsVar2;
                    multiProcessCoordinator$lock$1.L$1 = r10;
                    multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                    multiProcessCoordinator$lock$1.label = 2;
                    a = i.a(iVar2, fileOutputStream, multiProcessCoordinator$lock$1);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r10.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th8) {
            r10 = multiProcessCoordinator$lock$1;
            try {
                throw th8;
            } catch (Throwable th9) {
                ooc.g(tlsVar, th8);
                throw th9;
            }
        }
        multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuationImpl);
        r10 = multiProcessCoordinator$lock$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4 A[Catch: all -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00e8, blocks: (B:15:0x00e4, B:31:0x00ff, B:32:0x0102), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff A[Catch: all -> 0x00e8, TRY_ENTER, TryCatch #6 {all -> 0x00e8, blocks: (B:15:0x00e4, B:31:0x00ff, B:32:0x0102), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r19v0, types: [wls] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // defpackage.f8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(wls wlsVar, ContinuationImpl continuationImpl) {
        ?? r3;
        ?? r4;
        int i;
        ?? r1;
        g050 g050Var;
        FileLock fileLock;
        String message;
        FileLock fileLock2;
        Closeable closeable;
        boolean z;
        try {
            if (continuationImpl instanceof MultiProcessCoordinator$tryLock$1) {
                MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$1 = (MultiProcessCoordinator$tryLock$1) continuationImpl;
                int i2 = multiProcessCoordinator$tryLock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$tryLock$1.label = i2 - Integer.MIN_VALUE;
                    r3 = multiProcessCoordinator$tryLock$1;
                    Object obj = r3.result;
                    r4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = r3.label;
                    if (i == 0) {
                        if (i == 1) {
                            r1 = r3.Z$0;
                            g050Var = (g050) r3.L$0;
                            try {
                                kotlin.b.b(obj);
                                z = r1;
                                if (z) {
                                    g050Var.d(null);
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                if (r1 != 0) {
                                    g050Var.d(null);
                                }
                                throw th;
                            }
                        }
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = r3.Z$0;
                        fileLock = (FileLock) r3.L$2;
                        closeable = (Closeable) r3.L$1;
                        g050 g050Var2 = (g050) r3.L$0;
                        try {
                            kotlin.b.b(obj);
                            r1 = z2;
                            r3 = g050Var2;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            try {
                                ooc.g(closeable, null);
                                if (r1 != 0) {
                                    r3.d(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var = r3;
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    kotlin.b.b(obj);
                    kotlinx.coroutines.sync.a aVar = this.g;
                    boolean h = aVar.h();
                    try {
                        if (h) {
                            FileInputStream fileInputStream = new FileInputStream((File) this.h.getValue());
                            try {
                                try {
                                    fileLock2 = fileInputStream.getChannel().tryLock(0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, true);
                                } catch (IOException e) {
                                    String message2 = e.getMessage();
                                    if ((message2 == null || !cvu0.x(message2, this.f, false)) && ((message = e.getMessage()) == null || !cvu0.x(message, "Resource deadlock would occur", false))) {
                                        throw e;
                                    }
                                    fileLock2 = null;
                                }
                                try {
                                    Boolean valueOf = Boolean.valueOf(fileLock2 != null);
                                    r3.L$0 = aVar;
                                    r3.L$1 = fileInputStream;
                                    r3.L$2 = fileLock2;
                                    r3.Z$0 = h;
                                    r3.label = 2;
                                    obj = wlsVar.invoke(valueOf, r3);
                                    if (obj != r4) {
                                        fileLock = fileLock2;
                                        r3 = aVar;
                                        r1 = h;
                                        closeable = fileInputStream;
                                        if (fileLock != null) {
                                        }
                                        ooc.g(closeable, null);
                                        if (r1 != 0) {
                                        }
                                        return obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileLock = fileLock2;
                                    if (fileLock != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock = null;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        } else {
                            Boolean bool = Boolean.FALSE;
                            r3.L$0 = aVar;
                            r3.Z$0 = h;
                            r3.label = 1;
                            obj = wlsVar.invoke(bool, r3);
                            if (obj != r4) {
                                g050Var = aVar;
                                z = h;
                                if (z) {
                                }
                                return obj;
                            }
                        }
                        return r4;
                    } catch (Throwable th6) {
                        th = th6;
                        g050Var = aVar;
                        r1 = h;
                        if (r1 != 0) {
                        }
                        throw th;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    ooc.g(r4, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                    g050Var = r3;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            }
        }
        r3 = new MultiProcessCoordinator$tryLock$1(this, continuationImpl);
        Object obj2 = r3.result;
        r4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r3.label;
    }

    @Override // defpackage.f8w
    public final Object e(Continuation continuation) {
        i3y i3yVar = this.i;
        if (i3yVar.isInitialized()) {
            zmr0 zmr0Var = (zmr0) ((anr0) i3yVar.getValue());
            return new Integer(zmr0Var.b.nativeIncrementAndGetCounterValue(zmr0Var.c));
        }
        return tje.k0(this.a, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }
}
