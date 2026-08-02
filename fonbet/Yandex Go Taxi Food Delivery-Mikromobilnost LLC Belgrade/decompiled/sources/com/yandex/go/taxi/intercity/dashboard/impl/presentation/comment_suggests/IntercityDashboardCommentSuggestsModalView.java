package com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bkv;
import defpackage.bl21;
import defpackage.c230;
import defpackage.cma1;
import defpackage.dhv;
import defpackage.e230;
import defpackage.evu0;
import defpackage.j8h0;
import defpackage.ny61;
import defpackage.obw;
import defpackage.pav;
import defpackage.qbw;
import defpackage.qu;
import defpackage.sbw;
import defpackage.tbw;
import defpackage.tkh0;
import defpackage.tzt;
import defpackage.xuv;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.FlowLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/comment_suggests/IntercityDashboardCommentSuggestsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ltbw;", "Lobw;", "Landroid/content/Context;", "context", "Lqbw;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lqbw;Lpav;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltbw;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lsbw;", ClidProvider.STATE, "render", "(Lsbw;)V", "Lqbw;", "Lpav;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/comment_suggests/b;", "itemAdapter", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/comment_suggests/b;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardCommentSuggestsModalView extends SlideableBindingModalView<tbw> implements obw {
    private final pav imageLoader;
    private final b itemAdapter;
    private final qbw presenter;

    public IntercityDashboardCommentSuggestsModalView(Context context, qbw qbwVar, pav pavVar) {
        super(context);
        this.presenter = qbwVar;
        this.imageLoader = pavVar;
        this.itemAdapter = new b(getBinding().b, pavVar, new IntercityDashboardCommentSuggestsModalView$itemAdapter$1(1, qbwVar, qbw.class, "onSuggestClicked", "onSuggestClicked(Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/comment_suggests/IntercityDashboardCommentSuggestUiState;)V", 0));
        getBinding().c.setDebounceClickListener(new dhv(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(IntercityDashboardCommentSuggestsModalView intercityDashboardCommentSuggestsModalView) {
        qbw qbwVar = intercityDashboardCommentSuggestsModalView.presenter;
        qbwVar.z.a.f(new bl21(kotlin.collections.a.X(qbwVar.A, null, null, null, new xuv(13), 31), 2));
        ((bkv) qbwVar.x.a).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public tbw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tkh0.intercity_dashboard_comment_suggests_modal_view, parent, false);
        int i = j8h0.comment_suggests_modal_buttons_container;
        FlowLayout flowLayout = (FlowLayout) cma1.O(i, inflate);
        if (flowLayout != null) {
            i = j8h0.comment_suggests_modal_done;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = j8h0.comment_suggests_modal_title;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    return new tbw((LinearLayout) inflate, flowLayout, buttonComponent, listHeaderComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new tzt(23, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qbw qbwVar = this.presenter;
        qbwVar.Bg(this);
        render(qbwVar.Kg());
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.obw
    public void render(sbw state) {
        getBinding().d.setTitle(state.a);
        getBinding().d.hideSubtitle();
        getBinding().d.setVisibility(!evu0.J(state.a) ? 0 : 8);
        this.itemAdapter.b(state.b);
    }
}
