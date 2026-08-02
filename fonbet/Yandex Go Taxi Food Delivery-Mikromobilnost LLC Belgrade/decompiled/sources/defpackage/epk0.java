package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b0;
import yads.ts;

/* loaded from: classes14.dex */
public final class epk0 implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final /* synthetic */ Object c;
    public final Object w;

    public epk0(uv71 uv71Var, long j, xj61 xj61Var) {
        this.a = 2;
        this.c = uv71Var;
        this.b = j;
        this.w = xj61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                ((a0) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 1:
                ((b0) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            default:
                xj61 xj61Var = (xj61) obj2;
                if (xj61Var.a == ts.b) {
                    xj61Var.run();
                    ((uv71) obj).a.postDelayed(this, j);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ epk0(long j, qpk0 qpk0Var, wrs0 wrs0Var, int i) {
        this.a = i;
        this.b = j;
        this.w = qpk0Var;
        this.c = wrs0Var;
    }
}
