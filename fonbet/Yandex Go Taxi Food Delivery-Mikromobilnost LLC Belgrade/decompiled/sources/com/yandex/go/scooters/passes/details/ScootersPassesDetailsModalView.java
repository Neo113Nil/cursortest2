package com.yandex.go.scooters.passes.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.bdc;
import defpackage.cdo0;
import defpackage.cma1;
import defpackage.ddo0;
import defpackage.edo0;
import defpackage.f28;
import defpackage.g0c;
import defpackage.g4b1;
import defpackage.he7;
import defpackage.ido0;
import defpackage.k47;
import defpackage.kdd0;
import defpackage.kdo0;
import defpackage.kyh0;
import defpackage.lgp;
import defpackage.lj1;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qfh0;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.scc;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v3n0;
import defpackage.xng0;
import defpackage.zxs;
import java.util.Collections;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/scooters/passes/details/ScootersPassesDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ledo0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lido0;", "scootersPassesDetailsPresenter", "<init>", "(Landroid/content/Context;Lpav;Lido0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ledo0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lido0;", "Lcdo0;", "itemsAdapter", "Lcdo0;", "ddo0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesDetailsModalView extends SlideableBindingModalView<edo0> {
    public static final int $stable = 8;
    private final cdo0 itemsAdapter;
    private final ido0 scootersPassesDetailsPresenter;

    public ScootersPassesDetailsModalView(Context context, pav pavVar, ido0 ido0Var) {
        super(context);
        this.scootersPassesDetailsPresenter = ido0Var;
        int i = a.T;
        g0c a = qoi0.a(kdo0.class);
        lj1 lj1Var = new lj1(context, 19);
        k47 k47Var = new k47(pavVar, 2);
        int i2 = 3;
        cdo0 cdo0Var = new cdo0(Collections.singletonList(new zxs(a.a(), 0, lj1Var, scc.g(new lgp(ItemViewHolder$Companion$itemType$3.b, ItemViewHolder$Companion$itemType$4.b, i2), new lgp(ItemViewHolder$Companion$itemType$5.b, ItemViewHolder$Companion$itemType$6.b, i2)), new he7(1, k47Var), null)));
        this.itemsAdapter = cdo0Var;
        setNestedScrollingEnabled(true);
        RecyclerView recyclerView = getBinding().c;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(cdo0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$closeButtonClicked(ido0 ido0Var) {
        ((f28) ido0Var.z.b).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public edo0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_passes_details_modal_view, parent, false);
        int i = qfh0.button_container;
        View O = cma1.O(i, inflate);
        if (O != null) {
            nzm o = nzm.o(O);
            int i2 = qfh0.items_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
            if (recyclerView != null) {
                return new edo0((GoFrameLayout) inflate, o, recyclerView);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButtonComponent buttonComponent = (ButtonComponent) getBinding().b.c;
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.common_close));
        buttonComponent.setAccent(true);
        buttonComponent.setDebounceClickListener(new v3n0(17, this.scootersPassesDetailsPresenter));
        g4b1.c((FrameLayout) getBinding().b.b, getBinding().c);
        ido0 ido0Var = this.scootersPassesDetailsPresenter;
        ddo0 ddo0Var = new ddo0(this);
        ido0Var.Bg(ddo0Var);
        kdd0 kdd0Var = ido0Var.x;
        tpr t = e.t(new c(((pwy0) kdd0Var.c).a(), ido0Var.y, kdd0Var));
        ((tt2) kdd0Var.a).getClass();
        tje.N(ido0Var.Jg(), null, null, new ScootersPassesDetailsPresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, ddo0Var), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersPassesDetailsPresenter.Cg();
    }
}
