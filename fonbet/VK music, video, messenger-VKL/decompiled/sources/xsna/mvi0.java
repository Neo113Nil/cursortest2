package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: SessionRoomParticipantMoveDialog.kt */
/* loaded from: classes7.dex */
public final class mvi0 implements izs {
    public final /* synthetic */ nvi0 b;

    public mvi0(nvi0 nvi0Var) {
        this.b = nvi0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Collection) obj) {
            if (!epx.f(((f.a.b) obj2).a, this.b.i1)) {
                arrayList.add(obj2);
            }
        }
        return Integer.valueOf(arrayList.size());
    }
}
