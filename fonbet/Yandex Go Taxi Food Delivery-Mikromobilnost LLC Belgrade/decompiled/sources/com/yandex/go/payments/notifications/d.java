package com.yandex.go.payments.notifications;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.tpr;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class d {
    public final cne0 a;
    public final tpr b;
    public final tpr c;

    public d(fga0 fga0Var, com.yandex.go.payments.data.c cVar, dne0 dne0Var) {
        this.a = dne0Var.a("SBP_TOKEN_BINDING_STATUS_NOTIFICATIONS");
        this.b = e.t(new c(e.I(fga0Var.z(), new PaymentsNotificationRepository$paymentsNotificationFlow$1(2, null))));
        this.c = e.t(new com.yandex.go.payments.data.b(e.d(cVar.b)));
    }

    public final Set a() {
        List W;
        String l = this.a.l("NOTIFICATION", null);
        if (l == null) {
            return EmptySet.a;
        }
        W = evu0.W(l, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : W) {
            if (!evu0.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.a.N0(arrayList);
    }
}
