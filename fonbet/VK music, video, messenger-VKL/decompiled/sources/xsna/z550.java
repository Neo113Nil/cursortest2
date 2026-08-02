package xsna;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.snippet.player.analytics.model.MusicLongtapExitType;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ry40;

/* compiled from: MusicSnippetDialog.kt */
/* loaded from: classes3.dex */
public final class z550 extends b33 implements m0q0, k230, fcn {
    public static final /* synthetic */ qcy<Object>[] t;
    public final Activity h;
    public final MusicTrack i;
    public final MusicPlaybackLaunchContext j;
    public final String k;
    public final d650 l;
    public boolean m;
    public int n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final io.reactivex.rxjava3.disposables.b s;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(z550.class, "musicPlayerListener", "getMusicPlayerListener()Lcom/vk/music/player/api/listener/MusicPlayerListener;", 0);
        fpf0.a.getClass();
        t = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    public z550(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        super(activity, 0);
        this.h = activity;
        this.i = musicTrack;
        this.j = musicPlaybackLaunchContext;
        this.k = str;
        this.n = 32;
        gn40 gn40Var = new gn40(activity);
        qc00 qc00Var = new qc00(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, qc00Var);
        this.o = a2;
        this.p = msy.a(lazyThreadSafetyMode, new ko00(this, 8));
        this.q = msy.a(lazyThreadSafetyMode, new wt30(this, 2));
        this.r = msy.a(lazyThreadSafetyMode, new hvz(this, 15));
        sxi sxiVar = new sxi(new rx40(0), new a());
        this.s = new io.reactivex.rxjava3.disposables.b();
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        d650 d650Var = new d650(getContext());
        d650Var.setSnippetListener(this);
        d650Var.setTextInfo(musicTrack);
        if (((a630) a2.getValue()).i(musicTrack) || musicTrack.l) {
            d650Var.setAddButton(musicTrack);
        } else {
            d650Var.e.setVisibility(8);
        }
        this.l = d650Var;
        setContentView(d650Var);
        eck0 o = o();
        qcy<Object> qcyVar = t[0];
        o.n((px40) sxiVar.c.getValue());
        setOnShowListener(new y550(this, 0));
        mnh0.c(getOnBackPressedDispatcher(), this, new ebx(this, 12), 2);
        gn40Var.b();
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return false;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k230
    public final void a(MusicTrack musicTrack) {
        ?? r0 = this.o;
        if (((a630) r0.getValue()).i(musicTrack) || musicTrack.l) {
            io.reactivex.rxjava3.core.q<Integer> e1 = ((a630) r0.getValue()).e1(musicTrack, this.j, true);
            gl30 gl30Var = new gl30(new u6k(this, 28), 3);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            this.s.b(itg0.m(e1.E(gl30Var, lVar, kVar, kVar).F(new n1r(new u3u(this, 13), 8))));
        }
    }

    @Override // xsna.b33, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.m) {
            return;
        }
        this.m = true;
        super.dismiss();
        n().b(MusicLongtapExitType.CLICK_OUTSIDE);
        o().n(null);
        o().o(this.n);
        o().l(36);
        this.s.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final m5d0 n() {
        return (m5d0) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final eck0 o() {
        return (eck0) this.q.getValue();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        o().e.getClass();
        if (z) {
            o().m(new PlaybackActionMeta(0, 0L, 2, null));
        } else {
            o().j(1);
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return true;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UiTracker uiTracker = UiTracker.a;
        uiTrackingScreen.a = UiTracker.c();
    }

    /* compiled from: MusicSnippetDialog.kt */
    public static final class a implements px40 {
        public a() {
        }

        @Override // xsna.px40
        public final void a(ry40 ry40Var) {
            boolean z = ry40Var instanceof ry40.e.b;
            z550 z550Var = z550.this;
            if (z) {
                d650 d650Var = z550Var.l;
                if (d650Var != null) {
                    d650Var.setCover(z550Var.i);
                    return;
                }
                return;
            }
            if (ry40Var.h()) {
                z550Var.n = 28;
                z550Var.n().b(MusicLongtapExitType.AUTO_FINISH);
                z550Var.dismiss();
            }
        }

        @Override // xsna.px40
        public final void i(ly40 ly40Var) {
            z550 z550Var = z550.this;
            m5d0 n = z550Var.n();
            long j = ly40Var.b;
            n.onProgress(j);
            d650 d650Var = z550Var.l;
            if (d650Var != null) {
                d650Var.g.P4((int) j);
            }
        }

        @Override // xsna.px40
        public final void onStop() {
            z550 z550Var = z550.this;
            z550Var.n().b(MusicLongtapExitType.AUTO_FINISH);
            z550Var.dismiss();
        }

        @Override // xsna.px40
        public final void q(ky40 ky40Var) {
            z550 z550Var = z550.this;
            d650 d650Var = z550Var.l;
            if (d650Var != null) {
                d650Var.g.Q4(z550Var.i, (int) ky40Var.c, (int) ky40Var.d);
            }
        }

        @Override // xsna.px40
        public final void G() {
        }

        @Override // xsna.px40
        public final void B(ky40 ky40Var) {
        }

        @Override // xsna.px40
        public final void D(v0q<? extends kw40> v0qVar) {
        }

        @Override // xsna.px40
        public final void F(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void d(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void l(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        }

        @Override // xsna.px40
        public final void n(cz40 cz40Var, int i, long j) {
        }
    }
}
