package com.yandex.go.scooters.misc.support;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ce0;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/scooters/misc/support/ScootersSupportModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/view/View;", "webViewContainer", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "Ly130;", "insetsType", "()Ly130;", "Lzy11;", "onAttachedToWindow", "()V", "contentView", "()Landroid/view/View;", "onModalViewDisappear", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSupportModalView extends ModalView {
    public static final int $stable = 8;
    private final View webViewContainer;

    public ScootersSupportModalView(Context context, View view) {
        super(context);
        this.webViewContainer = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(2, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        post(new ce0(this, 15));
    }
}
