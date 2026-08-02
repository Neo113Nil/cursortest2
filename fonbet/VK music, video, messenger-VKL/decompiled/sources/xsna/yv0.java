package xsna;

import android.text.TextUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;

/* compiled from: AdsEasyPromoteUtil.kt */
/* loaded from: classes14.dex */
public final class yv0 implements WallAdsEasyPromoteUrlBuilder {
    public static final yv0 a = new yv0();

    public static String c(String str) {
        String uri = er.a(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").build().toString();
        if (!TextUtils.isEmpty(str)) {
            uri = v1v.a('?', uri, str);
        }
        return uri + '#';
    }

    @Override // com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder
    public final String a(String str, WallAdsEasyPromoteUrlBuilder.From from) {
        return er.a(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").appendQueryParameter("post_id", str).appendQueryParameter("from", from.h()).build().toString();
    }

    @Override // com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder
    public final String b(String str, WallAdsEasyPromoteUrlBuilder.From from) {
        return er.a(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").appendQueryParameter("act", "clip").appendQueryParameter("clip_id", str).appendQueryParameter("from", from.h()).build().toString();
    }
}
