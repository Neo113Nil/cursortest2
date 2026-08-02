package com.vungle.ads.internal;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.NativeAd$adPlayCallback$1;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import xsna.arm0;
import xsna.bpn0;
import xsna.drm0;
import xsna.epx;
import xsna.msy;
import xsna.pnb;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class r1 extends s implements com.vungle.ads.internal.presenter.x {
    public final View.OnTouchListener A;
    public final Lazy q;
    public final AtomicBoolean r;
    public final Lazy s;
    public com.vungle.ads.internal.presenter.w t;
    public LinkedHashMap u;
    public final Lazy v;
    public final Lazy w;
    public float x;
    public final Lazy y;
    public com.vungle.ads.internal.ui.a0 z;

    public r1(Context context) {
        super(context);
        this.q = new bpn0(new l1(context));
        this.r = new AtomicBoolean(false);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.s = msy.a(lazyThreadSafetyMode, new o1(context));
        this.v = msy.a(lazyThreadSafetyMode, new p1(context));
        this.w = new bpn0(new k1(this));
        this.y = new bpn0(q1.a);
        this.A = new pnb(this, 2);
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public final void c(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_ICON_URL")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new j1(imageView));
    }

    @Override // com.vungle.ads.internal.s
    public final InvalidAdStateError j() {
        if (this.b == h.c || i()) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.b + " can not play native ad.");
    }

    public final Double m() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_RATING_VALUE")) == null) {
            return null;
        }
        return arm0.k(str);
    }

    public final f1 n() {
        return (f1) this.q.getValue();
    }

    public final String o() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final String p() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("ORIGINAL_VIDEO_URL")) == null) ? "" : str;
    }

    public final String q() {
        i3 i3Var = this.d;
        if (i3Var != null) {
            return i3Var.a;
        }
        return null;
    }

    public final NativeVideoOptions r() {
        return (NativeVideoOptions) this.y.getValue();
    }

    public final boolean s() {
        return o().length() > 0;
    }

    public final boolean t() {
        return s();
    }

    public final boolean u() {
        boolean booleanValue;
        String str;
        Boolean o0;
        if (!((com.vungle.ads.internal.platform.c) ((com.vungle.ads.internal.platform.f) this.s.getValue())).o()) {
            Boolean startMuted = r().getStartMuted();
            if (startMuted != null) {
                booleanValue = startMuted.booleanValue();
            } else {
                LinkedHashMap linkedHashMap = this.u;
                booleanValue = (linkedHashMap == null || (str = (String) linkedHashMap.get("START_MUTED")) == null || (o0 = drm0.o0(str)) == null) ? true : o0.booleanValue();
            }
            if (!booleanValue) {
                return false;
            }
        }
        return true;
    }

    public final void v() {
        String str;
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_URL")) == null) {
                str = "";
            }
            wVar.a("openPrivacy", (String) null, str);
        }
    }

    public final void w() {
        String str;
        a(8, (Map) null);
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void a(String str) {
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            wVar.a("tpat", "video.length", str);
        }
    }

    public final void b(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new j1(imageView));
    }

    public static final com.vungle.ads.internal.executor.a a(r1 r1Var) {
        return (com.vungle.ads.internal.executor.a) r1Var.v.getValue();
    }

    public static final boolean a(r1 r1Var, View view, MotionEvent motionEvent) {
        com.vungle.ads.internal.presenter.w wVar = r1Var.t;
        if (wVar == null) {
            return false;
        }
        wVar.a(motionEvent);
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final void b(com.vungle.ads.internal.model.h0 h0Var) {
        String str;
        Object failure;
        Throwable a;
        Object failure2;
        Integer m;
        Integer m2;
        this.u = h0Var.s();
        com.vungle.ads.internal.util.s e = e();
        Long a2 = e != null ? e.a() : null;
        if ((a2 != null && a2.longValue() == 3) || (a2 != null && a2.longValue() == 4)) {
            l();
        }
        if (s()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(d(), Uri.parse(o()));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                int i = 0;
                int intValue = (extractMetadata == null || (m2 = arm0.m(10, extractMetadata)) == null) ? 0 : m2.intValue();
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null && (m = arm0.m(10, extractMetadata2)) != null) {
                    i = m.intValue();
                }
                if (intValue > 0 && i > 0) {
                    this.x = intValue / i;
                }
                try {
                    mediaMetadataRetriever.release();
                    failure2 = s3q0.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                a = Result.a(failure2);
                if (a == null) {
                    return;
                }
            } catch (Throwable th2) {
                try {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.b("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                    try {
                        mediaMetadataRetriever.release();
                        failure = s3q0.a;
                    } catch (Throwable th3) {
                        failure = new Result.Failure(th3);
                    }
                    a = Result.a(failure);
                    if (a == null) {
                        return;
                    }
                } finally {
                }
            }
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("NativeAdInternal", "Failed to release metadata retriever", a);
            return;
        }
        com.vungle.ads.internal.util.p pVar = (com.vungle.ads.internal.util.p) this.w.getValue();
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        n1 n1Var = new n1(this);
        pVar.getClass();
        com.vungle.ads.internal.util.p.a(str, n1Var);
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 i3Var) {
        return i3Var.i();
    }

    public final void a(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new j1(imageView));
    }

    public final void a(int i, Map map) {
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            wVar.a(i, map);
        }
    }

    public static void a(r1 r1Var, String str) {
        r1Var.getClass();
        com.vungle.ads.internal.presenter.w wVar = r1Var.t;
        if (wVar != null) {
            wVar.a("tpat", str, (String) null);
        }
    }

    public final void a(ViewGroup viewGroup, String str) {
        if (str == null) {
            return;
        }
        if (this.z == null) {
            this.z = new com.vungle.ads.internal.ui.a0(viewGroup.getContext(), str);
        }
        com.vungle.ads.internal.ui.a0 a0Var = this.z;
        if (a0Var == null || epx.f(a0Var.getParent(), viewGroup)) {
            return;
        }
        ViewParent parent = a0Var.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(a0Var);
        }
        viewGroup.addView(a0Var);
        a0Var.bringToFront();
    }

    public final void a(View view, NativeAd$adPlayCallback$1 nativeAd$adPlayCallback$1) {
        String str;
        com.vungle.ads.internal.model.h0 c = c();
        if (c == null) {
            VungleError logError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release();
            if (nativeAd$adPlayCallback$1 != null) {
                nativeAd$adPlayCallback$1.onFailure(logError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.t == null) {
            com.vungle.ads.internal.presenter.w wVar = new com.vungle.ads.internal.presenter.w(d(), this, c, (com.vungle.ads.internal.platform.f) this.s.getValue());
            this.t = wVar;
            wVar.a(new com.vungle.ads.internal.presenter.a(nativeAd$adPlayCallback$1, f()));
        }
        com.vungle.ads.internal.presenter.w wVar2 = this.t;
        if (wVar2 != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("OM_SDK_DATA")) == null) {
                str = "";
            }
            wVar2.a(view, str);
        }
        n().a(view, new m1(this));
        com.vungle.ads.internal.presenter.w wVar3 = this.t;
        if (wVar3 != null) {
            wVar3.c();
        }
    }

    public final void a(View view) {
        com.vungle.ads.internal.model.h0 c = c();
        if (c == null || !c.z()) {
            return;
        }
        view.setOnTouchListener(this.A);
    }
}
