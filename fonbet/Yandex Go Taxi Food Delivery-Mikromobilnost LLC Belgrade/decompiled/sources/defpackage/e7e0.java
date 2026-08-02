package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e7e0 implements b70 {
    public static final e7e0 a = new e7e0();
    public static final List b = scc.g(Constants.KEY_PAGE, "places", "restrictions");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        x6e0 x6e0Var = (x6e0) obj;
        bfxVar.A1(Constants.KEY_PAGE);
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, x6e0Var.a);
        bfxVar.A1("places");
        lqy lqyVar = new lqy(om60Var);
        List list = x6e0Var.b;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("restrictions");
        b70 d = cVar.d(ju00.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = x6e0Var.c;
        if (map == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, map);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        Object b3;
        String str = null;
        List list = null;
        Map map = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                lqy lqyVar = new lqy(l80.i);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b3 = null;
                } else {
                    b3 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b3;
            } else {
                if (h2 != 2) {
                    return new x6e0(str, map, list);
                }
                b70 d = cVar.d(ju00.a);
                foe foeVar = l80.a;
                if (d instanceof om60) {
                    ny61.r("The adapter is already nullable");
                    return null;
                }
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = d.b(xdxVar, cVar);
                }
                map = (Map) b2;
            }
        }
    }
}
