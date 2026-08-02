package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import okhttp3.Interceptor;
import xsna.iae0;

/* compiled from: ConnectTimeoutInterceptor.kt */
/* loaded from: classes.dex */
public final class h3j implements Interceptor, uz80, iae0.a {
    public final HandlerThread a = new HandlerThread("vk-okhttp-cancel-by-timeout-thread", 1);
    public final upj b = new upj();
    public final bpn0 c = new bpn0(new g3j(this, 0));

    @Override // xsna.iae0.a
    public final void a(okhttp3.d dVar) {
        okhttp3.l lVar = dVar.request().a;
        ((Handler) this.c.getValue()).removeCallbacksAndMessages(dVar);
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "NetworkRequest";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.d call = aVar.call();
        Handler handler = (Handler) this.c.getValue();
        vk9 vk9Var = new vk9(this, aVar, call);
        this.b.getClass();
        handler.postAtTime(vk9Var, call, SystemClock.uptimeMillis() + aVar.f() + 500);
        okhttp3.l lVar = call.request().a;
        return aVar.a(aVar.request());
    }
}
