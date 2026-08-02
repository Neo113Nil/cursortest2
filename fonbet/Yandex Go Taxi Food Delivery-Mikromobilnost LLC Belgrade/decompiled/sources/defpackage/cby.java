package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cby implements b70 {
    public static final List a = scc.g("text", "items");

    public static yay c(xdx xdxVar, c cVar) {
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new yay(str, arrayList);
                }
                ep60 a2 = l80.a(bby.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(a2.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, yay yayVar) {
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(yayVar.a);
        bfxVar.A1("items");
        ep60 a2 = l80.a(bby.a);
        ArrayList arrayList = yayVar.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }
}
