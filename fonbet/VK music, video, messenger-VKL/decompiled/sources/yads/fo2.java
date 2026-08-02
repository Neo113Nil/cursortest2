package yads;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.O6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import xsna.e43;
import xsna.on00;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class fo2 implements Runnable {
    public final e9 b;
    public final /* synthetic */ go2 c;

    public fo2(go2 go2Var, e9 e9Var) {
        this.c = go2Var;
        this.b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List l;
        pi a;
        String str;
        so1 d;
        if (this.c.d) {
            return;
        }
        e9 e9Var = this.b;
        if (e9Var.a.a()) {
            u22 u22Var = e9Var.b;
            u22Var.c.getClass();
            qu2 a2 = u22Var.d.a(u22Var.a);
            if (a2 == null || !a2.D || (((oz1) u22Var.b).a(false) instanceof vc3)) {
                go2 go2Var = this.c;
                go2Var.d = true;
                jo2 jo2Var = go2Var.b;
                lo2 lo2Var = jo2Var.c;
                if (lo2Var != null) {
                    lo2Var.a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                io2 io2Var = jo2Var.d;
                Iterator it = io2Var.a.iterator();
                while (it.hasNext()) {
                    za.a(io2Var.b, (String) it.next(), o93.i);
                }
                ho2 ho2Var = io2Var.c;
                gp2 a3 = ho2Var.f.a(ho2Var.b, ho2Var.a);
                a3.b(cp2.a, O6.G1);
                n52 n52Var = ho2Var.g;
                if (n52Var != null) {
                    Map map = n52Var.a.a().a;
                    nj njVar = n52Var.b;
                    njVar.getClass();
                    HashMap hashMap = new HashMap();
                    for (oi oiVar : njVar.a) {
                        String str2 = oiVar.a;
                        m22 m22Var = njVar.b;
                        if (m22Var != null && (a = m22Var.a(oiVar)) != null && a.b()) {
                            HashMap hashMap2 = new HashMap();
                            dm3 c = a.c();
                            if (c != null) {
                                hashMap2.put("width", Integer.valueOf(jb3.a(c.a)));
                                hashMap2.put("height", Integer.valueOf(jb3.a(c.b)));
                            }
                            sk1 sk1Var = a instanceof sk1 ? (sk1) a : null;
                            if (sk1Var != null) {
                                to1 to1Var = sk1Var.b;
                                so1 so1Var = (to1Var == null || (d = to1Var.d()) == null) ? sk1Var.a != null ? so1.f : null : d;
                                if (so1Var != null && (str = so1Var.b) != null) {
                                    hashMap2.put("value_type", str);
                                }
                            }
                            hashMap.put(str2, hashMap2);
                        }
                    }
                    m22 m22Var2 = njVar.b;
                    View a4 = m22Var2 != null ? m22Var2.c.a() : null;
                    MapBuilder mapBuilder = new MapBuilder();
                    if (a4 != null) {
                        mapBuilder.put("width", Integer.valueOf(jb3.a(a4.getWidth())));
                        mapBuilder.put("height", Integer.valueOf(jb3.a(a4.getHeight())));
                    }
                    MapBuilder h = mapBuilder.h();
                    if (!h.isEmpty()) {
                        hashMap.put("superview", h);
                    }
                    a3.a.putAll(pn00.n(map, on00.f(new Pair("assets", on00.f(new Pair("rendered", hashMap))))));
                }
                e13 e13Var = ho2Var.a.d.a;
                if (e13Var != null) {
                    a3.b(e13Var.b().b, "size_type");
                    a3.b(Integer.valueOf(e13Var.getWidth()), "width");
                    a3.b(Integer.valueOf(e13Var.getHeight()), "height");
                }
                qu2 qu2Var = ho2Var.e;
                if (qu2Var != null) {
                    a3.b(qu2Var.R, "banner_size_calculation_type");
                }
                int ordinal = ho2Var.c.ordinal();
                if (ordinal == 0) {
                    l = e43.l(dp2.n, dp2.m);
                } else if (ordinal == 1) {
                    l = Collections.singletonList(dp2.n);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l = Collections.singletonList(dp2.m);
                }
                Iterator it2 = l.iterator();
                while (it2.hasNext()) {
                    ho2Var.d.a(new fp2(((dp2) it2.next()).b, new LinkedHashMap(a3.a), a3.b));
                }
                f5 f5Var = jo2Var.a;
                String str3 = f5Var.a.a;
                if (str3 != null && str3.length() != 0) {
                    e5 e5Var = f5Var.b;
                    e5Var.getClass();
                    synchronized (e5.c) {
                        e5Var.a.remove(str3);
                        e5Var.a.add(str3);
                    }
                }
                jo2Var.b.f();
                return;
            }
        }
        go2 go2Var2 = this.c;
        go2Var2.c.postDelayed(new fo2(go2Var2, this.b), 300L);
    }
}
