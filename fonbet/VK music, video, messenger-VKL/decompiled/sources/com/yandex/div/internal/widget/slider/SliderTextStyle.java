package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: SliderTextStyle.kt */
/* loaded from: classes7.dex */
public final class SliderTextStyle {
    private final float fontSize;
    private final String fontVariations;
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public SliderTextStyle(float f, float f2, Typeface typeface, float f3, float f4, int i, String str) {
        this.fontSize = f;
        this.spacing = f2;
        this.fontWeight = typeface;
        this.offsetX = f3;
        this.offsetY = f4;
        this.textColor = i;
        this.fontVariations = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && epx.f(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && epx.f(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final String getFontVariations() {
        return this.fontVariations;
    }

    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int a = shy.a(this.textColor, b.a(this.offsetY, b.a(this.offsetX, (this.fontWeight.hashCode() + b.a(this.spacing, Float.hashCode(this.fontSize) * 31, 31)) * 31, 31), 31), 31);
        String str = this.fontVariations;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SliderTextStyle(fontSize=");
        sb.append(this.fontSize);
        sb.append(", spacing=");
        sb.append(this.spacing);
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", offsetX=");
        sb.append(this.offsetX);
        sb.append(", offsetY=");
        sb.append(this.offsetY);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", fontVariations=");
        return ho8.a(sb, this.fontVariations, ')');
    }
}
