package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.b111;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.j111;
import defpackage.kdc;
import defpackage.kux0;
import defpackage.luh0;
import defpackage.mfb;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.u601;
import defpackage.utg0;
import defpackage.vql;
import defpackage.xng0;
import defpackage.y2h0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001c¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001c¢\u0006\u0004\b'\u0010\u001fJ\u0015\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001c¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010+\u001a\u00020\t2\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\t¢\u0006\u0004\b.\u0010\u000bJ\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u000202¢\u0006\u0004\b5\u00104J/\u0010:\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020)H\u0014¢\u0006\u0004\b:\u0010;J\u001d\u0010@\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/yandex/go/payments/cards/ui/TransportCardWidgetView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lmfb;", "checkDrawableProvider", "<init>", "(Landroid/content/Context;Lmfb;)V", "Lzy11;", "hideCheckable", "()V", "Lb111;", "statusDescription", "Lkotlin/Function0;", "onClickListener", "setStatusDescriptionMessage", "(Lb111;Lsls;)V", "clearStatusDescription", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "Lkdc;", "subtitleColor", "setSubtitle", "(Ljava/lang/CharSequence;Lkdc;)V", "", "isCheckable", "setCheckable", "(Z)V", "isChecked", "setCheckedState", "Landroid/widget/ImageView;", "getLeadView", "()Landroid/widget/ImageView;", "isVisible", "setBottomActionsContainerVisibility", "setMainButtonVisibility", "setSecondaryButtonVisibility", "", "horizontalPadding", "setHorizontalPadding", "(I)V", "setDisabledState", "setEnabledState", "Lru/yandex/taxi/widget/buttons/ButtonTrailView;", "getTrailButton", "()Lru/yandex/taxi/widget/buttons/ButtonTrailView;", "Lru/yandex/taxi/design/ButtonComponent;", "getMainButton", "()Lru/yandex/taxi/design/ButtonComponent;", "getSecondaryButton", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/design/utils/DividerPosition;", "position", "Lru/yandex/taxi/design/utils/DividerType;", "type", "setDividers", "(Lru/yandex/taxi/design/utils/DividerPosition;Lru/yandex/taxi/design/utils/DividerType;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lmfb;", "Lj111;", "binding", "Lj111;", "Lvql;", "dividerDrawDelegate", "Lvql;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransportCardWidgetView extends LinearLayout implements nwy0 {
    public static final int $stable = 8;
    private final j111 binding;
    private final mfb checkDrawableProvider;
    private final vql dividerDrawDelegate;

    public TransportCardWidgetView(Context context, mfb mfbVar) {
        super(context);
        this.checkDrawableProvider = mfbVar;
        LayoutInflater.from(context).inflate(luh0.transport_card_widget_view, this);
        int i = e6h0.transport_card_action_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
        if (linearLayout != null) {
            i = e6h0.transport_card_lead_image;
            ImageView imageView = (ImageView) cma1.O(i, this);
            if (imageView != null) {
                i = e6h0.transport_card_main_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                if (buttonComponent != null) {
                    i = e6h0.transport_card_main_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
                    if (constraintLayout != null) {
                        i = e6h0.transport_card_notification_container;
                        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
                        if (goFrameLayout != null) {
                            i = e6h0.transport_card_secondary_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                            if (buttonComponent2 != null) {
                                i = e6h0.transport_card_subtitle;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                if (robotoTextView != null) {
                                    i = e6h0.transport_card_title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                                    if (robotoTextView2 != null) {
                                        i = e6h0.transport_card_trail_button;
                                        ButtonTrailView buttonTrailView = (ButtonTrailView) cma1.O(i, this);
                                        if (buttonTrailView != null) {
                                            i = e6h0.transport_card_trail_image;
                                            if (((ImageView) cma1.O(i, this)) != null) {
                                                this.binding = new j111(this, linearLayout, imageView, buttonComponent, constraintLayout, goFrameLayout, buttonComponent2, robotoTextView, robotoTextView2, buttonTrailView);
                                                this.dividerDrawDelegate = new vql(context, null, new kux0(26, this));
                                                hideCheckable();
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
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void hideCheckable() {
        this.binding.j.setVisibility(8);
        androidx.core.view.b.p(this, null);
    }

    public static /* synthetic */ void setStatusDescriptionMessage$default(TransportCardWidgetView transportCardWidgetView, b111 b111Var, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = null;
        }
        transportCardWidgetView.setStatusDescriptionMessage(b111Var, slsVar);
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

    public final void clearStatusDescription() {
        this.binding.f.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.dividerDrawDelegate.a(canvas);
    }

    public final ImageView getLeadView() {
        return this.binding.c;
    }

    public final ButtonComponent getMainButton() {
        return this.binding.d;
    }

    public final ButtonComponent getSecondaryButton() {
        return this.binding.g;
    }

    public final ButtonTrailView getTrailButton() {
        return this.binding.j;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.dividerDrawDelegate.d(w, h);
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
        this.binding.e.setAlpha(0.5f);
        this.binding.e.setEnabled(false);
        this.binding.j.setEnabled(false);
    }

    public final void setDividers(DividerPosition position, DividerType type) {
        this.dividerDrawDelegate.e(position, type);
    }

    public final void setEnabledState() {
        this.binding.e.setAlpha(1.0f);
        this.binding.e.setEnabled(true);
        this.binding.j.setEnabled(true);
    }

    public final void setHorizontalPadding(int horizontalPadding) {
        this.binding.e.setPadding(horizontalPadding, 0, horizontalPadding, 0);
        this.binding.b.setPadding(horizontalPadding, 0, horizontalPadding, 0);
    }

    public final void setMainButtonVisibility(boolean isVisible) {
        this.binding.d.setVisibility(isVisible ? 0 : 8);
    }

    public final void setSecondaryButtonVisibility(boolean isVisible) {
        this.binding.g.setVisibility(isVisible ? 0 : 8);
    }

    public final void setStatusDescriptionMessage(b111 statusDescription, sls onClickListener) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setBackgroundResource(y2h0.bg_reject_delete_notification);
        listItemComponent.setLeadImage(y2h0.ic_reject_delete_card);
        listItemComponent.setUseAutoAccessibilityDelegate(false);
        listItemComponent.setTrailImage(dzg0.chevron_next);
        listItemComponent.setImportantForAccessibility(2);
        listItemComponent.setTitle(statusDescription.a);
        listItemComponent.title().setImportantForAccessibility(1);
        androidx.core.view.b.q(listItemComponent.title(), true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent.getContext()));
        listItemComponent.setLayoutParams(layoutParams);
        if (onClickListener != null) {
            listItemComponent.setDebounceClickListener(new u601(3, onClickListener));
        }
        this.binding.f.addView(listItemComponent);
    }

    public final void setSubtitle(CharSequence subtitle, kdc subtitleColor) {
        RobotoTextView robotoTextView = this.binding.h;
        robotoTextView.setText(subtitle);
        robotoTextView.setVisibility((subtitle == null || evu0.J(subtitle)) ? 8 : 0);
        robotoTextView.setTextColor(subtitleColor);
    }

    public final void setTitle(CharSequence title) {
        this.binding.i.setText(title);
    }
}
