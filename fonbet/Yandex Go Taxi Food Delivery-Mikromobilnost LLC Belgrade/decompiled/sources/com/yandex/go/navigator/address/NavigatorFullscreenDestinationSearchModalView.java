package com.yandex.go.navigator.address;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.b61;
import defpackage.d230;
import defpackage.d240;
import defpackage.dc50;
import defpackage.e230;
import defpackage.ewb;
import defpackage.ii30;
import defpackage.y130;
import defpackage.zb50;
import kotlin.Metadata;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/navigator/address/NavigatorFullscreenDestinationSearchModalView;", "Lru/yandex/taxi/search/view/AddressSearchModalView;", "Lb61;", "builder", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "Ldc50;", "presenter", "<init>", "(Lb61;Lru/yandex/taxi/widget/SlideableModalView$CardMode;Ldc50;)V", "", "isFullscreen", "()Z", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "child", "animate", "removeDetachedView", "(Landroid/view/View;Z)V", "Ldc50;", "zb50", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigatorFullscreenDestinationSearchModalView extends AddressSearchModalView {
    public static final int $stable = 8;
    private final dc50 presenter;

    public NavigatorFullscreenDestinationSearchModalView(b61 b61Var, SlideableModalView.CardMode cardMode, dc50 dc50Var) {
        super(b61Var, cardMode);
        this.presenter = dc50Var;
        setDismissOnTouchOutside(false);
        setOnKeyboardListener(new ewb(this, 2));
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return get_cardMode() == SlideableModalView.CardMode.FULLSCREEN ? new y130(1, new d240(12, this)) : new d230(0);
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchModalView, ru.yandex.taxi.search.view.BaseAddressSearchModalView
    /* renamed from: isFullscreen */
    public boolean getIsFullscreen() {
        return true;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchModalView, ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(new zb50());
        OneShotPreDrawListener.add(getAddressSearchView().addressInput, new ii30(6, this));
        setOnTouchOutsideListener(null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View child, boolean animate) {
        super.removeDetachedView(child, animate);
        this.presenter.Cg();
    }
}
