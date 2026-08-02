package defpackage;

import com.ybsdk.feature.webview.api.WebViewScreenParams;

/* loaded from: classes3.dex */
public final /* synthetic */ class hv41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewScreenParams b;

    public /* synthetic */ hv41(WebViewScreenParams webViewScreenParams, int i) {
        this.a = i;
        this.b = webViewScreenParams;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        WebViewScreenParams webViewScreenParams = this.b;
        switch (i) {
            case 0:
                return new hu41(0, new fu41(false), webViewScreenParams.getUrl(), webViewScreenParams.getAppearanceOption().getTitle(), false, false, webViewScreenParams.getPrimaryErrorButtonGravity());
            default:
                return new iu41(new mu41(false, false), 0, webViewScreenParams.getAppearanceOption().getTitle(), false, false, null);
        }
    }
}
