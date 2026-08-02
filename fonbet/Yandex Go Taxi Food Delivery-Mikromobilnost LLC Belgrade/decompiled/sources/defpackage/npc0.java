package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.UNIFYING_PREDICATE_TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class npc0 implements b70 {
    public static final npc0 a = new npc0();
    public static final List b = scc.g("type", "nodeIds");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        epc0 epc0Var = (epc0) obj;
        bfxVar.A1("type");
        bfxVar.r0(epc0Var.a.getRawValue());
        bfxVar.A1("nodeIds");
        foe foeVar = l80.b;
        ArrayList arrayList = epc0Var.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            foeVar.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        UNIFYING_PREDICATE_TYPE unifying_predicate_type;
        UNIFYING_PREDICATE_TYPE unifying_predicate_type2 = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                UNIFYING_PREDICATE_TYPE.Companion.getClass();
                UNIFYING_PREDICATE_TYPE[] values = UNIFYING_PREDICATE_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        unifying_predicate_type = null;
                        break;
                    }
                    unifying_predicate_type = values[i];
                    if (jl40.l(unifying_predicate_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                unifying_predicate_type2 = unifying_predicate_type == null ? UNIFYING_PREDICATE_TYPE.UNKNOWN__ : unifying_predicate_type;
            } else {
                if (h2 != 1) {
                    return new epc0(unifying_predicate_type2, arrayList);
                }
                foe foeVar = l80.b;
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(foeVar.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
