package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ItemType;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.dvh0;
import defpackage.e230;
import defpackage.epj;
import defpackage.eqj;
import defpackage.frf0;
import defpackage.jip0;
import defpackage.kip0;
import defpackage.lh2;
import defpackage.m950;
import defpackage.mqj;
import defpackage.nqj;
import defpackage.ny61;
import defpackage.orj;
import defpackage.pav;
import defpackage.prj;
import defpackage.qu;
import defpackage.rrj;
import defpackage.t1w;
import defpackage.tje;
import defpackage.w130;
import defpackage.xw31;
import defpackage.y6h0;
import defpackage.yvf0;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/main/DiscountsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfrf0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/main/a;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/main/a;)V", "Lzy11;", "initUi", "()V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfrf0;", "onAttachedToWindow", "onDetachedFromWindow", "Lpav;", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/main/a;", "Leqj;", "adapter", "Leqj;", "Lkip0;", "scrollShadowBinder", "Lkip0;", "Ljava/lang/Runnable;", "toolbarRequestAccessibilityFocus", "Ljava/lang/Runnable;", "nqj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsModalView extends SlideableBindingModalView<frf0> {
    private final eqj adapter;
    private final pav imageLoader;
    private final a presenter;
    private final kip0 scrollShadowBinder;
    private final Runnable toolbarRequestAccessibilityFocus;

    public DiscountsModalView(Context context, pav pavVar, a aVar) {
        super(context);
        this.imageLoader = pavVar;
        this.presenter = aVar;
        this.adapter = new eqj(pavVar, aVar);
        this.scrollShadowBinder = new kip0(getBinding().e);
        this.toolbarRequestAccessibilityFocus = new mqj(this, 0);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN, true);
        setAnimationDelegate(lh2.c);
    }

    private final void initUi() {
        getBinding().e.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        getBinding().e.setAdapter(this.adapter);
        getBinding().e.setItemAnimator(null);
        getBinding().g.setTitleAccessibilityHeading(true);
        getBinding().g.setOnBackClickListener(new mqj(this, 1));
        getBinding().g.setToolbarItemAction(new mqj(this, 2));
        getBinding().c.setOnClickListener(new cmi(4, this));
        kip0 kip0Var = this.scrollShadowBinder;
        ImageView imageView = getBinding().d;
        kip0Var.getClass();
        jip0 jip0Var = new jip0(imageView);
        kip0Var.a.addOnScrollListener(jip0Var);
        kip0Var.b.add(jip0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUi$lambda$0(DiscountsModalView discountsModalView) {
        discountsModalView.presenter.H.b.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUi$lambda$1(DiscountsModalView discountsModalView) {
        discountsModalView.presenter.I.m(null, Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUi$lambda$2(DiscountsModalView discountsModalView, View view) {
        a aVar = discountsModalView.presenter;
        aVar.y.b(ItemType.INVITE, aVar.J.c);
        aVar.H.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DiscountsModalView discountsModalView, t1w t1wVar) {
        xw31.I(discountsModalView.getBinding().g, null, Integer.valueOf(t1wVar.b), null, null);
        RecyclerView recyclerView = discountsModalView.getBinding().e;
        int i = t1wVar.g;
        xw31.I(recyclerView, null, null, null, Integer.valueOf(i));
        xw31.E(discountsModalView.getBinding().c, null, null, null, Integer.valueOf(i));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toolbarRequestAccessibilityFocus$lambda$0(DiscountsModalView discountsModalView) {
        discountsModalView.getBinding().g.requestToolbarAccessibilityFocus();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public frf0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dvh0.promocode_main_layout, parent, false);
        int i = y6h0.frame;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = y6h0.invite;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = y6h0.invite_button_shadow;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    i = y6h0.list;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = y6h0.promocode_footer;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView != null) {
                            i = y6h0.scrollable_container;
                            if (((NestedScrollViewAdvanced) cma1.O(i, inflate)) != null) {
                                i = y6h0.toolbar;
                                FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) cma1.O(i, inflate);
                                if (floatingTitleToolbarComponent != null) {
                                    return new frf0((LinearLayout) inflate, frameLayout, buttonComponent, imageView, recyclerView, appCompatImageView, floatingTitleToolbarComponent);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new zvi(10, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(new nqj(this));
        Uri uri = aVar.F;
        if (uri != null && !aVar.K) {
            aVar.K = true;
            aVar.B.getClass();
            String queryParameter = uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE);
            prj prjVar = aVar.H;
            rrj rrjVar = prjVar.b;
            rrjVar.A((m950) ((yvf0) rrjVar.I).get(), new epj(queryParameter, prjVar.a.b), new orj(rrjVar, prjVar));
        }
        tje.N(aVar.Jg(), null, null, new DiscountsViewPresenter$attachView$1(aVar, null), 3);
        initUi();
        postDelayed(this.toolbarRequestAccessibilityFocus, 400L);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        removeCallbacks(this.toolbarRequestAccessibilityFocus);
    }
}
