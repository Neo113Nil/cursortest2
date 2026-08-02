package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class eqc0 implements b70 {
    public static final eqc0 a = new eqc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bqc0 bqc0Var = (bqc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(bqc0Var.a);
        List list = vlc0.a;
        klc0 klc0Var = bqc0Var.b;
        bfxVar.A1("widgets");
        xlc0 xlc0Var = xlc0.a;
        foe foeVar2 = l80.a;
        ArrayList arrayList = klc0Var.a;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                xlc0Var.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                xlc0Var.a(ek00Var, cVar, obj2);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("widgetGroups");
        lqy lqyVar = new lqy(new ep60(ylc0.a, true));
        List list2 = klc0Var.b;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list2);
        }
        bfxVar.A1("widgetsLevels");
        zlc0 zlc0Var = zlc0.a;
        ArrayList arrayList2 = klc0Var.c;
        bfxVar.l();
        for (Object obj3 : arrayList2) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                zlc0Var.a(bfxVar, cVar, obj3);
                bfxVar.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                zlc0Var.a(ek00Var2, cVar, obj3);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("plaques");
        ulc0 ulc0Var = ulc0.a;
        ArrayList arrayList3 = klc0Var.d;
        bfxVar.l();
        for (Object obj4 : arrayList3) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                ulc0Var.a(bfxVar, cVar, obj4);
                bfxVar.y();
            } else {
                ek00 ek00Var3 = new ek00();
                ek00Var3.u();
                ulc0Var.a(ek00Var3, cVar, obj4);
                ek00Var3.y();
                uga1.f(bfxVar, ek00Var3.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("prefetchPlaqueList");
        wlc0 wlc0Var = wlc0.a;
        ArrayList arrayList4 = klc0Var.e;
        bfxVar.l();
        for (Object obj5 : arrayList4) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                wlc0Var.a(bfxVar, cVar, obj5);
                bfxVar.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                wlc0Var.a(ek00Var4, cVar, obj5);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("defaultPlaqueList");
        slc0 slc0Var = slc0.a;
        ArrayList arrayList5 = klc0Var.f;
        bfxVar.l();
        for (Object obj6 : arrayList5) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                slc0Var.a(bfxVar, cVar, obj6);
                bfxVar.y();
            } else {
                ek00 ek00Var5 = new ek00();
                ek00Var5.u();
                slc0Var.a(ek00Var5, cVar, obj6);
                ek00Var5.y();
                uga1.f(bfxVar, ek00Var5.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("fallbackPlaqueList");
        tlc0 tlc0Var = tlc0.a;
        ArrayList arrayList6 = klc0Var.g;
        bfxVar.l();
        for (Object obj7 : arrayList6) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                tlc0Var.a(bfxVar, cVar, obj7);
                bfxVar.y();
            } else {
                ek00 ek00Var6 = new ek00();
                ek00Var6.u();
                tlc0Var.a(ek00Var6, cVar, obj7);
                ek00Var6.y();
                uga1.f(bfxVar, ek00Var6.c());
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
        return new bqc0(str, vlc0.c(xdxVar, cVar));
    }
}
