package com.yandex.go.chargers.order.active;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.gba;
import defpackage.gei0;
import defpackage.lba;
import defpackage.lys;
import defpackage.nna;
import defpackage.r1h0;
import defpackage.ytz;
import defpackage.zk9;
import defpackage.zo31;

/* loaded from: classes12.dex */
public final class a extends lys {
    public static final /* synthetic */ int V = 0;
    public final ytz S;
    public final nna T;
    public final gei0 U;

    public a(lba lbaVar, ytz ytzVar, nna nnaVar, gei0 gei0Var) {
        super(lbaVar);
        this.S = ytzVar;
        this.T = nnaVar;
        this.U = gei0Var;
        LottieAnimationView lottieAnimationView = lbaVar.b;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setRepeatCount(-1);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        zk9 zk9Var = (zk9) obj;
        d0(zk9Var);
        c0(zk9Var);
        ((lba) ((zo31) this.R)).d.setBackgroundResource(zk9Var.c instanceof gba ? r1h0.bg_chargers_order_banner_content : r1h0.bg_chargers_order_banner_content_ripple);
        Z(new AnimatedBannerViewHolder$bindAnimation$1(this, zk9Var, null), "ANIMATION_TASK_KEY", true);
        e.a(this, zk9Var.e, this.T, this.U);
    }

    public final void c0(zk9 zk9Var) {
        lba lbaVar = (lba) ((zo31) this.R);
        lbaVar.e.setVisibility(zk9Var.b.length() > 0 ? 0 : 8);
        lbaVar.e.setText(zk9Var.b);
    }

    public final void d0(zk9 zk9Var) {
        lba lbaVar = (lba) ((zo31) this.R);
        lbaVar.f.setVisibility(zk9Var.a.length() > 0 ? 0 : 8);
        lbaVar.f.setText(zk9Var.a);
    }
}
