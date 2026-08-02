package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PollResultAnswerHolder.kt */
/* loaded from: classes4.dex */
public final class hrb0 extends LayerDrawable {
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(iah0.a(2), iah0.a(1));
        super.draw(canvas);
        canvas.restore();
    }
}
