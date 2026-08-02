package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oec implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static jec c(xdx xdxVar, c cVar) {
        gec gecVar;
        dec decVar;
        eec eecVar;
        j70 j70Var = cVar.a;
        fec fecVar = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("CheckoutRgbaColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list = tec.a;
            String str2 = null;
            while (xdxVar.h2(tec.a) == 0) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
            gecVar = new gec(str2);
        } else {
            gecVar = null;
        }
        if (a.a(a.b("CheckoutDesignColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            decVar = qec.c(xdxVar, cVar);
        } else {
            decVar = null;
        }
        if (a.a(a.b("CheckoutLinearGradientColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            eecVar = rec.c(xdxVar, cVar);
        } else {
            eecVar = null;
        }
        if (a.a(a.b("CheckoutRadialGradientColor"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            fecVar = sec.c(xdxVar, cVar);
        }
        return new jec(str, gecVar, decVar, eecVar, fecVar);
    }

    public static void d(bfx bfxVar, c cVar, jec jecVar) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(jecVar.a);
        gec gecVar = jecVar.b;
        if (gecVar != null) {
            List list = tec.a;
            bfxVar.A1("rgba");
            bfxVar.r0(gecVar.a);
        }
        dec decVar = jecVar.c;
        if (decVar != null) {
            qec.d(bfxVar, cVar, decVar);
        }
        eec eecVar = jecVar.d;
        if (eecVar != null) {
            rec.d(bfxVar, cVar, eecVar);
        }
        fec fecVar = jecVar.e;
        if (fecVar != null) {
            sec.d(bfxVar, cVar, fecVar);
        }
    }
}
