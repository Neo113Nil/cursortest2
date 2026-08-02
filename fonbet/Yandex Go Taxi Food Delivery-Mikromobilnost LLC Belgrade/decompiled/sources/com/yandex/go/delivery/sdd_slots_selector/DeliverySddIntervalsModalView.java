package com.yandex.go.delivery.sdd_slots_selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.abu;
import defpackage.aoi;
import defpackage.ath0;
import defpackage.bhh;
import defpackage.bih0;
import defpackage.boi;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.coi;
import defpackage.doi;
import defpackage.e230;
import defpackage.eoi;
import defpackage.joi;
import defpackage.ny61;
import defpackage.sti;
import defpackage.t1w;
import defpackage.tje;
import defpackage.uxh;
import defpackage.w130;
import defpackage.xjg;
import defpackage.xni;
import defpackage.y8g;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/delivery/sdd_slots_selector/DeliverySddIntervalsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldoi;", "Leoi;", "Landroid/content/Context;", "context", "Lcom/yandex/go/delivery/sdd_slots_selector/a;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/delivery/sdd_slots_selector/a;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldoi;", "Lcom/yandex/go/delivery/sdd_slots_selector/a;", "Lxni;", "engine", "Lxni;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliverySddIntervalsModalView extends SlideableBindingModalView<doi> implements eoi {
    private final xni engine;
    private final a presenter;

    public DeliverySddIntervalsModalView(Context context, a aVar) {
        super(context);
        aoi j;
        this.presenter = aVar;
        boi boiVar = aVar.y;
        sti stiVar = boiVar.b;
        joi joiVar = new joi(boiVar.a, new abu(stiVar.a, stiVar.b, stiVar.d, stiVar.e, stiVar.f, stiVar.c), aVar.B);
        coi coiVar = new coi(this);
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            j = (y8gVar == null ? null : y8gVar).b().j(new xjg(joiVar, coiVar, false, 15));
        }
        this.engine = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DeliverySddIntervalsModalView deliverySddIntervalsModalView, t1w t1wVar) {
        deliverySddIntervalsModalView.setTopSystemWindowInset(t1wVar.b);
        FrameLayout frameLayout = deliverySddIntervalsModalView.getBinding().b;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DeliverySddIntervalsModalView deliverySddIntervalsModalView) {
        deliverySddIntervalsModalView.refreshNestedScrollView(deliverySddIntervalsModalView.getCardContentView());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public doi bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        from.inflate(ath0.delivery_sdd_intervals_modal_view, cardContentContainer);
        int i = bih0.container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, cardContentContainer);
        if (frameLayout != null) {
            return new doi(cardContentContainer, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(cardContentContainer.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new bhh(24, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(this);
        tje.N(aVar.Jg(), null, null, new DeliverySddIntervalsPresenter$attachView$1(aVar, null), 3);
        this.engine.b(getBinding().b);
        getBinding().b.post(new uxh(10, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
