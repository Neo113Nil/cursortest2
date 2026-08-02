package xsna;

import com.vk.lists.ListDataSet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.u440;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p440 implements izs {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tam0 d;
    public final /* synthetic */ u440 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ izs g;

    public /* synthetic */ p440(ArrayList arrayList, int i, tam0 tam0Var, u440 u440Var, int i2, izs izsVar) {
        this.b = arrayList;
        this.c = i;
        this.d = tam0Var;
        this.e = u440Var;
        this.f = i2;
        this.g = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        h640 h640Var = (h640) obj;
        if (h640Var.a == null) {
            h640Var = null;
        }
        u440.a aVar = new u440.a(this.d, h640Var);
        ArrayList arrayList = this.b;
        arrayList.set(this.c, aVar);
        u440 u440Var = this.e;
        V v = u440Var.s;
        if (((ArrayList) j5g.V(arrayList)).size() == this.f) {
            List V = j5g.V(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : V) {
                if (((u440.a) obj2).b != null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((u440.a) it.next()).a);
            }
            this.g.invoke(arrayList3);
            if (u440Var.C0 == null) {
                ListDataSet listDataSet = new ListDataSet();
                listDataSet.s(new y340());
                ((g440) v).setStoryPickerData(listDataSet);
                u440Var.C0 = listDataSet;
            }
            ListDataSet listDataSet2 = u440Var.C0;
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((u440.a) it2.next()).b);
            }
            AbstractCollection abstractCollection = listDataSet2.d;
            if (abstractCollection.size() == 0) {
                listDataSet2.n0(arrayList4);
            } else {
                listDataSet2.y(abstractCollection.size() - 1, arrayList4);
            }
            if (abstractCollection.size() > 10) {
                listDataSet2.A(abstractCollection.size() - 1);
            }
            tam0 tam0Var = u440Var.B0;
            if (tam0Var != null && tam0Var.g()) {
                ((g440) v).K();
            }
            if (arrayList.size() > arrayList2.size()) {
                u440Var.j.h(false);
            }
            ((g440) v).ik();
            u440Var.e8();
        }
        return s3q0.a;
    }
}
