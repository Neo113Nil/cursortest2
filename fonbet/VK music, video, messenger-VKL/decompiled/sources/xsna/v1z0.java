package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.igz0;
import xsna.uhz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class v1z0 {
    public final lgz0 a;
    public final a b;
    public final igz0.b c;
    public final ojz0 d;
    public final f5z0 e;
    public final kwy0 f;
    public final igz0.a g;
    public final ao90 h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n = true;

    public v1z0(bfz0 bfz0Var, lgz0 lgz0Var, ojz0 ojz0Var, igz0.a aVar, igz0.b bVar, ao90 ao90Var, yqg0 yqg0Var) {
        this.a = lgz0Var;
        this.g = aVar;
        this.c = bVar;
        this.h = ao90Var;
        a aVar2 = new a();
        this.b = aVar2;
        this.d = ojz0Var;
        ojz0Var.setMediaListener(aVar2);
        f5z0 a2 = f5z0.a(lgz0Var.a, yqg0Var);
        this.e = a2;
        a2.d(ojz0Var.getPromoMediaView());
        this.f = kwy0.a(lgz0Var, bfz0Var.a, yqg0Var, bfz0Var.b);
    }

    public static void a(v1z0 v1z0Var, int i) {
        if (i == -3) {
            gu8.c(null, "InterstitialMediaPresenter: Audiofocus loss can duck, set volume to 0.3");
            if (v1z0Var.j) {
                return;
            }
            v1z0Var.d.a(1);
            return;
        }
        if (i == -2 || i == -1) {
            v1z0Var.f();
            gu8.c(null, "InterstitialMediaPresenter: Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            gu8.c(null, "InterstitialMediaPresenter: Audiofocus gain, unmuting");
            if (v1z0Var.j) {
                return;
            }
            v1z0Var.g();
        }
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.b);
        }
    }

    public final void c() {
        this.d.c();
        this.g.a.j = true;
    }

    public final void d() {
        ojz0 ojz0Var = this.d;
        b(ojz0Var.getView().getContext());
        ojz0Var.destroy();
    }

    public final void e(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.b, 3, 2);
        }
    }

    public final void f() {
        ojz0 ojz0Var = this.d;
        ojz0Var.pause();
        b(ojz0Var.getView().getContext());
        if (!ojz0Var.isPlaying() || ojz0Var.b()) {
            return;
        }
        this.f.k();
    }

    public final void g() {
        ojz0 ojz0Var = this.d;
        if (ojz0Var.isPlaying()) {
            e(ojz0Var.getView().getContext());
        }
        ojz0Var.a(2);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements uhz0.a {
        public a() {
        }

        @Override // xsna.loy0.a
        public final void a(String str) {
            wga0.b("InterstitialMediaPresenter$MyMediaViewListener: Video playing error: ", str, null);
            v1z0 v1z0Var = v1z0.this;
            v1z0Var.f.l();
            if (!v1z0Var.n) {
                v1z0Var.d();
                v1z0Var.h.b();
            } else {
                gu8.c(null, "InterstitialMediaPresenter$MyMediaViewListener: Try to play video stream from URL");
                v1z0Var.n = false;
                v1z0Var.d.c(false);
            }
        }

        public final void b() {
            v1z0 v1z0Var = v1z0.this;
            kwy0 kwy0Var = v1z0Var.f;
            if (v1z0Var.j) {
                v1z0Var.g();
                kwy0Var.f(true);
                v1z0Var.j = false;
            } else {
                ojz0 ojz0Var = v1z0Var.d;
                v1z0Var.b(ojz0Var.getView().getContext());
                ojz0Var.a(0);
                kwy0Var.f(false);
                v1z0Var.j = true;
            }
        }

        @Override // xsna.loy0.a
        public final void c() {
            v1z0 v1z0Var = v1z0.this;
            ojz0 ojz0Var = v1z0Var.d;
            kwy0 kwy0Var = v1z0Var.f;
            if (v1z0Var.m) {
                return;
            }
            v1z0Var.m = true;
            gu8.c(null, "InterstitialMediaPresenter$MyMediaViewListener: Video playing complete");
            kwy0Var.i();
            v1z0Var.c();
            v1z0Var.b(ojz0Var.getView().getContext());
            ojz0Var.a(v1z0Var.a.j0);
            v1z0Var.c.b();
            v1z0Var.c();
            ojz0Var.d();
            kwy0Var.h();
        }

        @Override // xsna.loy0.a
        public final void j() {
            v1z0 v1z0Var = v1z0.this;
            v1z0Var.f.m();
            v1z0Var.d();
            gu8.c(null, "InterstitialMediaPresenter$MyMediaViewListener: Video playing timeout");
            v1z0Var.h.b();
        }

        @Override // xsna.loy0.a
        public final void k() {
            v1z0 v1z0Var = v1z0.this;
            if (v1z0Var.k && v1z0Var.a.q0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                v1z0Var.c();
            }
            v1z0Var.d.a();
        }

        @Override // xsna.uhz0.a
        public final void l() {
            v1z0 v1z0Var = v1z0.this;
            v1z0Var.b(v1z0Var.d.getView().getContext());
            v1z0Var.f.k();
            v1z0Var.d.pause();
        }

        @Override // xsna.uhz0.a
        public final void n() {
            v1z0 v1z0Var = v1z0.this;
            v1z0Var.f.n();
            ojz0 ojz0Var = v1z0Var.d;
            ojz0Var.resume();
            if (!v1z0Var.j) {
                v1z0Var.g();
            } else {
                v1z0Var.b(ojz0Var.getView().getContext());
                ojz0Var.a(0);
            }
        }

        @Override // xsna.uhz0.a
        public final void o() {
            v1z0 v1z0Var = v1z0.this;
            v1z0Var.d.c(v1z0Var.n);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            if (Looper.getMainLooper().isCurrentThread()) {
                v1z0.a(v1z0.this, i);
            } else {
                o8z0.d(new i1u(this, i, 2));
            }
        }

        @Override // xsna.uhz0.a
        public final void q() {
            v1z0 v1z0Var = v1z0.this;
            ojz0 ojz0Var = v1z0Var.d;
            if (!v1z0Var.j) {
                v1z0Var.e(ojz0Var.getView().getContext());
            }
            ojz0Var.c(v1z0Var.n);
        }

        @Override // xsna.loy0.a
        public final void b(float f) {
            v1z0 v1z0Var = v1z0.this;
            loy0 videoPlayer = v1z0Var.d.getPromoMediaView().getVideoPlayer();
            if (videoPlayer != null) {
                v1z0Var.c.a(videoPlayer.getVolume());
            }
        }

        @Override // xsna.loy0.a
        public final void a(float f) {
            v1z0.this.d.b(f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.loy0.a
        public final void a(float f, float f2) {
            v1z0 v1z0Var = v1z0.this;
            lgz0 lgz0Var = v1z0Var.a;
            v1z0Var.d.setTimeChanged(f);
            v1z0Var.m = false;
            if (!v1z0Var.l) {
                v1z0Var.l = true;
            }
            if (v1z0Var.k && lgz0Var.h0) {
                double d = (lgz0Var.q0 - f) + 1.0f;
                if (d >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    v1z0Var.g.a(d);
                }
                if (lgz0Var.q0 <= f) {
                    v1z0Var.c();
                }
            }
            float f3 = v1z0Var.i;
            if (f <= f3) {
                v1z0Var.e.c(f, f2);
                v1z0Var.f.b(f, f2);
                if (f == v1z0Var.i) {
                    c();
                    return;
                }
                return;
            }
            a(f3, f3);
        }

        @Override // xsna.loy0.a
        public final void f() {
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
    }
}
