package xsna;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import xsna.by1;
import xsna.ewo0;
import xsna.ihz;
import xsna.jza0;

/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: classes12.dex */
public final class hal implements zw1 {
    public final dvf b;
    public final ewo0.b c;
    public final ewo0.c d;
    public final a e;
    public final SparseArray<by1.a> f;
    public ihz<by1> g;
    public jza0 h;
    public otu i;
    public boolean j;

    /* compiled from: DefaultAnalyticsCollector.java */
    public static final class a {
        public final ewo0.b a;
        public ImmutableList<i.b> b;
        public com.google.common.collect.h c;

        @Nullable
        public i.b d;
        public i.b e;
        public i.b f;

        public a(ewo0.b bVar) {
            this.a = bVar;
            ImmutableList.b bVar2 = ImmutableList.c;
            this.b = com.google.common.collect.g.f;
            this.c = com.google.common.collect.h.h;
        }

        @Nullable
        public static i.b b(jza0 jza0Var, ImmutableList<i.b> immutableList, @Nullable i.b bVar, ewo0.b bVar2) {
            ewo0 currentTimeline = jza0Var.getCurrentTimeline();
            int currentPeriodIndex = jza0Var.getCurrentPeriodIndex();
            Object l = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
            int b = (jza0Var.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, bVar2, false).b(y2r0.S(jza0Var.getCurrentPosition()) - bVar2.e);
            for (int i = 0; i < immutableList.size(); i++) {
                i.b bVar3 = immutableList.get(i);
                if (c(bVar3, l, jza0Var.isPlayingAd(), jza0Var.getCurrentAdGroupIndex(), jza0Var.getCurrentAdIndexInAdGroup(), b)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null && c(bVar, l, jza0Var.isPlayingAd(), jza0Var.getCurrentAdGroupIndex(), jza0Var.getCurrentAdIndexInAdGroup(), b)) {
                return bVar;
            }
            return null;
        }

        public static boolean c(i.b bVar, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            Object obj2 = bVar.a;
            int i4 = bVar.b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z && i4 == i && bVar.c == i2) {
                return true;
            }
            return !z && i4 == -1 && bVar.e == i3;
        }

        public final void a(ImmutableMap.a<i.b, ewo0> aVar, @Nullable i.b bVar, ewo0 ewo0Var) {
            if (bVar == null) {
                return;
            }
            if (ewo0Var.b(bVar.a) != -1) {
                aVar.d(bVar, ewo0Var);
                return;
            }
            ewo0 ewo0Var2 = (ewo0) this.c.get(bVar);
            if (ewo0Var2 != null) {
                aVar.d(bVar, ewo0Var2);
            }
        }

        public final void d(ewo0 ewo0Var) {
            ImmutableMap.a<i.b, ewo0> aVar = new ImmutableMap.a<>(4);
            if (this.b.isEmpty()) {
                a(aVar, this.e, ewo0Var);
                if (!Objects.equals(this.f, this.e)) {
                    a(aVar, this.f, ewo0Var);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    a(aVar, this.d, ewo0Var);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(aVar, this.b.get(i), ewo0Var);
                }
                if (!this.b.contains(this.d)) {
                    a(aVar, this.d, ewo0Var);
                }
            }
            this.c = aVar.a(true);
        }
    }

    public hal(dvf dvfVar) {
        dvfVar.getClass();
        this.b = dvfVar;
        String str = y2r0.a;
        Looper myLooper = Looper.myLooper();
        this.g = new ihz<>(myLooper == null ? Looper.getMainLooper() : myLooper);
        ewo0.b bVar = new ewo0.b();
        this.c = bVar;
        this.d = new ewo0.c();
        this.e = new a(bVar);
        this.f = new SparseArray<>();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void A(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, IOException iOException, boolean z) {
        by1.a P = P(i, bVar);
        R(P, 1003, new fal(P, bpzVar, pr10Var, iOException, z));
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void B(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
        by1.a P = P(i, bVar);
        R(P, 1001, new ro9(P, bpzVar, pr10Var));
    }

    @Override // xsna.zw1
    public final void C(by1 by1Var) {
        this.g.e(by1Var);
    }

    @Override // xsna.jza0.b
    public final void D(final int i, final jza0.c cVar, final jza0.c cVar2) {
        if (i == 1) {
            this.j = false;
        }
        jza0 jza0Var = this.h;
        jza0Var.getClass();
        a aVar = this.e;
        aVar.d = a.b(jza0Var, aVar.b, aVar.e, aVar.a);
        final by1.a J = J();
        R(J, 11, new ihz.a(J, i, cVar, cVar2) { // from class: xsna.bal
            public final /* synthetic */ int b;
            public final /* synthetic */ jza0.c c;
            public final /* synthetic */ jza0.c d;

            {
                this.b = i;
                this.c = cVar;
                this.d = cVar2;
            }

            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                by1 by1Var = (by1) obj;
                by1Var.getClass();
                by1Var.d0(this.b, this.c, this.d);
            }
        });
    }

    @Override // xsna.jza0.b
    public final void E(jza0.a aVar) {
        by1.a J = J();
        R(J, 13, new pm0(J, aVar));
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void F(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, int i2) {
        by1.a P = P(i, bVar);
        R(P, 1000, new k7j(P, bpzVar, pr10Var, i2));
    }

    @Override // xsna.zw1
    public final void G(by1 by1Var) {
        by1Var.getClass();
        this.g.a(by1Var);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void H(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
        by1.a P = P(i, bVar);
        R(P, 1002, new qo9(P, bpzVar, pr10Var));
    }

    @Override // xsna.jza0.b
    public final void I(@Nullable PlaybackException playbackException) {
        i.b bVar;
        by1.a J = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? J() : K(bVar);
        R(J, 10, new hr(J, playbackException));
    }

    public final by1.a J() {
        return K(this.e.d);
    }

    public final by1.a K(@Nullable i.b bVar) {
        this.h.getClass();
        ewo0 ewo0Var = bVar == null ? null : (ewo0) this.e.c.get(bVar);
        if (bVar != null && ewo0Var != null) {
            return L(ewo0Var, ewo0Var.g(bVar.a, this.c).c, bVar);
        }
        int s = this.h.s();
        ewo0 currentTimeline = this.h.getCurrentTimeline();
        if (s >= currentTimeline.o()) {
            currentTimeline = ewo0.a;
        }
        return L(currentTimeline, s, null);
    }

    public final by1.a L(ewo0 ewo0Var, int i, @Nullable i.b bVar) {
        i.b bVar2 = ewo0Var.p() ? null : bVar;
        long elapsedRealtime = this.b.elapsedRealtime();
        boolean z = ewo0Var.equals(this.h.getCurrentTimeline()) && i == this.h.s();
        long j = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                j = this.h.getContentPosition();
            } else if (!ewo0Var.p()) {
                j = y2r0.j0(ewo0Var.m(i, this.d, 0L).l);
            }
        } else if (z && this.h.getCurrentAdGroupIndex() == bVar2.b && this.h.getCurrentAdIndexInAdGroup() == bVar2.c) {
            j = this.h.getCurrentPosition();
        }
        return new by1.a(elapsedRealtime, ewo0Var, i, bVar2, j, this.h.getCurrentTimeline(), this.h.s(), this.e.d, this.h.getCurrentPosition(), this.h.a());
    }

    @Override // xsna.jza0.b
    public final void N(dip0 dip0Var) {
        by1.a J = J();
        R(J, 2, new jr(J, dip0Var));
    }

    @Override // xsna.zw1
    public final void O(jza0 jza0Var, Looper looper) {
        fxc0.z(this.h == null || this.e.b.isEmpty());
        jza0Var.getClass();
        this.h = jza0Var;
        this.i = this.b.createHandler(looper, null);
        ihz<by1> ihzVar = this.g;
        erb erbVar = new erb(2, this, jza0Var);
        ihzVar.getClass();
        dvf dvfVar = this.b;
        fxc0.z(dvfVar != null);
        this.g = new ihz<>(ihzVar.e, looper, looper.getThread(), dvfVar, erbVar, ihzVar.j);
    }

    public final by1.a P(int i, @Nullable i.b bVar) {
        this.h.getClass();
        if (bVar != null) {
            return ((ewo0) this.e.c.get(bVar)) != null ? K(bVar) : L(ewo0.a, i, bVar);
        }
        ewo0 currentTimeline = this.h.getCurrentTimeline();
        if (i >= currentTimeline.o()) {
            currentTimeline = ewo0.a;
        }
        return L(currentTimeline, i, null);
    }

    public final by1.a Q() {
        return K(this.e.f);
    }

    public final void R(by1.a aVar, int i, ihz.a<by1> aVar2) {
        this.f.put(i, aVar);
        this.g.f(i, aVar2);
    }

    @Override // xsna.zw1
    public final void V() {
        if (this.j) {
            return;
        }
        by1.a J = J();
        this.j = true;
        R(J, -1, new nr(J, 10));
    }

    @Override // xsna.zw1
    public final void Z(int i) {
        by1.a J = J();
        R(J, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new pn(J, i));
    }

    @Override // xsna.jza0.b
    public final void a(int i) {
        by1.a Q = Q();
        R(Q, 21, new rf3(Q, i));
    }

    @Override // xsna.jza0.b
    public final void a0(nc4 nc4Var) {
        by1.a Q = Q();
        R(Q, 20, new wr(Q, nc4Var));
    }

    @Override // xsna.zw1
    public final void b(long j, Object obj) {
        by1.a Q = Q();
        R(Q, 26, new c7(Q, obj, j));
    }

    @Override // xsna.zw1
    public final void c(Exception exc) {
        by1.a Q = Q();
        R(Q, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new qr(Q, exc));
    }

    @Override // xsna.zw1
    public final void c0(int i, int i2, boolean z) {
        by1.a Q = Q();
        R(Q, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new kr(Q, i, i2, z));
    }

    @Override // xsna.jza0.b
    public final void d(ukk ukkVar) {
        by1.a J = J();
        R(J, 27, new rr(J, ukkVar));
    }

    @Override // xsna.zw1
    public final void e(g8l g8lVar) {
        by1.a Q = Q();
        R(Q, 1015, new com.vk.movika.sdk.base.ui.p0(Q, g8lVar));
    }

    @Override // xsna.zw1
    public final void f(g8l g8lVar) {
        by1.a K = K(this.e.e);
        R(K, 1020, new e05(K, g8lVar));
    }

    @Override // xsna.jza0.b
    public final void f0(@Nullable kr10 kr10Var, int i) {
        by1.a J = J();
        R(J, 1, new uf3(J, kr10Var, i));
    }

    @Override // xsna.zw1
    public final void g(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
        by1.a Q = Q();
        R(Q, 1009, new e10(Q, aVar, n8lVar));
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(int i, @Nullable i.b bVar, pr10 pr10Var) {
        by1.a P = P(i, bVar);
        R(P, 1005, new t11(P, pr10Var));
    }

    @Override // xsna.zw1
    public final void i(final int i, final long j, final long j2) {
        final by1.a Q = Q();
        R(Q, 1011, new ihz.a(Q, i, j, j2) { // from class: xsna.gal
            public final /* synthetic */ int b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            {
                this.b = i;
                this.c = j;
                this.d = j2;
            }

            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((by1) obj).T(this.b, this.c, this.d);
            }
        });
    }

    @Override // xsna.zw1
    public final void j(String str) {
        by1.a Q = Q();
        R(Q, 1019, new io.reactivex.rxjava3.internal.operators.observable.q1(Q, str));
    }

    @Override // xsna.jza0.b
    public final void k(fi20 fi20Var) {
        by1.a J = J();
        R(J, 28, new fr(J, fi20Var));
    }

    @Override // xsna.zw1
    public final void l(String str) {
        by1.a Q = Q();
        R(Q, 1012, new k73(9, Q, str));
    }

    @Override // xsna.zw1
    public final void m(final int i, final long j) {
        final by1.a K = K(this.e.e);
        R(K, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new ihz.a(i, j, K) { // from class: xsna.dal
            public final /* synthetic */ long b;
            public final /* synthetic */ int c;

            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((by1) obj).Q(this.c, this.b);
            }
        });
    }

    @Override // xsna.zw1
    public final void n(g8l g8lVar) {
        by1.a K = K(this.e.e);
        R(K, Z3.i, new io.reactivex.rxjava3.subjects.c(K, g8lVar));
    }

    @Override // xsna.zw1
    public final void o(AudioSink.a aVar) {
        by1.a Q = Q();
        R(Q, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new p11(Q, aVar));
    }

    @Override // xsna.zw1
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        by1.a Q = Q();
        R(Q, 1008, new e40(Q, str, j2, j));
    }

    @Override // xsna.p06.a
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        a aVar = this.e;
        final by1.a K = K(aVar.b.isEmpty() ? null : (i.b) sd9.k(aVar.b));
        R(K, 1006, new ihz.a() { // from class: xsna.cal
            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((by1) obj).H(by1.a.this, i, j, j2);
            }
        });
    }

    @Override // xsna.jza0.b
    public final void onCues(List<rkk> list) {
        by1.a J = J();
        R(J, 27, new ed(J, list));
    }

    @Override // xsna.zw1
    public final void onDroppedFrames(int i, long j) {
        by1.a K = K(this.e.e);
        R(K, 1018, new xr(i, j, K));
    }

    @Override // xsna.jza0.b
    public final void onIsLoadingChanged(boolean z) {
        by1.a J = J();
        R(J, 3, new v11(J, z));
    }

    @Override // xsna.jza0.b
    public final void onIsPlayingChanged(boolean z) {
        by1.a J = J();
        R(J, 7, new gr(J, z));
    }

    @Override // xsna.jza0.b
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        by1.a J = J();
        R(J, 5, new ir(J, z, i));
    }

    @Override // xsna.jza0.b
    public final void onPlaybackStateChanged(final int i) {
        final by1.a J = J();
        R(J, 4, new ihz.a(J, i) { // from class: xsna.aal
            public final /* synthetic */ int b;

            {
                this.b = i;
            }

            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((by1) obj).R(this.b);
            }
        });
    }

    @Override // xsna.jza0.b
    public final void onPlaybackSuppressionReasonChanged(int i) {
        by1.a J = J();
        R(J, 6, new en(J, i));
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        i.b bVar;
        by1.a J = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? J() : K(bVar);
        R(J, 10, new m40(J, playbackException));
    }

    @Override // xsna.jza0.b
    public final void onPlayerStateChanged(boolean z, int i) {
        by1.a J = J();
        R(J, -1, new er(J, z, i));
    }

    @Override // xsna.jza0.b
    public final void onRepeatModeChanged(int i) {
        by1.a J = J();
        R(J, 8, new pr(J, i));
    }

    @Override // xsna.jza0.b
    public final void onSkipSilenceEnabledChanged(boolean z) {
        by1.a Q = Q();
        R(Q, 23, new at(Q, z));
    }

    @Override // xsna.jza0.b
    public final void onSurfaceSizeChanged(int i, int i2) {
        by1.a Q = Q();
        R(Q, 24, new ao(Q, i, i2));
    }

    @Override // xsna.zw1
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        by1.a Q = Q();
        R(Q, Z3.l, new com.vk.movika.sdk.base.hooks.k(Q, str, j2, j));
    }

    @Override // xsna.jza0.b
    public final void onVideoSizeChanged(xgt0 xgt0Var) {
        by1.a Q = Q();
        R(Q, 25, new ai3(Q, xgt0Var));
    }

    @Override // xsna.jza0.b
    public final void onVolumeChanged(float f) {
        by1.a Q = Q();
        R(Q, 22, new up(Q, f));
    }

    @Override // xsna.zw1
    public final void p(AudioSink.a aVar) {
        by1.a Q = Q();
        R(Q, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new eq0(Q, aVar));
    }

    @Override // xsna.zw1
    public final void q(Exception exc) {
        by1.a Q = Q();
        R(Q, Z3.j, new u11(Q, exc));
    }

    @Override // xsna.zw1
    public final void r(long j) {
        by1.a Q = Q();
        R(Q, 1010, new gp(Q, j));
    }

    @Override // xsna.zw1
    public final void release() {
        otu otuVar = this.i;
        otuVar.getClass();
        otuVar.post(new tv9(this, 3));
    }

    @Override // xsna.zw1
    public final void s(g8l g8lVar) {
        by1.a Q = Q();
        R(Q, 1007, new vr(Q, g8lVar));
    }

    @Override // xsna.zw1
    public final void t(Exception exc) {
        by1.a Q = Q();
        R(Q, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new dr(Q, exc));
    }

    @Override // xsna.zw1
    public final void u(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
        by1.a Q = Q();
        R(Q, 1017, new eal(Q, aVar, n8lVar));
    }

    @Override // xsna.jza0.b
    public final void v(jwa0 jwa0Var) {
        by1.a J = J();
        R(J, 12, new io.reactivex.rxjava3.internal.operators.observable.n0(J, jwa0Var));
    }

    @Override // xsna.zw1
    public final void w(com.google.common.collect.g gVar, @Nullable i.b bVar) {
        jza0 jza0Var = this.h;
        jza0Var.getClass();
        a aVar = this.e;
        aVar.getClass();
        aVar.b = ImmutableList.m(gVar);
        if (!gVar.isEmpty()) {
            aVar.e = (i.b) gVar.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.d == null) {
            aVar.d = a.b(jza0Var, aVar.b, aVar.e, aVar.a);
        }
        aVar.d(jza0Var.getCurrentTimeline());
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void x(int i, @Nullable i.b bVar, pr10 pr10Var) {
        by1.a P = P(i, bVar);
        R(P, 1004, new sff(P, pr10Var));
    }

    @Override // xsna.jza0.b
    public final void y(vr10 vr10Var) {
        by1.a J = J();
        R(J, 14, new io.reactivex.rxjava3.subjects.b(J, vr10Var));
    }

    @Override // xsna.jza0.b
    public final void z(ewo0 ewo0Var, int i) {
        jza0 jza0Var = this.h;
        jza0Var.getClass();
        a aVar = this.e;
        aVar.d = a.b(jza0Var, aVar.b, aVar.e, aVar.a);
        aVar.d(jza0Var.getCurrentTimeline());
        by1.a J = J();
        R(J, 0, new tf3(J, i));
    }

    @Override // xsna.jza0.b
    public final void M() {
    }

    @Override // xsna.jza0.b
    public final void onRenderedFirstFrame() {
    }

    @Override // xsna.jza0.b
    public final void onLoadingChanged(boolean z) {
    }
}
