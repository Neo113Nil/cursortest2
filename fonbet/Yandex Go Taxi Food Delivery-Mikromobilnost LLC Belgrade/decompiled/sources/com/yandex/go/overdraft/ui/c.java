package com.yandex.go.overdraft.ui;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtFlowNotification;
import com.yandex.go.overdraft.data.model.h0;
import com.yandex.go.overdraft.data.model.t0;
import com.yandex.go.overdraft.domain.i;
import defpackage.o2y0;
import defpackage.oo31;
import defpackage.pl21;
import defpackage.tje;
import defpackage.wz80;
import defpackage.yy80;
import defpackage.zf;
import java.util.HashMap;
import java.util.function.BiConsumer;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ g a;

    public /* synthetic */ c(g gVar) {
        this.a = gVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        OverdraftContext overdraftContext;
        o2y0 o2y0Var;
        DebtFlowNotification debtFlowNotification;
        t0 t0Var = (t0) obj;
        Screen screen = (Screen) obj2;
        g gVar = this.a;
        i iVar = gVar.l;
        DebtFlow debtFlow = ((pl21) kotlinx.coroutines.flow.e.d(iVar.e.a).a.getValue()).b.e;
        if (debtFlow != null && (debtFlowNotification = debtFlow.c) != null && debtFlowNotification.getA() != null) {
            iVar.c.getClass();
        }
        if (t0Var instanceof h0) {
            com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) gVar.k;
            if (aVar.r()) {
                o2y0Var = aVar.u();
                overdraftContext = OverdraftContext.ACTIVE_ORDER;
            } else {
                int i = wz80.a[screen.ordinal()];
                overdraftContext = (i == 1 || i == 2 || i == 3 || i == 4) ? OverdraftContext.MAIN_SCREEN : OverdraftContext.SUMMARY;
                o2y0Var = null;
            }
            tje.N(gVar.z.c(), null, null, new OverdraftStateBarControllerImpl$forceOpenOverdraftView$1(gVar, o2y0Var, overdraftContext, null), 3);
            yy80 yy80Var = gVar.m;
            zf zfVar = yy80Var.c;
            String a = yy80.a(screen);
            boolean z = yy80Var.d().c;
            boolean e = yy80Var.e();
            boolean f = yy80Var.f();
            double c = yy80Var.c();
            zfVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, a);
            oo31.q(z, hashMap, "has_overdraft", e, "is_card_available");
            hashMap.put("is_cash_available", Boolean.valueOf(f));
            hashMap.put("cumulative_debt", Double.valueOf(c));
            zfVar.a.a("DebtNotification.Tapped", hashMap, 1, new HashMap());
        }
    }
}
