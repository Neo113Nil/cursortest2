package com.yandex.messaging.ui.settings.contacts;

import androidx.compose.ui.node.d;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.jl40;
import defpackage.lr20;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.vde;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yde;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements zls {
    public final /* synthetic */ yde a;
    public final /* synthetic */ vde b;

    public a(yde ydeVar, vde vdeVar) {
        this.a = ydeVar;
        this.b = vdeVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j690 j690Var = (j690) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        f530 j = an91.j(c530.a, j690Var);
        sic a = qic.a(lr20.c, x4c.G, fidVar, 0);
        bts btsVar2 = (bts) fidVar;
        int hashCode = Long.hashCode(btsVar2.T);
        r1b0 o = btsVar2.o();
        f530 d = androidx.compose.ui.b.d(fidVar, j);
        ohd.G1.getClass();
        sls slsVar = d.b;
        bts btsVar3 = (bts) fidVar;
        if (btsVar3.a == null) {
            cma1.b0();
            throw null;
        }
        btsVar3.i0();
        if (btsVar3.S) {
            btsVar3.n(slsVar);
        } else {
            btsVar3.r0();
        }
        qje.W(fidVar, d.f, a);
        qje.W(fidVar, d.e, o);
        wls wlsVar = d.g;
        if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
            b64.z(hashCode, btsVar3, hashCode, wlsVar);
        }
        qje.W(fidVar, d.d, d);
        b bVar = b.a;
        bVar.c(fidVar, 6);
        btsVar3.e0(1325361564);
        vde vdeVar = this.b;
        boolean e = fidVar.e(vdeVar);
        Object Q = btsVar3.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            ContactsSettingsScreen$Root$2$1$1$1 contactsSettingsScreen$Root$2$1$1$1 = new ContactsSettingsScreen$Root$2$1$1$1(1, vdeVar, vde.class, "onSyncContactsChanged", "onSyncContactsChanged(Z)V", 0);
            btsVar3.o0(contactsSettingsScreen$Root$2$1$1$1);
            Q = contactsSettingsScreen$Root$2$1$1$1;
        }
        btsVar3.t(false);
        yde ydeVar = this.a;
        bVar.e(ydeVar, (tls) ((tfx) Q), fidVar, 384);
        btsVar3.e0(1325366782);
        boolean e2 = fidVar.e(vdeVar);
        Object Q2 = btsVar3.Q();
        if (e2 || Q2 == o430Var) {
            ContactsSettingsScreen$Root$2$1$2$1 contactsSettingsScreen$Root$2$1$2$1 = new ContactsSettingsScreen$Root$2$1$2$1(0, vdeVar, vde.class, "onDeleteContactsPressed", "onDeleteContactsPressed()V", 0);
            btsVar3.o0(contactsSettingsScreen$Root$2$1$2$1);
            Q2 = contactsSettingsScreen$Root$2$1$2$1;
        }
        btsVar3.t(false);
        bVar.b(ydeVar, (sls) ((tfx) Q2), fidVar, 384);
        btsVar3.t(true);
        return zy11.a;
    }
}
