package xsna;

import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import xsna.dvy0;
import xsna.igz0;
import xsna.loy0;
import xsna.phz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vez0 implements AudioManager.OnAudioFocusChangeListener, loy0.a, dvy0.a {
    public final phz0 b;
    public final lgz0 c;
    public final loy0 d;
    public final f5z0 e;
    public final igz0.b f;
    public final kwy0 g;
    public final float h;
    public final dvy0 i;
    public boolean j;

    public vez0(lgz0 lgz0Var, dvy0 dvy0Var, phz0 phz0Var, igz0.b bVar, ogz0 ogz0Var, loy0 loy0Var, m3z0 m3z0Var) {
        this.b = phz0Var;
        this.i = dvy0Var;
        this.d = loy0Var;
        this.f = bVar;
        dvy0Var.setAdVideoViewListener(this);
        this.c = lgz0Var;
        f5z0 a = f5z0.a(lgz0Var.a, m3z0Var);
        this.e = a;
        this.g = kwy0.a(lgz0Var, ogz0Var.b, m3z0Var, ogz0Var.c);
        a.d(dvy0Var);
        this.h = lgz0Var.D;
        loy0Var.x(this);
        if (lgz0Var.g0) {
            loy0Var.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            loy0Var.setVolume(1.0f);
        }
    }

    @Override // xsna.loy0.a
    public final void a(String str) {
        wga0.b("InterstitialPromoMediaPresenterS2: Video playing error - ", str, null);
        this.g.l();
        boolean z = this.j;
        loy0 loy0Var = this.d;
        if (z) {
            gu8.c(null, "InterstitialPromoMediaPresenterS2: Try to play video stream from URL");
            this.j = false;
            sgz0 sgz0Var = (sgz0) this.c.v0;
            if (sgz0Var != null) {
                loy0Var.B(this.i.getContext(), Uri.parse(sgz0Var.a));
                return;
            }
        }
        this.b.h();
        loy0Var.stop();
        loy0Var.destroy();
    }

    public final void b(sgz0 sgz0Var) {
        String str = (String) sgz0Var.d;
        int i = sgz0Var.b;
        int i2 = sgz0Var.c;
        dvy0 dvy0Var = this.i;
        dvy0Var.b(i, i2);
        loy0 loy0Var = this.d;
        if (str != null) {
            this.j = true;
            loy0Var.B(dvy0Var.getContext(), Uri.parse(str));
        } else {
            this.j = false;
            loy0Var.B(dvy0Var.getContext(), Uri.parse(sgz0Var.a));
        }
    }

    @Override // xsna.loy0.a
    public final void c() {
        this.g.i();
        phz0 phz0Var = this.b;
        gdy0 gdy0Var = phz0Var.g;
        nuy0 nuy0Var = phz0Var.e;
        lgz0 lgz0Var = phz0Var.b.c0;
        if (lgz0Var != null) {
            if (lgz0Var.j0) {
                nuy0Var.a(2, !TextUtils.isEmpty(lgz0Var.b0) ? lgz0Var.b0 : null);
                nuy0Var.d(true);
            } else {
                phz0Var.r = true;
            }
        }
        nuy0Var.b(true);
        nuy0Var.e(false);
        gdy0Var.setVisible(false);
        gdy0Var.setTimeChanged(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        phz0Var.h.b();
        phz0Var.m();
        phz0Var.s = true;
        this.d.stop();
    }

    public final void d() {
        AudioManager audioManager = (AudioManager) this.i.getContext().getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
        this.d.pause();
    }

    public final void e() {
        AudioManager audioManager;
        sgz0 sgz0Var = (sgz0) this.c.v0;
        this.g.h();
        if (sgz0Var != null) {
            loy0 loy0Var = this.d;
            boolean c = loy0Var.c();
            dvy0 dvy0Var = this.i;
            if (!c && (audioManager = (AudioManager) dvy0Var.getContext().getApplicationContext().getSystemService("audio")) != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            loy0Var.x(this);
            loy0Var.A(dvy0Var);
            b(sgz0Var);
        }
    }

    @Override // xsna.loy0.a
    public final void f() {
        nuy0 nuy0Var = this.b.e;
        nuy0Var.d(true);
        nuy0Var.a(0, null);
        nuy0Var.e(false);
    }

    @Override // xsna.loy0.a
    public final void g() {
        this.b.l();
    }

    @Override // xsna.loy0.a
    public final void h() {
        nuy0 nuy0Var = this.b.e;
        nuy0Var.d(false);
        nuy0Var.b(false);
        nuy0Var.f();
        nuy0Var.e(false);
    }

    public final void i() {
        AudioManager audioManager;
        loy0 loy0Var = this.d;
        loy0Var.resume();
        boolean c = loy0Var.c();
        dvy0 dvy0Var = this.i;
        if (c) {
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

    @Override // xsna.loy0.a
    public final void j() {
        gu8.c(null, "InterstitialPromoMediaPresenterS2: Video playing timeout");
        this.g.m();
        this.b.h();
        loy0 loy0Var = this.d;
        loy0Var.stop();
        loy0Var.destroy();
    }

    @Override // xsna.loy0.a
    public final void k() {
        phz0 phz0Var = this.b;
        nuy0 nuy0Var = phz0Var.e;
        nuy0Var.d(false);
        nuy0Var.b(false);
        nuy0Var.f();
        nuy0Var.e(false);
        phz0Var.g.setVisible(true);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            o8z0.d(new fv(this, i, 2));
        } else if (i == -2 || i == -1) {
            d();
            gu8.c(null, "InterstitialPromoMediaPresenterS2: Audiofocus loss, pausing");
        }
    }

    @Override // xsna.dvy0.a
    public final void r() {
        loy0 loy0Var = this.d;
        if (!(loy0Var instanceof qfy0)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        dvy0 dvy0Var = this.i;
        dvy0Var.setViewMode(1);
        loy0Var.A(dvy0Var);
        sgz0 sgz0Var = (sgz0) this.c.v0;
        if (!loy0Var.isPlaying() || sgz0Var == null) {
            return;
        }
        if (sgz0Var.d != null) {
            this.j = true;
        }
        b(sgz0Var);
    }

    @Override // xsna.loy0.a
    public final void b(float f) {
    }

    @Override // xsna.loy0.a
    public final void p() {
    }

    @Override // xsna.loy0.a
    public final void a(float f) {
        this.b.e.setSoundState(f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.loy0.a
    public final void a(float f, float f2) {
        float f3 = this.h;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        loy0 loy0Var = this.d;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            phz0 phz0Var = this.b;
            if (phz0Var.n == phz0.a.c) {
                phz0Var.o = (long) (phz0Var.p - (1000.0f * f));
            }
            phz0Var.g.setTimeChanged(f);
            this.g.b(f, f2);
            this.e.c(f, f2);
            this.f.a(loy0Var.getVolume());
        }
        if (f == f2) {
            if (loy0Var.isPlaying()) {
                c();
            }
            loy0Var.stop();
        }
    }
}
