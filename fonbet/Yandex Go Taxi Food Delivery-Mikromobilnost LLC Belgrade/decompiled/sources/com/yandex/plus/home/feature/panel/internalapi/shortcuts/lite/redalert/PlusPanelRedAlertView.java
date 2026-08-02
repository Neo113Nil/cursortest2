package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aob1;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.e7d0;
import defpackage.ej40;
import defpackage.evu0;
import defpackage.h2d0;
import defpackage.kgx;
import defpackage.mm91;
import defpackage.nvg0;
import defpackage.ph;
import defpackage.qoi0;
import defpackage.rng0;
import defpackage.s2d0;
import defpackage.u9h0;
import defpackage.vng;
import defpackage.wh;
import defpackage.wv5;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b*\u0010\u000fJ\u0017\u0010+\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b+\u0010\u0015J\u0015\u0010,\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b,\u0010\u0019J!\u0010-\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b-\u0010%J\u0017\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b2\u0010\u000fJ\u0017\u00103\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b3\u0010\u0015J\u0015\u00104\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b4\u0010)J\u0015\u00105\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b5\u0010\u0019J!\u00106\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b6\u0010%J\u0017\u00107\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b7\u00101R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010AR\u001b\u0010H\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bG\u0010AR\u001b\u0010K\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010AR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010P¨\u0006Q"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/redalert/PlusPanelRedAlertView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "alignButtonsToSameHeight", "()V", "themedContext", "onThemeChanged", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "text", "setContentDescription", "(Ljava/lang/String;)V", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "logoUrl", "Lb5d0;", "imageLoader", "setLogoUrl", "(Ljava/lang/String;Lb5d0;)V", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "", "defaultColor", "setBackground", "(Lcom/yandex/plus/core/data/common/PlusColor;I)V", "", "value", "showMainAction", "(Z)V", "setMainActionText", "setMainActionContentDescription", "setMainActionTextDrawable", "setMainActionBackground", "Landroid/view/View$OnClickListener;", "onClickListener", "setMainActionOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setAdditionalActionText", "setAdditionalActionContentDescription", "showAdditionalAction", "setAdditionalActionTextDrawable", "setAdditionalActionBackground", "setAdditionalActionOnClickListener", "Landroid/widget/ImageView;", "warningImageView$delegate", "Lwv5;", "getWarningImageView", "()Landroid/widget/ImageView;", "warningImageView", "Landroid/widget/TextView;", "titleTextView$delegate", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "subtitleTextView$delegate", "getSubtitleTextView", "subtitleTextView", "mainActionTextView$delegate", "getMainActionTextView", "mainActionTextView", "additionalActionTextView$delegate", "getAdditionalActionTextView", "additionalActionTextView", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "actionCornerRadius", "Landroid/content/Context;", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelRedAlertView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("warningImageView", 0, "getWarningImageView()Landroid/widget/ImageView;", PlusPanelRedAlertView.class), b64.x(qoi0.a, PlusPanelRedAlertView.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", PlusPanelRedAlertView.class), new PropertyReference1Impl("mainActionTextView", 0, "getMainActionTextView()Landroid/widget/TextView;", PlusPanelRedAlertView.class), new PropertyReference1Impl("additionalActionTextView", 0, "getAdditionalActionTextView()Landroid/widget/TextView;", PlusPanelRedAlertView.class)};
    private final float actionCornerRadius;

    /* renamed from: additionalActionTextView$delegate, reason: from kotlin metadata */
    private final wv5 additionalActionTextView;
    private final float cornerRadius;

    /* renamed from: mainActionTextView$delegate, reason: from kotlin metadata */
    private final wv5 mainActionTextView;

    /* renamed from: subtitleTextView$delegate, reason: from kotlin metadata */
    private final wv5 subtitleTextView;
    private Context themedContext;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final wv5 titleTextView;

    /* renamed from: warningImageView$delegate, reason: from kotlin metadata */
    private final wv5 warningImageView;

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        }
    }

    public static final class b extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
        }
    }

    public static final class c extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
        }
    }

    public PlusPanelRedAlertView(Context context) {
        super(context);
        this.warningImageView = new wv5(new e7d0(this, u9h0.plus_sdk_warning_image_view, 0));
        this.titleTextView = new wv5(new e7d0(this, u9h0.plus_panel_red_alert_title_text_view, 1));
        this.subtitleTextView = new wv5(new e7d0(this, u9h0.plus_panel_red_alert_subtitle_text_view, 2));
        this.mainActionTextView = new wv5(new e7d0(this, u9h0.plus_panel_red_alert_main_action_text_view, 3));
        this.additionalActionTextView = new wv5(new e7d0(this, u9h0.plus_panel_red_alert_additional_action_text_view, 4));
        this.cornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.actionCornerRadius = getResources().getDimension(nvg0.plus_sdk_red_alert_view_action_corner_radius);
        this.themedContext = context;
        int dimension = (int) getResources().getDimension(nvg0.plus_sdk_panel_red_alert_container_inner_margin);
        bb1.v(this, cmh0.plus_sdk_panel_red_alert_view, true);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), dimension);
        androidx.core.view.b.p(this, new a());
        androidx.core.view.b.p(getMainActionTextView(), new b());
        androidx.core.view.b.p(getAdditionalActionTextView(), new c());
    }

    private final void alignButtonsToSameHeight() {
        int max;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.PlusPanelRedAlertView$alignButtonsToSameHeight$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    int max2;
                    view.removeOnLayoutChangeListener(this);
                    if (PlusPanelRedAlertView.this.getMainActionTextView().getVisibility() == 0 && PlusPanelRedAlertView.this.getAdditionalActionTextView().getVisibility() == 0 && (max2 = Math.max(PlusPanelRedAlertView.this.getMainActionTextView().getMeasuredHeight(), PlusPanelRedAlertView.this.getAdditionalActionTextView().getMeasuredHeight())) > 0) {
                        PlusPanelRedAlertView.this.getMainActionTextView().setHeight(max2);
                        PlusPanelRedAlertView.this.getAdditionalActionTextView().setHeight(max2);
                    }
                }
            });
        } else if (getMainActionTextView().getVisibility() == 0 && getAdditionalActionTextView().getVisibility() == 0 && (max = Math.max(getMainActionTextView().getMeasuredHeight(), getAdditionalActionTextView().getMeasuredHeight())) > 0) {
            getMainActionTextView().setHeight(max);
            getAdditionalActionTextView().setHeight(max);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getAdditionalActionTextView() {
        return (TextView) this.additionalActionTextView.a($$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMainActionTextView() {
        return (TextView) this.mainActionTextView.a($$delegatedProperties[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.subtitleTextView.a($$delegatedProperties[2]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView.a($$delegatedProperties[1]);
    }

    private final ImageView getWarningImageView() {
        return (ImageView) this.warningImageView.a($$delegatedProperties[0]);
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void setAdditionalActionBackground(PlusColor plusColor, int defaultColor) {
        float f = this.actionCornerRadius;
        Drawable b2 = s2d0.b(plusColor, defaultColor, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        TextView additionalActionTextView = getAdditionalActionTextView();
        float f2 = this.actionCornerRadius;
        additionalActionTextView.setBackground(mm91.a(b2, p, f2, f2, f2, f2));
    }

    public final void setAdditionalActionContentDescription(String text) {
        getAdditionalActionTextView().setContentDescription(text);
    }

    public final void setAdditionalActionOnClickListener(View.OnClickListener onClickListener) {
        bb1.L(getAdditionalActionTextView(), onClickListener);
    }

    public final void setAdditionalActionText(CharSequence text) {
        getAdditionalActionTextView().setText(text);
        alignButtonsToSameHeight();
    }

    public final void setAdditionalActionTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getAdditionalActionTextView(), textDrawableHolder, new ej40(8));
    }

    public final void setBackground(PlusColor plusColor, int defaultColor) {
        float f = this.cornerRadius;
        Drawable b2 = s2d0.b(plusColor, defaultColor, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        float f2 = this.cornerRadius;
        setBackground(mm91.a(b2, p, f2, f2, f2, f2));
    }

    public final void setContentDescription(String text) {
        setContentDescription((CharSequence) text);
    }

    public final void setLogoUrl(String logoUrl, b5d0 imageLoader) {
        ((com.yandex.plus.glide.b) imageLoader).b(logoUrl).b(getWarningImageView());
    }

    public final void setMainActionBackground(PlusColor plusColor, int defaultColor) {
        float f = this.actionCornerRadius;
        Drawable b2 = s2d0.b(plusColor, defaultColor, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        TextView mainActionTextView = getMainActionTextView();
        float f2 = this.actionCornerRadius;
        mainActionTextView.setBackground(mm91.a(b2, p, f2, f2, f2, f2));
    }

    public final void setMainActionContentDescription(String text) {
        getMainActionTextView().setContentDescription(text);
    }

    public final void setMainActionOnClickListener(View.OnClickListener onClickListener) {
        bb1.L(getMainActionTextView(), onClickListener);
    }

    public final void setMainActionText(CharSequence text) {
        getMainActionTextView().setText(text);
        alignButtonsToSameHeight();
    }

    public final void setMainActionTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getMainActionTextView(), textDrawableHolder, new ej40(8));
    }

    public final void setSubtitle(CharSequence subtitle) {
        getSubtitleTextView().setVisibility(!evu0.J(subtitle) ? 0 : 8);
        getSubtitleTextView().setText(subtitle);
    }

    public final void setSubtitleTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getSubtitleTextView(), textDrawableHolder, new ej40(8));
    }

    public final void setTitle(CharSequence title) {
        getTitleTextView().setText(title);
    }

    public final void setTitleTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getTitleTextView(), textDrawableHolder, new ej40(8));
    }

    public final void showAdditionalAction(boolean value) {
        getAdditionalActionTextView().setVisibility(value ? 0 : 8);
    }

    public final void showMainAction(boolean value) {
        getMainActionTextView().setVisibility(value ? 0 : 8);
    }
}
