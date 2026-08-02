package xsna;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http.RealInterceptorChain;

/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes11.dex */
public final class f3j implements Interceptor {
    public static final f3j a = new f3j();

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        f8f0 f8f0Var = realInterceptorChain.a;
        synchronized (f8f0Var) {
            if (!f8f0Var.p) {
                throw new IllegalStateException("released");
            }
            if (f8f0Var.o) {
                throw new IllegalStateException("Check failed.");
            }
            if (f8f0Var.n) {
                throw new IllegalStateException("Check failed.");
            }
            s3q0 s3q0Var = s3q0.a;
        }
        x1q x1qVar = f8f0Var.j;
        okhttp3.o oVar = f8f0Var.b;
        x1qVar.getClass();
        try {
            u1q u1qVar = new u1q(f8f0Var, f8f0Var.f, x1qVar, x1qVar.a(realInterceptorChain.f, realInterceptorChain.g, realInterceptorChain.h, oVar.A, oVar.g, !epx.f(realInterceptorChain.e.b, "GET")).m(oVar, realInterceptorChain));
            f8f0Var.m = u1qVar;
            f8f0Var.r = u1qVar;
            synchronized (f8f0Var) {
                f8f0Var.n = true;
                f8f0Var.o = true;
            }
            if (f8f0Var.q) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.g(realInterceptorChain, 0, u1qVar, null, 0, 0, 61).a(realInterceptorChain.e);
        } catch (IOException e) {
            x1qVar.b(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            x1qVar.b(e2.g());
            throw e2;
        }
    }
}
