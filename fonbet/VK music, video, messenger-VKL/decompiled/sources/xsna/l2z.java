package xsna;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LetterSpacingSpanPx.android.kt */
/* loaded from: classes11.dex */
public final class l2z extends MetricAffectingSpan {
    public final float b;

    public l2z(float f) {
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        textPaint.setLetterSpacing(this.b / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        textPaint.setLetterSpacing(this.b / textScaleX);
    }
}
