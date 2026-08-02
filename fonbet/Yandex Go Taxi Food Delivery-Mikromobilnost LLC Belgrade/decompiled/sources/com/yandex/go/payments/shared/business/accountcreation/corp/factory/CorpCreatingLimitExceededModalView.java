package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.payments.shared.y;
import defpackage.cma1;
import defpackage.e6h0;
import defpackage.ej6;
import defpackage.hve;
import defpackage.luh0;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.pj;
import defpackage.s8f;
import defpackage.v4a;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/factory/CorpCreatingLimitExceededModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lhve;", "Landroid/content/Context;", "context", "Lej6;", "branchedAnalytics", "Ls8f;", "screenInfo", "<init>", "(Landroid/content/Context;Lej6;Ls8f;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lhve;", "Lzy11;", "onAttachedToWindow", "()V", "onDismissManually", "onDetachedFromWindow", "Lej6;", "Ls8f;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpCreatingLimitExceededModalView extends SlideableBindingModalView<hve> {
    public static final int $stable = 8;
    private final ej6 branchedAnalytics;
    private final s8f screenInfo;

    public CorpCreatingLimitExceededModalView(Context context, ej6 ej6Var, s8f s8fVar) {
        super(context);
        this.branchedAnalytics = ej6Var;
        this.screenInfo = s8fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CorpCreatingLimitExceededModalView corpCreatingLimitExceededModalView) {
        p1b p1bVar = corpCreatingLimitExceededModalView.screenInfo.a;
        ((Runnable) p1bVar.a).run();
        ((y) p1bVar.b).c();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public hve bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.corp_creating_limit_exceeded_screen, parent, false);
        int i = e6h0.corp_success_button_accept;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = e6h0.corp_success_subtitle;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = e6h0.corp_success_title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                if (listTitleComponent != null) {
                    i = e6h0.corp_success_title_icon;
                    if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                        return new hve((NestedScrollView) inflate, buttonComponent, listItemComponent, listTitleComponent);
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
        pj pjVar = this.branchedAnalytics.d;
        pjVar.getClass();
        pjVar.a.a("CreateCorpLimitExceededScreen.Shown", new HashMap(), 1, new HashMap());
        getBinding().b.setDebounceClickListener(new v4a(23, this));
        getBinding().d.setTitle(this.screenInfo.b.b);
        getBinding().c.setTitle(this.screenInfo.b.c);
        getBinding().b.setText(this.screenInfo.b.d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pj pjVar = this.branchedAnalytics.d;
        pjVar.getClass();
        pjVar.a.a("CreateCorpLimitExceededScreen.Closed", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        p1b p1bVar = this.screenInfo.a;
        ((Runnable) p1bVar.a).run();
        ((y) p1bVar.b).c();
    }
}
