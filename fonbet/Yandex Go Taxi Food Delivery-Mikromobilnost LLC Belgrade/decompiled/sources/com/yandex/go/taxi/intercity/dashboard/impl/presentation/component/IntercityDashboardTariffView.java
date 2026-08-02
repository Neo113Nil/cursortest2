package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import defpackage.cma1;
import defpackage.dfb;
import defpackage.ho4;
import defpackage.j8h0;
import defpackage.k4h0;
import defpackage.l76;
import defpackage.lh;
import defpackage.lkw;
import defpackage.mfb;
import defpackage.mkw;
import defpackage.nkw;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.qje;
import defpackage.rp31;
import defpackage.tkh0;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xtn;
import defpackage.ykw;
import defpackage.zkw;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SingleShimmeringBar;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001FB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00106R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/widget/Checkable;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "Lzy11;", "animateTariffIconSelectedState", "(Z)V", "setTariffIconSelectedState", "isEnabled", "setTariffLockIconVisible", "setTitleColor", "setPriceColor", "updateTextColor", "()V", "updateLockIconColor", "Lpkw;", "tariffSelectorItem", "setSubtitle", "(Lpkw;)V", "renderTariffPriceView", "render", "Landroid/widget/ImageView;", "getSelectedTariffIconView", "()Landroid/widget/ImageView;", "getUnselectedTariffIconView", "isChecked", "()Z", "checked", "setChecked", "toggle", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lzkw;", "binding", "Lzkw;", "Lmfb;", "checkDrawableProvider", "Lmfb;", "Z", "Ldfb;", "externalAccessibilityDelegate", "Ldfb;", "Lru/yandex/taxi/design/CheckBoxComponent;", "checkBox", "Lru/yandex/taxi/design/CheckBoxComponent;", "defaultAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "", "renderedItemId", "Ljava/lang/String;", "Landroid/view/ViewPropertyAnimator;", "selectedTariffIconAnimator", "Landroid/view/ViewPropertyAnimator;", "Companion", "ykw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardTariffView extends LinearLayout implements nwy0, Checkable, lh {
    private static final ykw Companion = new ykw();
    private static final long ICON_COLORING_ANIMATION_DURATION_MILLIS = 300;
    private static final float VIEW_ALPHA_OPAQUE = 1.0f;
    private static final float VIEW_ALPHA_TRANSPARENT = 0.0f;
    private final zkw binding;
    private final CheckBoxComponent checkBox;
    private final mfb checkDrawableProvider;
    private AccessibilityDelegateCompat defaultAccessibilityDelegate;
    private final dfb externalAccessibilityDelegate;
    private boolean isChecked;
    private boolean isEnabled;
    private String renderedItemId;
    private ViewPropertyAnimator selectedTariffIconAnimator;

    public IntercityDashboardTariffView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_tariff_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = j8h0.selected_tariff_icon;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = j8h0.tariff_checkbox;
            if (((CheckBoxComponent) cma1.O(i2, inflate)) != null) {
                i2 = j8h0.tariff_icon_holder;
                if (((FrameLayout) cma1.O(i2, inflate)) != null) {
                    i2 = j8h0.tariff_lock_icon;
                    ImageView imageView2 = (ImageView) cma1.O(i2, inflate);
                    if (imageView2 != null && (O = cma1.O((i2 = j8h0.tariff_price_binding), inflate)) != null) {
                        ho4 o = ho4.o(O);
                        i2 = j8h0.tariff_subtitle_text_view;
                        TextView textView = (TextView) cma1.O(i2, inflate);
                        if (textView != null) {
                            i2 = j8h0.tariff_title_text_view;
                            TextView textView2 = (TextView) cma1.O(i2, inflate);
                            if (textView2 != null) {
                                i2 = j8h0.unselected_tariff_icon;
                                ImageView imageView3 = (ImageView) cma1.O(i2, inflate);
                                if (imageView3 != null) {
                                    this.binding = new zkw((FrameLayout) inflate, imageView, imageView2, o, textView, textView2, imageView3);
                                    this.checkDrawableProvider = new mfb(context, null, xng0.listCheckBoxComponentStyle);
                                    this.externalAccessibilityDelegate = new dfb();
                                    int i3 = j8h0.tariff_checkbox;
                                    WeakHashMap weakHashMap = b.a;
                                    this.checkBox = (CheckBoxComponent) ((View) rp31.d(this, i3));
                                    this.defaultAccessibilityDelegate = new AccessibilityDelegateCompat();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void animateTariffIconSelectedState(boolean selected) {
        ViewPropertyAnimator viewPropertyAnimator = this.selectedTariffIconAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        zkw zkwVar = this.binding;
        ImageView imageView = zkwVar.b;
        ImageView imageView2 = zkwVar.g;
        if (selected) {
            imageView.setAlpha(0.0f);
            imageView2.setAlpha(1.0f);
            this.selectedTariffIconAnimator = imageView.animate().alpha(1.0f).setDuration(300L).withEndAction(new xtn(imageView2, 1));
        } else {
            imageView.setAlpha(1.0f);
            imageView2.setAlpha(0.0f);
            this.selectedTariffIconAnimator = imageView.animate().alpha(0.0f).setDuration(300L).withStartAction(new xtn(imageView2, 2));
        }
    }

    private final void renderTariffPriceView(pkw tariffSelectorItem) {
        ho4 ho4Var = this.binding.d;
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        SingleShimmeringBar singleShimmeringBar = (SingleShimmeringBar) ho4Var.b;
        nkw nkwVar = tariffSelectorItem.b().e;
        if (nkwVar instanceof mkw) {
            robotoTextView.setVisibility(0);
            singleShimmeringBar.setVisibility(8);
            robotoTextView.setText(((mkw) nkwVar).a);
        } else if (nkwVar.equals(l76.F)) {
            robotoTextView.setVisibility(8);
            singleShimmeringBar.setVisibility(0);
        } else if (!nkwVar.equals(lkw.a)) {
            w511.b();
        } else {
            robotoTextView.setVisibility(8);
            singleShimmeringBar.setVisibility(8);
        }
    }

    private final void setPriceColor(boolean isEnabled) {
        ((RobotoTextView) this.binding.d.d).setTextColor(qje.t(isEnabled ? xng0.textMain : xng0.textMinor, getContext()));
    }

    private final void setSubtitle(pkw tariffSelectorItem) {
        this.binding.e.setText(tariffSelectorItem.d ? tariffSelectorItem.b().b : tariffSelectorItem.b().c);
    }

    private final void setTariffIconSelectedState(boolean selected) {
        zkw zkwVar = this.binding;
        if (selected) {
            zkwVar.b.setAlpha(1.0f);
            this.binding.g.setAlpha(0.0f);
        } else {
            zkwVar.b.setAlpha(0.0f);
            this.binding.g.setAlpha(1.0f);
        }
    }

    private final void setTariffLockIconVisible(boolean isEnabled) {
        this.binding.c.setVisibility(!isEnabled ? 0 : 8);
    }

    private final void setTitleColor(boolean isEnabled) {
        this.binding.f.setTextColor(qje.t(isEnabled ? xng0.textMain : xng0.textMinor, getContext()));
    }

    private final void updateLockIconColor() {
        this.binding.c.setImageDrawable(vng.t(k4h0.ic_intercity_dashboard_tariff_lock, getContext()));
    }

    private final void updateTextColor() {
        setTitleColor(this.isEnabled);
        setPriceColor(this.isEnabled);
        this.binding.e.setTextColor(qje.t(xng0.textMinor, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateTextColor();
        updateLockIconColor();
        setChecked(this.isChecked);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final ImageView getSelectedTariffIconView() {
        return this.binding.b;
    }

    public final ImageView getUnselectedTariffIconView() {
        return this.binding.g;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate, reason: from getter */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.defaultAccessibilityDelegate;
    }

    public final void render(pkw tariffSelectorItem) {
        if (this.renderedItemId == null) {
            setTariffIconSelectedState(tariffSelectorItem.c);
        } else {
            boolean z = tariffSelectorItem.c;
            if (z != this.isChecked) {
                animateTariffIconSelectedState(z);
            }
        }
        String str = tariffSelectorItem.a;
        boolean z2 = tariffSelectorItem.c;
        boolean z3 = tariffSelectorItem.d;
        this.renderedItemId = str;
        this.isChecked = z2;
        this.isEnabled = z3;
        this.binding.f.setText(tariffSelectorItem.b().a);
        setSubtitle(tariffSelectorItem);
        setChecked(z2);
        setTariffLockIconVisible(z3);
        setTitleColor(z3);
        setPriceColor(z3);
        renderTariffPriceView(tariffSelectorItem);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        mfb mfbVar = this.checkDrawableProvider;
        Drawable a = checked ? mfbVar.a() : mfbVar.b();
        this.checkBox.setChecked(checked);
        this.checkBox.setImageDrawable(a);
        this.externalAccessibilityDelegate.a = checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isChecked);
    }

    public IntercityDashboardTariffView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IntercityDashboardTariffView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ IntercityDashboardTariffView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
