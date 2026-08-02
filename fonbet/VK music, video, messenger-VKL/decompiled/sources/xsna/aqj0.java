package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import one.video.controls.view.state.CastButtonState;
import one.video.controls.view.state.Mode;
import one.video.controls.view.state.PlayPauseButtonViewState;

/* compiled from: SimpleControlsViewState.kt */
/* loaded from: classes8.dex */
public final class aqj0 {
    public static final aqj0 G = new aqj0(Mode.HIDE, hs8.c, CastButtonState.c, p5r.d, sxs.c, woa0.c, k4h0.c, w0j0.d, v7o0.d, ldr0.d, ozb0.e, hn80.g, g3e0.c, qso0.c, smz.c, ojz.c, rxu.c, s6s.c, zfg0.c, l3d0.c, w170.c, mbu.c, w3e0.d, PlayPauseButtonViewState.d, zfk0.d, alp.c, ixp.c, cmq.c, ilk.j, u3i0.g, w6y0.d, wlq.c);
    public final ixp A;
    public final cmq B;
    public final ilk C;
    public final u3i0 D;
    public final w6y0 E;
    public final wlq F;
    public final Mode a;
    public final hs8 b;
    public final CastButtonState c;
    public final p5r d;
    public final sxs e;
    public final woa0 f;
    public final k4h0 g;
    public final w0j0 h;
    public final v7o0 i;
    public final ldr0 j;
    public final ozb0 k;
    public final hn80 l;
    public final g3e0 m;
    public final qso0 n;
    public final smz o;
    public final ojz p;
    public final rxu q;
    public final s6s r;
    public final zfg0 s;
    public final l3d0 t;
    public final w170 u;
    public final mbu v;
    public final w3e0 w;
    public final PlayPauseButtonViewState x;
    public final zfk0 y;
    public final alp z;

    public aqj0(Mode mode, hs8 hs8Var, CastButtonState castButtonState, p5r p5rVar, sxs sxsVar, woa0 woa0Var, k4h0 k4h0Var, w0j0 w0j0Var, v7o0 v7o0Var, ldr0 ldr0Var, ozb0 ozb0Var, hn80 hn80Var, g3e0 g3e0Var, qso0 qso0Var, smz smzVar, ojz ojzVar, rxu rxuVar, s6s s6sVar, zfg0 zfg0Var, l3d0 l3d0Var, w170 w170Var, mbu mbuVar, w3e0 w3e0Var, PlayPauseButtonViewState playPauseButtonViewState, zfk0 zfk0Var, alp alpVar, ixp ixpVar, cmq cmqVar, ilk ilkVar, u3i0 u3i0Var, w6y0 w6y0Var, wlq wlqVar) {
        this.a = mode;
        this.b = hs8Var;
        this.c = castButtonState;
        this.d = p5rVar;
        this.e = sxsVar;
        this.f = woa0Var;
        this.g = k4h0Var;
        this.h = w0j0Var;
        this.i = v7o0Var;
        this.j = ldr0Var;
        this.k = ozb0Var;
        this.l = hn80Var;
        this.m = g3e0Var;
        this.n = qso0Var;
        this.o = smzVar;
        this.p = ojzVar;
        this.q = rxuVar;
        this.r = s6sVar;
        this.s = zfg0Var;
        this.t = l3d0Var;
        this.u = w170Var;
        this.v = mbuVar;
        this.w = w3e0Var;
        this.x = playPauseButtonViewState;
        this.y = zfk0Var;
        this.z = alpVar;
        this.A = ixpVar;
        this.B = cmqVar;
        this.C = ilkVar;
        this.D = u3i0Var;
        this.E = w6y0Var;
        this.F = wlqVar;
    }

    public static aqj0 a(aqj0 aqj0Var, Mode mode, hs8 hs8Var, CastButtonState castButtonState, p5r p5rVar, sxs sxsVar, woa0 woa0Var, k4h0 k4h0Var, w0j0 w0j0Var, v7o0 v7o0Var, ldr0 ldr0Var, ozb0 ozb0Var, hn80 hn80Var, g3e0 g3e0Var, qso0 qso0Var, smz smzVar, ojz ojzVar, rxu rxuVar, s6s s6sVar, zfg0 zfg0Var, l3d0 l3d0Var, w170 w170Var, mbu mbuVar, w3e0 w3e0Var, PlayPauseButtonViewState playPauseButtonViewState, zfk0 zfk0Var, alp alpVar, ixp ixpVar, cmq cmqVar, ilk ilkVar, u3i0 u3i0Var, w6y0 w6y0Var, wlq wlqVar, int i) {
        Mode mode2 = (i & 1) != 0 ? aqj0Var.a : mode;
        hs8 hs8Var2 = (i & 2) != 0 ? aqj0Var.b : hs8Var;
        CastButtonState castButtonState2 = (i & 4) != 0 ? aqj0Var.c : castButtonState;
        p5r p5rVar2 = (i & 8) != 0 ? aqj0Var.d : p5rVar;
        sxs sxsVar2 = (i & 16) != 0 ? aqj0Var.e : sxsVar;
        woa0 woa0Var2 = (i & 32) != 0 ? aqj0Var.f : woa0Var;
        k4h0 k4h0Var2 = (i & 64) != 0 ? aqj0Var.g : k4h0Var;
        w0j0 w0j0Var2 = (i & 128) != 0 ? aqj0Var.h : w0j0Var;
        v7o0 v7o0Var2 = (i & 256) != 0 ? aqj0Var.i : v7o0Var;
        ldr0 ldr0Var2 = (i & 512) != 0 ? aqj0Var.j : ldr0Var;
        ozb0 ozb0Var2 = (i & 1024) != 0 ? aqj0Var.k : ozb0Var;
        hn80 hn80Var2 = (i & 2048) != 0 ? aqj0Var.l : hn80Var;
        g3e0 g3e0Var2 = (i & 4096) != 0 ? aqj0Var.m : g3e0Var;
        qso0 qso0Var2 = (i & 8192) != 0 ? aqj0Var.n : qso0Var;
        Mode mode3 = mode2;
        smz smzVar2 = (i & 16384) != 0 ? aqj0Var.o : smzVar;
        ojz ojzVar2 = (i & 32768) != 0 ? aqj0Var.p : ojzVar;
        rxu rxuVar2 = (i & 65536) != 0 ? aqj0Var.q : rxuVar;
        s6s s6sVar2 = (i & 131072) != 0 ? aqj0Var.r : s6sVar;
        zfg0 zfg0Var2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? aqj0Var.s : zfg0Var;
        l3d0 l3d0Var2 = (i & 524288) != 0 ? aqj0Var.t : l3d0Var;
        w170 w170Var2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? aqj0Var.u : w170Var;
        mbu mbuVar2 = (i & 2097152) != 0 ? aqj0Var.v : mbuVar;
        w3e0 w3e0Var2 = (i & 4194304) != 0 ? aqj0Var.w : w3e0Var;
        PlayPauseButtonViewState playPauseButtonViewState2 = (i & 8388608) != 0 ? aqj0Var.x : playPauseButtonViewState;
        zfk0 zfk0Var2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? aqj0Var.y : zfk0Var;
        alp alpVar2 = (i & 33554432) != 0 ? aqj0Var.z : alpVar;
        ixp ixpVar2 = (i & 67108864) != 0 ? aqj0Var.A : ixpVar;
        cmq cmqVar2 = (i & 134217728) != 0 ? aqj0Var.B : cmqVar;
        ilk ilkVar2 = (i & 268435456) != 0 ? aqj0Var.C : ilkVar;
        u3i0 u3i0Var2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? aqj0Var.D : u3i0Var;
        w6y0 w6y0Var2 = (i & 1073741824) != 0 ? aqj0Var.E : w6y0Var;
        wlq wlqVar2 = (i & Integer.MIN_VALUE) != 0 ? aqj0Var.F : wlqVar;
        aqj0Var.getClass();
        return new aqj0(mode3, hs8Var2, castButtonState2, p5rVar2, sxsVar2, woa0Var2, k4h0Var2, w0j0Var2, v7o0Var2, ldr0Var2, ozb0Var2, hn80Var2, g3e0Var2, qso0Var2, smzVar2, ojzVar2, rxuVar2, s6sVar2, zfg0Var2, l3d0Var2, w170Var2, mbuVar2, w3e0Var2, playPauseButtonViewState2, zfk0Var2, alpVar2, ixpVar2, cmqVar2, ilkVar2, u3i0Var2, w6y0Var2, wlqVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqj0)) {
            return false;
        }
        aqj0 aqj0Var = (aqj0) obj;
        return this.a == aqj0Var.a && epx.f(this.b, aqj0Var.b) && epx.f(this.c, aqj0Var.c) && epx.f(this.d, aqj0Var.d) && epx.f(this.e, aqj0Var.e) && epx.f(this.f, aqj0Var.f) && epx.f(this.g, aqj0Var.g) && epx.f(this.h, aqj0Var.h) && epx.f(this.i, aqj0Var.i) && epx.f(this.j, aqj0Var.j) && epx.f(this.k, aqj0Var.k) && epx.f(this.l, aqj0Var.l) && epx.f(this.m, aqj0Var.m) && epx.f(this.n, aqj0Var.n) && epx.f(this.o, aqj0Var.o) && epx.f(this.p, aqj0Var.p) && epx.f(this.q, aqj0Var.q) && epx.f(this.r, aqj0Var.r) && epx.f(this.s, aqj0Var.s) && epx.f(this.t, aqj0Var.t) && epx.f(this.u, aqj0Var.u) && epx.f(this.v, aqj0Var.v) && epx.f(this.w, aqj0Var.w) && epx.f(this.x, aqj0Var.x) && epx.f(this.y, aqj0Var.y) && epx.f(this.z, aqj0Var.z) && epx.f(this.A, aqj0Var.A) && epx.f(this.B, aqj0Var.B) && epx.f(this.C, aqj0Var.C) && epx.f(this.D, aqj0Var.D) && epx.f(this.E, aqj0Var.E) && epx.f(this.F, aqj0Var.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + qoy.b((this.x.hashCode() + qoy.b((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + qoy.b(qoy.b(qoy.b((this.g.hashCode() + qoy.b((this.e.hashCode() + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a)) * 31, 31, this.f.a)) * 31, 31, this.h.a), 31, this.i.a), 31, this.j.a)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.w.a)) * 31, 31, this.y.a)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SimpleControlsViewState(mode=" + this.a + ", buttonsLayoutState=" + this.b + ", castButtonState=" + this.c + ", feedbackButtonState=" + this.d + ", fullscreenButtonState=" + this.e + ", pipButtonState=" + this.f + ", scaleButtonState=" + this.g + ", settingsButtonState=" + this.h + ", techBugReportButtonState=" + this.i + ", vkLogoButtonState=" + this.j + ", positionDurationViewState=" + this.k + ", oneVideoSeekBarViewState=" + this.l + ", progressSeekBarViewState=" + this.m + ", thumbSeekBarViewState=" + this.n + ", liveTimeViewState=" + this.o + ", liveLabelViewState=" + this.p + ", headerLayoutState=" + this.q + ", footerLayoutState=" + this.r + ", reverseLayoutState=" + this.s + ", prevVideoButtonViewState=" + this.t + ", nextVideoButtonViewState=" + this.u + ", gradientViewState=" + this.v + ", progressViewState=" + this.w + ", playPauseButtonViewState=" + this.x + ", soundOnlyViewState=" + this.y + ", endViewLayoutState=" + this.z + ", errorViewState=" + this.A + ", fastSpeedHintViewState=" + this.B + ", currentIntervalTitleViewState=" + this.C + ", seekPreviewLayoutState=" + this.D + ", zoomRateViewState=" + this.E + ", fastSeekViewState=" + this.F + ")";
    }
}
