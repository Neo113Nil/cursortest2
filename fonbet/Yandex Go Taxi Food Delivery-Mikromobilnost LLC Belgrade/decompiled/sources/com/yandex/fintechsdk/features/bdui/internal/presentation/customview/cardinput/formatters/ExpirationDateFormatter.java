package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.formatters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes12.dex */
public final class ExpirationDateFormatter {

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/formatters/ExpirationDateFormatter$SlashSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Ljava/lang/StringBuilder;", "Companion", "com/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/formatters/a", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class SlashSpan extends ReplacementSpan {
        private static final a Companion = new a();

        @Deprecated
        public static final String PADDING = " ";

        @Deprecated
        public static final String SEPARATOR = "/";
        private final StringBuilder sb = new StringBuilder();

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
            this.sb.setLength(0);
            StringBuilder sb = this.sb;
            sb.append(text.subSequence(start, end));
            sb.append(" / ");
            StringBuilder sb2 = this.sb;
            canvas.drawText(sb2, 0, sb2.length(), x, y, paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
            float measureText = paint.measureText(" ", 0, 1);
            return (int) (paint.measureText("/", 0, 1) + measureText + measureText + paint.measureText(text, start, end));
        }
    }

    public static void a(Editable editable, boolean z) {
        if (z && editable.length() == 1 && Character.getNumericValue(editable.charAt(0)) > 1) {
            editable.replace(0, 1, "0").append(editable.charAt(0));
        }
        for (SlashSpan slashSpan : (SlashSpan[]) editable.getSpans(0, editable.length(), SlashSpan.class)) {
            editable.removeSpan(slashSpan);
        }
        if (2 <= editable.length()) {
            editable.setSpan(new SlashSpan(), 1, 2, 33);
        }
    }
}
