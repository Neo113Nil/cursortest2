package com.yandex.go.support.web;

import android.view.View;
import defpackage.ce0;
import defpackage.iqc;
import defpackage.l050;
import defpackage.l7b;
import defpackage.lh2;
import defpackage.oqc;
import defpackage.pqc;
import defpackage.qu;
import defpackage.sls;
import defpackage.v4a;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/support/web/CommonSupportWebView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Ll050;", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "webViewWrapper", "Liqc;", "presenter", "Lkotlin/Function0;", "Lzy11;", "onDeepLinkClicked", "Lpqc;", "commonSupportWebViewClientFactory", "<init>", "(Lru/yandex/taxi/web/view/WebViewContainerImpl;Liqc;Lsls;Lpqc;)V", "Ly130;", "insetsType", "()Ly130;", "onAttachedToWindow", "()V", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Liqc;", "Lsls;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommonSupportWebView extends SlideableModalView implements l050 {
    private final sls onDeepLinkClicked;
    private final iqc presenter;
    private final WebViewContainerImpl webViewWrapper;

    public CommonSupportWebView(WebViewContainerImpl webViewContainerImpl, iqc iqcVar, sls slsVar, pqc pqcVar) {
        super((View) webViewContainerImpl, (Integer) 7);
        this.webViewWrapper = webViewContainerImpl;
        this.presenter = iqcVar;
        this.onDeepLinkClicked = slsVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setAnimationDelegate(lh2.c);
        pqcVar.getClass();
        webViewContainerImpl.setWebViewClientFactory(new oqc(0, pqcVar, slsVar));
        webViewContainerImpl.setOnCloseRequested(new v4a(16, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CommonSupportWebView commonSupportWebView) {
        ((e) commonSupportWebView.presenter.w.a).r(new qu(9));
        WebViewContainerImpl webViewContainerImpl = commonSupportWebView.webViewWrapper;
        if (webViewContainerImpl == null) {
            return;
        }
        webViewContainerImpl.post(new ce0(webViewContainerImpl, 15));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(0, new l7b(25, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
    }
}
