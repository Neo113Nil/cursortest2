package defpackage;

import androidx.compose.foundation.lazy.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class n0v implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ bpl0 w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ tls y;

    public n0v(b bVar, float f, float f2, bpl0 bpl0Var, oz40 oz40Var, tls tlsVar) {
        this.a = bVar;
        this.b = f;
        this.c = f2;
        this.w = bpl0Var;
        this.x = oz40Var;
        this.y = tlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object valueOf;
        s6y j = this.a.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!((t6y) ((n6y) obj2)).k.equals("sticky_header")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n6y n6yVar = (n6y) it.next();
            float f = (j.m - this.b) - this.c;
            if (((t6y) n6yVar).o > j.l) {
                t6y t6yVar = (t6y) n6yVar;
                Object obj3 = t6yVar.k;
                float f2 = t6yVar.o;
                if (f2 < f) {
                    float f3 = f - f2;
                    float f4 = t6yVar.p;
                    if (f3 > f4) {
                        f3 = f4;
                    }
                    float f5 = f3 / f4;
                    bpl0 bpl0Var = this.w;
                    List list = bpl0Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        g0v g0vVar = (g0v) obj4;
                        wls wlsVar = bpl0Var.b;
                        if (wlsVar == null || (valueOf = wlsVar.invoke(Integer.valueOf(i2), g0vVar)) == null) {
                            valueOf = Integer.valueOf(g0vVar.hashCode());
                        }
                        if (valueOf.equals(obj3)) {
                            arrayList2.add(obj4);
                        }
                        i2 = i3;
                    }
                    g0v g0vVar2 = (g0v) a.R(arrayList2);
                    if (g0vVar2 == null) {
                        continue;
                    } else {
                        boolean z = g0vVar2 instanceof vzu;
                        oz40 oz40Var = this.x;
                        tls tlsVar = this.y;
                        if (z) {
                            vzu vzuVar = (vzu) g0vVar2;
                            int i4 = vzuVar.a;
                            List list2 = vzuVar.b;
                            int size = ((list2.size() + i4) - 1) / i4;
                            int i5 = size * size * 64;
                            for (Object obj5 : list2) {
                                int i6 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                float f6 = ((r7 / 2) + ((i % i4) * r7)) / i5;
                                String i7 = oyr.i(i, "table_item_");
                                if (f5 > f6 && !((Set) oz40Var.getValue()).contains(i7)) {
                                    tlsVar.invoke(new wd31((kt60) list2.get(i)));
                                    oz40Var.setValue(v4r0.i((Set) oz40Var.getValue(), i7));
                                }
                                i = i6;
                            }
                        } else if (f5 > 0.5d && !((Set) oz40Var.getValue()).contains(obj3)) {
                            tlsVar.invoke(new pd31(g0vVar2));
                            oz40Var.setValue(v4r0.i((Set) oz40Var.getValue(), obj3));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return zy11.a;
    }
}
