package xsna;

import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.h7i;
import xsna.lkv;
import xsna.skv;

/* compiled from: HttpRequestMapper.kt */
/* loaded from: classes.dex */
public final class ikv implements b8g0 {
    public final Object a;
    public final Set<Regex> b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final h7i e;

    public ikv(Context context, Map<Regex, String> map, Set<Regex> set) {
        this.a = map;
        this.b = set;
        this.e = new h7i(context);
    }

    @Override // xsna.b8g0
    public final ckv a(ckv ckvVar) {
        skv f;
        skv a = skv.a.a(ckvVar.j());
        return (e(a) || (f = f(a)) == null) ? ckvVar : ckv.a(ckvVar, f.toString(), null, null, on00.f(new Pair(lkv.d.a, ckvVar)), 13);
    }

    @Override // xsna.b8g0
    public final ckv b(ckv ckvVar, ckv ckvVar2) {
        Object obj;
        String c;
        skv a = skv.a.a(ckvVar2.j());
        h7i h7iVar = this.e;
        String b = a.b();
        synchronized (h7iVar) {
            try {
                Iterator<T> it = h7iVar.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((h7i.a) obj).b(), b)) {
                        break;
                    }
                }
                h7i.a aVar = (h7i.a) obj;
                c = aVar != null ? aVar.c() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        skv a2 = (c == null && (c = (String) this.c.get(a.b())) == null) ? null : a.a(new hkv(c, 0));
        if (a2 == null) {
            return null;
        }
        if (epx.f(a2.b(), a.b())) {
            return ckvVar;
        }
        String skvVar = a2.toString();
        Map f = on00.f(new Pair(lkv.d.a, ckvVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(ckvVar.e());
        linkedHashMap.put("X-Fallback-Mode", Collections.singletonList("1"));
        return ckv.a(ckvVar, skvVar, linkedHashMap, null, f, 9);
    }

    @Override // xsna.b8g0
    public final void c(long j, String str, String str2) {
        if (j <= 0) {
            this.c.put(str, str2);
            return;
        }
        h7i h7iVar = this.e;
        synchronized (h7iVar) {
            List<h7i.a> a = h7iVar.a();
            g5g.D(a, true, new g7i(str, 0));
            a.add(new h7i.a(str, str2, j));
            h7iVar.c = a;
            h7iVar.c(a);
        }
    }

    @Override // xsna.b8g0
    public final ckv d(ckv ckvVar) {
        skv f;
        skv a = skv.a.a(ckvVar.j());
        if (e(a) || (f = f(a)) == null) {
            return null;
        }
        return ckv.a(ckvVar, f.toString(), null, null, on00.f(new Pair(lkv.d.a, ckvVar)), 13);
    }

    public final boolean e(skv skvVar) {
        String skvVar2 = skvVar.toString();
        Set<Regex> set = this.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).a(skvVar2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final skv f(skv skvVar) {
        Object obj;
        String b = skvVar.b();
        ConcurrentHashMap concurrentHashMap = this.d;
        String str = (String) concurrentHashMap.get(b);
        if (str == null) {
            Iterator it = this.a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Regex) ((Map.Entry) obj).getKey()).a(b)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (str = (String) entry.getValue()) == null) {
                str = null;
            } else {
                concurrentHashMap.put(b, str);
            }
        }
        if (str == null) {
            return null;
        }
        return skvVar.a(new yw(str, 1));
    }
}
