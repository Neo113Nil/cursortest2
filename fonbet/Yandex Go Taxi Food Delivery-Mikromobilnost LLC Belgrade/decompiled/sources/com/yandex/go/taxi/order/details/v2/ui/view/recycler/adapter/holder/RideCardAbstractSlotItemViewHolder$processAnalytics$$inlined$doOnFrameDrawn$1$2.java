package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import defpackage.wrs0;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardAbstractSlotItemViewHolder$processAnalytics$$inlined$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ wrs0 $analytics$inlined;
    final /* synthetic */ long $start;
    final /* synthetic */ RideCardPerfAnalytics$RenderViewType $viewType$inlined;
    final /* synthetic */ a this$0;

    public RideCardAbstractSlotItemViewHolder$processAnalytics$$inlined$doOnFrameDrawn$1$2(long j, a aVar, wrs0 wrs0Var, RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType) {
        this.$start = j;
        this.this$0 = aVar;
        this.$analytics$inlined = wrs0Var;
        this.$viewType$inlined = rideCardPerfAnalytics$RenderViewType;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.this$0.S.d(SystemClock.elapsedRealtimeNanos() - this.$start, this.$analytics$inlined, this.$viewType$inlined);
    }
}
