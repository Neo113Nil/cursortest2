package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.epx;

/* compiled from: ImageSpan.kt */
/* loaded from: classes7.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {
    private final Accessibility accessibility;
    private final TextVerticalAlignment alignment;
    private final RectF boundsInText = new RectF();
    private final int height;
    private Drawable image;
    private final int lineHeight;
    private final int width;

    /* compiled from: ImageSpan.kt */
    public static final class Accessibility {
        private final String accessibilityType;
        private final String contentDescription;
        private final OnAccessibilityClickAction onClickAction;

        public Accessibility(String str, String str2, OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }

        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }
    }

    /* compiled from: ImageSpan.kt */
    public interface OnAccessibilityClickAction {
    }

    /* compiled from: ImageSpan.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageSpan(Drawable drawable, int i, int i2, int i3, TextVerticalAlignment textVerticalAlignment, Accessibility accessibility) {
        this.width = i;
        this.height = i2;
        this.lineHeight = i3;
        this.alignment = textVerticalAlignment;
        this.accessibility = accessibility;
        this.image = drawable;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        if (fontMetricsInt == null || this.lineHeight > 0) {
            return this.width;
        }
        int b = an10.b(paint.ascent());
        int b2 = an10.b(paint.descent());
        Drawable drawable = this.image;
        int height = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i3 == 1) {
            b2 = b + height;
        } else if (i3 == 2) {
            b2 = ((b + b2) + height) / 2;
        } else if (i3 == 3) {
            b2 = 0;
        } else if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = b2 - height;
        int i5 = fontMetricsInt.top;
        int i6 = fontMetricsInt.ascent;
        int i7 = fontMetricsInt.bottom - fontMetricsInt.descent;
        fontMetricsInt.ascent = Math.min(i4, i6);
        int max = Math.max(b2, fontMetricsInt.descent);
        fontMetricsInt.descent = max;
        fontMetricsInt.top = fontMetricsInt.ascent + (i5 - i6);
        fontMetricsInt.bottom = max + i7;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int height = drawable.getBounds().height();
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i6 == 1) {
            i4 = i3 + height;
        } else if (i6 == 2) {
            i4 = ((i3 + i5) + height) / 2;
        } else if (i6 != 3) {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = i5;
        }
        float f2 = i4 - height;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(f, f2);
        canvas.translate(f, f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final Accessibility getAccessibility$div_release() {
        return this.accessibility;
    }

    public final Rect getBoundsInText(Rect rect) {
        rect.set(an10.b(this.boundsInText.left), an10.b(this.boundsInText.top), an10.b(this.boundsInText.right), an10.b(this.boundsInText.bottom));
        return rect;
    }

    public final void setImage(Drawable drawable) {
        if (epx.f(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    public final RectF getBoundsInText(RectF rectF) {
        rectF.set(this.boundsInText);
        return rectF;
    }
}
