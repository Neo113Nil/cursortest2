package defpackage;

import com.adjust.sdk.Constants;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class no0 {
    public final twl a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final p79 e;
    public final lm3 f;
    public final ProxySelector g;
    public final kwu h;
    public final List i;
    public final List j;

    public no0(String str, int i, twl twlVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, p79 p79Var, lm3 lm3Var, List list, List list2, ProxySelector proxySelector) {
        this.a = twlVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = p79Var;
        this.f = lm3Var;
        this.g = proxySelector;
        jwu jwuVar = new jwu();
        jwuVar.o(sSLSocketFactory != null ? Constants.SCHEME : "http");
        jwuVar.h(str);
        jwuVar.j(i);
        this.h = jwuVar.e();
        this.i = bg61.k(list);
        this.j = bg61.k(list2);
    }

    public final boolean a(no0 no0Var) {
        return jl40.l(this.a, no0Var.a) && jl40.l(this.f, no0Var.f) && jl40.l(this.i, no0Var.i) && jl40.l(this.j, no0Var.j) && jl40.l(this.g, no0Var.g) && jl40.l(this.c, no0Var.c) && jl40.l(this.d, no0Var.d) && jl40.l(this.e, no0Var.e) && this.h.e == no0Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof no0)) {
            return false;
        }
        no0 no0Var = (no0) obj;
        return jl40.l(this.h, no0Var.h) && a(no0Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + unr0.c(unr0.c((this.f.hashCode() + ((this.a.hashCode() + unr0.b(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        kwu kwuVar = this.h;
        sb.append(kwuVar.d);
        sb.append(':');
        sb.append(kwuVar.e);
        sb.append(Extension.FIX_SPACE);
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
