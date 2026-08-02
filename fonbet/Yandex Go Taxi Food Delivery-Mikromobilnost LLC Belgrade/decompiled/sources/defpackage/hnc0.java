package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class hnc0 implements b70 {
    public static final List a = scc.g("plaqueId", "priority", "widgetsLevelIds", "contentDescription", "condition", "displayRules", "strictAction", "metricContext", "params", "seenContext", "notification", "serviceMeta");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        return new defpackage.yhc0(r4, r3.intValue(), r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yhc0 c(xdx xdxVar, c cVar) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Integer num2 = null;
        String str = null;
        ArrayList arrayList = null;
        qhc0 qhc0Var = null;
        ohc0 ohc0Var = null;
        shc0 shc0Var = null;
        whc0 whc0Var = null;
        thc0 thc0Var = null;
        vhc0 vhc0Var = null;
        String str2 = null;
        uhc0 uhc0Var = null;
        Map map = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    continue;
                case 1:
                    num2 = (Integer) l80.b.b(xdxVar, cVar);
                    continue;
                case 2:
                    num = num2;
                    om60 om60Var = l80.i;
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList.add(om60Var.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    break;
                case 3:
                    num = num2;
                    cnc0 cnc0Var = cnc0.a;
                    foe foeVar2 = l80.a;
                    ep60 ep60Var = new ep60(cnc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = ep60Var.b(xdxVar, cVar);
                    }
                    qhc0Var = (qhc0) obj;
                    break;
                case 4:
                    num = num2;
                    bnc0 bnc0Var = bnc0.a;
                    foe foeVar3 = l80.a;
                    ohc0Var = (ohc0) new ep60(bnc0Var, true).b(xdxVar, cVar);
                    break;
                case 5:
                    num = num2;
                    dnc0 dnc0Var = dnc0.a;
                    foe foeVar4 = l80.a;
                    shc0Var = (shc0) new ep60(dnc0Var, true).b(xdxVar, cVar);
                    break;
                case 6:
                    num = num2;
                    inc0 inc0Var = inc0.a;
                    foe foeVar5 = l80.a;
                    ep60 ep60Var2 = new ep60(inc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = ep60Var2.b(xdxVar, cVar);
                    }
                    whc0Var = (whc0) obj2;
                    break;
                case 7:
                    num = num2;
                    enc0 enc0Var = enc0.a;
                    foe foeVar6 = l80.a;
                    ep60 ep60Var3 = new ep60(enc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = ep60Var3.b(xdxVar, cVar);
                    }
                    thc0Var = (thc0) obj3;
                    break;
                case 8:
                    num = num2;
                    ep60 a2 = l80.a(gnc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj4 = null;
                    } else {
                        obj4 = a2.b(xdxVar, cVar);
                    }
                    vhc0Var = (vhc0) obj4;
                    break;
                case 9:
                    str2 = (String) l80.i.b(xdxVar, cVar);
                    continue;
                case 10:
                    num = num2;
                    fnc0 fnc0Var = fnc0.a;
                    foe foeVar7 = l80.a;
                    ep60 ep60Var4 = new ep60(fnc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj5 = null;
                    } else {
                        obj5 = ep60Var4.b(xdxVar, cVar);
                    }
                    uhc0Var = (uhc0) obj5;
                    break;
                case 11:
                    map = (Map) cVar.d(ju00.a).b(xdxVar, cVar);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(bfx bfxVar, c cVar, yhc0 yhc0Var) {
        bfxVar.A1("plaqueId");
        foe foeVar = l80.a;
        bfxVar.r0(yhc0Var.a);
        bfxVar.A1("priority");
        l80.b.a(bfxVar, cVar, Integer.valueOf(yhc0Var.b));
        bfxVar.A1("widgetsLevelIds");
        om60 om60Var = l80.i;
        ArrayList arrayList = yhc0Var.c;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            om60Var.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("contentDescription");
        ep60 ep60Var = new ep60(cnc0.a, true);
        qhc0 qhc0Var = yhc0Var.d;
        if (qhc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, qhc0Var);
        }
        bfxVar.A1("condition");
        bnc0 bnc0Var = bnc0.a;
        ohc0 ohc0Var = yhc0Var.e;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            bnc0Var.a(bfxVar, cVar, ohc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            bnc0Var.a(ek00Var2, cVar, ohc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("displayRules");
        dnc0 dnc0Var = dnc0.a;
        shc0 shc0Var = yhc0Var.f;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            dnc0Var.a(bfxVar, cVar, shc0Var);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            dnc0Var.a(ek00Var4, cVar, shc0Var);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("strictAction");
        ep60 ep60Var2 = new ep60(inc0.a, true);
        whc0 whc0Var = yhc0Var.g;
        if (whc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, whc0Var);
        }
        bfxVar.A1("metricContext");
        ep60 ep60Var3 = new ep60(enc0.a, true);
        thc0 thc0Var = yhc0Var.h;
        if (thc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var3.a(bfxVar, cVar, thc0Var);
        }
        bfxVar.A1("params");
        ep60 a2 = l80.a(gnc0.a);
        vhc0 vhc0Var = yhc0Var.i;
        if (vhc0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, vhc0Var);
        }
        bfxVar.A1("seenContext");
        om60Var.a(bfxVar, cVar, yhc0Var.j);
        bfxVar.A1("notification");
        ep60 ep60Var4 = new ep60(fnc0.a, true);
        uhc0 uhc0Var = yhc0Var.k;
        if (uhc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var4.a(bfxVar, cVar, uhc0Var);
        }
        bfxVar.A1("serviceMeta");
        cVar.d(ju00.a).a(bfxVar, cVar, yhc0Var.l);
    }
}
