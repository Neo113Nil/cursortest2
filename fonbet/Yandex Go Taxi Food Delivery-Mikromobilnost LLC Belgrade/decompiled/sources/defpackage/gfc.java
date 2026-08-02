package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gfc implements b70 {
    public static final gfc a = new gfc();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        afc afcVar = (afc) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(afcVar.a);
        yec yecVar = afcVar.b;
        if (yecVar != null) {
            efc.d(bfxVar, cVar, yecVar);
        }
        zec zecVar = afcVar.c;
        if (zecVar != null) {
            List list = ffc.a;
            bfxVar.A1("__typename");
            bfxVar.r0(zecVar.a);
            List list2 = wfu.a;
            wfu.d(bfxVar, cVar, zecVar.b);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        yec yecVar;
        j70 j70Var = cVar.a;
        zec zecVar = null;
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("GradientColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            yecVar = efc.c(xdxVar, cVar);
        } else {
            yecVar = null;
        }
        if (a.a(a.b("HexColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            zecVar = ffc.c(xdxVar, cVar);
        }
        return new afc(str, yecVar, zecVar);
    }
}
