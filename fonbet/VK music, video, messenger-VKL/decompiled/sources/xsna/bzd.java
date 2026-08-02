package xsna;

import android.content.Context;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.callbacks.tracker.ClipsEditorScreenType;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPreview;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kuc;
import xsna.qzd;
import xsna.wzd;
import xsna.xvd;

/* compiled from: ClipsEditorPresenter.kt */
/* loaded from: classes16.dex */
public final class bzd extends zsi implements exd {
    public static int x;
    public static int y;
    public static long z;
    public final ClipsEditorInitParams b;
    public final t0e c;
    public final ClipsEditorFragment.b d;
    public final e2e e;
    public final mzp0 f;
    public final lxd g;
    public final q0e h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final c9d n;
    public final Object o;
    public final szd p;
    public final bwd q;
    public final r1f r;
    public final oxd s;
    public final Object t;
    public final Object u;
    public final bpn0 v;
    public final io.reactivex.rxjava3.subjects.d<Object> w;

    /* compiled from: ClipsEditorPresenter.kt */
    public final class a implements xvd.a {
        public a() {
        }

        @Override // xsna.xvd.a
        public final void a() {
            bzd bzdVar = bzd.this;
            e2e e2eVar = bzdVar.e;
            cxd cxdVar = e2eVar.k;
            fo50 fo50Var = e2eVar.e;
            new eml(2, false).a(sxd.a(bzdVar.g()), new com.vk.movika.sdk.android.defaultplayer.interactive.a(bzdVar, 19));
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class c {
        public c() {
        }

        public final void a(boolean z) {
            bzd bzdVar = bzd.this;
            t0e t0eVar = bzdVar.c;
            if (t0eVar.getCurrentScreen() != ClipsEditorScreen.State.VIDEO_CROPPER) {
                t0eVar.getVideoOverlayInteractor().b2(z);
                return;
            }
            s0e s0eVar = bzdVar.h.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.d();
            if (z) {
                return;
            }
            t0eVar.getVideoOverlayInteractor().b2(false);
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class d {
        public d() {
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class e {
        public e() {
        }

        public final int a() {
            return bzd.this.c.getStickersInteractor().getHeight();
        }

        public final int b() {
            return bzd.this.c.getStickersInteractor().getWidth();
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class f {
        public f() {
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public final class g {
        public g() {
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements yzs<ClipsEditorInputData, File, gzs<? extends s3q0>, io.reactivex.rxjava3.core.x<com.vk.clips.editor.state.model.a>> {
        @Override // xsna.yzs
        public final io.reactivex.rxjava3.core.x<com.vk.clips.editor.state.model.a> invoke(ClipsEditorInputData clipsEditorInputData, File file, gzs<? extends s3q0> gzsVar) {
            return ((p1f) this.receiver).c(clipsEditorInputData, file);
        }
    }

    /* compiled from: ClipsEditorPresenter.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((bzd) this.receiver).l();
            return s3q0.a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        x = (int) timeUnit.toMillis(3L);
        y = (int) timeUnit.toMillis(1L);
        z = 300L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzd(ClipsEditorInitParams clipsEditorInitParams, t0e t0eVar, ClipsEditorFragment.b bVar, e2e e2eVar, mzp0 mzp0Var, lxd lxdVar) {
        super(0);
        ClipsEditorSessionParams clipsEditorSessionParams = clipsEditorInitParams.d;
        fo50 fo50Var = e2eVar.e;
        this.b = clipsEditorInitParams;
        this.c = t0eVar;
        this.d = bVar;
        this.e = e2eVar;
        this.f = mzp0Var;
        this.g = lxdVar;
        ufc ufcVar = new ufc(t0eVar.getStickersInteractor(), e2eVar);
        defpackage.g gVar = new defpackage.g(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, gVar);
        Context ctx = t0eVar.getCtx();
        f fVar = new f();
        cxd cxdVar = e2eVar.k;
        szd szdVar = new szd(ctx, ufcVar, fVar, new eml(2, false), e2eVar.i.e(), e2eVar.c, e2eVar.j, (ClipsDraftComponent) ((bpn0) lxdVar.d).getValue(), clipsEditorSessionParams.d);
        this.p = szdVar;
        this.s = new rxd(new ndo(t0eVar.getStickersInteractor(), szdVar));
        this.t = msy.a(lazyThreadSafetyMode, new defpackage.h(this, 20));
        this.u = msy.a(lazyThreadSafetyMode, new defpackage.i(this, 23));
        this.w = io.reactivex.rxjava3.subjects.d.N0();
        z = 100L;
        x = cxdVar.a(true);
        y = cxdVar.a(false);
        a aVar = new a();
        c9d c9dVar = new c9d(t0eVar.getCtx(), e2eVar, t0eVar.getPlayerView(), szdVar, new c(), lxdVar);
        this.n = c9dVar;
        this.v = new bpn0(new defpackage.j(this, 19));
        bwd bwdVar = new bwd(t0eVar.getCtx(), c9dVar, aVar, t0eVar.getAlertsHandler(), szdVar, e2eVar, lxdVar);
        this.q = bwdVar;
        this.m = new bpn0(new defpackage.k(this, 15));
        this.r = new r1f(t0eVar.getCtx(), c9dVar, bwdVar, e2eVar, j());
        this.h = new q0e(new g(), bwdVar, t0eVar.getAlertsHandler(), c9dVar, szdVar, e2eVar, bVar, j(), t0eVar.getStickersInteractor(), clipsEditorSessionParams.f, lxdVar);
        this.i = new bpn0(new e4(this, 14));
        this.j = new bpn0(new il1(this, 17));
        this.k = new bpn0(new gy0(this, 23));
        this.l = new bpn0(new eu1(this, 20));
        h5f h5fVar = new h5f();
        h5fVar.a = new q(this, 20);
        t0eVar.getStickersInteractor().e(h5fVar);
        c9dVar.d(false);
    }

    @Override // xsna.exd
    public final x8d b() {
        return this.n;
    }

    @Override // xsna.zsi
    public final void d() {
        super.d();
        bpn0 bpn0Var = this.m;
        if (bpn0Var.isInitialized()) {
            ((gzd) bpn0Var.getValue()).dispose();
        }
        this.r.d();
        bwd bwdVar = this.q;
        hg1.f(bwdVar.i);
        bwdVar.i = null;
        cxd cxdVar = this.e.k;
        this.s.dispose();
    }

    @Override // xsna.exd
    public final boolean e() {
        return !this.b.d.c;
    }

    @Override // xsna.exd
    public final guj0 f() {
        return new guj0(this.n, this.p);
    }

    public final com.vk.clips.editor.state.model.a g() {
        return this.p.o.a;
    }

    @Override // xsna.exd
    public final void h(ClipsEditorScreenType clipsEditorScreenType) {
        ClipsEditorScreenType clipsEditorScreenType2;
        qzd j = j();
        if (j != null) {
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            if (uiTrackingScreen != null) {
                switch (ozd.$EnumSwitchMapping$0[uiTrackingScreen.a.ordinal()]) {
                    case 1:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_EDITOR;
                        break;
                    case 2:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_FRAGMENT_SPEED_EDITOR;
                        break;
                    case 3:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR;
                        break;
                    case 4:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_FRAGMENT_VOLUME_EDITOR;
                        break;
                    case 5:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR;
                        break;
                    case 6:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_EDITOR_FRAGMENTS_SWAP;
                        break;
                    case 7:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_EDITOR_FULLSCREEN;
                        break;
                    default:
                        clipsEditorScreenType2 = ClipsEditorScreenType.CLIPS_EDITOR;
                        break;
                }
            } else {
                clipsEditorScreenType2 = null;
            }
            switch (qzd.a.$EnumSwitchMapping$0[clipsEditorScreenType.ordinal()]) {
                case 1:
                    if (clipsEditorScreenType2 == ClipsEditorScreenType.CLIPS_EDITOR_FULLSCREEN) {
                        j.a(new MobileOfficialAppsClipsStat$TypeClipPreview(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_CLOSE));
                    }
                    y1q0 b2 = j.b();
                    if (b2 != null) {
                        b2.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR), false);
                        return;
                    }
                    return;
                case 2:
                    y1q0 b3 = j.b();
                    if (b3 != null) {
                        b3.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FRAGMENT_SPEED_EDITOR), true);
                        return;
                    }
                    return;
                case 3:
                    y1q0 b4 = j.b();
                    if (b4 != null) {
                        b4.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR), true);
                        return;
                    }
                    return;
                case 4:
                    y1q0 b5 = j.b();
                    if (b5 != null) {
                        b5.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FRAGMENT_VOLUME_EDITOR), true);
                        return;
                    }
                    return;
                case 5:
                    y1q0 b6 = j.b();
                    if (b6 != null) {
                        b6.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR), true);
                        return;
                    }
                    return;
                case 6:
                    y1q0 b7 = j.b();
                    if (b7 != null) {
                        b7.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR_FRAGMENTS_SWAP), true);
                        return;
                    }
                    return;
                case 7:
                    j.a(new MobileOfficialAppsClipsStat$TypeClipPreview(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_OPEN));
                    y1q0 b8 = j.b();
                    if (b8 != null) {
                        b8.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR_FULLSCREEN), true);
                        return;
                    }
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // xsna.exd
    public final bpn0 i() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qzd j() {
        return (qzd) this.u.getValue();
    }

    public final void k(File file, izs<? super File, s3q0> izsVar) {
        int i2 = 3;
        ty0 ty0Var = new ty0(this, file, izsVar, i2);
        d2e d2eVar = this.e.h;
        t0e t0eVar = this.c;
        if (j8.d(t0eVar.getCtx())) {
            return;
        }
        ClipsEditorAudioItem clipsEditorAudioItem = g().d;
        if (clipsEditorAudioItem == null || clipsEditorAudioItem.d() != ClipsEditorAudioItem.Type.LICENSED || clipsEditorAudioItem.a.b.j) {
            ty0Var.invoke();
        } else {
            t0eVar.getAlertsHandler().e(ty0Var, new pr6(i2));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void l() {
        boolean z2;
        String str = this.b.d.b;
        if (str != null) {
            k(new File(str), new com.vk.movika.sdk.base.observable.k(this, 19));
            return;
        }
        new i(0, this, bzd.class, "uploadClip", "uploadClip()V", 0);
        boolean d2 = NotificationLite.d(this.w.b.get());
        e2e e2eVar = this.e;
        if (d2 && this.q.d(true)) {
            d2e d2eVar = e2eVar.h;
            z2 = !j8.d(this.c.getCtx());
        } else {
            z2 = false;
        }
        if (z2) {
            this.n.d(false);
            cxd cxdVar = e2eVar.k;
            new eml(2, false).a(sxd.a(g()), new in0(this, 23));
        }
    }

    @Override // xsna.exd
    public final bpn0 m() {
        return this.k;
    }

    @Override // xsna.exd
    public final q0e n() {
        return this.h;
    }

    @Override // xsna.exd
    public final bpn0 o() {
        return this.l;
    }

    @Override // xsna.exd
    public final void prepare() {
        io.reactivex.rxjava3.core.x k;
        io.reactivex.rxjava3.core.x<com.vk.clips.editor.state.model.a> l;
        iz izVar = new iz(this, 24);
        h hVar = new h(3, this.r, p1f.class, "handleVideoToClip", "handleVideoToClip(Lcom/vk/dto/clips/model/ClipsEditorInputData;Ljava/io/File;Lkotlin/jvm/functions/Function0;)Lio/reactivex/rxjava3/core/Single;", 0);
        defpackage.e eVar = new defpackage.e(this, 20);
        defpackage.f fVar = new defpackage.f(this, 14);
        szd szdVar = this.p;
        g2f g2fVar = szdVar.e;
        ClipsEditorInitParams clipsEditorInitParams = this.b;
        VideoToClipInfo videoToClipInfo = clipsEditorInitParams.c.w;
        ClipsEditorInputData clipsEditorInputData = clipsEditorInitParams.b;
        if (videoToClipInfo == null || !videoToClipInfo.e) {
            ClipsEditorInputAudioItem clipsEditorInputAudioItem = clipsEditorInputData.c;
            if (clipsEditorInputAudioItem != null) {
                ClipsEditorMusicInfo clipsEditorMusicInfo = clipsEditorInputAudioItem.b;
                if (!clipsEditorMusicInfo.l && !clipsEditorMusicInfo.j) {
                    k = gcd0.j(szdVar.f, szdVar.a, clipsEditorMusicInfo).l(new q40(new eaa(3, clipsEditorInputData, clipsEditorInputAudioItem), 6));
                    l = k.l(new r41(new r9(szdVar, 19), 14));
                }
            }
            k = io.reactivex.rxjava3.core.x.k(clipsEditorInputData);
            l = k.l(new r41(new r9(szdVar, 19), 14));
        } else {
            ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) j5g.b0(0, clipsEditorInputData.b);
            File file = clipsEditorInputVideoItem != null ? clipsEditorInputVideoItem.b : null;
            if (file == null) {
                lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorStateController", "vtc input must lie inside video data list"}, 2));
                return;
            }
            l = hVar.invoke(clipsEditorInputData, file, fVar);
        }
        io.reactivex.rxjava3.disposables.c cVar = szdVar.k;
        if (cVar != null) {
            cVar.dispose();
        }
        szdVar.k = cug0.c(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(l.q(g2fVar.c()).m(g2fVar.d()), new t00(new t40(szdVar, 21), 16)).m(g2fVar.c()), new j22(new pd(izVar, 28), 14)), szdVar.a, new gtl(4), null, fVar, 16).m(g2fVar.d()).subscribe(new gf0(new bp7(5, eVar, szdVar), 11), new da(new r6(fVar, 22), 14));
    }

    @Override // xsna.exd
    public final void q(boolean z2) {
        fo50 fo50Var = this.e.e;
        qzd j = j();
        ClipsEditorInitParams clipsEditorInitParams = this.b;
        if (j != null) {
            boolean z3 = clipsEditorInitParams.b.f;
        }
        if (z2 && (this.p.m.size() > 1 || !clipsEditorInitParams.b.f)) {
            ks2 ks2Var = new ks2(5, this, fo50Var);
            ew3 ew3Var = new ew3(3, this, fo50Var);
            t0e t0eVar = this.c;
            t0eVar.getAlertsHandler().c(new kuc.c(ks2Var, ew3Var, t0eVar.getCtx()));
            return;
        }
        boolean z4 = clipsEditorInitParams.d.e;
        ClipsEditorFragment.b bVar = this.d;
        if (!z4) {
            bVar.b(0, null);
        } else {
            fo50Var.I();
            bVar.b(0, null);
        }
    }

    @Override // xsna.exd
    public final boolean r() {
        cxd cxdVar = this.e.k;
        return true;
    }

    @Override // xsna.exd
    public final void s(com.vk.clips.editor.state.model.b bVar, boolean z2) {
        gwd gwdVar = (gwd) this.v.getValue();
        rzd rzdVar = gwdVar.a;
        nov novVar = bVar.b;
        long n = gwdVar.b.n();
        if (n < 5) {
            n = 0;
        }
        long min = Math.min(com.vk.clips.editor.state.model.b.c + n, rzdVar.getState().e());
        cxd cxdVar = gwdVar.c.k;
        novVar.getCommons().p(new q500(Math.max(0L, Math.min(n, min - 100)), min));
        int i2 = 1;
        List<? extends wzd> l = e43.l(z2 ? new wzd.a(bvc.a, i2) : new wzd.a(xuc.a, i2), new wzd.b(null));
        ArrayList arrayList = new ArrayList(rzdVar.getState().f);
        arrayList.add(Collections.singletonList(bVar));
        rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, arrayList, null, 95), l);
    }

    @Override // xsna.exd
    public final bpn0 w() {
        return this.i;
    }

    @Override // xsna.exd
    public final boolean y() {
        return this.b.d.g;
    }
}
