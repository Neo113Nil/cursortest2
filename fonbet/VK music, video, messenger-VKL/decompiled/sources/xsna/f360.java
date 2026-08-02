package xsna;

import android.os.SystemClock;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: NetworkEventListener.kt */
/* loaded from: classes.dex */
public abstract class f360 {

    /* compiled from: NetworkEventListener.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Timing(systemClockElapsedRealtime=");
            sb.append(this.a);
            sb.append(", systemCurrentTimeMillis=");
            return vu5.a(')', this.b, sb);
        }

        public a(int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            this.a = elapsedRealtime;
            this.b = currentTimeMillis;
        }
    }

    public void d(f8f0 f8f0Var, a aVar) {
    }

    public void e(f8f0 f8f0Var, IOException iOException) {
    }

    public void f(f8f0 f8f0Var, a aVar) {
    }

    public void g(okhttp3.d dVar, a aVar) {
    }

    public void j(okhttp3.d dVar, a aVar) {
    }

    public void k(okhttp3.d dVar, a aVar) {
    }

    public void m(okhttp3.d dVar, a aVar) {
    }

    public void o(okhttp3.d dVar, okhttp3.u uVar) {
    }

    public void p(okhttp3.d dVar, a aVar) {
    }

    public void q(okhttp3.d dVar, a aVar) {
    }

    public void r(okhttp3.d dVar, a aVar) {
    }

    public void h(okhttp3.d dVar, Proxy proxy, a aVar) {
    }

    public void i(okhttp3.d dVar, u3j u3jVar, a aVar) {
    }

    public void l(okhttp3.d dVar, long j, a aVar) {
    }

    public void n(okhttp3.d dVar, long j, a aVar) {
    }
}
