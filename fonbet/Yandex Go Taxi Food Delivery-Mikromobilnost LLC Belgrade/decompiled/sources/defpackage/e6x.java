package defpackage;

import com.yandex.go.flex.common.actions.dto.JasonStateNodeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final class e6x {
    public static hdu a(JasonStateNodeDto jasonStateNodeDto) {
        r5x r5xVar;
        o5x p5xVar;
        if (jasonStateNodeDto != null) {
            List list = jasonStateNodeDto.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r5xVar = new r5x(arrayList);
                    break;
                }
                d dVar = (d) it.next();
                if (!dVar.b()) {
                    Integer k = qcx.k(dVar);
                    if (k == null) {
                        r5xVar = null;
                        break;
                    }
                    p5xVar = new p5x(k.intValue());
                } else {
                    p5xVar = new q5x(dVar.a());
                }
                arrayList.add(p5xVar);
            }
            if (r5xVar != null) {
                Map b = b(jasonStateNodeDto.b);
                s6x s6xVar = b == null ? null : new s6x(b);
                if (s6xVar != null) {
                    return new hdu(r5xVar, s6xVar);
                }
            }
        }
        return null;
    }

    public static Map b(c cVar) {
        Set<Map.Entry> entrySet = cVar.a.entrySet();
        hz40 hz40Var = new hz40(entrySet.size());
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            if (bVar instanceof c) {
                Map b = b((c) bVar);
                if (b == null) {
                    return null;
                }
                hz40Var.o(str, new r6x(b));
            } else {
                if (!(bVar instanceof d)) {
                    return null;
                }
                d dVar = (d) bVar;
                if (!dVar.b()) {
                    return null;
                }
                hz40Var.o(str, new p6x(dVar.a()));
            }
        }
        du00 du00Var = hz40Var.f;
        if (du00Var != null) {
            return du00Var;
        }
        du00 du00Var2 = new du00(hz40Var);
        hz40Var.f = du00Var2;
        return du00Var2;
    }
}
