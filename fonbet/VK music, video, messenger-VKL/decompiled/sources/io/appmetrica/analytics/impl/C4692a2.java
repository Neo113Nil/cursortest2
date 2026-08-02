package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4692a2 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final Ra a;
    public final D6 b = C5030n4.l().n();
    public final A6 c = new A6();
    public final Nn d = new Nn();

    public C4692a2(C5263w6 c5263w6) {
        this.a = c5263w6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            e.set(true);
            Ra ra = this.a;
            Gn apply = this.c.apply(thread);
            Nn nn = this.d;
            Thread a = nn.a.a();
            ArrayList a2 = nn.a(a, thread);
            if (thread != a) {
                try {
                    stackTraceElementArr = nn.a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a2.add(0, (Gn) nn.b.apply(a, stackTraceElementArr));
            }
            ra.a(th, new V(apply, a2, this.b.a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
