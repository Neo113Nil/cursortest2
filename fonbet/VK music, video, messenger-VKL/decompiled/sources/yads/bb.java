package yads;

import java.util.ArrayList;
import xsna.drm0;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class bb {
    public static String a(ab abVar) {
        ArrayList arrayList = new ArrayList();
        if (!drm0.N(abVar.a())) {
            arrayList.add(abVar.a());
        }
        if (!drm0.N(abVar.b())) {
            arrayList.add("erid: " + abVar.b());
        }
        return j5g.g0(arrayList, " · ", null, null, 0, null, 62);
    }
}
