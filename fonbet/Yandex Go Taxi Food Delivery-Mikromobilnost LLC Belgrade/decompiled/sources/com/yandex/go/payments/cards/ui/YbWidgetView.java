package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.cpb1;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.kdc;
import defpackage.luh0;
import defpackage.mfb;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pz51;
import defpackage.tje;
import defpackage.vql;
import defpackage.xng0;
import defpackage.ymp0;
import kotlin.Metadata;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0014J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J+\u00102\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u00100\u001a\u00020 2\b\b\u0001\u00101\u001a\u00020 ¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u0014J/\u00109\u001a\u00020\u000b2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020 H\u0014¢\u0006\u0004\b9\u0010:J\u001d\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020AH\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/yandex/go/payments/cards/ui/YbWidgetView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lmfb;", "checkDrawableProvider", "<init>", "(Landroid/content/Context;Lmfb;)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "Lkdc;", "subtitleColor", "setSubtitle", "(Ljava/lang/CharSequence;Lkdc;)V", "hideCheckable", "()V", "", "isCheckable", "setCheckable", "(Z)V", "isChecked", "setCheckedState", "Landroid/widget/ImageView;", "getLeadView", "()Landroid/widget/ImageView;", "isVisible", "setBottomActionsContainerVisibility", "", "horizontalPadding", "setHorizontalPadding", "(I)V", "setDisabledState", "setEnabledState", "Lru/yandex/taxi/widget/buttons/ButtonTrailView;", "getTrailButton", "()Lru/yandex/taxi/widget/buttons/ButtonTrailView;", "Lru/yandex/taxi/design/ButtonComponent;", "getMainButton", "()Lru/yandex/taxi/design/ButtonComponent;", "getSecondaryButton", "Lru/yandex/taxi/design/BadgeView;", "getBadgeView", "()Lru/yandex/taxi/design/BadgeView;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "setBadge", "(Ljava/lang/CharSequence;II)V", "hideBadge", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/design/utils/DividerPosition;", "position", "Lru/yandex/taxi/design/utils/DividerType;", "type", "setDividers", "(Lru/yandex/taxi/design/utils/DividerPosition;Lru/yandex/taxi/design/utils/DividerType;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lmfb;", "Lpz51;", "binding", "Lpz51;", "Lvql;", "dividerDrawDelegate", "Lvql;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbWidgetView extends LinearLayout implements nwy0 {
    public static final int $stable = 8;
    private final pz51 binding;
    private final mfb checkDrawableProvider;
    private final vql dividerDrawDelegate;

    public YbWidgetView(Context context, mfb mfbVar) {
        super(context);
        this.checkDrawableProvider = mfbVar;
        LayoutInflater.from(context).inflate(luh0.yb_widget_view, this);
        int i = e6h0.yb_action_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
        if (linearLayout != null) {
            i = e6h0.yb_badge;
            BadgeView badgeView = (BadgeView) cma1.O(i, this);
            if (badgeView != null) {
                i = e6h0.yb_lead_image;
                ImageView imageView = (ImageView) cma1.O(i, this);
                if (imageView != null) {
                    i = e6h0.yb_main_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                    if (buttonComponent != null) {
                        i = e6h0.yb_main_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
                        if (constraintLayout != null) {
                            i = e6h0.yb_secondary_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                            if (buttonComponent2 != null) {
                                i = e6h0.yb_subtitle;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                if (robotoTextView != null) {
                                    i = e6h0.yb_title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                                    if (robotoTextView2 != null) {
                                        i = e6h0.yb_title_container;
                                        if (((LinearLayout) cma1.O(i, this)) != null) {
                                            i = e6h0.yb_trail_button;
                                            ButtonTrailView buttonTrailView = (ButtonTrailView) cma1.O(i, this);
                                            if (buttonTrailView != null) {
                                                i = e6h0.yb_trail_image;
                                                if (((ImageView) cma1.O(i, this)) != null) {
                                                    this.binding = new pz51(this, linearLayout, badgeView, imageView, buttonComponent, constraintLayout, buttonComponent2, robotoTextView, robotoTextView2, buttonTrailView);
                                                    this.dividerDrawDelegate = new vql(context, null, new ymp0(18, this));
                                                    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                                    setOrientation(1);
                                                    buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
                                                    buttonComponent2.setButtonBackground(new bdc(xng0.controlMinor));
                                                    androidx.core.view.b.p(this, buttonTrailView.getDefaultAccessibilityDelegate());
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.dividerDrawDelegate.b(getContext());
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.dividerDrawDelegate.a(canvas);
    }

    public final BadgeView getBadgeView() {
        return this.binding.c;
    }

    public final ImageView getLeadView() {
        return this.binding.d;
    }

    public final ButtonComponent getMainButton() {
        return this.binding.e;
    }

    public final ButtonComponent getSecondaryButton() {
        return this.binding.g;
    }

    public final ButtonTrailView getTrailButton() {
        return this.binding.j;
    }

    public final void hideBadge() {
        this.binding.c.setVisibility(8);
    }

    public final void hideCheckable() {
        this.binding.j.setVisibility(8);
        androidx.core.view.b.p(this, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.dividerDrawDelegate.d(w, h);
    }

    public final void setBadge(CharSequence title, int backgroundColor, int textColor) {
        if (title == null || title.length() == 0) {
            this.binding.c.setVisibility(8);
            return;
        }
        this.binding.c.setVisibility(0);
        this.binding.c.setText(title);
        this.binding.c.setTintColor(backgroundColor);
        this.binding.c.setTextColor(textColor);
        this.binding.c.setBackground(cpb1.i(tje.r(mrg0.go_design_m_space, getContext()), backgroundColor).k());
        int u = tje.u(8, getContext());
        int u2 = tje.u(2, getContext());
        this.binding.c.setPadding(u, u2, u, u2);
    }

    public final void setBottomActionsContainerVisibility(boolean isVisible) {
        this.binding.b.setVisibility(isVisible ? 0 : 8);
    }

    public final void setCheckable(boolean isCheckable) {
        this.binding.j.setVisibility(0);
        androidx.core.view.b.p(this, this.binding.j.getDefaultAccessibilityDelegate());
        this.binding.j.setCheckBoxVisible(isCheckable);
    }

    public final void setCheckedState(boolean isChecked) {
        mfb mfbVar = this.checkDrawableProvider;
        this.binding.j.setCheckMark(isChecked, isChecked ? mfbVar.a() : mfbVar.b());
    }

    public final void setDisabledState() {
        this.binding.f.setAlpha(0.5f);
        this.binding.f.setEnabled(false);
        this.binding.j.setEnabled(false);
    }

    public final void setDividers(DividerPosition position, DividerType type) {
        this.dividerDrawDelegate.e(position, type);
    }

    public final void setEnabledState() {
        this.binding.f.setAlpha(1.0f);
        this.binding.f.setEnabled(true);
        this.binding.j.setEnabled(true);
    }

    public final void setHorizontalPadding(int horizontalPadding) {
        this.binding.f.setPadding(horizontalPadding, 0, horizontalPadding, 0);
        this.binding.b.setPadding(horizontalPadding, 0, horizontalPadding, 0);
    }

    public final void setSubtitle(CharSequence subtitle, kdc subtitleColor) {
        this.binding.h.setText(subtitle);
        this.binding.h.setVisibility((subtitle == null || evu0.J(subtitle)) ? 8 : 0);
        this.binding.h.setTextColor(subtitleColor);
    }

    public final void setTitle(CharSequence title) {
        this.binding.i.setText(title);
    }
}
