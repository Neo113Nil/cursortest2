package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class atc0 implements b70 {
    public static final List a = scc.g("widgetGroupId", "widgets", "groupDisplayRules", "typedProperties", "strictAction", "contentDescription");

    public static xsc0 c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        String str = null;
        ArrayList arrayList = null;
        usc0 usc0Var = null;
        wsc0 wsc0Var = null;
        vsc0 vsc0Var = null;
        tsc0 tsc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                arrayList = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    arrayList.add(xdxVar.nextString());
                }
                xdxVar.j();
            } else if (h2 == 2) {
                zsc0 zsc0Var = zsc0.a;
                foe foeVar3 = l80.a;
                usc0Var = (usc0) new ep60(zsc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 3) {
                ctc0 ctc0Var = ctc0.a;
                foe foeVar4 = l80.a;
                wsc0Var = (wsc0) new ep60(ctc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 4) {
                btc0 btc0Var = btc0.a;
                foe foeVar5 = l80.a;
                ep60 ep60Var = new ep60(btc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = ep60Var.b(xdxVar, cVar);
                }
                vsc0Var = (vsc0) obj2;
            } else {
                if (h2 != 5) {
                    return new xsc0(str, arrayList, usc0Var, wsc0Var, vsc0Var, tsc0Var);
                }
                ysc0 ysc0Var = ysc0.a;
                foe foeVar6 = l80.a;
                ep60 ep60Var2 = new ep60(ysc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = ep60Var2.b(xdxVar, cVar);
                }
                tsc0Var = (tsc0) obj;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, xsc0 xsc0Var) {
        bfxVar.A1("widgetGroupId");
        foe foeVar = l80.a;
        bfxVar.r0(xsc0Var.a);
        bfxVar.A1("widgets");
        ArrayList arrayList = xsc0Var.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            foeVar.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("groupDisplayRules");
        zsc0 zsc0Var = zsc0.a;
        usc0 usc0Var = xsc0Var.c;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            zsc0Var.a(bfxVar, cVar, usc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            zsc0Var.a(ek00Var2, cVar, usc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("typedProperties");
        ctc0 ctc0Var = ctc0.a;
        wsc0 wsc0Var = xsc0Var.d;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            ctc0Var.a(bfxVar, cVar, wsc0Var);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            ctc0Var.a(ek00Var4, cVar, wsc0Var);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("strictAction");
        ep60 ep60Var = new ep60(btc0.a, true);
        vsc0 vsc0Var = xsc0Var.e;
        if (vsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, vsc0Var);
        }
        bfxVar.A1("contentDescription");
        ep60 ep60Var2 = new ep60(ysc0.a, true);
        tsc0 tsc0Var = xsc0Var.f;
        if (tsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, tsc0Var);
        }
    }
}
