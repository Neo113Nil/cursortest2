package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.akk0;
import defpackage.css0;
import defpackage.djk0;
import defpackage.ejk0;
import defpackage.g1a0;
import defpackage.hlk0;
import defpackage.ilk0;
import defpackage.jlk0;
import defpackage.klk0;
import defpackage.tss0;
import defpackage.v8a0;
import defpackage.w511;
import defpackage.z0a0;
import defpackage.z8k0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class q extends a {
    public static final /* synthetic */ int U = 0;
    public final z0a0 T;

    public q(djk0 djk0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar, z0a0 z0a0Var) {
        super(djk0Var, gVar);
        this.T = z0a0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        klk0 klk0Var = (klk0) obj;
        akk0 akk0Var = klk0Var.i;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 14));
        b0(new RideCardPaymentViewHolder$processAnalytics$2(this, akk0Var, null));
        d0(klk0Var.c);
        css0 css0Var = klk0Var.d;
        ejk0 ejk0Var = this.R;
        ejk0Var.renderBody(css0Var);
        tss0 tss0Var = klk0Var.e;
        akk0 akk0Var2 = klk0Var.i;
        ejk0Var.a(tss0Var, akk0Var2);
        ejk0Var.setAction(klk0Var.f, akk0Var2);
        ejk0Var.renderLoading(klk0Var.g);
        ejk0Var.setColor(klk0Var.h);
    }

    public final void d0(jlk0 jlk0Var) {
        djk0 djk0Var = (djk0) this.R;
        if (jlk0Var instanceof ilk0) {
            djk0Var.renderLead(((ilk0) jlk0Var).a);
            return;
        }
        if (!(jlk0Var instanceof hlk0)) {
            w511.b();
            return;
        }
        Object obj = djk0Var.a;
        ListItemComponent listItemComponent = obj instanceof ListItemComponent ? (ListItemComponent) obj : null;
        if (listItemComponent == null) {
            return;
        }
        v8a0 v8a0Var = ((hlk0) jlk0Var).a;
        if (v8a0Var != null) {
            ((g1a0) this.T).b(listItemComponent.getLeadImageView(), v8a0Var.b);
        } else {
            listItemComponent.clearLeadView();
        }
    }
}
