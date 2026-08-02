package com.yandex.go.yb.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.yb.experiments.SuggestYandexCardInRideExperiment;
import com.yandex.go.yb.ui.SuggestYbCardInRideView;
import defpackage.aav0;
import defpackage.bdc;
import defpackage.bf4;
import defpackage.c230;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.dav0;
import defpackage.e230;
import defpackage.eav0;
import defpackage.f8k0;
import defpackage.g8k0;
import defpackage.jsh0;
import defpackage.jst;
import defpackage.kgh0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.z9v0;
import defpackage.zxs0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B+\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lcom/yandex/go/yb/ui/SuggestYbCardInRideView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Leav0;", "Lbf4;", "Landroid/content/Context;", "context", "Laav0;", "presenter", "Lpav;", "imageLoader", "Lru/yandex/taxi/activity/h;", "backPressTracker", "<init>", "(Landroid/content/Context;Laav0;Lpav;Lru/yandex/taxi/activity/h;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Leav0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "", "onBackPress", "()Z", "Laav0;", "Lpav;", "Lru/yandex/taxi/activity/h;", "dav0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestYbCardInRideView extends SlideableBindingModalView<eav0> implements bf4 {
    private final h backPressTracker;
    private final pav imageLoader;
    private final aav0 presenter;

    public SuggestYbCardInRideView(Context context, aav0 aav0Var, pav pavVar, h hVar) {
        super(context);
        this.presenter = aav0Var;
        this.imageLoader = pavVar;
        this.backPressTracker = hVar;
        final int i = 0;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: cav0
            public final /* synthetic */ SuggestYbCardInRideView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                SuggestYbCardInRideView suggestYbCardInRideView = this.b;
                switch (i2) {
                    case 0:
                        SuggestYbCardInRideView._init_$lambda$0(suggestYbCardInRideView);
                        break;
                    default:
                        SuggestYbCardInRideView._init_$lambda$1(suggestYbCardInRideView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: cav0
            public final /* synthetic */ SuggestYbCardInRideView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                SuggestYbCardInRideView suggestYbCardInRideView = this.b;
                switch (i22) {
                    case 0:
                        SuggestYbCardInRideView._init_$lambda$0(suggestYbCardInRideView);
                        break;
                    default:
                        SuggestYbCardInRideView._init_$lambda$1(suggestYbCardInRideView);
                        break;
                }
            }
        });
        getBinding().b.setAnimationDuration(900);
        getBinding().b.updateShimmeringColor(new bdc(xng0.bgMain));
        setDismissOnBackPressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SuggestYbCardInRideView suggestYbCardInRideView) {
        aav0 aav0Var = suggestYbCardInRideView.presenter;
        zxs0 zxs0Var = aav0Var.B;
        ((g8k0) zxs0Var.a).a((String) zxs0Var.b, "close");
        ((z9v0) aav0Var.Dg()).dismiss();
        zxs0Var.r("closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SuggestYbCardInRideView suggestYbCardInRideView) {
        aav0 aav0Var = suggestYbCardInRideView.presenter;
        if (aav0Var.F) {
            jst.e.r("change payment was clicked when changing in progress", new IllegalStateException());
            return;
        }
        zxs0 zxs0Var = aav0Var.B;
        ((g8k0) zxs0Var.a).a((String) zxs0Var.b, "change");
        pzt0 pzt0Var = aav0Var.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aav0Var.G = tje.N(aav0Var.Jg(), null, null, new SuggestYbCardInRidePresenter$onAcceptClick$1(aav0Var, null), 3);
    }

    public static final /* synthetic */ eav0 access$getBinding(SuggestYbCardInRideView suggestYbCardInRideView) {
        return suggestYbCardInRideView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SuggestYbCardInRideView suggestYbCardInRideView) {
        return suggestYbCardInRideView.getBinding().a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public eav0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(jsh0.suggest_yb_card_in_ride_view, parent, false);
        int i = kgh0.suggest_yb_card_accept_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = kgh0.suggest_yb_card_close_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = kgh0.suggest_yb_card_description;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = kgh0.suggest_yb_card_header_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = kgh0.suggest_yb_card_title;
                        ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                        if (listHeaderComponent != null) {
                            return new eav0((LinearLayout) inflate, buttonComponent, buttonComponent2, listTextComponent, appCompatImageView, listHeaderComponent);
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
        return new c230(0, new ogu0(7, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aav0 aav0Var = this.presenter;
        aav0Var.Bg(new dav0(this));
        SuggestYandexCardInRideExperiment suggestYandexCardInRideExperiment = aav0Var.A;
        String str = suggestYandexCardInRideExperiment.h;
        String a = (str == null || str.length() == 0) ? null : ((m7x0) aav0Var.D).a(str);
        String Y = d6z.Y(suggestYandexCardInRideExperiment, suggestYandexCardInRideExperiment.d);
        String Y2 = d6z.Y(suggestYandexCardInRideExperiment, suggestYandexCardInRideExperiment.e);
        String Y3 = d6z.Y(suggestYandexCardInRideExperiment, suggestYandexCardInRideExperiment.f);
        String Y4 = d6z.Y(suggestYandexCardInRideExperiment, suggestYandexCardInRideExperiment.g);
        access$getBinding(this).f.setTitle(Y);
        access$getBinding(this).d.setText(Y2);
        access$getBinding(this).c.setText(Y4);
        access$getBinding(this).b.setText(Y3);
        access$getBinding(this).e.setVisibility((a == null || a.length() == 0) ? 8 : 0);
        if (a != null && a.length() != 0) {
            ((nac) this.imageLoader.a(access$getBinding(this).e)).c(a);
        }
        zxs0 zxs0Var = aav0Var.B;
        g8k0 g8k0Var = (g8k0) zxs0Var.a;
        String str2 = (String) zxs0Var.b;
        f8k0 f8k0Var = g8k0Var.a;
        f8k0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("payment_type", str2);
        }
        x4e.B(f8k0Var.a, "Ride.SuggestChangePayment.Shown", hashMap, 1);
        this.backPressTracker.a.push(this);
    }

    @Override // defpackage.bf4
    public boolean onBackPress() {
        aav0 aav0Var = this.presenter;
        if (aav0Var.F) {
            return true;
        }
        zxs0 zxs0Var = aav0Var.B;
        ((g8k0) zxs0Var.a).a((String) zxs0Var.b, "close");
        ((z9v0) aav0Var.Dg()).dismiss();
        zxs0Var.r("closed");
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        aav0 aav0Var = this.presenter;
        if (aav0Var.F) {
            return;
        }
        zxs0 zxs0Var = aav0Var.B;
        ((g8k0) zxs0Var.a).a((String) zxs0Var.b, "close");
        ((z9v0) aav0Var.Dg()).dismiss();
        zxs0Var.r("closed");
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        this.backPressTracker.a.remove(this);
        super.onDetachedFromWindow();
    }
}
