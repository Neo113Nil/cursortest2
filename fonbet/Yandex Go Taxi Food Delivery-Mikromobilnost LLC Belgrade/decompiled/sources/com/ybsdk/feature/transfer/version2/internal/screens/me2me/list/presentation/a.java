package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove;
import defpackage.bt3;
import defpackage.ds31;
import defpackage.ks3;
import defpackage.l0p;
import defpackage.ls3;
import defpackage.p73;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.us3;
import defpackage.uza;
import defpackage.w511;
import defpackage.y5e;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a C;
    public final us3 D;
    public pzt0 E;

    public a(bt3 bt3Var, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a aVar, us3 us3Var) {
        super(new p73(15), bt3Var);
        this.B = tfl0Var;
        this.C = aVar;
        this.D = us3Var;
        us3Var.a.I.a.a("me2me_pull_debit.permission_list.open", null);
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new AutoPullsViewModel$loadPermissions$1(this, null), 3);
    }

    public final void b0() {
        this.B.e();
    }

    public final void c0(ks3 ks3Var, boolean z) {
        Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove;
        ls3 ls3Var;
        String str = ks3Var.b;
        l0p l0pVar = this.D.a.I;
        if (z) {
            me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove = Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove.YES;
        } else {
            if (z) {
                w511.b();
                return;
            }
            me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove = Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove.NO;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        byte[] bArr = y5e.d;
        byte[] bArr2 = new byte[9];
        for (int i = 0; i < 9; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        linkedHashMap.put(new String(bArr2, uza.a), str);
        linkedHashMap.put("approve", me2mePullDebitEvents$Me2mePullDebitPermissionListChangeApproveApprove.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.permission_list.change.approve", linkedHashMap);
        if (!z || (ls3Var = (ls3) ((u8j0) X()).a()) == null) {
            return;
        }
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new AutoPullsViewModel$onRemoveItem$1(this, ks3Var, ls3Var, null), 3);
    }

    public final void d0(ks3 ks3Var) {
        String str = ks3Var.b;
        l0p l0pVar = this.D.a.I;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        byte[] bArr = y5e.d;
        byte[] bArr2 = new byte[9];
        for (int i = 0; i < 9; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        linkedHashMap.put(new String(bArr2, uza.a), str);
        l0pVar.a.a("me2me_pull_debit.permission_list.change.initiated", linkedHashMap);
    }

    public final void e0() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new AutoPullsViewModel$loadPermissions$1(this, null), 3);
    }
}
