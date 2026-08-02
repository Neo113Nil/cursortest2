package com.yandex.go.safety.center.instructions.web;

import android.view.View;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import defpackage.ce0;
import defpackage.hxj0;
import defpackage.iik0;
import defpackage.l050;
import defpackage.y130;
import defpackage.yul0;
import kotlin.Metadata;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/safety/center/instructions/web/SafetyCenterWebInstructionsView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Ll050;", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "webViewWrapper", "Lyul0;", "presenter", "<init>", "(Lru/yandex/taxi/web/view/WebViewContainerImpl;Lyul0;)V", "Ly130;", "insetsType", "()Ly130;", "Lzy11;", "onDetachedFromWindow", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Lyul0;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterWebInstructionsView extends BaseSafetyCenterView implements l050 {
    private final yul0 presenter;
    private final WebViewContainerImpl webViewWrapper;

    public SafetyCenterWebInstructionsView(WebViewContainerImpl webViewContainerImpl, yul0 yul0Var) {
        super(webViewContainerImpl, yul0Var);
        this.webViewWrapper = webViewContainerImpl;
        this.presenter = yul0Var;
        webViewContainerImpl.setEnableBackNavigation(false);
        webViewContainerImpl.setOnCloseRequested(new hxj0(20, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SafetyCenterWebInstructionsView safetyCenterWebInstructionsView) {
        safetyCenterWebInstructionsView.presenter.onBackPressed();
        WebViewContainerImpl webViewContainerImpl = safetyCenterWebInstructionsView.webViewWrapper;
        if (webViewContainerImpl == null) {
            return;
        }
        webViewContainerImpl.post(new ce0(webViewContainerImpl, 15));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.webViewWrapper.asView();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.go.safety.center.base.BaseSafetyCenterView, ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(0, new iik0(21, this), true);
    }

    @Override // com.yandex.go.safety.center.base.BaseSafetyCenterView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.webViewWrapper.release();
    }
}
