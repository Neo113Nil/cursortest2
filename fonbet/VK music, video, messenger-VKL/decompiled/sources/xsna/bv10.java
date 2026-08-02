package xsna;

import com.vk.log.L;

/* compiled from: MediaPipelineLoggerImpl.kt */
/* loaded from: classes3.dex */
public final class bv10 implements f100 {
    public final bpn0 a = new bpn0(new se0(23));

    @Override // xsna.f100
    public final void a(String str, Throwable th) {
        L.j(th, str);
    }

    @Override // xsna.f100
    public final void b(RuntimeException runtimeException, String str) {
        com.vk.metrics.eventtracking.b.a.q(runtimeException);
    }

    @Override // xsna.f100
    public final void c(String str, Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.f100
    public final void d(String str, String str2) {
        if (((Boolean) this.a.getValue()).booleanValue()) {
            L.e(str, str2);
        }
    }

    @Override // xsna.f100
    public final void e(String str, String str2) {
        L.l(str, str2);
    }

    @Override // xsna.f100
    public final void i(String str, String str2) {
        L.p(str, str2);
    }

    @Override // xsna.f100
    public final void v(String str, String str2) {
        if (((Boolean) this.a.getValue()).booleanValue()) {
            L.A(str, str2);
        }
    }

    @Override // xsna.f100
    public final void w(String str, String str2) {
        L.G(str, str2);
    }

    @Override // xsna.f100
    public final void e(String str, String str2, Throwable th) {
        L.j(th, str, str2);
    }
}
