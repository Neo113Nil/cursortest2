package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.jxi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u00011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0016\u0010*\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0016\u0010,\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0016\u0010.\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0011R\u0016\u00100\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0011¨\u00062"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "", "Landroid/view/View;", "a", "Landroid/view/View;", "getNativeAdView", "()Landroid/view/View;", "nativeAdView", "", "", "b", "Ljava/util/Map;", "getAssetViews", "()Ljava/util/Map;", "assetViews", "Landroid/widget/TextView;", "getAgeView", "()Landroid/widget/TextView;", "ageView", "getBodyView", "bodyView", "getCallToActionView", "callToActionView", "getDomainView", "domainView", "Landroid/widget/ImageView;", "getFaviconView", "()Landroid/widget/ImageView;", "faviconView", "getFeedbackView", "feedbackView", "getIconView", "iconView", "Lcom/yandex/mobile/ads/nativeads/MediaView;", "getMediaView", "()Lcom/yandex/mobile/ads/nativeads/MediaView;", "mediaView", "getPriceView", "priceView", "getRatingView", "ratingView", "getReviewCountView", "reviewCountView", "getSponsoredView", "sponsoredView", "getTitleView", "titleView", "getWarningView", "warningView", "Builder", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NativeAdViewBinder {

    /* renamed from: a, reason: from kotlin metadata */
    private final View nativeAdView;

    /* renamed from: b, reason: from kotlin metadata */
    private final Map assetViews;

    public NativeAdViewBinder(View view, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.nativeAdView = view;
        this.assetViews = map;
    }

    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public Map<String, View> getAssetViews() {
        return this.assetViews;
    }

    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getDomainView() {
        View view = getAssetViews().get("domain");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public MediaView getMediaView() {
        View view = getAssetViews().get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    public final View getNativeAdView() {
        return this.nativeAdView;
    }

    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "", "Landroid/view/View;", "nativeAdView", "<init>", "(Landroid/view/View;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "(Lcom/yandex/mobile/ads/nativeads/NativeAdView;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "build", "()Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "Landroid/widget/TextView;", "ageView", "setAgeView", "(Landroid/widget/TextView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "bodyView", "setBodyView", "callToActionView", "setCallToActionView", "domainView", "setDomainView", "Landroid/widget/ImageView;", "faviconView", "setFaviconView", "(Landroid/widget/ImageView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "feedbackView", "setFeedbackView", "iconView", "setIconView", "Lcom/yandex/mobile/ads/nativeads/MediaView;", "mediaView", "setMediaView", "(Lcom/yandex/mobile/ads/nativeads/MediaView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "priceView", "setPriceView", "reviewCountView", "setReviewCountView", "sponsoredView", "setSponsoredView", "titleView", "setTitleView", "warningView", "setWarningView", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Builder {
        private final View a;
        private final LinkedHashMap b;

        @jxi
        public Builder(View view) {
            this.a = view;
            this.b = new LinkedHashMap();
        }

        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.a, this.b, null);
        }

        public final Builder setAgeView(TextView ageView) {
            this.b.put("age", ageView);
            return this;
        }

        public final Builder setBodyView(TextView bodyView) {
            this.b.put("body", bodyView);
            return this;
        }

        public final Builder setCallToActionView(TextView callToActionView) {
            this.b.put("call_to_action", callToActionView);
            return this;
        }

        public final Builder setDomainView(TextView domainView) {
            this.b.put("domain", domainView);
            return this;
        }

        public final Builder setFaviconView(ImageView faviconView) {
            this.b.put("favicon", faviconView);
            return this;
        }

        public final Builder setFeedbackView(ImageView feedbackView) {
            this.b.put("feedback", feedbackView);
            return this;
        }

        public final Builder setIconView(ImageView iconView) {
            this.b.put("icon", iconView);
            return this;
        }

        public final Builder setMediaView(MediaView mediaView) {
            this.b.put("media", mediaView);
            return this;
        }

        public final Builder setPriceView(TextView priceView) {
            this.b.put("price", priceView);
            return this;
        }

        public final Builder setReviewCountView(TextView reviewCountView) {
            this.b.put("review_count", reviewCountView);
            return this;
        }

        public final Builder setSponsoredView(TextView sponsoredView) {
            this.b.put("sponsored", sponsoredView);
            return this;
        }

        public final Builder setTitleView(TextView titleView) {
            this.b.put("title", titleView);
            return this;
        }

        public final Builder setWarningView(TextView warningView) {
            this.b.put("warning", warningView);
            return this;
        }

        public Builder(NativeAdView nativeAdView) {
            this((View) nativeAdView);
        }
    }
}
