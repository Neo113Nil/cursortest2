package sg.bigo.ads.cw;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sg.bigo.ads.an.m;
import xsna.iq;
import xsna.sl9;

/* loaded from: classes9.dex */
final class h {
    private final ExecutorService a = Executors.newSingleThreadExecutor(new sg.bigo.ads.bh.c("Ping"));
    private final String b;
    private final int c;

    public class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            return Boolean.valueOf(h.this.b());
        }

        public /* synthetic */ a(h hVar, byte b) {
            this();
        }
    }

    public h(String str, int i) {
        this.b = (String) m.a(str);
        this.c = i;
    }

    private List<Proxy> c() {
        ArrayList arrayList = new ArrayList();
        try {
            return ProxySelector.getDefault().select(new URI(d()));
        } catch (URISyntaxException e) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Pinger#getDefaultProxies, error message is : " + e.toString());
            return arrayList;
        }
    }

    private String d() {
        Locale locale = Locale.US;
        return iq.a(this.c, "http://", this.b, StringUtils.PROCESS_POSTFIX_DELIMITER, "/ping");
    }

    public final boolean a() {
        int i = 70;
        byte b = 0;
        int i2 = 0;
        while (i2 < 3) {
            try {
            } catch (InterruptedException | ExecutionException unused) {
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error pinging server due to unexpected error");
            } catch (TimeoutException unused2) {
                sg.bigo.ads.bn.a.a(0, "ProxyCache", sl9.c(i2, i, "Error pinging server (attempt: ", ", timeout: ", "). "));
            }
            if (((Boolean) this.a.submit(new a(this, b)).get(i, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i2++;
            i *= 2;
        }
        sg.bigo.ads.bn.a.a(0, "ProxyCache", String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i2), Integer.valueOf(i / 2), c()));
        return false;
    }

    public final boolean b() {
        g gVar = new g(d());
        try {
            byte[] bytes = "ping ok".getBytes();
            try {
                HttpURLConnection b = gVar.b();
                gVar.a = b;
                if (b != null) {
                    gVar.b = new BufferedInputStream(gVar.a.getInputStream(), 8192);
                }
            } catch (IOException e) {
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error opening connection for " + gVar.c + " with offset 0, error message is : " + e.toString());
            }
            byte[] bArr = new byte[bytes.length];
            gVar.a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            new String(bArr);
            return equals;
        } finally {
            gVar.a();
        }
    }
}
