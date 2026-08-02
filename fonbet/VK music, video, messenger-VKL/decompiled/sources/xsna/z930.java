package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.TypedValue;
import com.vk.media.ok.recording.RecognitionView;
import java.util.Locale;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.visualization.BorderedText;

/* compiled from: MorphingTestView.kt */
/* loaded from: classes3.dex */
public final class z930 implements OverlayView.DrawCallback {
    public final OverlayView a;
    public boolean b;
    public final Paint c;
    public final BorderedText d;
    public long e;

    public z930(RecognitionView recognitionView, boolean z) {
        Paint paint = new Paint();
        this.c = paint;
        this.a = recognitionView;
        this.b = z;
        paint.setColor(-7829368);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(100.0f);
        this.d = new BorderedText(TypedValue.applyDimension(1, 18.0f, recognitionView.getContext().getResources().getDisplayMetrics()));
        recognitionView.addCallback(this);
    }

    public final void a() {
        this.a.removeCallback(this);
    }

    public final void b(long j) {
        this.e = j;
    }

    @Override // ru.ok.tensorflow.customview.OverlayView.DrawCallback
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Paint paint = this.c;
        BorderedText borderedText = this.d;
        if (borderedText != null) {
            StringBuilder sb = new StringBuilder("Morphing on device: '");
            sb.append(Build.MODEL.toUpperCase(Locale.ROOT));
            sb.append("' ");
            sb.append(this.b ? "YES" : "NO");
            String sb2 = sb.toString();
            canvas2 = canvas;
            borderedText.drawText(canvas2, 30.0f, 480.0f, sb2, paint);
        } else {
            canvas2 = canvas;
        }
        if (borderedText != null) {
            borderedText.drawText(canvas2, 30.0f, 550.0f, "Morphing test time: " + this.e, paint);
        }
    }
}
