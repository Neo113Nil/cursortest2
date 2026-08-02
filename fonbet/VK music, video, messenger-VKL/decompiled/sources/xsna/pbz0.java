package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dvy0;
import xsna.igz0;
import xsna.loy0;
import xsna.t5z0;
import xsna.ugy0;
import xsna.xoy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class pbz0 implements jaz0, t5z0.a, xoy0.b, ugy0.a, AudioManager.OnAudioFocusChangeListener, loy0.a, dvy0.a {
    public final tez0 b;
    public final igz0.a c;
    public final ViewGroup d;
    public final m50 f;
    public int h;
    public final kpy0 i;
    public final igz0.b j;
    public final kwy0 k;
    public final loy0 l;
    public final dvy0 m;
    public final lgz0 n;
    public final cez0 o;
    public final f5z0 p;
    public final float r;
    public long s;
    public final long t;
    public final ArrayList u;
    public final boolean w;
    public final ArrayList q = new ArrayList();
    public boolean v = true;
    public final jk9 g = new jk9(this, 19);
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements r0z0 {
        public a() {
        }

        @Override // xsna.r0z0
        public final void a() {
            pbz0 pbz0Var = pbz0.this;
            if (pbz0Var.m == null) {
                return;
            }
            pbz0Var.j.b();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, xsna.t5z0] */
        @Override // xsna.r0z0
        public final void b() {
            pbz0 pbz0Var = pbz0.this;
            pbz0Var.d.b();
            pbz0Var.e.removeCallbacks(pbz0Var.f);
            pbz0Var.h = 0;
            pbz0Var.c.a.j = true;
            gu8.c(null, "InterstitialPresenterS4.InterstitialMediaPresenterS4Impl: Error video playing");
        }

        @Override // xsna.r0z0
        public final void c() {
            pbz0 pbz0Var = pbz0.this;
            kwy0 kwy0Var = pbz0Var.k;
            loy0 loy0Var = pbz0Var.l;
            if (loy0Var != null) {
                if (loy0Var.isPlaying()) {
                    pbz0Var.s();
                    if (kwy0Var != null) {
                        kwy0Var.k();
                    }
                } else if (loy0Var.getPosition() > 0) {
                    pbz0Var.resume();
                    if (kwy0Var != null) {
                        kwy0Var.n();
                    }
                } else {
                    pbz0Var.t();
                }
            }
            pbz0Var.v();
        }

        @Override // xsna.r0z0
        public final void d() {
            pbz0 pbz0Var = pbz0.this;
            loy0 loy0Var = pbz0Var.l;
            if (loy0Var != null) {
                loy0Var.a();
                kwy0 kwy0Var = pbz0Var.k;
                if (kwy0Var != null) {
                    kwy0Var.f(!loy0Var.c());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [android.view.ViewGroup, xsna.t5z0] */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.ViewGroup, xsna.t5z0] */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.view.ViewGroup, xsna.t5z0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup, xsna.t5z0] */
    public pbz0(guy0 guy0Var, tez0 tez0Var, igz0.a aVar, igz0.b bVar, xqg0 xqg0Var) {
        pbz0 pbz0Var;
        boolean z = false;
        this.h = 0;
        this.j = bVar;
        this.b = tez0Var;
        this.c = aVar;
        this.w = tez0Var.s();
        ArrayList arrayList = tez0Var.b0;
        if (arrayList.isEmpty() || !tez0Var.P) {
            pbz0Var = this;
            if (arrayList.isEmpty()) {
                lgz0 lgz0Var = tez0Var.c0;
                if (lgz0Var != null) {
                    pbz0Var.n = lgz0Var;
                    Object a2 = guy0Var.a(tez0Var, pbz0Var, new a(), null, null);
                    pbz0Var.d = (ViewGroup) a2;
                    if (a2 instanceof r3z0) {
                        r3z0 r3z0Var = (r3z0) a2;
                        dvy0 videoView = r3z0Var.getVideoView();
                        pbz0Var.m = videoView;
                        videoView.setAdVideoViewListener(this);
                        f5z0 a3 = f5z0.a(lgz0Var.a, xqg0Var);
                        pbz0Var.p = a3;
                        pbz0Var.k = kwy0.a(lgz0Var, guy0Var.a, xqg0Var, guy0Var.b);
                        a3.d(videoView);
                        pbz0Var.r = lgz0Var.D;
                        loy0 videoPlayer = r3z0Var.getVideoPlayer();
                        pbz0Var.l = videoPlayer;
                        videoPlayer.x(this);
                        cez0 videoContent = r3z0Var.getVideoContent();
                        pbz0Var.o = videoContent;
                        videoContent.setDuration(lgz0Var.D);
                    }
                    if (lgz0Var.g0) {
                        pbz0Var.l.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        pbz0Var.l.setVolume(1.0f);
                    }
                } else {
                    pbz0Var.d = (ViewGroup) guy0Var.a(tez0Var, pbz0Var, null, null, null);
                }
            } else {
                pbz0Var.d = (ViewGroup) guy0Var.a(tez0Var, pbz0Var, null, this, null);
            }
        } else {
            Object a4 = guy0Var.a(tez0Var, this, null, this, this);
            pbz0Var = this;
            pbz0Var.d = (ViewGroup) a4;
            pbz0Var.u = new ArrayList();
            ugy0 ugy0Var = (ugy0) a4;
            int i = 0;
            while (i < arrayList.size()) {
                pbz0Var.u.add(new puy0((wfy0) arrayList.get(i), i == 0));
                i++;
            }
            ArrayList arrayList2 = pbz0Var.u;
            ugy0Var.a(arrayList2, (puy0) arrayList2.get(0));
        }
        pbz0Var.d.setBanner(pbz0Var.b);
        pbz0Var.f = new m50(this, 11);
        tez0 tez0Var2 = pbz0Var.b;
        wty0 wty0Var = tez0Var2.L;
        if (wty0Var != null && wty0Var.c != null) {
            kpy0 kpy0Var = new kpy0(wty0Var, tez0Var2.i(), pbz0Var.d.a().getContext());
            pbz0Var.i = kpy0Var;
            kpy0Var.e = new rr2(this, tez0Var2);
        }
        aVar.j(pbz0Var.b, pbz0Var.d.a());
        tez0 tez0Var3 = pbz0Var.b;
        ?? r11 = pbz0Var.d;
        lgz0 lgz0Var2 = tez0Var3.c0;
        if (lgz0Var2 == null || !lgz0Var2.h0) {
            if (tez0Var3.Y) {
                long j = (long) (tez0Var3.V * 1000.0f);
                pbz0Var.t = j;
                pbz0Var.s = j;
                if (j > 0) {
                    gu8.c(null, "InterstitialPresenterS4: Banner will be allowed to close in " + pbz0Var.s + " millis");
                    pbz0Var.h = 1;
                    u();
                } else {
                    gu8.c(null, "InterstitialPresenterS4: Banner is allowed to close");
                    m();
                    z = true;
                }
            } else {
                pbz0Var.h = 0;
                r11.c();
            }
        } else if (lgz0Var2.l0) {
            long min = (long) (Math.min(lgz0Var2.q0, pbz0Var.r) * 1000.0f);
            pbz0Var.t = min;
            pbz0Var.s = min;
            if (min > 0) {
                pbz0Var.h = 2;
                u();
            } else {
                m();
                z = true;
            }
        } else {
            pbz0Var.h = 0;
            r11.c();
        }
        pbz0Var.c.a.j = z;
    }

    @Override // xsna.loy0.a
    public final void a(float f) {
        cez0 cez0Var = this.o;
        if (cez0Var == null) {
            return;
        }
        cez0Var.a(f);
    }

    @Override // xsna.loy0.a
    public final void b(float f) {
    }

    @Override // xsna.loy0.a
    public final void c() {
        loy0 loy0Var;
        kwy0 kwy0Var = this.k;
        if (kwy0Var != null) {
            kwy0Var.i();
        }
        cez0 cez0Var = this.o;
        if (cez0Var == null || (loy0Var = this.l) == null) {
            return;
        }
        cez0Var.b();
        loy0Var.stop();
        this.s = 0L;
        m();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.t5z0.a
    public final void d() {
        v();
        String str = this.b.f0;
        if (str == null) {
            return;
        }
        de.L(str, null, null, null, this.d.a().getContext());
    }

    @Override // xsna.jaz0
    public final void destroy() {
        s();
        f5z0 f5z0Var = this.p;
        if (f5z0Var != null) {
            f5z0Var.b();
        }
        v();
        loy0 loy0Var = this.l;
        if (loy0Var == null) {
            return;
        }
        loy0Var.destroy();
    }

    @Override // xsna.t5z0.a
    public final void e() {
        kwy0 kwy0Var = this.k;
        if (kwy0Var != null) {
            kwy0Var.j();
        }
        destroy();
        v();
        this.c.f(this.b);
    }

    @Override // xsna.loy0.a
    public final void f() {
        cez0 cez0Var = this.o;
        if (cez0Var == null) {
            return;
        }
        cez0Var.d();
    }

    @Override // xsna.loy0.a
    public final void g() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // xsna.loy0.a
    public final void h() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.jaz0
    public final View i() {
        return this.d.a();
    }

    @Override // xsna.loy0.a
    public final void j() {
        loy0 loy0Var;
        gu8.c(null, "InterstitialPresenterS4: Video playing timeout");
        kwy0 kwy0Var = this.k;
        if (kwy0Var != null) {
            kwy0Var.m();
        }
        cez0 cez0Var = this.o;
        if (cez0Var == null || (loy0Var = this.l) == null) {
            return;
        }
        cez0Var.c();
        loy0Var.stop();
        loy0Var.destroy();
    }

    @Override // xsna.loy0.a
    public final void k() {
        cez0 cez0Var = this.o;
        if (cez0Var == null) {
            return;
        }
        cez0Var.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    public final void m() {
        this.d.b();
        this.e.removeCallbacks(this.f);
        igz0.a aVar = this.c;
        aVar.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.h = 0;
        aVar.e();
        aVar.a.j = true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            o8z0.d(new Runnable() { // from class: xsna.obz0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    if (i2 == -2 || i2 == -1) {
                        pbz0.this.s();
                        gu8.c(null, "InterstitialPresenterS4: Audiofocus loss, pausing");
                    }
                }
            });
        } else if (i == -2 || i == -1) {
            s();
            gu8.c(null, "InterstitialPresenterS4: Audiofocus loss, pausing");
        }
    }

    @Override // xsna.jaz0
    public final void pause() {
        s();
        this.e.removeCallbacks(this.f);
        v();
    }

    @Override // xsna.dvy0.a
    public final void r() {
        loy0 loy0Var = this.l;
        if (!(loy0Var instanceof qfy0)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        dvy0 dvy0Var = this.m;
        if (dvy0Var != null) {
            dvy0Var.setViewMode(1);
            ((qfy0) loy0Var).A(dvy0Var);
        }
        lgz0 lgz0Var = this.n;
        if (lgz0Var != null) {
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            if (!((qfy0) loy0Var).isPlaying() || sgz0Var == null) {
                return;
            }
            if (sgz0Var.d != null) {
                this.v = true;
            }
            h(sgz0Var);
        }
    }

    @Override // xsna.jaz0
    public final void resume() {
        dvy0 dvy0Var;
        AudioManager audioManager;
        if (this.h != 0 && this.s > 0) {
            u();
        }
        v();
        loy0 loy0Var = this.l;
        if (loy0Var == null || (dvy0Var = this.m) == null) {
            return;
        }
        loy0Var.resume();
        if (loy0Var.c()) {
            AudioManager audioManager2 = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio");
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(this);
                return;
            }
            return;
        }
        if (!loy0Var.isPlaying() || (audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio")) == null) {
            return;
        }
        audioManager.requestAudioFocus(this, 3, 2);
    }

    public final void s() {
        dvy0 dvy0Var;
        loy0 loy0Var = this.l;
        if (loy0Var == null || (dvy0Var = this.m) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
        loy0Var.pause();
    }

    @Override // xsna.jaz0
    public final void stop() {
        s();
        v();
    }

    public final void t() {
        kwy0 kwy0Var;
        loy0 loy0Var;
        dvy0 dvy0Var;
        AudioManager audioManager;
        lgz0 lgz0Var = this.n;
        if (lgz0Var == null || (kwy0Var = this.k) == null || (loy0Var = this.l) == null || (dvy0Var = this.m) == null) {
            return;
        }
        sgz0 sgz0Var = (sgz0) lgz0Var.v0;
        kwy0Var.h();
        if (sgz0Var != null) {
            if (!loy0Var.c() && (audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio")) != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            loy0Var.x(this);
            loy0Var.A(dvy0Var);
            h(sgz0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, xsna.t5z0] */
    public final void u() {
        Handler handler = this.e;
        m50 m50Var = this.f;
        handler.removeCallbacks(m50Var);
        handler.postDelayed(m50Var, 200L);
        this.c.a(this.s / 1000.0d);
        this.d.setRemainingAllowCloseDelay((int) ((this.s / 1000) + 1));
    }

    public final void v() {
        this.e.removeCallbacks(this.g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.t5z0.a
    public final void b() {
        this.d.setBanner(this.b);
    }

    public final void g(wfy0 wfy0Var, int i, dhz0 dhz0Var, View view) {
        this.c.b(wfy0Var, null, i, wn4.d(dhz0Var), view.getContext());
        if (this.w) {
            e();
        }
    }

    public final void h(sgz0 sgz0Var) {
        dvy0 dvy0Var;
        loy0 loy0Var = this.l;
        if (loy0Var == null || (dvy0Var = this.m) == null) {
            return;
        }
        String str = (String) sgz0Var.d;
        if (str != null) {
            this.v = true;
            loy0Var.B(dvy0Var.getContext(), Uri.parse(str));
        } else {
            this.v = false;
            loy0Var.B(dvy0Var.getContext(), Uri.parse(sgz0Var.a));
        }
    }

    @Override // xsna.loy0.a
    public final void a(float f, float f2) {
        loy0 loy0Var;
        cez0 cez0Var = this.o;
        if (cez0Var == null || (loy0Var = this.l) == null) {
            return;
        }
        float f3 = this.r;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.h == 2) {
                this.s = (long) (this.t - (1000.0f * f));
            }
            cez0Var.getVideoControlView().getProgressView().setTimeChanged(f);
            kwy0 kwy0Var = this.k;
            if (kwy0Var != null) {
                kwy0Var.b(f, f2);
            }
            f5z0 f5z0Var = this.p;
            if (f5z0Var != null) {
                f5z0Var.c(f, f2);
            }
            this.j.a(loy0Var.getVolume());
        }
        if (f == f2) {
            if (loy0Var.isPlaying()) {
                c();
            }
            loy0Var.stop();
        }
    }

    public final void f(List list, xoy0 xoy0Var) {
        String t = c1z0.t(xoy0Var.getContext());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wfy0 wfy0Var = (wfy0) it.next();
            ArrayList arrayList = this.q;
            if (!arrayList.contains(wfy0Var)) {
                arrayList.add(wfy0Var);
                e5z0 e5z0Var = wfy0Var.a;
                if (t != null) {
                    h8z0.d(e5z0Var, t);
                }
                h8z0.d(e5z0Var, "show");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.t5z0.a
    public final void c(int i, dhz0 dhz0Var) {
        this.c.b(this.b, null, i, wn4.d(dhz0Var), this.d.a().getContext());
        if (this.w) {
            e();
        }
    }

    @Override // xsna.loy0.a
    public final void a(String str) {
        loy0 loy0Var;
        dvy0 dvy0Var;
        sgz0 sgz0Var;
        cez0 cez0Var = this.o;
        if (cez0Var == null || (loy0Var = this.l) == null || (dvy0Var = this.m) == null) {
            return;
        }
        wga0.b("InterstitialPresenterS4: Video playing error - ", str, null);
        kwy0 kwy0Var = this.k;
        if (kwy0Var != null) {
            kwy0Var.l();
        }
        if (this.v) {
            gu8.c(null, "InterstitialPresenterS4: Try to play video stream from URL");
            this.v = false;
            lgz0 lgz0Var = this.n;
            if (lgz0Var != null && (sgz0Var = (sgz0) lgz0Var.v0) != null) {
                loy0Var.B(dvy0Var.getContext(), Uri.parse(sgz0Var.a));
                return;
            }
        }
        cez0Var.c();
        loy0Var.stop();
        loy0Var.destroy();
    }

    @Override // xsna.loy0.a
    public final void p() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // xsna.t5z0.a
    public final void a() {
        wty0 wty0Var = this.b.L;
        if (wty0Var == null) {
            return;
        }
        Context context = this.d.a().getContext();
        kpy0 kpy0Var = this.i;
        if (kpy0Var == null) {
            de.L(wty0Var.b, null, null, null, context);
        } else {
            kpy0Var.b();
        }
    }
}
