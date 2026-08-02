package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.amy0;
import defpackage.bmy0;
import defpackage.dky0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.kxh0;
import defpackage.lm4;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.yvy0;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes11.dex */
public class BadgeDrawable extends Drawable implements amy0 {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    public static final int BADGE_FIXED_EDGE_END = 1;
    public static final int BADGE_FIXED_EDGE_START = 0;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";
    private static final int DEFAULT_STYLE = g2i0.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = eng0.badgeStyle;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private WeakReference<View> anchorViewRef;
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final MaterialShapeDrawable shapeDrawable;
    private final lm4 state;
    private final bmy0 textDrawableHelper;

    private BadgeDrawable(Context context, int i, int i2, int i3, BadgeState$State badgeState$State) {
        Integer num;
        int intValue;
        Integer num2;
        int intValue2;
        Integer num3;
        Integer num4;
        this.contextRef = new WeakReference<>(context);
        yvy0.c(context, yvy0.b, "Theme.MaterialComponents");
        this.badgeBounds = new Rect();
        bmy0 bmy0Var = new bmy0(this);
        this.textDrawableHelper = bmy0Var;
        bmy0Var.a.setTextAlign(Paint.Align.CENTER);
        lm4 lm4Var = new lm4(context, i, i2, i3, badgeState$State);
        this.state = lm4Var;
        boolean hasBadgeContent = hasBadgeContent();
        BadgeState$State badgeState$State2 = lm4Var.b;
        if (hasBadgeContent) {
            num4 = badgeState$State2.badgeWithTextShapeAppearanceResId;
            intValue = num4.intValue();
        } else {
            num = badgeState$State2.badgeShapeAppearanceResId;
            intValue = num.intValue();
        }
        if (hasBadgeContent()) {
            num3 = badgeState$State2.badgeWithTextShapeAppearanceOverlayResId;
            intValue2 = num3.intValue();
        } else {
            num2 = badgeState$State2.badgeShapeAppearanceOverlayResId;
            intValue2 = num2.intValue();
        }
        this.shapeDrawable = new MaterialShapeDrawable(b.g(context, intValue, intValue2).a());
        restoreState();
    }

    private void autoAdjustWithinGrandparentBounds(View view) {
        ViewParent customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            customBadgeParent = view.getParent();
        }
        if ((customBadgeParent instanceof View) && (customBadgeParent.getParent() instanceof View)) {
            autoAdjustWithinViewBounds(view, (View) customBadgeParent.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void autoAdjustWithinViewBounds(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = customBadgeParent;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float topCutOff = getTopCutOff(f);
            float leftCutOff = getLeftCutOff(f2);
            View view5 = view3;
            float bottomCutOff = getBottomCutOff(view5.getHeight(), f);
            float rightCutoff = getRightCutoff(view5.getWidth(), f2);
            if (topCutOff < 0.0f) {
                this.badgeCenterY = Math.abs(topCutOff) + this.badgeCenterY;
            }
            if (leftCutOff < 0.0f) {
                this.badgeCenterX = Math.abs(leftCutOff) + this.badgeCenterX;
            }
            if (bottomCutOff > 0.0f) {
                this.badgeCenterY -= Math.abs(bottomCutOff);
            }
            if (rightCutoff > 0.0f) {
                this.badgeCenterX -= Math.abs(rightCutoff);
            }
        }
    }

    private void calculateCenterAndBounds(Rect rect, View view) {
        Integer num;
        Integer num2;
        Boolean bool;
        Integer num3;
        Integer num4;
        boolean hasBadgeContent = hasBadgeContent();
        lm4 lm4Var = this.state;
        float f = hasBadgeContent ? lm4Var.d : lm4Var.c;
        this.cornerRadius = f;
        if (f != -1.0f) {
            this.halfBadgeWidth = f;
            this.halfBadgeHeight = f;
        } else {
            boolean hasBadgeContent2 = hasBadgeContent();
            lm4 lm4Var2 = this.state;
            this.halfBadgeWidth = Math.round((hasBadgeContent2 ? lm4Var2.g : lm4Var2.e) / 2.0f);
            boolean hasBadgeContent3 = hasBadgeContent();
            lm4 lm4Var3 = this.state;
            this.halfBadgeHeight = Math.round((hasBadgeContent3 ? lm4Var3.h : lm4Var3.f) / 2.0f);
        }
        if (hasBadgeContent()) {
            String badgeContent = getBadgeContent();
            float f2 = this.halfBadgeWidth;
            float a = this.textDrawableHelper.a(badgeContent) / 2.0f;
            num3 = this.state.b.badgeHorizontalPadding;
            this.halfBadgeWidth = Math.max(f2, a + num3.intValue());
            float f3 = this.halfBadgeHeight;
            bmy0 bmy0Var = this.textDrawableHelper;
            if (bmy0Var.e) {
                bmy0Var.b(badgeContent);
            }
            float f4 = bmy0Var.d / 2.0f;
            num4 = this.state.b.badgeVerticalPadding;
            float max = Math.max(f3, f4 + num4.intValue());
            this.halfBadgeHeight = max;
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, max);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        num = this.state.b.badgeGravity;
        int intValue = num.intValue();
        if (intValue == 8388691 || intValue == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        num2 = this.state.b.badgeGravity;
        int intValue2 = num2.intValue();
        if (intValue2 == 8388659 || intValue2 == 8388691) {
            this.badgeCenterX = this.state.l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.halfBadgeWidth) - ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState) : (rect.right - this.halfBadgeWidth) + ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState) : view.getLayoutDirection() == 0 ? (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState : (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
        } else {
            this.badgeCenterX = this.state.l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState : (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState : view.getLayoutDirection() == 0 ? (rect.right - this.halfBadgeWidth) + ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState) : (rect.left + this.halfBadgeWidth) - ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState);
        }
        bool = this.state.b.autoAdjustToWithinGrandparentBounds;
        if (bool.booleanValue()) {
            autoAdjustWithinGrandparentBounds(view);
        } else {
            autoAdjustWithinViewBounds(view, null);
        }
    }

    public static BadgeDrawable create(Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static BadgeDrawable createFromResource(Context context, int i) {
        return new BadgeDrawable(context, i, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static BadgeDrawable createFromSavedState(Context context, BadgeState$State badgeState$State) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, badgeState$State);
    }

    private void drawBadgeContent(Canvas canvas) {
        String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            Rect rect = new Rect();
            this.textDrawableHelper.a.getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float exactCenterY = this.badgeCenterY - rect.exactCenterY();
            canvas.drawText(badgeContent, this.badgeCenterX, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.textDrawableHelper.a);
        }
    }

    private String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    private float getBottomCutOff(float f, float f2) {
        return ((this.badgeCenterY + this.halfBadgeHeight) - f) + f2;
    }

    private CharSequence getEmptyContentDescription() {
        CharSequence charSequence;
        charSequence = this.state.b.contentDescriptionNumberless;
        return charSequence;
    }

    private float getLeftCutOff(float f) {
        return (this.badgeCenterX - this.halfBadgeWidth) + f;
    }

    private String getNumberBadgeText() {
        Locale locale;
        Locale locale2;
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            locale = this.state.b.numberLocale;
            return NumberFormat.getInstance(locale).format(getNumber());
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        locale2 = this.state.b.numberLocale;
        return String.format(locale2, context.getString(kxh0.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
    }

    private String getNumberContentDescription() {
        int i;
        Context context;
        int i2;
        int i3;
        i = this.state.b.contentDescriptionQuantityStrings;
        if (i == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (this.maxBadgeNumber != -2 && getNumber() > this.maxBadgeNumber) {
            i3 = this.state.b.contentDescriptionExceedsMaxBadgeNumberRes;
            return context.getString(i3, Integer.valueOf(this.maxBadgeNumber));
        }
        Resources resources = context.getResources();
        i2 = this.state.b.contentDescriptionQuantityStrings;
        return resources.getQuantityString(i2, getNumber(), Integer.valueOf(getNumber()));
    }

    private float getRightCutoff(float f, float f2) {
        return ((this.badgeCenterX + this.halfBadgeWidth) - f) + f2;
    }

    private String getTextBadgeText() {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(kxh0.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), "…");
    }

    private CharSequence getTextContentDescription() {
        CharSequence charSequence;
        charSequence = this.state.b.contentDescriptionForText;
        return charSequence != null ? charSequence : getText();
    }

    private float getTopCutOff(float f) {
        return (this.badgeCenterY - this.halfBadgeHeight) + f;
    }

    private int getTotalHorizontalOffsetForState() {
        Integer num;
        int intValue;
        Integer num2;
        Integer num3;
        boolean hasBadgeContent = hasBadgeContent();
        lm4 lm4Var = this.state;
        if (hasBadgeContent) {
            num3 = lm4Var.b.horizontalOffsetWithText;
            intValue = num3.intValue();
        } else {
            num = lm4Var.b.horizontalOffsetWithoutText;
            intValue = num.intValue();
        }
        if (this.state.k == 1) {
            boolean hasBadgeContent2 = hasBadgeContent();
            lm4 lm4Var2 = this.state;
            intValue += hasBadgeContent2 ? lm4Var2.j : lm4Var2.i;
        }
        num2 = this.state.b.additionalHorizontalOffset;
        return num2.intValue() + intValue;
    }

    private int getTotalVerticalOffsetForState() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        num = this.state.b.verticalOffsetWithoutText;
        int intValue = num.intValue();
        if (hasBadgeContent()) {
            num3 = this.state.b.verticalOffsetWithText;
            intValue = num3.intValue();
            Context context = this.contextRef.get();
            if (context != null) {
                float b = mj2.b(0.0f, 1.0f, 0.3f, 1.0f, context.getResources().getConfiguration().fontScale - 1.0f);
                num4 = this.state.b.largeFontVerticalOffsetAdjustment;
                intValue = mj2.c(intValue, intValue - num4.intValue(), b);
            }
        }
        if (this.state.k == 0) {
            intValue -= Math.round(this.halfBadgeHeight);
        }
        num2 = this.state.b.additionalVerticalOffset;
        return num2.intValue() + intValue;
    }

    private boolean hasBadgeContent() {
        return hasText() || hasNumber();
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        Integer num;
        num = this.state.b.backgroundColor;
        ColorStateList valueOf = ColorStateList.valueOf(num.intValue());
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.e = true;
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeGravityUpdated() {
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.anchorViewRef.get();
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void onBadgeShapeAppearanceUpdated() {
        Integer num;
        int intValue;
        Integer num2;
        int intValue2;
        Integer num3;
        Integer num4;
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        boolean hasBadgeContent = hasBadgeContent();
        lm4 lm4Var = this.state;
        if (hasBadgeContent) {
            num4 = lm4Var.b.badgeWithTextShapeAppearanceResId;
            intValue = num4.intValue();
        } else {
            num = lm4Var.b.badgeShapeAppearanceResId;
            intValue = num.intValue();
        }
        boolean hasBadgeContent2 = hasBadgeContent();
        lm4 lm4Var2 = this.state;
        if (hasBadgeContent2) {
            num3 = lm4Var2.b.badgeWithTextShapeAppearanceOverlayResId;
            intValue2 = num3.intValue();
        } else {
            num2 = lm4Var2.b.badgeShapeAppearanceOverlayResId;
            intValue2 = num2.intValue();
        }
        materialShapeDrawable.setShapeAppearanceModel(b.g(context, intValue, intValue2).a());
        invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        Integer num;
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        num = this.state.b.badgeTextAppearanceResId;
        dky0 dky0Var = new dky0(context, num.intValue());
        bmy0 bmy0Var = this.textDrawableHelper;
        if (bmy0Var.g == dky0Var) {
            return;
        }
        bmy0Var.c(dky0Var, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        Integer num;
        TextPaint textPaint = this.textDrawableHelper.a;
        num = this.state.b.badgeTextColor;
        textPaint.setColor(num.intValue());
        invalidateSelf();
    }

    private void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.e = true;
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onNumberUpdated() {
        if (hasText()) {
            return;
        }
        onBadgeContentUpdated();
    }

    private void onTextUpdated() {
        onBadgeContentUpdated();
    }

    private void onVisibilityUpdated() {
        Boolean bool;
        bool = this.state.b.isVisible;
        setVisible(bool.booleanValue(), false);
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(rect2, view);
        Rect rect3 = this.badgeBounds;
        float f = this.badgeCenterX;
        float f2 = this.badgeCenterY;
        float f3 = this.halfBadgeWidth;
        float f4 = this.halfBadgeHeight;
        rect3.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
        float f5 = this.cornerRadius;
        if (f5 != -1.0f) {
            this.shapeDrawable.setCornerSize(f5);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }

    public void clearNumber() {
        int i;
        i = this.state.b.number;
        if (i != -1) {
            lm4 lm4Var = this.state;
            lm4Var.a.number = -1;
            lm4Var.b.number = -1;
            onNumberUpdated();
        }
    }

    public void clearText() {
        String str;
        str = this.state.b.text;
        if (str != null) {
            lm4 lm4Var = this.state;
            lm4Var.a.text = null;
            lm4Var.b.text = null;
            onTextUpdated();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasBadgeContent()) {
            drawBadgeContent(canvas);
        }
    }

    public int getAdditionalHorizontalOffset() {
        Integer num;
        num = this.state.b.additionalHorizontalOffset;
        return num.intValue();
    }

    public int getAdditionalVerticalOffset() {
        Integer num;
        num = this.state.b.additionalVerticalOffset;
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i;
        i = this.state.b.alpha;
        return i;
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        Integer num;
        num = this.state.b.badgeGravity;
        return num.intValue();
    }

    public Locale getBadgeNumberLocale() {
        Locale locale;
        locale = this.state.b.numberLocale;
        return locale;
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.a.getColor();
    }

    public CharSequence getContentDescription() {
        if (isVisible()) {
            return hasText() ? getTextContentDescription() : hasNumber() ? getNumberContentDescription() : getEmptyContentDescription();
        }
        return null;
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        Integer num;
        num = this.state.b.horizontalOffsetWithoutText;
        return num.intValue();
    }

    public int getHorizontalOffsetWithText() {
        Integer num;
        num = this.state.b.horizontalOffsetWithText;
        return num.intValue();
    }

    public int getHorizontalOffsetWithoutText() {
        Integer num;
        num = this.state.b.horizontalOffsetWithoutText;
        return num.intValue();
    }

    public int getHorizontalPadding() {
        Integer num;
        num = this.state.b.badgeHorizontalPadding;
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        Integer num;
        num = this.state.b.largeFontVerticalOffsetAdjustment;
        return num.intValue();
    }

    public int getMaxCharacterCount() {
        int i;
        i = this.state.b.maxCharacterCount;
        return i;
    }

    public int getMaxNumber() {
        int i;
        i = this.state.b.maxNumber;
        return i;
    }

    public int getNumber() {
        int i;
        int i2;
        i = this.state.b.number;
        if (i == -1) {
            return 0;
        }
        i2 = this.state.b.number;
        return i2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public BadgeState$State getSavedState() {
        return this.state.a;
    }

    public String getText() {
        String str;
        str = this.state.b.text;
        return str;
    }

    public int getVerticalOffset() {
        Integer num;
        num = this.state.b.verticalOffsetWithoutText;
        return num.intValue();
    }

    public int getVerticalOffsetWithText() {
        Integer num;
        num = this.state.b.verticalOffsetWithText;
        return num.intValue();
    }

    public int getVerticalOffsetWithoutText() {
        Integer num;
        num = this.state.b.verticalOffsetWithoutText;
        return num.intValue();
    }

    public int getVerticalPadding() {
        Integer num;
        num = this.state.b.badgeVerticalPadding;
        return num.intValue();
    }

    public boolean hasNumber() {
        String str;
        int i;
        str = this.state.b.text;
        if (str != null) {
            return false;
        }
        i = this.state.b.number;
        return i != -1;
    }

    public boolean hasText() {
        String str;
        str = this.state.b.text;
        return str != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.amy0
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // defpackage.amy0
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.additionalHorizontalOffset = Integer.valueOf(i);
        lm4Var.b.additionalHorizontalOffset = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.additionalVerticalOffset = Integer.valueOf(i);
        lm4Var.b.additionalVerticalOffset = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.alpha = i;
        lm4Var.b.alpha = i;
        onAlphaUpdated();
    }

    @Deprecated
    public void setAutoAdjustToWithinGrandparentBounds(boolean z) {
        Boolean bool;
        bool = this.state.b.autoAdjustToWithinGrandparentBounds;
        if (bool.booleanValue() == z) {
            return;
        }
        lm4 lm4Var = this.state;
        lm4Var.a.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z);
        lm4Var.b.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z);
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
    }

    public void setBackgroundColor(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.backgroundColor = Integer.valueOf(i);
        lm4Var.b.backgroundColor = Integer.valueOf(i);
        onBackgroundColorUpdated();
    }

    public void setBadgeFixedEdge(int i) {
        lm4 lm4Var = this.state;
        if (lm4Var.l != i) {
            lm4Var.l = i;
            updateCenterAndBounds();
        }
    }

    public void setBadgeGravity(int i) {
        Integer num;
        if (i != 8388691) {
        }
        num = this.state.b.badgeGravity;
        if (num.intValue() != i) {
            lm4 lm4Var = this.state;
            lm4Var.a.badgeGravity = Integer.valueOf(i);
            lm4Var.b.badgeGravity = Integer.valueOf(i);
            onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(Locale locale) {
        Locale locale2;
        locale2 = this.state.b.numberLocale;
        if (locale.equals(locale2)) {
            return;
        }
        lm4 lm4Var = this.state;
        lm4Var.a.numberLocale = locale;
        lm4Var.b.numberLocale = locale;
        invalidateSelf();
    }

    public void setBadgeTextColor(int i) {
        if (this.textDrawableHelper.a.getColor() != i) {
            lm4 lm4Var = this.state;
            lm4Var.a.badgeTextColor = Integer.valueOf(i);
            lm4Var.b.badgeTextColor = Integer.valueOf(i);
            onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
        lm4Var.b.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
        lm4Var.b.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.badgeShapeAppearanceResId = Integer.valueOf(i);
        lm4Var.b.badgeShapeAppearanceResId = Integer.valueOf(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
        lm4Var.b.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
        onBadgeShapeAppearanceUpdated();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.contentDescriptionExceedsMaxBadgeNumberRes = i;
        lm4Var.b.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        lm4 lm4Var = this.state;
        lm4Var.a.contentDescriptionForText = charSequence;
        lm4Var.b.contentDescriptionForText = charSequence;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        lm4 lm4Var = this.state;
        lm4Var.a.contentDescriptionNumberless = charSequence;
        lm4Var.b.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.contentDescriptionQuantityStrings = i;
        lm4Var.b.contentDescriptionQuantityStrings = i;
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public void setHorizontalOffsetWithText(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.horizontalOffsetWithText = Integer.valueOf(i);
        lm4Var.b.horizontalOffsetWithText = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.horizontalOffsetWithoutText = Integer.valueOf(i);
        lm4Var.b.horizontalOffsetWithoutText = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setHorizontalPadding(int i) {
        Integer num;
        num = this.state.b.badgeHorizontalPadding;
        if (i != num.intValue()) {
            lm4 lm4Var = this.state;
            lm4Var.a.badgeHorizontalPadding = Integer.valueOf(i);
            lm4Var.b.badgeHorizontalPadding = Integer.valueOf(i);
            updateCenterAndBounds();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
        lm4Var.b.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i) {
        int i2;
        i2 = this.state.b.maxCharacterCount;
        if (i2 != i) {
            lm4 lm4Var = this.state;
            lm4Var.a.maxCharacterCount = i;
            lm4Var.b.maxCharacterCount = i;
            onMaxBadgeLengthUpdated();
        }
    }

    public void setMaxNumber(int i) {
        int i2;
        i2 = this.state.b.maxNumber;
        if (i2 != i) {
            lm4 lm4Var = this.state;
            lm4Var.a.maxNumber = i;
            lm4Var.b.maxNumber = i;
            onMaxBadgeLengthUpdated();
        }
    }

    public void setNumber(int i) {
        int i2;
        int max = Math.max(0, i);
        i2 = this.state.b.number;
        if (i2 != max) {
            lm4 lm4Var = this.state;
            lm4Var.a.number = max;
            lm4Var.b.number = max;
            onNumberUpdated();
        }
    }

    public void setText(String str) {
        String str2;
        str2 = this.state.b.text;
        if (TextUtils.equals(str2, str)) {
            return;
        }
        lm4 lm4Var = this.state;
        lm4Var.a.text = str;
        lm4Var.b.text = str;
        onTextUpdated();
    }

    public void setTextAppearance(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.badgeTextAppearanceResId = Integer.valueOf(i);
        lm4Var.b.badgeTextAppearanceResId = Integer.valueOf(i);
        onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public void setVerticalOffsetWithText(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.verticalOffsetWithText = Integer.valueOf(i);
        lm4Var.b.verticalOffsetWithText = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(int i) {
        lm4 lm4Var = this.state;
        lm4Var.a.verticalOffsetWithoutText = Integer.valueOf(i);
        lm4Var.b.verticalOffsetWithoutText = Integer.valueOf(i);
        updateCenterAndBounds();
    }

    public void setVerticalPadding(int i) {
        Integer num;
        num = this.state.b.badgeVerticalPadding;
        if (i != num.intValue()) {
            lm4 lm4Var = this.state;
            lm4Var.a.badgeVerticalPadding = Integer.valueOf(i);
            lm4Var.b.badgeVerticalPadding = Integer.valueOf(i);
            updateCenterAndBounds();
        }
    }

    public void setVisible(boolean z) {
        lm4 lm4Var = this.state;
        lm4Var.a.isVisible = Boolean.valueOf(z);
        lm4Var.b.isVisible = Boolean.valueOf(z);
        onVisibilityUpdated();
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        this.customBadgeParentRef = new WeakReference<>(frameLayout);
        updateAnchorParentToNotClip(view);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void updateBadgeCoordinates(View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
        } else {
            ny61.g("customBadgeParent must be a FrameLayout");
        }
    }
}
