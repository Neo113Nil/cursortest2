package com.yandex.go.overdraft.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.overdraft.ui.DebtsModalView;
import defpackage.brh0;
import defpackage.cma1;
import defpackage.dug;
import defpackage.g1a0;
import defpackage.ny61;
import defpackage.oug;
import defpackage.oxe;
import defpackage.pug;
import defpackage.qdb1;
import defpackage.z0a0;
import defpackage.zeh0;
import defpackage.zy80;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0018\u001a\u00060\u0017R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/overdraft/ui/DebtsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpug;", "Landroid/content/Context;", "styledContext", "Ldug;", "debtPresenter", "Lz0a0;", "paymentIconLoader", "<init>", "(Landroid/content/Context;Ldug;Lz0a0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpug;", "Ldug;", "Lz0a0;", "Loug;", "mvpView", "Loug;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DebtsModalView extends SlideableBindingModalView<pug> {
    private final dug debtPresenter;
    private final oug mvpView;
    private final z0a0 paymentIconLoader;

    public DebtsModalView(Context context, final dug dugVar, z0a0 z0a0Var) {
        super(context);
        this.debtPresenter = dugVar;
        this.paymentIconLoader = z0a0Var;
        this.mvpView = new oug(this);
        final int i = 0;
        qdb1.b(this, new Runnable() { // from class: nug
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                dug dugVar2 = dugVar;
                switch (i2) {
                    case 0:
                        DebtsModalView._init_$onDismiss(dugVar2);
                        break;
                    case 1:
                        DebtsModalView._init_$onDismiss$0(dugVar2);
                        break;
                    default:
                        DebtsModalView._init_$onDismiss$1(dugVar2);
                        break;
                }
            }
        });
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        final int i2 = 1;
        setOnTouchOutsideListener(new Runnable() { // from class: nug
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                dug dugVar2 = dugVar;
                switch (i22) {
                    case 0:
                        DebtsModalView._init_$onDismiss(dugVar2);
                        break;
                    case 1:
                        DebtsModalView._init_$onDismiss$0(dugVar2);
                        break;
                    default:
                        DebtsModalView._init_$onDismiss$1(dugVar2);
                        break;
                }
            }
        });
        final int i3 = 2;
        setOnBackPressedListener(new Runnable() { // from class: nug
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                dug dugVar2 = dugVar;
                switch (i22) {
                    case 0:
                        DebtsModalView._init_$onDismiss(dugVar2);
                        break;
                    case 1:
                        DebtsModalView._init_$onDismiss$0(dugVar2);
                        break;
                    default:
                        DebtsModalView._init_$onDismiss$1(dugVar2);
                        break;
                }
            }
        });
        setOnSlideOutListener(new oxe(13, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(DebtsModalView debtsModalView) {
        debtsModalView.debtPresenter.x.c(zy80.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onDismiss(dug dugVar) {
        dugVar.x.c(zy80.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onDismiss$0(dug dugVar) {
        dugVar.x.c(zy80.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onDismiss$1(dug dugVar) {
        dugVar.x.c(zy80.a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pug bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(brh0.debts_modal_view, parent, false);
        int i = zeh0.bottom_container;
        if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
            i = zeh0.card_divider;
            if (((CardDivider) cma1.O(i, inflate)) != null) {
                i = zeh0.debt_info_group;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    i = zeh0.debt_progress_group;
                    LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                    if (linearLayout2 != null) {
                        i = zeh0.description;
                        ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                        if (listTextComponent != null) {
                            i = zeh0.header;
                            ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                            if (listHeaderComponent != null) {
                                i = zeh0.payment;
                                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                if (listItemComponent != null) {
                                    i = zeh0.plus;
                                    ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                                    if (listItemSwitchComponent != null) {
                                        i = zeh0.primary_button;
                                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                        if (buttonComponent != null) {
                                            i = zeh0.primary_ride;
                                            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent2 != null) {
                                                i = zeh0.secondary_button;
                                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                                if (buttonComponent2 != null) {
                                                    i = zeh0.secondary_ride;
                                                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                                    if (listItemComponent3 != null) {
                                                        i = zeh0.top_container;
                                                        if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                                            return new pug((FrameLayout) inflate, linearLayout, linearLayout2, listTextComponent, listHeaderComponent, listItemComponent, listItemSwitchComponent, buttonComponent, listItemComponent2, buttonComponent2, listItemComponent3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        dug dugVar = this.debtPresenter;
        dugVar.Bg(this.mvpView);
        com.yandex.go.coroutines.b.g(dugVar.Jg(), null, null, new DebtPresenter$startCollectUiState$1(dugVar, null), 3);
        dugVar.D.b();
        ((g1a0) this.paymentIconLoader).a();
        super.onAttachedToWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.debtPresenter.Cg();
        ((g1a0) this.paymentIconLoader).d();
        super.onDetachedFromWindow();
    }
}
