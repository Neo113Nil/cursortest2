package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class pwi0 implements izs {
    public final /* synthetic */ com.vk.voip.ui.sessionrooms.c b;

    public pwi0(com.vk.voip.ui.sessionrooms.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Collection collection = (Collection) obj;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a.b) it.next()).a);
        }
        return this.b.f(arrayList);
    }
}
