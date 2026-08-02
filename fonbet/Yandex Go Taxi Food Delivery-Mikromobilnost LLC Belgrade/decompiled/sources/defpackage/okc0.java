package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class okc0 implements b70 {
    public static final List a = scc.g("metaColor", "items");

    public static jkc0 c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new jkc0(str, arrayList);
                }
                nkc0 nkc0Var = nkc0.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(nkc0Var, true);
                arrayList = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b = null;
                    } else {
                        b = ep60Var.b(xdxVar, cVar);
                    }
                    arrayList.add(b);
                }
                xdxVar.j();
            }
        }
    }
}
