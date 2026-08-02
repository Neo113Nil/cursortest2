package xsna;

import com.vk.knet.core.http.HttpProtocol;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;

/* compiled from: HttpResponse.kt */
/* loaded from: classes2.dex */
public final class mkv implements Closeable {
    public static final List<String> h = e43.l("text/html", "application/json");
    public final HttpProtocol b;
    public final String c;
    public final int d;
    public final String e;
    public final Map<String, List<String>> f;
    public final okv g;

    static {
        new Regex("charset=(.*)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mkv(HttpProtocol httpProtocol, String str, int i, String str2, Map<String, ? extends List<String>> map, okv okvVar) {
        this.b = httpProtocol;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = map;
        this.g = okvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mkv b(mkv mkvVar, LinkedHashMap linkedHashMap, okv okvVar, int i) {
        HttpProtocol httpProtocol = mkvVar.b;
        String str = mkvVar.c;
        int i2 = mkvVar.d;
        String str2 = mkvVar.e;
        Map map = linkedHashMap;
        if ((i & 16) != 0) {
            map = mkvVar.f;
        }
        return new mkv(httpProtocol, str, i2, str2, map, okvVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        okv okvVar = this.g;
        if (okvVar != null) {
            okvVar.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkv)) {
            return false;
        }
        mkv mkvVar = (mkv) obj;
        return this.b == mkvVar.b && epx.f(this.c, mkvVar.c) && this.d == mkvVar.d && epx.f(this.e, mkvVar.e) && epx.f(this.f, mkvVar.f) && epx.f(this.g, mkvVar.g);
    }

    public final long getContentLength() {
        List<String> p = p("content-length");
        String str = p != null ? (String) j5g.a0(p) : null;
        boolean z = str == null;
        if (z) {
            return -1L;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        Long n = arm0.n(str);
        if (n != null) {
            return n.longValue();
        }
        return -1L;
    }

    public final String getContentType() {
        String str;
        List<String> p = p("content-type");
        if (p == null || (str = (String) j5g.a0(p)) == null) {
            return null;
        }
        int L = drm0.L(str, ';', 0, 6);
        return L == -1 ? str : str.substring(0, L);
    }

    public final int hashCode() {
        int a = v11.a(urd0.a(shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e), 31, this.f);
        okv okvVar = this.g;
        return a + (okvVar == null ? 0 : okvVar.hashCode());
    }

    public final LinkedHashMap m() {
        Map<String, List<String>> map = this.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), yiz.d((List) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final okv n() {
        return this.g;
    }

    public final String o(String str) {
        List list = (List) yiz.g(str, this.f);
        if (list != null) {
            return yiz.d(list);
        }
        return null;
    }

    public final List<String> p(String str) {
        return (List) yiz.g(str, this.f);
    }

    public final Map<String, List<String>> q() {
        return this.f;
    }

    public final HttpProtocol r() {
        return this.b;
    }

    public final int s() {
        return this.d;
    }

    public final String t() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(protocol=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", statusCode=");
        jax0.a(this.d, ", statusText=", this.e, ", headers=", sb);
        sb.append(this.f);
        sb.append(", body=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public final boolean v() {
        String contentType = getContentType();
        if (contentType == null) {
            return false;
        }
        List<String> list = h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (contentType.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
