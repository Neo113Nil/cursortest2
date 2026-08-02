package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Consumer;
import one.video.calls.sdk_private.b0;
import one.video.calls.sdk_private.dF;
import xsna.ury0;

/* compiled from: ClientSessionFactoryImpl.java */
/* loaded from: classes8.dex */
public final class vpy0 extends rpy0 {
    public final String f;
    public final int g;
    public final one.video.calls.sdk_private.a0 h;
    public final long i;

    public vpy0(URI uri, String str, one.video.calls.sdk_private.z zVar) throws IOException {
        String host = uri.getHost();
        this.f = host;
        int port = uri.getPort();
        this.g = port;
        try {
            URI uri2 = new URI("https://" + host + StringUtils.PROCESS_POSTFIX_DELIMITER + port);
            new HashMap();
            Optional.empty();
            ury0 ury0Var = zVar.h;
            ury0Var.getClass();
            int port2 = uri2.getPort();
            port2 = port2 <= 0 ? 443 : port2;
            String host2 = uri2.getHost();
            ury0.a aVar = new ury0.a();
            aVar.a = host2;
            aVar.b = str;
            aVar.c = port2;
            try {
                one.video.calls.sdk_private.a0 a = ury0Var.a(aVar);
                ury0Var.b.put(aVar, a);
                this.h = a;
                if (a.h.contains(350866729L)) {
                    throw new IllegalArgumentException("Cannot overwrite internal settings parameter");
                }
                a.e.put(350866729L, 1L);
                synchronized (a) {
                    try {
                        if (!a.b.e()) {
                            a.b.d();
                        }
                        if (!a.j) {
                            a.d();
                            a.j = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.i = a.c(350866729L).orElse(1L).longValue();
                a.c.put(84L, new Consumer() { // from class: xsna.spy0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        dry0 dry0Var = (dry0) obj;
                        try {
                            vpy0.this.a(alk.k(dry0Var.b()), dry0Var);
                        } catch (IOException unused) {
                        } catch (dF unused2) {
                            dry0Var.a(966049156L);
                        }
                    }
                });
                a.k = new tpy0(this);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof IOException)) {
                    throw e;
                }
                throw ((IOException) e.getCause());
            }
        } catch (URISyntaxException unused) {
            throw new IOException(go9.b("Invalid server URI: ", this.f));
        }
    }

    public final eqy0 c(URI uri) throws IOException, one.video.calls.sdk_private.dj {
        upy0 upy0Var = new upy0();
        upy0 upy0Var2 = new upy0();
        if (!this.f.equals(uri.getHost()) || this.g != uri.getPort()) {
            throw new IllegalArgumentException("WebTransport URI must have the same host and port as the server URI used with the constructor");
        }
        if (this.a.size() >= this.i) {
            throw new IllegalStateException(qlb0.a(this.i, "Maximum number of sessions (", ") reached"));
        }
        try {
            new HashMap();
            Optional.empty();
            b0.a e = this.h.e(new yxu(uri, null), Duration.ofSeconds(5L));
            kry0 kry0Var = new kry0();
            kry0Var.a = e;
            kry0Var.b = new HashMap();
            kry0Var.c = new PushbackInputStream(e.c, 8);
            jry0.a(Collections.EMPTY_MAP, new fqy0());
            uri.getAuthority();
            uri.getPath();
            if (uri.getQuery() != null) {
                uri.getQuery();
            }
            try {
                eqy0 eqy0Var = new eqy0(this.h, kry0Var, upy0Var, upy0Var2, this);
                this.b.lock();
                try {
                    this.e = eqy0Var.c;
                    this.a.put(Long.valueOf(eqy0Var.c), eqy0Var);
                    return eqy0Var;
                } finally {
                    this.b.unlock();
                }
            } catch (InterruptedException unused) {
                throw new one.video.calls.sdk_private.dj("HTTP CONNECT request was interrupted");
            }
        } catch (InterruptedException unused2) {
        }
    }
}
