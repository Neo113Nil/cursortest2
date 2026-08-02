package com.yandex.payment.divkit.bind;

import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.nfcscanner.tools.c;
import com.yandex.payment.sdk.ui.CardInput$State;
import defpackage.bvf0;
import defpackage.crf;
import defpackage.ds31;
import defpackage.dy40;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.p560;
import defpackage.px;
import defpackage.qu5;
import defpackage.rwo;
import defpackage.sls;
import defpackage.tje;
import defpackage.u2l;
import defpackage.uvq;
import defpackage.vv90;
import defpackage.yr31;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final dy40 A;
    public final dy40 B;
    public final dy40 C;
    public final dy40 D;
    public PaymentMethod E;
    public CardPaymentSystem F;
    public CardInput$State G;
    public sls H;
    public crf I;
    public crf J;
    public c K;
    public Boolean L;
    public final dy40 M;
    public final dy40 N;
    public final dy40 O;
    public boolean P;
    public boolean Q;
    public final u2l R;
    public final n0 S;
    public final uvq b;
    public final rwo c;
    public final vv90 w;
    public final i3y x;
    public final i3y y;
    public boolean z;

    public b(uvq uvqVar, rwo rwoVar, vv90 vv90Var) {
        this.b = uvqVar;
        this.c = rwoVar;
        this.w = vv90Var;
        final int i = 0;
        this.x = kotlin.a.a(new sls(this) { // from class: irf
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        return new qu5(bVar.c);
                    default:
                        return new p560(bVar.c);
                }
            }
        });
        final int i2 = 1;
        this.y = kotlin.a.a(new sls(this) { // from class: irf
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        return new qu5(bVar.c);
                    default:
                        return new p560(bVar.c);
                }
            }
        });
        Boolean bool = Boolean.TRUE;
        this.A = new dy40(bool);
        this.B = new dy40();
        this.C = new dy40();
        this.D = new dy40(bool);
        this.F = CardPaymentSystem.Unknown;
        this.G = CardInput$State.CARD_NUMBER;
        this.M = new dy40();
        this.N = new dy40();
        this.O = new dy40();
        this.R = new u2l(new px(i2, this));
        this.S = ffx.c(1, 1, null, 4);
    }

    @Override // defpackage.yr31
    public final void V() {
        bvf0.j(W().i, null);
    }

    public final qu5 W() {
        return (qu5) this.x.getValue();
    }

    public final p560 X() {
        return (p560) this.y.getValue();
    }

    public final void Y(boolean z, boolean z2, boolean z3, boolean z4) {
        tje.N(ds31.a(this), null, null, new DKBindCardViewModel$loadAndShowDivJson$1(this, z2, z3, z4, z, null), 3);
    }
}
