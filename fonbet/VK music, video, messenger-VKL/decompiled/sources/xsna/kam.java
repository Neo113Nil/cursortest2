package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.engine.models.dialogs.c;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.oam;

/* compiled from: DialogBackgroundLoadHelper.kt */
/* loaded from: classes2.dex */
public final class kam {
    public static final kam a = new kam();

    public final void a(w2w w2wVar, List<String> list, List<String> list2, boolean z, boolean z2, boolean z3) {
        Iterable iterable;
        if (!list.isEmpty()) {
            ram m = w2wVar.I0().m();
            try {
                iterable = (List) ((xpp) bz2.c(new com.vk.im.engine.commands.chats.backgrounds.a(list, z), null)).a();
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
            } catch (VKApiExecutionException e) {
                L.E(e, new Object[0]);
                iterable = EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                lam lamVar = (lam) obj;
                if (!m.a(lamVar.b, lamVar.a)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m.f((lam) it.next());
            }
        }
        if (!list2.isEmpty() && z2) {
            Iterator it2 = w2wVar.I0().m().d(list2).iterator();
            while (it2.hasNext()) {
                oam.a.a(w2wVar, (lam) it2.next(), z3);
            }
        }
        c.h hVar = c.h.c;
        if (list.contains(hVar.a) || list2.contains(hVar.a)) {
            w2wVar.L0(this, new pam());
        }
    }
}
