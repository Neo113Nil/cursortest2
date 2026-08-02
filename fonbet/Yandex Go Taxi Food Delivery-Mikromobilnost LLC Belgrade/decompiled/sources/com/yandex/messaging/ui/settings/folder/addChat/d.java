package com.yandex.messaging.ui.settings.folder.addChat;

import androidx.compose.material3.w;
import defpackage.ac0;
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
import defpackage.keb1;
import defpackage.ljs0;
import defpackage.lpb1;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xb0;
import defpackage.yb0;
import defpackage.z910;
import defpackage.zb0;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class d implements zls {
    public final /* synthetic */ w A;
    public final /* synthetic */ i a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ m3u0 w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ sls y;
    public final /* synthetic */ tse z;

    public d(i iVar, f530 f530Var, m3u0 m3u0Var, m3u0 m3u0Var2, oz40 oz40Var, sls slsVar, tse tseVar, w wVar) {
        this.a = iVar;
        this.b = f530Var;
        this.c = m3u0Var;
        this.w = m3u0Var2;
        this.x = oz40Var;
        this.y = slsVar;
        this.z = tseVar;
        this.A = wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o430 o430Var;
        tls tlsVar;
        boolean z;
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
        m3u0 m3u0Var = this.c;
        ac0 ac0Var = (ac0) m3u0Var.getValue();
        boolean z2 = ac0Var instanceof yb0;
        o430 o430Var2 = did.a;
        f530 f530Var = this.b;
        if (z2) {
            btsVar3.e0(-269895444);
            yb0 yb0Var = (yb0) ((ac0) m3u0Var.getValue());
            btsVar3.e0(-269891749);
            i iVar = this.a;
            boolean e = fidVar.e(iVar);
            Object Q = btsVar3.Q();
            if (e || Q == o430Var2) {
                Q = new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$1$1(1, iVar, i.class, "onFilterClicked", "onFilterClicked(Ljava/lang/String;)V", 0);
                btsVar3.o0(Q);
            }
            btsVar3.t(false);
            tls tlsVar2 = (tls) ((tfx) Q);
            btsVar3.e0(-269889575);
            boolean e2 = fidVar.e(iVar);
            Object Q2 = btsVar3.Q();
            if (e2 || Q2 == o430Var2) {
                Q2 = new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$2$1(1, iVar, i.class, "onChatClicked", "onChatClicked(Ljava/lang/String;)V", 0);
                btsVar3.o0(Q2);
            }
            btsVar3.t(false);
            tls tlsVar3 = (tls) ((tfx) Q2);
            btsVar3.e0(-269887397);
            boolean e3 = fidVar.e(iVar);
            Object Q3 = btsVar3.Q();
            if (e3 || Q3 == o430Var2) {
                Q3 = new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$3$1(1, iVar, i.class, "onFilterRemoved", "onFilterRemoved(Ljava/lang/String;)V", 0);
                btsVar3.o0(Q3);
            }
            btsVar3.t(false);
            tls tlsVar4 = (tls) ((tfx) Q3);
            btsVar3.e0(-269885223);
            boolean e4 = fidVar.e(iVar);
            Object Q4 = btsVar3.Q();
            if (e4 || Q4 == o430Var2) {
                Q4 = new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$4$1(1, iVar, i.class, "onChatRemoved", "onChatRemoved(Ljava/lang/String;)V", 0);
                btsVar3.o0(Q4);
            }
            btsVar3.t(false);
            tls tlsVar5 = (tls) ((tfx) Q4);
            btsVar3.e0(-269882912);
            boolean e5 = fidVar.e(iVar);
            Object Q5 = btsVar3.Q();
            if (e5 || Q5 == o430Var2) {
                Q5 = new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$5$1(1, iVar, i.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
                btsVar3.o0(Q5);
            }
            btsVar3.t(false);
            tls tlsVar6 = (tls) ((tfx) Q5);
            btsVar3.e0(-269880353);
            if (((Boolean) this.w.getValue()).booleanValue() && lpb1.d(fidVar)) {
                tlsVar = tlsVar4;
                z = true;
            } else {
                tlsVar = tlsVar4;
                z = false;
            }
            btsVar3.t(false);
            f530 c = ljs0.c(ljs0.u(f530Var, null, 3), 1.0f);
            tls tlsVar7 = tlsVar;
            o430Var = o430Var2;
            g.a(yb0Var, tlsVar2, tlsVar3, tlsVar7, tlsVar5, tlsVar6, z, c, fidVar, 0);
            btsVar3.t(false);
        } else {
            o430Var = o430Var2;
            if (!jl40.l(ac0Var, zb0.a)) {
                throw unr0.y(-269897504, btsVar3, false);
            }
            btsVar3.e0(-269872505);
            xb0.b(f530Var.k(ljs0.c), fidVar, 0);
            btsVar3.t(false);
        }
        final oz40 oz40Var = this.x;
        final CancelDialogSource cancelDialogSource = (CancelDialogSource) oz40Var.getValue();
        btsVar3.e0(-269869063);
        if (cancelDialogSource != null) {
            btsVar3.e0(561433674);
            boolean k = btsVar3.k(cancelDialogSource);
            final tse tseVar = this.z;
            boolean e6 = k | fidVar.e(tseVar);
            final w wVar = this.A;
            boolean k2 = e6 | btsVar3.k(wVar);
            Object Q6 = btsVar3.Q();
            if (k2 || Q6 == o430Var) {
                Q6 = new sls() { // from class: com.yandex.messaging.ui.settings.folder.addChat.c
                    @Override // defpackage.sls
                    public final Object invoke() {
                        if (CancelDialogSource.this == CancelDialogSource.SwipeDismiss) {
                            tje.N(tseVar, null, null, new AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$6$1$1$1(wVar, null), 3);
                        }
                        oz40Var.setValue(null);
                        return zy11.a;
                    }
                };
                btsVar3.o0(Q6);
            }
            btsVar3.t(false);
            keb1.a(0, fidVar, this.y, (sls) Q6, null);
        }
        btsVar3.t(false);
        btsVar3.t(true);
        return zy11.a;
    }
}
