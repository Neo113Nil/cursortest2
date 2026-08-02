package com.yandex.mobile.ads.nativeads;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.jgp;
import yads.r22;
import yads.r32;
import yads.s22;

/* loaded from: classes8.dex */
public final class f {
    public static s22 a(NativeAdViewBinder nativeAdViewBinder) {
        r22 r22Var = new r22(nativeAdViewBinder.getNativeAdView(), r32.c, jgp.b);
        r22Var.e.put("age", nativeAdViewBinder.getAgeView());
        r22Var.e.put("body", nativeAdViewBinder.getBodyView());
        r22Var.e.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        r22Var.e.put(X3.j.D, nativeAdViewBinder.getDomainView());
        r22Var.e.put("favicon", nativeAdViewBinder.getFaviconView());
        r22Var.e.put("feedback", nativeAdViewBinder.getFeedbackView());
        r22Var.e.put("icon", nativeAdViewBinder.getIconView());
        r22Var.e.put(X3.i.I0, nativeAdViewBinder.getMediaView());
        r22Var.e.put("price", nativeAdViewBinder.getPriceView());
        r22Var.e.put(CampaignEx.JSON_KEY_STAR, nativeAdViewBinder.getRatingView());
        r22Var.e.put("review_count", nativeAdViewBinder.getReviewCountView());
        r22Var.e.put("sponsored", nativeAdViewBinder.getSponsoredView());
        r22Var.e.put("title", nativeAdViewBinder.getTitleView());
        r22Var.e.put("warning", nativeAdViewBinder.getWarningView());
        return new s22(r22Var);
    }
}
