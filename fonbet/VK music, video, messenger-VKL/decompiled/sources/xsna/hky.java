package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: KnetRequestLogger.kt */
/* loaded from: classes.dex */
public final class hky implements rjv {
    public final bpn0 a = new bpn0(new s3a(3));

    @Override // xsna.rjv
    public final void a(Object... objArr) {
        d(L.LogType.i, objArr);
    }

    @Override // xsna.rjv
    public final void b(Object... objArr) {
        d(L.LogType.e, objArr);
    }

    @Override // xsna.rjv
    public final void c(Object... objArr) {
        d(L.LogType.d, objArr);
    }

    public final void d(L.LogType logType, Object[] objArr) {
        L l = L.a;
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        l.getClass();
        if (L.m(loggerOutputTarget)) {
            return;
        }
        L.r(logType, "KnetRequestLogger", ((p2i0) this.a.getValue()).a(rl3.Z(objArr, " | ", null, null, null, 62)));
    }
}
