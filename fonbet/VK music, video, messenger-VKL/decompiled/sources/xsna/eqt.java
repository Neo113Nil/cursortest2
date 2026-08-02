package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ffw0;

/* compiled from: GetBroadcastPrivacyUseCase.kt */
/* loaded from: classes7.dex */
public final class eqt {

    /* compiled from: GetBroadcastPrivacyUseCase.kt */
    public static final class a {
    }

    public static ffw0 a(qvw0 qvw0Var) {
        if (!(qvw0Var instanceof rvw0)) {
            return qvw0Var instanceof svw0 ? ffw0.c.C2868c.a : ffw0.a.a;
        }
        rvw0 rvw0Var = (rvw0) qvw0Var;
        return (rvw0Var == null || rvw0Var.d) ? ffw0.b.e.a : ffw0.b.a.a;
    }

    public final List<ffw0> b(qvw0 qvw0Var) {
        zqk0 zqk0Var;
        xdw0 b;
        if (qvw0Var instanceof rvw0) {
            rvw0 rvw0Var = (rvw0) qvw0Var;
            return Collections.singletonList((rvw0Var == null || rvw0Var.d) ? ffw0.b.e.a : ffw0.b.a.a);
        }
        if (!(qvw0Var instanceof svw0)) {
            return Collections.singletonList(ffw0.a.a);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ffw0.c.C2868c.a);
        ffw0.c.b bVar = ffw0.c.b.a;
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.b.getClass();
        p4g.a(bVar, arrayList, !(com.vk.voip.ui.c.J().h() || !((zqk0Var = com.vk.voip.ui.c.P) == null || (b = zqk0Var.b()) == null || !b.c())));
        p4g.a(ffw0.c.a.a, arrayList, !((svw0) qvw0Var).h);
        return arrayList;
    }
}
