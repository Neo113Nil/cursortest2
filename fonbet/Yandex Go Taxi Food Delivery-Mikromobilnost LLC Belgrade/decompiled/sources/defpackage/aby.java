package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public final class aby implements b70 {
    public static final aby a = new aby();
    public static final List b = scc.g("text", "link");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        way wayVar = (way) obj;
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(wayVar.a);
        bfxVar.A1("link");
        b70 d = cVar.d(mr11.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        String str = wayVar.b;
        if (str == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, str);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new way(str, str2);
                }
                b70 d = cVar.d(mr11.a);
                foe foeVar2 = l80.a;
                if (d instanceof om60) {
                    ny61.r("The adapter is already nullable");
                    return null;
                }
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = d.b(xdxVar, cVar);
                }
                str2 = (String) b2;
            }
        }
    }
}
