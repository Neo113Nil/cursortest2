package com.yandex.go.slot.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Form;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ahf0;
import defpackage.bdc;
import defpackage.css0;
import defpackage.dzg0;
import defpackage.ei;
import defpackage.gdc;
import defpackage.gss0;
import defpackage.ifq0;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.mqs0;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.nqs0;
import defpackage.pav;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tss0;
import defpackage.usg0;
import defpackage.uz1;
import defpackage.vng;
import defpackage.w0d;
import defpackage.w511;
import defpackage.wls;
import defpackage.wqs0;
import defpackage.wrs0;
import defpackage.wss0;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yqs0;
import defpackage.zqs0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002ghBS\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u0016H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b:\u00101J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ7\u0010G\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010D\u001a\u0004\u0018\u00010\u00162\b\u0010E\u001a\u0004\u0018\u00010\u00162\b\u0010F\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000fH\u0014¢\u0006\u0004\bI\u0010\u0014J\u0017\u0010J\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000fH\u0002¢\u0006\u0004\bL\u0010\u0014J\u000f\u0010M\u001a\u00020\u000fH\u0002¢\u0006\u0004\bM\u0010\u0014J\u000f\u0010N\u001a\u00020\u0007H\u0003¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0007H\u0003¢\u0006\u0004\bP\u0010OJ\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\bT\u0010\u0014J\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/yandex/go/slot/ui/view/SlotItemButtonViewComponent;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lyqs0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lpav;", "imageLoader", "Lkotlin/Function2;", "Lnqs0;", "Lwrs0;", "Lzy11;", "actionHandler", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILpav;Lwls;)V", "onAttachedToWindow", "()V", "height", "Lkdc;", "rippleColor", "setup", "(ILkdc;)V", "Lxss0;", "slotItemState", "Lwqs0;", "properties", "render", "(Lxss0;Lwqs0;)V", "setProperties", "(Lwqs0;)V", "Lgss0;", "lead", "renderLead", "(Lgss0;)V", "Lcss0;", "body", "renderBody", "(Lcss0;)V", "Ltss0;", "trail", "renderTrail", "(Ltss0;)V", "", "isLoading", "renderLoading", "(Z)V", "action", "analytics", "setAction", "(Lnqs0;Lwrs0;)V", "color", "renderBackground", "(Lkdc;)V", "isEnabled", "renderEnabled", "Landroid/view/View;", "asView", "()Landroid/view/View;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "text", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "contentDescription", "renderBadge", "(Ljava/lang/CharSequence;Lkdc;Lkdc;Ljava/lang/CharSequence;)V", "onDetachedFromWindow", "renderSlotState", "(Lxss0;)V", "updateAccessibilityDelegates", "tryToAddBadgeView", "getButtonMinHeightResId", "()I", "getCornerRadiusResId", "Lru/yandex/taxi/widget/RobotoTextView;", "createBadgeView", "()Lru/yandex/taxi/widget/RobotoTextView;", "setButtonSize", "Lcom/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Form;", "form", "setButtonRadius", "(Lcom/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Form;)V", "Lwls;", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "slotItemView", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "badgeView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;", "size", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;", "lastBackgroundColor", "Lkdc;", "Lw0d;", "backgroundBuilder", "Lw0d;", "ei", "ifq0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotItemButtonViewComponent extends GoFrameLayout implements yqs0 {
    private final wls actionHandler;
    private final w0d backgroundBuilder;
    private RobotoTextView badgeView;
    private kdc lastBackgroundColor;
    private SlotItemUiState$Size size;
    private final SlotItemViewComponent slotItemView;

    public SlotItemButtonViewComponent(Context context, AttributeSet attributeSet, int i, int i2, pav pavVar, wls wlsVar) {
        super(context, attributeSet, i, i2);
        this.actionHandler = wlsVar;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, attributeSet, i, pavVar);
        this.slotItemView = slotItemViewComponent;
        this.size = SlotItemUiState$Size.M;
        this.lastBackgroundColor = new bdc(xng0.controlMinor);
        w0d w0dVar = new w0d();
        w0dVar.a = s8o.m(this.lastBackgroundColor, context);
        w0dVar.e = Integer.valueOf(qje.t(xng0.controlMinor, getContext()));
        w0dVar.g = true;
        this.backgroundBuilder = w0dVar;
        slotItemViewComponent.setLeadImageSize(tje.u(24, getContext()));
        slotItemViewComponent.compensateLeadFramePadding();
        slotItemViewComponent.setTitleTextSizePx(tje.u(13, getContext()));
        setImportantForAccessibility(0);
        setClipChildren(false);
        setClipToPadding(false);
        updateAccessibilityDelegates();
    }

    private final RobotoTextView createBadgeView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setPadding(tje.u(4, robotoTextView.getContext()), robotoTextView.getPaddingTop(), tje.u(4, robotoTextView.getContext()), robotoTextView.getPaddingBottom());
        robotoTextView.setBackground(vng.t(dzg0.bg_notification_badge, robotoTextView.getContext()));
        robotoTextView.setBackgroundTintList(ColorStateList.valueOf(robotoTextView.getContext().getColor(mqg0.component_cinnaban_toxic)));
        robotoTextView.setMinimumWidth(tje.u(18, robotoTextView.getContext()));
        robotoTextView.setElevation(tje.u(8, robotoTextView.getContext()));
        robotoTextView.setLineSpacing(-1.0f, 1.0f);
        robotoTextView.setMaxLines(1);
        robotoTextView.setTextColor(new gdc(mqg0.white));
        robotoTextView.setTextSize(2, 14.0f);
        robotoTextView.setFontFeatureSettings(robotoTextView.getContext().getString(mzh0.go_default_font_settings));
        robotoTextView.setTextAlignment(4);
        return robotoTextView;
    }

    private final int getButtonMinHeightResId() {
        int i = zqs0.a[this.size.ordinal()];
        if (i == 1) {
            return mrg0.button_component_size_XS;
        }
        if (i == 2) {
            return mrg0.button_component_size_S;
        }
        if (i == 3) {
            return mrg0.button_component_size_M;
        }
        if (i == 4) {
            return mrg0.button_component_size_L;
        }
        w511.b();
        return 0;
    }

    private final int getCornerRadiusResId() {
        int i = zqs0.a[this.size.ordinal()];
        if (i == 1) {
            return usg0.ride_card_button_corner_radius_XS;
        }
        if (i == 2) {
            return usg0.ride_card_button_corner_radius_S;
        }
        if (i == 3) {
            return usg0.ride_card_button_corner_radius_M;
        }
        if (i == 4) {
            return usg0.ride_card_button_corner_radius_L;
        }
        w511.b();
        return 0;
    }

    private final void renderSlotState(xss0 slotItemState) {
        renderLead(slotItemState.a);
        renderBody(slotItemState.b);
        renderTrail(slotItemState.c);
        this.size = slotItemState.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderTrail$lambda$0(nqs0 nqs0Var, wss0 wss0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAction$lambda$0(SlotItemButtonViewComponent slotItemButtonViewComponent, wrs0 wrs0Var, nqs0 nqs0Var, wss0 wss0Var) {
        slotItemButtonViewComponent.actionHandler.invoke(nqs0Var, wrs0Var);
    }

    private final void setButtonRadius(SlotItemButtonUiState$Properties$Form form) {
        int r;
        int i = zqs0.b[form.ordinal()];
        if (i == 1) {
            r = tje.r(getCornerRadiusResId(), getContext());
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            r = tje.r(usg0.ride_card_button_corner_radius_round, getContext());
        }
        this.backgroundBuilder.h = r;
    }

    private final void setButtonSize() {
        int r = tje.r(getButtonMinHeightResId(), getContext());
        setMinimumHeight(r);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, r));
            return;
        }
        int i = layoutParams.height;
        if (i <= 0 || i == -1) {
            layoutParams.height = r;
            setLayoutParams(layoutParams);
        }
    }

    private final void tryToAddBadgeView() {
        View view = this.badgeView;
        if (view != null) {
            if (view == null || indexOfChild(view) == -1) {
                View view2 = this.badgeView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, tje.u(18, getContext()));
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, -tje.u(2, getContext()), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                layoutParams.gravity = 8388661;
                addView(view2, layoutParams);
            }
        }
    }

    private final void updateAccessibilityDelegates() {
        RobotoTextView robotoTextView = this.badgeView;
        if (robotoTextView != null) {
            b.p(robotoTextView, new ei(20));
        }
        b.p(this.slotItemView, new ifq0(1, this));
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        renderBackground(this.lastBackgroundColor);
    }

    @Override // defpackage.yqs0
    public View asView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this.slotItemView, new FrameLayout.LayoutParams(-1, -1));
        tryToAddBadgeView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeAllViews();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.yqs0
    public void render(xss0 slotItemState, wqs0 properties) {
        renderSlotState(slotItemState);
        setProperties(properties);
    }

    @Override // defpackage.yqs0
    public void renderBackground(kdc color) {
        this.lastBackgroundColor = color;
        w0d w0dVar = this.backgroundBuilder;
        w0dVar.a = s8o.m(color, getContext());
        this.slotItemView.setBackgroundDrawable(w0dVar.a());
    }

    @Override // defpackage.yqs0
    public void renderBadge(CharSequence text, kdc textColor, kdc backgroundColor, CharSequence contentDescription) {
        RobotoTextView robotoTextView;
        Drawable background;
        boolean z = text == null || text.length() == 0;
        if (!z) {
            this.badgeView = createBadgeView();
            tryToAddBadgeView();
        }
        RobotoTextView robotoTextView2 = this.badgeView;
        if (z) {
            removeView(robotoTextView2);
            this.badgeView = null;
        } else {
            if (robotoTextView2 != null) {
                robotoTextView2.setText(text);
            }
            RobotoTextView robotoTextView3 = this.badgeView;
            if (robotoTextView3 != null) {
                robotoTextView3.setContentDescription(contentDescription);
            }
            RobotoTextView robotoTextView4 = this.badgeView;
            if (robotoTextView4 != null) {
                robotoTextView4.setTextColor(textColor);
            }
            if (backgroundColor != null && (robotoTextView = this.badgeView) != null && (background = robotoTextView.getBackground()) != null) {
                background.setTint(s8o.m(backgroundColor, getContext()));
            }
        }
        updateAccessibilityDelegates();
    }

    @Override // defpackage.yqs0
    public void renderBody(css0 body) {
        this.slotItemView.renderBody(body);
    }

    @Override // defpackage.yqs0
    public void renderEnabled(boolean isEnabled) {
        setEnabled(isEnabled);
        this.slotItemView.setEnabled(isEnabled);
    }

    @Override // defpackage.yqs0
    public void renderLead(gss0 lead) {
        this.slotItemView.renderLead(lead);
    }

    @Override // defpackage.yqs0
    public void renderLoading(boolean isLoading) {
        SlotItemViewComponent slotItemViewComponent = this.slotItemView;
        if (isLoading) {
            slotItemViewComponent.startProgressAnimation();
        } else {
            slotItemViewComponent.stopProgressAnimation();
        }
    }

    @Override // defpackage.yqs0
    public void renderTrail(tss0 trail) {
        this.slotItemView.renderTrail(trail, new uz1(5));
    }

    @Override // defpackage.yqs0
    public void setAction(nqs0 action, wrs0 analytics) {
        this.slotItemView.setAction(action, new ahf0(this, analytics, 1));
        setEnabled(!(action instanceof mqs0));
    }

    @Override // defpackage.yqs0
    public void setProperties(wqs0 properties) {
        setButtonSize();
        setButtonRadius(properties.a);
        this.slotItemView.invalidateComponent();
    }

    @Override // defpackage.yqs0
    public void setup(int height, kdc rippleColor) {
        setClipChildren(true);
        setClipToPadding(true);
        removeAllViews();
        addView(this.slotItemView, new FrameLayout.LayoutParams(-1, height));
        this.backgroundBuilder.e = Integer.valueOf(s8o.m(rippleColor, getContext()));
    }

    public SlotItemButtonViewComponent(Context context, AttributeSet attributeSet, int i, pav pavVar, wls wlsVar) {
        this(context, attributeSet, i, 0, pavVar, wlsVar, 8, null);
    }

    public SlotItemButtonViewComponent(Context context, AttributeSet attributeSet, pav pavVar, wls wlsVar) {
        this(context, attributeSet, 0, 0, pavVar, wlsVar, 12, null);
    }

    public SlotItemButtonViewComponent(Context context, pav pavVar, wls wlsVar) {
        this(context, null, 0, 0, pavVar, wlsVar, 14, null);
    }

    public /* synthetic */ SlotItemButtonViewComponent(Context context, AttributeSet attributeSet, int i, int i2, pav pavVar, wls wlsVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, pavVar, wlsVar);
    }
}
