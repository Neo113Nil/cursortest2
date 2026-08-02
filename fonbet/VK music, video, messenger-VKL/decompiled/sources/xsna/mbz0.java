package xsna;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import xsna.hjz0;
import xsna.hox;
import xsna.uhz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mbz0 implements jaz0 {
    public final b9z0 b;
    public final t6z0 c;
    public final s4z0 d;
    public final ldy0 e;
    public c f;
    public kwy0 g;
    public suy0 h;
    public int i = -1;
    public fvy0 j;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b implements uhz0.a {
        public final kwy0 b;
        public final gdy0 c;
        public final pcz0 d;

        public b(gdy0 gdy0Var, kwy0 kwy0Var, pcz0 pcz0Var) {
            this.c = gdy0Var;
            this.b = kwy0Var;
            this.d = pcz0Var;
        }

        @Override // xsna.loy0.a
        public final void a(float f) {
            this.b.f(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.loy0.a
        public final void c() {
            this.b.i();
            hjz0.b bVar = ((t6z0) this.d).b;
            if (bVar != null) {
                ((hox.f) bVar).c(null);
            }
        }

        @Override // xsna.loy0.a
        public final void f() {
            this.b.k();
        }

        @Override // xsna.loy0.a
        public final void h() {
            this.b.n();
        }

        @Override // xsna.loy0.a
        public final void j() {
            this.b.m();
        }

        @Override // xsna.loy0.a
        public final void p() {
            this.b.o();
        }

        @Override // xsna.loy0.a
        public final void a(float f, float f2) {
            this.c.setTimeChanged(f);
            this.b.b(f, f2);
        }

        @Override // xsna.loy0.a
        public final void a(String str) {
            this.b.l();
        }

        @Override // xsna.loy0.a
        public final void g() {
        }

        @Override // xsna.loy0.a
        public final void k() {
        }

        @Override // xsna.uhz0.a
        public final void l() {
        }

        @Override // xsna.uhz0.a
        public final void n() {
        }

        @Override // xsna.uhz0.a
        public final void o() {
        }

        @Override // xsna.uhz0.a
        public final void q() {
        }

        @Override // xsna.loy0.a
        public final void b(float f) {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class c extends CountDownTimer {
        public final mbz0 a;
        public final int b;

        public c(int i, mbz0 mbz0Var) {
            super(i * 1000, 1 * 1000);
            this.b = i;
            this.a = mbz0Var;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            mbz0 mbz0Var = this.a;
            b9z0 b9z0Var = mbz0Var.b;
            int i = mbz0Var.i;
            if (i == 0) {
                b9z0Var.e.setVisibility(8);
                b9z0Var.g.setVisibility(0);
            } else if (i == 1) {
                b9z0Var.e.setVisibility(8);
                b9z0Var.g.setVisibility(0);
                mbz0Var.c.s();
            } else {
                if (i != 2) {
                    return;
                }
                b9z0Var.e.setVisibility(8);
                b9z0Var.g.setVisibility(8);
                b9z0Var.h.setVisibility(0);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            int i = (int) (j / 1000);
            int i2 = this.b - i;
            mbz0 mbz0Var = this.a;
            ldy0 ldy0Var = mbz0Var.e;
            ldy0Var.setProgress(i2);
            ldy0Var.setDigit(i);
            mbz0Var.c.a(i);
        }
    }

    public mbz0(s4z0 s4z0Var, boolean z, t6z0 t6z0Var, woy0 woy0Var, Context context) {
        int i;
        int i2;
        sgz0 sgz0Var;
        this.d = s4z0Var;
        tdz0 tdz0Var = s4z0Var.d0;
        if (tdz0Var == null || (sgz0Var = tdz0Var.g) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i3 = sgz0Var.b;
            i2 = sgz0Var.c;
            i = i3;
        }
        b9z0 b9z0Var = new b9z0(z, this, this, new a(this, s4z0Var.S), i, i2, context);
        this.b = b9z0Var;
        this.e = b9z0Var.getProgressView();
        this.c = t6z0Var;
        if (tdz0Var != null) {
            lgz0 lgz0Var = new lgz0(giy0.d, null);
            lgz0Var.v0 = tdz0Var.g;
            lgz0Var.a.k((e5z0) tdz0Var.b, tdz0Var.h);
            this.g = kwy0.a(lgz0Var, null, woy0Var, context);
        }
    }

    public final void b(int i) {
        ldy0 ldy0Var = this.e;
        ldy0Var.setMax(i);
        ldy0Var.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c cVar = new c(i, this);
        this.f = cVar;
        cVar.start();
    }

    public final void c() {
        s4z0 s4z0Var = this.d;
        this.c.b(s4z0Var, s4z0Var.K, 2, wn4.d(s4z0Var.T.c ? new viy0(64, new y9z0()) : new akz0()), this.b.getContext());
    }

    @Override // xsna.jaz0
    public final void destroy() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.cancel();
            this.f = null;
        }
    }

    public final void f() {
        int i = this.i;
        if (i == 0 || i == -1) {
            b9z0 b9z0Var = this.b;
            b9z0Var.getVideoView().getVideoPlayer().destroy();
            this.g = null;
            this.i = 1;
            s5z0 interactiveView = b9z0Var.getInteractiveView();
            s7z0 s7z0Var = this.d.a0;
            String str = s7z0Var.d;
            String str2 = s7z0Var.c;
            WebView webView = interactiveView.getWebView();
            if (str != null) {
                webView.loadUrl(str);
            } else {
                if (str2 == null) {
                    b9z0Var.e.setVisibility(8);
                    b9z0Var.g.setVisibility(0);
                    this.c.s();
                    return;
                }
                webView.loadDataWithBaseURL("https://ad.mail.ru/", str2, "text/html", C.UTF8_NAME, null);
            }
            int i2 = s7z0Var.e;
            b9z0Var.e.setVisibility(0);
            b9z0Var.g.setVisibility(8);
            b(i2);
            FrameLayout frameLayout = b9z0Var.i;
            t7z0 t7z0Var = b9z0Var.b;
            s5z0 s5z0Var = b9z0Var.c;
            if (s5z0Var.getParent() == null) {
                if (t7z0Var.getParent() != null) {
                    frameLayout.removeView(t7z0Var);
                }
                frameLayout.addView(s5z0Var, -1, -1);
            }
            suy0 a2 = suy0.a((e5z0) s7z0Var.b, null);
            this.h = a2;
            a2.b(b9z0Var.getInteractiveView());
            this.h.c();
        }
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return null;
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.b;
    }

    @Override // xsna.jaz0
    public final void pause() {
        loy0 videoPlayer = this.b.getVideoView().getVideoPlayer();
        if (videoPlayer.isPlaying()) {
            videoPlayer.pause();
            kwy0 kwy0Var = this.g;
            if (kwy0Var != null) {
                kwy0Var.k();
            }
        }
    }

    @Override // xsna.jaz0
    public final void resume() {
        loy0 videoPlayer = this.b.getVideoView().getVideoPlayer();
        if (videoPlayer.b()) {
            videoPlayer.resume();
            kwy0 kwy0Var = this.g;
            if (kwy0Var != null) {
                kwy0Var.n();
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a extends uxy0 {
        public final mbz0 a;
        public final wey0 b;

        public a(mbz0 mbz0Var, wey0 wey0Var) {
            this.a = mbz0Var;
            this.b = wey0Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            mbz0 mbz0Var = this.a;
            b9z0 b9z0Var = mbz0Var.b;
            b9z0Var.e.setVisibility(8);
            b9z0Var.g.setVisibility(0);
            mbz0Var.c.s();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!this.b.c) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            this.a.c();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.b.c) {
                this.a.c();
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // xsna.jaz0
    public final void stop() {
    }
}
