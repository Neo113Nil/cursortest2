package com.yandex.go.scooters.offers.v2.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.e230;
import defpackage.f6n0;
import defpackage.g3o0;
import defpackage.g4b1;
import defpackage.h3o0;
import defpackage.i2b1;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.pav;
import defpackage.qfh0;
import defpackage.srh0;
import defpackage.tje;
import defpackage.v3n0;
import defpackage.xng0;
import defpackage.y5p0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/details/ScootersOfferDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lh3o0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lf6n0;", "scootersCardV2Analytics", "Lcom/yandex/go/scooters/offers/v2/details/c;", "scootersOfferDetailsPresenter", "<init>", "(Landroid/content/Context;Lpav;Lf6n0;Lcom/yandex/go/scooters/offers/v2/details/c;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh3o0;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "Lf6n0;", "Lcom/yandex/go/scooters/offers/v2/details/c;", "g3o0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferDetailsModalView extends SlideableBindingModalView<h3o0> {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final f6n0 scootersCardV2Analytics;
    private final c scootersOfferDetailsPresenter;

    public ScootersOfferDetailsModalView(Context context, pav pavVar, f6n0 f6n0Var, c cVar) {
        super(context);
        this.imageLoader = pavVar;
        this.scootersCardV2Analytics = f6n0Var;
        this.scootersOfferDetailsPresenter = cVar;
        setNestedScrollingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        scootersOfferDetailsModalView.scootersCardV2Analytics.c(ScootersCardV2Analytics$CardButton.CLOSE);
        scootersOfferDetailsModalView.scootersOfferDetailsPresenter.D.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public h3o0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_offer_details_modal_view, parent, false);
        parent.addView(inflate);
        int i = qfh0.button_container;
        View O = cma1.O(i, inflate);
        if (O != null) {
            nzm o = nzm.o(O);
            int i2 = qfh0.details_rv;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
            if (recyclerView != null) {
                return new h3o0((GoFrameLayout) inflate, o, recyclerView);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return i2b1.b(this, (FrameLayout) getBinding().b.b, getBinding().c);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButtonComponent buttonComponent = (ButtonComponent) getBinding().b.c;
        buttonComponent.setDebounceClickListener(new v3n0(15, this));
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.common_close));
        buttonComponent.setAccent(true);
        g4b1.c((FrameLayout) getBinding().b.b, getBinding().c);
        c cVar = this.scootersOfferDetailsPresenter;
        cVar.Bg(new g3o0(this));
        y5p0 y5p0Var = cVar.z;
        tje.N(cVar.Jg(), null, null, new ScootersOfferDetailsPresenter$init$$inlined$collectIn$1(e.m(e.d(y5p0Var.b), e.d(y5p0Var.c), e.d((r0) cVar.B.b), cVar.x.a(), new ScootersOfferDetailsPresenter$init$1(5, null)), null, cVar), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersOfferDetailsPresenter.Cg();
    }
}
