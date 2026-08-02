package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
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
import defpackage.b7d0;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.ej40;
import defpackage.evu0;
import defpackage.f2d0;
import defpackage.h2d0;
import defpackage.kgx;
import defpackage.m810;
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
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u000bJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010\u001bJ!\u0010%\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u000bR\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010DR\u0016\u0010E\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isLongView", "Lzy11;", "setTextAlignment", "(Z)V", "setTextMaxLines", "themedContext", "onThemeChanged", "", "title", "subtitle", "setText", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "text", "setContentDescription", "(Ljava/lang/String;)V", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "isEnabled", "setActionEnabled", "drawableHolder", "setActionIconDrawable", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "", "defaultColor", "setBackgroundColor", "(Lcom/yandex/plus/core/data/common/PlusColor;I)V", "url", "Lb5d0;", "imageLoader", "setImage", "(Ljava/lang/String;Lb5d0;)V", "isLong", "setIsLong", "Landroid/widget/TextView;", "topTextView$delegate", "Lwv5;", "getTopTextView", "()Landroid/widget/TextView;", "topTextView", "bottomTextView$delegate", "getBottomTextView", "bottomTextView", "Landroid/widget/ImageView;", "arrowForwardImageView$delegate", "getArrowForwardImageView", "()Landroid/widget/ImageView;", "arrowForwardImageView", "imageView$delegate", "getImageView", "imageView", "padding", CA20Status.STATUS_USER_I, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Landroid/content/Context;", "isTwoLineMode", "Z", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelMiniPromoView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("topTextView", 0, "getTopTextView()Landroid/widget/TextView;", PlusPanelMiniPromoView.class), b64.x(qoi0.a, PlusPanelMiniPromoView.class, "bottomTextView", "getBottomTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("arrowForwardImageView", 0, "getArrowForwardImageView()Landroid/widget/ImageView;", PlusPanelMiniPromoView.class), new PropertyReference1Impl("imageView", 0, "getImageView()Landroid/widget/ImageView;", PlusPanelMiniPromoView.class)};

    /* renamed from: arrowForwardImageView$delegate, reason: from kotlin metadata */
    private final wv5 arrowForwardImageView;

    /* renamed from: bottomTextView$delegate, reason: from kotlin metadata */
    private final wv5 bottomTextView;
    private final float cornerRadius;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final wv5 imageView;
    private boolean isTwoLineMode;
    private final int padding;
    private Context themedContext;

    /* renamed from: topTextView$delegate, reason: from kotlin metadata */
    private final wv5 topTextView;

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
        }
    }

    public PlusPanelMiniPromoView(Context context) {
        super(context);
        this.topTextView = new wv5(new b7d0(this, u9h0.plus_panel_promo_mini_top_text_view, 0));
        this.bottomTextView = new wv5(new b7d0(this, u9h0.plus_panel_promo_mini_bottom_text_view, 1));
        this.arrowForwardImageView = new wv5(new b7d0(this, u9h0.plus_panel_promo_mini_arrow_image_view, 2));
        this.imageView = new wv5(new b7d0(this, u9h0.plus_panel_promo_mini_image_view, 3));
        int q = bb1.q(nvg0.plus_sdk_panel_mini_promo_content_padding, this);
        this.padding = q;
        this.cornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.themedContext = context;
        bb1.v(this, cmh0.plus_sdk_panel_mini_promo_view, true);
        setPadding(q, q, q, q);
        b.p(this, new a());
    }

    private final ImageView getArrowForwardImageView() {
        return (ImageView) this.arrowForwardImageView.a($$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getBottomTextView() {
        return (TextView) this.bottomTextView.a($$delegatedProperties[1]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.a($$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTopTextView() {
        return (TextView) this.topTextView.a($$delegatedProperties[0]);
    }

    private final void setTextAlignment(boolean isLongView) {
        ViewGroup.LayoutParams layoutParams = getBottomTextView().getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        boolean z = isLongView && !this.isTwoLineMode;
        boolean z2 = layoutParams2.bottomToBottom == 0;
        if (z && !z2) {
            layoutParams2.bottomToBottom = 0;
        } else {
            if (z || !z2) {
                return;
            }
            layoutParams2.bottomToBottom = -1;
        }
    }

    private final void setTextMaxLines(boolean isLongView) {
        if (isLongView) {
            getTopTextView().setMaxLines(Integer.MAX_VALUE);
            getBottomTextView().setMaxLines(Integer.MAX_VALUE);
            return;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.PlusPanelMiniPromoView$setTextMaxLines$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextPaint paint = PlusPanelMiniPromoView.this.getTopTextView().getPaint();
                    float descent = paint.descent() - paint.ascent();
                    if (descent < 1.0f) {
                        descent = 1.0f;
                    }
                    int height = (int) ((PlusPanelMiniPromoView.this.getHeight() - (PlusPanelMiniPromoView.this.padding * 2)) / descent);
                    boolean z = PlusPanelMiniPromoView.this.isTwoLineMode;
                    PlusPanelMiniPromoView plusPanelMiniPromoView = PlusPanelMiniPromoView.this;
                    if (!z) {
                        plusPanelMiniPromoView.getBottomTextView().setMaxLines(height);
                        return;
                    }
                    PlusPanelMiniPromoView.this.getTopTextView().setMaxLines(Math.min(height, m810.b(plusPanelMiniPromoView.getTopTextView().getHeight() / descent)));
                    PlusPanelMiniPromoView.this.getBottomTextView().setMaxLines(height - PlusPanelMiniPromoView.this.getTopTextView().getMaxLines());
                }
            });
            return;
        }
        TextPaint paint = getTopTextView().getPaint();
        float descent = paint.descent() - paint.ascent();
        if (descent < 1.0f) {
            descent = 1.0f;
        }
        int height = (int) ((getHeight() - (this.padding * 2)) / descent);
        if (!this.isTwoLineMode) {
            getBottomTextView().setMaxLines(height);
            return;
        }
        getTopTextView().setMaxLines(Math.min(height, m810.b(getTopTextView().getHeight() / descent)));
        getBottomTextView().setMaxLines(height - getTopTextView().getMaxLines());
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void setActionEnabled(boolean isEnabled) {
        getArrowForwardImageView().setVisibility(isEnabled ? 0 : 8);
    }

    public final void setActionIconDrawable(h2d0 drawableHolder) {
        if (drawableHolder instanceof f2d0) {
            getArrowForwardImageView().setImageTintList(ColorStateList.valueOf(((f2d0) drawableHolder).a));
        }
    }

    public final void setBackgroundColor(PlusColor plusColor, int defaultColor) {
        float f = this.cornerRadius;
        Drawable b = s2d0.b(plusColor, defaultColor, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        float f2 = this.cornerRadius;
        setBackground(mm91.a(b, p, f2, f2, f2, f2));
    }

    public final void setContentDescription(String text) {
        setContentDescription((CharSequence) text);
    }

    public final void setImage(String url, b5d0 imageLoader) {
        ((com.yandex.plus.glide.b) imageLoader).b(url).b(getImageView());
    }

    public final void setIsLong(boolean isLong) {
        setTextAlignment(isLong);
        setTextMaxLines(isLong);
    }

    public final void setSubtitleTextDrawable(h2d0 textDrawableHolder) {
        if (this.isTwoLineMode) {
            aob1.c(getBottomTextView(), textDrawableHolder, new ej40(8));
        }
    }

    public final void setText(CharSequence title, CharSequence subtitle) {
        this.isTwoLineMode = !evu0.J(subtitle);
        getTopTextView().setVisibility(this.isTwoLineMode ? 0 : 8);
        if (!this.isTwoLineMode) {
            getBottomTextView().setText(title);
        } else {
            getTopTextView().setText(title);
            getBottomTextView().setText(subtitle);
        }
    }

    public final void setTitleTextDrawable(h2d0 textDrawableHolder) {
        if (this.isTwoLineMode) {
            aob1.c(getTopTextView(), textDrawableHolder, new ej40(8));
        } else {
            aob1.c(getBottomTextView(), textDrawableHolder, new ej40(8));
        }
    }
}
