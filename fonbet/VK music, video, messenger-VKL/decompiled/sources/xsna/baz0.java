package xsna;

import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import xsna.cxs;
import xsna.dvy0;
import xsna.hjz0;
import xsna.hox;
import xsna.loy0;
import xsna.pdz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class baz0 implements u8z0, AudioManager.OnAudioFocusChangeListener, loy0.a, dvy0.a {
    public cez0 b;
    public loy0 c;
    public dvy0 d;
    public kwy0 e;
    public f5z0 f;
    public lgz0 g;
    public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean i = true;
    public kpy0 j;
    public m6z0 k;
    public final hcy0 l;

    public baz0(pdz0.a aVar) {
        this.l = aVar;
        aVar.a = this;
    }

    @Override // xsna.loy0.a
    public final void a(float f) {
        cez0 cez0Var = this.b;
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
        gu8.c(null, "DoubleInterstitialCardPresenter: Video completed");
        kwy0 kwy0Var = this.e;
        if (kwy0Var != null) {
            kwy0Var.i();
        }
        cez0 cez0Var = this.b;
        if (cez0Var == null || this.c == null) {
            return;
        }
        cez0Var.b();
        this.c.stop();
        m6z0 m6z0Var = this.k;
        if (m6z0Var != null) {
            m6z0Var.g = true;
            hjz0.b bVar = pdz0.this.g.a.b;
            if (bVar != null) {
                hox hoxVar = hox.this;
                ur50 ur50Var = hoxVar.m;
                if (ur50Var != null) {
                    cxs.a aVar = ur50Var.a.a;
                    if (aVar != null) {
                        aVar.onCompleted();
                        return;
                    }
                    return;
                }
                hox.d dVar = hoxVar.j;
                if (dVar != null) {
                    dVar.f();
                }
            }
        }
    }

    public final void d(sgz0 sgz0Var) {
        loy0 loy0Var = this.c;
        if (loy0Var == null || this.d == null) {
            return;
        }
        String str = (String) sgz0Var.d;
        if (str != null) {
            this.i = true;
            loy0Var.B(this.d.getContext(), Uri.parse(str));
        } else {
            this.i = false;
            loy0Var.B(this.d.getContext(), Uri.parse(sgz0Var.a));
        }
    }

    public final void e() {
        dvy0 dvy0Var;
        if (this.c == null || (dvy0Var = this.d) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
        this.c.pause();
    }

    @Override // xsna.loy0.a
    public final void f() {
        cez0 cez0Var = this.b;
        if (cez0Var == null) {
            return;
        }
        cez0Var.d();
    }

    public final void i() {
        AudioManager audioManager;
        loy0 loy0Var = this.c;
        if (loy0Var == null || this.d == null) {
            return;
        }
        loy0Var.resume();
        if (this.c.c()) {
            AudioManager audioManager2 = (AudioManager) this.d.getContext().getApplicationContext().getSystemService("audio");
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(this);
                return;
            }
            return;
        }
        if (!this.c.isPlaying() || (audioManager = (AudioManager) this.d.getContext().getApplicationContext().getSystemService("audio")) == null) {
            return;
        }
        audioManager.requestAudioFocus(this, 3, 2);
    }

    @Override // xsna.loy0.a
    public final void j() {
        gu8.c(null, "DoubleInterstitialCardPresenter: Video playing timeout");
        kwy0 kwy0Var = this.e;
        if (kwy0Var != null) {
            kwy0Var.m();
        }
        cez0 cez0Var = this.b;
        if (cez0Var == null || this.c == null) {
            return;
        }
        cez0Var.c();
        this.c.stop();
        this.c.destroy();
    }

    @Override // xsna.loy0.a
    public final void k() {
        cez0 cez0Var = this.b;
        if (cez0Var == null) {
            return;
        }
        cez0Var.f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            o8z0.d(new xih(this, i, 2));
        } else if (i == -2 || i == -1) {
            e();
            gu8.c(null, "DoubleInterstitialCardPresenter: Audiofocus loss, pausing");
        }
    }

    @Override // xsna.dvy0.a
    public final void r() {
        if (!(this.c instanceof qfy0)) {
            a("DoubleInterstitialCardPresenter: Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        dvy0 dvy0Var = this.d;
        if (dvy0Var != null) {
            dvy0Var.setViewMode(1);
            this.c.A(this.d);
        }
        lgz0 lgz0Var = this.g;
        if (lgz0Var != null) {
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            if (!this.c.isPlaying() || sgz0Var == null) {
                return;
            }
            if (sgz0Var.d != null) {
                this.i = true;
            }
            d(sgz0Var);
        }
    }

    public final void b(xey0 xey0Var, int i, dhz0 dhz0Var, n7z0 n7z0Var) {
        pdz0.a aVar = (pdz0.a) this.l;
        pdz0 pdz0Var = pdz0.this;
        if (pdz0Var.k == null) {
            return;
        }
        pdz0Var.g.a(xey0Var, i, wn4.d(dhz0Var), n7z0Var.getContext());
        if (pdz0Var.l) {
            pdz0Var.e();
        }
        baz0 baz0Var = aVar.a;
        if (baz0Var != null) {
            baz0Var.e();
        }
    }

    @Override // xsna.loy0.a
    public final void a(float f, float f2) {
        f5z0 f5z0Var;
        cez0 cez0Var = this.b;
        if (cez0Var == null || this.c == null) {
            return;
        }
        float f3 = this.h;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            cez0Var.getVideoControlView().getProgressView().setTimeChanged(f);
            kwy0 kwy0Var = this.e;
            if (kwy0Var != null) {
                kwy0Var.b(f, f2);
            }
            m6z0 m6z0Var = this.k;
            if (m6z0Var != null && (f5z0Var = this.f) != null && !m6z0Var.g) {
                f5z0Var.c(f, f2);
            }
        }
        if (f == f2) {
            if (this.c.isPlaying()) {
                c();
            }
            this.c.stop();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements r0z0 {
        public final u8z0 a;

        public a(baz0 baz0Var) {
            this.a = baz0Var;
        }

        @Override // xsna.r0z0
        public final void b() {
            gu8.c(null, "DoubleInterstitialCardPresenter.InterstitialMediaListenerImpl: Error video playing");
        }

        @Override // xsna.r0z0
        public final void c() {
            kwy0 kwy0Var;
            AudioManager audioManager;
            baz0 baz0Var = (baz0) this.a;
            loy0 loy0Var = baz0Var.c;
            if (loy0Var == null) {
                return;
            }
            if (loy0Var.isPlaying()) {
                baz0Var.e();
                kwy0 kwy0Var2 = baz0Var.e;
                if (kwy0Var2 != null) {
                    kwy0Var2.k();
                    return;
                }
                return;
            }
            if (baz0Var.c.getPosition() > 0) {
                baz0Var.i();
                kwy0 kwy0Var3 = baz0Var.e;
                if (kwy0Var3 != null) {
                    kwy0Var3.n();
                    return;
                }
                return;
            }
            lgz0 lgz0Var = baz0Var.g;
            if (lgz0Var == null || (kwy0Var = baz0Var.e) == null || baz0Var.c == null || baz0Var.d == null) {
                return;
            }
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            kwy0Var.h();
            if (sgz0Var != null) {
                if (!baz0Var.c.c() && (audioManager = (AudioManager) baz0Var.d.getContext().getApplicationContext().getSystemService("audio")) != null) {
                    audioManager.requestAudioFocus(baz0Var, 3, 2);
                }
                baz0Var.c.x(baz0Var);
                baz0Var.c.A(baz0Var.d);
                baz0Var.d(sgz0Var);
            }
        }

        @Override // xsna.r0z0
        public final void d() {
            baz0 baz0Var = (baz0) this.a;
            loy0 loy0Var = baz0Var.c;
            if (loy0Var == null) {
                return;
            }
            loy0Var.a();
            kwy0 kwy0Var = baz0Var.e;
            if (kwy0Var != null) {
                kwy0Var.f(!baz0Var.c.c());
            }
        }

        @Override // xsna.r0z0
        public final void a() {
        }
    }

    @Override // xsna.loy0.a
    public final void a(String str) {
        sgz0 sgz0Var;
        if (this.b == null || this.c == null || this.d == null) {
            return;
        }
        wga0.b("DoubleInterstitialCardPresenter: Video playing error - ", str, null);
        kwy0 kwy0Var = this.e;
        if (kwy0Var != null) {
            kwy0Var.l();
        }
        if (this.i) {
            gu8.c(null, "DoubleInterstitialCardPresenter: Try to play video stream from URL");
            this.i = false;
            lgz0 lgz0Var = this.g;
            if (lgz0Var != null && (sgz0Var = (sgz0) lgz0Var.v0) != null) {
                this.c.B(this.d.getContext(), Uri.parse(sgz0Var.a));
                return;
            }
        }
        this.b.c();
        this.c.stop();
        this.c.destroy();
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

    public final void c(m6z0 m6z0Var, n7z0 n7z0Var) {
        cez0 cez0Var;
        cez0 cez0Var2;
        this.k = m6z0Var;
        lgz0 lgz0Var = m6z0Var.a.c0;
        this.g = lgz0Var;
        if (lgz0Var != null && (cez0Var = this.b) != null && this.c != null) {
            this.h = lgz0Var.D;
            this.e = kwy0.a(lgz0Var, m6z0Var.b, new l960(this, m6z0Var), cez0Var.getContext());
            this.f = f5z0.a(this.g.a, new ugm0(this, m6z0Var));
            if (this.g.g0) {
                this.c.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                this.c.setVolume(1.0f);
            }
            loy0 loy0Var = this.c;
            if (loy0Var != null && !loy0Var.isPlaying() && this.g != null && (cez0Var2 = this.b) != null) {
                cez0Var2.e();
                this.b.setDuration(this.h);
            }
        }
        pdz0.this.g.b(m6z0Var, n7z0Var);
    }
}
