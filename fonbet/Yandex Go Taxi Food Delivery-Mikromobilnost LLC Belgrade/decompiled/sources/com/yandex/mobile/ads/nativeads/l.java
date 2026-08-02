package com.yandex.mobile.ads.nativeads;

import android.widget.TextView;
import defpackage.pk61;
import defpackage.xg81;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class l {
    public static xg81 a(NativeAdViewBinder nativeAdViewBinder) {
        pk61 pk61Var = new pk61(nativeAdViewBinder.getNativeAdView());
        TextView ageView = nativeAdViewBinder.getAgeView();
        LinkedHashMap linkedHashMap = pk61Var.d;
        linkedHashMap.put("age", ageView);
        linkedHashMap.put("body", nativeAdViewBinder.getBodyView());
        linkedHashMap.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        linkedHashMap.put("domain", nativeAdViewBinder.getDomainView());
        linkedHashMap.put("favicon", nativeAdViewBinder.getFaviconView());
        linkedHashMap.put("feedback", nativeAdViewBinder.getFeedbackView());
        linkedHashMap.put("icon", nativeAdViewBinder.getIconView());
        linkedHashMap.put("media", nativeAdViewBinder.getMediaView());
        linkedHashMap.put("price", nativeAdViewBinder.getPriceView());
        linkedHashMap.put("rating", nativeAdViewBinder.getRatingView());
        linkedHashMap.put("review_count", nativeAdViewBinder.getReviewCountView());
        linkedHashMap.put("sponsored", nativeAdViewBinder.getSponsoredView());
        linkedHashMap.put("title", nativeAdViewBinder.getTitleView());
        linkedHashMap.put("warning", nativeAdViewBinder.getWarningView());
        return new xg81(pk61Var);
    }
}
