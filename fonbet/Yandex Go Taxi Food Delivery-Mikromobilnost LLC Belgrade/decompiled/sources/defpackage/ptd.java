package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ptd implements b70 {
    public static final ptd a = new ptd();
    public static final List b = scc.g("offersBatchIdUpsale", "eventSessionId", "upsales");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        htd htdVar = (htd) obj;
        bfxVar.A1("offersBatchIdUpsale");
        foe foeVar = l80.a;
        bfxVar.r0(htdVar.a);
        bfxVar.A1("eventSessionId");
        bfxVar.r0(htdVar.b);
        bfxVar.A1("upsales");
        ep60 a2 = l80.a(otd.a);
        ArrayList arrayList = htdVar.c;
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
                    return new htd(str, str2, arrayList);
                }
                ep60 a2 = l80.a(otd.a);
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
