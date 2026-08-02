package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: ArticleWebInterface.kt */
/* loaded from: classes15.dex */
public interface zp3 {
    @JavascriptInterface
    void articleAnalyticsTrackEvent(String str);

    @JavascriptInterface
    void articleBookmarked(String str);

    @JavascriptInterface
    void articlePhotoView(String str);

    @JavascriptInterface
    void articleReady(String str);

    @JavascriptInterface
    void articleTtsApproxGenerationTime(String str);

    @JavascriptInterface
    void articleTtsError(String str);

    @JavascriptInterface
    void articleTtsReady(String str);

    @JavascriptInterface
    void articleUpdate(String str);
}
