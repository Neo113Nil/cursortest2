package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.kt */
/* loaded from: classes11.dex */
public final class ipg0 {
    public final okhttp3.a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ipg0(okhttp3.a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ipg0)) {
            return false;
        }
        ipg0 ipg0Var = (ipg0) obj;
        return epx.f(ipg0Var.a, this.a) && epx.f(ipg0Var.b, this.b) && epx.f(ipg0Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
