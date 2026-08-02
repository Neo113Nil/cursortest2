package com.yandex.go.tips.navigation;

import android.app.Activity;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.tips.navigation.a;
import defpackage.a3y0;
import defpackage.db0;
import defpackage.dpb;
import defpackage.fga0;
import defpackage.h55;
import defpackage.i130;
import defpackage.jl40;
import defpackage.jwx0;
import defpackage.lux;
import defpackage.m950;
import defpackage.pzt0;
import defpackage.rgz0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.yvf0;
import ru.yandex.taxi.cashback.interactors.i;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.modal.LoadingModalView;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final Activity D;
    public final rgz0 E;
    public final yvf0 F;
    public final jwx0 G;
    public final c H;
    public final lux I;
    public final i J;
    public final ru.yandex.taxi.deeplinks.b K;
    public final i130 L;
    public final a3y0 M;
    public LoadingModalView N;
    public pzt0 O;

    public a(Activity activity, rgz0 rgz0Var, yvf0 yvf0Var, jwx0 jwx0Var, c cVar, lux luxVar, i iVar, ru.yandex.taxi.deeplinks.b bVar, i130 i130Var) {
        super(null);
        this.D = activity;
        this.E = rgz0Var;
        this.F = yvf0Var;
        this.G = jwx0Var;
        this.H = cVar;
        this.I = luxVar;
        this.J = iVar;
        this.K = bVar;
        this.L = i130Var;
        this.M = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "DeeplinkTipsRouter");
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ru.yandex.taxi.deeplinks.a.c(o(), this.K, new db0(1, this));
        if (jl40.l(((com.yandex.go.payments.paymentlist.data.c) this.J.a).g.b.g(), PaymentMethods.x)) {
            this.O = tje.N(o(), null, null, new DeeplinkTipsRouterImpl$onAttach$2(this, null), 3);
        } else {
            P();
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = null;
        LoadingModalView loadingModalView = this.N;
        if (loadingModalView != null) {
            loadingModalView.dismiss();
        }
        this.N = null;
    }

    public final void P() {
        if (((fga0) this.E).d().isEmpty()) {
            final int i = 1;
            z((m950) this.G.get(), new sy60(this) { // from class: t3h
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i2 = i;
                    a aVar = this.b;
                    switch (i2) {
                        case 0:
                            aVar.r(new qu(9));
                            break;
                        default:
                            aVar.r(new qu(9));
                            break;
                    }
                }
            });
        } else {
            final int i2 = 0;
            z((m950) this.F.get(), new sy60(this) { // from class: t3h
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i22 = i2;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            aVar.r(new qu(9));
                            break;
                        default:
                            aVar.r(new qu(9));
                            break;
                    }
                }
            });
        }
    }
}
