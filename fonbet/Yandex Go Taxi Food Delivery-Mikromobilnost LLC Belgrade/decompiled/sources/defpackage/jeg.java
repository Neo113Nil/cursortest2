package defpackage;

import com.apollographql.apollo3.api.c;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class jeg implements b70 {
    public static final jeg a = new jeg();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        geg gegVar = (geg) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(gegVar.a);
        List list = xeg.a;
        reg regVar = gegVar.b;
        bfxVar.A1("textStyle");
        ep60 a2 = l80.a(zeg.a);
        qeg qegVar = regVar.a;
        if (qegVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, qegVar);
        }
        bfxVar.A1(C0553n3.g);
        ep60 a3 = l80.a(teg.a);
        leg legVar = regVar.b;
        if (legVar == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, legVar);
        }
        bfxVar.A1("commonOverlays");
        lqy lqyVar = new lqy(new ep60(weg.a, true));
        List list2 = regVar.c;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list2);
        }
        bfxVar.A1("actions");
        seg segVar = seg.a;
        ArrayList arrayList = regVar.d;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                segVar.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                segVar.a(ek00Var, cVar, obj2);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new geg(str, xeg.c(xdxVar, cVar));
    }
}
