package xsna;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: RouteSelector.kt */
/* loaded from: classes11.dex */
public final class kpg0 {
    public final okhttp3.a a;
    public final t120 b;
    public final okhttp3.d c;
    public final okhttp3.g d;
    public final List<? extends Proxy> e;
    public int f;
    public Object g;
    public final ArrayList h;

    /* compiled from: RouteSelector.kt */
    public static final class a {
        public final ArrayList a;
        public int b;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public kpg0(okhttp3.a aVar, t120 t120Var, okhttp3.d dVar, okhttp3.g gVar) {
        List<? extends Proxy> k;
        this.a = aVar;
        this.b = t120Var;
        this.c = dVar;
        this.d = gVar;
        EmptyList emptyList = EmptyList.b;
        this.e = emptyList;
        this.g = emptyList;
        this.h = new ArrayList();
        URI i = aVar.h.i();
        if (i.getHost() == null) {
            k = x2r0.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.g.select(i);
            List<Proxy> list = select;
            k = (list == null || list.isEmpty()) ? x2r0.k(Proxy.NO_PROXY) : x2r0.w(select);
        }
        this.e = k;
        this.f = 0;
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
