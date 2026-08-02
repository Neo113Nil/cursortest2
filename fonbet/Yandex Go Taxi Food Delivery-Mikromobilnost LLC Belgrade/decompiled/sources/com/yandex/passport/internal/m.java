package com.yandex.passport.internal;

import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.nd;
import com.yandex.passport.internal.report.sd;
import com.yandex.passport.internal.report.ud;
import com.yandex.passport.internal.report.vd;
import defpackage.evu0;
import java.lang.Thread;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class m implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final Thread.UncaughtExceptionHandler b;
    public final sd c;

    public m(kd kdVar) {
        this.a = 0;
        this.c = kdVar;
        this.b = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[LOOP:0: B:13:0x0037->B:22:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        Package r4;
        String name;
        switch (this.a) {
            case 0:
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        try {
                            r4 = Class.forName(stackTrace[i].getClassName()).getPackage();
                        } catch (Exception unused) {
                        }
                        if (r4 != null && (name = r4.getName()) != null) {
                            z = evu0.y(name, "com.yandex.passport", false);
                            if (z) {
                                i++;
                            } else {
                                try {
                                    kd kdVar = (kd) this.c;
                                    vd vdVar = new vd(th);
                                    Pair b = vdVar.b();
                                    kdVar.b.reportEvent((String) b.getFirst(), (Map<String, Object>) b.getSecond());
                                    kdVar.b.reportRtmError(vdVar.a(kdVar.a, kdVar.c));
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    break;
                }
                break;
            default:
                com.yandex.passport.legacy.a.e(3, "uncaughtException: thread=" + thread, th);
                try {
                    ((nd) this.c).d(new ud(th));
                } catch (Throwable th2) {
                    com.yandex.passport.legacy.a.c("uncaughtException: exception caught while sending exception to metrica", th2);
                }
                this.b.uncaughtException(thread, th);
                break;
        }
    }

    public m(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, nd ndVar) {
        this.a = 1;
        this.b = uncaughtExceptionHandler;
        this.c = ndVar;
    }
}
