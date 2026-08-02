package com.yandex.messaging.ui.folders;

import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g8e;
import defpackage.j690;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r891;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w01;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z4f;
import defpackage.z910;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes11.dex */
public final class d implements zls {
    public final /* synthetic */ m3u0 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ oz40 c;

    public d(m3u0 m3u0Var, e eVar, oz40 oz40Var) {
        this.a = m3u0Var;
        this.b = eVar;
        this.c = oz40Var;
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
        z910 d = pi6.d(x4c.b, false);
        bts btsVar2 = (bts) fidVar;
        int hashCode = Long.hashCode(btsVar2.T);
        r1b0 o = btsVar2.o();
        f530 d2 = androidx.compose.ui.b.d(fidVar, j);
        ohd.G1.getClass();
        sls slsVar = androidx.compose.ui.node.d.b;
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
        qje.W(fidVar, androidx.compose.ui.node.d.f, d);
        qje.W(fidVar, androidx.compose.ui.node.d.e, o);
        wls wlsVar = androidx.compose.ui.node.d.g;
        if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
            b64.z(hashCode, btsVar3, hashCode, wlsVar);
        }
        qje.W(fidVar, androidx.compose.ui.node.d.d, d2);
        k3r k3rVar = ljs0.c;
        z4f z4fVar = (z4f) this.a.getValue();
        btsVar3.e0(-532090769);
        e eVar = this.b;
        boolean e = fidVar.e(eVar);
        Object Q = btsVar3.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1 createEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1 = new CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1(1, eVar, e.class, "updateFolderName", "updateFolderName(Ljava/lang/String;)V", 0);
            btsVar3.o0(createEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1);
            Q = createEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1;
        }
        btsVar3.t(false);
        tls tlsVar = (tls) ((tfx) Q);
        btsVar3.e0(-532088112);
        Object Q2 = btsVar3.Q();
        oz40 oz40Var = this.c;
        if (Q2 == o430Var) {
            Q2 = new w01(7, oz40Var);
            btsVar3.o0(Q2);
        }
        sls slsVar2 = (sls) Q2;
        Object k = g8e.k(-532085392, btsVar3, false);
        if (k == o430Var) {
            k = new w01(8, oz40Var);
            btsVar3.o0(k);
        }
        btsVar3.t(false);
        r891.a(z4fVar, k3rVar, tlsVar, slsVar2, (sls) k, fidVar, 27696);
        btsVar3.t(true);
        return zy11.a;
    }
}
