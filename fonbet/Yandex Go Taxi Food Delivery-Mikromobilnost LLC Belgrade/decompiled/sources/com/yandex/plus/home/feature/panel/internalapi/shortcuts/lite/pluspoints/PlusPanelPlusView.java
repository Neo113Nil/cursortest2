package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aob1;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.d7d0;
import defpackage.ej40;
import defpackage.evu0;
import defpackage.h2d0;
import defpackage.j73;
import defpackage.jna1;
import defpackage.kgx;
import defpackage.mm91;
import defpackage.mo4;
import defpackage.msa1;
import defpackage.no4;
import defpackage.nvg0;
import defpackage.nya1;
import defpackage.oo4;
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

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u0018J\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b&\u0010%J\u001d\u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\"¢\u0006\u0004\b+\u0010%J\u0017\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010P¨\u0006R"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelPlusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "<init>", "(Landroid/content/Context;Lcom/yandex/plus/core/strings/PlusSdkBrandType;)V", "Lzy11;", "updateContentDescription", "()V", "themedContext", "onThemeChanged", "(Landroid/content/Context;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "text", "setGeneralContentDescription", "(Ljava/lang/String;)V", "Loo4;", "balanceState", "setBalance", "(Loo4;)V", "setBalanceContentDescription", "", "isEnabled", "setActionEnabled", "(Z)V", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "iconDrawableHolder", "saveBalanceTextAndIconDrawables", "(Lh2d0;Lh2d0;)V", "textAndIconDrawableHolder", "saveBalanceTextAndIconDrawable", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "setBackground", "(Lcom/yandex/plus/core/data/common/PlusColor;)V", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "Landroid/widget/TextView;", "titleTextView$delegate", "Lwv5;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "subtitleTextView$delegate", "getSubtitleTextView", "subtitleTextView", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelTextWithIconView;", "balanceTextView$delegate", "getBalanceTextView", "()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelTextWithIconView;", "balanceTextView", "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "balanceTextDrawableHolder", "Lh2d0;", "balanceIconDrawableHolder", "balanceTextAndIconDrawableHolder", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Landroid/graphics/drawable/Drawable;", "defaultBackground", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "generalContentDescription", "Ljava/lang/String;", "balanceContentDescription", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelPlusView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", PlusPanelPlusView.class), b64.x(qoi0.a, PlusPanelPlusView.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("balanceTextView", 0, "getBalanceTextView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelTextWithIconView;", PlusPanelPlusView.class), new PropertyReference1Impl("progressBar", 0, "getProgressBar()Landroid/widget/ProgressBar;", PlusPanelPlusView.class)};
    private String balanceContentDescription;
    private h2d0 balanceIconDrawableHolder;
    private h2d0 balanceTextAndIconDrawableHolder;
    private h2d0 balanceTextDrawableHolder;

    /* renamed from: balanceTextView$delegate, reason: from kotlin metadata */
    private final wv5 balanceTextView;
    private final PlusSdkBrandType brandType;
    private final float cornerRadius;
    private final Drawable defaultBackground;
    private String generalContentDescription;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final wv5 progressBar;

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

    public PlusPanelPlusView(Context context, PlusSdkBrandType plusSdkBrandType) {
        super(context);
        this.brandType = plusSdkBrandType;
        this.titleTextView = new wv5(new d7d0(this, u9h0.plus_panel_plus_title_text_view, 0));
        this.subtitleTextView = new wv5(new d7d0(this, u9h0.plus_panel_plus_subtitle_text_view, 1));
        this.balanceTextView = new wv5(new d7d0(this, u9h0.plus_panel_plus_balance_text_view, 2));
        this.progressBar = new wv5(new d7d0(this, u9h0.plus_panel_plus_balance_progress_bar, 3));
        float dimension = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.cornerRadius = dimension;
        this.defaultBackground = msa1.o(nya1.c(plusSdkBrandType), dimension);
        this.themedContext = context;
        bb1.v(this, cmh0.plus_sdk_panel_plus_view, true);
        b.p(this, new a());
    }

    private final PlusPanelTextWithIconView getBalanceTextView() {
        return (PlusPanelTextWithIconView) this.balanceTextView.a($$delegatedProperties[2]);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.a($$delegatedProperties[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.subtitleTextView.a($$delegatedProperties[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView.a($$delegatedProperties[0]);
    }

    private final void updateContentDescription() {
        setContentDescription(kotlin.collections.a.X(j73.A(new String[]{this.balanceContentDescription, this.generalContentDescription}), null, null, null, null, 63));
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void saveBalanceTextAndIconDrawable(h2d0 textAndIconDrawableHolder) {
        this.balanceTextAndIconDrawableHolder = textAndIconDrawableHolder;
        this.balanceTextDrawableHolder = null;
        this.balanceIconDrawableHolder = null;
    }

    public final void saveBalanceTextAndIconDrawables(h2d0 textDrawableHolder, h2d0 iconDrawableHolder) {
        this.balanceTextDrawableHolder = textDrawableHolder;
        this.balanceIconDrawableHolder = iconDrawableHolder;
        this.balanceTextAndIconDrawableHolder = null;
    }

    public final void setActionEnabled(boolean isEnabled) {
        jna1.c(getTitleTextView(), isEnabled);
    }

    public final void setBackground(PlusColor plusColor) {
        Drawable drawable;
        if (plusColor != null) {
            float f = this.cornerRadius;
            drawable = s2d0.a(plusColor, f, f, f, f);
        } else {
            drawable = this.defaultBackground;
        }
        Drawable drawable2 = drawable;
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        float f2 = this.cornerRadius;
        setBackground(mm91.a(drawable2, p, f2, f2, f2, f2));
    }

    public final void setBalance(oo4 balanceState) {
        boolean z = balanceState instanceof mo4;
        getProgressBar().setVisibility(z ? 0 : 8);
        getBalanceTextView().setVisibility(z ? 4 : 0);
        if (balanceState instanceof no4) {
        }
    }

    public final void setBalanceContentDescription(String text) {
        this.balanceContentDescription = text;
        updateContentDescription();
    }

    public final void setGeneralContentDescription(String text) {
        this.generalContentDescription = text;
        updateContentDescription();
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
