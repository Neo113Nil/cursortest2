package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.NativeVideoPlaybackError;
import com.vungle.ads.R;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import xsna.epx;
import xsna.i3u;
import xsna.kh10;
import xsna.l44;
import xsna.pn00;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class n extends e implements com.vungle.ads.nativead.a, com.vungle.ads.nativead.b, v {
    public d d;
    public ImageView e;
    public WeakReference f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final n2 m;
    public final w n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final m q;

    public n(Context context, r1 r1Var) {
        super(context, r1Var);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new n2(Sdk.SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS);
        this.n = new w();
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        this.q = new m(this);
    }

    public final void b() {
        this.m.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.m, getInternal().m, 4);
    }

    public int getCurrentTime() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.getCurrentPositionMs();
        }
        return 0;
    }

    public int getDuration() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.getDurationMs();
        }
        return 0;
    }

    public final d getVideoView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object failure;
        super.onAttachedToWindow();
        try {
            if (!this.o.getAndSet(true)) {
                boolean z = u.a;
                t.a("NativeAd-VideoContentView", "registerReceiver()");
                this.p.set(false);
                this.n.a(this);
                getContext().registerReceiver(this.n, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-VideoContentView", "registerReceiver", a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object failure;
        super.onDetachedFromWindow();
        try {
            if (this.o.getAndSet(false)) {
                boolean z = u.a;
                t.a("NativeAd-VideoContentView", "unregisterReceiver()");
                this.n.a(null);
                getContext().unregisterReceiver(this.n);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-VideoContentView", "unregisterReceiver", a);
        }
    }

    public final void setVideoView(d dVar) {
        this.d = dVar;
    }

    public static final void a(n nVar, View view) {
        d dVar = nVar.d;
        if (dVar != null) {
            boolean z = dVar.o;
            dVar.setMuted(!z);
            if (z) {
                ImageView imageView = nVar.e;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.liftoff_icon_unmute);
                    return;
                }
                return;
            }
            ImageView imageView2 = nVar.e;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.liftoff_icon_mute);
            }
        }
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public final void a(Context context) {
        Activity activity;
        boolean z = u.a;
        t.a("NativeAd-VideoContentView", "initView");
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(8);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(this.q);
        boolean u = getInternal().u();
        t.a("NativeAd-VideoContentView", "startMuted=" + u);
        d dVar2 = new d(context);
        this.d = dVar2;
        dVar2.setMuted(u);
        d dVar3 = this.d;
        if (dVar3 != null) {
            dVar3.setLooping(false);
        }
        d dVar4 = this.d;
        if (dVar4 != null) {
            dVar4.m();
        }
        d dVar5 = this.d;
        if (dVar5 != null) {
            dVar5.setVideoLifecycleCallback(this);
        }
        d dVar6 = this.d;
        if (dVar6 != null) {
            dVar6.setVideoTransformCallback$vungle_ads_release(new i3u(this, 29));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        d dVar7 = this.d;
        if (dVar7 != null) {
            dVar7.setLayoutParams(layoutParams);
        }
        addView(this.d);
        this.e = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5);
        layoutParams2.addRule(6);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setClickable(true);
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new l44(this, 16));
        }
        if (u) {
            ImageView imageView4 = this.e;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.liftoff_icon_mute);
            }
        } else {
            ImageView imageView5 = this.e;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.liftoff_icon_unmute);
            }
        }
        addView(this.e);
        ImageView imageView6 = this.e;
        if (imageView6 != null) {
            imageView6.bringToFront();
        }
        requestLayout();
        Object obj = null;
        try {
            if (!(context instanceof Activity)) {
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            } else {
                activity = (Activity) context;
            }
            if (activity != null) {
                this.f = new WeakReference(activity);
            }
            boolean z2 = u.a;
            StringBuilder sb = new StringBuilder();
            sb.append("adActivity=");
            WeakReference weakReference = this.f;
            sb.append(weakReference != null ? (Activity) weakReference.get() : null);
            t.a("NativeAd-VideoContentView", sb.toString());
        } catch (Throwable unused) {
        }
        this.m.e();
        try {
            Uri parse = Uri.parse(getInternal().o());
            d dVar8 = this.d;
            if (dVar8 != null) {
                dVar8.setSource(parse);
            }
            d dVar9 = this.d;
            if (dVar9 != null) {
                dVar9.i();
                obj = s3q0.a;
            }
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            a(String.valueOf(a.getLocalizedMessage()), -2);
        }
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    public static final void a(n nVar, float f, float f2) {
        ImageView imageView = nVar.e;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        ImageView imageView2 = nVar.e;
        if (imageView2 == null) {
            return;
        }
        imageView2.setTranslationY(f2);
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        d dVar;
        d dVar2 = this.d;
        Boolean valueOf = dVar2 != null ? Boolean.valueOf(dVar2.o) : null;
        boolean z2 = u.a;
        t.a("NativeAd-VideoContentView", "silentModeEnabled=" + z + " currentIsMuted=" + valueOf);
        if (!this.p.getAndSet(true) || valueOf == null || Boolean.valueOf(z).equals(valueOf) || (dVar = this.d) == null) {
            return;
        }
        boolean z3 = dVar.o;
        dVar.setMuted(!z3);
        if (!z3) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.liftoff_icon_mute);
                return;
            }
            return;
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.liftoff_icon_unmute);
        }
    }

    public final void a(int i) {
        if (1 <= i && i < 25) {
            if (this.g.compareAndSet(false, true)) {
                int duration = getDuration();
                Pair pair = new Pair("OM_KEY_DURATION", Integer.valueOf(duration));
                d dVar = this.d;
                Map k = pn00.k(pair, new Pair("OM_KEY_VOLUME", Integer.valueOf(!epx.f(dVar != null ? Boolean.valueOf(dVar.o) : null, Boolean.TRUE) ? 1 : 0)));
                getInternal().a(String.valueOf(duration));
                getInternal().a(4, k);
                return;
            }
            return;
        }
        if (25 <= i && i < 50) {
            if (this.h.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.25");
                getInternal().a(5, (Map) null);
                return;
            }
            return;
        }
        if (50 <= i && i < 75) {
            if (this.i.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.50");
                getInternal().a(6, (Map) null);
                return;
            }
            return;
        }
        if (75 <= i && i < 100) {
            if (this.j.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.75");
                getInternal().a(7, (Map) null);
                return;
            }
            return;
        }
        if (i < 100 || !this.k.compareAndSet(false, true)) {
            return;
        }
        r1.a(getInternal(), "checkpoint.100");
    }

    public final void a(String str, int i) {
        if (this.l.getAndSet(true)) {
            return;
        }
        super.a(getContext());
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        StringBuilder a = kh10.a(i, "w=", " e=", str, " url=");
        a.append(getInternal().p());
        new NativeVideoPlaybackError(a.toString()).setLogEntry$vungle_ads_release(getInternal().e()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public final void a() {
        Object failure;
        boolean z = u.a;
        t.a("NativeAd-VideoContentView", "destroy()");
        try {
            if (this.o.getAndSet(false)) {
                t.a("NativeAd-VideoContentView", "unregisterReceiver()");
                this.n.a(null);
                getContext().unregisterReceiver(this.n);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-VideoContentView", "unregisterReceiver", a);
        }
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f = null;
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.q);
        d dVar2 = this.d;
        if (dVar2 != null) {
            dVar2.l();
        }
        this.d = null;
        super.a();
    }
}
