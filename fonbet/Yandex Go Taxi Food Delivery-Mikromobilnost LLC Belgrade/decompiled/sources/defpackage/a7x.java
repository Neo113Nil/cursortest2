package defpackage;

import java.io.EOFException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class a7x implements lm3 {
    public final twl b;

    public a7x(int i) {
        this.b = twl.W1;
    }

    public static InetAddress b(Proxy proxy, kwu kwuVar, twl twlVar) {
        Proxy.Type type = proxy.type();
        return (type == null ? -1 : z6x.a[type.ordinal()]) == 1 ? (InetAddress) a.P(twlVar.a(kwuVar.d)) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    @Override // defpackage.lm3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d5j0 a(b0l0 b0l0Var, kvj0 kvj0Var) {
        String str;
        List<q89> list;
        PasswordAuthentication requestPasswordAuthentication;
        twl twlVar;
        meu meuVar = kvj0Var.y;
        int i = kvj0Var.w;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                list = EmptyList.a;
                d5j0 d5j0Var = kvj0Var.a;
                kwu kwuVar = d5j0Var.a;
                boolean z = kvj0Var.w == 407;
                Proxy proxy = b0l0Var == null ? b0l0Var.b : Proxy.NO_PROXY;
                for (q89 q89Var : list) {
                    if ("Basic".equalsIgnoreCase(q89Var.c())) {
                        twl twlVar2 = (b0l0Var == null || (twlVar = b0l0Var.a.a) == null) ? this.b : twlVar;
                        if (z) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                            requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), b(proxy, kwuVar, twlVar2), inetSocketAddress.getPort(), kwuVar.a, q89Var.b(), q89Var.c(), kwuVar.m(), Authenticator.RequestorType.PROXY);
                        } else {
                            requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(kwuVar.d, b(proxy, kwuVar, twlVar2), kwuVar.e, kwuVar.a, q89Var.b(), q89Var.c(), kwuVar.m(), Authenticator.RequestorType.SERVER);
                        }
                        if (requestPasswordAuthentication != null) {
                            String str2 = z ? "Proxy-Authorization" : "Authorization";
                            String a = ntb1.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()), q89Var.a());
                            t4j0 b = d5j0Var.b();
                            b.c.g(str2, a);
                            return new d5j0(b);
                        }
                    }
                }
                return null;
            }
            str = "Proxy-Authenticate";
        }
        ByteString byteString = lvu.a;
        ArrayList arrayList = new ArrayList();
        int size = meuVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(meuVar.b(i2))) {
                yp6 yp6Var = new yp6();
                yp6Var.x0(meuVar.f(i2));
                try {
                    lvu.b(yp6Var, arrayList);
                } catch (EOFException unused) {
                    d72 d72Var = dvc0.a;
                    dvc0.a.getClass();
                    kva1.d();
                }
            }
        }
        list = arrayList;
        d5j0 d5j0Var2 = kvj0Var.a;
        kwu kwuVar2 = d5j0Var2.a;
        if (kvj0Var.w == 407) {
        }
        if (b0l0Var == null) {
        }
        while (r2.hasNext()) {
        }
        return null;
    }

    public a7x() {
        this(0);
    }
}
