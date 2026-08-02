package com.yandex.go.flex.common.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.kth0;
import defpackage.mih0;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.vng;
import defpackage.ykr;
import defpackage.ywl;
import defpackage.zkr;
import flex.engine.a;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/flex/common/ui/FlexPopupModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lzkr;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Lykr;", "configuration", "<init>", "(Landroid/content/Context;Lflex/engine/a;Lykr;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "applyThemeForChildrenByDefault", "()Z", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzkr;", "Lflex/engine/a;", "Lykr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public class FlexPopupModalView extends SlideableBindingModalView<zkr> {
    private final ykr configuration;
    private final a engine;

    public FlexPopupModalView(Context context, a aVar, ykr ykrVar) {
        super(context);
        this.engine = aVar;
        this.configuration = ykrVar;
        setCardMode(ykrVar.a ? SlideableModalView.CardMode.FULLSCREEN : ykrVar.c ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.configuration.d ? super.getBackgroundColor() : mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public zkr bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(kth0.flex_promo_popup_modal_view, parent, false);
        int i = mih0.promo_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            return new zkr((FrameLayout) inflate, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (get_cardMode() != SlideableModalView.CardMode.FULLSCREEN) {
            setDismissOnTouchOutside(this.configuration.b);
        }
        pey o = vng.o(getBinding().b);
        if (o != null) {
            this.engine.g(getBinding().b, o);
        }
        ykr ykrVar = this.configuration;
        ywl ywlVar = ykrVar.e;
        if (ywlVar != null) {
            this.engine.B(ywlVar, ykrVar.f);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.j();
        super.onDetachedFromWindow();
    }
}
