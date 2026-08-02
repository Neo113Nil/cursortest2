package com.yandex.go.ai_widget.router;

import android.content.Context;
import com.adjust.sdk.Constants;
import defpackage.b1;
import defpackage.eo1;
import defpackage.g191;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.pzt0;
import defpackage.qo1;
import defpackage.ra00;
import defpackage.tje;
import defpackage.tp1;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wp1;
import defpackage.xn1;
import defpackage.zp1;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b extends pgd {
    public final Context F;
    public final ra00 G;
    public final w030 H;
    public final com.yandex.go.ai_widget.data.a I;
    public final xn1 J;
    public final tp1 K;
    public final zp1 L;
    public pzt0 M;
    public final g191 N;
    public final mu5 O;

    public b(Context context, ra00 ra00Var, w030 w030Var, com.yandex.go.ai_widget.data.a aVar, xn1 xn1Var, tp1 tp1Var, zp1 zp1Var) {
        super(0);
        this.F = context;
        this.G = ra00Var;
        this.H = w030Var;
        this.I = aVar;
        this.J = xn1Var;
        this.K = tp1Var;
        this.L = zp1Var;
        this.N = new g191(this);
        this.O = new mu5(new eo1(1, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        U();
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }

    public final void U() {
        qo1 qo1Var = (qo1) this.x;
        if (qo1Var == null) {
            return;
        }
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        zp1 zp1Var = this.L;
        zp1Var.a = 0;
        zp1Var.x = null;
        zp1Var.y = null;
        r0 r0Var = (r0) zp1Var.c;
        r0Var.getClass();
        r0Var.m(null, wp1.a);
        b1 b1Var = this.J.a;
        String str = qo1Var.c;
        if (str == null) {
            str = Constants.DEEPLINK;
        }
        String str2 = qo1Var.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        if (str2 != null) {
            hashMap.put("batch_id", str2);
        }
        b1Var.a.a("AIWidget.TextsEvaluator.LoadingShown", hashMap, 1, new HashMap());
        this.M = tje.N(o(), null, null, new AiWidgetEvaluationRouter$loadCards$1(this, qo1Var, null), 3);
    }
}
