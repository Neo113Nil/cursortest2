package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class jfe implements lfe {
    public final Map a;
    public final boolean b;
    public final List c;
    public final LinkedHashMap d = new LinkedHashMap();

    public jfe(Map map, List list, boolean z) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    @Override // defpackage.lfe
    public final void dispose(l1o l1oVar, see seeVar) {
        this.d.remove(new hfe(l1oVar, qoi0.a(seeVar.getClass())));
    }

    @Override // defpackage.lfe
    public final gfe get(l1o l1oVar, see seeVar) {
        gfe gfeVar;
        gfe gfeVar2;
        List list = this.c;
        boolean z = this.b;
        jfe jfeVar = (!z || list.contains(qoi0.a(seeVar.getClass()))) ? null : this;
        if (jfeVar != null && (gfeVar2 = (gfe) jfeVar.d.get(new hfe(l1oVar, qoi0.a(seeVar.getClass())))) != null) {
            return gfeVar2;
        }
        lfe lfeVar = (lfe) this.a.get(qoi0.a(seeVar.getClass()));
        if (lfeVar == null || (gfeVar = lfeVar.get(l1oVar, seeVar)) == null) {
            ny61.g(g8e.o("Not supported content type ", qoi0.a(seeVar.getClass()).d()));
            return null;
        }
        if (z && !list.contains(qoi0.a(seeVar.getClass()))) {
            this.d.put(new hfe(l1oVar, qoi0.a(seeVar.getClass())), gfeVar);
        }
        return gfeVar;
    }
}
