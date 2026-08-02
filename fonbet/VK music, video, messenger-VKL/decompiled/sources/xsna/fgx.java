package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.vk.pathfinder.utils.DeepLinkThrowable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;
import xsna.hl10;
import xsna.i9l;

/* compiled from: InternalContext.kt */
/* loaded from: classes4.dex */
public final class fgx extends gg50 {
    public final Context e;
    public LinkedHashMap f;
    public String g;
    public n9l h;
    public izs<? super i9l, s3q0> i;
    public i9l j;
    public ws90<Lazy<g9l<fgx>>> k;
    public ws90<j9l> l;
    public ws90<Map<j9l, List<Lazy<g9l<fgx>>>>> m;
    public volatile boolean n;

    public fgx() {
        throw null;
    }

    public fgx(Uri uri, LinkedHashMap linkedHashMap, Context context, LinkedHashMap linkedHashMap2, String str) {
        this.a = linkedHashMap;
        this.d = uri;
        this.e = context;
        this.f = linkedHashMap2;
        this.g = str;
    }

    public final String a(String str) {
        if (this.c == null) {
            Set<String> queryParameterNames = this.d.getQueryParameterNames();
            int e = on00.e(c5g.u(queryParameterNames, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : queryParameterNames) {
                linkedHashMap.put(obj, this.d.getQueryParameters((String) obj));
            }
            this.c = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = this.c;
        if (linkedHashMap2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List list = (List) linkedHashMap2.get(str);
        if (list != null) {
            return (String) j5g.Y(list);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        Object obj;
        Object obj2 = ws90.d;
        if (this.n) {
            return;
        }
        ws90<Lazy<g9l<fgx>>> ws90Var = this.k;
        List list = null;
        list = null;
        if (!this.n && ws90Var != null && ws90Var.b.hasNext()) {
            g9l<fgx> value = ws90Var.next().getValue();
            if (value instanceof n9l) {
                ws90<j9l> ws90Var2 = this.l;
                j9l j9lVar = ws90Var2 != null ? (j9l) (epx.f(ws90Var2.c, obj2) ? null : ws90Var2.c) : null;
                if (j9lVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str = j9lVar.a.b;
                n9l n9lVar = this.h;
                String W = drm0.W(str, (n9lVar != null ? n9lVar : null).e);
                this.g = i5s.a(new StringBuilder(), this.g, W);
                d(value, this);
                if (!brm0.v(this.g, W, false)) {
                    throw new IllegalStateException(("mount is broken (current \"" + this.g + "\", expected to end with \"" + W + '\"').toString());
                }
                this.g = drm0.W(this.g, W);
            } else {
                d(value, this);
            }
            if (value instanceof k5r) {
                return;
            }
            if (value instanceof lao0) {
                this.j = i9l.b.a;
                e();
                return;
            } else if (!(value instanceof fhd0)) {
                b();
                return;
            } else {
                this.j = i9l.b.a;
                e();
                return;
            }
        }
        ws90<j9l> ws90Var3 = this.l;
        if (!this.n && ws90Var3 != null && ws90Var3.b.hasNext()) {
            do {
                j9l next = ws90Var3.next();
                next.getClass();
                String str2 = this.g + next.a.b;
                ?? r6 = j9l.b;
                Regex regex = (Regex) ((LruCache) r6.getValue()).get(str2);
                if (regex == null) {
                    regex = new Regex(str2);
                    ((LruCache) r6.getValue()).put(str2, regex);
                }
                if (this.b == null) {
                    this.b = this.d.getPath();
                }
                String str3 = this.b;
                if (str3 == null) {
                    throw new IllegalStateException("deep link uri without a path is prohibited");
                }
                hl10 e = regex.e(str3);
                if (e != null) {
                    List<String> A = rli0.A(new ulp0(Regex.d((Regex) j9l.c.getValue(), str2), new mo1(25)));
                    MapBuilder mapBuilder = new MapBuilder();
                    for (String str4 : A) {
                        hl10.b bVar = e.c;
                        if (bVar == null) {
                            bVar = null;
                        }
                        if (bVar == null) {
                            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
                        }
                        uk10 uk10Var = bVar.get(str4);
                        String str5 = uk10Var != null ? uk10Var.a : null;
                        if (str5 != null) {
                            mapBuilder.put(str4, str5);
                        }
                    }
                    obj = new yk10(mapBuilder.h());
                } else {
                    obj = xk10.a;
                }
                if (obj instanceof yk10) {
                    this.f = new LinkedHashMap(((yk10) obj).a);
                    ws90<Map<j9l, List<Lazy<g9l<fgx>>>>> ws90Var4 = this.m;
                    if (ws90Var4 != null) {
                        Map map = (Map) (epx.f(ws90Var4.c, obj2) ? null : ws90Var4.c);
                        if (map != null) {
                            list = (List) map.get(next);
                        }
                    }
                    if (list == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.k = new ws90<>(list.iterator());
                    b();
                    return;
                }
            } while (ws90Var3.b.hasNext());
        }
        ws90<Map<j9l, List<Lazy<g9l<fgx>>>>> ws90Var5 = this.m;
        if (!this.n && ws90Var5 != null && ws90Var5.b.hasNext()) {
            this.l = new ws90<>(ws90Var5.next().keySet().iterator());
            if (this.j == null && !ws90Var5.b.hasNext()) {
                this.j = i9l.c.a;
            }
            b();
            return;
        }
        i9l i9lVar = this.j;
        if (i9lVar == null) {
            throw new IllegalStateException("result is null");
        }
        this.n = true;
        izs<? super i9l, s3q0> izsVar = this.i;
        if (izsVar == null) {
            throw new IllegalStateException("callback is null");
        }
        izsVar.invoke(i9lVar);
    }

    public final String c(String str) {
        Object obj = this.f.get(str);
        if (obj != null) {
            return (String) obj;
        }
        throw new IllegalStateException(zr.a("no path param by name \"", str, "\" found").toString());
    }

    public final void d(g9l g9lVar, fgx fgxVar) {
        try {
            synchronized (g9lVar) {
                g9lVar.a(fgxVar);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable th) {
            this.j = new i9l.a(new DeepLinkThrowable(this, th));
            e();
        }
    }

    public final void e() {
        ws90<Map<j9l, List<Lazy<g9l<fgx>>>>> ws90Var = this.m;
        if (ws90Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Iterator<Map<j9l, List<Lazy<g9l<fgx>>>>> it = ws90Var.b;
        if (it.hasNext()) {
            while (it.hasNext()) {
                ws90Var.next();
            }
            this.k = null;
            Object obj = epx.f(ws90Var.c, ws90.d) ? null : ws90Var.c;
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.l = new ws90<>(((Map) obj).keySet().iterator());
        }
        b();
    }

    public fgx(n9l n9lVar, Context context, Uri uri, m9l m9lVar) {
        this(uri, new LinkedHashMap(), context, new LinkedHashMap(), "");
        this.h = n9lVar;
        this.i = m9lVar;
        this.m = new ws90<>(e43.l(n9lVar.b, n9lVar.c, n9lVar.d).iterator());
    }
}
