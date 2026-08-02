package xsna;

import android.util.Log;

/* compiled from: MediaPipelineLoggerDefault.kt */
/* loaded from: classes3.dex */
public final class av10 implements f100 {
    @Override // xsna.f100
    public final void a(String str, Throwable th) {
        Log.e(str, "", th);
    }

    @Override // xsna.f100
    public final void b(RuntimeException runtimeException, String str) {
        a(str, runtimeException);
    }

    @Override // xsna.f100
    public final void c(String str, Throwable th) {
        a(str, th);
    }

    @Override // xsna.f100
    public final void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // xsna.f100
    public final void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // xsna.f100
    public final void d(String str, String str2) {
    }

    @Override // xsna.f100
    public final void i(String str, String str2) {
    }

    @Override // xsna.f100
    public final void v(String str, String str2) {
    }

    @Override // xsna.f100
    public final void w(String str, String str2) {
    }
}
