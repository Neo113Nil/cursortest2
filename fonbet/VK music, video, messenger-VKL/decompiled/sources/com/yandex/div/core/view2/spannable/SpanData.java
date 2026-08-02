package com.yandex.div.core.view2.spannable;

import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import org.json.JSONObject;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: SpanData.kt */
/* loaded from: classes7.dex */
public final class SpanData implements Comparable<SpanData> {
    public static final Companion Companion = new Companion(null);
    private static final DivSizeUnit DEFAULT_FONT_SIZE_UNIT = DivSizeUnit.SP;
    private final DivTextAlignmentVertical alignmentVertical;
    private final int baselineOffset;
    private final int end;
    private final String fontFamily;
    private final String fontFeatureSettings;
    private final Integer fontSize;
    private final DivSizeUnit fontSizeUnit;
    private final JSONObject fontVariationSettings;
    private final DivFontWeight fontWeight;
    private final Integer fontWeightValue;
    private final Double letterSpacing;
    private final Integer lineHeight;
    private final MaskData mask;
    private final int start;
    private final DivLineStyle strike;
    private final Integer textColor;
    private final ShadowData textShadow;
    private final Integer topOffset;
    private final Integer topOffsetEnd;
    private final Integer topOffsetStart;
    private final DivLineStyle underline;

    /* compiled from: SpanData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final SpanData empty$div_release(int i, int i2) {
            return new SpanData(i, i2, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public final SpanData lineHeight$div_release(int i, int i2, int i3) {
            return new SpanData(i, i2, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, Integer.valueOf(i3), null, null, null, null, null, null, null, null);
        }

        private Companion() {
        }
    }

    public SpanData(int i, int i2, DivTextAlignmentVertical divTextAlignmentVertical, int i3, String str, String str2, Integer num, DivSizeUnit divSizeUnit, DivFontWeight divFontWeight, Integer num2, JSONObject jSONObject, Double d, Integer num3, MaskData maskData, DivLineStyle divLineStyle, Integer num4, ShadowData shadowData, Integer num5, Integer num6, Integer num7, DivLineStyle divLineStyle2) {
        this.start = i;
        this.end = i2;
        this.alignmentVertical = divTextAlignmentVertical;
        this.baselineOffset = i3;
        this.fontFamily = str;
        this.fontFeatureSettings = str2;
        this.fontSize = num;
        this.fontSizeUnit = divSizeUnit;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num2;
        this.fontVariationSettings = jSONObject;
        this.letterSpacing = d;
        this.lineHeight = num3;
        this.mask = maskData;
        this.strike = divLineStyle;
        this.textColor = num4;
        this.textShadow = shadowData;
        this.topOffset = num5;
        this.topOffsetStart = num6;
        this.topOffsetEnd = num7;
        this.underline = divLineStyle2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) obj;
        return this.start == spanData.start && this.end == spanData.end && this.alignmentVertical == spanData.alignmentVertical && this.baselineOffset == spanData.baselineOffset && epx.f(this.fontFamily, spanData.fontFamily) && epx.f(this.fontFeatureSettings, spanData.fontFeatureSettings) && epx.f(this.fontSize, spanData.fontSize) && this.fontSizeUnit == spanData.fontSizeUnit && this.fontWeight == spanData.fontWeight && epx.f(this.fontWeightValue, spanData.fontWeightValue) && epx.f(this.fontVariationSettings, spanData.fontVariationSettings) && epx.f(this.letterSpacing, spanData.letterSpacing) && epx.f(this.lineHeight, spanData.lineHeight) && epx.f(this.mask, spanData.mask) && this.strike == spanData.strike && epx.f(this.textColor, spanData.textColor) && epx.f(this.textShadow, spanData.textShadow) && epx.f(this.topOffset, spanData.topOffset) && epx.f(this.topOffsetStart, spanData.topOffsetStart) && epx.f(this.topOffsetEnd, spanData.topOffsetEnd) && this.underline == spanData.underline;
    }

    public final DivTextAlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final MaskData getMask() {
        return this.mask;
    }

    public final int getStart() {
        return this.start;
    }

    public final DivLineStyle getStrike() {
        return this.strike;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    public final Integer getTopOffset() {
        return this.topOffset;
    }

    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    public final DivLineStyle getUnderline() {
        return this.underline;
    }

    public int hashCode() {
        int a = shy.a(this.end, Integer.hashCode(this.start) * 31, 31);
        DivTextAlignmentVertical divTextAlignmentVertical = this.alignmentVertical;
        int a2 = shy.a(this.baselineOffset, (a + (divTextAlignmentVertical == null ? 0 : divTextAlignmentVertical.hashCode())) * 31, 31);
        String str = this.fontFamily;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fontFeatureSettings;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fontSize;
        int hashCode3 = (this.fontSizeUnit.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int hashCode4 = (hashCode3 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num2 = this.fontWeightValue;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.fontVariationSettings;
        int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d = this.letterSpacing;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.lineHeight;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MaskData maskData = this.mask;
        int hashCode9 = (hashCode8 + (maskData == null ? 0 : maskData.hashCode())) * 31;
        DivLineStyle divLineStyle = this.strike;
        int hashCode10 = (hashCode9 + (divLineStyle == null ? 0 : divLineStyle.hashCode())) * 31;
        Integer num4 = this.textColor;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShadowData shadowData = this.textShadow;
        int hashCode12 = (hashCode11 + (shadowData == null ? 0 : shadowData.hashCode())) * 31;
        Integer num5 = this.topOffset;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.topOffsetStart;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.topOffsetEnd;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        DivLineStyle divLineStyle2 = this.underline;
        return hashCode15 + (divLineStyle2 != null ? divLineStyle2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.alignmentVertical == null && this.baselineOffset == 0 && this.fontFamily == null && this.fontFeatureSettings == null && this.fontSize == null && this.fontSizeUnit == DEFAULT_FONT_SIZE_UNIT && this.fontWeight == null && this.fontWeightValue == null && this.letterSpacing == null && this.lineHeight == null && this.mask == null && this.strike == null && this.textColor == null && this.textShadow == null && this.topOffset == null && this.topOffsetStart == null && this.topOffsetEnd == null && this.underline == null;
    }

    public final SpanData mergeWith(SpanData spanData, int i, int i2) {
        DivTextAlignmentVertical divTextAlignmentVertical = spanData.alignmentVertical;
        if (divTextAlignmentVertical == null) {
            divTextAlignmentVertical = this.alignmentVertical;
        }
        DivTextAlignmentVertical divTextAlignmentVertical2 = divTextAlignmentVertical;
        int i3 = spanData.baselineOffset;
        if (i3 == 0) {
            i3 = this.baselineOffset;
        }
        int i4 = i3;
        String str = spanData.fontFamily;
        if (str == null) {
            str = this.fontFamily;
        }
        String str2 = str;
        String str3 = spanData.fontFeatureSettings;
        if (str3 == null) {
            str3 = this.fontFeatureSettings;
        }
        String str4 = str3;
        Integer num = spanData.fontSize;
        if (num == null) {
            num = this.fontSize;
        }
        Integer num2 = num;
        DivSizeUnit divSizeUnit = spanData.fontSizeUnit;
        if (divSizeUnit == DEFAULT_FONT_SIZE_UNIT) {
            divSizeUnit = this.fontSizeUnit;
        }
        DivSizeUnit divSizeUnit2 = divSizeUnit;
        DivFontWeight divFontWeight = spanData.fontWeight;
        if (divFontWeight == null) {
            divFontWeight = this.fontWeight;
        }
        DivFontWeight divFontWeight2 = divFontWeight;
        Integer num3 = spanData.fontWeightValue;
        if (num3 == null) {
            num3 = this.fontWeightValue;
        }
        Integer num4 = num3;
        JSONObject jSONObject = spanData.fontVariationSettings;
        if (jSONObject == null) {
            jSONObject = this.fontVariationSettings;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d = spanData.letterSpacing;
        if (d == null) {
            d = this.letterSpacing;
        }
        Double d2 = d;
        Integer num5 = spanData.lineHeight;
        if (num5 == null) {
            num5 = this.lineHeight;
        }
        Integer num6 = num5;
        MaskData maskData = spanData.mask;
        if (maskData == null) {
            maskData = this.mask;
        }
        MaskData maskData2 = maskData;
        DivLineStyle divLineStyle = spanData.strike;
        if (divLineStyle == null) {
            divLineStyle = this.strike;
        }
        DivLineStyle divLineStyle2 = divLineStyle;
        Integer num7 = spanData.textColor;
        if (num7 == null) {
            num7 = this.textColor;
        }
        Integer num8 = num7;
        ShadowData shadowData = spanData.textShadow;
        if (shadowData == null) {
            shadowData = this.textShadow;
        }
        ShadowData shadowData2 = shadowData;
        Integer num9 = spanData.topOffset;
        Integer num10 = num9 == null ? this.topOffset : num9;
        Integer num11 = num9 != null ? spanData.topOffsetStart : this.topOffsetStart;
        Integer num12 = num9 != null ? spanData.topOffsetEnd : this.topOffsetEnd;
        DivLineStyle divLineStyle3 = spanData.underline;
        if (divLineStyle3 == null) {
            divLineStyle3 = this.underline;
        }
        return new SpanData(i, i2, divTextAlignmentVertical2, i4, str2, str4, num2, divSizeUnit2, divFontWeight2, num4, jSONObject2, d2, num6, maskData2, divLineStyle2, num8, shadowData2, num10, num11, num12, divLineStyle3);
    }

    public String toString() {
        return "SpanData(start=" + this.start + ", end=" + this.end + ", alignmentVertical=" + this.alignmentVertical + ", baselineOffset=" + this.baselineOffset + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", fontVariationSettings=" + this.fontVariationSettings + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", mask=" + this.mask + ", strike=" + this.strike + ", textColor=" + this.textColor + ", textShadow=" + this.textShadow + ", topOffset=" + this.topOffset + ", topOffsetStart=" + this.topOffsetStart + ", topOffsetEnd=" + this.topOffsetEnd + ", underline=" + this.underline + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(SpanData spanData) {
        return this.start - spanData.start;
    }
}
