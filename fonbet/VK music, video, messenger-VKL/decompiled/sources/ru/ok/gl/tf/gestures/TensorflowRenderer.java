package ru.ok.gl.tf.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Collection;
import ru.ok.gl.tf.gestures.TensorflowRenderer;
import ru.ok.gl.util.IntPair;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.visualization.BorderedText;
import xsna.qqp;
import xsna.tj0;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public final class TensorflowRenderer {
    private static final int MSG_VISIBILITY = 0;
    private final BorderedText borderedText;
    private volatile Collection<? extends Figure<CompositeGesture>> compositeFigures;
    private final Handler dispatcher;
    private final OverlayView.DrawCallback drawCallback;
    private volatile Collection<? extends Figure<Gesture>> figures;
    private boolean isDrawingDisabled;
    private final View.OnLayoutChangeListener layoutCallback;
    private final Paint paint;
    private final RectF rect;

    @NonNull
    private IntPair size;
    private final OverlayView view;

    public static final class Builder {
        final Context context;
        OverlayView overlayView;
        float textSizeDp = 18.0f;

        public Builder(@NonNull Context context) {
            this.context = context;
        }

        public TensorflowRenderer build() {
            if (this.overlayView != null) {
                return new TensorflowRenderer(this);
            }
            throw new IllegalStateException();
        }

        public Builder setOverlayView(OverlayView overlayView) {
            this.overlayView = overlayView;
            return this;
        }

        public Builder setTextSizeDp(float f) {
            this.textSizeDp = f;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean accept(Message message) {
        if (message.what != 0) {
            return true;
        }
        this.view.setVisibility(message.arg1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draw(Canvas canvas) {
        if (this.isDrawingDisabled) {
            return;
        }
        Collection<? extends Figure<Gesture>> collection = this.figures;
        if (collection != null) {
            for (Figure<Gesture> figure : collection) {
                figure.getRect(this.rect);
                this.paint.setColor(figure.getColor());
                float centerX = this.rect.centerX();
                float centerY = this.rect.centerY();
                canvas.drawCircle(centerX, centerY, figure.getMaxRadius(), this.paint);
                canvas.save();
                canvas.rotate(figure.getAngle(), centerX, centerY);
                drawCenteredVerticalArrow(canvas, this.paint, this.rect);
                canvas.restore();
                Gesture gesture = figure.getGesture();
                if (gesture != null) {
                    this.borderedText.drawCenteredText(canvas, this.rect, gesture.name(), this.paint);
                }
            }
        }
        Collection<? extends Figure<CompositeGesture>> collection2 = this.compositeFigures;
        if (collection2 != null) {
            for (Figure<CompositeGesture> figure2 : collection2) {
                figure2.getRect(this.rect);
                this.paint.setColor(figure2.getColor());
                float centerX2 = this.rect.centerX();
                float centerY2 = this.rect.centerY();
                canvas.save();
                canvas.rotate(figure2.getAngle(), centerX2, centerY2);
                drawCenteredVerticalArrow(canvas, this.paint, this.rect);
                canvas.restore();
                canvas.drawCircle(centerX2, centerY2, figure2.getMaxRadius(), this.paint);
                CompositeGesture gesture2 = figure2.getGesture();
                if (gesture2 != null) {
                    this.borderedText.drawCenteredText(canvas, this.rect, gesture2.name(), this.paint);
                }
            }
        }
    }

    private static void drawCenteredVerticalArrow(Canvas canvas, Paint paint, RectF rectF) {
        float height = rectF.height() * 0.5f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f = centerY - height;
        canvas.drawLine(centerX, centerY + height, centerX, f, paint);
        float f2 = f + 10.0f;
        canvas.drawLine(centerX - 10.0f, f2, centerX, f, paint);
        canvas.drawLine(centerX + 10.0f, f2, centerX, f, paint);
    }

    private static void drawFinger(Canvas canvas, Paint paint, PointF pointF, PointF pointF2) {
        canvas.drawCircle(pointF2.x, pointF2.y, 40.0f, paint);
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, paint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void layoutChanged(@NonNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.size = new IntPair(i3 - i, i4 - i2);
    }

    public void enableDrawing(boolean z) {
        boolean z2 = !z;
        if (this.isDrawingDisabled != z2) {
            this.isDrawingDisabled = z2;
            if (z) {
                this.view.postInvalidate();
            }
        }
    }

    @NonNull
    public IntPair getSize() {
        return this.size;
    }

    public void release() {
        this.dispatcher.obtainMessage(0, 4).sendToTarget();
        this.view.removeOnLayoutChangeListener(this.layoutCallback);
        this.view.removeCallback(this.drawCallback);
    }

    public void setFigures(Collection<? extends Figure<Gesture>> collection, Collection<? extends Figure<CompositeGesture>> collection2) {
        this.compositeFigures = collection2;
        this.figures = collection;
        this.view.postInvalidate();
    }

    public void setSize(Size size) {
        this.size = new IntPair(size.getWidth(), size.getHeight());
    }

    private TensorflowRenderer(Builder builder) {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: xsna.jao0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean accept;
                accept = TensorflowRenderer.this.accept(message);
                return accept;
            }
        });
        this.dispatcher = handler;
        qqp qqpVar = new qqp(this, 1);
        this.layoutCallback = qqpVar;
        OverlayView.DrawCallback drawCallback = new OverlayView.DrawCallback() { // from class: xsna.kao0
            @Override // ru.ok.tensorflow.customview.OverlayView.DrawCallback
            public final void draw(Canvas canvas) {
                TensorflowRenderer.this.draw(canvas);
            }
        };
        this.drawCallback = drawCallback;
        Paint paint = new Paint();
        this.paint = paint;
        this.rect = new RectF();
        this.isDrawingDisabled = true;
        OverlayView overlayView = builder.overlayView;
        this.view = overlayView;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(100.0f);
        this.borderedText = new BorderedText(tj0.a(1, builder.textSizeDp, builder.context));
        this.size = new IntPair(overlayView.getWidth(), overlayView.getHeight());
        overlayView.addCallback(drawCallback);
        overlayView.addOnLayoutChangeListener(qqpVar);
        handler.obtainMessage(0, 0).sendToTarget();
    }
}
