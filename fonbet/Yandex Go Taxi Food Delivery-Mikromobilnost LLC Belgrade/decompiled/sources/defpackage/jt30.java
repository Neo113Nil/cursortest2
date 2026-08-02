package defpackage;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.ms30;
import defpackage.qs30;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class jt30 {
    public final o a;
    public final gt30 b;

    public jt30(o oVar, gt30 gt30Var) {
        this.a = oVar;
        this.b = gt30Var;
    }

    public final ms30 a() {
        ms30.c cVar;
        qs30.g gVar;
        qs30.c cVar2;
        ms30.a aVar;
        Zone g = this.a.g();
        if (g != null) {
            qs30 qs30Var = (qs30) g.z.a(qs30.class);
            ms30 ms30Var = null;
            r1 = null;
            ms30.f fVar = null;
            if (qs30Var != null) {
                this.b.getClass();
                boolean z = qs30Var.c;
                qs30.d dVar = qs30Var.e;
                qs30.f fVar2 = qs30Var.d;
                ms30.e eVar = fVar2 != null ? new ms30.e(fVar2.a, fVar2.b) : null;
                if (dVar == null || (cVar2 = dVar.a) == null) {
                    cVar = null;
                } else {
                    List<qs30.e> list = cVar2.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (qs30.e eVar2 : list) {
                        qs30.a aVar2 = eVar2.a;
                        if (aVar2 != null) {
                            String str = aVar2.a;
                            String str2 = aVar2.b;
                            if (str2 == null) {
                                str2 = null;
                            } else if (d6z.Z(qs30Var, str2)) {
                                str2 = d6z.Y(qs30Var, str2);
                            }
                            String str3 = aVar2.c;
                            if (str3 == null) {
                                str3 = null;
                            } else if (d6z.Z(qs30Var, str3)) {
                                str3 = d6z.Y(qs30Var, str3);
                            }
                            qs30.b bVar = aVar2.d;
                            aVar = new ms30.a(str, str2, str3, bVar != null ? new ms30.b(bVar.a, bVar.b) : null);
                        } else {
                            aVar = null;
                        }
                        arrayList.add(new ms30.d(aVar, eVar2.b, eVar2.c));
                    }
                    String str4 = cVar2.b;
                    if (str4 == null) {
                        str4 = null;
                    } else if (d6z.Z(qs30Var, str4)) {
                        str4 = d6z.Y(qs30Var, str4);
                    }
                    cVar = new ms30.c(arrayList, str4);
                }
                if (dVar != null && (gVar = dVar.b) != null) {
                    String str5 = gVar.a;
                    if (str5 == null) {
                        str5 = null;
                    } else if (d6z.Z(qs30Var, str5)) {
                        str5 = d6z.Y(qs30Var, str5);
                    }
                    qs30.h hVar = gVar.b;
                    fVar = new ms30.f(str5, hVar != null ? hVar.a : null, hVar != null ? hVar.b : null, gVar.c);
                }
                ms30Var = new ms30(z, eVar, cVar, fVar);
            }
            if (ms30Var != null) {
                return ms30Var;
            }
        }
        return ms30.e;
    }
}
