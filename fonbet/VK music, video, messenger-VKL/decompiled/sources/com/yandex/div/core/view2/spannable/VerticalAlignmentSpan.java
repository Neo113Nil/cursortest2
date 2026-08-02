package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import java.util.LinkedList;
import java.util.Queue;
import xsna.an10;
import xsna.e9e0;
import xsna.tvb0;
import xsna.zcl;

/* compiled from: VerticalAlignmentSpan.kt */
/* loaded from: classes7.dex */
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {
    private static final Companion Companion = new Companion(null);
    private static final tvb0<int[]> LINE_POOL = new tvb0<>(16);
    private final TextVerticalAlignment alignment;
    private final int fontSize;
    private final e9e0<Layout> layoutProvider;
    private boolean textDrawWasCalled;
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();
    private final Queue<int[]> lines = new LinkedList();

    /* compiled from: VerticalAlignmentSpan.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: VerticalAlignmentSpan.kt */
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

    public VerticalAlignmentSpan(int i, TextVerticalAlignment textVerticalAlignment, e9e0<Layout> e9e0Var) {
        this.fontSize = i;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = e9e0Var;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i6 > spanned.getSpanEnd(this) || spanStart > i7) {
            return;
        }
        Layout layout = this.layoutProvider.get();
        int b = i8 == layout.getLineCount() - 1 ? 0 : an10.b(layout.getSpacingAdd());
        int[] c = LINE_POOL.c();
        if (c == null) {
            c = new int[2];
        }
        c[0] = i3 - i4;
        c[1] = (i5 - i4) - b;
        this.lines.add(c);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] remove = this.lines.remove();
        int i = remove[0];
        int i2 = remove[1];
        LINE_POOL.a(remove);
        int i3 = this.fontSize;
        if (i3 > 0) {
            textPaint.setTextSize(i3);
        }
        textPaint.getFontMetricsInt(this.fontMetrics);
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i4 == 1) {
            textPaint.baselineShift = (i - this.fontMetrics.ascent) + textPaint.baselineShift;
            return;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                return;
            }
            textPaint.baselineShift = (i2 - this.fontMetrics.descent) + textPaint.baselineShift;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        textPaint.baselineShift = (((i + i2) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2)) + textPaint.baselineShift;
    }
}
