package defpackage;

import com.yandex.mob.okhttp.metrics.MobCallStatus;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public final class jqh extends bgo {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ jqh(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.bgo
    public void callEnd(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).callEnd(yf7Var);
                }
                break;
            default:
                super.callEnd(yf7Var);
                break;
        }
    }

    @Override // defpackage.bgo
    public final void callFailed(yf7 yf7Var, IOException iOException) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).callFailed(yf7Var, iOException);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                if (!yf7Var.n()) {
                    yuf0Var.k(yf7Var, MobCallStatus.Failure, new br20(yuf0Var, iOException, 1));
                    break;
                } else {
                    yuf0Var.k(yf7Var, MobCallStatus.Cancelled, new qz10(4));
                    break;
                }
        }
    }

    @Override // defpackage.bgo
    public final void callStart(yf7 yf7Var) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).callStart(yf7Var);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.Enqueue, new qz10(4));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void canceled(yf7 yf7Var) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).canceled(yf7Var);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.Cancelled, new qz10(4));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).connectEnd(yf7Var, inetSocketAddress, proxy, protocol);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                String hostAddress = inetSocketAddress.getAddress().getHostAddress();
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ConnectEnd, new brd(hostAddress, 9));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void connectFailed(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).connectFailed(yf7Var, inetSocketAddress, proxy, protocol, iOException);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ConnectFailed, new br20(yuf0Var, iOException, 0));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).connectStart(yf7Var, inetSocketAddress, proxy);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ConnectStart, new qz10(4));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void connectionAcquired(yf7 yf7Var, s4e s4eVar) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).connectionAcquired(yf7Var, s4eVar);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.Request, new dr20(yf7Var, 0));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void connectionReleased(yf7 yf7Var, s4e s4eVar) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).connectionReleased(yf7Var, s4eVar);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ResponseReceived, new qz10(4));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void dnsEnd(yf7 yf7Var, String str, List list) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).dnsEnd(yf7Var, str, list);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                InetAddress inetAddress = (InetAddress) a.R(list);
                String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.DnsEnd, new cr20(str, hostAddress, 1));
                break;
        }
    }

    @Override // defpackage.bgo
    public final void dnsStart(yf7 yf7Var, String str) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).dnsStart(yf7Var, str);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.DnsStart, new qz10(4));
                break;
        }
    }

    @Override // defpackage.bgo
    public void proxySelectEnd(yf7 yf7Var, kwu kwuVar, List list) {
        Proxy.Type type;
        switch (this.m) {
            case 1:
                yuf0 yuf0Var = (yuf0) this.n;
                String str = kwuVar.i;
                Proxy proxy = (Proxy) a.R(list);
                String name = (proxy == null || (type = proxy.type()) == null) ? null : type.name();
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ProxyEnd, new cr20(str, name, 0));
                break;
            default:
                super.proxySelectEnd(yf7Var, kwuVar, list);
                break;
        }
    }

    @Override // defpackage.bgo
    public void proxySelectStart(yf7 yf7Var, kwu kwuVar) {
        switch (this.m) {
            case 1:
                yuf0 yuf0Var = (yuf0) this.n;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ProxyStart, new qz10(4));
                break;
            default:
                super.proxySelectStart(yf7Var, kwuVar);
                break;
        }
    }

    @Override // defpackage.bgo
    public void requestBodyEnd(yf7 yf7Var, long j) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).requestBodyEnd(yf7Var, j);
                }
                break;
            default:
                super.requestBodyEnd(yf7Var, j);
                break;
        }
    }

    @Override // defpackage.bgo
    public void requestBodyStart(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).requestBodyStart(yf7Var);
                }
                break;
            default:
                super.requestBodyStart(yf7Var);
                break;
        }
    }

    @Override // defpackage.bgo
    public void requestFailed(yf7 yf7Var, IOException iOException) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).requestFailed(yf7Var, iOException);
                }
                break;
            default:
                super.requestFailed(yf7Var, iOException);
                break;
        }
    }

    @Override // defpackage.bgo
    public void requestHeadersEnd(yf7 yf7Var, d5j0 d5j0Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).requestHeadersEnd(yf7Var, d5j0Var);
                }
                break;
            default:
                super.requestHeadersEnd(yf7Var, d5j0Var);
                break;
        }
    }

    @Override // defpackage.bgo
    public void requestHeadersStart(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).requestHeadersStart(yf7Var);
                }
                break;
            default:
                super.requestHeadersStart(yf7Var);
                break;
        }
    }

    @Override // defpackage.bgo
    public void responseBodyEnd(yf7 yf7Var, long j) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).responseBodyEnd(yf7Var, j);
                }
                break;
        }
    }

    @Override // defpackage.bgo
    public void responseBodyStart(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).responseBodyStart(yf7Var);
                }
                break;
            default:
                super.responseBodyStart(yf7Var);
                break;
        }
    }

    @Override // defpackage.bgo
    public void responseFailed(yf7 yf7Var, IOException iOException) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).responseFailed(yf7Var, iOException);
                }
                break;
            default:
                super.responseFailed(yf7Var, iOException);
                break;
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).responseHeadersEnd(yf7Var, kvj0Var);
                }
                break;
            default:
                yuf0 yuf0Var = (yuf0) obj;
                yuf0Var.getClass();
                yuf0Var.k(yf7Var, MobCallStatus.ResponseHeaders, new kn2(15, kvj0Var, yuf0Var));
                break;
        }
    }

    @Override // defpackage.bgo
    public void responseHeadersStart(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).responseHeadersStart(yf7Var);
                }
                break;
        }
    }

    @Override // defpackage.bgo
    public void secureConnectEnd(yf7 yf7Var, o6u o6uVar) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).secureConnectEnd(yf7Var, o6uVar);
                }
                break;
            default:
                super.secureConnectEnd(yf7Var, o6uVar);
                break;
        }
    }

    @Override // defpackage.bgo
    public void secureConnectStart(yf7 yf7Var) {
        switch (this.m) {
            case 0:
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    ((bgo) it.next()).secureConnectStart(yf7Var);
                }
                break;
        }
    }
}
