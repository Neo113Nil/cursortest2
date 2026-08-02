package com.yandex.go.inapp_calls.ui.defaultoutgoingcall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a230;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.oth0;
import defpackage.oxe;
import defpackage.qu;
import defpackage.ra9;
import defpackage.rih0;
import defpackage.v7h;
import defpackage.w7h;
import defpackage.y7h;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/inapp_calls/ui/defaultoutgoingcall/DefaultCallTypeModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lw7h;", "Landroid/content/Context;", "context", "Ly7h;", "presenter", "<init>", "(Landroid/content/Context;Ly7h;)V", "La230;", "insetsType", "()La230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw7h;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ly7h;", "Lcom/yandex/go/inapp_calls/ui/defaultoutgoingcall/b;", "adapter", "Lcom/yandex/go/inapp_calls/ui/defaultoutgoingcall/b;", "v7h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultCallTypeModalView extends BindingModalView<w7h> {
    private final b adapter;
    private final y7h presenter;

    public DefaultCallTypeModalView(Context context, y7h y7hVar) {
        super(context);
        this.presenter = y7hVar;
        this.adapter = new b(getBinding().b, new DefaultCallTypeModalView$adapter$1(1, y7hVar, y7h.class, "onItemClick", "onItemClick(Lcom/yandex/go/inapp_calls/ui/defaultoutgoingcall/DefaultCallTypeUiStateItem;)V", 0));
        getBinding().c.setOnNavigationClickListener(new oxe(17, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DefaultCallTypeModalView defaultCallTypeModalView) {
        ((ra9) defaultCallTypeModalView.presenter.y.b).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public w7h bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(oth0.default_call_type_modal_view, parent, false);
        int i = rih0.call_type_option_group;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = rih0.call_type_toolbar;
            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
            if (toolbarComponent != null) {
                return new w7h((LinearLayout) inflate, linearLayout, toolbarComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public a230 insetsType() {
        return new a230(3, new DefaultCallTypeModalView$insetsType$1(getBinding(), w7h.class, "callTypeToolbar", "getCallTypeToolbar()Lru/yandex/taxi/design/ToolbarComponent;", 0), new DefaultCallTypeModalView$insetsType$2(getBinding(), w7h.class, "callTypeOptionGroup", "getCallTypeOptionGroup()Landroid/widget/LinearLayout;", 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y7h y7hVar = this.presenter;
        v7h v7hVar = new v7h(this);
        y7hVar.Bg(v7hVar);
        com.yandex.go.coroutines.b.g(y7hVar.Jg(), null, null, new DefaultCallTypePresenter$attachView$1(y7hVar, v7hVar, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
