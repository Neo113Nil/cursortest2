package ru.ok.tensorflow.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.List;
import ru.ok.tensorflow.entity.Recognition;

/* loaded from: classes9.dex */
public class RecognitionScoreView extends View implements ResultsView {
    private static final float TEXT_SIZE_DIP = 14.0f;
    private final Paint bgPaint;
    private final Paint fgPaint;
    private List<Recognition> results;
    private final float textSizePx;

    public RecognitionScoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float applyDimension = TypedValue.applyDimension(1, TEXT_SIZE_DIP, getResources().getDisplayMetrics());
        this.textSizePx = applyDimension;
        Paint paint = new Paint();
        this.fgPaint = paint;
        paint.setTextSize(applyDimension);
        Paint paint2 = new Paint();
        this.bgPaint = paint2;
        paint2.setColor(-868055564);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int textSize = (int) (this.fgPaint.getTextSize() * 1.5f);
        canvas.drawPaint(this.bgPaint);
        List<Recognition> list = this.results;
        if (list != null) {
            for (Recognition recognition : list) {
                canvas.drawText(recognition.palmClass + ": " + recognition.confidence, 10.0f, textSize, this.fgPaint);
                textSize += (int) (this.fgPaint.getTextSize() * 1.5f);
            }
        }
    }

    @Override // ru.ok.tensorflow.customview.ResultsView
    public void setResults(List<Recognition> list) {
        this.results = list;
        postInvalidate();
    }
}
