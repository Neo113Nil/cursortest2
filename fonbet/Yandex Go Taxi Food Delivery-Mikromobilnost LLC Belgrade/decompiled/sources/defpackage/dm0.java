package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class dm0 implements b70 {
    public static final dm0 a = new dm0();
    public static final List b = scc.g("text", "badgeText");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        yl0 yl0Var = (yl0) obj;
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(yl0Var.a);
        bfxVar.A1("badgeText");
        l80.i.a(bfxVar, cVar, yl0Var.b);
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
                    return new yl0(str, str2);
                }
                str2 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
