package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class nkc0 implements b70 {
    public static final nkc0 a = new nkc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ikc0 ikc0Var = (ikc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(ikc0Var.a);
        List list = zpc0.a;
        vpc0 vpc0Var = ikc0Var.b;
        bfxVar.A1("__typename");
        foe foeVar2 = l80.a;
        bfxVar.r0(vpc0Var.a);
        upc0 upc0Var = vpc0Var.b;
        if (upc0Var != null) {
            List list2 = ypc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(upc0Var.a);
            List list3 = nrc0.a;
            nrc0.d(bfxVar, cVar, upc0Var.b);
        }
        tpc0 tpc0Var = vpc0Var.c;
        if (tpc0Var != null) {
            List list4 = xpc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(tpc0Var.a);
            List list5 = ync0.a;
            ync0.d(bfxVar, cVar, tpc0Var.b);
        }
        spc0 spc0Var = vpc0Var.d;
        if (spc0Var != null) {
            List list6 = wpc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(spc0Var.a);
            List list7 = anc0.a;
            anc0.d(bfxVar, cVar, spc0Var.b);
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
        return new ikc0(str, zpc0.c(xdxVar, cVar));
    }
}
