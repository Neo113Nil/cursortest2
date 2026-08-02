package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.payments.shared.y;
import defpackage.b1;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.e6h0;
import defpackage.ej6;
import defpackage.g18;
import defpackage.i3v0;
import defpackage.k7x0;
import defpackage.l8f;
import defpackage.luh0;
import defpackage.lyc;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.v4a;
import defpackage.vbb;
import defpackage.vqb;
import defpackage.wve;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/factory/CorpSuccessDraftCreatedModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwve;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Ll8f;", "createSuccessDraftTextFactory", "Lej6;", "branchedAnalytics", "Li3v0;", "screenInfo", "<init>", "(Landroid/content/Context;Lk7x0;Lpav;Ll8f;Lej6;Li3v0;)V", "Lg18;", "startLoadIcon", "()Lg18;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwve;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lk7x0;", "Lpav;", "Ll8f;", "Lej6;", "Li3v0;", "loadIconCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpSuccessDraftCreatedModalView extends SlideableBindingModalView<wve> {
    public static final int $stable = 8;
    private final ej6 branchedAnalytics;
    private final l8f createSuccessDraftTextFactory;
    private final pav imageLoader;
    private g18 loadIconCancellable;
    private final i3v0 screenInfo;
    private final k7x0 tagUrlFormatter;

    public CorpSuccessDraftCreatedModalView(Context context, k7x0 k7x0Var, pav pavVar, l8f l8fVar, ej6 ej6Var, i3v0 i3v0Var) {
        super(context);
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
        this.createSuccessDraftTextFactory = l8fVar;
        this.branchedAnalytics = ej6Var;
        this.screenInfo = i3v0Var;
        this.loadIconCancellable = g18.u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CorpSuccessDraftCreatedModalView corpSuccessDraftCreatedModalView) {
        vbb vbbVar = corpSuccessDraftCreatedModalView.screenInfo.a;
        ((Runnable) vbbVar.a).run();
        ((y) vbbVar.b).c();
    }

    private final g18 startLoadIcon() {
        String a = ((m7x0) this.tagUrlFormatter).a(this.screenInfo.c.e);
        AppCompatImageView appCompatImageView = getBinding().e;
        nac nacVar = (nac) this.imageLoader.a(appCompatImageView);
        nacVar.i = new lyc(22, appCompatImageView);
        nacVar.h = new vqb(28, appCompatImageView);
        return nacVar.c(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startLoadIcon$lambda$0(AppCompatImageView appCompatImageView) {
        appCompatImageView.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startLoadIcon$lambda$1(AppCompatImageView appCompatImageView, Drawable drawable) {
        appCompatImageView.setVisibility(0);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wve bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.corp_success_draft_created_screen, parent, false);
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
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        return new wve((NestedScrollView) inflate, buttonComponent, listItemComponent, listTitleComponent, appCompatImageView);
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
        this.loadIconCancellable = startLoadIcon();
        b1 b1Var = this.branchedAnalytics.c;
        b1Var.getClass();
        b1Var.a.a("CreateCorpSuccessScreen.Shown", new HashMap(), 1, new HashMap());
        getBinding().b.setDebounceClickListener(new v4a(25, this));
        getBinding().d.setTitle(this.screenInfo.c.b);
        l8f l8fVar = this.createSuccessDraftTextFactory;
        i3v0 i3v0Var = this.screenInfo;
        String str = i3v0Var.c.c;
        String str2 = i3v0Var.b;
        l8fVar.getClass();
        getBinding().c.setTitle(Html.fromHtml(cvu0.v(str, "$$EMAIL$$", "<b>" + str2 + "<\\b>", false), 0));
        getBinding().b.setText(this.screenInfo.c.d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b1 b1Var = this.branchedAnalytics.c;
        b1Var.getClass();
        b1Var.a.a("CreateCorpSuccessScreen.Closed", new HashMap(), 1, new HashMap());
        this.loadIconCancellable.cancel();
    }
}
