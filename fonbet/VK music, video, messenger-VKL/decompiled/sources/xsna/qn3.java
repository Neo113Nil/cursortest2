package xsna;

import android.webkit.JavascriptInterface;
import com.vk.articles.a;
import com.vk.superapp.browser.internal.bridges.MethodScope;
import org.json.JSONObject;

/* compiled from: ArticleCompositeWebInterface.kt */
/* loaded from: classes15.dex */
public final class qn3 extends v1y implements zp3, ntb0, l05 {
    public final com.vk.articles.a p;
    public final bq3 q;
    public final m05 r;
    public final otb0 s;

    public qn3(com.vk.articles.a aVar, bq3 bq3Var, m05 m05Var, otb0 otb0Var) {
        super(MethodScope.INTERNAL);
        this.p = aVar;
        this.q = bq3Var;
        this.r = m05Var;
        this.s = otb0Var;
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleAnalyticsTrackEvent(String str) {
        this.q.articleAnalyticsTrackEvent(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleBookmarked(String str) {
        this.q.articleBookmarked(str);
    }

    @JavascriptInterface
    public final void articleClose(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            String optString = jSONObject.optString("fallback_url");
            a.InterfaceC0377a callback = this.p.getCallback();
            if (callback != null) {
                callback.Vl(optString, jSONObject2);
            }
        }
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articlePhotoView(String str) {
        this.q.articlePhotoView(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleReady(String str) {
        this.q.articleReady(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleTtsApproxGenerationTime(String str) {
        this.q.articleTtsApproxGenerationTime(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleTtsError(String str) {
        this.q.articleTtsError(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleTtsReady(String str) {
        this.q.articleTtsReady(str);
    }

    @Override // xsna.zp3
    @JavascriptInterface
    public void articleUpdate(String str) {
        this.q.articleUpdate(str);
    }

    @Override // xsna.l05
    @JavascriptInterface
    public void audioPause(String str) {
        this.r.audioPause(str);
    }

    @Override // xsna.l05
    @JavascriptInterface
    public void audioPlay(String str) {
        this.r.audioPlay(str);
    }

    @Override // xsna.ntb0
    @JavascriptInterface
    public void pollChanged(String str) {
        this.s.pollChanged(str);
    }

    @Override // xsna.ntb0
    @JavascriptInterface
    public void pollStatistic(String str) {
        this.s.pollStatistic(str);
    }

    @JavascriptInterface
    public final void report(String str) {
        if (str == null) {
            return;
        }
        this.p.post(new pn3(0, new ag1(1, str, this)));
    }

    @JavascriptInterface
    public final void share(String str) {
        if (str == null) {
            return;
        }
        this.p.post(new pn3(0, new com.vk.movika.sdk.android.defaultplayer.container.e(1, str, this)));
    }
}
