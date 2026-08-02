package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.domain.actions.ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class bf9 extends wx4 {
    public final List b;
    public final k020 c;
    public final mxb0 d;

    public bf9(List list, k020 k020Var, mxb0 mxb0Var, el21 el21Var) {
        super(el21Var);
        this.b = list;
        this.c = k020Var;
        this.d = mxb0Var;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        return grVar instanceof bf9;
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        int i = 0;
        List d0 = j73.d0((String[]) a.b(this.c.b.L().a, true, false, new fnb0(7)));
        this.d.getClass();
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (d0.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (d0.size() != arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(d0.indexOf((String) it.next())));
            }
            List list2 = d0;
            ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                String str = (String) obj2;
                if (arrayList2.contains(Integer.valueOf(i2))) {
                    str = (String) d0.get(((Number) arrayList2.get(i)).intValue());
                    i++;
                }
                arrayList3.add(str);
                i2 = i3;
            }
            arrayList.size();
            z83.i();
            arrayList = arrayList3;
        }
        return tje.k0(continuation.get_context(), new ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1(null, cl21Var, arrayList), continuation);
    }
}
