package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class esc0 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static zrc0 c(xdx xdxVar, c cVar) {
        yrc0 yrc0Var;
        xrc0 xrc0Var;
        wrc0 wrc0Var;
        j70 j70Var = cVar.a;
        vrc0 vrc0Var = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("TaxiATTextProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            yrc0Var = dsc0.c(xdxVar, cVar);
        } else {
            yrc0Var = null;
        }
        if (a.a(a.b("TaxiATLinkProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            xrc0Var = csc0.c(xdxVar, cVar);
        } else {
            xrc0Var = null;
        }
        if (a.a(a.b("TaxiATImageProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            wrc0Var = bsc0.c(xdxVar, cVar);
        } else {
            wrc0Var = null;
        }
        if (a.a(a.b("TaxiATContainer"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            vrc0Var = asc0.c(xdxVar, cVar);
        }
        return new zrc0(str, yrc0Var, xrc0Var, wrc0Var, vrc0Var);
    }

    public static void d(bfx bfxVar, c cVar, zrc0 zrc0Var) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(zrc0Var.a);
        yrc0 yrc0Var = zrc0Var.b;
        if (yrc0Var != null) {
            List list = dsc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(yrc0Var.a);
            List list2 = nrc0.a;
            nrc0.d(bfxVar, cVar, yrc0Var.b);
        }
        xrc0 xrc0Var = zrc0Var.c;
        if (xrc0Var != null) {
            List list3 = csc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(xrc0Var.a);
            List list4 = ync0.a;
            ync0.d(bfxVar, cVar, xrc0Var.b);
        }
        wrc0 wrc0Var = zrc0Var.d;
        if (wrc0Var != null) {
            List list5 = bsc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(wrc0Var.a);
            List list6 = anc0.a;
            anc0.d(bfxVar, cVar, wrc0Var.b);
        }
        vrc0 vrc0Var = zrc0Var.e;
        if (vrc0Var != null) {
            List list7 = asc0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(vrc0Var.a);
            List list8 = okc0.a;
            jkc0 jkc0Var = vrc0Var.b;
            bfxVar.A1("metaColor");
            l80.i.a(bfxVar, cVar, jkc0Var.a);
            bfxVar.A1("items");
            ep60 ep60Var = new ep60(nkc0.a, true);
            ArrayList arrayList = jkc0Var.b;
            bfxVar.l();
            for (Object obj : arrayList) {
                if (obj == null) {
                    bfxVar.k2();
                } else {
                    ep60Var.a(bfxVar, cVar, obj);
                }
            }
            bfxVar.j();
        }
    }
}
