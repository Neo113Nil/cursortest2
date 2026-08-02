package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.zjv;

/* compiled from: XQuicInterceptor.kt */
/* loaded from: classes.dex */
public final class c4y0 implements ojv, uz80 {
    public final boolean a;
    public final Set<Regex> b;
    public final Pair<String, List<String>> c = new Pair<>("X-Quic", Collections.singletonList("1"));
    public final ConcurrentHashMap<String, Boolean> d = new ConcurrentHashMap<>();

    public c4y0(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        boolean z;
        ckv b = aVar.b();
        String b2 = b.i().b();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.d;
        Boolean bool = concurrentHashMap.get(b2);
        if (bool == null) {
            Set<Regex> set = this.b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((Regex) it.next()).a(b2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            concurrentHashMap.put(b2, bool);
        }
        boolean z2 = this.a;
        boolean z3 = z2 && bool.booleanValue();
        m63.j(m63.c(), new Pair("http.quic.applied", Boolean.valueOf(z3)), new Pair("http.quic.available", Boolean.valueOf(z2)));
        if (z3) {
            b = ckv.a(b, null, pn00.o(b.e(), this.c), null, null, 27);
        }
        return aVar.c(b);
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "XQuic";
    }
}
