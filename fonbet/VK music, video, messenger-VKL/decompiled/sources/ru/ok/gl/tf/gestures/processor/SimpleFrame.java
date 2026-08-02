package ru.ok.gl.tf.gestures.processor;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class SimpleFrame<G> implements Frame<G> {
    static final long INVALID_ID = Long.MIN_VALUE;
    private final RectF boundsRect;
    private final Object fingerLock;
    private final PointF foreFingerBase;
    private final PointF forefinger;
    private volatile G gesture;
    private volatile float gestureAngle;
    private volatile int gestureColor;
    private final long id;
    private boolean keepRawRectSize;

    @NonNull
    private volatile G lastGesture;
    private long leftId;
    private final RectF leftRect;
    private final Object lock;
    private volatile float maxRadius;
    private final PointF middleFingerBase;
    private final PointF palmBase;
    private final RectF rawRect;
    private final RectF rect;
    private Matrix rectTransform;
    private long rightId;
    private final RectF rightRect;
    private final PointF ringFingerBase;
    private volatile float straighAngle;
    private final Object subRectLock;

    public SimpleFrame(@NonNull G g) {
        this(Long.MIN_VALUE, g);
    }

    private void setPoint(PointF pointF, PointF pointF2) {
        pointF2.set(pointF);
        Matrix matrix = this.rectTransform;
        if (matrix != null) {
            float[] fArr = {pointF.x, pointF.y};
            matrix.mapPoints(fArr);
            pointF2.set(fArr[0], fArr[1]);
        }
    }

    private void transform(@NonNull RectF rectF, @NonNull RectF rectF2) {
        rectF2.set(rectF);
        this.rectTransform.mapRect(rectF2);
        if (this.keepRawRectSize) {
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            float width = rectF.width() * 0.5f;
            float height = rectF.height() * 0.5f;
            rectF2.set(centerX - width, centerY - height, centerX + width, centerY + height);
        }
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public float getAngle() {
        return this.gestureAngle;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getBoundsRect(@NonNull RectF rectF) {
        rectF.set(this.boundsRect);
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public int getColor() {
        return this.gestureColor;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getForeFingerBase(@NonNull PointF pointF) {
        synchronized (this.fingerLock) {
            pointF.set(this.foreFingerBase);
        }
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getForefinger(@NonNull PointF pointF) {
        synchronized (this.fingerLock) {
            pointF.set(this.forefinger);
        }
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public G getGesture() {
        return this.gesture;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public long getId() {
        return this.id;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public G getLastGesture() {
        return this.lastGesture;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public long getLeftId() {
        return this.leftId;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getLeftRightRects(@NonNull RectF rectF, @NonNull RectF rectF2) {
        synchronized (this.subRectLock) {
            rectF.set(this.leftRect);
            rectF2.set(this.rightRect);
        }
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public float getMaxRadius() {
        return this.maxRadius;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getMiddleFingerBase(@NonNull PointF pointF) {
        synchronized (this.fingerLock) {
            pointF.set(this.middleFingerBase);
        }
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getPalmBase(@NonNull PointF pointF) {
        synchronized (this.fingerLock) {
            pointF.set(this.palmBase);
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public RectF getRawRect() {
        return this.rawRect;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getRect(@NonNull RectF rectF) {
        synchronized (this.lock) {
            rectF.set(this.rect);
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public Matrix getRectTransform() {
        return this.rectTransform;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public long getRightId() {
        return this.rightId;
    }

    @Override // ru.ok.gl.tf.gestures.Figure
    public void getRingFingerBase(@NonNull PointF pointF) {
        synchronized (this.fingerLock) {
            pointF.set(this.ringFingerBase);
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setBoundsRect(float f, float f2, float f3, float f4) {
        this.boundsRect.set(f, f2, f3, f4);
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setGesture(G g) {
        this.gesture = g;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setGestureAngle(float f) {
        this.gestureAngle = f;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setGestureColor(int i) {
        this.gestureColor = i;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setKeepRawRectSize(boolean z) {
        this.keepRawRectSize = z;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setLastGesture(@NonNull G g) {
        this.lastGesture = g;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setLeftId(long j) {
        this.leftId = j;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setLeftRect(@NonNull RectF rectF) {
        synchronized (this.subRectLock) {
            try {
                this.leftRect.set(rectF);
                if (this.rectTransform != null) {
                    transform(rectF, this.leftRect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setPoints(@NonNull PointF pointF, @NonNull PointF pointF2, @NonNull PointF pointF3, @NonNull PointF pointF4, @NonNull PointF pointF5) {
        synchronized (this.fingerLock) {
            setPoint(pointF, this.forefinger);
            setPoint(pointF2, this.foreFingerBase);
            setPoint(pointF3, this.middleFingerBase);
            setPoint(pointF4, this.ringFingerBase);
            setPoint(pointF5, this.palmBase);
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setRawRect(@NonNull RectF rectF) {
        this.rawRect.set(rectF);
        if (this.rectTransform != null) {
            synchronized (this.lock) {
                transform(rectF, this.rect);
                this.maxRadius = Calculator.getMaxRadius(this.rect);
            }
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setRectTransform(Matrix matrix) {
        this.rectTransform = matrix;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setRightId(long j) {
        this.rightId = j;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setRightRect(@NonNull RectF rectF) {
        synchronized (this.subRectLock) {
            try {
                this.rightRect.set(rectF);
                if (this.rectTransform != null) {
                    transform(rectF, this.rightRect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void setStraighGestureAngle(float f) {
        this.straighAngle = f;
    }

    public SimpleFrame(long j, @NonNull G g) {
        this.boundsRect = new RectF();
        this.rawRect = new RectF();
        this.lock = new Object();
        this.rect = new RectF();
        this.fingerLock = new Object();
        this.forefinger = new PointF();
        this.middleFingerBase = new PointF();
        this.ringFingerBase = new PointF();
        this.foreFingerBase = new PointF();
        this.palmBase = new PointF();
        this.subRectLock = new Object();
        this.rightRect = new RectF();
        this.leftRect = new RectF();
        this.leftId = Long.MIN_VALUE;
        this.rightId = Long.MIN_VALUE;
        this.id = j;
        this.lastGesture = g;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public RectF getRect() {
        return this.rect;
    }

    @Override // ru.ok.gl.tf.gestures.processor.Frame
    public void release() {
    }
}
