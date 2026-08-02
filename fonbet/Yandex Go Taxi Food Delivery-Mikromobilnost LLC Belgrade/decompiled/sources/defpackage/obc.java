package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class obc implements b70 {
    public static final obc a = new obc();
    public static final List b = scc.g("webViewUrl", "skipText", "alreadyCollected");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        lbc lbcVar = (lbc) obj;
        bfxVar.A1("webViewUrl");
        foe foeVar = l80.a;
        bfxVar.r0(lbcVar.a);
        bfxVar.A1("skipText");
        bfxVar.r0(lbcVar.b);
        bfxVar.A1("alreadyCollected");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(lbcVar.c));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        Boolean bool = null;
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
                    return new lbc(str, str2, bool.booleanValue());
                }
                bool = (Boolean) l80.f.b(xdxVar, cVar);
            }
        }
    }
}
