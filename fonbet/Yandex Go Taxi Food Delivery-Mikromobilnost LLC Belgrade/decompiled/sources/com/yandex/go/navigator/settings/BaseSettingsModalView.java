package com.yandex.go.navigator.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aa5;
import defpackage.c230;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.js4;
import defpackage.ler0;
import defpackage.ny61;
import defpackage.per0;
import defpackage.qje;
import defpackage.x95;
import defpackage.xng0;
import defpackage.y95;
import defpackage.z5h0;
import defpackage.zmh;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/yandex/go/navigator/settings/BaseSettingsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lper0;", "Landroid/content/Context;", "context", "Laa5;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Laa5;Lip11;)V", "Lzy11;", "addShadowScrollListener", "()V", "updateShadowVisibility", "", "canScrollDown", "()Z", "canScrollUp", "Lc230;", "insetsType", "()Lc230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lper0;", "onAttachedToWindow", "onDetachedFromWindow", "Laa5;", "Ller0;", "adapter$delegate", "Li3y;", "getAdapter", "()Ller0;", "adapter", "y95", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseSettingsModalView extends SlideableBindingModalView<per0> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final aa5 presenter;

    public BaseSettingsModalView(Context context, aa5 aa5Var, ip11 ip11Var) {
        super(context);
        this.presenter = aa5Var;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, BaseSettingsModalView$adapter$2.b);
        RecyclerView recyclerView = getBinding().f;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(getAdapter());
        setArrowDefaultColor(qje.t(xng0.textInvert, context));
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        addShadowScrollListener();
        getBinding().c.setTypeface(((zmh) ip11Var).d());
    }

    private final void addShadowScrollListener() {
        getBinding().d.addScrollChangeListener(new x95(0, this));
    }

    private final boolean canScrollDown() {
        return getBinding().d.canScrollVertically(1);
    }

    private final boolean canScrollUp() {
        return getBinding().d.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ler0 getAdapter() {
        return (ler0) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeSettings(aa5 aa5Var) {
        aa5Var.A.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShadowVisibility() {
        getBinding().g.setVisibility(canScrollDown() ? 0 : 8);
        getBinding().h.setVisibility(canScrollUp() ? 0 : 8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public per0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.settings_view, parent, false);
        int i = z5h0.bottom_container;
        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
            GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
            i = z5h0.first_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = z5h0.screen_title;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = z5h0.scroll_view;
                    NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                    if (nestedScrollViewAdvanced != null) {
                        i = z5h0.second_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = z5h0.settings_list;
                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                            if (recyclerView != null) {
                                i = z5h0.shadow_btn;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout != null) {
                                    i = z5h0.shadow_title;
                                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                    if (goFrameLayout2 != null) {
                                        i = z5h0.title_container;
                                        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
                                            return new per0(goLinearLayout, buttonComponent, robotoTextView, nestedScrollViewAdvanced, buttonComponent2, recyclerView, goFrameLayout, goFrameLayout2);
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
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Kg(new y95(this));
        getBinding().e.setDebounceClickListener(new js4(6, this));
        setOnTouchOutsideListener(new js4(7, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
