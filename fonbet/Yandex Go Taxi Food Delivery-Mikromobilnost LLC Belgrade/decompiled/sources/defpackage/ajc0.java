package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajc0 implements b70 {
    public static final ajc0 a = new ajc0();
    public static final List b = Collections.singletonList("items");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("items");
        xic0 xic0Var = xic0.a;
        foe foeVar = l80.a;
        ep60 ep60Var = new ep60(xic0Var, true);
        ArrayList arrayList = ((sic0) obj).a;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                ep60Var.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        ArrayList arrayList = null;
        while (xdxVar.h2(b) == 0) {
            xic0 xic0Var = xic0.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(xic0Var, true);
            arrayList = oyr.z(xdxVar);
            while (xdxVar.hasNext()) {
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                arrayList.add(b2);
            }
            xdxVar.j();
        }
        return new sic0(arrayList);
    }
}
