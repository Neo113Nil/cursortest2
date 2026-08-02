package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class nuc0 implements b70 {
    public static final List a = scc.g("widgetsLevelId", "contentDescription", "elements", "displayRules", "strictAction");

    public static juc0 c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        String str = null;
        fuc0 fuc0Var = null;
        ArrayList arrayList = null;
        guc0 guc0Var = null;
        iuc0 iuc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                kuc0 kuc0Var = kuc0.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(kuc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = ep60Var.b(xdxVar, cVar);
                }
                fuc0Var = (fuc0) obj2;
            } else if (h2 == 2) {
                muc0 muc0Var = muc0.a;
                foe foeVar3 = l80.a;
                ep60 ep60Var2 = new ep60(muc0Var, true);
                xdxVar.l();
                ArrayList arrayList2 = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList2.add(ep60Var2.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = arrayList2;
            } else if (h2 == 3) {
                luc0 luc0Var = luc0.a;
                foe foeVar4 = l80.a;
                guc0Var = (guc0) new ep60(luc0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 4) {
                    return new juc0(str, fuc0Var, arrayList, guc0Var, iuc0Var);
                }
                ouc0 ouc0Var = ouc0.a;
                foe foeVar5 = l80.a;
                ep60 ep60Var3 = new ep60(ouc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = ep60Var3.b(xdxVar, cVar);
                }
                iuc0Var = (iuc0) obj;
            }
        }
    }
}
