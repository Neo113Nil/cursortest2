package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class n2u implements b70 {
    public static final n2u a = new n2u();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        h2u h2uVar = (h2u) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(h2uVar.a);
        List list = k351.a;
        g351 g351Var = h2uVar.b;
        bfxVar.A1("__typename");
        foe foeVar2 = l80.a;
        bfxVar.r0(g351Var.a);
        d351 d351Var = g351Var.b;
        if (d351Var != null) {
            List list2 = h351.a;
            bfxVar.A1("__typename");
            bfxVar.r0(d351Var.a);
        }
        e351 e351Var = g351Var.c;
        if (e351Var != null) {
            List list3 = i351.a;
            bfxVar.A1("__typename");
            bfxVar.r0(e351Var.a);
        }
        f351 f351Var = g351Var.d;
        if (f351Var != null) {
            List list4 = j351.a;
            bfxVar.A1("fix");
            l80.b.a(bfxVar, cVar, Integer.valueOf(f351Var.a));
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new h2u(str, k351.c(xdxVar, cVar));
    }
}
