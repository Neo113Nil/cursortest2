package defpackage;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.c;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.d;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.f;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.g;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.h;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.i;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.j;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.k;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.l;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.m;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.n;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.o;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.q;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.r;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.s;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.t;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.u;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.v;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.w;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.x;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.y;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.z;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.data.e;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;

/* loaded from: classes14.dex */
public final class nz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;

    public nz(b00 b00Var, ChatRequest chatRequest, long j) {
        this.a = 1;
        this.b = b00Var;
        this.w = chatRequest;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        Object obj = this.w;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b00 b00Var = (b00) obj2;
                i00 a = b00.a(b00Var);
                e eVar = b00Var.e;
                ai80 ai80Var = b00Var.h;
                a.a(new mc9(this.c, (OrganizationChangeSource) obj, eVar, ai80Var));
                break;
            case 1:
                b00 b00Var2 = (b00) obj2;
                b00.a(b00Var2).a(new jpq0((ChatRequest) obj, this.c, b00Var2.f, b00Var2.g));
                break;
            case 2:
                ((rer) obj2).a.postDelayed(this, j);
                ((sls) obj).invoke();
                break;
            case 3:
                ((MtMainFlexModalView) obj2).getViewTreeObserver().registerFrameCommitCallback(new ii30(j, (MtMainFlexModalView) obj));
                break;
            case 4:
                ((b) obj2).U.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 5:
                ((c) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 6:
                ((d) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 7:
                ((f) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 8:
                ((g) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 9:
                ((h) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 10:
                ((RideCardCompactView) obj2).getViewTreeObserver().registerFrameCommitCallback(new xsr(j, (RideCardCompactView) obj, 1));
                break;
            case 11:
                ((i) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 12:
                ((j) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 13:
                ((k) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 14:
                ((l) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 15:
                ((m) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 16:
                ((j8y) obj2).b(SystemClock.elapsedRealtimeNanos() - j, (vfk0) obj);
                break;
            case 17:
                ((n) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 18:
                ((o) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 19:
                ((RideCardModalView) obj2).getViewTreeObserver().registerFrameCommitCallback(new xsr(j, (RideCardModalView) obj, 2));
                break;
            case 20:
                ((q) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 21:
                ((r) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 22:
                ((s) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 23:
                ((t) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 24:
                ((u) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 25:
                ((v) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 26:
                ((w) obj2).T.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 27:
                ((x) obj2).V.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            case 28:
                ((y) obj2).U.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
            default:
                ((z) obj2).S.d(SystemClock.elapsedRealtimeNanos() - j, (wrs0) obj, RideCardPerfAnalytics$RenderViewType.VIEW);
                break;
        }
    }

    public /* synthetic */ nz(long j, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = j;
        this.b = obj;
        this.w = obj2;
    }

    public /* synthetic */ nz(FrameLayout frameLayout, FrameLayout frameLayout2, long j, FrameLayout frameLayout3, int i) {
        this.a = i;
        this.b = frameLayout2;
        this.c = j;
        this.w = frameLayout3;
    }

    public /* synthetic */ nz(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.w = obj2;
    }
}
