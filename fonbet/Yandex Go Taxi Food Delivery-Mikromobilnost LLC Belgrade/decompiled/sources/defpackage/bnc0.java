package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class bnc0 implements b70 {
    public static final bnc0 a = new bnc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ohc0 ohc0Var = (ohc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(ohc0Var.a);
        List list = rpc0.a;
        ppc0 ppc0Var = ohc0Var.b;
        bfxVar.A1("rootNodeId");
        l80.b.a(bfxVar, cVar, Integer.valueOf(ppc0Var.a));
        bfxVar.A1("nodes");
        ep60 ep60Var = new ep60(qpc0.a, true);
        ArrayList arrayList = ppc0Var.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ep60Var.a(bfxVar, cVar, it.next());
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
        return new ohc0(str, rpc0.c(xdxVar, cVar));
    }
}
