package defpackage;

import com.yandex.go.network_metrics.Status;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import okhttp3.Protocol;

/* loaded from: classes8.dex */
public final class nxf0 extends bgo {
    public final w2j0 m;

    public nxf0(w2j0 w2j0Var) {
        this.m = w2j0Var;
    }

    @Override // defpackage.bgo
    public final void callFailed(yf7 yf7Var, IOException iOException) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        if (yf7Var.n()) {
            w2j0Var.a(yf7Var, Status.Cancelled, new qda0(25));
        } else {
            w2j0Var.a(yf7Var, Status.Failure, new t2j0(w2j0Var, iOException, 0));
        }
    }

    @Override // defpackage.bgo
    public final void callStart(yf7 yf7Var) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.Enqueue, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void canceled(yf7 yf7Var) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.Cancelled, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        InetAddress address = inetSocketAddress.getAddress();
        String hostAddress = address != null ? address.getHostAddress() : null;
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ConnectEnd, new brd(hostAddress, 12));
    }

    @Override // defpackage.bgo
    public final void connectFailed(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ConnectFailed, new t2j0(w2j0Var, iOException, 1));
    }

    @Override // defpackage.bgo
    public final void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ConnectStart, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void connectionAcquired(yf7 yf7Var, s4e s4eVar) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.Request, new dr20(yf7Var, 1));
    }

    @Override // defpackage.bgo
    public final void connectionReleased(yf7 yf7Var, s4e s4eVar) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ResponseReceived, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void dnsEnd(yf7 yf7Var, String str, List list) {
        InetAddress inetAddress = (InetAddress) a.R(list);
        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.DnsEnd, new cr20(str, hostAddress, 2));
    }

    @Override // defpackage.bgo
    public final void dnsStart(yf7 yf7Var, String str) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.DnsStart, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void proxySelectEnd(yf7 yf7Var, kwu kwuVar, List list) {
        Proxy.Type type;
        int size = list.size();
        String str = null;
        if (size != 0) {
            if (size != 1) {
                str = a.X(list, "->", null, null, new qda0(23), 30);
            } else {
                Proxy proxy = (Proxy) a.R(list);
                if (proxy != null && (type = proxy.type()) != null) {
                    str = type.name();
                }
            }
        }
        String str2 = kwuVar.i;
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ProxyEnd, new cr20(str2, str, 3));
    }

    @Override // defpackage.bgo
    public final void proxySelectStart(yf7 yf7Var, kwu kwuVar) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ProxyStart, new qda0(25));
    }

    @Override // defpackage.bgo
    public final void requestBodyEnd(yf7 yf7Var, long j) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        sqo sqoVar = (sqo) w2j0Var.a.c.get();
        if (sqoVar.a && sqoVar.b) {
            Pair b = w2j0Var.b(yf7Var);
            zj7 zj7Var = (zj7) b.getFirst();
            ek7 ek7Var = (ek7) b.getSecond();
            if (ek7Var == null) {
                return;
            }
            ek7Var.c.put("request_size", Long.valueOf(j));
            w2j0Var.g.put(zj7Var, ek7Var);
        }
    }

    @Override // defpackage.bgo
    public final void responseBodyEnd(yf7 yf7Var, long j) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        sqo sqoVar = (sqo) w2j0Var.a.c.get();
        if (sqoVar.a && sqoVar.b) {
            Pair b = w2j0Var.b(yf7Var);
            zj7 zj7Var = (zj7) b.getFirst();
            ek7 ek7Var = (ek7) b.getSecond();
            if (ek7Var == null) {
                return;
            }
            ek7Var.c.put("response_size", Long.valueOf(j));
            w2j0Var.g.put(zj7Var, ek7Var);
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
        w2j0 w2j0Var = this.m;
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ResponseHeaders, new kn2(24, kvj0Var, w2j0Var));
    }
}
