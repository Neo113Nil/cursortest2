package defpackage;

import ru.yandex.taxi.fragment.common.WebViewFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class bq41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewFragment b;

    public /* synthetic */ bq41(WebViewFragment webViewFragment, int i) {
        this.a = i;
        this.b = webViewFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebViewFragment webViewFragment = this.b;
        switch (i) {
            case 0:
                WebViewFragment.onViewCreated$lambda$4$0(webViewFragment);
                break;
            default:
                WebViewFragment.showCloseButton$lambda$0$0(webViewFragment);
                break;
        }
    }
}
