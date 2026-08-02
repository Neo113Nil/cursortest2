package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.internal.net.a;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* loaded from: classes15.dex */
public final class awu implements o8j0, w1k0, al7, Runnable {
    public static final Object H = new Object();
    public final w920 A;
    public final t1k0 B;
    public boolean C;
    public boolean D;
    public int E;
    public yf7 F;
    public y1k0 G;
    public final Handler a = new Handler();
    public final xf7 b;
    public final a c;
    public final c370 w;
    public final x22 x;
    public final String y;
    public final String z;

    public awu(xf7 xf7Var, a aVar, c370 c370Var, x22 x22Var, String str, String str2, w920 w920Var, t1k0 t1k0Var) {
        this.B = t1k0Var;
        this.c = aVar;
        this.b = xf7Var;
        this.w = c370Var;
        this.x = x22Var;
        this.y = str;
        this.z = str2;
        this.A = w920Var;
        c();
    }

    @Override // defpackage.w1k0
    public final void a() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.E = 0;
        handler.removeCallbacksAndMessages(H);
        c();
    }

    public final void b(yf7 yf7Var, ngz ngzVar) {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        if (this.F != yf7Var) {
            return;
        }
        this.F = null;
        if (this.D) {
            return;
        }
        w920 w920Var = this.A;
        if (ngzVar != null && !w920Var.m(ngzVar.b)) {
            w920Var.e(ngzVar);
            d();
            return;
        }
        if (this.C) {
            return;
        }
        if (this.G == null && w920Var.c()) {
            this.G = this.c.d(this);
        }
        this.E++;
        if (this.E < w920Var.j()) {
            handler.postAtTime(this, H, this.B.a(this.E) + SystemClock.uptimeMillis());
        } else if (ngzVar == null) {
            w920Var.h();
        } else {
            w920Var.e(ngzVar);
            d();
        }
    }

    public final void c() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        z83.c(null, this.D);
        z83.c(null, this.C);
        if (this.F != null) {
            return;
        }
        w920 w920Var = this.A;
        t4j0 i = w920Var.i();
        i.a("X-Application-Id", this.y);
        if (w920Var.n()) {
            i.a("X-Request-Id", this.z);
        }
        i.a("X-Request-Attempt", Integer.toString(this.E));
        yf7 newCall = this.b.newCall(new d5j0(i));
        this.F = newCall;
        newCall.I(this);
    }

    @Override // defpackage.x08
    public final void cancel() {
        d();
        this.D = true;
        yf7 yf7Var = this.F;
        if (yf7Var != null) {
            yf7Var.cancel();
            this.F = null;
        }
    }

    public final void d() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.C = true;
        handler.removeCallbacksAndMessages(H);
        y1k0 y1k0Var = this.G;
        if (y1k0Var != null) {
            y1k0Var.close();
            this.G = null;
        }
    }

    @Override // defpackage.al7
    public final void onFailure(yf7 yf7Var, IOException iOException) {
        if ("Canceled".equals(iOException.getMessage())) {
            return;
        }
        ydz.c("OkHttp", "HttpRequest failed", iOException);
        if (this.A.k()) {
            boolean z = iOException instanceof UnknownHostException;
            c370 c370Var = this.w;
            String str = this.z;
            if (z) {
                c370Var.c(4, str, "DNS_FAILED");
            } else if (iOException instanceof SocketTimeoutException) {
                c370Var.c(6, str, "TIMEOUT");
            } else if (iOException instanceof NoRouteToHostException) {
                c370Var.c(3, str, "NO_ROUTE");
            } else if (iOException instanceof SSLException) {
                c370Var.c(5, str, "SSL_ERROR");
            } else {
                c370Var.c(3, str, "OTHER");
                this.x.reportError("http call failed", iOException);
            }
        }
        this.a.post(new zvu(this, yf7Var, 1));
    }

    @Override // defpackage.al7
    public final void onResponse(final yf7 yf7Var, kvj0 kvj0Var) {
        w920 w920Var = this.A;
        final gg70 d = w920Var.d(kvj0Var);
        qpo qpoVar = new qpo(28, this, kvj0Var);
        Handler handler = this.a;
        handler.post(qpoVar);
        d.getClass();
        final int i = 0;
        if (d instanceof dg70) {
            handler.post(new Runnable(this) { // from class: yvu
                public final /* synthetic */ awu b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    gg70 gg70Var = d;
                    yf7 yf7Var2 = yf7Var;
                    awu awuVar = this.b;
                    switch (i2) {
                        case 0:
                            Object d2 = gg70Var.d();
                            String str = awuVar.z;
                            w920 w920Var2 = awuVar.A;
                            z83.g(null, awuVar.a.getLooper(), Looper.myLooper());
                            if (awuVar.F == yf7Var2) {
                                awuVar.F = null;
                                y1k0 y1k0Var = awuVar.G;
                                if (y1k0Var != null) {
                                    y1k0Var.close();
                                    awuVar.G = null;
                                }
                                if (!awuVar.D) {
                                    try {
                                        w920Var2.g(d2);
                                        break;
                                    } catch (Throwable th) {
                                        if (w920Var2.k()) {
                                            awuVar.w.c(3, str, "OTHER");
                                        }
                                        awuVar.x.reportError("process api call response failed", new Exception(str, th));
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            awuVar.b(yf7Var2, gg70Var.c());
                            break;
                    }
                }
            });
            return;
        }
        if (!d.e()) {
            handler.post(new zvu(this, yf7Var, 0));
            return;
        }
        if (w920Var.k()) {
            this.w.c(3, this.z, d.c().c);
        }
        final int i2 = 1;
        handler.post(new Runnable(this) { // from class: yvu
            public final /* synthetic */ awu b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                gg70 gg70Var = d;
                yf7 yf7Var2 = yf7Var;
                awu awuVar = this.b;
                switch (i22) {
                    case 0:
                        Object d2 = gg70Var.d();
                        String str = awuVar.z;
                        w920 w920Var2 = awuVar.A;
                        z83.g(null, awuVar.a.getLooper(), Looper.myLooper());
                        if (awuVar.F == yf7Var2) {
                            awuVar.F = null;
                            y1k0 y1k0Var = awuVar.G;
                            if (y1k0Var != null) {
                                y1k0Var.close();
                                awuVar.G = null;
                            }
                            if (!awuVar.D) {
                                try {
                                    w920Var2.g(d2);
                                    break;
                                } catch (Throwable th) {
                                    if (w920Var2.k()) {
                                        awuVar.w.c(3, str, "OTHER");
                                    }
                                    awuVar.x.reportError("process api call response failed", new Exception(str, th));
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        awuVar.b(yf7Var2, gg70Var.c());
                        break;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        c();
    }
}
