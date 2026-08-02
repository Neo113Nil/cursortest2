package com.ybsdk.feature.qr.internal.screens.container;

import com.ybsdk.core.analytics.generated.WalletLoyaltyWidgetPageTypeCommon;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.aye0;
import defpackage.d7g0;
import defpackage.ds31;
import defpackage.ey4;
import defpackage.j3h;
import defpackage.jdg0;
import defpackage.jqr;
import defpackage.l0p;
import defpackage.nm90;
import defpackage.o6g0;
import defpackage.p370;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8c0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tv3;
import defpackage.uc5;
import defpackage.um90;
import defpackage.v5c0;
import defpackage.v6g0;
import defpackage.vfc0;
import defpackage.wlp;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final j3h B;
    public final vfc0 C;
    public pzt0 D;
    public final com.ybsdk.feature.passes.widget.internal.a E;

    public a(v6g0 v6g0Var, d7g0 d7g0Var, v5c0 v5c0Var, um90 um90Var, jdg0 jdg0Var, j3h j3hVar, vfc0 vfc0Var, aye0 aye0Var, QrContainerScreenParams qrContainerScreenParams) {
        super(new r8c0(qrContainerScreenParams, v5c0Var, jdg0Var, d7g0Var, 2), v6g0Var);
        this.B = j3hVar;
        this.C = vfc0Var;
        com.ybsdk.feature.passes.widget.internal.a aVar = (com.ybsdk.feature.passes.widget.internal.a) v5c0Var.b;
        this.E = aVar;
        p370 p370Var = um90Var.a;
        l0p l0pVar = aVar.a.H;
        WalletLoyaltyWidgetPageTypeCommon walletLoyaltyWidgetPageTypeCommon = aVar.d;
        p370 p370Var2 = aVar.c;
        b bVar = ((tv3) p370Var2.c).a;
        bVar.getClass();
        boolean isEnabled = ((CommonFeatureFlag) bVar.d(wlp.d0).getData()).isEnabled();
        boolean A = p370Var2.A();
        Boolean valueOf = Boolean.valueOf(p370Var2.z());
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("page_type", walletLoyaltyWidgetPageTypeCommon.getOriginalValue());
        linkedHashMap.put("agreement_check_enabled", Boolean.valueOf(isEnabled));
        linkedHashMap.put("widget_shown", Boolean.valueOf(A));
        linkedHashMap.put("local_agreement_accepted", valueOf);
        l0pVar.a.a("wallet_loyalty_cards_widget.container.show_attempt", linkedHashMap);
        if (p370Var.A()) {
            b0();
            e.H(ds31.a(this), new jqr((ey4) aye0Var.b, new QrContainerViewModel$observeWalletEvents$1(this, null), 3));
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D = null;
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        o6g0 o6g0Var;
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            o6g0Var = (o6g0) value;
        } while (!r0Var.k(value, o6g0.a(o6g0Var, 0, new nm90(new t8j0(), o6g0Var.d.b), 7)));
        this.D = tje.N(ds31.a(this), null, null, new QrContainerViewModel$loadPassesWidget$2(this, null), 3);
    }

    public final void c0(int i) {
        r0 r0Var;
        Object value;
        if (kotlin.collections.a.S(i, ((o6g0) X()).a) == QrContainerItem.QR_GENERATE) {
            ((CommonFeatureFlag) ((b) this.C.b).d(wlp.M).getData()).isEnabled();
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, o6g0.a((o6g0) value, i, null, 11)));
    }
}
