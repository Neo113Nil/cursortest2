package xsna;

import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.cz40;
import xsna.g8x;
import xsna.mu90;
import xsna.ry40;

/* compiled from: MusicSwitchingPlayerHelper.kt */
/* loaded from: classes3.dex */
public final class r950 implements dx40, px40, d940 {
    public static final /* synthetic */ qcy<Object>[] q;
    public final PlayerService b;
    public final hx40 c;
    public final e940 d;
    public final tf40 e;
    public final nb4 f;
    public final bpn0 g = new bpn0(new bv0(26));
    public final Object h;
    public final pwi i;
    public ry40 j;
    public final uw1 k;
    public final String l;
    public kx40 m;
    public boolean n;
    public boolean o;
    public boolean p;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(r950.class, "musicPlayerListener", "getMusicPlayerListener()Lcom/vk/music/player/api/listener/MusicPlayerListener;", 0);
        fpf0.a.getClass();
        q = new qcy[]{mutablePropertyReference1Impl};
    }

    public r950(PlayerService playerService, hx40 hx40Var, e940 e940Var, tf40 tf40Var, ojk ojkVar, uw1 uw1Var) {
        this.b = playerService;
        this.c = hx40Var;
        this.d = e940Var;
        this.e = tf40Var;
        this.f = ojkVar.i();
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new f550(this, 1));
        this.h = a;
        PlayerAnalyticsComponent playerAnalyticsComponent = (PlayerAnalyticsComponent) a.getValue();
        pwi pwiVar = new pwi();
        pwiVar.b = msy.a(LazyThreadSafetyMode.NONE, new fu5(playerAnalyticsComponent, this, uw1Var, 4));
        this.i = pwiVar;
        e940Var.d = new q950(this);
        e940Var.b.p(this);
        hx40Var.p(this);
        this.j = ry40.c.d;
        this.k = uw1Var;
        this.l = hx40Var.i;
    }

    @Override // xsna.d940
    public final void A() {
        this.d.A();
    }

    @Override // xsna.px40
    public final void B(ky40 ky40Var) {
        px40 E = E();
        if (E != null) {
            E.B(ky40Var);
        }
    }

    @Override // xsna.ex40
    public final float C() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.b.C() : this.c.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        px40 E;
        ry40 ry40Var = (ry40) v0qVar;
        boolean z = ry40Var.c.a;
        boolean j = this.d.j();
        boolean z2 = ry40Var instanceof ry40.f;
        if ((((j || z2) && z) || !(j || z)) && (E = E()) != null) {
            E.D(v0qVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final px40 E() {
        qcy<Object> qcyVar = q[0];
        pwi pwiVar = this.i;
        if (((px40) pwiVar.c) == null) {
            pwiVar.c = ((qx40) pwiVar.b.getValue()).a(null);
        }
        return (px40) pwiVar.c;
    }

    @Override // xsna.px40
    public final void F(cz40 cz40Var) {
        px40 E;
        if (!cz40Var.equals(this.c.b) || (E = E()) == null) {
            return;
        }
        E.F(cz40Var);
    }

    @Override // xsna.px40
    public final void G() {
        px40 E = E();
        if (E != null) {
            E.G();
        }
    }

    @Override // xsna.ex40
    public final x6b0 H() {
        return this.c.j;
    }

    public final Pair<Integer, Integer> I(int i) {
        if (this.d.j()) {
            return new Pair<>(Integer.valueOf(i), 26);
        }
        if (this.c.o.d()) {
            return new Pair<>(26, Integer.valueOf(i));
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"Players get stopped/released when none of them are active"});
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i));
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        boolean z = this.o;
        boolean z2 = ry40Var.c.a;
        boolean j = this.d.j();
        boolean z3 = z && (ry40Var instanceof ry40.f);
        if (((j || z3) && z2) || !(j || z2)) {
            this.j = ry40Var;
            this.o = false;
            px40 E = E();
            if (E != null) {
                E.a(ry40Var);
            }
        }
    }

    @Override // xsna.ex40
    public final float b() {
        return this.c.g;
    }

    @Override // xsna.ex40
    public final cz40 c() {
        return this.d.j() ? cz40.a.a : this.c.b;
    }

    @Override // xsna.px40
    public final void d(cz40 cz40Var) {
        px40 E = E();
        if (E != null) {
            E.d(cz40Var);
        }
    }

    public final boolean e() {
        return !this.d.j();
    }

    @Override // xsna.dx40
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        boolean f;
        i8x i8xVar;
        if (!this.j.i()) {
            return false;
        }
        if (this.d.j()) {
            e940 e940Var = this.d;
            int i = playbackActionMeta.b;
            bn40.f(new Object[0]);
            g8x g8xVar = e940Var.f.c;
            if (g8xVar == null) {
                f = false;
            } else {
                zg0 zg0Var = e940Var.b;
                zg0Var.r(wg0.a(zg0Var.t(), i, false, null, 6));
                ijz0 ijz0Var = g8xVar.h;
                if (ijz0Var != null && ijz0Var.j != null && (i8xVar = ijz0Var.f.g) != null) {
                    i8xVar.A();
                }
                f = true;
            }
        } else {
            f = this.c.f(playbackActionMeta);
        }
        if (f) {
            this.n = false;
            this.p = false;
        }
        return f;
    }

    @Override // xsna.ex40
    public final boolean g() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.b.g() : this.c.g();
    }

    @Override // xsna.dx40
    public final int getAudioSessionId() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.b.getAudioSessionId() : this.c.getAudioSessionId();
    }

    @Override // xsna.dx40
    public final int getBufferedPercentage() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.b.getBufferedPercentage() : this.c.getBufferedPercentage();
    }

    @Override // xsna.ex40
    public final fx40 getConfig() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.h : this.c.h;
    }

    @Override // xsna.dx40
    public final long getCurrentPosition() {
        e940 e940Var = this.d;
        return e940Var.j() ? e940Var.b.getCurrentPosition() : this.c.o.a();
    }

    @Override // xsna.dx40
    public final ry40 getState() {
        return this.j;
    }

    @Override // xsna.ex40
    public final String h() {
        return this.l;
    }

    @Override // xsna.px40
    public final void i(ly40 ly40Var) {
        int i = (int) (ly40Var.b / 1000);
        this.f.a().getValue();
        if (epx.f(ly40Var.a, this.c.b)) {
            this.d.h(i);
        }
        px40 E = E();
        if (E != null) {
            E.i(ly40Var);
        }
    }

    @Override // xsna.dx40
    public final boolean isRunning() {
        if (this.d.j()) {
            return true;
        }
        return this.c.o.d();
    }

    @Override // xsna.dx40
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        if (this.d.j()) {
            return true;
        }
        return this.c.j(i, playbackActionMeta);
    }

    @Override // xsna.dx40
    public final List<PlayerAction> k() {
        e940 e940Var = this.d;
        List<PlayerAction> k = e940Var.b.k();
        if (k == null) {
            k = EmptyList.b;
        }
        g8x.c cVar = e940Var.f.d;
        if (cVar == null || !cVar.f) {
            return k;
        }
        return j5g.v0(PlayerAction.more, k);
    }

    @Override // xsna.px40
    public final void l(cz40 cz40Var) {
        mu90 value = this.f.a().getValue();
        tf40 tf40Var = this.e;
        if (tf40Var.a()) {
            hx40 hx40Var = this.c;
            if (cz40Var.equals(hx40Var.b)) {
                mu90.b bVar = value instanceof mu90.b ? (mu90.b) value : null;
                AudioAdConfig.Type type = bVar != null ? bVar.b : null;
                AudioAdConfig.Type type2 = AudioAdConfig.Type.POSTROLL;
                if (type == type2) {
                    d(cz40.a.a);
                    g8x g8xVar = ((mu90.b) value).a;
                    kx40 kx40Var = this.m;
                    this.d.n(new f940(hx40Var.p.d.b, kx40Var != null ? kx40Var.b : null, g8xVar, tf40Var.a.V(), type2, 56), !this.p, 0);
                    return;
                }
            }
        }
        px40 E = E();
        if (E != null) {
            E.l(cz40Var);
        }
    }

    @Override // xsna.d940
    public final void m() {
        this.d.m();
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
        px40 E;
        if (!cz40Var.equals(this.c.b) || (E = E()) == null) {
            return;
        }
        E.n(cz40Var, i, j);
    }

    @Override // xsna.d940
    public final void o() {
        this.d.o();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dx40
    public final void p(px40 px40Var) {
        qcy<Object> qcyVar = q[0];
        pwi pwiVar = this.i;
        pwiVar.c = ((qx40) pwiVar.b.getValue()).a(px40Var);
    }

    @Override // xsna.dx40
    public final boolean pause(int i) {
        if (!this.j.j()) {
            return false;
        }
        e940 e940Var = this.d;
        if (e940Var.j()) {
            return e940Var.l(i);
        }
        hx40 hx40Var = this.c;
        return hx40Var.pause(i) || (hx40Var.o.e instanceof ry40.f);
    }

    @Override // xsna.px40
    public final void q(ky40 ky40Var) {
        px40 E = E();
        if (E != null) {
            E.q(ky40Var);
        }
    }

    @Override // xsna.dx40
    public final void release(int i) {
        bn40.f(new Object[0]);
        Pair<Integer, Integer> I = I(i);
        int intValue = I.d().intValue();
        this.c.release(I.g().intValue());
        bn40.f(new Object[0]);
        e940 e940Var = this.d;
        e940Var.i();
        e940Var.b.release(intValue);
    }

    @Override // xsna.ex40
    public final void s(float f) {
        this.c.s(f);
        zg0 zg0Var = this.d.b;
        if (zg0Var.z()) {
            zg0Var.setVolume(f);
        }
    }

    @Override // xsna.dx40
    public final void stop(int i) {
        bn40.f(new Object[0]);
        Pair<Integer, Integer> I = I(i);
        int intValue = I.d().intValue();
        int intValue2 = I.g().intValue();
        this.o = intValue == 32 || intValue == 34 || intValue == 12 || intValue == 36;
        this.c.stop(intValue2);
        bn40.f(new Object[0]);
        e940 e940Var = this.d;
        zg0 zg0Var = e940Var.b;
        zg0Var.w(intValue);
        e940Var.i();
        zg0Var.stop(intValue);
    }

    @Override // xsna.dx40
    public final void u(kx40 kx40Var) {
        int i;
        PlaybackActionMeta playbackActionMeta = kx40Var.e;
        String t = kx40Var.d.b.t();
        nb4 nb4Var = this.f;
        nb4Var.c(t);
        boolean z = kx40Var.f;
        hx40 hx40Var = this.c;
        this.p = !z || (hx40Var.o.d() && (((i = playbackActionMeta.b) == -99 || (i >= 0 && i != 9)) && this.j.i())) || playbackActionMeta.b == 29;
        tf40 tf40Var = this.e;
        boolean a = tf40Var.a();
        this.m = kx40Var;
        boolean d = kx40Var.d();
        MusicTrack musicTrack = kx40Var.b;
        if (!d) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{"Track to play is invalid: " + musicTrack});
            return;
        }
        if (!a || playbackActionMeta.b == 29) {
            hx40Var.u(kx40Var);
            return;
        }
        mu90 value = nb4Var.a().getValue();
        mu90.b bVar = value instanceof mu90.b ? (mu90.b) value : null;
        bpn0 bpn0Var = this.g;
        boolean z2 = ((Boolean) bpn0Var.getValue()).booleanValue() && nb4Var.b(musicTrack) && playbackActionMeta.b == 8;
        hx40Var.u(kx40.a(kx40Var, null, null, null, bVar == null || z2, 479));
        boolean z3 = (bVar == null || z2) ? false : true;
        if (z3) {
            d(cz40.a.a);
            this.d.n(new f940(hx40Var.p.d.b, kx40Var.b, bVar != null ? bVar.a : null, tf40Var.a.V(), AudioAdConfig.Type.PREROLL, 56), !this.p, 0);
        }
        if (z3 && ((Boolean) bpn0Var.getValue()).booleanValue()) {
            return;
        }
        nb4Var.d(musicTrack, hx40Var.p.d, this.b);
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        px40 E = E();
        if (E != null) {
            E.v(cz40Var, vkPlayerException);
        }
    }

    @Override // xsna.ex40
    public final boolean x() {
        return this.c.k;
    }

    @Override // xsna.d940
    public final AdvertisementInfo y() {
        return this.d.f.i;
    }

    @Override // xsna.dx40
    public final boolean z() {
        return this.c.n.c() || this.d.b.z();
    }

    @Override // xsna.px40
    public final void onStop() {
    }
}
