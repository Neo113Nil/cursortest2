package sg.bigo.ads.cz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.an.o;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.cz.c;
import xsna.ji;

/* loaded from: classes9.dex */
public final class e extends f implements c.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private View M;
    private b N;
    private final TextureView.SurfaceTextureListener O;
    private Runnable P;
    int a;
    private int j;
    private int k;
    private g l;
    private AdImageView m;
    private String n;
    private ProgressBar o;
    private View p;
    private c q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;
    private Runnable x;
    private Runnable y;
    private boolean z;

    public e(Context context, int i, int i2, @NonNull sg.bigo.ads.ak.b bVar, @Nullable sg.bigo.ads.cp.a aVar) {
        super(context, bVar, aVar);
        sg.bigo.ads.cp.a aVar2;
        this.q = new c();
        this.r = 0;
        this.s = 0;
        this.t = true;
        this.z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.E = false;
        this.H = 0L;
        this.I = "";
        this.J = "";
        this.K = true;
        this.L = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: sg.bigo.ads.cz.e.1
            private long b = SystemClock.elapsedRealtime();

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
                sg.bigo.ads.bh.d.a(e.this.y);
                e.this.a(13, SystemClock.elapsedRealtime() - this.b, 0);
                e.this.H = SystemClock.elapsedRealtime();
                e.this.q.a(new Surface(surfaceTexture));
                sg.bigo.ads.cp.a aVar3 = e.this.e;
                if (aVar3 != null && aVar3.bh()) {
                    e.this.q.a(e.this.n);
                    e.d(e.this);
                    return;
                }
                sg.bigo.ads.cp.a aVar4 = e.this.e;
                if (aVar4 == null || aVar4.bq() == null || !e.this.e.bz()) {
                    e.g(e.this);
                    return;
                }
                Pair<Bitmap, String> bq = e.this.e.bq();
                if (bq != null) {
                    e.this.a((e) bq.first);
                    if (e.this.N != null) {
                        e.this.N.a((Bitmap) bq.first);
                    }
                }
                e.this.u();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                sg.bigo.ads.bn.a.a("VideoPlayView", "onSurfaceTextureDestroyed");
                e.this.d(false);
                c cVar = e.this.q;
                try {
                    if (!c.h.get()) {
                        cVar.a.reset();
                    }
                    sg.bigo.ads.bh.d.a(cVar.g);
                } catch (IllegalStateException e) {
                    c.a aVar3 = cVar.c;
                    if (aVar3 != null) {
                        aVar3.a(11, Log.getStackTraceString(e), cVar.i);
                    }
                    sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "reset IllegalStateException");
                }
                cVar.f = false;
                cVar.e = false;
                if (!e.this.u) {
                    e eVar = e.this;
                    eVar.i = false;
                    if (eVar.r > 0) {
                        e eVar2 = e.this;
                        eVar2.s = eVar2.r;
                    }
                }
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
            }
        };
        this.O = surfaceTextureListener;
        this.a = 0;
        this.P = new Runnable() { // from class: sg.bigo.ads.cz.e.4
            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView = e.this.h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
        };
        this.J = aVar != null ? aVar.bb() : "";
        if (aVar != null && aVar.bE() != null) {
            this.I = aVar.bE().b;
        }
        u();
        this.w = bVar.f;
        this.u = bVar.e;
        this.j = i;
        this.k = i2;
        int i3 = bVar.a;
        this.v = bVar.b;
        g gVar = new g(this.c, i, i2, i3);
        this.l = gVar;
        v.a(gVar, this, null, -1);
        this.l.setSurfaceTextureListener(surfaceTextureListener);
        sg.bigo.ads.cp.a aVar3 = this.e;
        if (aVar3 != null && aVar3.y() != 2 && w()) {
            sg.bigo.ads.bh.d.a(this.y);
            if (this.y == null) {
                this.y = new Runnable() { // from class: sg.bigo.ads.cz.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.v();
                        sg.bigo.ads.cp.a aVar4 = e.this.e;
                        sg.bigo.ads.da.b.a(aVar4, aVar4 != null ? aVar4.aS() : "", 13, "onSurfaceTextureAvailable not called", 0);
                        e.this.a("AdVideoTooLate", new int[]{10311});
                    }
                };
            }
            sg.bigo.ads.bh.d.a(2, this.y, this.w);
        }
        if (!bVar.g && (aVar2 = this.e) != null && !TextUtils.isEmpty(aVar2.aV())) {
            a((e) o.b(getContext().getApplicationContext(), this.e.aV()));
        }
        boolean a = this.q.a(bVar.d);
        this.t = a;
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, a ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        sg.bigo.ads.cp.a aVar4 = this.e;
        boolean z = aVar4 != null && aVar4.aW();
        this.G = z;
        if (z) {
            x();
        }
        ImageView imageView2 = this.h;
        if (imageView2 != null) {
            imageView2.setVisibility(this.u ? 0 : 8);
        }
        this.q.c = this;
        b(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        sg.bigo.ads.cp.a aVar;
        int i;
        sg.bigo.ads.cp.a aVar2 = this.e;
        if (aVar2 == null) {
            return;
        }
        Pair<Bitmap, String> bq = aVar2.bq();
        if (this.e.bh()) {
            aVar = this.e;
            i = 0;
        } else if (bq == null) {
            aVar = this.e;
            i = 5;
        } else if (Objects.equals(bq.second, this.I)) {
            aVar = this.e;
            i = 1;
        } else {
            if (!Objects.equals(bq.second, this.J)) {
                return;
            }
            aVar = this.e;
            i = 2;
        }
        aVar.k(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.q.g();
        this.q.d();
        this.q.e();
    }

    private boolean w() {
        return this.w > 0;
    }

    private void x() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.o = progressBar;
        progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(context, android.R.color.transparent));
        t.a(context, this.o, R.drawable.bigo_ad_progressbar_white);
        this.o.setVisibility(8);
        v.a(this.o, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    private void y() {
        if (this.o == null) {
            x();
        }
        this.o.setVisibility(8);
    }

    private void z() {
        if (this.p == null) {
            this.p = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.p;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.cz.a
    public final void d() {
        d(false);
        v();
        setOnEventListener(null);
        this.o = null;
        sg.bigo.ads.bh.d.a(this.x);
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void f() {
        this.u = false;
        int i = this.s;
        if (i > 0) {
            this.q.a(i);
            this.s = -1;
        }
        a("AdVideoPlaying", (int[]) null);
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void g() {
        a("AdVideoPaused", (int[]) null);
    }

    public final int getAdDuration() {
        return this.q.f();
    }

    public final int getAdRemainingTime() {
        return this.q.c();
    }

    public final ImageView getCoverView() {
        return this.m;
    }

    public final int getCurrentPos() {
        return this.r;
    }

    @Override // sg.bigo.ads.cz.a
    public final int getPlayStatus() {
        return this.q.d;
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void h() {
        String str;
        int adRemainingTime = getAdRemainingTime();
        if (this.G && (str = this.n) != null && !str.startsWith("file:")) {
            if (this.D == adRemainingTime) {
                if (!this.E) {
                    if (this.o == null) {
                        x();
                    }
                    this.o.setVisibility(0);
                    this.C = true;
                    a("AdVideoBuffering", (int[]) null);
                }
                this.E = true;
            } else {
                if (this.E) {
                    y();
                    this.C = false;
                    a("AdVideoBuffered", (int[]) null);
                }
                this.E = false;
            }
            this.D = adRemainingTime;
        }
        if (this.F <= 0) {
            int adDuration = getAdDuration();
            this.F = adDuration;
            if (adDuration <= 0) {
                return;
            }
        }
        int i = this.F;
        if (adRemainingTime > i) {
            adRemainingTime = i;
        }
        this.r = adRemainingTime;
        a("AdRemainingTimeChange", new int[]{adRemainingTime, i, (int) ((adRemainingTime * 100.0f) / i)});
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void j() {
        a("AdSizeChange", (int[]) null);
    }

    @Override // sg.bigo.ads.cz.f
    public final void k() {
        if (this.G && this.C) {
            return;
        }
        t();
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void k_() {
        a("AdVideoStart", (int[]) null);
    }

    public final void l() {
        g gVar;
        sg.bigo.ads.cp.a aVar;
        if (this.e == null || (gVar = this.l) == null || !gVar.isAvailable() || this.L || (aVar = this.e) == null || !aVar.bz() || this.e.bq() == null || this.e.bj()) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.e.bq().first;
        this.L = true;
        z();
        a((e) bitmap);
        c cVar = this.q;
        a("AdBackupImgReady", new int[]{(cVar == null || TextUtils.isEmpty(cVar.b)) ? 0 : 1});
    }

    public final void m() {
        g gVar;
        if (this.e == null || (gVar = this.l) == null || this.L || !gVar.isAvailable() || this.e.bj()) {
            return;
        }
        this.L = true;
        this.e.c(getContext());
        this.q.a(this.e.c(getContext().getApplicationContext()));
    }

    @Override // sg.bigo.ads.cz.f
    public final boolean n() {
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d(false);
        this.o = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        super.onWindowVisibilityChanged(i);
        View view2 = this.M;
        if (view2 != null) {
            if (i == 0) {
                v.b(view2);
                view = this.l;
                layoutParams = null;
            } else {
                v.b(this.l);
                view = this.M;
                layoutParams = new FrameLayout.LayoutParams(this.j, this.k);
            }
            v.a(view, this, layoutParams, 0);
        }
    }

    public final void setIVideoPlayerViewListener(b bVar) {
        this.N = bVar;
    }

    @Override // sg.bigo.ads.cz.a
    public final void setMute(boolean z) {
        if (this.t == z) {
            this.A = false;
            return;
        }
        boolean a = this.q.a(z);
        this.t = a;
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, a ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (!this.A && !this.B) {
            a("AdVolumeChange", new int[]{this.t ? 0 : 100});
        } else {
            this.A = false;
            this.B = false;
        }
    }

    public final void setPlayInfo$505cff1c(String str) {
        this.n = str;
        this.r = 0;
    }

    public final void setSeekPos(int i) {
        this.s = i;
    }

    @Override // sg.bigo.ads.cz.f
    public final void setStatPrepareEventOnce(boolean z) {
        this.K = z;
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.w()) {
            sg.bigo.ads.bh.d.a(eVar.x);
            if (eVar.x == null) {
                eVar.x = new Runnable() { // from class: sg.bigo.ads.cz.e.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.v();
                        e.this.a("AdVideoTooLate", new int[]{10107});
                    }
                };
            }
            sg.bigo.ads.bh.d.a(2, eVar.x, eVar.w);
        }
    }

    public static /* synthetic */ void g(e eVar) {
        if (eVar.p == null) {
            eVar.p = sg.bigo.ads.common.utils.a.a(eVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = eVar.p;
        if (view != null) {
            v.a(view, eVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
            eVar.p.setVisibility(0);
        }
    }

    @Override // sg.bigo.ads.cz.a
    public final boolean c() {
        return this.t;
    }

    @Override // sg.bigo.ads.cz.f
    public final boolean e() {
        return this.q.e;
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void i() {
        this.u = true;
        AdImageView adImageView = this.m;
        if (adImageView != null) {
            adImageView.setVisibility(0);
        }
        this.h.setVisibility(this.v ? 8 : 0);
        this.h.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, R.drawable.bigo_ad_ic_media_play));
        d(false);
        a("AdVideoComplete", (int[]) null);
    }

    @Override // sg.bigo.ads.ak.a
    public final void a() {
        c cVar = this.q;
        if (cVar.e && cVar.b()) {
            this.z = false;
            if (this.G) {
                y();
            }
            this.E = false;
        }
    }

    @Override // sg.bigo.ads.cz.a
    public final void b() {
        if (this.i || this.u) {
            d(false);
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, long j, int i2) {
        sg.bigo.ads.cp.a aVar = this.e;
        sg.bigo.ads.da.b.a(aVar, aVar != null ? aVar.aS() : "", i, j, i2);
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void a(int i, String str, int i2) {
        sg.bigo.ads.cp.a aVar = this.e;
        sg.bigo.ads.da.b.a(aVar, aVar != null ? aVar.aS() : "", i, str, i2);
    }

    @Override // sg.bigo.ads.cz.c.a
    public final void a(MediaPlayer mediaPlayer, int i) {
        sg.bigo.ads.bh.d.a(this.x);
        y();
        z();
        boolean z = this.j == 0 && this.k == 0;
        this.j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.k = videoHeight;
        if (this.L || (z && this.j > 0 && videoHeight > 0)) {
            g gVar = this.l;
            gVar.a = this.j;
            gVar.b = videoHeight;
            gVar.requestLayout();
        }
        new HashMap();
        if (this.H > 0) {
            a(10, SystemClock.elapsedRealtime() - this.H, i);
            this.H = 0L;
        }
        if (this.K) {
            b(18);
        }
        if (this.z || w()) {
            this.z = false;
            b();
        } else {
            if (this.i || this.u) {
                return;
            }
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t) {
        if (t == 0) {
            return;
        }
        if (this.m == null) {
            AdImageView adImageView = new AdImageView(this.c);
            this.m = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        v.a(this.m, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z = false;
        if (t instanceof String) {
            String str = (String) t;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.m.setVisibility(0);
            AdImageView adImageView2 = this.m;
            sg.bigo.ads.cp.a aVar = this.e;
            if (aVar != null && aVar.am()) {
                z = true;
            }
            adImageView2.a(str, z);
            return;
        }
        if (t instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) t;
            this.m.setVisibility(0);
            this.m.setImageBitmap(bitmap);
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.l.a = bitmap.getWidth();
            this.l.b = bitmap.getHeight();
            this.l.requestLayout();
        }
    }

    @Override // sg.bigo.ads.cz.f
    public final void a(boolean z) {
        super.a(z);
        this.i = false;
        if (!this.q.e) {
            sg.bigo.ads.bn.a.a("VideoPlayView", "incorrect status, the player is not prepared".concat(z ? " wating to play" : ", start ad failed"));
            this.z = z;
            int i = this.a;
            if (i < 8) {
                int i2 = i + 1;
                this.a = i2;
                if (i2 == 8) {
                    sg.bigo.ads.da.b.a(this.e, Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, 10107, "Not prepared, src path = " + this.n);
                    return;
                }
                return;
            }
            return;
        }
        if (!sg.bigo.ads.bz.b.a(getContext().getApplicationContext())) {
            sg.bigo.ads.bn.a.a("VideoPlayView", "screen is off, start ad cancel");
            return;
        }
        if (this.q.a()) {
            this.F = getAdDuration();
            sg.bigo.ads.cp.a aVar = this.e;
            if (aVar != null) {
                aVar.k(0);
            }
        }
        AdImageView adImageView = this.m;
        if (adImageView != null) {
            adImageView.setVisibility(8);
        }
        this.h.setVisibility(8);
        d(true);
    }

    @Override // sg.bigo.ads.cz.c.a
    public final boolean a(int i) {
        if (i == 3) {
            AdImageView adImageView = this.m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.cz.c.a
    public final boolean a(int i, int i2) {
        if (i == 100) {
            this.q.e();
            this.q = new c();
        }
        sg.bigo.ads.bn.a.a(2, "VideoPlayView", "An error occurred during the video playback: ".concat(String.valueOf(i)));
        a("AdError", new int[]{i, i2});
        if (i == -38) {
            sg.bigo.ads.bn.a.a(0, "VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.r);
            this.q.a(this.n);
            return true;
        }
        StringBuilder b = ji.b(i, "onError code = ", ", now reset status and init again.Range=");
        b.append(this.r);
        sg.bigo.ads.bn.a.a(0, "VideoPlayView", b.toString());
        if (this.q.c() != 0) {
            return true;
        }
        c cVar = this.q;
        if (cVar.i >= 3) {
            return true;
        }
        cVar.b(15);
        return true;
    }
}
