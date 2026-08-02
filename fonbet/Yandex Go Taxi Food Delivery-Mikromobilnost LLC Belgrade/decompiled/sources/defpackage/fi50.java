package defpackage;

import defpackage.nli;
import defpackage.x5r;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class fi50 {
    public final li50 a;
    public final uli b;
    public final u9i c;

    public fi50(li50 li50Var, uli uliVar, u9i u9iVar) {
        this.a = li50Var;
        this.b = uliVar;
        this.c = u9iVar;
    }

    public final x5r a() {
        PointType pointType = this.a.b.b() ? PointType.SOURCE : PointType.DESTINATION;
        uli uliVar = this.b;
        uliVar.getClass();
        nli.c cVar = pointType == PointType.SOURCE ? uliVar.b().e : uliVar.b().f;
        if (cVar == null) {
            cVar = new nli.c(0);
        }
        String Y = d6z.Y(uliVar.b(), cVar.a);
        String Y2 = d6z.Y(uliVar.b(), cVar.b);
        List<nli.d> list = cVar.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (nli.d dVar : list) {
            String Y3 = d6z.Y(uliVar.b(), dVar.a);
            List<nli.a> list2 = dVar.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (nli.a aVar : list2) {
                arrayList2.add(new x5r.a.C0132a(aVar.b, d6z.Y(uliVar.b(), aVar.a), aVar.c));
            }
            arrayList.add(new x5r.a.b(Y3, arrayList2));
        }
        return new x5r(new x5r.a(Y, Y2, arrayList));
    }
}
