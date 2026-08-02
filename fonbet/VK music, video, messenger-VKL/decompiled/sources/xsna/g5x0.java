package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bi10;

/* compiled from: VoipVirtualBackgroundControllerImpl.kt */
/* loaded from: classes7.dex */
public final class g5x0 implements MasksWrap.b {
    public final /* synthetic */ h5x0 a;

    public g5x0(h5x0 h5x0Var) {
        this.a = h5x0Var;
    }

    @Override // com.vk.content.design.view.camera.MasksWrap.b
    public final void a(ArrayList arrayList) {
        Object obj;
        h5x0 h5x0Var = this.a;
        MasksWrap masksWrap = h5x0Var.g;
        if (masksWrap.getSelectedMask() != null) {
            masksWrap.setOnNewDataListener(null);
            return;
        }
        String c = h5x0Var.h().c();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof bi10.d) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (epx.f(((bi10.d) obj).a.Db(), c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        bi10.d dVar = (bi10.d) obj;
        if (dVar != null) {
            Mask mask = dVar.a;
            masksWrap.z(mask);
            h5x0Var.o = mask;
        }
        masksWrap.setOnNewDataListener(null);
    }
}
