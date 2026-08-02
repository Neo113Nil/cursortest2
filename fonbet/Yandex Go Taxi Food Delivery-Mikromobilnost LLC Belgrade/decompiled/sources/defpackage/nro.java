package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class nro implements b70 {
    public static final nro a = new nro();
    public static final List b = scc.g("testIds", "triggeredTestIds", "triggeredExperimentSet");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jro jroVar = (jro) obj;
        bfxVar.A1("testIds");
        foe foeVar = l80.a;
        bfxVar.r0(jroVar.a);
        bfxVar.A1("triggeredTestIds");
        bfxVar.r0(jroVar.b);
        bfxVar.A1("triggeredExperimentSet");
        ep60 a2 = l80.a(oro.a);
        ArrayList arrayList = jroVar.c;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new jro(str, str2, arrayList);
                }
                ep60 a2 = l80.a(oro.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b2 = null;
                    } else {
                        b2 = a2.b(xdxVar, cVar);
                    }
                    z.add(b2);
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
