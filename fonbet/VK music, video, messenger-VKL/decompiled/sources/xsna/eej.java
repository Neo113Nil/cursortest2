package xsna;

import com.vk.superapp.multiaccount.api.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.i340;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class eej implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eej(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                rVar.onNext(bool);
                return s3q0.a;
            case 1:
                i340 i340Var = (i340) this.c;
                Pair pair = (Pair) obj;
                i340.e eVar = (i340.e) pair.d();
                i340.e eVar2 = (i340.e) pair.g();
                ArrayList arrayList = new ArrayList(eVar2.a());
                ArrayList arrayList2 = new ArrayList(eVar.b());
                arrayList2.addAll(eVar2.b());
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((f.c) next).a().d()) {
                        arrayList3.add(next);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (hashSet.add(((f.c) next2).a().c())) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    f.a aVar = (f.a) it3.next();
                    Iterator it4 = arrayList5.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (epx.f(((f.c) obj2).a().c(), aVar.a().c())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    f.c cVar = (f.c) obj2;
                    if (cVar != null) {
                        arrayList6.add(cVar);
                    }
                }
                arrayList5.removeAll(arrayList6);
                ListBuilder e = e43.e();
                e.addAll(arrayList);
                e.addAll(arrayList5);
                ListBuilder g = e.g();
                i340Var.g.b(arrayList);
                i340Var.h.b(arrayList5);
                i340Var.d.onNext(g);
                return s3q0.a;
            default:
                String str = (String) this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT name, value, storage_name FROM user_values WHERE storage_name = ?");
                try {
                    V0.D3(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        String l22 = V0.l2(1);
                        V0.l2(2);
                        arrayList7.add(new y0p0(l2, l22));
                    }
                    return arrayList7;
                } finally {
                    V0.close();
                }
        }
    }
}
