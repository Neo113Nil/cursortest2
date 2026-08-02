package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aob1;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.ej40;
import defpackage.h2d0;
import defpackage.kgx;
import defpackage.mm91;
import defpackage.msa1;
import defpackage.nvg0;
import defpackage.nya1;
import defpackage.ph;
import defpackage.qoi0;
import defpackage.rng0;
import defpackage.s2d0;
import defpackage.u9h0;
import defpackage.v6d0;
import defpackage.vng;
import defpackage.wh;
import defpackage.wv5;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ!\u0010%\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u001b\u00107\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010<¨\u0006="}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/buyplus/PlusPanelBuyView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "<init>", "(Landroid/content/Context;Lcom/yandex/plus/core/strings/PlusSdkBrandType;)V", "Lzy11;", "setActionButtonBackground", "()V", "themedContext", "onThemeChanged", "(Landroid/content/Context;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "text", "setContentDescription", "(Ljava/lang/String;)V", "setActionButtonText", "setActionButtonContentDescription", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "setActionButtonTextDrawable", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "", "defaultColor", "setBackground", "(Lcom/yandex/plus/core/data/common/PlusColor;I)V", "Landroid/view/View$OnClickListener;", "listener", "setActionButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "Landroid/widget/TextView;", "titleTextView$delegate", "Lwv5;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "subtitleTextView$delegate", "getSubtitleTextView", "subtitleTextView", "actionButton$delegate", "getActionButton", "actionButton", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "actionButtonCornerRadius", "Landroid/content/Context;", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelBuyView extends LinearLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", PlusPanelBuyView.class), b64.x(qoi0.a, PlusPanelBuyView.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("actionButton", 0, "getActionButton()Landroid/widget/TextView;", PlusPanelBuyView.class)};

    /* renamed from: actionButton$delegate, reason: from kotlin metadata */
    private final wv5 actionButton;
    private final float actionButtonCornerRadius;
    private final PlusSdkBrandType brandType;
    private final float cornerRadius;

    /* renamed from: subtitleTextView$delegate, reason: from kotlin metadata */
    private final wv5 subtitleTextView;
    private Context themedContext;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final wv5 titleTextView;

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

    public PlusPanelBuyView(Context context, PlusSdkBrandType plusSdkBrandType) {
        super(context);
        this.brandType = plusSdkBrandType;
        this.titleTextView = new wv5(new v6d0(this, u9h0.plus_panel_buy_title_text_view, 0));
        this.subtitleTextView = new wv5(new v6d0(this, u9h0.plus_panel_buy_subtitle_text_view, 1));
        this.actionButton = new wv5(new v6d0(this, u9h0.plus_panel_buy_action_button, 2));
        this.cornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.actionButtonCornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_buy_button_corner_radius);
        this.themedContext = context;
        setOrientation(1);
        bb1.v(this, cmh0.plus_sdk_panel_buy_view, true);
        androidx.core.view.b.p(this, new a());
        androidx.core.view.b.p(getActionButton(), new b());
    }

    private final TextView getActionButton() {
        return (TextView) this.actionButton.a($$delegatedProperties[2]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.subtitleTextView.a($$delegatedProperties[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView.a($$delegatedProperties[0]);
    }

    private final void setActionButtonBackground() {
        Drawable o = msa1.o(nya1.c(this.brandType), this.actionButtonCornerRadius);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        TextView actionButton = getActionButton();
        float f = this.actionButtonCornerRadius;
        actionButton.setBackground(mm91.a(o, p, f, f, f, f));
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
        setActionButtonBackground();
    }

    public final void setActionButtonClickListener(View.OnClickListener listener) {
        bb1.L(getActionButton(), listener);
    }

    public final void setActionButtonContentDescription(String text) {
        getActionButton().setContentDescription(text);
    }

    public final void setActionButtonText(CharSequence text) {
        getActionButton().setText(text);
    }

    public final void setActionButtonTextDrawable(h2d0 textDrawableHolder) {
        aob1.c(getActionButton(), textDrawableHolder, new ej40(8));
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

    public final void setSubtitle(CharSequence subtitle) {
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
