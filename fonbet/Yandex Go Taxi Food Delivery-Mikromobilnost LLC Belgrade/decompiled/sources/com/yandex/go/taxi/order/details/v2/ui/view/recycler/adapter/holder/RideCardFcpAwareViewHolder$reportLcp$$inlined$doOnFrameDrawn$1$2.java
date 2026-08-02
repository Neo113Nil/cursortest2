package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.Choreographer;
import defpackage.j8y;
import defpackage.vfk0;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardFcpAwareViewHolder$reportLcp$$inlined$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ j8y $callback$inlined;
    final /* synthetic */ vfk0 $sourceType$inlined;
    final /* synthetic */ long $start;

    public RideCardFcpAwareViewHolder$reportLcp$$inlined$doOnFrameDrawn$1$2(long j, j8y j8yVar, vfk0 vfk0Var) {
        this.$start = j;
        this.$callback$inlined = j8yVar;
        this.$sourceType$inlined = vfk0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.$callback$inlined.b(SystemClock.elapsedRealtimeNanos() - this.$start, this.$sourceType$inlined);
    }
}
