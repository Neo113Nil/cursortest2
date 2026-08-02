package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/spannable/FontSizeSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/ParagraphStyle;", "", "fontSize", "lineHeight", "<init>", "(II)V", "Landroid/text/TextPaint;", "paint", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", CA20Status.STATUS_USER_I, "getFontSize", "()I", "getLineHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int fontSize;
    private final int lineHeight;

    public /* synthetic */ FontSizeSpan(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        paint.setTextSize(this.fontSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        int i = this.lineHeight;
        if (i == 0) {
            paint.setTextSize(this.fontSize);
            return;
        }
        float f = i;
        float textSize = paint.getTextSize();
        int i2 = this.fontSize;
        if (f >= textSize) {
            paint.setTextScaleX(i2 / paint.getTextSize());
        } else {
            paint.setTextScaleX(i2 / this.lineHeight);
            paint.setTextSize(this.lineHeight);
        }
    }

    public FontSizeSpan(int i, int i2) {
        this.fontSize = i;
        this.lineHeight = i2;
    }
}
