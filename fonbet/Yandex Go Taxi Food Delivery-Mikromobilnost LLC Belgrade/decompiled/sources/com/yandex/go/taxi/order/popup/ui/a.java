package com.yandex.go.taxi.order.popup.ui;

import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import com.yandex.go.zone.dto.objects.j3;
import defpackage.a60;
import defpackage.a8e0;
import defpackage.b8e0;
import defpackage.c8e0;
import defpackage.d8e0;
import defpackage.f9e0;
import defpackage.jl40;
import defpackage.qu;
import defpackage.t7e0;
import defpackage.tje;
import defpackage.u7e0;
import defpackage.usc;
import defpackage.v770;
import defpackage.v7e0;
import defpackage.w511;
import defpackage.wsc;
import defpackage.x380;
import defpackage.y380;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;

/* loaded from: classes14.dex */
public final class a implements f9e0 {
    public final y380 a;
    public final x380 b;

    public a(y380 y380Var, x380 x380Var) {
        this.a = y380Var;
        this.b = x380Var;
    }

    @Override // defpackage.f9e0
    public final void c(d8e0 d8e0Var) {
        boolean z = d8e0Var instanceof u7e0;
        y380 y380Var = this.a;
        if (!z) {
            y380Var.getClass();
            if ((d8e0Var instanceof t7e0) || (d8e0Var instanceof a8e0) || (d8e0Var instanceof b8e0) || (d8e0Var instanceof c8e0) || (d8e0Var instanceof v7e0)) {
                return;
            }
            w511.b();
            return;
        }
        u7e0 u7e0Var = (u7e0) d8e0Var;
        wsc wscVar = y380Var.z;
        usc uscVar = y380Var.x;
        wscVar.a(uscVar, u7e0Var.e);
        wscVar.b(uscVar, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
        a3 a3Var = u7e0Var.g;
        if (a3Var instanceof PopupUiControl.Deeplink) {
            ((a60) y380Var.A).c(((PopupUiControl.Deeplink) a3Var).a, v770.u);
        } else if (a3Var instanceof PopupUiControl.CancelOrders) {
            tje.N(y380Var.C, null, null, new OrderPopupPresenter$cancelOrders$1(y380Var, (PopupUiControl.CancelOrders) a3Var, null), 3);
        } else if (!(a3Var instanceof PopupUiControl.OpenSummaryAddress) && !jl40.l(a3Var, e3.INSTANCE) && !jl40.l(a3Var, j3.INSTANCE)) {
            w511.b();
            return;
        }
        y380Var.y.a.r(new qu(9));
    }

    @Override // defpackage.f9e0
    public final void e() {
        y380 y380Var = this.a;
        y380Var.z.b(y380Var.x, CommunicationModalAnalyticsData$CloseReason.SWIPE);
    }

    @Override // defpackage.f9e0
    public final void g() {
        y380 y380Var = this.a;
        y380Var.z.b(y380Var.x, CommunicationModalAnalyticsData$CloseReason.TAP_OUTSIDE);
    }

    @Override // defpackage.f9e0
    public final void onAttachedToWindow() {
        x380 x380Var = this.b;
        y380 y380Var = this.a;
        y380Var.Bg(x380Var);
        y380Var.z.c(y380Var.x);
    }

    @Override // defpackage.f9e0
    public final void onBackPressed() {
        y380 y380Var = this.a;
        y380Var.z.b(y380Var.x, CommunicationModalAnalyticsData$CloseReason.SYSTEM_BACK);
    }

    @Override // defpackage.f9e0
    public final void onDetachedFromWindow() {
        this.a.Cg();
    }
}
