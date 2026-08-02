package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.Event;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import kotlin.Pair;
import okhttp3.Interceptor;

/* compiled from: SocketTimeoutInterceptor.kt */
/* loaded from: classes.dex */
public final class kek0 implements Interceptor, uz80 {
    public final h4j a;
    public volatile int b;

    public kek0(h4j h4jVar) {
        this.a = h4jVar;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "SocketTimeout";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        String str;
        Socket socket;
        try {
            okhttp3.u a = aVar.a(aVar.request());
            this.b = 0;
            m63.j(m63.c(), new Pair("socket.timeout.consecutive", 0));
            return a;
        } catch (SocketTimeoutException e) {
            this.b++;
            m63.j(m63.c(), new Pair("socket.timeout.consecutive", Integer.valueOf(this.b)));
            okhttp3.l lVar = aVar.request().a;
            String str2 = lVar != null ? lVar.i : null;
            if (str2 != null) {
                int length = str2.length();
                if (length > 50) {
                    length = 50;
                }
                str = str2.substring(0, length);
            } else {
                str = "null";
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a b = h5s.b("PERF.ERROR.SOCKET_TIMEOUT");
            b.b("count", Integer.valueOf(this.b));
            b.c("url", str.concat("..."));
            bVar.k(b.e());
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{go9.b("SocketTimeoutException for ", str2)});
            }
            if (this.b >= 3) {
                l8f0 l8f0Var = this.a.a;
                Iterator<g8f0> it = l8f0Var.d.iterator();
                while (it.hasNext()) {
                    g8f0 next = it.next();
                    synchronized (next) {
                        if (next.p.isEmpty()) {
                            it.remove();
                            next.j = true;
                            socket = next.d;
                        } else {
                            socket = null;
                        }
                        if (socket != null) {
                            x2r0.d(socket);
                        }
                    }
                }
                if (l8f0Var.d.isEmpty()) {
                    l8f0Var.b.a();
                }
            }
            throw e;
        }
    }
}
