package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cnd implements b70 {
    public static final cnd a = new cnd();
    public static final List b = scc.g("groupTitle", "groupButtons");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        hmd hmdVar = (hmd) obj;
        bfxVar.A1("groupTitle");
        foe foeVar = l80.a;
        bfxVar.r0(hmdVar.a);
        bfxVar.A1("groupButtons");
        om60 om60Var = l80.i;
        ArrayList arrayList = hmdVar.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            om60Var.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new hmd(str, arrayList);
                }
                om60 om60Var = l80.i;
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(om60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
