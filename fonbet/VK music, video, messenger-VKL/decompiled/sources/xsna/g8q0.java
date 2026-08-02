package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: UpdateFoldersCountersByDialogCmd.kt */
/* loaded from: classes2.dex */
public final class g8q0 extends xl6<s3q0> {
    public final ArrayList b;
    public final Collection<Long> c;
    public final Map<Long, Collection<DialogsCounters.Type>> d;
    public final Map<Long, Collection<DialogsCounters.Type>> e;

    public g8q0(ArrayList arrayList, Collection collection, Map map, Map map2) {
        this.b = arrayList;
        this.c = collection;
        this.d = map;
        this.e = map2;
    }

    public static void f(w2w w2wVar, int i, Collection collection, int i2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DialogsCounters.Type type = (DialogsCounters.Type) it.next();
            pdm c = w2wVar.I0().b().c();
            c.k.a(Integer.valueOf(i), new zkb(type, i2, 1), new yve(c, 12));
        }
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-folder-common";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList h = w2wVar.I0().b().c().h(intValue);
            ArrayList arrayList = new ArrayList(c5g.u(h, 10));
            Iterator it2 = h.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((Peer) it2.next()).b));
            }
            Set S0 = j5g.S0(arrayList);
            Iterator<T> it3 = this.c.iterator();
            while (it3.hasNext()) {
                long longValue = ((Number) it3.next()).longValue();
                Collection<DialogsCounters.Type> collection = this.d.get(Long.valueOf(longValue));
                if (collection == null) {
                    collection = EmptyList.b;
                }
                Collection<DialogsCounters.Type> collection2 = this.e.get(Long.valueOf(longValue));
                if (collection2 == null) {
                    collection2 = EmptyList.b;
                }
                Collection<DialogsCounters.Type> collection3 = collection;
                Collection<DialogsCounters.Type> collection4 = collection2;
                List t0 = j5g.t0(collection3, collection4);
                List t02 = j5g.t0(collection4, collection3);
                if (S0.contains(Long.valueOf(longValue))) {
                    f(w2wVar, intValue, t0, -1);
                    f(w2wVar, intValue, t02, 1);
                }
            }
        }
        w2wVar.e1(this, g580.b);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8q0)) {
            return false;
        }
        g8q0 g8q0Var = (g8q0) obj;
        return epx.f(this.b, g8q0Var.b) && epx.f(this.c, g8q0Var.c) && epx.f(this.d, g8q0Var.d) && epx.f(this.e, g8q0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + v11.a(s3j0.a(this.b.hashCode() * 31, this.c, 31), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateFoldersCountersByDialogCmd(foldersIds=");
        sb.append(this.b);
        sb.append(", dialogIds=");
        sb.append(this.c);
        sb.append(", oldTypes=");
        sb.append(this.d);
        sb.append(", newTypes=");
        return cjl0.a(sb, this.e, ')');
    }
}
