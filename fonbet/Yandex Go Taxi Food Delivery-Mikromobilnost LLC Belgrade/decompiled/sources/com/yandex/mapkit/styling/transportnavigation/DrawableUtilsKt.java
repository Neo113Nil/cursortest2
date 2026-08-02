package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.Paint;
import android.graphics.PointF;
import android.util.Size;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u000b"}, d2 = {"resolveIconAnchor", "Landroid/graphics/PointF;", "imageHeight", "", "textHeight", "measureText", "Landroid/util/Size;", "paint", "Landroid/graphics/Paint;", "text", "", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawableUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Size measureText(Paint paint, String str) {
        float measureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new Size((int) Math.ceil(measureText), (int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointF resolveIconAnchor(float f, float f2) {
        return new PointF(0.5f, (f / 2.0f) / (f + f2));
    }
}
