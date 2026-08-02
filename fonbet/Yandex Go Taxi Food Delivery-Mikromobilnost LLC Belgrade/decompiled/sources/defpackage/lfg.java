package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lfg implements b70 {
    public static final lfg a = new lfg();
    public static final List b = scc.g("textColor", C0553n3.g, "commonOverlays", "buttons");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        efg efgVar = (efg) obj;
        bfxVar.A1("textColor");
        l80.i.a(bfxVar, cVar, efgVar.a);
        bfxVar.A1(C0553n3.g);
        ep60 a2 = l80.a(hfg.a);
        bfg bfgVar = efgVar.b;
        if (bfgVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, bfgVar);
        }
        bfxVar.A1("commonOverlays");
        lqy lqyVar = new lqy(new ep60(jfg.a, true));
        List list = efgVar.c;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("buttons");
        ep60 a3 = l80.a(ifg.a);
        ArrayList arrayList = efgVar.d;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a3.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        Object b3;
        Object b4;
        String str = null;
        bfg bfgVar = null;
        List list = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                ep60 a2 = l80.a(hfg.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b4 = null;
                } else {
                    b4 = a2.b(xdxVar, cVar);
                }
                bfgVar = (bfg) b4;
            } else if (h2 == 2) {
                jfg jfgVar = jfg.a;
                foe foeVar = l80.a;
                lqy lqyVar = new lqy(new ep60(jfgVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b3 = null;
                } else {
                    b3 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b3;
            } else {
                if (h2 != 3) {
                    return new efg(str, bfgVar, list, arrayList);
                }
                ep60 a3 = l80.a(ifg.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b2 = null;
                    } else {
                        b2 = a3.b(xdxVar, cVar);
                    }
                    z.add(b2);
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
