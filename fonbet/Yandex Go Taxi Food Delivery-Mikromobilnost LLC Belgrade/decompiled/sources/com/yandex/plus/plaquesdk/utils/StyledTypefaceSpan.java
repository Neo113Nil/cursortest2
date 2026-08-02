package com.yandex.plus.plaquesdk.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/plaquesdk/utils/StyledTypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "", "style", "<init>", "(Landroid/graphics/Typeface;I)V", "Landroid/graphics/Paint;", "paint", "Lzy11;", "apply", "(Landroid/graphics/Paint;)V", "Landroid/text/TextPaint;", "drawState", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "Landroid/graphics/Typeface;", CA20Status.STATUS_USER_I, "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StyledTypefaceSpan extends MetricAffectingSpan {
    private final int style;
    private final Typeface typeface;

    public /* synthetic */ StyledTypefaceSpan(Typeface typeface, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeface, (i2 & 2) != 0 ? 0 : i);
    }

    private final void apply(Paint paint) {
        int i = this.style & (~this.typeface.getStyle());
        if ((i & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.typeface);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint drawState) {
        apply(drawState);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        apply(paint);
    }

    public StyledTypefaceSpan(Typeface typeface) {
        this(typeface, 0, 2, null);
    }

    public StyledTypefaceSpan(Typeface typeface, int i) {
        this.typeface = typeface;
        this.style = i;
    }
}
