package com.yandex.go.taxi.order.cancel.popup.mvp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton$Action$Deeplink;
import com.yandex.go.taxi.order.models.api.cancel.r;
import com.yandex.go.taxi.order.models.api.cancel.s;
import com.yandex.go.taxi.order.models.api.cancel.t;
import defpackage.b2j;
import defpackage.c2j;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d2j;
import defpackage.e2j;
import defpackage.ej1;
import defpackage.h0;
import defpackage.h2j;
import defpackage.hbp0;
import defpackage.j2j;
import defpackage.jl40;
import defpackage.k2j;
import defpackage.l8x;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.qu;
import defpackage.tje;
import defpackage.vpa;
import defpackage.w511;
import defpackage.xw31;
import defpackage.zkh0;
import defpackage.zvg;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.a;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0014¢\u0006\u0004\b!\u0010 J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/¨\u00062"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/popup/mvp/DetailedCancelPopupModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lb2j;", "Landroid/content/Context;", "context", "Lh2j;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lh2j;Lpav;)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "text", "setMessage", "imageUrl", "setTopImage", "Lk2j;", "costInfo", "setCostInfo", "(Lk2j;)V", "Lj2j;", "buttonModel", "setButton", "(Lj2j;)V", "Lru/yandex/taxi/design/ButtonComponent;", "render", "(Lru/yandex/taxi/design/ButtonComponent;Lj2j;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb2j;", "Lh2j;", "Lpav;", "Lhbp0;", "mainScope", "Lhbp0;", "Ll8x;", "topImageLoadingJob", "Ll8x;", "costInfoImageLoadingJob", "e2j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailedCancelPopupModalView extends SlideableBindingModalView<b2j> {
    public static final int $stable = 8;
    private l8x costInfoImageLoadingJob;
    private final pav imageLoader;
    private final hbp0 mainScope;
    private final h2j presenter;
    private l8x topImageLoadingJob;

    public DetailedCancelPopupModalView(Context context, h2j h2jVar, pav pavVar) {
        super(context);
        this.presenter = h2jVar;
        this.imageLoader = pavVar;
        this.mainScope = new hbp0(new czo0(14), "", null);
        b.q(getBinding().f, true);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1() {
    }

    private final void render(ButtonComponent buttonComponent, j2j j2jVar) {
        buttonComponent.setText(j2jVar.a);
        buttonComponent.setTextTypeface(3);
        buttonComponent.setButtonTitleColor(j2jVar.b);
        buttonComponent.setButtonSize(3);
        buttonComponent.setButtonBackground(j2jVar.c);
        buttonComponent.setDebounceClickListener(new zvg(24, j2jVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(j2j j2jVar, DetailedCancelPopupModalView detailedCancelPopupModalView) {
        t tVar = j2jVar.d;
        if ((tVar instanceof r) || jl40.l(tVar, s.INSTANCE)) {
            h2j h2jVar = detailedCancelPopupModalView.presenter;
            h2jVar.B.a(AfterCancelPopupButton.ActionType.TO_SUMMARY);
            ((ej1) h2jVar.A.a).r(new qu(9));
        } else {
            if (!(tVar instanceof AfterCancelPopupButton$Action$Deeplink)) {
                w511.b();
                return;
            }
            h2j h2jVar2 = detailedCancelPopupModalView.presenter;
            String str = ((AfterCancelPopupButton$Action$Deeplink) tVar).a;
            h2jVar2.B.a(AfterCancelPopupButton.ActionType.DEEPLINK);
            ((ej1) h2jVar2.A.a).r(new h0(str, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButton(j2j buttonModel) {
        if (buttonModel == null) {
            return;
        }
        render(getBinding().b, buttonModel);
        int i = 0;
        boolean z = getBinding().c.getVisibility() == 0;
        if (!z) {
            if (z) {
                w511.b();
                return;
            }
            i = tje.r(mrg0.go_design_m_space, getContext());
        }
        xw31.E(getBinding().b, null, Integer.valueOf(i), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCostInfo(k2j costInfo) {
        l8x l8xVar = this.costInfoImageLoadingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (costInfo == null) {
            getBinding().c.setVisibility(8);
            return;
        }
        String str = costInfo.a;
        ListItemComponent listItemComponent = getBinding().c;
        int i = 0;
        listItemComponent.setVisibility(0);
        listItemComponent.setTitle(costInfo.b);
        listItemComponent.setSubtitle(costInfo.c);
        if (str.length() == 0) {
            return;
        }
        this.costInfoImageLoadingJob = a.c(this.imageLoader.b().b(str), new c2j(this, i), new d2j(this, i), this.mainScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setCostInfo$lambda$1(DetailedCancelPopupModalView detailedCancelPopupModalView, Bitmap bitmap) {
        detailedCancelPopupModalView.getBinding().c.getLeadImageView().setImageBitmap(bitmap);
        detailedCancelPopupModalView.getBinding().c.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setCostInfo$lambda$2(DetailedCancelPopupModalView detailedCancelPopupModalView) {
        detailedCancelPopupModalView.getBinding().c.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMessage(String text) {
        getBinding().e.setText(text);
        getBinding().e.setVisibility(text.length() > 0 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(String title) {
        getBinding().f.setText(title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTopImage(String imageUrl) {
        l8x l8xVar = this.topImageLoadingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (imageUrl.length() == 0) {
            getBinding().d.setVisibility(8);
        } else {
            int i = 1;
            this.topImageLoadingJob = a.c(this.imageLoader.b().b(imageUrl), new c2j(this, i), new d2j(this, i), this.mainScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setTopImage$lambda$0(DetailedCancelPopupModalView detailedCancelPopupModalView, Bitmap bitmap) {
        detailedCancelPopupModalView.getBinding().d.setImageBitmap(bitmap);
        detailedCancelPopupModalView.getBinding().d.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setTopImage$lambda$1(DetailedCancelPopupModalView detailedCancelPopupModalView) {
        detailedCancelPopupModalView.getBinding().d.setVisibility(8);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public b2j bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.detailed_cancel_popup, parent, false);
        int i = p8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.cost_info;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = p8h0.image;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = p8h0.message;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = p8h0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new b2j((GoLinearLayout) inflate, buttonComponent, listItemComponent, goImageView, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        h2j h2jVar = this.presenter;
        e2j e2jVar = new e2j(this);
        h2jVar.Bg(e2jVar);
        tje.N(h2jVar.Jg(), null, null, new DetailedCancelPopupPresenter$attachView$1(h2jVar, e2jVar, null), 3);
        setOnBackPressedListener(new vpa(6));
        setOnTouchOutsideListener(new vpa(7));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mainScope.b();
        this.presenter.Cg();
        l8x l8xVar = this.topImageLoadingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        l8x l8xVar2 = this.costInfoImageLoadingJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        super.onDetachedFromWindow();
    }
}
