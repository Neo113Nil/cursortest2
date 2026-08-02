package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import java.util.Iterator;
import xsna.o2j;

/* compiled from: ConfigureSessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class b2j implements izs<?, s3q0> {
    public final /* synthetic */ a2j b;

    public b2j(a2j a2jVar) {
        this.b = a2jVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Object obj) {
        boolean z;
        Collection collection = (Collection) obj;
        a2j a2jVar = this.b;
        if (!a2jVar.h) {
            Collection collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (((f.a.b) it.next()).c) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            a2jVar.h = z;
        }
        if (a2jVar.h && collection.isEmpty()) {
            a2jVar.T(o2j.p.b);
            a2jVar.T(o2j.v.b);
            a2jVar.h = false;
        }
        return s3q0.a;
    }
}
