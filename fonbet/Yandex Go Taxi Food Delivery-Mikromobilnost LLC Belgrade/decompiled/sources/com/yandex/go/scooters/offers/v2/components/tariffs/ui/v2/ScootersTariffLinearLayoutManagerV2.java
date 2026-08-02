package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.nsg0;
import defpackage.own0;
import defpackage.tje;
import defpackage.uqu;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffLinearLayoutManagerV2;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffLinearLayoutManagerV2 extends LinearLayoutManager {
    public final int b0;
    public final int c0;
    public final int d0;
    public int e0;

    public ScootersTariffLinearLayoutManagerV2(Context context) {
        super(context, 0, false);
        this.b0 = tje.u(16, context);
        this.c0 = tje.u(4, context);
        this.d0 = tje.u(8, context);
        this.e0 = context.getResources().getDimensionPixelSize(nsg0.scooters_tariff_v2_default_height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void D0(int i, int i2, View view) {
        if (view instanceof ShimmeringBar) {
            ru.yandex.taxi.design.utils.c.D(-1, this.e0, view);
            super.D0(0, 0, view);
        } else {
            if (view instanceof own0) {
                ((own0) view).applyLayoutBy(this.H - (this.b0 * 2), getItemCount());
            }
            super.D0(0, 0, view);
            this.e0 = view.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new uqu(this.c0));
        int i = this.d0;
        int i2 = this.b0;
        recyclerView.setPadding(i2, 0, i2, i);
        recyclerView.setItemAnimator(null);
    }
}
