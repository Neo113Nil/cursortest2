package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* compiled from: LocalDialogSettingsChangeCmd.kt */
/* loaded from: classes2.dex */
public abstract class iuz extends xl6<s3q0> {
    public static void f(Collection collection, int i, w2w w2wVar) {
        new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DialogsCounters.Type type = (DialogsCounters.Type) it.next();
            com.vk.im.engine.internal.storage.delegates.dialogs.b a = w2wVar.I0().b().a();
            a.e.a(Integer.valueOf(type.i()), new orm(i, 0), new k7f(a, 10));
        }
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Collection<DialogsCounters.Type> a;
        Collection<DialogsCounters.Type> a2;
        Dialog g = g(w2wVar);
        if (g != null && (a = wvm.a(g, w2wVar)) != null) {
            f(a, -1, w2wVar);
            boolean j = j(w2wVar);
            Dialog g2 = g(w2wVar);
            if (g2 != null && (a2 = wvm.a(g2, w2wVar)) != null) {
                f(a2, 1, w2wVar);
                Set<DialogsCounters.Type> T0 = j5g.T0(a, a2);
                ArrayList arrayList = new ArrayList(c5g.u(T0, 10));
                for (DialogsCounters.Type type : T0) {
                    com.vk.im.engine.models.dialogs.d b = w2wVar.I0().b().a().b(type);
                    arrayList.add(new adm(type, b != null ? b.b : 0));
                }
                if (j) {
                    w2wVar.S0().V(h());
                }
                w2wVar.S0().P(arrayList);
                List<rdm> b2 = w2wVar.I0().b().c().b();
                ArrayList arrayList2 = new ArrayList(c5g.u(b2, 10));
                Iterator<T> it = b2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((rdm) it.next()).a));
                }
                w2wVar.J0(this, new g8q0(arrayList2, Collections.singletonList(Long.valueOf(h())), on00.f(new Pair(Long.valueOf(h()), a)), on00.f(new Pair(Long.valueOf(h()), a2))));
                i(w2wVar);
            }
        }
        return s3q0.a;
    }

    public final Dialog g(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (Dialog) j5g.Z(((wpp) w2wVar.J0(this, new tqm(new sqm(Peer.a.b(h()), Source.CACHE, false, (Object) null, 28))).await()).c.values());
    }

    public abstract long h();

    public abstract void i(w2w w2wVar);

    public abstract boolean j(w2w w2wVar);
}
