package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes6.dex */
public final class aym0 extends q6e {
    public final /* synthetic */ int c = 0;
    public boolean d;
    public final Object e;
    public Object f;

    public aym0(b bVar, r7p0 r7p0Var) {
        super("scooters", new c(kotlin.collections.b.f()));
        this.e = bVar;
        this.f = r7p0Var;
        this.d = true;
    }

    @Override // defpackage.q6e, defpackage.un0
    public final c a(c cVar) {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                kdx kdxVar = new kdx();
                abb1.c(kdxVar, "pin_destination_selection", Boolean.TRUE);
                if (this.d) {
                    this.d = false;
                    b bVar = (b) obj;
                    if (bVar != null) {
                        kdxVar.b("destination", bVar);
                    }
                    if (((r7p0) this.f) != null) {
                        g8m0 g8m0Var = new g8m0(22, this);
                        kdx kdxVar2 = new kdx();
                        g8m0Var.invoke(kdxVar2);
                        kdxVar.b("polygons_selected_vehicle", kdxVar2.a());
                    }
                }
                return new c(kotlin.collections.b.o(cVar, new Pair("scooters", kdxVar.a())));
            default:
                boolean z = this.d;
                c cVar2 = (c) this.f;
                String str = this.a;
                if (z) {
                    c cVar3 = new c(kotlin.collections.b.o(cVar, new Pair(str, cVar2)));
                    this.d = false;
                    return cVar3;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(qcx.m(cVar2));
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove((String) it.next());
                }
                c cVar4 = new c(linkedHashMap);
                this.f = cVar4;
                return new c(kotlin.collections.b.o(cVar, new Pair(str, cVar4)));
        }
    }

    public aym0(c cVar, List list) {
        super("scooters", cVar);
        this.e = list;
        this.f = cVar;
        this.d = true;
    }
}
