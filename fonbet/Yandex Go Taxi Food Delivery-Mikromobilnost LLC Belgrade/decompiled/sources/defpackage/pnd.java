package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public final class pnd implements b70 {
    public static final pnd a = new pnd();
    public static final List b = scc.g("lightTheme", "darkTheme", "widgetPollingParameters");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        umd umdVar = (umd) obj;
        bfxVar.A1("lightTheme");
        foe foeVar = l80.a;
        bfxVar.r0(umdVar.a);
        bfxVar.A1("darkTheme");
        bfxVar.r0(umdVar.b);
        bfxVar.A1("widgetPollingParameters");
        ep60 a2 = l80.a(qnd.a);
        vmd vmdVar = umdVar.c;
        if (vmdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, vmdVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        vmd vmdVar = null;
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
                    return new umd(str, str2, vmdVar);
                }
                ep60 a2 = l80.a(qnd.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                vmdVar = (vmd) b2;
            }
        }
    }
}
