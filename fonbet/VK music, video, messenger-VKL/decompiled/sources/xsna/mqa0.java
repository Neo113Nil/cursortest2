package xsna;

import com.vk.dto.ads.PixelStats;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PixelStatsTrackerImpl.kt */
/* loaded from: classes14.dex */
public final class mqa0 implements hqa0 {
    public final bpn0 b;
    public final bpn0 c = new bpn0(new uv0(26));
    public final fqa0 d = new fqa0();

    /* compiled from: PixelStatsTrackerImpl.kt */
    public static final class a extends Throwable {
    }

    /* compiled from: PixelStatsTrackerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: PixelStatsTrackerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public mqa0(bpn0 bpn0Var) {
        this.b = bpn0Var;
    }

    @Override // xsna.hqa0
    public final io.reactivex.rxjava3.disposables.c a(Iterable<PixelStats> iterable) {
        io.reactivex.rxjava3.core.q<R> L = hg1.o(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.O(iterable).r0(asu0.a.c()), new fe60(new px30(this, 18), 4)).L(new qu50(new w620(this, 14), 4), false), 10, new x620(12)).L(new qj4(new c230(this, 14), 25), false);
        new y510(11);
        return L.subscribe(new lqa0(), new pmu(new c(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 10));
    }

    @Override // xsna.hqa0
    public final eqa0 b() {
        return this.d;
    }

    @Override // xsna.hqa0
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // xsna.hqa0
    public final io.reactivex.rxjava3.disposables.c d(String str) {
        return hg1.o(new io.reactivex.rxjava3.internal.operators.observable.s0(new iqa0(0, this, str)).r0(asu0.a.c()), 10, new ye40(6)).subscribe(new g2u(new t3v(9), 2), new c120(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 16));
    }
}
