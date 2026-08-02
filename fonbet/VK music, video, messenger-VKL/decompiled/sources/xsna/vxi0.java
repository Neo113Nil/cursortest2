package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.usi0;
import xsna.wxi0;

/* compiled from: SessionsChangeDataReducer.kt */
/* loaded from: classes6.dex */
public final class vxi0 {
    public final List<usi0> a;
    public final List<usi0> b;
    public final ArrayList c;
    public final ArrayList d;

    public vxi0(uxi0 uxi0Var) {
        List<usi0> list = uxi0Var.a;
        this.a = list;
        List<usi0> list2 = uxi0Var.b;
        this.b = list2;
        this.c = g5g.E(list, usi0.a.class);
        this.d = g5g.E(list2, usi0.a.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wxi0 a() {
        UserId userId;
        usi0.a aVar;
        fhq0 c;
        fhq0 c2;
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = this.d;
        Pair pair = null;
        if (size == arrayList2.size()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!arrayList2.contains((usi0.a) next)) {
                    arrayList3.add(next);
                }
            }
            usi0.a aVar2 = (usi0.a) j5g.a0(arrayList3);
            if (aVar2 != null && (c2 = aVar2.c()) != null) {
                userId = c2.a;
                if (userId == null) {
                    return new wxi0.c(userId);
                }
                UserId userId2 = (arrayList2.size() <= arrayList.size() || (aVar = (usi0.a) j5g.a0(arrayList2)) == null || (c = aVar.c()) == null) ? null : c.a;
                if (userId2 != null) {
                    return new wxi0.a(userId2);
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty() && arrayList.size() == arrayList2.size() && !epx.f(((usi0.a) arrayList2.get(0)).c().a, ((usi0.a) arrayList.get(0)).c().a)) {
                    pair = new Pair(arrayList.get(0), arrayList2.get(0));
                }
                return pair != null ? new wxi0.d((usi0.a) pair.i(), (usi0.a) pair.j()) : wxi0.b.a;
            }
        }
        userId = null;
        if (userId == null) {
        }
    }
}
