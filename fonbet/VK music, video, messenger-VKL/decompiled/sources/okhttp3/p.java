package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import okhttp3.c;
import okhttp3.k;
import okhttp3.l;
import xsna.brm0;
import xsna.e43;
import xsna.jgp;
import xsna.x2r0;
import xsna.xwk;
import xsna.zr;

/* compiled from: Request.kt */
/* loaded from: classes11.dex */
public final class p {
    public final l a;
    public final String b;
    public final k c;
    public final t d;
    public final Map<Class<?>, Object> e;
    public c f;

    /* compiled from: Request.kt */
    public static class a {
        public l a;
        public t d;
        public LinkedHashMap e = new LinkedHashMap();
        public String b = "GET";
        public k.a c = new k.a();

        public final void a(String str, String str2) {
            this.c.b(str, str2);
        }

        public final p b() {
            l lVar = this.a;
            if (lVar == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.b;
            k e = this.c.e();
            t tVar = this.d;
            LinkedHashMap linkedHashMap = this.e;
            byte[] bArr = x2r0.a;
            return new p(lVar, str, e, tVar, linkedHashMap.isEmpty() ? jgp.b : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
        }

        public final void c(c cVar) {
            String cVar2 = cVar.toString();
            if (cVar2.length() == 0) {
                this.c.g("Cache-Control");
            } else {
                this.c.h("Cache-Control", cVar2);
            }
        }

        public final void d() {
            f("GET", null);
        }

        public final void e(String str, String str2) {
            this.c.h(str, str2);
        }

        public final void f(String str, t tVar) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (tVar == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(zr.a("method ", str, " must have a request body.").toString());
                }
            } else if (!xwk.f(str)) {
                throw new IllegalArgumentException(zr.a("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.d = tVar;
        }

        public final void g(String str) {
            this.c.g(str);
        }

        public final void h(Class cls, Object obj) {
            if (obj == null) {
                this.e.remove(cls);
                return;
            }
            if (this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            this.e.put(cls, cls.cast(obj));
        }

        public final void i(String str) {
            if (brm0.B(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (brm0.B(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            l.a aVar = new l.a();
            aVar.e(null, str);
            this.a = aVar.b();
        }
    }

    public p(l lVar, String str, k kVar, t tVar, Map<Class<?>, ? extends Object> map) {
        this.a = lVar;
        this.b = str;
        this.c = kVar;
        this.d = tVar;
        this.e = map;
    }

    public final c a() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.n;
        c a2 = c.b.a(this.c);
        this.f = a2;
        return a2;
    }

    public final a b() {
        a aVar = new a();
        aVar.e = new LinkedHashMap();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.d = this.d;
        Map<Class<?>, Object> map = this.e;
        aVar.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        aVar.c = this.c.d();
        return aVar;
    }

    public final <T> T c(Class<? extends T> cls) {
        return cls.cast(this.e.get(cls));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        k kVar = this.c;
        if (kVar.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : kVar) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String d = pair2.d();
                String g = pair2.g();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(d);
                sb.append(':');
                sb.append(g);
                i = i2;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
