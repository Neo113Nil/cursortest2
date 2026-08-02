package com.vungle.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.platform.c;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.w;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.e;
import com.vungle.ads.internal.ui.view.l;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.epx;
import xsna.gmp;
import xsna.gzs;
import xsna.mo3;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final Companion Companion = new Companion(null);
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    public final n2 A;
    public final AtomicBoolean B;
    public final NativeAd$adPlayCallback$1 C;
    public ImageView s;
    public MediaView t;
    public FrameLayout u;
    public Collection v;
    public l w;
    public int x;
    public final r1 y;
    public int z;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdOptionsPosition {
    }

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    public NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.x = 1;
        this.y = (r1) getAdInternal$vungle_ads_release();
        this.A = new n2(Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.B = new AtomicBoolean(false);
        this.C = new b() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(String str2) {
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getDisplayToClickMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric$vungle_ads_release = NativeAd.this.getDisplayToClickMetric$vungle_ads_release();
                analyticsClient.a(displayToClickMetric$vungle_ads_release, NativeAd.this.getLogEntry$vungle_ads_release(), displayToClickMetric$vungle_ads_release.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(String str2) {
                if (NativeAd.this.getAdInternal$vungle_ads_release().i()) {
                    NativeAd.this.getAdInternal$vungle_ads_release().a(h.c);
                }
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getShowToCloseMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 showToCloseMetric$vungle_ads_release = NativeAd.this.getShowToCloseMetric$vungle_ads_release();
                analyticsClient.a(showToCloseMetric$vungle_ads_release, NativeAd.this.getLogEntry$vungle_ads_release(), showToCloseMetric$vungle_ads_release.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(String str2) {
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.e);
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getPresentToDisplayMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric$vungle_ads_release = NativeAd.this.getPresentToDisplayMetric$vungle_ads_release();
                analyticsClient.a(presentToDisplayMetric$vungle_ads_release, NativeAd.this.getLogEntry$vungle_ads_release(), presentToDisplayMetric$vungle_ads_release.b);
                NativeAd.this.getDisplayToClickMetric$vungle_ads_release().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(String str2) {
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(NativeAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, NativeAd.this.getLeaveApplicationMetric$vungle_ads_release(), NativeAd.this.getLogEntry$vungle_ads_release(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(String str2) {
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.d);
                j signalManager$vungle_ads_release = NativeAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                NativeAd.this.getAdInternal$vungle_ads_release().l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 t1Var = NativeAd.this.getAdInternal$vungle_ads_release().l;
                analyticsClient.a(t1Var, NativeAd.this.getLogEntry$vungle_ads_release(), t1Var.b);
                NativeAd.this.getPresentToDisplayMetric$vungle_ads_release().e();
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(NativeAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(final VungleError vungleError) {
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.g);
                Handler handler = y.a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(NativeAd.this, vungleError);
                        }
                    }
                });
                NativeAd.this.getShowToFailMetric$vungle_ads_release().d();
                AnalyticsClient.INSTANCE.a(NativeAd.this.getShowToFailMetric$vungle_ads_release(), NativeAd.this.getLogEntry$vungle_ads_release(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(String str2) {
            }
        };
    }

    public static final void a(NativeAd nativeAd, View view) {
        nativeAd.y.v();
    }

    public static final void b(NativeAd nativeAd, View view) {
        nativeAd.y.w();
    }

    public final String getAdBodyText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_DESCRIPTION")) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_TEXT")) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.x;
    }

    public final String getAdSponsoredText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("SPONSORED_BY")) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        return this.y.m();
    }

    public final String getAdTitle() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_NAME")) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.y.x;
    }

    public final MediaView getMediaView() {
        return this.t;
    }

    public final n2 getNativeDisplayDurationMetric$vungle_ads_release() {
        return this.A;
    }

    public final NativeVideoOptions getVideoOptions() {
        return this.y.r();
    }

    public final boolean hasCallToAction() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
            str = "";
        }
        return str.length() > 0;
    }

    public final boolean hasVideoContent() {
        return this.y.s();
    }

    public final void performCTA() {
        String str;
        r1 r1Var = this.y;
        w wVar = r1Var.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = r1Var.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void registerViewForInteraction(FrameLayout frameLayout, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) {
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("registerViewForInteraction ");
        a.append(hashCode());
        t.c("NativeAd", a.toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), 4);
        this.z++;
        this.A.e();
        getResponseToShowMetric$vungle_ads_release().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release());
        getAdInternal$vungle_ads_release().g().e();
        getShowToFailMetric$vungle_ads_release().e();
        getShowToCloseMetric$vungle_ads_release().e();
        if (getAdInternal$vungle_ads_release().i()) {
            if (epx.f(this.u, frameLayout)) {
                t.a("NativeAd", "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.B.set(false);
        VungleError a2 = getAdInternal$vungle_ads_release().a(true);
        if (a2 != null) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("registerViewForInteraction can NOT play. ");
            a3.append(hashCode());
            a3.append(' ');
            a3.append(a2);
            t.c("NativeAd", a3.toString());
            if (getAdInternal$vungle_ads_release().a(a2.getCode())) {
                getAdInternal$vungle_ads_release().a(h.g);
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, a2);
                return;
            }
            return;
        }
        this.u = frameLayout;
        this.t = mediaView;
        this.s = imageView;
        this.v = collection;
        this.y.a(frameLayout, this.C);
        if (this.w == null) {
            this.w = new l(getContext());
        }
        l lVar = this.w;
        if (lVar != null) {
            lVar.setOnClickListener(new mo3(this, 12));
        }
        if (collection == null) {
            collection = Collections.singletonList(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new gmp(this, 6));
        }
        l lVar2 = this.w;
        if (lVar2 != null) {
            lVar2.a(frameLayout, this.x);
        }
        this.y.a(mediaView);
        mediaView.a(this.y);
        this.y.a(imageView);
        r1 r1Var = this.y;
        l lVar3 = this.w;
        r1Var.c(lVar3 != null ? lVar3.getPrivacyIcon$vungle_ads_release() : null);
        this.y.a(frameLayout, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().g(), getLogEntry$vungle_ads_release());
        getAdInternal$vungle_ads_release().h().e();
    }

    public final void setAdOptionsPosition(int i) {
        this.x = i;
    }

    public final void unregisterView() {
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("unregisterView  ");
        a.append(hashCode());
        t.c("NativeAd", a.toString());
        if (this.B.getAndSet(true)) {
            return;
        }
        this.A.d();
        this.A.b = String.valueOf(this.z);
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.A, getLogEntry$vungle_ads_release(), 4);
        Collection collection = this.v;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.v = null;
        this.u = null;
        MediaView mediaView = this.t;
        if (mediaView != null) {
            mediaView.setOnClickListener(null);
            mediaView.setOnTouchListener(null);
            mediaView.removeAllViews();
            e eVar = mediaView.b;
            if (eVar != null) {
                eVar.a();
            }
            mediaView.b = null;
        }
        this.t = null;
        l lVar = this.w;
        if (lVar != null) {
            lVar.a();
        }
        this.w = null;
        r1 r1Var = this.y;
        a0 a0Var = r1Var.z;
        if (a0Var != null) {
            ViewParent parent = a0Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(a0Var);
            }
        }
        r1Var.z = null;
        r1Var.n().a();
        w wVar = r1Var.t;
        if (wVar != null) {
            com.vungle.ads.internal.omsdk.b bVar = wVar.n;
            if (bVar != null) {
                AdSession adSession = bVar.b;
                if (adSession != null) {
                    adSession.finish();
                }
                bVar.b = null;
                bVar.c = null;
                bVar.d = null;
            }
            AlertDialog alertDialog = wVar.h;
            if (alertDialog != null && alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            Long l = wVar.e;
            if (l != null) {
                List b = wVar.c.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((c) wVar.d).k()));
                if (b != null) {
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        p pVar = new p((String) it2.next());
                        pVar.i = "ad.close";
                        pVar.j = wVar.a();
                        wVar.b().a(pVar.a(), false);
                    }
                }
            }
            a aVar = wVar.f;
            if (aVar != null) {
                aVar.a(TtmlNode.END, null, ((r1) wVar.b).q());
            }
        }
        try {
            ImageView imageView = this.s;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            boolean z2 = u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            a2.append(e.getLocalizedMessage());
            t.c("NativeAd", a2.toString());
        }
        ImageView imageView2 = this.s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.s = null;
    }

    @Override // com.vungle.ads.BaseAd
    public r1 constructAdInternal$vungle_ads_release(Context context) {
        return new r1(context);
    }

    public NativeAd(Context context, String str) {
        this(context, str, new AdConfig());
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }
}
