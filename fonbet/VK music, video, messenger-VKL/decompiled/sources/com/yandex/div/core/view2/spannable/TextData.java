package com.yandex.div.core.view2.spannable;

import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: TextData.kt */
/* loaded from: classes7.dex */
public final class TextData {
    private final String fontFamily;
    private final int fontSize;
    private final DivSizeUnit fontSizeUnit;
    private final int fontSizeValue;
    private final DivFontWeight fontWeight;
    private final Integer fontWeightValue;
    private final Integer lineHeight;
    private final String text;
    private final int textColor;
    private final int textLength;

    public TextData(String str, int i, int i2, DivSizeUnit divSizeUnit, String str2, DivFontWeight divFontWeight, Integer num, Integer num2, int i3) {
        this.text = str;
        this.fontSize = i;
        this.fontSizeValue = i2;
        this.fontSizeUnit = divSizeUnit;
        this.fontFamily = str2;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i3;
        this.textLength = str.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) obj;
        return epx.f(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && epx.f(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && epx.f(this.fontWeightValue, textData.fontWeightValue) && epx.f(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        int hashCode = (this.fontSizeUnit.hashCode() + shy.a(this.fontSizeValue, shy.a(this.fontSize, this.text.hashCode() * 31, 31), 31)) * 31;
        String str = this.fontFamily;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int hashCode3 = (hashCode2 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return Integer.hashCode(this.textColor) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append(this.text);
        sb.append(", fontSize=");
        sb.append(this.fontSize);
        sb.append(", fontSizeValue=");
        sb.append(this.fontSizeValue);
        sb.append(", fontSizeUnit=");
        sb.append(this.fontSizeUnit);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontWeightValue=");
        sb.append(this.fontWeightValue);
        sb.append(", lineHeight=");
        sb.append(this.lineHeight);
        sb.append(", textColor=");
        return vu5.b(sb, this.textColor, ')');
    }
}
