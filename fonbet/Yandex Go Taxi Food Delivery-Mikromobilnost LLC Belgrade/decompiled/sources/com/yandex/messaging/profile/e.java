package com.yandex.messaging.profile;

import com.yandex.messaging.internal.storage.i;
import defpackage.ike;
import defpackage.kgx;
import defpackage.m120;
import defpackage.pzt0;
import defpackage.qoh;
import defpackage.rp3;
import defpackage.tje;
import defpackage.v320;
import defpackage.vef0;
import defpackage.vse;
import defpackage.za51;

/* loaded from: classes8.dex */
public final class e {
    public final d a;
    public final c b;
    public final vef0 c;
    public final m120 d;
    public final za51 e;
    public final h f;
    public final i g;
    public final ike h;
    public qoh i;
    public v320 j;

    public e(vse vseVar, d dVar, c cVar, vef0 vef0Var, m120 m120Var, za51 za51Var, h hVar, i iVar) {
        this.a = dVar;
        this.b = cVar;
        this.c = vef0Var;
        this.d = m120Var;
        this.e = za51Var;
        this.f = hVar;
        this.g = iVar;
        this.h = vseVar.c(false);
        tje.N(vseVar.b(), null, null, new ProfileManager$1(this, null), 3);
    }

    public final void a(qoh qohVar) {
        qoh qohVar2 = this.i;
        if (qohVar2 != null) {
            qohVar2.a(null);
        }
        this.i = qohVar;
        ike ikeVar = this.h;
        kotlinx.coroutines.a.g(ikeVar.a, null);
        d dVar = this.a;
        dVar.getClass();
        tje.e();
        dVar.c.l(null);
        pzt0 N = tje.N(dVar.a, null, null, new ProfileHolder$onNewProfile$1(dVar, qohVar, null), 3);
        rp3 rp3Var = dVar.b;
        kgx kgxVar = d.d[0];
        rp3Var.a(N);
        tje.N(ikeVar, null, null, new ProfileManager$asyncProfile$1$1(qohVar, this, null), 3);
    }
}
