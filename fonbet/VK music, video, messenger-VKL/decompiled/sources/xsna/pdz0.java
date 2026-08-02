package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cxs;
import xsna.dvy0;
import xsna.hjz0;
import xsna.hox;
import xsna.loy0;
import xsna.p4z0;
import xsna.t5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class pdz0 implements jaz0, t5z0.a, AudioManager.OnAudioFocusChangeListener, loy0.a, dvy0.a {
    public final a8z0 A;
    public final hbz0 b;
    public kwy0 c;
    public kpy0 d;
    public lgz0 e;
    public final List f;
    public final p4z0.a g;
    public final ghz0 i;
    public m6z0 k;
    public boolean l;
    public t5z0 m;
    public long n;
    public final dxt o;
    public long s;
    public float t;
    public float u;
    public cez0 v;
    public loy0 w;
    public dvy0 x;
    public float y;
    public f5z0 z;
    public boolean p = true;
    public int q = 0;
    public int r = 0;
    public final a B = new a();
    public final Handler j = new Handler(Looper.getMainLooper());
    public final nx3 h = new nx3(this, 23);

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements hcy0 {
        public baz0 a;

        public a() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements r0z0 {
        public b() {
        }

        @Override // xsna.r0z0
        public final void a() {
            pdz0 pdz0Var = pdz0.this;
            if (pdz0Var.x == null || pdz0Var.k == null) {
                return;
            }
            hjz0.b bVar = pdz0Var.g.a.b;
            if (bVar != null) {
                hox hoxVar = hox.this;
                ur50 ur50Var = hoxVar.m;
                if (ur50Var != null) {
                    cxs.a aVar = ur50Var.a.a;
                    if (aVar != null) {
                        aVar.onCompleted();
                    }
                } else {
                    hox.d dVar = hoxVar.j;
                    if (dVar != null) {
                        dVar.f();
                    }
                }
            }
            pdz0Var.k.g = true;
        }

        @Override // xsna.r0z0
        public final void b() {
            pdz0 pdz0Var = pdz0.this;
            List list = pdz0Var.f;
            if (pdz0Var.m != null) {
                if (list.size() <= pdz0Var.r || pdz0Var.z()) {
                    pdz0Var.m.b();
                    pdz0Var.j.removeCallbacks(pdz0Var.o);
                    pdz0Var.q = 0;
                    pdz0Var.g.a.j = true;
                } else {
                    pdz0Var.x();
                }
            }
            qjk0.a(new StringBuilder("DoubleInterstitialPromoPresenter.InterstitialMediaPresenterImpl: Failed playing video "), ((m6z0) list.get(pdz0Var.r)).a.F, null);
        }

        @Override // xsna.r0z0
        public final void c() {
            pdz0 pdz0Var = pdz0.this;
            loy0 loy0Var = pdz0Var.w;
            if (loy0Var != null) {
                if (loy0Var.isPlaying()) {
                    pdz0Var.A();
                    kwy0 kwy0Var = pdz0Var.c;
                    if (kwy0Var != null) {
                        kwy0Var.k();
                    }
                } else if (pdz0Var.w.getPosition() > 0) {
                    pdz0Var.resume();
                    kwy0 kwy0Var2 = pdz0Var.c;
                    if (kwy0Var2 != null) {
                        kwy0Var2.n();
                    }
                } else {
                    pdz0Var.m();
                }
            }
            pdz0Var.t();
        }

        @Override // xsna.r0z0
        public final void d() {
            pdz0 pdz0Var = pdz0.this;
            loy0 loy0Var = pdz0Var.w;
            if (loy0Var == null) {
                return;
            }
            loy0Var.a();
            kwy0 kwy0Var = pdz0Var.c;
            if (kwy0Var != null) {
                kwy0Var.f(!pdz0Var.w.c());
            }
        }
    }

    public pdz0(hbz0 hbz0Var, ArrayList arrayList, p4z0.a aVar) {
        cez0 cez0Var;
        this.l = true;
        this.b = hbz0Var;
        this.f = arrayList;
        this.g = aVar;
        b bVar = new b();
        Context context = hbz0Var.a;
        ghz0 ghz0Var = new ghz0(context, this, bVar, this);
        this.i = ghz0Var;
        a8z0 progressBar = ghz0Var.getProgressBar();
        this.A = progressBar;
        m6z0 m6z0Var = (m6z0) arrayList.get(this.r);
        this.k = m6z0Var;
        tez0 tez0Var = m6z0Var.a;
        this.l = tez0Var.s();
        this.t = tez0Var.W * 1000.0f;
        this.u = tez0Var.V * 1000.0f;
        progressBar.setCountBars(arrayList.size());
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var != null) {
            this.e = lgz0Var;
            ghz0Var.a(tez0Var, this.k.e, z());
            t5z0 interstitialView = ghz0Var.getInterstitialView();
            this.m = interstitialView;
            if (interstitialView instanceof r3z0) {
                r3z0 r3z0Var = (r3z0) interstitialView;
                dvy0 videoView = r3z0Var.getVideoView();
                this.x = videoView;
                videoView.setAdVideoViewListener(this);
                this.z = f5z0.a(this.e.a, new ie40(this, 28));
                this.c = kwy0.a(this.e, this.k.b, new ie40(this, 28), context);
                this.z.d(this.x);
                this.y = this.e.D;
                loy0 videoPlayer = r3z0Var.getVideoPlayer();
                this.w = videoPlayer;
                videoPlayer.x(this);
                this.v = r3z0Var.getVideoContent();
                progressBar.a(this.r, this.u / 1000.0f);
                this.v.setDuration(this.e.D);
                if (this.e.g0) {
                    this.w.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    this.w.setVolume(1.0f);
                }
            }
            lgz0 lgz0Var2 = this.e;
            if (lgz0Var2 != null && (cez0Var = this.v) != null) {
                if (lgz0Var2.h0) {
                    m();
                } else {
                    cez0Var.e();
                }
            }
        } else {
            ghz0Var.a(tez0Var, this.k.e, z());
            progressBar.a(this.r, this.u / 1000.0f);
        }
        this.m = ghz0Var.getInterstitialView();
        this.o = new dxt(9, this, arrayList);
        v(tez0Var);
        w(tez0Var);
        aVar.b(this.k, ghz0Var.getRootLayout());
    }

    public final void A() {
        dvy0 dvy0Var;
        if (this.w == null || (dvy0Var = this.x) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
        this.w.pause();
    }

    @Override // xsna.t5z0.a
    public final void a() {
        t5z0 t5z0Var;
        wty0 wty0Var;
        m6z0 m6z0Var = this.k;
        if (m6z0Var == null || (t5z0Var = this.m) == null || (wty0Var = m6z0Var.a.L) == null) {
            return;
        }
        Context context = t5z0Var.a().getContext();
        kpy0 kpy0Var = this.d;
        if (kpy0Var == null) {
            de.L(wty0Var.b, null, null, null, context);
        } else {
            kpy0Var.b();
            pause();
        }
    }

    @Override // xsna.t5z0.a
    public final void b() {
        t5z0 t5z0Var;
        m6z0 m6z0Var = this.k;
        if (m6z0Var == null || (t5z0Var = this.m) == null) {
            return;
        }
        t5z0Var.setBanner(m6z0Var.a);
    }

    @Override // xsna.loy0.a
    public final void c() {
        kwy0 kwy0Var = this.c;
        if (kwy0Var != null) {
            kwy0Var.i();
        }
        cez0 cez0Var = this.v;
        if (cez0Var == null || this.w == null) {
            return;
        }
        cez0Var.b();
        this.w.stop();
        m6z0 m6z0Var = this.k;
        if (m6z0Var != null) {
            m6z0Var.g = true;
            if (z() || !this.k.a.X) {
                return;
            }
            x();
        }
    }

    @Override // xsna.t5z0.a
    public final void d() {
        m6z0 m6z0Var = this.k;
        if (m6z0Var == null || this.m == null) {
            return;
        }
        tez0 tez0Var = m6z0Var.a;
        t();
        String str = tez0Var.f0;
        if (str == null) {
            return;
        }
        de.L(str, null, null, null, this.m.a().getContext());
    }

    @Override // xsna.jaz0
    public final void destroy() {
        A();
        f5z0 f5z0Var = this.z;
        if (f5z0Var != null) {
            f5z0Var.b();
        }
        t();
        loy0 loy0Var = this.w;
        if (loy0Var == null) {
            return;
        }
        loy0Var.destroy();
    }

    @Override // xsna.t5z0.a
    public final void e() {
        kwy0 kwy0Var = this.c;
        if (kwy0Var != null) {
            kwy0Var.j();
        }
        destroy();
        t();
        m6z0 m6z0Var = this.k;
        if (m6z0Var != null) {
            p4z0 p4z0Var = this.g.a;
            tez0 tez0Var = m6z0Var.a;
            tez0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            h8z0.e(tez0Var.a, "closedByUser", 999, null);
            p4z0Var.q();
        }
        baz0 baz0Var = this.B.a;
        if (baz0Var == null || baz0Var.c == null) {
            return;
        }
        f5z0 f5z0Var = baz0Var.f;
        if (f5z0Var != null) {
            f5z0Var.b();
        }
        kwy0 kwy0Var2 = baz0Var.e;
        if (kwy0Var2 != null) {
            kwy0Var2.j();
        }
        baz0Var.c.destroy();
    }

    @Override // xsna.loy0.a
    public final void f() {
        cez0 cez0Var = this.v;
        if (cez0Var == null) {
            return;
        }
        cez0Var.d();
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        t5z0 t5z0Var = this.m;
        if (t5z0Var == null) {
            return null;
        }
        return t5z0Var.getCloseButton();
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.i.getRootLayout();
    }

    @Override // xsna.loy0.a
    public final void j() {
        gu8.c(null, "DoubleInterstitialPromoPresenter: Video playing timeout");
        kwy0 kwy0Var = this.c;
        if (kwy0Var != null) {
            kwy0Var.m();
        }
        cez0 cez0Var = this.v;
        if (cez0Var == null || this.w == null) {
            return;
        }
        cez0Var.c();
        this.w.stop();
        this.w.destroy();
    }

    @Override // xsna.loy0.a
    public final void k() {
        cez0 cez0Var = this.v;
        if (cez0Var == null) {
            return;
        }
        cez0Var.f();
    }

    public final void m() {
        kwy0 kwy0Var;
        AudioManager audioManager;
        lgz0 lgz0Var = this.e;
        if (lgz0Var == null || (kwy0Var = this.c) == null || this.w == null || this.x == null) {
            return;
        }
        sgz0 sgz0Var = (sgz0) lgz0Var.v0;
        kwy0Var.h();
        if (sgz0Var != null) {
            if (!this.w.c() && (audioManager = (AudioManager) this.x.getContext().getApplicationContext().getSystemService("audio")) != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            this.w.x(this);
            this.w.A(this.x);
            u(sgz0Var);
        }
    }

    @Override // xsna.jaz0
    public final void pause() {
        A();
        this.j.removeCallbacks(this.o);
        t();
    }

    @Override // xsna.dvy0.a
    public final void r() {
        if (!(this.w instanceof qfy0)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        dvy0 dvy0Var = this.x;
        if (dvy0Var != null) {
            dvy0Var.setViewMode(1);
            this.w.A(this.x);
        }
        lgz0 lgz0Var = this.e;
        if (lgz0Var != null) {
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            if (!this.w.isPlaying() || sgz0Var == null) {
                return;
            }
            if (sgz0Var.d != null) {
                this.p = true;
            }
            u(sgz0Var);
        }
    }

    @Override // xsna.jaz0
    public final void resume() {
        AudioManager audioManager;
        if (this.q != 0 && this.n > 0) {
            s();
        }
        t();
        loy0 loy0Var = this.w;
        if (loy0Var == null || this.x == null) {
            return;
        }
        loy0Var.resume();
        if (this.w.c()) {
            AudioManager audioManager2 = (AudioManager) this.x.getContext().getApplicationContext().getSystemService("audio");
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(this);
            }
        } else if (this.w.isPlaying() && (audioManager = (AudioManager) this.x.getContext().getApplicationContext().getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
        baz0 baz0Var = this.B.a;
        if (baz0Var != null) {
            baz0Var.i();
        }
    }

    public final void s() {
        p4z0 p4z0Var = this.g.a;
        if (this.m != null) {
            Handler handler = this.j;
            dxt dxtVar = this.o;
            handler.removeCallbacks(dxtVar);
            handler.postDelayed(dxtVar, 200L);
            long j = this.n / 1000;
            List list = this.f;
            if (j < 1 || list.size() != this.r) {
                long j2 = this.s / 1000;
                if (j2 >= 1) {
                    this.m.setRemainingAllowCloseDelay((int) j2);
                }
            } else {
                this.m.setRemainingAllowCloseDelay((int) (this.n / 1000));
            }
            if (list.size() > this.r) {
                long j3 = this.s;
                if (j3 / 1000 >= 1) {
                    p4z0Var.p(j3 / 1000.0d);
                }
            } else {
                long j4 = this.n;
                if (j4 / 1000 >= 1) {
                    p4z0Var.p(j4 / 1000.0d);
                }
            }
            if (z()) {
                return;
            }
            int size = list.size();
            int i = this.r;
            if (size > i) {
                ((paz0) this.A.b.get(i)).setTimeChanged((this.u - this.n) / 1000.0f);
            }
        }
    }

    @Override // xsna.jaz0
    public final void stop() {
        A();
        t();
    }

    public final void t() {
        this.j.removeCallbacks(this.h);
    }

    public final void u(sgz0 sgz0Var) {
        loy0 loy0Var = this.w;
        if (loy0Var == null || this.x == null) {
            return;
        }
        String str = (String) sgz0Var.d;
        if (str != null) {
            this.p = true;
            loy0Var.B(this.x.getContext(), Uri.parse(str));
        } else {
            this.p = false;
            loy0Var.B(this.x.getContext(), Uri.parse(sgz0Var.a));
        }
    }

    public final void v(tez0 tez0Var) {
        wty0 wty0Var;
        if (this.m == null || (wty0Var = tez0Var.L) == null || wty0Var.c == null) {
            return;
        }
        m6z0 m6z0Var = this.k;
        kpy0 kpy0Var = new kpy0(wty0Var, m6z0Var != null ? m6z0Var.a.i() : "", this.m.a().getContext());
        this.d = kpy0Var;
        kpy0Var.e = new je40(this, 25);
        kpy0Var.f = new mau(this, 22);
    }

    public final void w(tez0 tez0Var) {
        p4z0 p4z0Var = this.g.a;
        if (this.m == null) {
            return;
        }
        lgz0 lgz0Var = tez0Var.c0;
        boolean z = tez0Var.X;
        List list = this.f;
        if (z && list.size() > this.r) {
            this.s = (long) this.t;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (lgz0Var != null && lgz0Var.h0) {
            int size = list.size();
            int i = this.r;
            if (size != i) {
                if (lgz0Var.l0) {
                    float f = lgz0Var.D;
                    this.u = (long) (1000.0f * f);
                    this.A.a(i, f);
                    long j = (long) this.u;
                    this.n = j;
                    if (j <= 0) {
                        y();
                        p4z0Var.j = z2;
                    } else {
                        this.q = 2;
                        s();
                    }
                } else {
                    this.m.c();
                }
                z2 = false;
                p4z0Var.j = z2;
            }
        }
        t5z0 t5z0Var = this.m;
        if (t5z0Var != null) {
            if (tez0Var.Y) {
                long j2 = (long) this.u;
                this.n = j2;
                if (j2 > 0) {
                    gu8.c(null, "DoubleInterstitialPromoPresenter: Banner will be allowed to close in " + this.n + " millis");
                    this.q = 1;
                    s();
                } else {
                    gu8.c(null, "DoubleInterstitialPromoPresenter: Banner is allowed to close");
                    y();
                    z3 = true;
                }
            } else {
                this.q = 0;
                t5z0Var.c();
            }
            p4z0Var.j = z3;
        }
        p4z0Var.j = z2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.ViewGroup, xsna.t5z0] */
    public final void x() {
        cez0 cez0Var;
        this.r++;
        destroy();
        List list = this.f;
        int size = list.size();
        int i = this.r;
        ghz0 ghz0Var = this.i;
        if (size <= i) {
            if (z()) {
                e();
                return;
            }
            if (!(this.m instanceof m2z0)) {
                if (ghz0Var.getChildCount() != 0) {
                    ghz0Var.removeAllViews();
                }
                m2z0 m2z0Var = new m2z0(ghz0Var.b, this.B, ghz0Var.getContext());
                ghz0Var.c = m2z0Var;
                m2z0Var.setDoubleBanners(list);
                ghz0Var.addView(ghz0Var.c.a());
                this.m = ghz0Var.getInterstitialView();
                w(((m6z0) list.get(this.r - 1)).a);
            }
            this.r = list.size();
            return;
        }
        float f = this.u / 1000.0f;
        a8z0 a8z0Var = this.A;
        ArrayList arrayList = a8z0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((paz0) arrayList.get(i2)).setMaxTime(f);
            ((paz0) arrayList.get(i2)).setTimeChanged(f);
        }
        m6z0 m6z0Var = (m6z0) list.get(this.r);
        this.k = m6z0Var;
        tez0 tez0Var = m6z0Var.a;
        this.l = tez0Var.s();
        this.t = tez0Var.W * 1000.0f;
        this.u = tez0Var.V * 1000.0f;
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var != null) {
            this.e = lgz0Var;
            ghz0Var.a(tez0Var, this.k.e, z());
            t5z0 interstitialView = ghz0Var.getInterstitialView();
            this.m = interstitialView;
            if (interstitialView instanceof r3z0) {
                r3z0 r3z0Var = (r3z0) interstitialView;
                dvy0 videoView = r3z0Var.getVideoView();
                this.x = videoView;
                videoView.setAdVideoViewListener(this);
                this.z = f5z0.a(this.e.a, new ie40(this, 28));
                this.c = kwy0.a(this.e, this.k.b, new ie40(this, 28), this.b.a);
                this.z.d(this.x);
                this.y = this.e.D;
                loy0 videoPlayer = r3z0Var.getVideoPlayer();
                this.w = videoPlayer;
                videoPlayer.x(this);
                this.v = r3z0Var.getVideoContent();
                a8z0Var.a(this.r, this.u / 1000.0f);
                this.v.setDuration(this.e.D);
                if (this.e.g0) {
                    this.w.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    this.w.setVolume(1.0f);
                }
            }
            lgz0 lgz0Var2 = this.e;
            if (lgz0Var2 != null && (cez0Var = this.v) != null) {
                if (lgz0Var2.h0) {
                    m();
                } else {
                    cez0Var.e();
                }
            }
        } else {
            ghz0Var.a(tez0Var, this.k.e, z());
            a8z0Var.a(this.r, this.u / 1000.0f);
        }
        this.j.removeCallbacks(this.o);
        this.m = ghz0Var.getInterstitialView();
        v(tez0Var);
        w(tez0Var);
        this.g.b(this.k, ghz0Var.getRootLayout());
    }

    public final void y() {
        p4z0 p4z0Var = this.g.a;
        if (this.m != null) {
            if (this.f.size() > this.r && !z()) {
                x();
                return;
            }
            this.m.b();
            p4z0Var.p(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            this.j.removeCallbacks(this.o);
            this.q = 0;
            p4z0Var.j = true;
        }
    }

    public final boolean z() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((m6z0) it.next()).f) {
                i++;
            }
        }
        return i == 1;
    }

    @Override // xsna.loy0.a
    public final void b(float f) {
    }

    @Override // xsna.loy0.a
    public final void a(float f) {
        cez0 cez0Var = this.v;
        if (cez0Var == null) {
            return;
        }
        cez0Var.a(f);
    }

    @Override // xsna.t5z0.a
    public final void c(int i, dhz0 dhz0Var) {
        m6z0 m6z0Var = this.k;
        if (m6z0Var == null) {
            return;
        }
        this.g.a(m6z0Var.a, i, wn4.d(dhz0Var), this.i.getRootLayout().getContext());
        if (this.l) {
            e();
        }
    }

    @Override // xsna.loy0.a
    public final void a(float f, float f2) {
        cez0 cez0Var = this.v;
        if (cez0Var == null || this.w == null || this.m == null) {
            return;
        }
        float f3 = this.y;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.q == 2) {
                this.n = (long) (this.u - (1000.0f * f));
            }
            cez0Var.getVideoControlView().getProgressView().setTimeChanged(f);
            long j = this.s;
            if (j > 0) {
                this.s = j - 200;
            }
            kwy0 kwy0Var = this.c;
            if (kwy0Var != null) {
                kwy0Var.b(f, f2);
            }
            m6z0 m6z0Var = this.k;
            if (m6z0Var != null) {
                f5z0 f5z0Var = this.z;
                if (f5z0Var != null && !m6z0Var.g) {
                    f5z0Var.c(f, f2);
                }
                m6z0 m6z0Var2 = this.k;
                float volume = this.w.getVolume();
                hjz0.b bVar = this.g.a.b;
                if (bVar != null) {
                    tez0 tez0Var = m6z0Var2.a;
                    hox.f fVar = (hox.f) bVar;
                    if (b920.b(fVar.a, volume) != 0) {
                        fVar.a = volume;
                    }
                }
            }
        }
        if (f == f2) {
            if (this.w.isPlaying()) {
                c();
            }
            this.w.stop();
        }
    }

    @Override // xsna.loy0.a
    public final void g() {
    }

    @Override // xsna.loy0.a
    public final void h() {
    }

    @Override // xsna.loy0.a
    public final void p() {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
    }

    @Override // xsna.loy0.a
    public final void a(String str) {
        sgz0 sgz0Var;
        if (this.v == null || this.w == null || this.x == null) {
            return;
        }
        wga0.b("InterstitialDoublePromoPresenter: Video playing error - ", str, null);
        kwy0 kwy0Var = this.c;
        if (kwy0Var != null) {
            kwy0Var.l();
        }
        if (this.p) {
            gu8.c(null, "InterstitialDoublePromoPresenter: Try to play video stream from URL");
            this.p = false;
            lgz0 lgz0Var = this.e;
            if (lgz0Var != null && (sgz0Var = (sgz0) lgz0Var.v0) != null) {
                this.w.B(this.x.getContext(), Uri.parse(sgz0Var.a));
                return;
            }
        }
        this.v.c();
        this.w.stop();
        this.w.destroy();
    }
}
