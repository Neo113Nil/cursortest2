package com.ybsdk.feature.transfer.version2.internal.screens.fund;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.transfer.version2.internal.domain.b;
import defpackage.cos;
import defpackage.dj01;
import defpackage.dnr;
import defpackage.ds31;
import defpackage.kos;
import defpackage.nu01;
import defpackage.pz40;
import defpackage.rv3;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tg01;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v5r;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final FundDocsNoticeParams B;
    public final tfl0 C;
    public final dj01 D;
    public final b E;

    public a(FundDocsNoticeParams fundDocsNoticeParams, tfl0 tfl0Var, dj01 dj01Var, kos kosVar, tg01 tg01Var) {
        super(new v5r(26), kosVar);
        this.B = fundDocsNoticeParams;
        this.C = tfl0Var;
        this.D = dj01Var;
        this.E = tg01Var.a(TransferScenario.FUND);
        ((nu01) dj01Var).a.a(new rv3(DeeplinkHandleResult$DeeplinkType.ACTION, new dnr(9, this), 6));
        b0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new cos(new t8j0())));
        tje.N(ds31.a(this), null, null, new FundDocsNoticeViewModel$load$2(this, null), 3);
    }

    public final void c0() {
        this.C.e();
    }

    public final void d0() {
        b0();
    }

    public final void e0() {
        c0();
    }
}
