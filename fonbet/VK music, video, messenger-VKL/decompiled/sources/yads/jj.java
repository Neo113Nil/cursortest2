package yads;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class jj {
    public final z41 a;

    public /* synthetic */ jj() {
        this(new z41());
    }

    public final ArrayList a(List list, Map map) {
        po1 po1Var;
        List list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.c;
            String str = oiVar.b;
            if ("image".equals(str) && (obj instanceof x41)) {
                this.a.getClass();
                if (z41.a((x41) obj, map)) {
                    arrayList.add(oiVar);
                }
            } else if (X3.i.I0.equals(str) && (obj instanceof po1) && (list2 = (po1Var = (po1) obj).c) != null) {
                x41 x41Var = list2 != null ? (x41) j5g.a0(list2) : null;
                we3 we3Var = po1Var.b;
                pk1 pk1Var = po1Var.a;
                if (we3Var == null && pk1Var == null) {
                    if (x41Var != null) {
                        this.a.getClass();
                        if (z41.a(x41Var, map)) {
                        }
                    }
                }
                arrayList.add(oiVar);
            } else {
                arrayList.add(oiVar);
            }
        }
        return arrayList;
    }

    public jj(z41 z41Var) {
        this.a = z41Var;
    }
}
