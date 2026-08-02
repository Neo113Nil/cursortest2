package com.yandex.go.chargers.debt.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.b64;
import defpackage.c230;
import defpackage.cma1;
import defpackage.dn7;
import defpackage.e230;
import defpackage.em9;
import defpackage.kp9;
import defpackage.kq9;
import defpackage.lhh0;
import defpackage.lp9;
import defpackage.nq9;
import defpackage.nsh0;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.tje;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/chargers/debt/screen/ChargersDebtModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Llp9;", "Landroid/content/Context;", "context", "Lcom/yandex/go/chargers/debt/screen/a;", "chargersDebtPresenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/chargers/debt/screen/a;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llp9;", "Lzy11;", "onAttachedToWindow", "()V", "onBackPressed", "onDetachedFromWindow", "Lcom/yandex/go/chargers/debt/screen/a;", "kp9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDebtModalView extends SlideableBindingModalView<lp9> {
    private final a chargersDebtPresenter;

    public ChargersDebtModalView(Context context, a aVar) {
        super(context);
        this.chargersDebtPresenter = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ChargersDebtModalView chargersDebtModalView) {
        chargersDebtModalView.chargersDebtPresenter.Kg(kq9.a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lp9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(nsh0.chargers_debt_modal_view, parent, false);
        int i = lhh0.divider;
        if (((CardDivider) cma1.O(i, inflate)) != null) {
            i = lhh0.loading_group;
            Group group = (Group) cma1.O(i, inflate);
            if (group != null) {
                i = lhh0.order_info;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = lhh0.pay;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = lhh0.payment_method;
                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                        if (listItemComponent2 != null) {
                            i = lhh0.shimmer_1;
                            if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                i = lhh0.shimmer_2;
                                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                    i = lhh0.shimmer_3;
                                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                        i = lhh0.shimmer_4;
                                        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                            i = lhh0.shimmer_5;
                                            if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                i = lhh0.shimmer_6;
                                                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                    i = lhh0.shimmer_7;
                                                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                        i = lhh0.subtitle;
                                                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                                        if (robotoTextView != null) {
                                                            i = lhh0.success_group;
                                                            Group group2 = (Group) cma1.O(i, inflate);
                                                            if (group2 != null) {
                                                                i = lhh0.title;
                                                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                                                if (robotoTextView2 != null) {
                                                                    return new lp9((GoConstraintLayout) inflate, group, listItemComponent, buttonComponent, listItemComponent2, robotoTextView, group2, robotoTextView2);
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
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qdb1.b(this, new dn7(24, this));
        a aVar = this.chargersDebtPresenter;
        kp9 kp9Var = new kp9(this);
        aVar.Bg(kp9Var);
        em9 em9Var = aVar.x;
        em9Var.a.a("Chargers.DebtCard.Shown", b64.w(em9Var), 1, new HashMap());
        tje.N(aVar.Jg(), null, null, new ChargersDebtPresenter$attachView$$inlined$collectIn$1(aVar.A.b, null, kp9Var), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.chargersDebtPresenter.Kg(nq9.a);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersDebtPresenter.Cg();
    }
}
