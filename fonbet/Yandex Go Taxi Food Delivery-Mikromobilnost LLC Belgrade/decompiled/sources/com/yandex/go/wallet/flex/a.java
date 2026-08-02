package com.yandex.go.wallet.flex;

import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import defpackage.c941;
import defpackage.cst;
import defpackage.csz;
import defpackage.d0m;
import defpackage.ffx;
import defpackage.fgl0;
import defpackage.jff;
import defpackage.jjr;
import defpackage.jp50;
import defpackage.k841;
import defpackage.l131;
import defpackage.l841;
import defpackage.ljr;
import defpackage.mir;
import defpackage.mj31;
import defpackage.mjr;
import defpackage.mqg0;
import defpackage.nbs0;
import defpackage.nhr;
import defpackage.p841;
import defpackage.rol0;
import defpackage.s59;
import defpackage.ulr;
import defpackage.vlr;
import defpackage.wgr;
import defpackage.y841;
import defpackage.ym5;
import java.util.Collections;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class a {
    public final p841 a;
    public final wgr b;
    public final jff c;
    public final com.yandex.go.wallet.data.a d;
    public final fgl0 e;
    public final mir f;
    public final jp50 g;
    public final y841 h;
    public final cst i;
    public final com.yandex.go.wallet.divkit.b j;
    public final c941 k;
    public final mjr l;
    public final com.yandex.div.core.expression.variables.a m;

    public a(p841 p841Var, wgr wgrVar, jff jffVar, com.yandex.go.wallet.data.a aVar, fgl0 fgl0Var, mir mirVar, jp50 jp50Var, y841 y841Var, cst cstVar, com.yandex.go.wallet.divkit.b bVar, c941 c941Var, mjr mjrVar, com.yandex.div.core.expression.variables.a aVar2) {
        this.a = p841Var;
        this.b = wgrVar;
        this.c = jffVar;
        this.d = aVar;
        this.e = fgl0Var;
        this.f = mirVar;
        this.g = jp50Var;
        this.h = y841Var;
        this.i = cstVar;
        this.j = bVar;
        this.k = c941Var;
        this.l = mjrVar;
        this.m = aVar2;
    }

    public final k841 a(l841 l841Var, nbs0 nbs0Var) {
        mj31 mj31Var = new mj31(l841Var.b());
        vlr vlrVar = new vlr("Wallet", null, new ym5(1, mj31Var, this), null, null, new ulr(2), null, this.c, Collections.singletonList(new flex.signals.a(nbs0Var)), null, null, this.g, null, null, null, null, null, null, null, 1043638);
        ljr a = this.l.a(jjr.y, this.m);
        vlr a2 = vlr.a(vlrVar, null, new s59(this.e.a(l841Var.a(), "Wallet", l841Var.c(), a, new csz(8, vlrVar))), 1048543);
        d0m x = ((Yatagan$FeedSdkComponent) this.f.a(a2)).x();
        rol0 rol0Var = new rol0(new WalletFlexConfigFactory$createLoadDocumentFlow$1(this, true, x, false, null));
        g X = e.X(mj31Var.x(), new WalletFlexConfigFactory$createFullscreenConfigBundle$$inlined$flatMapLatest$1(null, this, x));
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        g X2 = e.X(b, new WalletFlexConfigFactory$createFullscreenConfigBundle$$inlined$flatMapLatest$2(null, this, x));
        return new k841(new nhr(a2, null, e.K(rol0Var, X, X2, this.b.b()), null, null, Integer.valueOf(mqg0.transparent), null, a, "wallet", this.a, 4314), new l131(7, b));
    }
}
