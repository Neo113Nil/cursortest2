package com.yandex.go.taxi.order.support.ui.support_menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.support.analytics.SupportAnalytics$Source;
import com.yandex.go.taxi.order.support.data.repositories.a;
import defpackage.c230;
import defpackage.cma1;
import defpackage.ip11;
import defpackage.l7s0;
import defpackage.lnv0;
import defpackage.m2y;
import defpackage.mth;
import defpackage.njw0;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.ojw0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.piw0;
import defpackage.qdb1;
import defpackage.qjw0;
import defpackage.qu;
import defpackage.rjw0;
import defpackage.tje;
import defpackage.tjw0;
import defpackage.ujw0;
import defpackage.xw31;
import defpackage.zkh0;
import defpackage.zmh;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.MaskedShimmeringBar;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B-\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\u0019\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/go/taxi/order/support/ui/support_menu/SupportMenuModalView;", "Lqjw0;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lojw0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lpav;", "imageLoader", "Lrjw0;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lpav;Lrjw0;)V", "Lzy11;", "showIcon", "()V", "goneIcon", "Lc230;", "insetsType", "()Lc230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lojw0;", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "Landroid/graphics/Bitmap;", "bitmap", "renderIcon", "(Landroid/graphics/Bitmap;)V", "Lujw0;", "uiState", "render", "(Lujw0;)V", "Lpav;", "Lrjw0;", "Lnjw0;", "supportMenuActionItemsAdapter", "Lnjw0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SupportMenuModalView extends SlideableBindingModalView<ojw0> implements qjw0 {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final rjw0 presenter;
    private njw0 supportMenuActionItemsAdapter;

    public SupportMenuModalView(Context context, ip11 ip11Var, pav pavVar, rjw0 rjw0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.presenter = rjw0Var;
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new lnv0(12, this));
        getBinding().f.setTypeface(((zmh) ip11Var).d());
        b.q(getBinding().f, true);
    }

    private final void goneIcon() {
        m2y m2yVar = getBinding().c;
        xw31.E(getBinding().f, null, Integer.valueOf(tje.u(20, getContext())), null, null);
        ImageView imageView = (ImageView) m2yVar.e;
        ImageView imageView2 = (ImageView) m2yVar.d;
        if (imageView.getVisibility() == 0) {
            cma1.L(imageView);
        }
        if (imageView2.getVisibility() == 0) {
            cma1.L(imageView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SupportMenuModalView supportMenuModalView) {
        return supportMenuModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onTouchOutside(rjw0 rjw0Var) {
        piw0 piw0Var = rjw0Var.A;
        SupportAnalytics$Source supportAnalytics$Source = SupportAnalytics$Source.OUT_OF_SCREEN;
        piw0Var.getClass();
        piw0Var.b(piw0.a("MainScreen", "Disappear"), new Pair("source", supportAnalytics$Source));
        piw0Var.b.set(false);
        ((tjw0) rjw0Var.x.a).r(new qu(9));
    }

    private final void showIcon() {
        m2y m2yVar = getBinding().c;
        xw31.E(getBinding().f, null, Integer.valueOf(tje.u(8, getContext())), null, null);
        ImageView imageView = (ImageView) m2yVar.e;
        ImageView imageView2 = (ImageView) m2yVar.d;
        if (imageView.getVisibility() != 0) {
            cma1.J(imageView);
        }
        if (imageView2.getVisibility() == 0) {
            return;
        }
        cma1.J(imageView2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ojw0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(zkh0.support_menu_modal_view, parent, false);
        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
        int i = p8h0.divider;
        View O2 = cma1.O(i, inflate);
        if (O2 != null && (O = cma1.O((i = p8h0.icon_spot), inflate)) != null) {
            m2y o = m2y.o(O);
            i = p8h0.rv_action_items;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = p8h0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = p8h0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new ojw0(goLinearLayout, O2, o, recyclerView, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new oew0(3, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(new lnv0(13, this.presenter));
        this.supportMenuActionItemsAdapter = new njw0(getContext(), this.imageLoader, new SupportMenuModalView$onAttachedToWindow$2(1, this.presenter, rjw0.class, "onActionClick", "onActionClick(Ljava/lang/String;)V", 0));
        getBinding().d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        getBinding().d.setAdapter(this.supportMenuActionItemsAdapter);
        rjw0 rjw0Var = this.presenter;
        rjw0Var.Bg(this);
        l7s0 l7s0Var = rjw0Var.z;
        tje.N(rjw0Var.Jg(), null, null, new SupportMenuPresenter$attachView$$inlined$collectIn$1(e.d(((a) l7s0Var.a).h), null, rjw0Var, this), 3);
        tje.N(rjw0Var.Jg(), null, null, new SupportMenuPresenter$attachView$$inlined$collectIn$2(new mth(((a) l7s0Var.a).c(), 6), null, this), 3);
        tje.N(rjw0Var.Jg(), null, null, new SupportMenuPresenter$attachView$3(rjw0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        rjw0 rjw0Var = this.presenter;
        piw0 piw0Var = rjw0Var.A;
        SupportAnalytics$Source supportAnalytics$Source = SupportAnalytics$Source.BACK_BUTTON;
        piw0Var.getClass();
        piw0Var.b(piw0.a("MainScreen", "Disappear"), new Pair("source", supportAnalytics$Source));
        piw0Var.b.set(false);
        ((tjw0) rjw0Var.x.a).r(new qu(9));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(ujw0 uiState) {
        ojw0 binding = getBinding();
        binding.f.setText(uiState.a);
        binding.e.setText(uiState.b);
        View view = binding.b;
        ArrayList arrayList = uiState.c;
        view.setVisibility(!arrayList.isEmpty() ? 0 : 8);
        njw0 njw0Var = this.supportMenuActionItemsAdapter;
        if (njw0Var != null) {
            njw0Var.submitList(arrayList, null);
        }
    }

    @Override // defpackage.qjw0
    public void renderIcon(Bitmap bitmap) {
        m2y m2yVar = getBinding().c;
        FrameLayout frameLayout = (FrameLayout) m2yVar.c;
        if (((MaskedShimmeringBar) m2yVar.b).getVisibility() == 0) {
            cma1.L((MaskedShimmeringBar) m2yVar.b);
        }
        if (bitmap == null) {
            if (frameLayout.getVisibility() == 0) {
                cma1.L(frameLayout);
            }
            goneIcon();
        } else {
            if (frameLayout.getVisibility() != 0) {
                cma1.J(frameLayout);
            }
            ((ImageView) m2yVar.d).setImageBitmap(bitmap);
            showIcon();
        }
    }
}
