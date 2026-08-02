package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ironsource.X3;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xsna.c1z0;
import xsna.c9z0;
import xsna.dvy0;
import xsna.j7z0;
import xsna.loy0;
import xsna.yhz0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ady0 implements loy0.a, j7z0.a, yhz0.d, dvy0.a {
    public boolean A;
    public final d9z0 b;
    public final lgz0 c;
    public final sgz0 d;
    public final x1z0 f;
    public final f5z0 g;
    public final kwy0 h;
    public final c9z0.a i;
    public WeakReference j;
    public WeakReference k;
    public WeakReference l;
    public loy0 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean t;
    public int u;
    public Uri v;
    public c9z0.a w;
    public WeakReference x;
    public long y;
    public boolean z;
    public boolean r = true;
    public boolean s = false;
    public final a e = new a();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            ady0 ady0Var = ady0.this;
            if (i == -3) {
                loy0 loy0Var = ady0Var.m;
                if (loy0Var == null || ady0Var.t) {
                    return;
                }
                loy0Var.e();
                return;
            }
            if (i == -2 || i == -1) {
                ady0Var.t();
                gu8.c(null, "NativeAdVideoController$AfChangeListener: Audiofocus loss, pausing");
            } else if ((i == 1 || i == 2 || i == 4) && ady0Var.p) {
                gu8.c(null, "NativeAdVideoController$AfChangeListener: Audiofocus gain, unmuting");
                loy0 loy0Var2 = ady0Var.m;
                if (loy0Var2 == null) {
                    return;
                }
                loy0Var2.d();
            }
        }
    }

    public ady0(x1z0 x1z0Var, lgz0 lgz0Var, sgz0 sgz0Var, c9z0.a aVar, d9z0 d9z0Var) {
        this.c = lgz0Var;
        this.f = x1z0Var;
        this.b = d9z0Var;
        this.d = sgz0Var;
        this.o = lgz0Var.h0;
        this.t = lgz0Var.g0;
        this.g = f5z0.a(lgz0Var.a, null);
        this.h = kwy0.a(lgz0Var, d9z0Var.a, null, d9z0Var.b);
        this.i = aVar;
        String str = (String) sgz0Var.d;
        if (str != null) {
            this.v = Uri.parse(str);
        } else {
            this.v = Uri.parse(sgz0Var.a);
        }
    }

    public final void a() {
        MediaAdView mediaAdView;
        s();
        this.g.d(null);
        this.h.g = null;
        e();
        WeakReference weakReference = this.j;
        if (weakReference == null || (mediaAdView = (MediaAdView) weakReference.get()) == null || !(mediaAdView.getChildAt(1) instanceof dvy0)) {
            return;
        }
        mediaAdView.removeViewAt(1);
    }

    public final void b(MediaAdView mediaAdView, Context context) {
        dvy0 dvy0Var;
        WeakReference weakReference;
        gu8.c(null, "NativeAdVideoController: Register video ad with view " + mediaAdView);
        if (this.p) {
            return;
        }
        WeakReference weakReference2 = this.j;
        if (weakReference2 != null && weakReference2.get() == mediaAdView && (weakReference = this.x) != null && weakReference.get() == context && (mediaAdView.getChildAt(1) instanceof dvy0)) {
            dvy0Var = (dvy0) mediaAdView.getChildAt(1);
        } else {
            a();
            this.h.g = context;
            this.j = new WeakReference(mediaAdView);
            this.x = new WeakReference(context);
            dvy0 dvy0Var2 = new dvy0(mediaAdView.getContext().getApplicationContext());
            mediaAdView.addView(dvy0Var2, 1);
            dvy0Var = dvy0Var2;
        }
        dvy0Var.setAdVideoViewListener(this);
        this.g.d(dvy0Var);
        if (this.o) {
            g();
        } else {
            p();
        }
    }

    @Override // xsna.loy0.a
    public final void c() {
        MediaAdView i = i();
        if (i != null) {
            i.getProgressBarView().setVisibility(8);
            if (!this.z) {
                i.getPlayButtonView().setVisibility(0);
            }
        }
        this.y = 0L;
    }

    public final void d(dvy0 dvy0Var, boolean z) {
        boolean z2;
        loy0 loy0Var = this.m;
        if (loy0Var == null) {
            d9z0 d9z0Var = this.b;
            loy0Var = kqz0.a(d9z0Var.b, d9z0Var.c);
            z2 = true;
        } else {
            z2 = false;
        }
        loy0Var.x(this);
        if (z) {
            loy0Var.f();
        } else {
            loy0Var.d();
        }
        loy0Var.A(dvy0Var);
        sgz0 sgz0Var = this.d;
        dvy0Var.b(sgz0Var.b, sgz0Var.c);
        if (loy0Var.isPlaying()) {
            this.m = loy0Var;
            k();
            return;
        }
        loy0Var.B(dvy0Var.getContext(), this.v);
        long j = this.y;
        if (j > 0 && z2) {
            loy0Var.seekTo(j);
        }
        this.m = loy0Var;
    }

    public final void e() {
        loy0 loy0Var = this.m;
        if (loy0Var == null) {
            return;
        }
        loy0Var.x(null);
        this.m.destroy();
        this.m = null;
        if (o8z0.b()) {
            return;
        }
        gu8.c(null, "NativeAdVideoController: " + Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    @Override // xsna.loy0.a
    public final void f() {
        Context context;
        AudioManager audioManager;
        MediaAdView i = i();
        if (i != null) {
            context = i.getContext();
            if (!this.z) {
                i.getPlayButtonView().setVisibility(0);
            }
            i.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        t();
        if (i != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this.e);
        }
        zu50.c cVar = this.i.b.a.i;
        if (cVar != null) {
            cVar.onVideoPause();
        }
        this.s = true;
    }

    @Override // xsna.loy0.a
    public final void g() {
        WeakReference weakReference;
        yhz0 yhz0Var;
        this.u = 4;
        MediaAdView i = i();
        if (i != null) {
            if (!this.z) {
                i.getProgressBarView().setVisibility(0);
            }
            i.getPlayButtonView().setVisibility(8);
        }
        if (!this.p || (weakReference = this.l) == null || (yhz0Var = (yhz0) weakReference.get()) == null || yhz0Var.z == 3) {
            return;
        }
        yhz0Var.z = 3;
        yhz0Var.j.getProgressBarView().setVisibility(0);
        yhz0Var.g.setVisibility(8);
        yhz0Var.p.setVisibility(8);
        yhz0Var.o.setVisibility(8);
        yhz0Var.i.setVisibility(8);
    }

    @Override // xsna.loy0.a
    public final void h() {
        this.i.b.a.getClass();
        this.s = false;
    }

    public final MediaAdView i() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    @Override // xsna.loy0.a
    public final void j() {
        this.h.m();
        this.i.a();
    }

    @Override // xsna.loy0.a
    public final void k() {
        WeakReference weakReference;
        yhz0 yhz0Var;
        if (this.u == 1) {
            loy0 loy0Var = this.m;
            if (loy0Var != null) {
                float volume = loy0Var.getVolume();
                c9z0.a aVar = this.i;
                if (b920.b(aVar.d, volume) != 0) {
                    aVar.d = volume;
                    aVar.b.a.getClass();
                    return;
                }
                return;
            }
            return;
        }
        this.u = 1;
        MediaAdView i = i();
        if (i != null) {
            i.getProgressBarView().setVisibility(8);
            i.getPlayButtonView().setVisibility(8);
        }
        if (!this.p || (weakReference = this.l) == null || (yhz0Var = (yhz0) weakReference.get()) == null) {
            return;
        }
        if (this.m != null) {
            dvy0 adVideoView = yhz0Var.getAdVideoView();
            sgz0 sgz0Var = this.d;
            adVideoView.b(sgz0Var.b, sgz0Var.c);
            this.m.A(adVideoView);
        }
        MediaAdView mediaAdView = yhz0Var.j;
        int i2 = yhz0Var.z;
        if (i2 == 0 || i2 == 2) {
            return;
        }
        yhz0Var.z = 0;
        mediaAdView.getImageView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        yhz0Var.g.setVisibility(8);
        yhz0Var.p.setVisibility(8);
        if (yhz0Var.z != 2) {
            yhz0Var.o.setVisibility(8);
        }
    }

    @Override // xsna.j7z0.a
    public final void m() {
        gu8.c(null, "NativeAdVideoController: Dismiss dialog");
        this.k = null;
        this.p = false;
        loy0 loy0Var = this.m;
        if (loy0Var != null) {
            loy0Var.f();
        }
        MediaAdView i = i();
        if (i == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) i.getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.e);
        }
        int i2 = this.u;
        if (i2 != 1) {
            if (i2 == 2) {
                this.s = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    this.o = false;
                } else {
                    this.o = true;
                    g();
                    View childAt = i.getChildAt(1);
                    if (childAt instanceof dvy0) {
                        d((dvy0) childAt, true);
                    }
                }
            }
            this.o = false;
            p();
        } else {
            this.u = 4;
            k();
            if (this.c.h0) {
                this.o = true;
            }
            View childAt2 = i.getChildAt(1);
            if (childAt2 instanceof dvy0) {
                d((dvy0) childAt2, true);
            }
        }
        this.h.d(false);
        this.l = null;
    }

    @Override // xsna.loy0.a
    public final void p() {
        Context context;
        AudioManager audioManager;
        WeakReference weakReference;
        yhz0 yhz0Var;
        this.q = false;
        this.y = 0L;
        MediaAdView i = i();
        if (i != null) {
            ImageView imageView = i.getImageView();
            kiw kiwVar = this.c.t;
            if (kiwVar != null) {
                imageView.setImageBitmap(kiwVar.a());
            }
            imageView.setVisibility(0);
            if (!this.z) {
                i.getPlayButtonView().setVisibility(0);
            }
            i.getProgressBarView().setVisibility(8);
            context = i.getContext();
        } else {
            context = null;
        }
        if (this.p && (weakReference = this.l) != null && (yhz0Var = (yhz0) weakReference.get()) != null) {
            MediaAdView mediaAdView = yhz0Var.j;
            if (yhz0Var.z != 4) {
                yhz0Var.z = 4;
                mediaAdView.getImageView().setVisibility(0);
                mediaAdView.getProgressBarView().setVisibility(8);
                if (yhz0Var.A) {
                    yhz0Var.g.setVisibility(0);
                    yhz0Var.i.setVisibility(0);
                }
                yhz0Var.p.setVisibility(8);
                yhz0Var.o.setVisibility(8);
                yhz0Var.l.setVisibility(8);
            }
            context = yhz0Var.getContext();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.e);
    }

    @Override // xsna.dvy0.a
    public final void r() {
        gu8.c(null, "NativeAdVideoController: Native Ad Views without hardware acceleration is not currently supported");
        this.i.a();
    }

    public final void s() {
        loy0 loy0Var;
        if (!this.n || this.p) {
            return;
        }
        this.n = false;
        if (this.u == 1 && (loy0Var = this.m) != null) {
            loy0Var.pause();
            this.u = 2;
        }
        loy0 loy0Var2 = this.m;
        if (loy0Var2 != null) {
            loy0Var2.x(null);
            this.m.A(null);
        }
    }

    public final void t() {
        WeakReference weakReference;
        if (!this.p || (weakReference = this.l) == null) {
            return;
        }
        this.u = 2;
        yhz0 yhz0Var = (yhz0) weakReference.get();
        if (yhz0Var == null) {
            return;
        }
        loy0 loy0Var = this.m;
        if (loy0Var != null) {
            loy0Var.pause();
        }
        MediaAdView mediaAdView = yhz0Var.j;
        if (yhz0Var.z != 1) {
            yhz0Var.z = 1;
            mediaAdView.getImageView().setVisibility(0);
            mediaAdView.getProgressBarView().setVisibility(8);
            yhz0Var.g.setVisibility(8);
            yhz0Var.p.setVisibility(0);
            yhz0Var.o.setVisibility(8);
            yhz0Var.i.setVisibility(0);
        }
    }

    public final void u() {
        WeakReference weakReference;
        WeakReference weakReference2;
        loy0 loy0Var = this.m;
        if (loy0Var != null && loy0Var.b()) {
            MediaAdView i = i();
            dvy0 dvy0Var = null;
            if (i == null) {
                gu8.c(null, "NativeAdVideoController: Trying to play video in unregistered view");
                e();
                return;
            }
            if (this.p && (weakReference2 = this.l) != null) {
                dvy0Var = ((yhz0) weakReference2.get()).getAdVideoView();
            } else if (i.getChildAt(1) instanceof dvy0) {
                dvy0Var = (dvy0) i.getChildAt(1);
            }
            if (dvy0Var == null) {
                e();
                return;
            }
            sgz0 sgz0Var = this.d;
            dvy0Var.b(sgz0Var.b, sgz0Var.c);
            this.m.A(dvy0Var);
            this.m.resume();
        } else if (this.p && (weakReference = this.l) != null) {
            d(((yhz0) weakReference.get()).getAdVideoView(), this.t);
        }
        g();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        yhz0 yhz0Var = new yhz0(frameLayout.getContext());
        this.u = 4;
        this.k = new WeakReference(j7z0Var);
        char c = 65535;
        yhz0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(yhz0Var);
        this.l = new WeakReference(yhz0Var);
        x1z0 x1z0Var = this.f;
        lgz0 lgz0Var = x1z0Var.W;
        if (lgz0Var != null) {
            yhz0Var.l.setMax(x1z0Var.D);
            yhz0Var.A = lgz0Var.j0;
            yhz0Var.d.setText(x1z0Var.n());
            yhz0Var.b.setText(x1z0Var.f);
            String str = x1z0Var.p;
            str.getClass();
            switch (str.hashCode()) {
                case 117588:
                    if (str.equals("web")) {
                        c = 0;
                        break;
                    }
                    break;
                case 109770977:
                    if (str.equals(X3.i.U)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1223953944:
                    if (str.equals("webform")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            TextView textView = yhz0Var.k;
            qpk0 qpk0Var = yhz0Var.c;
            switch (c) {
                case 0:
                case 2:
                    qpk0Var.setVisibility(8);
                    textView.setVisibility(0);
                    textView.setText(x1z0Var.o);
                    break;
                case 1:
                    textView.setVisibility(8);
                    if (x1z0Var.f() != 0 && x1z0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        qpk0Var.setVisibility(0);
                        qpk0Var.setRating(x1z0Var.c());
                        break;
                    } else {
                        qpk0Var.setVisibility(8);
                        break;
                    }
            }
            yhz0Var.e.setText(lgz0Var.a0);
            yhz0Var.h.setText(lgz0Var.b0);
            byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 420;
            options.inTargetDensity = c1z0.a.b;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (decodeByteArray != null) {
                yhz0Var.q.setImageBitmap(decodeByteArray);
            }
            sgz0 sgz0Var = this.d;
            int i = sgz0Var.b;
            int i2 = sgz0Var.c;
            MediaAdView mediaAdView = yhz0Var.j;
            mediaAdView.b(i, i2);
            kiw kiwVar = x1z0Var.t;
            if (kiwVar != null) {
                mediaAdView.getImageView().setImageBitmap(kiwVar.a());
            }
        }
        yhz0Var.setVideoDialogViewListener(this);
        boolean z = this.t;
        wvy0 wvy0Var = yhz0Var.m;
        if (z) {
            wvy0Var.a(yhz0Var.v, false);
            wvy0Var.setContentDescription("sound off");
        } else {
            wvy0Var.a(yhz0Var.u, false);
            wvy0Var.setContentDescription("sound on");
        }
        this.h.d(true);
        d(yhz0Var.getAdVideoView(), this.t);
    }

    @Override // xsna.loy0.a
    public final void a(float f) {
        yhz0 yhz0Var;
        WeakReference weakReference = this.l;
        if (weakReference == null || (yhz0Var = (yhz0) weakReference.get()) == null) {
            return;
        }
        boolean z = f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        wvy0 wvy0Var = yhz0Var.m;
        if (z) {
            wvy0Var.a(yhz0Var.v, false);
            wvy0Var.setContentDescription("sound off");
        } else {
            wvy0Var.a(yhz0Var.u, false);
            wvy0Var.setContentDescription("sound on");
        }
    }

    @Override // xsna.loy0.a
    public final void a(float f, float f2) {
        yhz0 yhz0Var;
        this.g.c(f, f2);
        this.h.b(f, f2);
        float f3 = this.c.D;
        WeakReference weakReference = this.l;
        if (weakReference == null || (yhz0Var = (yhz0) weakReference.get()) == null) {
            return;
        }
        ohy0 ohy0Var = yhz0Var.l;
        if (ohy0Var.getVisibility() != 0) {
            ohy0Var.setVisibility(0);
        }
        ohy0Var.setProgress(f / f3);
        ohy0Var.setDigit((int) Math.ceil(f3 - f));
    }

    @Override // xsna.loy0.a
    public final void b(float f) {
        k();
        boolean z = this.r;
        c9z0.a aVar = this.i;
        if (z) {
            aVar.b.a.getClass();
            this.r = false;
        } else if (this.s) {
            aVar.b.a.getClass();
            this.s = false;
        }
        if (!this.q) {
            zu50.c cVar = aVar.b.a.i;
            if (cVar != null) {
                cVar.onVideoPlay();
            }
            this.q = true;
        }
        float f2 = this.c.D;
        int b = b920.b(f, f2);
        if (b == 1) {
            b(f2);
            return;
        }
        aVar.b.a.getClass();
        if (this.m == null) {
            return;
        }
        if (b920.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1) {
            this.y = this.m.getPosition();
        }
        if (b == -1) {
            return;
        }
        if (this.A) {
            this.m.h();
            return;
        }
        p();
        this.u = 3;
        this.m.stop();
        this.o = false;
        kwy0 kwy0Var = this.h;
        kwy0Var.i();
        zu50.c cVar2 = aVar.b.a.i;
        if (cVar2 != null) {
            cVar2.onVideoComplete();
        }
        kwy0Var.h();
    }

    @Override // xsna.loy0.a
    public final void a(String str) {
        this.h.l();
        sgz0 sgz0Var = (sgz0) this.c.v0;
        if (sgz0Var != null && this.v.toString().equals(sgz0Var.d)) {
            gu8.c(null, "NativeAdVideoController: Try to play video stream from URL");
            this.v = Uri.parse(sgz0Var.a);
            WeakReference weakReference = this.x;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            loy0 loy0Var = this.m;
            if (loy0Var == null || context == null) {
                return;
            }
            loy0Var.B(context, this.v);
            return;
        }
        this.i.a();
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
        loy0 loy0Var = this.m;
        if (loy0Var == null || z) {
            return;
        }
        this.y = loy0Var.getPosition();
        e();
        f();
    }
}
