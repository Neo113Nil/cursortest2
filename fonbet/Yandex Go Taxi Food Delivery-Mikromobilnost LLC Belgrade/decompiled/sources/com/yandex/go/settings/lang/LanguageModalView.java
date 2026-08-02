package com.yandex.go.settings.lang;

import android.content.Context;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a230;
import defpackage.cma1;
import defpackage.cne0;
import defpackage.dhv;
import defpackage.dkh0;
import defpackage.dzg0;
import defpackage.g8e;
import defpackage.hst;
import defpackage.i5z;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ko21;
import defpackage.m03;
import defpackage.ny61;
import defpackage.pho;
import defpackage.qje;
import defpackage.r7v;
import defpackage.rx2;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sho;
import defpackage.t7h0;
import defpackage.trx;
import defpackage.unr0;
import defpackage.vnb1;
import defpackage.vng;
import defpackage.w83;
import defpackage.wu2;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.io.b;
import kotlin.text.Regex;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0014¢\u0006\u0004\b&\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/go/settings/lang/LanguageModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ltrx;", "Landroid/content/Context;", "context", "Lj5z;", "localeHelper", "<init>", "(Landroid/content/Context;Lj5z;)V", "Li5z;", "locale", "", "selected", "Landroid/view/View;", "getLangView", "(Li5z;Z)Landroid/view/View;", "La230;", "insetsType", "()La230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltrx;", "Lzy11;", "onAttachedToWindow", "()V", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lj5z;", "Ljava/lang/Runnable;", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LanguageModalView extends SlideableBindingModalView<trx> {
    public static final int $stable = 8;
    private final j5z localeHelper;
    private Runnable onBackPressedListener;

    public LanguageModalView(Context context, j5z j5zVar) {
        super(context);
        this.localeHelper = j5zVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    private final View getLangView(i5z locale, boolean selected) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        listItemCheckComponent.setBackground(vng.t(dzg0.bg_main_ripple, getContext()));
        if (selected) {
            listItemCheckComponent.setChecked(true);
            listItemCheckComponent.setCheckToggleByClickEnabled(false);
            listItemCheckComponent.setSubtitle("");
        } else {
            listItemCheckComponent.setDebounceClickListener(new r7v(17, this, locale));
            Context context = getContext();
            locale.getClass();
            listItemCheckComponent.setSubtitle(context.getResources().getString(locale.b));
        }
        Context context2 = getContext();
        locale.getClass();
        listItemCheckComponent.setTitle(context2.getResources().getString(locale.c));
        return listItemCheckComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLangView$lambda$0(LanguageModalView languageModalView, i5z i5zVar) {
        j5z j5zVar = languageModalView.localeHelper;
        Context p = c.p(languageModalView);
        Context context = j5zVar.f;
        rx2 rx2Var = j5zVar.d;
        hst hstVar = jst.e;
        unr0.C(new Object[]{i5zVar}, 1, "lang: prepare for [%s]", hstVar);
        ko21 ko21Var = j5zVar.a;
        i5z a = ko21Var.a();
        if (jl40.l(qje.E(i5zVar.a()), qje.E(a.a()))) {
            String.format("Skip changing locale to the same: [%s]", Arrays.copyOf(new Object[]{i5zVar}, 1));
            return;
        }
        cne0 cne0Var = ko21Var.b;
        cne0Var.r(ko21Var.c, i5zVar.a());
        cne0Var.b();
        String locale = a.a.toString();
        String locale2 = i5zVar.a.toString();
        rx2Var.getClass();
        pho phoVar = rx2Var.a;
        HashMap u = g8e.u("prevLocale", locale, "newLocale", locale2);
        HashMap hashMap = new HashMap();
        Regex regex = sho.a;
        phoVar.a(sb2.q("preferredLocaleChanged", u), u, 1, hashMap);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null && cacheDir.isDirectory()) {
            if (b.l(cacheDir)) {
                HashMap hashMap2 = new HashMap();
                phoVar.a(sb2.q("cacheCleared", hashMap2), hashMap2, 1, new HashMap());
            } else {
                hstVar.k(new IllegalStateException("Cannot clear cache due to locale changing"), "Cannot clear cache due to locale changing");
            }
            j5zVar.c.a("cache_emptiness").a();
        }
        if (p == null) {
            p = context;
        }
        ((m03) j5zVar.e.get()).a(p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(LanguageModalView languageModalView) {
        Runnable runnable = languageModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        vnb1.b(this, startAction, endAction, false, NavigationDirection.BACKWARD);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        vnb1.b(this, onAnimateShowStartAction, onAnimateShowEndAction, true, NavigationDirection.FORWARD);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public trx bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dkh0.language_modal_view_layout, parent, false);
        int i = t7h0.lang_list;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = t7h0.toolbar;
            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
            if (toolbarComponent != null) {
                return new trx((LinearLayout) inflate, linearLayout, toolbarComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public a230 insetsType() {
        return new a230(3, new LanguageModalView$insetsType$1(getBinding(), trx.class, "toolbar", "getToolbar()Lru/yandex/taxi/design/ToolbarComponent;", 0), new LanguageModalView$insetsType$2(getBinding(), trx.class, "langList", "getLangList()Landroid/widget/LinearLayout;", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().c.setOnNavigationClickListener(new dhv(17, this));
        getBinding().c.requestAccessibilityFocus();
        j5z j5zVar = this.localeHelper;
        LocaleList locales = j5zVar.f.getResources().getConfiguration().getLocales();
        j5zVar.b.getClass();
        int i = 0;
        for (Object obj : a.x0(wu2.b, new w83(1, j5zVar, locales))) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            getBinding().b.addView(getLangView((i5z) obj, i == 0));
            i = i2;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = onBackPressedListener;
    }
}
