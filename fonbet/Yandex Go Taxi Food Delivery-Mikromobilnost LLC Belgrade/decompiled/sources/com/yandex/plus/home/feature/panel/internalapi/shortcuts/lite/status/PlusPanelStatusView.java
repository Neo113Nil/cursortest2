package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aob1;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.ej40;
import defpackage.evu0;
import defpackage.h2d0;
import defpackage.jna1;
import defpackage.k7d0;
import defpackage.kgx;
import defpackage.l7d0;
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
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010#\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001b\u00105\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010>¨\u0006?"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/status/PlusPanelStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "themedContext", "Lzy11;", "onThemeChanged", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "text", "setActionText", "", "setContentDescription", "(Ljava/lang/String;)V", "", "isEnabled", "setActionEnabled", "(Z)V", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "setActionTextDrawable", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "", "defaultColor", "setBackground", "(Lcom/yandex/plus/core/data/common/PlusColor;I)V", "iconUrl", "Lb5d0;", "imageLoader", "setIcon", "(Ljava/lang/String;Lb5d0;)V", "Landroid/widget/TextView;", "titleTextView$delegate", "Lwv5;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "subtitleTextView$delegate", "getSubtitleTextView", "subtitleTextView", "actionTextView$delegate", "getActionTextView", "actionTextView", "Landroid/widget/ImageView;", "iconImageView$delegate", "getIconImageView", "()Landroid/widget/ImageView;", "iconImageView", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Landroid/content/Context;", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelStatusView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", PlusPanelStatusView.class), b64.x(qoi0.a, PlusPanelStatusView.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("actionTextView", 0, "getActionTextView()Landroid/widget/TextView;", PlusPanelStatusView.class), new PropertyReference1Impl("iconImageView", 0, "getIconImageView()Landroid/widget/ImageView;", PlusPanelStatusView.class)};

    /* renamed from: actionTextView$delegate, reason: from kotlin metadata */
    private final wv5 actionTextView;
    private final float cornerRadius;

    /* renamed from: iconImageView$delegate, reason: from kotlin metadata */
    private final wv5 iconImageView;

    /* renamed from: subtitleTextView$delegate, reason: from kotlin metadata */
    private final wv5 subtitleTextView;
    private Context themedContext;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final wv5 titleTextView;

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
        }
    }

    public PlusPanelStatusView(Context context) {
        super(context);
        this.titleTextView = new wv5(new l7d0(this, u9h0.plus_panel_status_title_text_view, 0));
        this.subtitleTextView = new wv5(new l7d0(this, u9h0.plus_panel_status_subtitle_text_view, 1));
        this.actionTextView = new wv5(new l7d0(this, u9h0.plus_panel_status_action_text_view, 2));
        this.iconImageView = new wv5(new l7d0(this, u9h0.plus_panel_status_icon_image_view, 3));
        this.cornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.themedContext = context;
        bb1.v(this, cmh0.plus_sdk_panel_status_view, true);
        b.p(this, new a());
    }

    private final TextView getActionTextView() {
        return (TextView) this.actionTextView.a($$delegatedProperties[2]);
    }

    private final ImageView getIconImageView() {
        return (ImageView) this.iconImageView.a($$delegatedProperties[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.subtitleTextView.a($$delegatedProperties[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setActionTextDrawable$lambda$1(PlusPanelStatusView plusPanelStatusView, int i) {
        androidx.core.widget.b.a(plusPanelStatusView.getActionTextView(), ColorStateList.valueOf(i));
        return zy11.a;
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void setActionEnabled(boolean isEnabled) {
        jna1.c(getActionTextView(), isEnabled);
    }

    public final void setActionText(CharSequence text) {
        getActionTextView().setText(text);
    }

    public final void setActionTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getActionTextView(), textDrawableHolder, new k7d0(0, this));
    }

    public final void setBackground(PlusColor plusColor, int defaultColor) {
        float f = this.cornerRadius;
        Drawable b = s2d0.b(plusColor, defaultColor, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        float f2 = this.cornerRadius;
        setBackground(mm91.a(b, p, f2, f2, f2, f2));
    }

    public final void setContentDescription(String text) {
        setContentDescription((CharSequence) text);
    }

    public final void setIcon(String iconUrl, b5d0 imageLoader) {
        getIconImageView().setVisibility((iconUrl == null || evu0.J(iconUrl)) ? 8 : 0);
        ((com.yandex.plus.glide.b) imageLoader).b(iconUrl).b(getIconImageView());
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
}
