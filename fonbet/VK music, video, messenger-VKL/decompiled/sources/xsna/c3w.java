package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.CoreFeatures;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c3w implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ c3w() {
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                mp10 mp10Var = (mp10) obj;
                return mp10Var.b + " = " + mp10Var.d.toMillis(mp10Var.c) + " ms";
            default:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(CoreFeatures.SEND_TOGGLES_TO_DEV_NULL)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"SendTogglesToDevNull", "Try send toggles to dev_null."});
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        bVar.x.drainTo(arrayList);
                    } catch (Exception e) {
                        L.j(e, "SendTogglesToDevNull", "Can't get a list of updated toggles.");
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            new x0p0(((n1p0) it.next()).a()).q();
                        } catch (Exception e2) {
                            L.j(e2, "SendTogglesToDevNull", "Can't build and send event to dev_null.");
                        }
                    }
                } else {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"SendTogglesToDevNull", "Send toggles to dev_null is disabled."});
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ c3w(qji0 qji0Var) {
    }
}
