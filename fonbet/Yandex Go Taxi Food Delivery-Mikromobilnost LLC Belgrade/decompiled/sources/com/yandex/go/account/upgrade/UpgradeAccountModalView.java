package com.yandex.go.account.upgrade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a9h0;
import defpackage.bh11;
import defpackage.cma1;
import defpackage.el11;
import defpackage.i921;
import defpackage.k921;
import defpackage.klh0;
import defpackage.l921;
import defpackage.m921;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/account/upgrade/UpgradeAccountModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lk921;", "Ll921;", "navigator", "Lm921;", "uiState", "Landroid/content/Context;", "context", "<init>", "(Ll921;Lm921;Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk921;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ll921;", "n921", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpgradeAccountModalView extends BindingModalView<k921> {
    public static final int $stable = 8;
    private final l921 navigator;

    public UpgradeAccountModalView(l921 l921Var, m921 m921Var, Context context) {
        super(context);
        this.navigator = l921Var;
        getBinding().d.setTitle(m921Var.b);
        getBinding().c.setText(m921Var.c);
        getBinding().b.setText(m921Var.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(UpgradeAccountModalView upgradeAccountModalView) {
        i921 i921Var = (i921) ((el11) upgradeAccountModalView.navigator).b;
        tje.N(i921Var.o(), null, null, new UpgradeAccountModalRouterImpl$provideModalView$2$1(i921Var, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public k921 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(klh0.upgrade_account_modal_view, parent, false);
        int i = a9h0.confirm_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = a9h0.message;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = a9h0.title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                if (listTitleComponent != null) {
                    return new k921((LinearLayout) inflate, buttonComponent, listTextComponent, listTitleComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
        getBinding().b.setDebounceClickListener(new bh11(9, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().b.setDebounceClickListener(null);
    }
}
