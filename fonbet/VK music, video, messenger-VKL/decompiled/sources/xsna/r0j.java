package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import java.util.Iterator;
import xsna.it80;
import xsna.l1j;

/* compiled from: ConfigureRoomParticipantsFeature.kt */
/* loaded from: classes7.dex */
public final class r0j implements izs {
    public final /* synthetic */ l1j b;

    public r0j(l1j l1jVar) {
        this.b = l1jVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        it80.a aVar = it80.b;
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((f.a.b) obj2).a, ((l1j.f) this.b).b)) {
                break;
            }
        }
        aVar.getClass();
        return new it80(obj2);
    }
}
