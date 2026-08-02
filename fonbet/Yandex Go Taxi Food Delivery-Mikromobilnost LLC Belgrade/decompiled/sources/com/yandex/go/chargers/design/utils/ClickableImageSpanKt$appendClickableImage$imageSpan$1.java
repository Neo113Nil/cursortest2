package com.yandex.go.chargers.design.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.utils.CustomImageSpan;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001JW\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/design/utils/ClickableImageSpanKt$appendClickableImage$imageSpan$1", "Lru/yandex/taxi/utils/CustomImageSpan;", "Landroid/graphics/Canvas;", "canvas", "", "text", "", "start", "end", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Landroid/graphics/Paint;", "paint", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "Landroid/graphics/Point;", "position", "Landroid/graphics/Point;", "getPosition", "()Landroid/graphics/Point;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClickableImageSpanKt$appendClickableImage$imageSpan$1 extends CustomImageSpan {
    private final Point position;

    public ClickableImageSpanKt$appendClickableImage$imageSpan$1(Drawable drawable) {
        super(drawable, 0, true, false, null, 26, null);
        this.position = new Point();
    }

    @Override // ru.yandex.taxi.utils.CustomImageSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        super.draw(canvas, text, start, end, x, top, y, bottom, paint);
        this.position.set((int) x, top);
    }

    public final Point getPosition() {
        return this.position;
    }
}
