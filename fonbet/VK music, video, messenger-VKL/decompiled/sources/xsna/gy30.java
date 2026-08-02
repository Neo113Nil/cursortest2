package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw30;

/* compiled from: MsgSearchSaveCmd.kt */
/* loaded from: classes2.dex */
public final class gy30 extends le6<ipm> {
    public final dw30.a b;

    public gy30(dw30.a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // xsna.le6
    public final ipm e(w2w w2wVar) {
        ?? values;
        xuo0.a.getClass();
        long a = xuo0.a();
        czh0 v = w2wVar.I0().v();
        elm i = w2wVar.I0().i();
        dw30.a aVar = this.b;
        ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) new h1e0(aVar.b(), a, true).o(w2wVar);
        if (aVar instanceof dw30.a.C2765a) {
            List<zpp<com.vk.im.engine.models.dialogs.a>> list = ((dw30.a.C2765a) aVar).a;
            values = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                values.add((com.vk.im.engine.models.dialogs.a) ((zpp) it.next()).a);
            }
        } else {
            if (!(aVar instanceof dw30.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            values = ((dw30.a.b) aVar).a.values();
        }
        Iterable<com.vk.im.engine.models.dialogs.b> iterable = (Iterable) new wfm(values, null, 0, 14).o(w2wVar);
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (com.vk.im.engine.models.dialogs.b bVar : iterable) {
            arrayList.add(w0w.a(w2wVar, bVar, i.e(bVar.C)));
        }
        v.m(arrayList, aVar.b());
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Dialog) it2.next()).Sb());
        }
        v.o(arrayList2);
        wpp wppVar = new wpp();
        wppVar.a = new HashSet();
        wppVar.b = new HashSet();
        wppVar.c = new HashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            wppVar.c.put(((Dialog) next).Sb(), next);
        }
        return new ipm(wppVar, new ProfilesInfo(profilesSimpleInfo));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy30) && epx.f(this.b, ((gy30) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgSearchSaveCmd(result=" + this.b + ')';
    }
}
