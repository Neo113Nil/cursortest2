package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.ozl;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class NativeAdViewBinder {
    private final View a;
    private final Map b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, zcl zclVar) {
        this(view, map);
    }

    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public Map<String, View> getAssetViews() {
        return this.b;
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
        View view = getAssetViews().get(X3.j.D);
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
        View view = getAssetViews().get(X3.i.I0);
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    public final View getNativeAdView() {
        return this.a;
    }

    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public View getRatingView() {
        return getAssetViews().get(CampaignEx.JSON_KEY_STAR);
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

    private NativeAdViewBinder(View view, Map map) {
        this.a = view;
        this.b = map;
    }

    public static final class Builder {
        private final View a;
        private final LinkedHashMap b;

        @ozl
        public Builder(View view) {
            this.a = view;
            this.b = new LinkedHashMap();
        }

        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.a, this.b, null);
        }

        public final Builder setAgeView(TextView textView) {
            this.b.put("age", textView);
            return this;
        }

        public final Builder setCallToActionView(TextView textView) {
            this.b.put("call_to_action", textView);
            return this;
        }

        public final Builder setDomainView(TextView textView) {
            this.b.put(X3.j.D, textView);
            return this;
        }

        public final Builder setFaviconView(ImageView imageView) {
            this.b.put("favicon", imageView);
            return this;
        }

        public final Builder setFeedbackView(ImageView imageView) {
            this.b.put("feedback", imageView);
            return this;
        }

        public final Builder setIconView(ImageView imageView) {
            this.b.put("icon", imageView);
            return this;
        }

        public final Builder setMediaView(MediaView mediaView) {
            this.b.put(X3.i.I0, mediaView);
            return this;
        }

        public final Builder setPriceView(TextView textView) {
            this.b.put("price", textView);
            return this;
        }

        public final Builder setSponsoredView(TextView textView) {
            this.b.put("sponsored", textView);
            return this;
        }

        public final Builder setTitleView(TextView textView) {
            this.b.put("title", textView);
            return this;
        }

        public final Builder setWarningView(TextView textView) {
            this.b.put("warning", textView);
            return this;
        }

        public Builder(NativeAdView nativeAdView) {
            this((View) nativeAdView);
        }
    }
}
