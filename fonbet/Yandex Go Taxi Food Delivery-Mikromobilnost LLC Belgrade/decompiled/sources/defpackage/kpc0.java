package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes8.dex */
public final class kpc0 implements b70 {
    public static final kpc0 a = new kpc0();
    public static final List b = scc.g("argName", "intSet", "stringSet");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        cpc0 cpc0Var = (cpc0) obj;
        bfxVar.A1("argName");
        foe foeVar = l80.a;
        bfxVar.r0(cpc0Var.a());
        bfxVar.A1("intSet");
        lqy lqyVar = new lqy(l80.b);
        List b2 = cpc0Var.b();
        if (b2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, b2);
        }
        bfxVar.A1("stringSet");
        lqy lqyVar2 = new lqy(foeVar);
        List c = cpc0Var.c();
        if (c == null) {
            bfxVar.k2();
        } else {
            lqyVar2.a(bfxVar, cVar, c);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        Object b3;
        String str = null;
        List list = null;
        List list2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                lqy lqyVar = new lqy(l80.b);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b3 = null;
                } else {
                    b3 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b3;
            } else {
                if (h2 != 2) {
                    return new cpc0(str, list, list2);
                }
                lqy lqyVar2 = new lqy(l80.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = lqyVar2.b(xdxVar, cVar);
                }
                list2 = (List) b2;
            }
        }
    }
}
