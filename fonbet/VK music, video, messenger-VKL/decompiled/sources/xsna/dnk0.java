package xsna;

import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: SquareTextView.java */
/* loaded from: classes13.dex */
public final class dnk0 extends AppCompatTextView {
    public int b;
    public int c;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.c / 2, this.b / 2);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.b = measuredWidth - measuredHeight;
            this.c = 0;
        } else {
            this.b = 0;
            this.c = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
