package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.badge.BadgeState$State;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class lm4 {
    public final BadgeState$State a;
    public final BadgeState$State b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    /* JADX WARN: Removed duplicated region for block: B:101:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0441  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lm4(Context context, int i, int i2, int i3, BadgeState$State badgeState$State) {
        int i4;
        AttributeSet attributeSet;
        int i5;
        int i6;
        int i7;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i8;
        int i9;
        Boolean bool;
        boolean z;
        int i10;
        int i11;
        Integer num;
        Integer num2;
        int intValue;
        Integer num3;
        Integer num4;
        int intValue2;
        Integer num5;
        Integer num6;
        int intValue3;
        Integer num7;
        Integer num8;
        int intValue4;
        Integer num9;
        Integer num10;
        int intValue5;
        Integer num11;
        Integer num12;
        int intValue6;
        Integer num13;
        Integer num14;
        Integer num15;
        Integer num16;
        int intValue7;
        Integer num17;
        Integer num18;
        int intValue8;
        Integer num19;
        Integer num20;
        int intValue9;
        Integer num21;
        Integer num22;
        int intValue10;
        Integer num23;
        Integer num24;
        int intValue11;
        Integer num25;
        Integer num26;
        int intValue12;
        Integer num27;
        Integer num28;
        int intValue13;
        Integer num29;
        Integer num30;
        int intValue14;
        Integer num31;
        Integer num32;
        int intValue15;
        Integer num33;
        Integer num34;
        int intValue16;
        Boolean bool2;
        Boolean bool3;
        boolean booleanValue;
        Locale locale;
        Locale locale2;
        Integer num35;
        Integer num36;
        Integer num37;
        Boolean bool4;
        String str2;
        int i12;
        BadgeState$State badgeState$State2 = new BadgeState$State();
        this.b = badgeState$State2;
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        if (i != 0) {
            badgeState$State.badgeResId = i;
        }
        i4 = badgeState$State.badgeResId;
        if (i4 != 0) {
            attributeSet = q5z.T(context, i4, "badge");
            i5 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i5 = 0;
        }
        AttributeSet attributeSet2 = attributeSet;
        int i13 = i5 == 0 ? i3 : i5;
        int[] iArr = z2i0.Badge;
        yvy0.a(context, attributeSet2, i2, i13);
        yvy0.b(context, attributeSet2, iArr, i2, i13, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, iArr, i2, i13);
        Resources resources = context.getResources();
        this.c = obtainStyledAttributes.getDimensionPixelSize(z2i0.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(org0.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(org0.mtrl_badge_text_horizontal_edge_offset);
        this.d = obtainStyledAttributes.getDimensionPixelSize(z2i0.Badge_badgeWithTextRadius, -1);
        this.e = obtainStyledAttributes.getDimension(z2i0.Badge_badgeWidth, resources.getDimension(org0.m3_badge_size));
        this.g = obtainStyledAttributes.getDimension(z2i0.Badge_badgeWithTextWidth, resources.getDimension(org0.m3_badge_with_text_size));
        this.f = obtainStyledAttributes.getDimension(z2i0.Badge_badgeHeight, resources.getDimension(org0.m3_badge_size));
        this.h = obtainStyledAttributes.getDimension(z2i0.Badge_badgeWithTextHeight, resources.getDimension(org0.m3_badge_with_text_size));
        this.k = obtainStyledAttributes.getInt(z2i0.Badge_offsetAlignmentMode, 1);
        this.l = obtainStyledAttributes.getInt(z2i0.Badge_badgeFixedEdge, 0);
        i6 = badgeState$State.alpha;
        badgeState$State2.alpha = i6 == -2 ? 255 : badgeState$State.alpha;
        i7 = badgeState$State.number;
        if (i7 != -2) {
            i12 = badgeState$State.number;
            badgeState$State2.number = i12;
        } else if (obtainStyledAttributes.hasValue(z2i0.Badge_number)) {
            badgeState$State2.number = obtainStyledAttributes.getInt(z2i0.Badge_number, 0);
        } else {
            badgeState$State2.number = -1;
        }
        str = badgeState$State.text;
        if (str != null) {
            str2 = badgeState$State.text;
            badgeState$State2.text = str2;
        } else if (obtainStyledAttributes.hasValue(z2i0.Badge_badgeText)) {
            badgeState$State2.text = obtainStyledAttributes.getString(z2i0.Badge_badgeText);
        }
        charSequence = badgeState$State.contentDescriptionForText;
        badgeState$State2.contentDescriptionForText = charSequence;
        charSequence2 = badgeState$State.contentDescriptionNumberless;
        badgeState$State2.contentDescriptionNumberless = charSequence2 == null ? context.getString(kxh0.mtrl_badge_numberless_content_description) : badgeState$State.contentDescriptionNumberless;
        i8 = badgeState$State.contentDescriptionQuantityStrings;
        badgeState$State2.contentDescriptionQuantityStrings = i8 == 0 ? yvh0.mtrl_badge_content_description : badgeState$State.contentDescriptionQuantityStrings;
        i9 = badgeState$State.contentDescriptionExceedsMaxBadgeNumberRes;
        badgeState$State2.contentDescriptionExceedsMaxBadgeNumberRes = i9 == 0 ? kxh0.mtrl_exceed_max_badge_number_content_description : badgeState$State.contentDescriptionExceedsMaxBadgeNumberRes;
        bool = badgeState$State.isVisible;
        if (bool != null) {
            bool4 = badgeState$State.isVisible;
            if (!bool4.booleanValue()) {
                z = false;
                badgeState$State2.isVisible = Boolean.valueOf(z);
                i10 = badgeState$State.maxCharacterCount;
                badgeState$State2.maxCharacterCount = i10 != -2 ? obtainStyledAttributes.getInt(z2i0.Badge_maxCharacterCount, -2) : badgeState$State.maxCharacterCount;
                i11 = badgeState$State.maxNumber;
                badgeState$State2.maxNumber = i11 != -2 ? obtainStyledAttributes.getInt(z2i0.Badge_maxNumber, -2) : badgeState$State.maxNumber;
                num = badgeState$State.badgeShapeAppearanceResId;
                if (num != null) {
                    intValue = obtainStyledAttributes.getResourceId(z2i0.Badge_badgeShapeAppearance, g2i0.ShapeAppearance_M3_Sys_Shape_Corner_Full);
                } else {
                    num2 = badgeState$State.badgeShapeAppearanceResId;
                    intValue = num2.intValue();
                }
                badgeState$State2.badgeShapeAppearanceResId = Integer.valueOf(intValue);
                num3 = badgeState$State.badgeShapeAppearanceOverlayResId;
                if (num3 != null) {
                    intValue2 = obtainStyledAttributes.getResourceId(z2i0.Badge_badgeShapeAppearanceOverlay, 0);
                } else {
                    num4 = badgeState$State.badgeShapeAppearanceOverlayResId;
                    intValue2 = num4.intValue();
                }
                badgeState$State2.badgeShapeAppearanceOverlayResId = Integer.valueOf(intValue2);
                num5 = badgeState$State.badgeWithTextShapeAppearanceResId;
                if (num5 != null) {
                    intValue3 = obtainStyledAttributes.getResourceId(z2i0.Badge_badgeWithTextShapeAppearance, g2i0.ShapeAppearance_M3_Sys_Shape_Corner_Full);
                } else {
                    num6 = badgeState$State.badgeWithTextShapeAppearanceResId;
                    intValue3 = num6.intValue();
                }
                badgeState$State2.badgeWithTextShapeAppearanceResId = Integer.valueOf(intValue3);
                num7 = badgeState$State.badgeWithTextShapeAppearanceOverlayResId;
                if (num7 != null) {
                    intValue4 = obtainStyledAttributes.getResourceId(z2i0.Badge_badgeWithTextShapeAppearanceOverlay, 0);
                } else {
                    num8 = badgeState$State.badgeWithTextShapeAppearanceOverlayResId;
                    intValue4 = num8.intValue();
                }
                badgeState$State2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(intValue4);
                num9 = badgeState$State.backgroundColor;
                if (num9 != null) {
                    intValue5 = jx81.o(context, obtainStyledAttributes, z2i0.Badge_backgroundColor).getDefaultColor();
                } else {
                    num10 = badgeState$State.backgroundColor;
                    intValue5 = num10.intValue();
                }
                badgeState$State2.backgroundColor = Integer.valueOf(intValue5);
                num11 = badgeState$State.badgeTextAppearanceResId;
                if (num11 != null) {
                    intValue6 = obtainStyledAttributes.getResourceId(z2i0.Badge_badgeTextAppearance, g2i0.TextAppearance_MaterialComponents_Badge);
                } else {
                    num12 = badgeState$State.badgeTextAppearanceResId;
                    intValue6 = num12.intValue();
                }
                badgeState$State2.badgeTextAppearanceResId = Integer.valueOf(intValue6);
                num13 = badgeState$State.badgeTextColor;
                if (num13 == null) {
                    num37 = badgeState$State.badgeTextColor;
                    badgeState$State2.badgeTextColor = num37;
                } else if (obtainStyledAttributes.hasValue(z2i0.Badge_badgeTextColor)) {
                    badgeState$State2.badgeTextColor = Integer.valueOf(jx81.o(context, obtainStyledAttributes, z2i0.Badge_badgeTextColor).getDefaultColor());
                } else {
                    num14 = badgeState$State2.badgeTextAppearanceResId;
                    int intValue17 = num14.intValue();
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, n4i0.TextAppearance);
                    obtainStyledAttributes2.getDimension(n4i0.TextAppearance_android_textSize, 0.0f);
                    ColorStateList o = jx81.o(context, obtainStyledAttributes2, n4i0.TextAppearance_android_textColor);
                    jx81.o(context, obtainStyledAttributes2, n4i0.TextAppearance_android_textColorHint);
                    jx81.o(context, obtainStyledAttributes2, n4i0.TextAppearance_android_textColorLink);
                    obtainStyledAttributes2.getInt(n4i0.TextAppearance_android_textStyle, 0);
                    obtainStyledAttributes2.getInt(n4i0.TextAppearance_android_typeface, 1);
                    int i14 = n4i0.TextAppearance_fontFamily;
                    i14 = obtainStyledAttributes2.hasValue(i14) ? i14 : n4i0.TextAppearance_android_fontFamily;
                    obtainStyledAttributes2.getResourceId(i14, 0);
                    obtainStyledAttributes2.getString(i14);
                    obtainStyledAttributes2.getBoolean(n4i0.TextAppearance_textAllCaps, false);
                    jx81.o(context, obtainStyledAttributes2, n4i0.TextAppearance_android_shadowColor);
                    obtainStyledAttributes2.getFloat(n4i0.TextAppearance_android_shadowDx, 0.0f);
                    obtainStyledAttributes2.getFloat(n4i0.TextAppearance_android_shadowDy, 0.0f);
                    obtainStyledAttributes2.getFloat(n4i0.TextAppearance_android_shadowRadius, 0.0f);
                    obtainStyledAttributes2.recycle();
                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(intValue17, z2i0.MaterialTextAppearance);
                    obtainStyledAttributes3.hasValue(z2i0.MaterialTextAppearance_android_letterSpacing);
                    obtainStyledAttributes3.getFloat(z2i0.MaterialTextAppearance_android_letterSpacing, 0.0f);
                    int i15 = z2i0.MaterialTextAppearance_fontVariationSettings;
                    obtainStyledAttributes3.getString(obtainStyledAttributes3.hasValue(i15) ? i15 : z2i0.MaterialTextAppearance_android_fontVariationSettings);
                    obtainStyledAttributes3.recycle();
                    badgeState$State2.badgeTextColor = Integer.valueOf(o.getDefaultColor());
                }
                num15 = badgeState$State.badgeGravity;
                if (num15 != null) {
                    intValue7 = obtainStyledAttributes.getInt(z2i0.Badge_badgeGravity, 8388661);
                } else {
                    num16 = badgeState$State.badgeGravity;
                    intValue7 = num16.intValue();
                }
                badgeState$State2.badgeGravity = Integer.valueOf(intValue7);
                num17 = badgeState$State.badgeHorizontalPadding;
                if (num17 != null) {
                    intValue8 = obtainStyledAttributes.getDimensionPixelSize(z2i0.Badge_badgeWidePadding, resources.getDimensionPixelSize(org0.mtrl_badge_long_text_horizontal_padding));
                } else {
                    num18 = badgeState$State.badgeHorizontalPadding;
                    intValue8 = num18.intValue();
                }
                badgeState$State2.badgeHorizontalPadding = Integer.valueOf(intValue8);
                num19 = badgeState$State.badgeVerticalPadding;
                if (num19 != null) {
                    intValue9 = obtainStyledAttributes.getDimensionPixelSize(z2i0.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(org0.m3_badge_with_text_vertical_padding));
                } else {
                    num20 = badgeState$State.badgeVerticalPadding;
                    intValue9 = num20.intValue();
                }
                badgeState$State2.badgeVerticalPadding = Integer.valueOf(intValue9);
                num21 = badgeState$State.horizontalOffsetWithoutText;
                if (num21 != null) {
                    intValue10 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.Badge_horizontalOffset, 0);
                } else {
                    num22 = badgeState$State.horizontalOffsetWithoutText;
                    intValue10 = num22.intValue();
                }
                badgeState$State2.horizontalOffsetWithoutText = Integer.valueOf(intValue10);
                num23 = badgeState$State.verticalOffsetWithoutText;
                if (num23 != null) {
                    intValue11 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.Badge_verticalOffset, 0);
                } else {
                    num24 = badgeState$State.verticalOffsetWithoutText;
                    intValue11 = num24.intValue();
                }
                badgeState$State2.verticalOffsetWithoutText = Integer.valueOf(intValue11);
                num25 = badgeState$State.horizontalOffsetWithText;
                if (num25 != null) {
                    int i16 = z2i0.Badge_horizontalOffsetWithText;
                    num36 = badgeState$State2.horizontalOffsetWithoutText;
                    intValue12 = obtainStyledAttributes.getDimensionPixelOffset(i16, num36.intValue());
                } else {
                    num26 = badgeState$State.horizontalOffsetWithText;
                    intValue12 = num26.intValue();
                }
                badgeState$State2.horizontalOffsetWithText = Integer.valueOf(intValue12);
                num27 = badgeState$State.verticalOffsetWithText;
                if (num27 != null) {
                    int i17 = z2i0.Badge_verticalOffsetWithText;
                    num35 = badgeState$State2.verticalOffsetWithoutText;
                    intValue13 = obtainStyledAttributes.getDimensionPixelOffset(i17, num35.intValue());
                } else {
                    num28 = badgeState$State.verticalOffsetWithText;
                    intValue13 = num28.intValue();
                }
                badgeState$State2.verticalOffsetWithText = Integer.valueOf(intValue13);
                num29 = badgeState$State.largeFontVerticalOffsetAdjustment;
                if (num29 != null) {
                    intValue14 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.Badge_largeFontVerticalOffsetAdjustment, 0);
                } else {
                    num30 = badgeState$State.largeFontVerticalOffsetAdjustment;
                    intValue14 = num30.intValue();
                }
                badgeState$State2.largeFontVerticalOffsetAdjustment = Integer.valueOf(intValue14);
                num31 = badgeState$State.additionalHorizontalOffset;
                if (num31 != null) {
                    intValue15 = 0;
                } else {
                    num32 = badgeState$State.additionalHorizontalOffset;
                    intValue15 = num32.intValue();
                }
                badgeState$State2.additionalHorizontalOffset = Integer.valueOf(intValue15);
                num33 = badgeState$State.additionalVerticalOffset;
                if (num33 != null) {
                    intValue16 = 0;
                } else {
                    num34 = badgeState$State.additionalVerticalOffset;
                    intValue16 = num34.intValue();
                }
                badgeState$State2.additionalVerticalOffset = Integer.valueOf(intValue16);
                bool2 = badgeState$State.autoAdjustToWithinGrandparentBounds;
                if (bool2 != null) {
                    booleanValue = obtainStyledAttributes.getBoolean(z2i0.Badge_autoAdjustToWithinGrandparentBounds, false);
                } else {
                    bool3 = badgeState$State.autoAdjustToWithinGrandparentBounds;
                    booleanValue = bool3.booleanValue();
                }
                badgeState$State2.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(booleanValue);
                obtainStyledAttributes.recycle();
                locale = badgeState$State.numberLocale;
                if (locale != null) {
                    badgeState$State2.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
                } else {
                    locale2 = badgeState$State.numberLocale;
                    badgeState$State2.numberLocale = locale2;
                }
                this.a = badgeState$State;
            }
        }
        z = true;
        badgeState$State2.isVisible = Boolean.valueOf(z);
        i10 = badgeState$State.maxCharacterCount;
        badgeState$State2.maxCharacterCount = i10 != -2 ? obtainStyledAttributes.getInt(z2i0.Badge_maxCharacterCount, -2) : badgeState$State.maxCharacterCount;
        i11 = badgeState$State.maxNumber;
        badgeState$State2.maxNumber = i11 != -2 ? obtainStyledAttributes.getInt(z2i0.Badge_maxNumber, -2) : badgeState$State.maxNumber;
        num = badgeState$State.badgeShapeAppearanceResId;
        if (num != null) {
        }
        badgeState$State2.badgeShapeAppearanceResId = Integer.valueOf(intValue);
        num3 = badgeState$State.badgeShapeAppearanceOverlayResId;
        if (num3 != null) {
        }
        badgeState$State2.badgeShapeAppearanceOverlayResId = Integer.valueOf(intValue2);
        num5 = badgeState$State.badgeWithTextShapeAppearanceResId;
        if (num5 != null) {
        }
        badgeState$State2.badgeWithTextShapeAppearanceResId = Integer.valueOf(intValue3);
        num7 = badgeState$State.badgeWithTextShapeAppearanceOverlayResId;
        if (num7 != null) {
        }
        badgeState$State2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(intValue4);
        num9 = badgeState$State.backgroundColor;
        if (num9 != null) {
        }
        badgeState$State2.backgroundColor = Integer.valueOf(intValue5);
        num11 = badgeState$State.badgeTextAppearanceResId;
        if (num11 != null) {
        }
        badgeState$State2.badgeTextAppearanceResId = Integer.valueOf(intValue6);
        num13 = badgeState$State.badgeTextColor;
        if (num13 == null) {
        }
        num15 = badgeState$State.badgeGravity;
        if (num15 != null) {
        }
        badgeState$State2.badgeGravity = Integer.valueOf(intValue7);
        num17 = badgeState$State.badgeHorizontalPadding;
        if (num17 != null) {
        }
        badgeState$State2.badgeHorizontalPadding = Integer.valueOf(intValue8);
        num19 = badgeState$State.badgeVerticalPadding;
        if (num19 != null) {
        }
        badgeState$State2.badgeVerticalPadding = Integer.valueOf(intValue9);
        num21 = badgeState$State.horizontalOffsetWithoutText;
        if (num21 != null) {
        }
        badgeState$State2.horizontalOffsetWithoutText = Integer.valueOf(intValue10);
        num23 = badgeState$State.verticalOffsetWithoutText;
        if (num23 != null) {
        }
        badgeState$State2.verticalOffsetWithoutText = Integer.valueOf(intValue11);
        num25 = badgeState$State.horizontalOffsetWithText;
        if (num25 != null) {
        }
        badgeState$State2.horizontalOffsetWithText = Integer.valueOf(intValue12);
        num27 = badgeState$State.verticalOffsetWithText;
        if (num27 != null) {
        }
        badgeState$State2.verticalOffsetWithText = Integer.valueOf(intValue13);
        num29 = badgeState$State.largeFontVerticalOffsetAdjustment;
        if (num29 != null) {
        }
        badgeState$State2.largeFontVerticalOffsetAdjustment = Integer.valueOf(intValue14);
        num31 = badgeState$State.additionalHorizontalOffset;
        if (num31 != null) {
        }
        badgeState$State2.additionalHorizontalOffset = Integer.valueOf(intValue15);
        num33 = badgeState$State.additionalVerticalOffset;
        if (num33 != null) {
        }
        badgeState$State2.additionalVerticalOffset = Integer.valueOf(intValue16);
        bool2 = badgeState$State.autoAdjustToWithinGrandparentBounds;
        if (bool2 != null) {
        }
        badgeState$State2.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(booleanValue);
        obtainStyledAttributes.recycle();
        locale = badgeState$State.numberLocale;
        if (locale != null) {
        }
        this.a = badgeState$State;
    }
}
