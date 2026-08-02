package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class end implements b70 {
    public static final end a = new end();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jmd jmdVar = (jmd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(jmdVar.a);
        List list = bm0.a;
        am0 am0Var = jmdVar.b;
        bfxVar.A1("additionalText");
        foe foeVar2 = l80.a;
        bfxVar.r0(am0Var.a);
        bfxVar.A1("benefits");
        ep60 a2 = l80.a(cm0.a);
        ArrayList arrayList = am0Var.b;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
        bfxVar.A1("disclaimer");
        l80.i.a(bfxVar, cVar, am0Var.c);
        bfxVar.A1("iconImages");
        cVar.d(ju00.a).a(bfxVar, cVar, am0Var.d);
        bfxVar.A1("isAvailable");
        foe foeVar3 = l80.f;
        foeVar3.a(bfxVar, cVar, Boolean.valueOf(am0Var.e));
        bfxVar.A1("isSelected");
        foeVar3.a(bfxVar, cVar, Boolean.valueOf(am0Var.f));
        bfxVar.A1("offerName");
        wkf wkfVar = rs60.a;
        cVar.d(wkfVar).a(bfxVar, cVar, am0Var.g);
        bfxVar.A1("offersBatchId");
        bfxVar.r0(am0Var.h);
        bfxVar.A1("offersToReplace");
        b70 d = cVar.d(wkfVar);
        ArrayList arrayList2 = am0Var.i;
        bfxVar.l();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            d.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("positionId");
        bfxVar.r0(am0Var.j);
        bfxVar.A1("text");
        bfxVar.r0(am0Var.k);
        bfxVar.A1("title");
        bfxVar.r0(am0Var.l);
        bfxVar.A1("upsaleStep");
        bfxVar.r0(am0Var.m.getRawValue());
        bfxVar.A1("upsaleType");
        bfxVar.r0(am0Var.n.getRawValue());
        bfxVar.A1("offerSwitchToggle");
        ep60 a3 = l80.a(dm0.a);
        yl0 yl0Var = am0Var.o;
        if (yl0Var == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, yl0Var);
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
        return new jmd(str, bm0.c(xdxVar, cVar));
    }
}
