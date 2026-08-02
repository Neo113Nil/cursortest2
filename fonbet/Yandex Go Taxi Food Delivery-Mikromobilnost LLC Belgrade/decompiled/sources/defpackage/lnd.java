package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class lnd implements b70 {
    public static final lnd a = new lnd();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        qmd qmdVar = (qmd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(qmdVar.a);
        mmd mmdVar = qmdVar.b;
        if (mmdVar != null) {
            List list = hnd.a;
            bfxVar.A1("__typename");
            bfxVar.r0(mmdVar.a);
            List list2 = p5a0.a;
            p5a0.d(bfxVar, cVar, mmdVar.b);
        }
        nmd nmdVar = qmdVar.c;
        if (nmdVar != null) {
            List list3 = ind.a;
            bfxVar.A1("__typename");
            bfxVar.r0(nmdVar.a);
            List list4 = p5a0.a;
            p5a0.d(bfxVar, cVar, nmdVar.b);
        }
        lmd lmdVar = qmdVar.d;
        if (lmdVar != null) {
            gnd.d(bfxVar, cVar, lmdVar);
        }
        pmd pmdVar = qmdVar.e;
        if (pmdVar != null) {
            List list5 = knd.a;
            bfxVar.A1("__typename");
            bfxVar.r0(pmdVar.a);
            List list6 = p5a0.a;
            p5a0.d(bfxVar, cVar, pmdVar.b);
        }
        omd omdVar = qmdVar.f;
        if (omdVar != null) {
            jnd.d(bfxVar, cVar, omdVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        mmd mmdVar;
        nmd nmdVar;
        lmd lmdVar;
        pmd pmdVar;
        j70 j70Var = cVar.a;
        omd omdVar = null;
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("NewCardPaymentButton"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            mmdVar = hnd.c(xdxVar, cVar);
        } else {
            mmdVar = null;
        }
        if (a.a(a.b("NewSbpPaymentButton"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            nmdVar = ind.c(xdxVar, cVar);
        } else {
            nmdVar = null;
        }
        if (a.a(a.b("CardPaymentButton"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            lmdVar = gnd.c(xdxVar, cVar);
        } else {
            lmdVar = null;
        }
        if (a.a(a.b("SbpPaymentButton"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            pmdVar = knd.c(xdxVar, cVar);
        } else {
            pmdVar = null;
        }
        if (a.a(a.b("NewYBPaymentButton"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            omdVar = jnd.c(xdxVar, cVar);
        }
        return new qmd(str, mmdVar, nmdVar, lmdVar, pmdVar, omdVar);
    }
}
