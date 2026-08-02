package yads;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class os1 {
    public final ps1 a;

    public os1(ps1 ps1Var) {
        this.a = ps1Var;
    }

    public final ArrayList a(List list) {
        is1 is1Var;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g80 g80Var = (g80) it.next();
            List<String> list2 = g80Var.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (String str : list2) {
                List b0 = drm0.b0(str, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
                String str2 = (String) j5g.b0(e43.h(b0) - 1, b0);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new pr1(str2, str));
            }
            String str3 = g80Var.b;
            String str4 = g80Var.a;
            if (str4 != null) {
                is1.c.getClass();
                is1Var = (is1) is1.d.get(str4);
                if (is1Var == null) {
                    is1Var = is1.x;
                }
            } else {
                is1Var = is1.x;
            }
            arrayList.add(new qr1(str3, is1Var, arrayList2));
        }
        return this.a.a(arrayList);
    }
}
