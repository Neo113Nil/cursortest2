package xsna;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.ads.analytics.NativeAdType;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vkontakte.android.R;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.e3m;
import xsna.j5y0;
import xsna.k5y0;
import xsna.l5y0;

/* compiled from: YandexNativeAdHolder.kt */
/* loaded from: classes4.dex */
public final class b5y0 extends rp6<j5y0, YandexNativeAdEntry> implements View.OnClickListener {
    public final NativeAdUserLevelAnalyticsSender E;
    public final FrameLayout F;
    public final Object G;
    public final Drawable H;
    public ValueAnimator I;
    public final Object J;
    public final k5y0 K;

    /* compiled from: YandexNativeAdHolder.kt */
    public static final class b implements a5y0 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.a5y0
        public final void a() {
            Integer num;
            b5y0 b5y0Var = b5y0.this;
            YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) b5y0Var.q6();
            if (yandexNativeAdEntry == null || (num = yandexNativeAdEntry.l) == null) {
                return;
            }
            int intValue = num.intValue();
            NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender = b5y0Var.E;
            NewsEntry.TrackData trackData = yandexNativeAdEntry.m;
            nativeAdUserLevelAnalyticsSender.c(new fv50(NativeAdType.YANDEX, intValue, trackData != null ? trackData.b : null, trackData != null ? trackData.c : -1), new av50(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.a5y0
        public final void b(String str, String str2, String str3) {
            Integer num;
            b5y0 b5y0Var = b5y0.this;
            YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) b5y0Var.q6();
            if (yandexNativeAdEntry == null || (num = yandexNativeAdEntry.l) == null) {
                return;
            }
            int intValue = num.intValue();
            String uuid = str3 != null ? UUID.nameUUIDFromBytes(str3.getBytes(emb.b)).toString() : null;
            NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender = b5y0Var.E;
            NewsEntry.TrackData trackData = yandexNativeAdEntry.m;
            nativeAdUserLevelAnalyticsSender.b(new fv50(NativeAdType.YANDEX, intValue, trackData != null ? trackData.b : null, trackData != null ? trackData.c : -1), new av50(str2 != null ? Double.parseDouble(str2) : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, str, uuid, null), NativeAdUserLevelAnalyticsSender.ShowAttributionCondition.PAYED);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5y0(ViewGroup viewGroup, k5y0.a aVar, NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender, p870 p870Var, h170 h170Var) {
        super(r0, viewGroup);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.E = nativeAdUserLevelAnalyticsSender;
        FrameLayout frameLayout2 = (FrameLayout) this.itemView;
        this.F = frameLayout2;
        k7x k7xVar = new k7x(this, p870Var, h170Var, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, k7xVar);
        this.G = a2;
        Context context = this.itemView.getContext();
        e3m.a aVar2 = e3m.a;
        this.H = m33.a(R.drawable.vk_icon_chevron_right_20, context);
        this.J = msy.a(lazyThreadSafetyMode, new iri0(this, 28));
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.yandex_native_ad, (ViewGroup) frameLayout2, false);
        l5y0.a a3 = aVar.a(this.itemView.getContext());
        a3.b = frameLayout2;
        a3.c = (ViewGroup) inflate.findViewById(R.id.native_ad_container);
        a3.d = (ViewGroup) inflate.findViewById(R.id.yandex_native_ad_media_holder);
        a3.l = (TextView) inflate.findViewById(R.id.yandex_native_ad_title);
        a3.g = (TextView) inflate.findViewById(R.id.yandex_native_ad_advertiser);
        a3.e = (TextView) inflate.findViewById(R.id.yandex_native_ad_advertiser);
        a3.i = (ImageView) inflate.findViewById(R.id.yandex_native_ad_fake_options);
        a3.j = (ImageView) inflate.findViewById(R.id.yandex_native_ad_icon);
        a3.h = (ImageView) inflate.findViewById(R.id.yandex_native_ad_icon);
        a3.f = (TextView) inflate.findViewById(R.id.yandex_native_ad_cta_button);
        a3.g = (TextView) inflate.findViewById(R.id.yandex_native_ad_advertiser);
        a3.m = (TextView) inflate.findViewById(R.id.yandex_native_ad_advertiser);
        a3.k = (TextView) inflate.findViewById(R.id.yandex_native_ad_advertiser);
        ViewGroup viewGroup2 = a3.b;
        ViewGroup viewGroup3 = a3.c;
        ViewGroup viewGroup4 = a3.d;
        Context context2 = a3.a;
        l5y0 l5y0Var = null;
        if (viewGroup2 != null && viewGroup3 != null && viewGroup4 != null && context2 != null) {
            NativeAdView nativeAdView = new NativeAdView(context2);
            nativeAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            nativeAdView.addView(viewGroup3);
            MediaView mediaView = new MediaView(context2);
            viewGroup4.addView(mediaView);
            viewGroup2.addView(nativeAdView, 0);
            l5y0Var = new l5y0(new NativeAdViewBinder.Builder(nativeAdView).setAgeView(a3.e).setCallToActionView(a3.f).setDomainView(a3.g).setFaviconView(a3.h).setFeedbackView(a3.i).setIconView(a3.j).setMediaView(mediaView).setPriceView(null).setSponsoredView(a3.k).setTitleView(a3.l).setWarningView(a3.m).build());
        }
        this.K = l5y0Var;
        ((FrameLayout) frameLayout2.findViewById(R.id.yandex_native_ad_body_text_container)).addView(((yno0) a2.getValue()).itemView);
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(j5y0 j5y0Var) {
        j5y0 j5y0Var2 = j5y0Var;
        k5y0 k5y0Var = this.K;
        if (k5y0Var != null) {
            k5y0Var.b(j5y0Var2.h, (b) this.J.getValue());
        }
        FrameLayout frameLayout = this.F;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.yandex_native_ad_icon);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(hav0.a);
        ((TextView) frameLayout.findViewById(R.id.yandex_native_ad_advertiser)).setText((CharSequence) j5y0Var2.j);
        j5y0.a aVar = j5y0Var2.k;
        b7().setText(aVar.a());
        boolean z = aVar instanceof j5y0.a.b;
        Drawable drawable = this.H;
        if (z) {
            Button b7 = b7();
            j5y0.a.b bVar = (j5y0.a.b) aVar;
            int i = bVar.c;
            b7.setTextColor(i);
            b7().setBackgroundColor(bVar.b);
            his0.u(b7(), drawable, ColorStateList.valueOf(i));
        } else {
            if (!(aVar instanceof j5y0.a.C3107a)) {
                throw new NoWhenBranchMatchedException();
            }
            Button b72 = b7();
            j5y0.a.C3107a c3107a = (j5y0.a.C3107a) aVar;
            int i2 = c3107a.b;
            int i3 = c3107a.d;
            b72.setTextColor(i3);
            b7().setBackgroundColor(i2);
            his0.u(b7(), drawable, ColorStateList.valueOf(i3));
            int i4 = c3107a.c;
            int i5 = c3107a.e;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i4));
            ofObject.setDuration(300L);
            ofObject.setInterpolator(new LinearInterpolator());
            ofObject.setStartDelay(1500L);
            ofObject.addUpdateListener(new l0f0(this, 1));
            ofObject.addListener(new c5y0(this, i5));
            ofObject.start();
            this.I = ofObject;
        }
        ((ImageView) frameLayout.findViewById(R.id.yandex_native_ad_options)).setImageDrawable(m33.a(R.drawable.vk_icon_more_vertical_24, this.itemView.getContext()));
        ImageView imageView2 = (ImageView) frameLayout.findViewById(R.id.yandex_native_ad_options);
        bwt0.p0(imageView2, A6());
        imageView2.setOnClickListener(this);
        Integer num = j5y0Var2.m;
        if (num != null) {
            ((VkImageSimple) frameLayout.findViewById(R.id.yandex_native_ad_disclaimer)).setVisibility(0);
            ((VkImageSimple) frameLayout.findViewById(R.id.yandex_native_ad_disclaimer)).setImageResource(num.intValue());
        } else {
            f4m.j((VkImageSimple) frameLayout.findViewById(R.id.yandex_native_ad_disclaimer));
        }
        ((yno0) this.G.getValue()).a6(j5y0Var2.n);
    }

    public final Button b7() {
        return (Button) this.F.findViewById(R.id.yandex_native_ad_cta_button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!bwt0.b() && epx.f(view, (ImageView) this.F.findViewById(R.id.yandex_native_ad_options))) {
            G6(view);
        }
    }

    /* compiled from: YandexNativeAdHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            z4y0 z4y0Var;
            k5y0 k5y0Var;
            b5y0 b5y0Var = b5y0.this;
            j5y0 j5y0Var = (j5y0) b5y0Var.C;
            if (j5y0Var == null || (z4y0Var = j5y0Var.h) == null || (k5y0Var = b5y0Var.K) == null) {
                return;
            }
            k5y0Var.a(z4y0Var);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
