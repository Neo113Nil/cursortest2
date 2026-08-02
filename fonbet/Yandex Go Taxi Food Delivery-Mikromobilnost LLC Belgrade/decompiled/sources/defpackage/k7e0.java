package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k7e0 implements b70 {
    public static final List a = scc.g("name", "id", "popups");

    public static d7e0 c(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new d7e0(str, str2, arrayList);
                }
                ep60 a2 = l80.a(j7e0.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(a2.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
