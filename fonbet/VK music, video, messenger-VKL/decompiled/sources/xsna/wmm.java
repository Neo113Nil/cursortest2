package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.go;

/* compiled from: DialogsActualHintsLoadCmd.kt */
/* loaded from: classes2.dex */
public final class wmm extends le6<List<? extends qtd0>> {
    public static final a b = new a();
    public static volatile boolean c;

    /* compiled from: DialogsActualHintsLoadCmd.kt */
    public static final class a {
        public final boolean a(w2w w2wVar, Source source, long j) {
            if (w2wVar.f1() - w2wVar.I0().v().l() <= j || wmm.c || source == Source.CACHE) {
                return false;
            }
            w2wVar.J0(this, new wmm());
            return true;
        }
    }

    @Override // xsna.le6
    public final List<? extends qtd0> e(w2w w2wVar) {
        c = true;
        go.a aVar = (go.a) bz2.c(new go(w2wVar.c()), "DialogsActualHintsLoadCmd.AccountGetContactListApiCmd");
        new h1e0(aVar.b, w2wVar.f1(), true).o(w2wVar);
        czh0 v = w2wVar.I0().v();
        v.j(aVar.b.b.values());
        ArrayList arrayList = aVar.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new UserId(((Number) it.next()).intValue()));
        }
        v.f(arrayList2);
        v.h(w2wVar.f1());
        ArrayList arrayList3 = aVar.a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            qtd0 Ab = aVar.b.Ab(Long.valueOf(((Number) it2.next()).intValue()));
            if (Ab != null) {
                arrayList4.add(Ab);
            }
        }
        w2wVar.e1(this, new o680(arrayList4));
        c = false;
        return arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return wmm.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return -1510029598;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsActualHintsLoadCmd()";
    }
}
