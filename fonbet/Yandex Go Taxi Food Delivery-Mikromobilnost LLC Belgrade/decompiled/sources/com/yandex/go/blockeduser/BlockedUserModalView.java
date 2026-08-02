package com.yandex.go.blockeduser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.blockeduser.BlockedUserModalView;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.a230;
import defpackage.a46;
import defpackage.cma1;
import defpackage.csh0;
import defpackage.dt41;
import defpackage.e230;
import defpackage.e46;
import defpackage.eqc;
import defpackage.ft41;
import defpackage.g47;
import defpackage.hhh0;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.kv5;
import defpackage.m950;
import defpackage.ny61;
import defpackage.qeb1;
import defpackage.qzj0;
import defpackage.seb1;
import defpackage.tje;
import defpackage.um3;
import defpackage.v36;
import defpackage.w36;
import defpackage.w511;
import defpackage.wpc;
import defpackage.y36;
import defpackage.y37;
import defpackage.yvf0;
import defpackage.z36;
import defpackage.z37;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0018\u0010!\u001a\u00060 R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/blockeduser/BlockedUserModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lw36;", "Landroid/content/Context;", "context", "Le46;", "presenter", "<init>", "(Landroid/content/Context;Le46;)V", "", "text", "Lzy11;", "setDescription", "(Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/design/ButtonComponent;", "Lg47;", ClidProvider.STATE, "render", "(Lru/yandex/taxi/design/ButtonComponent;Lg47;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw36;", "Le230;", "insetsType", "()Le230;", "Le46;", "Lv36;", "innerView", "Lv36;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlockedUserModalView extends SlideableBindingModalView<w36> {
    private final v36 innerView;
    private final e46 presenter;

    public BlockedUserModalView(Context context, e46 e46Var) {
        super(context);
        this.presenter = e46Var;
        this.innerView = new v36(this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        this.animateOnAppearing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(BlockedUserModalView blockedUserModalView) {
        a46 a46Var = blockedUserModalView.presenter.x.a;
        a46Var.A((m950) ((yvf0) a46Var.J).get(), new wpc(eqc.b, 2), new z36(a46Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(BlockedUserModalView blockedUserModalView) {
        a46 a46Var = blockedUserModalView.presenter.x.a;
        ((jj3) a46Var.K).a(new um3(Events$Zalogin$LoginContext.BLOCKED_USER, new qzj0(null, new kv5(12, a46Var)), false, false, 28), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(ButtonComponent buttonComponent, g47 g47Var) {
        if (jl40.l(g47Var, y37.a)) {
            buttonComponent.setVisibility(8);
        } else if (!(g47Var instanceof z37)) {
            w511.b();
        } else {
            buttonComponent.setText(((z37) g47Var).a);
            buttonComponent.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDescription(CharSequence text) {
        getBinding().e.setText(text);
        if (qeb1.d(text)) {
            getBinding().e.setMovementMethod(seb1.a(new kv5(11, this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setDescription$lambda$0(BlockedUserModalView blockedUserModalView, String str) {
        e46 e46Var = blockedUserModalView.presenter;
        if (e46Var != null) {
            y36 y36Var = e46Var.x;
            y36Var.getClass();
            ((ft41) ((dt41) ((yvf0) y36Var.a.G).get())).Q(new UiWebViewConfig(new CoreWebViewConfig(str, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131070, null), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null));
        }
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public w36 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(csh0.blocked_user_modal_view, parent, false);
        int i = hhh0.appeal_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = hhh0.bottom_buttons;
            BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
            if (bottomEdgeButtonLayout != null) {
                i = hhh0.change_number_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = hhh0.description;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = hhh0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new w36((GoConstraintLayout) inflate, buttonComponent, bottomEdgeButtonLayout, buttonComponent2, robotoTextView, robotoTextView2);
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
        return new a230(3, new BlockedUserModalView$insetsType$1(0, getBinding(), w36.class, "getRoot", "getRoot()Lcom/yandex/go/design/view/GoConstraintLayout;", 0), new BlockedUserModalView$insetsType$2(getBinding(), w36.class, "bottomButtons", "getBottomButtons()Lru/yandex/taxi/widget/BottomEdgeButtonLayout;", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(null);
        final int i = 0;
        setDismissOnTouchOutside(false);
        e46 e46Var = this.presenter;
        v36 v36Var = this.innerView;
        e46Var.Bg(v36Var);
        tje.N(e46Var.Jg(), null, null, new BlockedUserPresenter$attachView$1(e46Var, v36Var, null), 3);
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: u36
            public final /* synthetic */ BlockedUserModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                BlockedUserModalView blockedUserModalView = this.b;
                switch (i2) {
                    case 0:
                        BlockedUserModalView.onAttachedToWindow$lambda$0(blockedUserModalView);
                        break;
                    default:
                        BlockedUserModalView.onAttachedToWindow$lambda$1(blockedUserModalView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: u36
            public final /* synthetic */ BlockedUserModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                BlockedUserModalView blockedUserModalView = this.b;
                switch (i22) {
                    case 0:
                        BlockedUserModalView.onAttachedToWindow$lambda$0(blockedUserModalView);
                        break;
                    default:
                        BlockedUserModalView.onAttachedToWindow$lambda$1(blockedUserModalView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
