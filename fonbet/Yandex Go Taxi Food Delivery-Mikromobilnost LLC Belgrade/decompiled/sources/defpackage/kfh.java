package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes2.dex */
public final class kfh implements ao50 {
    public final sls a;
    public final gq50 b;
    public final qdh c;
    public final bms d;
    public final fms e;
    public final OkHttpClient f;
    public final xh6 g;

    public kfh(sls slsVar, gq50 gq50Var, qdh qdhVar, bms bmsVar, fms fmsVar) {
        this.a = slsVar;
        this.b = gq50Var;
        this.c = qdhVar;
        this.d = bmsVar;
        this.e = fmsVar;
        OkHttpClient.a aVar = new OkHttpClient.a();
        int i = 0;
        if (gq50Var.a) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(i);
            httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
            aVar.a(httpLoggingInterceptor);
        }
        Iterator it = gq50Var.c.iterator();
        while (it.hasNext()) {
            aVar.a((p8w) it.next());
        }
        gq50 gq50Var2 = this.b;
        gq50Var2.getClass();
        gq50Var2.b.a(aVar);
        this.b.getClass();
        ryj ryjVar = new ryj(new wh6(new q7x0(m83.c("com.yandex.infra.".concat("NetworkRequestExecutor")), 1), 0));
        ryjVar.d(1);
        aVar.a = ryjVar;
        this.f = new OkHttpClient(aVar);
        this.g = new xh6(0);
    }

    public final d5j0 a(hz50 hz50Var) {
        Object obj;
        zrm zrmVar;
        kwu kwuVar;
        String str;
        y5j0 encoding = hz50Var.encoding();
        NetworkMethod method = hz50Var.method();
        wj00 a = hz50Var.a();
        Set set = a6j0.a;
        int i = z5j0.a[encoding.getKind().ordinal()];
        int i2 = 8;
        String str2 = "GET";
        Object obj2 = null;
        if (i == 1) {
            Set set2 = a6j0.a;
            int i3 = mfh.a[method.ordinal()];
            if (i3 == 1) {
                obj = "GET";
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                obj = "POST";
            }
            if (set2.contains(obj)) {
                zrmVar = new zrm(i2, (Map) hab1.a(a), obj2);
            } else {
                l3s l3sVar = new l3s(0);
                for (Map.Entry entry : new TreeMap((Map) hab1.a(a)).entrySet()) {
                    String str3 = (String) entry.getKey();
                    String d = w791.d(entry.getValue());
                    if (d != null) {
                        l3sVar.a(str3, d);
                    }
                }
                zrmVar = new zrm(i2, b.f(), new m3s(l3sVar.a, l3sVar.b));
            }
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            tyj0 b = this.c.b(a);
            if (b.b()) {
                LinkedHashMap linkedHashMap = zdz.a;
                YSError ySError = b.b;
                c.b(ySError);
                ogb1.b("Error building JSON POST request body: " + ySError.getMessage());
                str = "";
            } else {
                str = (String) b.a();
            }
            int i4 = m5j0.a;
            Regex regex = wg10.e;
            zrmVar = new zrm(i2, b.f(), wms.a(str, qje.o("application/json")));
        }
        m5j0 m5j0Var = (m5j0) zrmVar.c;
        String url = ((URL) this.a.invoke()).toString();
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, url);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        jwu g = kwuVar.g();
        g.c(hz50Var.c(), false);
        for (Map.Entry entry2 : b.n((Map) hab1.a(hz50Var.b()), (Map) zrmVar.b).entrySet()) {
            String str4 = (String) entry2.getKey();
            String d2 = w791.d(entry2.getValue());
            if (d2 != null) {
                g.d(str4, d2);
            }
        }
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = g.e();
        t4j0Var.c.a("Connection", "keep-alive");
        if (m5j0Var != null) {
            t4j0Var.a("Content-Type", String.valueOf(m5j0Var.b()));
        }
        for (Map.Entry entry3 : ((Map) hab1.a(hz50Var.d())).entrySet()) {
            String str5 = (String) entry3.getKey();
            String d3 = w791.d(entry3.getValue());
            if (d3 != null) {
                t4j0Var.a(str5, d3);
            }
        }
        int i5 = mfh.a[hz50Var.method().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                w511.b();
                return null;
            }
            str2 = "POST";
        }
        t4j0Var.e(str2, m5j0Var);
        return new d5j0(t4j0Var);
    }

    public kfh(URL url, gq50 gq50Var, qdh qdhVar, bms bmsVar, fms fmsVar) {
        this(new ybf(28, url), gq50Var, qdhVar, bmsVar, fmsVar);
    }
}
