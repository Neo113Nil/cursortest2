package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class g12 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;

    public /* synthetic */ g12(int i, int i2, ArrayList arrayList) {
        this.a = i2;
        this.b = arrayList;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        int i3 = this.c;
        ArrayList<o> arrayList = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                List list2 = list;
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    ny61.p();
                    return null;
                }
                int intValue = ((Number) it.next()).intValue();
                while (it.hasNext()) {
                    int intValue2 = ((Number) it.next()).intValue();
                    if (intValue > intValue2) {
                        intValue = intValue2;
                    }
                }
                Iterator it2 = list2.iterator();
                if (!it2.hasNext()) {
                    ny61.p();
                    return null;
                }
                int intValue3 = ((Number) it2.next()).intValue();
                while (it2.hasNext()) {
                    int intValue4 = ((Number) it2.next()).intValue();
                    if (intValue3 < intValue4) {
                        intValue3 = intValue4;
                    }
                }
                ((List) arrayList.get(i3)).add(new i12(new d6w(intValue, intValue3, 1), list));
                return zy11Var;
            case 1:
                o.a aVar = (o.a) obj;
                int i4 = 0;
                int i5 = 0;
                for (Object obj2 : arrayList) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    o oVar = (o) obj2;
                    o.a.o(aVar, oVar, i5, 0);
                    i5 += oVar.a + (i4 < scc.f(arrayList) ? i3 : 0);
                    i4 = i6;
                }
                return zy11Var;
            case 2:
                o.a aVar2 = (o.a) obj;
                for (o oVar2 : arrayList) {
                    o.a.o(aVar2, oVar2, i2, (i3 - oVar2.b) / 2);
                    i2 += oVar2.a;
                }
                return zy11Var;
            default:
                o.a aVar3 = (o.a) obj;
                for (o oVar3 : arrayList) {
                    aVar3.g(oVar3, i2, (i3 - oVar3.b) / 2, 0.0f);
                    i2 += oVar3.a;
                }
                return zy11Var;
        }
    }
}
