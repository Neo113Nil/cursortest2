package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.d;
import defpackage.akk0;
import defpackage.bdk0;
import defpackage.qpk0;
import defpackage.xck0;
import defpackage.z8k0;
import java.util.ArrayList;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class d extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final RecyclerView R;
    public final xck0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public int U;

    public d(RecyclerView recyclerView, xck0 xck0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(recyclerView);
        this.R = recyclerView;
        this.S = xck0Var;
        this.T = gVar;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.S.applyTheme(themeType);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        bdk0 bdk0Var = (bdk0) obj;
        akk0 akk0Var = bdk0Var.d;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 2));
        b0(new RideCardButtonsViewHolder$processAnalytics$2(this, akk0Var, null));
        ArrayList arrayList = bdk0Var.c;
        final int size = arrayList.size();
        final boolean z = this.U != size;
        this.S.submitList(arrayList, new Runnable() { // from class: cdk0
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = this;
                RecyclerView recyclerView = dVar.R;
                if (z) {
                    recyclerView.setAlpha(0.1f);
                    cma1.I(recyclerView);
                }
                int i = dVar.U;
                int i2 = size;
                if (i > 0 && i != i2) {
                    recyclerView.invalidateItemDecorations();
                }
                recyclerView.scrollToPosition(0);
                dVar.U = i2;
            }
        });
    }
}
