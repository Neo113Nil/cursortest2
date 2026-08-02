package com.yandex.go.taxi.order.tipssuggest.mvp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.cancel.v2.ui.CircleBadgeIcon;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import com.yandex.go.taxi.order.tipssuggest.mvp.TipsSuggestModalView;
import com.yandex.go.tips.ui.TipsView;
import defpackage.c230;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.ej1;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.ii8;
import defpackage.jfz0;
import defpackage.jhu0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.p8h0;
import defpackage.qdb1;
import defpackage.rgz0;
import defpackage.shz0;
import defpackage.tje;
import defpackage.uhz0;
import defpackage.uio0;
import defpackage.vhz0;
import defpackage.wpy0;
import defpackage.xhz0;
import defpackage.zgz0;
import defpackage.zkh0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/go/taxi/order/tipssuggest/mvp/TipsSuggestModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lshz0;", "Luhz0;", "Landroid/content/Context;", "context", "Lvhz0;", "presenter", "<init>", "(Landroid/content/Context;Lvhz0;)V", "Lzy11;", "setupListeners", "()V", "Lc230;", "insetsType", "()Lc230;", "onAttachedToWindow", "onDetachedFromWindow", "Lxhz0;", "uiState", "updateTexts", "(Lxhz0;)V", "Landroid/graphics/drawable/Drawable;", "image", "updateImage", "(Landroid/graphics/drawable/Drawable;)V", "", "Ljfz0;", "tips", "updateSelectedTips", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lshz0;", "Lvhz0;", "thz0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsSuggestModalView extends SlideableBindingModalView<shz0> implements uhz0 {
    public static final int $stable = 8;
    private final vhz0 presenter;

    public TipsSuggestModalView(Context context, vhz0 vhz0Var) {
        super(context);
        this.presenter = vhz0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(TipsSuggestModalView tipsSuggestModalView) {
        return tipsSuggestModalView.getBinding().a;
    }

    private final void setupListeners() {
        final int i = 0;
        qdb1.c(this, new Runnable(this) { // from class: rhz0
            public final /* synthetic */ TipsSuggestModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                TipsSuggestModalView tipsSuggestModalView = this.b;
                switch (i2) {
                    case 0:
                        tipsSuggestModalView.onBackPressed();
                        break;
                    case 1:
                        TipsSuggestModalView.setupListeners$lambda$0$0(tipsSuggestModalView);
                        break;
                    default:
                        TipsSuggestModalView.setupListeners$lambda$0$1(tipsSuggestModalView);
                        break;
                }
            }
        });
        shz0 binding = getBinding();
        binding.g.setButtonToggledListener(new wpy0(4, this));
        final int i2 = 1;
        binding.c.setDebounceClickListener(new Runnable(this) { // from class: rhz0
            public final /* synthetic */ TipsSuggestModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                TipsSuggestModalView tipsSuggestModalView = this.b;
                switch (i22) {
                    case 0:
                        tipsSuggestModalView.onBackPressed();
                        break;
                    case 1:
                        TipsSuggestModalView.setupListeners$lambda$0$0(tipsSuggestModalView);
                        break;
                    default:
                        TipsSuggestModalView.setupListeners$lambda$0$1(tipsSuggestModalView);
                        break;
                }
            }
        });
        final int i3 = 2;
        binding.b.setDebounceClickListener(new Runnable(this) { // from class: rhz0
            public final /* synthetic */ TipsSuggestModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                TipsSuggestModalView tipsSuggestModalView = this.b;
                switch (i22) {
                    case 0:
                        tipsSuggestModalView.onBackPressed();
                        break;
                    case 1:
                        TipsSuggestModalView.setupListeners$lambda$0$0(tipsSuggestModalView);
                        break;
                    default:
                        TipsSuggestModalView.setupListeners$lambda$0$1(tipsSuggestModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0$0(TipsSuggestModalView tipsSuggestModalView) {
        vhz0 vhz0Var = tipsSuggestModalView.presenter;
        jhu0 jhu0Var = vhz0Var.A;
        o61.c((o61) jhu0Var.a, "do_nothing", vhz0Var.x.a, null, 9);
        tipsSuggestModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0$1(TipsSuggestModalView tipsSuggestModalView) {
        vhz0 vhz0Var = tipsSuggestModalView.presenter;
        jhu0 jhu0Var = vhz0Var.A;
        o61.c((o61) jhu0Var.a, "turn_on", vhz0Var.x.a, Integer.valueOf(vhz0Var.D), 1);
        uio0 uio0Var = vhz0Var.z;
        ((fga0) ((rgz0) uio0Var.b)).D(vhz0Var.D);
        ((ej1) vhz0Var.C.b).r(new ii8(vhz0Var.D, 22));
        tipsSuggestModalView.onBackPressed();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public shz0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.tips_suggest_modal_view, parent, false);
        int i = p8h0.accept_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.deny_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = p8h0.description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = p8h0.header;
                    ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                    if (listHeaderComponent != null) {
                        i = p8h0.leading_icon;
                        CircleBadgeIcon circleBadgeIcon = (CircleBadgeIcon) cma1.O(i, inflate);
                        if (circleBadgeIcon != null) {
                            i = p8h0.tips;
                            TipsView tipsView = (TipsView) cma1.O(i, inflate);
                            if (tipsView != null) {
                                return new shz0((GoLinearLayout) inflate, buttonComponent, buttonComponent2, robotoTextView, listHeaderComponent, circleBadgeIcon, tipsView);
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
    public c230 insetsType() {
        return new c230(0, new zgz0(1, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vhz0 vhz0Var = this.presenter;
        vhz0Var.Bg(this);
        TipsSuggestModalExperiment tipsSuggestModalExperiment = vhz0Var.y;
        tipsSuggestModalExperiment.getClass();
        ((uhz0) vhz0Var.Dg()).updateTexts(new xhz0(d6z.Y(tipsSuggestModalExperiment, "tips_subscription_modal_title"), d6z.Y(tipsSuggestModalExperiment, "tips_subscription_modal_text"), d6z.Y(tipsSuggestModalExperiment, "tips_subscription_modal_accept"), d6z.Y(tipsSuggestModalExperiment, "tips_subscription_modal_deny")));
        ((uhz0) vhz0Var.Dg()).updateSelectedTips(vhz0Var.z.d(vhz0Var.D));
        String str = tipsSuggestModalExperiment.d;
        if (!evu0.J(str)) {
            tje.N(vhz0Var.Jg(), null, null, new TipsSuggestPresenter$initIcon$1(vhz0Var, str, null), 3);
        }
        jhu0 jhu0Var = vhz0Var.A;
        String str2 = vhz0Var.x.a;
        o61 o61Var = (o61) jhu0Var.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        o61Var.a.a("DefaultTipsModalCard.Shown", hashMap, 1, new HashMap());
        setupListeners();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.uhz0
    public void updateImage(Drawable image) {
        CircleBadgeIcon circleBadgeIcon = getBinding().f;
        circleBadgeIcon.setVisibility(image != null ? 0 : 8);
        circleBadgeIcon.setImage(image);
    }

    @Override // defpackage.uhz0
    public void updateSelectedTips(List<jfz0> tips) {
        getBinding().g.setModelsGroup(tips);
    }

    @Override // defpackage.uhz0
    public void updateTexts(xhz0 uiState) {
        shz0 binding = getBinding();
        binding.e.setTitle(uiState.a);
        binding.d.setText(uiState.b);
        binding.c.setText(uiState.d);
        binding.b.setText(uiState.c);
    }
}
