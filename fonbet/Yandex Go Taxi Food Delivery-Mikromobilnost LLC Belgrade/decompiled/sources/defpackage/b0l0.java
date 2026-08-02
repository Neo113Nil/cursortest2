package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes9.dex */
public final class b0l0 {
    public final no0 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public b0l0(no0 no0Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = no0Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0l0)) {
            return false;
        }
        b0l0 b0l0Var = (b0l0) obj;
        return b0l0Var.a.equals(this.a) && b0l0Var.b.equals(this.b) && jl40.l(b0l0Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        kwu kwuVar = this.a.h;
        String str = kwuVar.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : wf61.b(hostAddress);
        if (evu0.z(str, ':')) {
            x4e.C(sb, "[", str, "]");
        } else {
            sb.append(str);
        }
        if (kwuVar.e != inetSocketAddress.getPort() || str.equals(b)) {
            sb.append(":");
            sb.append(kwuVar.e);
        }
        if (!str.equals(b)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b == null) {
                sb.append("<unresolved>");
            } else if (evu0.z(b, ':')) {
                x4e.C(sb, "[", b, "]");
            } else {
                sb.append(b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
