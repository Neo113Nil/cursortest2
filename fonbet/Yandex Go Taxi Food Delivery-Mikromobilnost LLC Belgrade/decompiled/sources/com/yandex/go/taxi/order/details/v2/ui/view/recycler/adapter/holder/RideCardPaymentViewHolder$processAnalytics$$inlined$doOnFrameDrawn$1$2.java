package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import defpackage.wrs0;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardPaymentViewHolder$processAnalytics$$inlined$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ wrs0 $analytics$inlined;
    final /* synthetic */ long $start;
    final /* synthetic */ q this$0;

    public RideCardPaymentViewHolder$processAnalytics$$inlined$doOnFrameDrawn$1$2(long j, q qVar, wrs0 wrs0Var) {
        this.$start = j;
        this.this$0 = qVar;
        this.$analytics$inlined = wrs0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.this$0.S.d(SystemClock.elapsedRealtimeNanos() - this.$start, this.$analytics$inlined, RideCardPerfAnalytics$RenderViewType.VIEW);
    }
}
