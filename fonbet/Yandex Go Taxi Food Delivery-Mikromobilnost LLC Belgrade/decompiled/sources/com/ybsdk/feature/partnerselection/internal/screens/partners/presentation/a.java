package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import defpackage.aab1;
import defpackage.aks;
import defpackage.bd90;
import defpackage.bj90;
import defpackage.bks;
import defpackage.br51;
import defpackage.cj90;
import defpackage.dzh0;
import defpackage.ev31;
import defpackage.fj90;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.job1;
import defpackage.kp50;
import defpackage.l1z;
import defpackage.nj90;
import defpackage.ntz0;
import defpackage.oj90;
import defpackage.pj90;
import defpackage.pqy;
import defpackage.qj90;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rbv;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.t8j0;
import defpackage.u290;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.w511;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements ev31 {
    public qj90 a;

    public static Text.Resource a(bj90 bj90Var) {
        TransferScenario transferScenario = bj90Var.d;
        if ((transferScenario == null ? -1 : cj90.a[transferScenario.ordinal()]) == 1) {
            return unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_crossborder_header_subtitle);
        }
        return null;
    }

    public static Text.Resource b(bj90 bj90Var) {
        TransferScenario transferScenario = bj90Var.d;
        if ((transferScenario == null ? -1 : cj90.a[transferScenario.ordinal()]) == 1) {
            return unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_crossborder_header_title);
        }
        return null;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        rbv f;
        boolean z;
        bj90 bj90Var = (bj90) obj;
        u8j0 u8j0Var = bj90Var.c;
        br51 br51Var = bj90Var.a;
        bks bksVar = null;
        bksVar = null;
        if (br51Var != null) {
            ntz0 ntz0Var = new ntz0(0);
            Text.Resource b = b(bj90Var);
            Text.Resource a = a(bj90Var);
            Text.Constant i = g8e.i(Text.Companion, br51Var.a);
            String str = br51Var.b;
            Text.Constant constant = str != null ? new Text.Constant(str) : null;
            ActionButtonEntity actionButtonEntity = br51Var.d;
            Text text = actionButtonEntity != null ? actionButtonEntity.getText() : null;
            ActionButtonEntity actionButtonEntity2 = br51Var.e;
            Text text2 = actionButtonEntity2 != null ? actionButtonEntity2.getText() : null;
            ThemedImageUrlEntity themedImageUrlEntity = br51Var.c;
            if (themedImageUrlEntity != null && (f = job1.f(themedImageUrlEntity, new bd90(4))) != null) {
                bksVar = new bks(f, new aks(kp50.r(200), kp50.r(120)), 4);
            }
            return new oj90(ntz0Var, b, a, new com.ybsdk.widgets.common.c(i, constant, bksVar, true, text, text2));
        }
        if (!(u8j0Var instanceof r8j0)) {
            if (u8j0Var instanceof s8j0) {
                return new nj90(bj90Var.b, new ntz0(0), b(bj90Var), a(bj90Var), r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
            if (u8j0Var instanceof t8j0) {
                l1z l1zVar = l1z.a;
                return new pj90(scc.g(l1zVar, l1zVar, l1zVar), bj90Var.b, new ntz0(0), b(bj90Var), a(bj90Var));
            }
            w511.b();
            return null;
        }
        fj90 fj90Var = (fj90) ((r8j0) u8j0Var).a;
        List c = aab1.c(fj90Var.a, new u290(10, fj90Var), PartnersStateMapper$mapPartnerStatus$1$content$2.b);
        String str2 = fj90Var.c;
        boolean z2 = bj90Var.b;
        ntz0 ntz0Var2 = new ntz0(0);
        Text.Resource b2 = b(bj90Var);
        Text.Resource a2 = a(bj90Var);
        qj90 qj90Var = this.a;
        boolean z3 = pqy.a(qj90Var != null ? qj90Var.a : null) != pqy.a(c);
        qj90 qj90Var2 = this.a;
        List list = qj90Var2 != null ? qj90Var2.a : null;
        if (pqy.a(c)) {
            if (!jl40.l(list != null ? Integer.valueOf(list.size()) : null, Integer.valueOf(c.size()))) {
                z = true;
                qj90 qj90Var3 = new qj90(c, str2, z2, ntz0Var2, b2, a2, z3, z);
                this.a = qj90Var3;
                return qj90Var3;
            }
        }
        z = false;
        qj90 qj90Var32 = new qj90(c, str2, z2, ntz0Var2, b2, a2, z3, z);
        this.a = qj90Var32;
        return qj90Var32;
    }
}
