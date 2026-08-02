package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k300 implements b70 {
    public static final k300 a = new k300();
    public static final List b = scc.g("text", "parts");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        d300 d300Var = (d300) obj;
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(d300Var.a);
        bfxVar.A1("parts");
        ep60 ep60Var = new ep60(j300.a, true);
        ArrayList arrayList = d300Var.b;
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
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new d300(str, arrayList);
                }
                j300 j300Var = j300.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(j300Var, true);
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
        }
    }
}
