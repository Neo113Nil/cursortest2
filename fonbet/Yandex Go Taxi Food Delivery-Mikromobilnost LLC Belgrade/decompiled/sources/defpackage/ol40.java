package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ol40 {
    public static edc a(String str) {
        List Y = evu0.Y(str, new char[]{';'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            ycc.r(evu0.Y((String) it.next(), new char[]{':'}, 0, 6), arrayList);
        }
        if (arrayList.size() != 1) {
            if (arrayList.size() == 2 && jl40.l(arrayList.get(0), "l")) {
                xby.d.k(new IllegalStateException(), "MultiHexConverter: Wrong format: '" + str + "'");
                return null;
            }
            if (arrayList.size() < 4 || !jl40.l(arrayList.get(0), "l") || !jl40.l(arrayList.get(2), "d")) {
                xby.d.k(new IllegalStateException(), "MultiHexConverter: Wrong format: '" + str + "'");
                return null;
            }
            Integer S = q5z.S((String) arrayList.get(1));
            cdc cdcVar = S != null ? new cdc(S.intValue()) : null;
            if (cdcVar != null) {
                Integer S2 = q5z.S((String) arrayList.get(3));
                cdc cdcVar2 = S2 != null ? new cdc(S2.intValue()) : null;
                if (cdcVar2 != null) {
                    return new edc(cdcVar.a, cdcVar2.a);
                }
            }
        }
        return null;
    }
}
