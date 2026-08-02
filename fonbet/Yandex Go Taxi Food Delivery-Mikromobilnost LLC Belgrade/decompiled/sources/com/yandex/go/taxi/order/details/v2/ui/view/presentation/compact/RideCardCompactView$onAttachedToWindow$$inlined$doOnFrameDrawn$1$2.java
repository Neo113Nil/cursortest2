package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.g6y0;
import defpackage.i6y0;
import defpackage.m810;
import defpackage.wmk0;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCompactView$onAttachedToWindow$$inlined$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ long $start;
    final /* synthetic */ RideCardCompactView this$0;

    public RideCardCompactView$onAttachedToWindow$$inlined$doOnFrameDrawn$1$2(long j, RideCardCompactView rideCardCompactView) {
        this.$start = j;
        this.this$0 = rideCardCompactView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        g6y0 g6y0Var;
        wmk0 wmk0Var = new wmk0(TaxiOrderSessionCheckpoint.FCP, m810.c((SystemClock.elapsedRealtimeNanos() - this.$start) / 1000000.0d), RideCardPresentationType.COMPACT, null, 18);
        g6y0Var = this.this$0.sessionTimelineTracker;
        ((i6y0) g6y0Var).b(wmk0Var);
    }
}
