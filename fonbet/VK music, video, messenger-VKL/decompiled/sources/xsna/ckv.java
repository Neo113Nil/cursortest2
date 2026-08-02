package xsna;

import com.vk.knet.core.http.HttpMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.LazyThreadSafetyMode;

/* compiled from: HttpRequest.kt */
/* loaded from: classes2.dex */
public final class ckv {
    public static final AtomicLong j = new AtomicLong(0);
    public final HttpMethod a;
    public final String b;
    public final Map<String, List<String>> c;
    public final dkv d;
    public final Map<Object, Object> e;
    public final long f;
    public final Object g;
    public final bpn0 h;
    public final bpn0 i;

    /* JADX WARN: Multi-variable type inference failed */
    public ckv(HttpMethod httpMethod, String str, Map<String, ? extends List<String>> map, dkv dkvVar, Map<Object, ? extends Object> map2) {
        this.a = httpMethod;
        this.b = str;
        this.c = map;
        this.d = dkvVar;
        this.e = map2;
        AtomicLong atomicLong = j;
        atomicLong.compareAndSet(Long.MAX_VALUE, 0L);
        this.f = atomicLong.incrementAndGet();
        this.g = msy.a(LazyThreadSafetyMode.NONE, new tvj(this, 14));
        this.h = new bpn0(new qzg(this, 24));
        this.i = new bpn0(new cvs(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.dkv] */
    public static ckv a(ckv ckvVar, String str, Map map, dge dgeVar, Map map2, int i) {
        String str2 = str;
        HttpMethod httpMethod = ckvVar.a;
        if ((i & 2) != 0) {
            str2 = ckvVar.b;
        }
        if ((i & 4) != 0) {
            map = ckvVar.c;
        }
        dge dgeVar2 = dgeVar;
        if ((i & 8) != 0) {
            dgeVar2 = ckvVar.d;
        }
        if ((i & 16) != 0) {
            map2 = ckvVar.e;
        }
        Map map3 = map2;
        ckvVar.getClass();
        dge dgeVar3 = dgeVar2;
        return new ckv(httpMethod, str2, (Map<String, ? extends List<String>>) map, dgeVar3, (Map<Object, ? extends Object>) map3);
    }

    public final dkv b() {
        return this.d;
    }

    public final String c(String str) {
        List list = (List) yiz.g(str, this.c);
        if (list != null) {
            return yiz.d(list);
        }
        return null;
    }

    public final List<String> d(String str) {
        return (List) yiz.g(str, this.c);
    }

    public final Map<String, List<String>> e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckv)) {
            return false;
        }
        ckv ckvVar = (ckv) obj;
        return this.a == ckvVar.a && epx.f(this.b, ckvVar.b) && epx.f(this.c, ckvVar.c) && epx.f(this.d, ckvVar.d) && epx.f(this.e, ckvVar.e);
    }

    public final long f() {
        return this.f;
    }

    public final HttpMethod g() {
        return this.a;
    }

    public final Object h(lkv lkvVar) {
        Map<Object, Object> map = this.e;
        if (map != null) {
            return map.get(lkvVar);
        }
        return null;
    }

    public final int hashCode() {
        int a = v11.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        dkv dkvVar = this.d;
        int hashCode = (a + (dkvVar == null ? 0 : dkvVar.hashCode())) * 31;
        Map<Object, Object> map = this.e;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final skv i() {
        return (skv) this.g.getValue();
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final ckv m(lkv lkvVar, Object obj) {
        Map<Object, Object> map = this.e;
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        linkedHashMap.put(lkvVar, obj);
        return a(this, null, null, null, linkedHashMap, 15);
    }

    public final String toString() {
        return "HttpRequest(method=" + this.a + ", url=" + this.b + ", headers=" + this.c + ", body=" + this.d + ", payload=" + this.e + ")";
    }

    public /* synthetic */ ckv(HttpMethod httpMethod, String str, Map map, ekv ekvVar, int i) {
        this(httpMethod, str, (Map<String, ? extends List<String>>) map, (i & 8) != 0 ? null : ekvVar, (Map<Object, ? extends Object>) null);
    }
}
