package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class fnd implements b70 {
    public static final fnd a = new fnd();
    public static final List b = scc.g("text", "badgeText");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        kmd kmdVar = (kmd) obj;
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(kmdVar.a);
        bfxVar.A1("badgeText");
        l80.i.a(bfxVar, cVar, kmdVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new kmd(str, str2);
                }
                str2 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
