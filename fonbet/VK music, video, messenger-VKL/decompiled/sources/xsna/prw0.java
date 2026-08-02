package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bi10;

/* compiled from: VoipMaskControllerImpl.kt */
/* loaded from: classes7.dex */
public final class prw0 implements MasksWrap.b {
    public final /* synthetic */ qrw0 a;
    public final /* synthetic */ int b;

    public prw0(qrw0 qrw0Var, int i) {
        this.a = qrw0Var;
        this.b = i;
    }

    @Override // com.vk.content.design.view.camera.MasksWrap.b
    public final void a(ArrayList arrayList) {
        Object obj;
        qrw0 qrw0Var = this.a;
        MasksWrap masksWrap = qrw0Var.g;
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
                if (((bi10.d) obj).a.d == this.b) {
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
            qrw0Var.o = mask;
        }
        masksWrap.setOnNewDataListener(null);
    }
}
