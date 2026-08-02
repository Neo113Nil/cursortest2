package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hu60 implements b70 {
    public static final hu60 a = new hu60();
    public static final List b = scc.g("batchPositionId", "eventSessionId", "offers");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        du60 du60Var = (du60) obj;
        bfxVar.A1("batchPositionId");
        foe foeVar = l80.a;
        bfxVar.r0(du60Var.a);
        bfxVar.A1("eventSessionId");
        bfxVar.r0(du60Var.b);
        bfxVar.A1("offers");
        iu60 iu60Var = iu60.a;
        ArrayList arrayList = du60Var.c;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                iu60Var.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                iu60Var.a(ek00Var, cVar, obj2);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new du60(str, str2, arrayList);
                }
                iu60 iu60Var = iu60.a;
                foe foeVar3 = l80.a;
                ep60 ep60Var = new ep60(iu60Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            }
        }
    }
}
