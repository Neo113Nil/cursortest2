package xsna;

import com.vk.superapp.multiaccount.api.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.i340;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a340 implements izs {
    public final /* synthetic */ i340 b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        EmptyList emptyList;
        Object obj2;
        i340.e eVar = (i340.e) obj;
        List<f.a> a = eVar.a();
        ArrayList e = this.b.a.e();
        if (a.size() >= e.size()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = e.iterator();
            while (true) {
                if (it.hasNext()) {
                    usi0.a aVar = (usi0.a) it.next();
                    Iterator<T> it2 = a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (epx.f(((f.a) obj2).a().c(), aVar.c().b())) {
                            break;
                        }
                    }
                    f.a aVar2 = (f.a) obj2;
                    if (aVar2 == null) {
                        emptyList = EmptyList.b;
                        break;
                    }
                    arrayList.add(aVar2);
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (hashSet.add(((f.a) next).a().c())) {
                            arrayList2.add(next);
                        }
                    }
                    emptyList = arrayList2;
                }
            }
        } else {
            emptyList = EmptyList.b;
        }
        return new i340.e(emptyList, eVar.b());
    }
}
