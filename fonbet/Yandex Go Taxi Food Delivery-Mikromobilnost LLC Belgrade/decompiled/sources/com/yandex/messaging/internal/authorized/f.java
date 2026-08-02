package com.yandex.messaging.internal.authorized;

import android.content.Context;
import android.media.MediaScannerConnection;
import defpackage.bhb1;
import defpackage.doc;
import defpackage.g6u;
import defpackage.ike;
import defpackage.jln;
import defpackage.jse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.oyq;
import defpackage.tje;
import defpackage.to3;
import defpackage.vse;
import defpackage.ydz;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class f {
    public final Context a;
    public final to3 b;
    public final oyq c;
    public final kse d;
    public final doc e;
    public final jln f;
    public final ConcurrentHashMap g = new ConcurrentHashMap(64);
    public final g6u h;
    public final jse i;
    public final ike j;

    public f(Context context, to3 to3Var, Executor executor, oyq oyqVar, kse kseVar, vse vseVar, doc docVar, jln jlnVar) {
        this.a = context;
        this.b = to3Var;
        this.c = oyqVar;
        this.d = kseVar;
        this.e = docVar;
        this.f = jlnVar;
        this.h = kseVar.e;
        this.i = ooc.o(executor);
        this.j = vseVar.c(false);
    }

    public static final Object a(f fVar, String str, String str2, boolean z, SuspendLambda suspendLambda) {
        Object k0 = tje.k0(fVar.i, new FilesDownloaderWrapper$doSaveFromCacheToDownloads$2(fVar, str, str2, z, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public static final void b(f fVar, InputStream inputStream, File file) {
        String str;
        File file2;
        Context context = fVar.a;
        if (file.exists()) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            int i = 1;
            if (lastIndexOf <= 0 || lastIndexOf >= name.length() - 1) {
                str = null;
            } else {
                str = name.substring(lastIndexOf + 1, name.length());
                name = name.substring(0, lastIndexOf);
            }
            while (i < 1000) {
                if (str != null) {
                    file2 = new File(parentFile, name + Extension.O_BRAKE_SPACE + i + ")." + str);
                } else {
                    file2 = new File(parentFile, name + Extension.O_BRAKE_SPACE + i + ')');
                }
                i++;
                if (!file2.exists()) {
                    file = file2;
                }
            }
            ny61.v("Already has 1000 files with that name");
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bhb1.c(inputStream, fileOutputStream);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, null, null);
            fVar.f(context.getString(oyh0.save_file_toast, file.getName()));
        } finally {
        }
    }

    public static void g(f fVar, String str, String str2) {
        tje.N(fVar.j, null, null, new FilesDownloaderWrapper$startDownloadingAndSaving$1(fVar, str, str2, EmptyList.a, null, false, false), 3);
    }

    public final void c(String str) {
        if (ydz.a.a()) {
            ydz.d();
        }
        d dVar = (d) this.g.remove(str);
        if (dVar != null) {
            dVar.c.a(null);
        }
    }

    public final Object d(String str, String str2, boolean z, List list, boolean z2, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.d.a, new FilesDownloaderWrapper$downloadAndSave$2(this, str, str2, list, null, z2, z), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void e(String str, String str2, boolean z) {
        tje.N(this.j, null, null, new FilesDownloaderWrapper$saveFromCacheToDownloads$1(this, str, str2, z, null), 3);
    }

    public final void f(String str) {
        tje.N(this.j, null, null, new FilesDownloaderWrapper$showMessage$1(this, str, null), 3);
    }
}
