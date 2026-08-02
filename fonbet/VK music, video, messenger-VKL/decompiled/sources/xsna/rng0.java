package xsna;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.log.L;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.d3k0;
import xsna.rng0;

/* compiled from: RouletteViewPresenter.kt */
/* loaded from: classes6.dex */
public final class rng0 implements nng0 {
    public final RouletteView b;
    public final ArrayList c = new ArrayList();
    public a d = a.b.a;
    public final TimeAnimator e;
    public long f;
    public final ValueAnimator g;
    public long h;
    public final TimeAnimator i;
    public long j;
    public long k;
    public final d3k0 l;
    public StickerStockItem m;
    public int n;
    public float o;
    public int p;
    public int q;
    public final sng0 r;

    /* compiled from: RouletteViewPresenter.kt */
    public static abstract class a {

        /* compiled from: RouletteViewPresenter.kt */
        /* renamed from: xsna.rng0$a$a, reason: collision with other inner class name */
        public static final class C3616a extends a {
            public final StickerStockItem a;

            public C3616a(StickerStockItem stickerStockItem) {
                this.a = stickerStockItem;
            }
        }

        /* compiled from: RouletteViewPresenter.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: RouletteViewPresenter.kt */
        public static final class c extends a {
            public final StickerStockItem a;

            public c(StickerStockItem stickerStockItem) {
                this.a = stickerStockItem;
            }
        }

        /* compiled from: RouletteViewPresenter.kt */
        public static final class d extends a {
            public final StickerStockItem a;

            public d(StickerStockItem stickerStockItem) {
                this.a = stickerStockItem;
            }
        }

        /* compiled from: RouletteViewPresenter.kt */
        public static final class e extends a {
            public static final e a = new e();
        }
    }

    public rng0(RouletteView rouletteView) {
        this.b = rouletteView;
        slj0 slj0Var = new slj0();
        n8z n8zVar = new n8z();
        n8zVar.b = 1.0f;
        this.l = new d3k0(slj0Var, n8zVar);
        this.o = 0.1f;
        this.p = -1;
        TimeAnimator timeAnimator = new TimeAnimator();
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: xsna.png0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                int i;
                rng0 rng0Var = rng0.this;
                RouletteView rouletteView2 = rng0Var.b;
                if (rouletteView2.isLaidOut()) {
                    if (!(rng0Var.d instanceof rng0.a.d) || (i = rng0Var.p) == -1) {
                        int b = an10.b(rng0Var.o * j2);
                        if (rng0Var.p != -1) {
                            rng0Var.q += b;
                        }
                        rouletteView2.g.scrollBy(b, 0);
                        return;
                    }
                    if (rng0Var.q >= i) {
                        rng0Var.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return;
                    }
                    int b2 = an10.b(rng0Var.o * j2);
                    if (rng0Var.p != -1) {
                        rng0Var.q += b2;
                    }
                    rouletteView2.g.scrollBy(b2, 0);
                }
            }
        });
        this.e = timeAnimator;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f, 4.0f);
        ofFloat.setDuration(1500L);
        ofFloat.addUpdateListener(new es6(this, 2));
        this.g = ofFloat;
        TimeAnimator timeAnimator2 = new TimeAnimator();
        timeAnimator2.setTimeListener(new TimeAnimator.TimeListener() { // from class: xsna.qng0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator3, long j, long j2) {
                float f;
                d3k0.a aVar;
                rng0 rng0Var = rng0.this;
                float f2 = rng0Var.o;
                RouletteView rouletteView2 = rng0Var.b;
                if (f2 <= 0.005d) {
                    StickerStockItem f22 = rng0Var.f2(rouletteView2.getCurrentPosition());
                    StringBuilder sb = new StringBuilder("Winner packId:");
                    StickerStockItem stickerStockItem = rng0Var.m;
                    sb.append(stickerStockItem != null ? stickerStockItem.b : -1);
                    sb.append("; actually dropped packId:");
                    sb.append(f22.b);
                    L.p("RandomStickerPack", sb.toString());
                    timeAnimator3.end();
                    rng0Var.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    rng0Var.e.cancel();
                    rouletteView2.f(rng0Var.n);
                    rng0Var.p = -1;
                    rng0Var.q = 0;
                    rng0Var.d = rng0.a.e.a;
                    return;
                }
                d3k0 d3k0Var = rng0Var.l;
                n8z n8zVar2 = d3k0Var.b;
                if (d3k0Var.e) {
                    f = n8zVar2.a(j);
                } else {
                    slj0 slj0Var2 = d3k0Var.a;
                    float f3 = slj0Var2.c * slj0Var2.b[(int) (j * slj0Var2.a)];
                    if (f3 >= d3k0Var.d * 0.08f || (aVar = d3k0Var.c) == null) {
                        f = f3;
                    } else {
                        if (!d3k0Var.e) {
                            n8zVar2.b(aVar.a(), j, f3);
                            d3k0Var.e = true;
                        }
                        f = n8zVar2.a(j);
                    }
                }
                rng0Var.o = f;
            }
        });
        this.i = timeAnimator2;
        this.r = new sng0(this);
    }

    public static void g(ValueAnimator valueAnimator) {
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(null);
        if (valueAnimator instanceof TimeAnimator) {
            ((TimeAnimator) valueAnimator).setTimeListener(null);
        }
    }

    @Override // xsna.nng0
    public final float O5() {
        a aVar = this.d;
        return ((aVar instanceof a.c) || (aVar instanceof a.d)) ? 1 - (this.o / 4.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nng0
    public final int W0(StickerStockItem stickerStockItem) {
        return this.c.indexOf(stickerStockItem);
    }

    @Override // xsna.nng0
    public final void Y4(StickerStockItem stickerStockItem) {
        TimeAnimator timeAnimator = this.e;
        if (!timeAnimator.isRunning()) {
            timeAnimator.start();
        }
        this.d = new a.C3616a(stickerStockItem);
        d5 d5Var = new d5(23, this, stickerStockItem);
        ValueAnimator valueAnimator = this.g;
        xo2.h(valueAnimator, d5Var);
        valueAnimator.start();
    }

    public final int b(StickerStockItem stickerStockItem) {
        ArrayList arrayList = this.c;
        int indexOf = arrayList.indexOf(stickerStockItem);
        int currentPosition = this.b.getCurrentPosition();
        int size = (arrayList.size() * (currentPosition / arrayList.size())) + indexOf;
        return size < currentPosition ? arrayList.size() + size : size;
    }

    @Override // xsna.nng0
    public final StickerStockItem f2(int i) {
        ArrayList arrayList = this.c;
        return (StickerStockItem) arrayList.get((i % arrayList.size()) % arrayList.size());
    }

    @Override // xsna.nng0
    public final int k5(int i) {
        int size = this.c.size();
        return i - ((i / size) * size);
    }

    @Override // xsna.nng0
    public final void m6() {
        this.m = null;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        g(this.e);
        g(this.g);
        g(this.i);
    }

    @Override // xsna.cc6
    public final void onPause() {
        TimeAnimator timeAnimator = this.e;
        if (timeAnimator.isRunning()) {
            timeAnimator.pause();
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        TimeAnimator timeAnimator2 = this.i;
        if (timeAnimator2.isRunning()) {
            timeAnimator2.pause();
        }
        if (timeAnimator.isRunning()) {
            this.f = timeAnimator.getCurrentPlayTime();
        }
        if (valueAnimator.isRunning()) {
            this.h = valueAnimator.getCurrentPlayTime();
        }
        if (timeAnimator2.isRunning()) {
            this.j = timeAnimator2.getCurrentPlayTime();
        }
        this.k = System.currentTimeMillis();
    }

    @Override // xsna.cc6
    public final void onResume() {
        boolean f = epx.f(this.d, a.b.a);
        RouletteView rouletteView = this.b;
        TimeAnimator timeAnimator = this.e;
        if (!f) {
            a aVar = this.d;
            a.e eVar = a.e.a;
            if (!epx.f(aVar, eVar) && System.currentTimeMillis() - this.k > 8000) {
                a aVar2 = this.d;
                aVar2.getClass();
                StickerStockItem stickerStockItem = aVar2 instanceof a.C3616a ? ((a.C3616a) aVar2).a : aVar2 instanceof a.c ? ((a.c) aVar2).a : aVar2 instanceof a.d ? ((a.d) aVar2).a : null;
                if (stickerStockItem != null) {
                    timeAnimator.start();
                    x();
                    this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int b = b(stickerStockItem);
                    this.n = b;
                    rouletteView.g.scrollBy(rouletteView.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b), 0);
                    timeAnimator.cancel();
                    rouletteView.f(this.n);
                    this.d = eVar;
                    return;
                }
                return;
            }
        }
        timeAnimator.start();
        a aVar3 = this.d;
        if (aVar3 instanceof a.C3616a) {
            x();
            z(((a.C3616a) this.d).a);
            return;
        }
        if (aVar3 instanceof a.c) {
            x();
            z(((a.c) this.d).a);
            return;
        }
        if (aVar3 instanceof a.d) {
            x();
            this.o = 0.3f;
            StickerStockItem stickerStockItem2 = ((a.d) this.d).a;
            this.q = 0;
            int b2 = b(stickerStockItem2);
            this.n = b2;
            int d = rouletteView.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b2);
            this.p = d;
            TimeAnimator timeAnimator2 = this.i;
            timeAnimator2.cancel();
            float f2 = this.o;
            d3k0 d3k0Var = this.l;
            d3k0Var.e = true;
            d3k0Var.d = f2;
            d3k0Var.b.b(d, 0L, f2);
            timeAnimator2.start();
        }
    }

    @Override // xsna.nng0
    public final void setItems(List<StickerStockItem> list) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.addAll(list);
        this.e.start();
    }

    @Override // xsna.nng0
    public final void t1(StickerStockItem stickerStockItem) {
        this.m = stickerStockItem;
    }

    @Override // xsna.nng0
    public final int u4() {
        return this.c.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // xsna.nng0
    public final void v4(StickerStockItem stickerStockItem, int i) {
        this.c.add(i, stickerStockItem);
    }

    public final void x() {
        TimeAnimator timeAnimator = this.e;
        if (timeAnimator.isPaused()) {
            timeAnimator.setCurrentPlayTime(this.f);
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator.isPaused()) {
            valueAnimator.setCurrentPlayTime(this.h);
        }
        TimeAnimator timeAnimator2 = this.i;
        if (timeAnimator2.isPaused()) {
            timeAnimator2.setCurrentPlayTime(this.j);
        }
    }

    public final void z(StickerStockItem stickerStockItem) {
        int b = b(stickerStockItem);
        while (true) {
            RouletteView rouletteView = this.b;
            int d = rouletteView.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b);
            d3k0 d3k0Var = this.l;
            slj0 slj0Var = d3k0Var.a;
            if (an10.b((d * RtpSenderHelper.AUDIO_BITRATE_MIN) / (4.0f * 2045)) > 8000) {
                this.n = b;
                int d2 = rouletteView.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b);
                d3k0Var.c = this.r;
                float f = this.o;
                d3k0Var.e = false;
                d3k0Var.d = f;
                slj0 slj0Var2 = d3k0Var.a;
                slj0Var2.c = f;
                slj0Var2.a = (f * 2045) / (d2 * 16);
                this.i.start();
                this.d = new a.c(stickerStockItem);
                return;
            }
            b += this.c.size();
        }
    }
}
