package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import defpackage.akk0;
import defpackage.gmk0;
import defpackage.h12;
import defpackage.o2y0;
import defpackage.qpk0;
import defpackage.z8k0;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class h extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final o2y0 R;
    public final com.yandex.go.taxi.order.communications.g S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public final h12 U;

    public h(RecyclerView recyclerView, o2y0 o2y0Var, com.yandex.go.taxi.order.communications.g gVar, com.yandex.go.taxi.order.details.v2.analytics.g gVar2, h12 h12Var) {
        super(recyclerView);
        this.R = o2y0Var;
        this.S = gVar;
        this.T = gVar2;
        this.U = h12Var;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.S.applyTheme(themeType);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        gmk0 gmk0Var = (gmk0) obj;
        this.U.invoke(gmk0Var.e);
        akk0 akk0Var = gmk0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 5));
        b0(new RideCardCommunicationsListItemViewHolder$processAnalytics$2(this, akk0Var, null));
        this.S.l(gmk0Var.d, this.R, PromoPlaqueAnalytics$Screen.RIDE_CARD);
    }
}
