package com.yandex.plus.home.feature.webviews.internal.toolbar;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.b64;
import defpackage.bb1;
import defpackage.c1i0;
import defpackage.emh0;
import defpackage.eob1;
import defpackage.i3y;
import defpackage.iog0;
import defpackage.ixg0;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.kok0;
import defpackage.n3i0;
import defpackage.ph;
import defpackage.qoi0;
import defpackage.rmg0;
import defpackage.rng0;
import defpackage.sls;
import defpackage.su41;
import defpackage.tpg0;
import defpackage.v9h0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wh;
import defpackage.wv5;
import defpackage.xbg0;
import defpackage.zy11;
import defpackage.zyh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001YB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0011J-\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0011J\u001b\u0010\u001d\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u00020\r*\u00020$2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J+\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J'\u00100\u001a\u0004\u0018\u00010/2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b0\u00102J\u0017\u00103\u001a\u00020%2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010>\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010=R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR#\u0010T\u001a\n O*\u0004\u0018\u00010N0N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "string", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "showBackStartIcon", "()V", "iconRes", "tintColor", "contentDescription", "showCustomStartIcon", "(ILjava/lang/Integer;Ljava/lang/String;)V", "hideStartIcon", "showCloseEndIcon", "showCustomEndIcon", "hideEndIcon", "Lkotlin/Function0;", "onClick", "setOnStartIconClickListener", "(Lsls;)V", "setOnEndIconClickListener", "", "isVisible", "setIsDashVisible", "(Z)V", "Landroid/widget/ImageView;", "Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar$OnIconPressAnimation;", "animation", "setOnPressAnimation", "(Landroid/widget/ImageView;Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar$OnIconPressAnimation;)V", "Landroid/content/res/TypedArray;", "typedArray", "getDefaultIconColor", "(Landroid/content/res/TypedArray;)I", "iconAttrIndex", "iconDefaultRes", "Landroid/graphics/drawable/Drawable;", "createDrawableForIcon", "(Landroid/content/res/TypedArray;II)Landroid/graphics/drawable/Drawable;", "(ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "getOnIconPressAnimation", "(Landroid/content/res/TypedArray;)Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar$OnIconPressAnimation;", "Landroid/widget/TextView;", "title$delegate", "Lwv5;", "getTitle", "()Landroid/widget/TextView;", "title", "startIcon$delegate", "getStartIcon", "()Landroid/widget/ImageView;", "startIcon", "endIcon$delegate", "getEndIcon", "endIcon", "Landroid/view/View;", "dashIcon$delegate", "getDashIcon", "()Landroid/view/View;", "dashIcon", "backIconDrawable", "Landroid/graphics/drawable/Drawable;", "closeIconDrawable", "defaultIconColor", CA20Status.STATUS_USER_I, "onIconPressAnimation", "Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar$OnIconPressAnimation;", "Landroid/animation/StateListAnimator;", "kotlin.jvm.PlatformType", "scaleAnimator$delegate", "Li3y;", "getScaleAnimator", "()Landroid/animation/StateListAnimator;", "scaleAnimator", "rippleResId$delegate", "getRippleResId", "()I", "rippleResId", "OnIconPressAnimation", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewToolbar extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("title", 0, "getTitle()Landroid/widget/TextView;", WebViewToolbar.class), b64.x(qoi0.a, WebViewToolbar.class, "startIcon", "getStartIcon()Landroid/widget/ImageView;", 0), new PropertyReference1Impl("endIcon", 0, "getEndIcon()Landroid/widget/ImageView;", WebViewToolbar.class), new PropertyReference1Impl("dashIcon", 0, "getDashIcon()Landroid/view/View;", WebViewToolbar.class)};
    private Drawable backIconDrawable;
    private Drawable closeIconDrawable;

    /* renamed from: dashIcon$delegate, reason: from kotlin metadata */
    private final wv5 dashIcon;
    private int defaultIconColor;

    /* renamed from: endIcon$delegate, reason: from kotlin metadata */
    private final wv5 endIcon;
    private OnIconPressAnimation onIconPressAnimation;

    /* renamed from: rippleResId$delegate, reason: from kotlin metadata */
    private final i3y rippleResId;

    /* renamed from: scaleAnimator$delegate, reason: from kotlin metadata */
    private final i3y scaleAnimator;

    /* renamed from: startIcon$delegate, reason: from kotlin metadata */
    private final wv5 startIcon;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final wv5 title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar$OnIconPressAnimation;", "", "SCALE", "RIPPLE", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnIconPressAnimation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OnIconPressAnimation[] $VALUES;
        public static final OnIconPressAnimation RIPPLE;
        public static final OnIconPressAnimation SCALE;

        static {
            OnIconPressAnimation onIconPressAnimation = new OnIconPressAnimation("SCALE", 0);
            SCALE = onIconPressAnimation;
            OnIconPressAnimation onIconPressAnimation2 = new OnIconPressAnimation("RIPPLE", 1);
            RIPPLE = onIconPressAnimation2;
            OnIconPressAnimation[] onIconPressAnimationArr = {onIconPressAnimation, onIconPressAnimation2};
            $VALUES = onIconPressAnimationArr;
            $ENTRIES = kotlin.enums.a.a(onIconPressAnimationArr);
        }

        public static OnIconPressAnimation valueOf(String str) {
            return (OnIconPressAnimation) Enum.valueOf(OnIconPressAnimation.class, str);
        }

        public static OnIconPressAnimation[] values() {
            return (OnIconPressAnimation[]) $VALUES.clone();
        }
    }

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
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

    public WebViewToolbar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.title = new wv5(new su41(this, v9h0.title, 0));
        this.startIcon = new wv5(new su41(this, v9h0.start_icon, 1));
        this.endIcon = new wv5(new su41(this, v9h0.end_icon, 2));
        this.dashIcon = new wv5(new su41(this, v9h0.toolbar_outline_icon, 3));
        this.defaultIconColor = -1;
        this.onIconPressAnimation = OnIconPressAnimation.RIPPLE;
        this.scaleAnimator = kotlin.a.a(new kok0(context, 19));
        this.rippleResId = kotlin.a.a(new kok0(context, 20));
        bb1.v(this, emh0.plus_sdk_webview_toolbar, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n3i0.WebViewToolbar, i, i2);
        try {
            _init_$lambda$2(this, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            androidx.core.view.b.p(getStartIcon(), new a());
            androidx.core.view.b.p(getEndIcon(), new b());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static final zy11 _init_$lambda$2(WebViewToolbar webViewToolbar, Context context, TypedArray typedArray) {
        webViewToolbar.defaultIconColor = webViewToolbar.getDefaultIconColor(typedArray);
        webViewToolbar.closeIconDrawable = webViewToolbar.createDrawableForIcon(typedArray, n3i0.WebViewToolbar_plus_sdk_toolbarCloseIcon, ixg0.plus_sdk_ic_close);
        webViewToolbar.backIconDrawable = webViewToolbar.createDrawableForIcon(typedArray, n3i0.WebViewToolbar_plus_sdk_toolbarBackIcon, ixg0.plus_sdk_ic_arrow_back);
        webViewToolbar.setBackgroundColor(context.getColor(typedArray.getResourceId(n3i0.WebViewToolbar_plus_sdk_toolbarBackgroundColor, tpg0.plus_sdk_transparent)));
        webViewToolbar.getTitle().setTextAppearance(typedArray.getResourceId(n3i0.WebViewToolbar_plus_sdk_toolbarTextAppearance, c1i0.PlusSDK_TextAppearance_WebViewToolbar));
        webViewToolbar.onIconPressAnimation = webViewToolbar.getOnIconPressAnimation(typedArray);
        return zy11.a;
    }

    private final Drawable createDrawableForIcon(int iconRes, Integer tintColor) {
        Drawable t = vng.t(iconRes, getContext());
        if (t == null) {
            return null;
        }
        t.setTint(tintColor != null ? tintColor.intValue() : this.defaultIconColor);
        return t;
    }

    public static /* synthetic */ Drawable createDrawableForIcon$default(WebViewToolbar webViewToolbar, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return webViewToolbar.createDrawableForIcon(i, num);
    }

    private final View getDashIcon() {
        return (View) this.dashIcon.a($$delegatedProperties[3]);
    }

    private final int getDefaultIconColor(TypedArray typedArray) {
        return getContext().getColor(typedArray.getResourceId(n3i0.WebViewToolbar_plus_sdk_toolbarIconColor, tpg0.plus_sdk_gray_600));
    }

    private final ImageView getEndIcon() {
        return (ImageView) this.endIcon.a($$delegatedProperties[2]);
    }

    private final OnIconPressAnimation getOnIconPressAnimation(TypedArray typedArray) {
        int i = typedArray.getInt(n3i0.WebViewToolbar_plus_sdk_toolbarOnIconPressAnimation, 0);
        if (i != 0 && i == 1) {
            return OnIconPressAnimation.SCALE;
        }
        return OnIconPressAnimation.RIPPLE;
    }

    private final int getRippleResId() {
        return ((Number) this.rippleResId.getValue()).intValue();
    }

    private final StateListAnimator getScaleAnimator() {
        return (StateListAnimator) this.scaleAnimator.getValue();
    }

    private final ImageView getStartIcon() {
        return (ImageView) this.startIcon.a($$delegatedProperties[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.title.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rippleResId_delegate$lambda$1(Context context) {
        return eob1.b(context.getTheme(), iog0.selectableItemBackgroundBorderless).resourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateListAnimator scaleAnimator_delegate$lambda$0(Context context) {
        return AnimatorInflater.loadStateListAnimator(context, rmg0.plus_sdk_click_scale_animator);
    }

    private final void setOnPressAnimation(ImageView imageView, OnIconPressAnimation onIconPressAnimation) {
        int i = com.yandex.plus.home.feature.webviews.internal.toolbar.a.a[onIconPressAnimation.ordinal()];
        if (i == 1) {
            imageView.setBackgroundResource(getRippleResId());
            imageView.setStateListAnimator(null);
        } else if (i != 2) {
            w511.b();
        } else {
            imageView.setBackground(null);
            imageView.setStateListAnimator(getScaleAnimator());
        }
    }

    public final void hideEndIcon() {
        getEndIcon().setVisibility(4);
    }

    public final void hideStartIcon() {
        getStartIcon().setVisibility(4);
    }

    public final void setIsDashVisible(boolean isVisible) {
        getDashIcon().setVisibility(isVisible ? 0 : 8);
    }

    public final void setOnEndIconClickListener(sls onClick) {
        bb1.L(getEndIcon(), new xbg0(19, onClick));
    }

    public final void setOnStartIconClickListener(sls onClick) {
        bb1.L(getStartIcon(), new xbg0(18, onClick));
    }

    public final void setTitle(String string) {
        TextView title = getTitle();
        if (string == null) {
            string = "";
        }
        title.setText(string);
    }

    public final void showBackStartIcon() {
        getStartIcon().setImageDrawable(this.backIconDrawable);
        setOnPressAnimation(getStartIcon(), this.onIconPressAnimation);
        getEndIcon().setContentDescription(getContext().getString(zyh0.CloseButton_AccessibilityLabel));
        getStartIcon().setVisibility(0);
    }

    public final void showCloseEndIcon() {
        getEndIcon().setImageDrawable(this.closeIconDrawable);
        setOnPressAnimation(getEndIcon(), this.onIconPressAnimation);
        getEndIcon().setContentDescription(getContext().getString(zyh0.CloseButton_AccessibilityLabel));
        getEndIcon().setVisibility(0);
    }

    public final void showCustomEndIcon(int iconRes, Integer tintColor, String contentDescription) {
        getEndIcon().setImageDrawable(createDrawableForIcon(iconRes, tintColor));
        setOnPressAnimation(getEndIcon(), this.onIconPressAnimation);
        getEndIcon().setContentDescription(contentDescription);
        getEndIcon().setVisibility(0);
    }

    public final void showCustomStartIcon(int iconRes, Integer tintColor, String contentDescription) {
        getStartIcon().setImageDrawable(createDrawableForIcon(iconRes, tintColor));
        setOnPressAnimation(getStartIcon(), this.onIconPressAnimation);
        getStartIcon().setContentDescription(contentDescription);
        getStartIcon().setVisibility(0);
    }

    private final Drawable createDrawableForIcon(TypedArray typedArray, int iconAttrIndex, int iconDefaultRes) {
        return createDrawableForIcon$default(this, typedArray.getResourceId(iconAttrIndex, iconDefaultRes), null, 2, null);
    }

    public WebViewToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public WebViewToolbar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ WebViewToolbar(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? rng0.plus_sdk_style_WebViewToolbar : i, (i3 & 8) != 0 ? c1i0.PlusSDK_Widget_WebViewToolbar : i2);
    }

    public WebViewToolbar(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
