package com.yandex.go.chargers.misc.web;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aza;
import defpackage.bi41;
import defpackage.bza;
import defpackage.dp41;
import defpackage.e230;
import defpackage.fza;
import defpackage.id00;
import defpackage.ms41;
import defpackage.tls;
import defpackage.to41;
import defpackage.w511;
import defpackage.xqg0;
import defpackage.y130;
import defpackage.zm41;
import kotlin.Metadata;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/go/chargers/misc/web/ChargersWebViewModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lzm41;", "webViewContainerDependencies", "Lfza;", "chargersWebViewConfigFactory", "Lbza;", "loadWebBy", "Lkotlin/Function1;", "", "Lzy11;", "openErrorDialog", "Lbi41;", "webPageLoadingListener", "<init>", "(Landroid/content/Context;Lzm41;Lfza;Lbza;Ltls;Lbi41;)V", "Lru/yandex/taxi/web/UiWebViewConfig;", "createWebViewConfig", "()Lru/yandex/taxi/web/UiWebViewConfig;", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lfza;", "Lbza;", "Ltls;", "Lbi41;", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "webViewContainer", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChargersWebViewModalView extends ModalView {
    private final fza chargersWebViewConfigFactory;
    private final bza loadWebBy;
    private final tls openErrorDialog;
    private final bi41 webPageLoadingListener;
    private final WebViewContainerImpl webViewContainer;

    public ChargersWebViewModalView(Context context, zm41 zm41Var, fza fzaVar, bza bzaVar, tls tlsVar, bi41 bi41Var) {
        super(context);
        this.chargersWebViewConfigFactory = fzaVar;
        this.loadWebBy = bzaVar;
        this.openErrorDialog = tlsVar;
        this.webPageLoadingListener = bi41Var;
        WebViewContainerImpl c = id00.e(zm41Var, createWebViewConfig(), bi41Var, dp41.a, to41.a, ms41.a).c();
        addView(c, new FrameLayout.LayoutParams(-1, -1));
        this.webViewContainer = c;
    }

    private final UiWebViewConfig createWebViewConfig() {
        try {
            return this.chargersWebViewConfigFactory.a(this.loadWebBy);
        } catch (Throwable th) {
            this.openErrorDialog.invoke(th);
            return new UiWebViewConfig(null, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194303, null);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return xqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.webViewContainer;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(3, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.webViewContainer.release();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        if (this.loadWebBy instanceof aza) {
            return;
        }
        w511.b();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.webViewContainer.setOnCloseRequested(onBackPressedListener);
    }
}
