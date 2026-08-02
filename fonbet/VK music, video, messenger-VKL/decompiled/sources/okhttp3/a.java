package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.l;
import xsna.a75;
import xsna.epx;
import xsna.fw3;
import xsna.gqa;
import xsna.lhg;
import xsna.tsn;
import xsna.urd0;
import xsna.x2r0;

/* compiled from: Address.kt */
/* loaded from: classes11.dex */
public final class a {
    public final tsn a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final gqa e;
    public final a75 f;
    public final ProxySelector g;
    public final l h;
    public final List<Protocol> i;
    public final List<f> j;

    public a(String str, int i, tsn tsnVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gqa gqaVar, a75 a75Var, List list, List list2, ProxySelector proxySelector) {
        this.a = tsnVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = gqaVar;
        this.f = a75Var;
        this.g = proxySelector;
        l.a aVar = new l.a();
        aVar.i(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http");
        aVar.d(str);
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(lhg.a(i, "unexpected port: ").toString());
        }
        aVar.e = i;
        this.h = aVar.b();
        this.i = x2r0.w(list);
        this.j = x2r0.w(list2);
    }

    public final boolean a(a aVar) {
        return epx.f(this.a, aVar.a) && epx.f(this.f, aVar.f) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.g, aVar.g) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.h.e == aVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + fw3.a(fw3.a((this.f.hashCode() + ((this.a.hashCode() + urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
