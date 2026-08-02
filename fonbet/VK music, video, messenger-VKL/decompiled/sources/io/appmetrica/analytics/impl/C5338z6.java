package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.z6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5338z6 {
    public final C5010ma a;
    public final C5135r6 b;
    public final Context c;
    public final C4984la d;

    public C5338z6(Context context) {
        this(context, new C5010ma(), new C5135r6(), C4984la.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Fh fh) {
        boolean mkdir;
        String str;
        J9 b;
        PrintWriter printWriter;
        C4984la c4984la;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.c);
        this.b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                Lf lf = fh.e.a;
                str = lf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + lf.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b = this.d.b(str);
                b.a.lock();
                b.b.a();
                this.a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C5243vb(fh.a, fh.e, fh.d).k());
                vo.a((Closeable) printWriter);
                b.c();
                c4984la = this.d;
                synchronized (c4984la) {
                    c4984la.b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C5243vb(fh.a, fh.e, fh.d).k());
            vo.a((Closeable) printWriter);
            b.c();
            c4984la = this.d;
            synchronized (c4984la) {
            }
        } catch (Throwable unused) {
            vo.a((Closeable) printWriter);
            b.c();
            this.d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Lf lf2 = fh.e.a;
        str = lf2.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + lf2.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b = this.d.b(str);
        b.a.lock();
        b.b.a();
        this.a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C5338z6(Context context, C5010ma c5010ma, C5135r6 c5135r6, C4984la c4984la) {
        this.c = context;
        this.a = c5010ma;
        this.b = c5135r6;
        this.d = c4984la;
    }
}
