package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class oro implements b70 {
    public static final oro a = new oro();
    public static final List b = scc.g("flags", "testId");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        kro kroVar = (kro) obj;
        bfxVar.A1("flags");
        foe foeVar = l80.a;
        ArrayList arrayList = kroVar.a;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            foeVar.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("testId");
        cVar.d(mlz.a).a(bfxVar, cVar, Long.valueOf(kroVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        Long l = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                arrayList = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    arrayList.add(xdxVar.nextString());
                }
                xdxVar.j();
            } else {
                if (h2 != 1) {
                    return new kro(l.longValue(), arrayList);
                }
                l = (Long) cVar.d(mlz.a).b(xdxVar, cVar);
            }
        }
    }
}
