package com.yandex.go.payments.acceptance.domain;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentNotification;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentUi;
import defpackage.hxx;
import defpackage.m950;
import defpackage.me;
import defpackage.ne;
import defpackage.oe;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pz40;
import defpackage.qe;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.we;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d {
    public final tse a;
    public final oep0 b;
    public final oe c;
    public final qe d;
    public final HashMap e = new HashMap();

    public d(tse tseVar, oep0 oep0Var, oe oeVar, qe qeVar) {
        this.a = tseVar;
        this.b = oep0Var;
        this.c = oeVar;
        this.d = qeVar;
        tje.N(tseVar, null, null, new AcceptancePaymentNotificationManager$1(this, null), 3);
    }

    public final void a(String str) {
        qe qeVar = this.d;
        HashMap hashMap = qeVar.b;
        HashMap hashMap2 = qeVar.c;
        Boolean bool = (Boolean) hashMap.get(str);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) hashMap2.get(str);
        if (bool2 == null) {
            hashMap2.put(str, Boolean.valueOf(booleanValue));
            ((pep0) this.b).f((m950) this.c.get(), new ne(str), hxx.a);
        } else {
            if (bool2.equals(Boolean.valueOf(booleanValue))) {
                return;
            }
            pz40 pz40Var = (pz40) qeVar.a.get(str);
            we weVar = pz40Var != null ? (we) ((r0) pz40Var).getValue() : null;
            if (weVar == null) {
                return;
            }
            tje.N(this.a, null, null, new AcceptancePaymentNotificationManager$ensureAttached$1(this, str, weVar, booleanValue, null), 3);
        }
    }

    public final void b(String str) {
        this.e.remove(str);
        qe qeVar = this.d;
        qeVar.b.put(str, Boolean.FALSE);
        qeVar.b(str, null);
    }

    public final void c(String str, AcceptancePaymentUi acceptancePaymentUi, sls slsVar) {
        String str2;
        AcceptancePaymentNotification acceptancePaymentNotification = acceptancePaymentUi != null ? acceptancePaymentUi.a : null;
        HashMap hashMap = this.e;
        hashMap.put(str, new me(slsVar, (sls) null));
        if (acceptancePaymentNotification == null || (str2 = acceptancePaymentNotification.a) == null) {
            str2 = "";
        }
        we weVar = new we(str2, acceptancePaymentNotification != null ? acceptancePaymentNotification.b : null, acceptancePaymentNotification != null ? acceptancePaymentNotification.c : null, null, false);
        qe qeVar = this.d;
        qeVar.b.put(str, Boolean.TRUE);
        qeVar.b(str, weVar);
        a(str);
    }

    public final void d(String str, AcceptancePaymentUi acceptancePaymentUi) {
        AcceptancePaymentNotification acceptancePaymentNotification;
        if (acceptancePaymentUi == null || (acceptancePaymentNotification = acceptancePaymentUi.a) == null) {
            return;
        }
        HashMap hashMap = this.e;
        hashMap.put(str, new me((sls) null, (sls) null));
        we weVar = new we(acceptancePaymentNotification.a, acceptancePaymentNotification.b, acceptancePaymentNotification.c, null, false);
        qe qeVar = this.d;
        qeVar.b.put(str, Boolean.TRUE);
        qeVar.b(str, weVar);
        a(str);
    }
}
