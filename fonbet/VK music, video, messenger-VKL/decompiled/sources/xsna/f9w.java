package xsna;

import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ImLoggerLogCat.kt */
/* loaded from: classes.dex */
public final class f9w implements d9w {
    public final String a;
    public final AtomicReference<LogLevel> b;

    public f9w(String str, AtomicReference<LogLevel> atomicReference) {
        this.a = str;
        this.b = atomicReference;
    }

    @Override // xsna.d9w
    public final void a(Throwable th) {
        if (d(LogLevel.ERROR)) {
            return;
        }
        L.j(th, this.a);
    }

    @Override // xsna.d9w
    public final void b(Throwable th, gzs<String> gzsVar) {
        if (d(LogLevel.ERROR)) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.w(l, L.LogType.e, th, new Object[]{this.a, gzsVar.invoke()}, null, null, 24);
    }

    @Override // xsna.d9w
    public final void c(gzs<String> gzsVar) {
        if (d(LogLevel.ERROR)) {
            return;
        }
        L.h(this.a, gzsVar);
    }

    public final boolean d(LogLevel logLevel) {
        return this.b.get().ordinal() > logLevel.ordinal();
    }

    @Override // xsna.d9w
    public final void debug(gzs<String> gzsVar) {
        if (d(LogLevel.DEBUG)) {
            return;
        }
        L.c(this.a, gzsVar);
    }

    public final void e(gzs<String> gzsVar) {
        if (d(LogLevel.VERBOSE)) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.v, new Object[]{this.a, gzsVar.invoke()});
    }

    public final void f(gzs<String> gzsVar) {
        if (d(LogLevel.WARNING)) {
            return;
        }
        L.D(this.a, gzsVar);
    }
}
