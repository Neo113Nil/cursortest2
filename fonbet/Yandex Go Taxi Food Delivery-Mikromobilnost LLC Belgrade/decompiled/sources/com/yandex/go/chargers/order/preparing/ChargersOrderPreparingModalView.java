package com.yandex.go.chargers.order.preparing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.cda;
import defpackage.dda;
import defpackage.hda;
import defpackage.kda;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tsh0;
import defpackage.uyj;
import defpackage.uz;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/chargers/order/preparing/ChargersOrderPreparingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldda;", "Landroid/content/Context;", "context", "Lhda;", "chargersOrderPreparingPresenter", "<init>", "(Landroid/content/Context;Lhda;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldda;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lhda;", "cda", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderPreparingModalView extends SlideableBindingModalView<dda> {
    private final hda chargersOrderPreparingPresenter;

    public ChargersOrderPreparingModalView(Context context, hda hdaVar) {
        super(context);
        this.chargersOrderPreparingPresenter = hdaVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dda bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return dda.o(inflater.inflate(tsh0.chargers_order_preparing_modal_view, parent, false));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        hda hdaVar = this.chargersOrderPreparingPresenter;
        hdaVar.Bg(new cda(this));
        kda kdaVar = hdaVar.A;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(kdaVar.c.a(), new e(new g(kotlinx.coroutines.flow.e.d(kdaVar.e.d), hdaVar.C)), new ChargersOrderPreparingUiStateInteractor$uiStateFlow$3(kdaVar, null)));
        kdaVar.a.getClass();
        tje.N(hdaVar.Jg(), null, null, new ChargersOrderPreparingPresenter$listenUiState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, hdaVar), 3);
        tje.N(hdaVar.Jg(), null, null, new ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1(new o(new c(kotlinx.coroutines.flow.e.d(hdaVar.z.d), hdaVar), new ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$2(hdaVar, null)), null, hdaVar), 3);
        OneShotPreDrawListener.add(this, new uz(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersOrderPreparingPresenter.Cg();
    }
}
