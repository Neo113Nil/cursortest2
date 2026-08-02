package com.yandex.go.position_alert;

import android.content.Context;
import android.widget.TextView;
import defpackage.agt0;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.h55;
import defpackage.i130;
import defpackage.nce0;
import defpackage.oce0;
import defpackage.qke;
import defpackage.rce0;
import defpackage.sce0;
import defpackage.sta1;
import defpackage.tce0;
import defpackage.tq1;
import defpackage.u8w;
import defpackage.uce0;
import defpackage.uqb0;
import defpackage.w511;
import defpackage.wnb0;
import java.util.HashMap;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class b extends h55 implements uce0 {
    public final Context D;
    public final ah00 E;
    public final tq1 F;
    public final nce0 G;
    public final agt0 H;
    public final i130 I;
    public WarningModalView J;

    public b(Context context, ah00 ah00Var, tq1 tq1Var, nce0 nce0Var, agt0 agt0Var, i130 i130Var) {
        super(null);
        this.D = context;
        this.E = ah00Var;
        this.F = tq1Var;
        this.G = nce0Var;
        this.H = agt0Var;
        this.I = i130Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        WarningModalView warningModalView = this.J;
        if (warningModalView != null) {
            warningModalView.dismiss();
        }
        this.J = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tce0 tce0Var = (tce0) obj;
        boolean z = tce0Var instanceof sce0;
        Context context = this.D;
        if (!z) {
            if (!(tce0Var instanceof rce0)) {
                w511.b();
                return;
            }
            uqb0 uqb0Var = ((rce0) tce0Var).a;
            d dVar = new d(context);
            dVar.b = uqb0Var.a;
            dVar.c = uqb0Var.b;
            dVar.d = uqb0Var.c;
            dVar.g = new c(new wnb0(23, this));
            P(dVar);
            return;
        }
        oce0 oce0Var = ((sce0) tce0Var).a;
        u8w u8wVar = this.G.a;
        String str = oce0Var.a;
        String str2 = oce0Var.e;
        String a = sta1.a(oce0Var.h);
        int i = oce0Var.i;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        String valueOf2 = valueOf != null ? String.valueOf(valueOf.intValue()) : null;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("alert_id", str);
        }
        if (str2 != null) {
            hashMap.put("pin_zone_id", str2);
        }
        if (a != null) {
            hashMap.put("point_type", a);
        }
        if (valueOf2 != null) {
            hashMap.put("count", valueOf2);
        }
        u8wVar.a.a("PositionAlertDidShow", hashMap, 1, new HashMap());
        d dVar2 = new d(context);
        dVar2.b = oce0Var.b;
        dVar2.c = oce0Var.c;
        dVar2.d = oce0Var.d;
        dVar2.e = false;
        dVar2.f = this.E;
        dVar2.g = new a(this, oce0Var);
        P(dVar2);
        agt0 agt0Var = this.H;
        float f = agt0Var.b.b;
        gh00 gh00Var = (gh00) agt0Var.a;
        if (gh00Var.j() < f) {
            gh00Var.K(f);
        }
    }

    public final void P(d dVar) {
        TextView textView;
        TextView textView2;
        ButtonComponent buttonComponent;
        WarningModalView warningModalView = this.J;
        if (warningModalView == null || !warningModalView.isAttachedToWindow()) {
            WarningModalView warningModalView2 = new WarningModalView(dVar.a, dVar, null);
            this.I.a().k(warningModalView2, 3.0f, true);
            qke.E(warningModalView2.getContext(), HapticController$Effect.WARNING, false, 8);
            this.J = warningModalView2;
            return;
        }
        warningModalView.eventCallback = dVar.g;
        textView = warningModalView.titleView;
        textView.setText(dVar.b);
        textView2 = warningModalView.messageView;
        textView2.setText(dVar.c);
        buttonComponent = warningModalView.confirmButton;
        buttonComponent.setText(dVar.d);
    }
}
