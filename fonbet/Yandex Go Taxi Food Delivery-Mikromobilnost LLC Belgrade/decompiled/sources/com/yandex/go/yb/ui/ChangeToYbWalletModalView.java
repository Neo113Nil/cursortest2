package com.yandex.go.yb.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.yb.analytics.ChangeToYbWalletAnalytics$Button;
import com.yandex.go.yb.ui.ChangeToYbWalletModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bh9;
import defpackage.cma1;
import defpackage.dh9;
import defpackage.eh9;
import defpackage.gay0;
import defpackage.gh9;
import defpackage.ih9;
import defpackage.jsh0;
import defpackage.kgh0;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.tje;
import defpackage.x770;
import defpackage.ycq0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/yb/ui/ChangeToYbWalletModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Leh9;", "Landroid/content/Context;", "context", "Lgh9;", "presenter", "<init>", "(Landroid/content/Context;Lgh9;)V", "Lih9;", "viewModel", "Lzy11;", "bind", "(Lih9;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Leh9;", "Lgh9;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "dh9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeToYbWalletModalView extends SlideableBindingModalView<eh9> {
    private final gh9 presenter;

    public ChangeToYbWalletModalView(Context context, gh9 gh9Var) {
        super(context);
        this.presenter = gh9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ih9 viewModel) {
        getBinding().e.setTitle(viewModel.a);
        getBinding().d.setText(viewModel.b);
        getBinding().b.setText(viewModel.c);
        getBinding().c.setText(viewModel.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ChangeToYbWalletModalView changeToYbWalletModalView) {
        gh9 gh9Var = changeToYbWalletModalView.presenter;
        gh9Var.w.a(ChangeToYbWalletAnalytics$Button.CHANGE, gh9Var.A.getOpenReason());
        gay0 gay0Var = gh9Var.x;
        PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
        String str = gh9Var.y.a;
        ycq0 ycq0Var = gay0Var.c;
        lv90.Companion.getClass();
        ycq0Var.b(kv90.a(paymentMethod$Type, str, null));
        changeToYbWalletModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ChangeToYbWalletModalView changeToYbWalletModalView) {
        gh9 gh9Var = changeToYbWalletModalView.presenter;
        gh9Var.w.a(ChangeToYbWalletAnalytics$Button.CLOSE, gh9Var.A.getOpenReason());
        changeToYbWalletModalView.dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public eh9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(jsh0.change_to_yb_wallet_modal_view, parent, false);
        int i = kgh0.change_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = kgh0.close_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = kgh0.description;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = kgh0.title;
                    ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                    if (listHeaderComponent != null) {
                        return new eh9((LinearLayout) inflate, buttonComponent, buttonComponent2, listTextComponent, listHeaderComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gh9 gh9Var = this.presenter;
        gh9Var.Bg(new dh9());
        bh9 bh9Var = gh9Var.w;
        String openReason = gh9Var.A.getOpenReason();
        x770 x770Var = bh9Var.a;
        String str = bh9Var.b;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("button_list", str);
        }
        if (openReason != null) {
            hashMap.put("open_reason", openReason);
        }
        final int i = 1;
        x770Var.a.a("TopUpYandexWallet.ChangePaymentMethod.Shown", hashMap, 1, new HashMap());
        bind(gh9Var.z);
        final int i2 = 0;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: ch9
            public final /* synthetic */ ChangeToYbWalletModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ChangeToYbWalletModalView changeToYbWalletModalView = this.b;
                switch (i3) {
                    case 0:
                        ChangeToYbWalletModalView.onAttachedToWindow$lambda$0(changeToYbWalletModalView);
                        break;
                    default:
                        ChangeToYbWalletModalView.onAttachedToWindow$lambda$1(changeToYbWalletModalView);
                        break;
                }
            }
        });
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: ch9
            public final /* synthetic */ ChangeToYbWalletModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ChangeToYbWalletModalView changeToYbWalletModalView = this.b;
                switch (i3) {
                    case 0:
                        ChangeToYbWalletModalView.onAttachedToWindow$lambda$0(changeToYbWalletModalView);
                        break;
                    default:
                        ChangeToYbWalletModalView.onAttachedToWindow$lambda$1(changeToYbWalletModalView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
