package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0013\u0010?\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/RotateLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "angleC", "()D", "getAngle", "()I", "angle", "Lzy11;", "setAngle", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", CA20Status.STATUS_USER_I, "Landroid/graphics/Matrix;", "rotateMatrix", "Landroid/graphics/Matrix;", "Landroid/graphics/Rect;", "viewRectRotated", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "tempRectF1", "Landroid/graphics/RectF;", "tempRectF2", "", "viewTouchPoint", "[F", "childTouchPoint", "angleChanged", "Z", "getView", "()Landroid/view/View;", "view", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RotateLayout extends ViewGroup {
    private int angle;
    private boolean angleChanged;
    private final float[] childTouchPoint;
    private final Matrix rotateMatrix;
    private final RectF tempRectF1;
    private final RectF tempRectF2;
    private final Rect viewRectRotated;
    private final float[] viewTouchPoint;

    public RotateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rotateMatrix = new Matrix();
        this.viewRectRotated = new Rect();
        this.tempRectF1 = new RectF();
        this.tempRectF2 = new RectF();
        this.viewTouchPoint = new float[2];
        this.childTouchPoint = new float[2];
        this.angleChanged = true;
        setWillNotDraw(false);
    }

    private final double angleC() {
        return (this.angle * 6.283185307179586d) / 360.0d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate(-this.angle, getWidth() / 2.0f, getHeight() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        this.viewTouchPoint[0] = event.getX();
        this.viewTouchPoint[1] = event.getY();
        this.rotateMatrix.mapPoints(this.childTouchPoint, this.viewTouchPoint);
        float[] fArr = this.childTouchPoint;
        event.setLocation(fArr[0], fArr[1]);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(event);
        float[] fArr2 = this.viewTouchPoint;
        event.setLocation(fArr2[0], fArr2[1]);
        return dispatchTouchEvent;
    }

    public final int getAngle() {
        return this.angle;
    }

    public final View getView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        invalidate();
        super.onDescendantInvalidated(child, target);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int i = r - l;
        int i2 = b - t;
        if (this.angleChanged || changed) {
            RectF rectF = this.tempRectF1;
            rectF.set(0.0f, 0.0f, i, i2);
            RectF rectF2 = this.tempRectF2;
            this.rotateMatrix.setRotate(this.angle, rectF.centerX(), rectF.centerY());
            this.rotateMatrix.mapRect(rectF2, rectF);
            rectF2.round(this.viewRectRotated);
            this.angleChanged = false;
        }
        View view = getView();
        if (view != null) {
            int measuredWidth = (i - view.getMeasuredWidth()) / 2;
            int measuredHeight = (i2 - view.getMeasuredHeight()) / 2;
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View view = getView();
        if (view == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        if (Math.abs(this.angle % SubsamplingScaleImageView.ORIENTATION_180) == 90) {
            measureChild(view, heightMeasureSpec, widthMeasureSpec);
            setMeasuredDimension(View.resolveSize(view.getMeasuredHeight(), widthMeasureSpec), View.resolveSize(view.getMeasuredWidth(), heightMeasureSpec));
            return;
        }
        if (Math.abs(this.angle % SubsamplingScaleImageView.ORIENTATION_180) == 0) {
            measureChild(view, widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(View.resolveSize(view.getMeasuredWidth(), widthMeasureSpec), View.resolveSize(view.getMeasuredHeight(), heightMeasureSpec));
            return;
        }
        measureChild(view, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(View.resolveSize((int) Math.ceil((Math.abs(Math.sin(angleC())) * view.getMeasuredHeight()) + (Math.abs(Math.cos(angleC())) * view.getMeasuredWidth())), widthMeasureSpec), View.resolveSize((int) Math.ceil((Math.abs(Math.cos(angleC())) * view.getMeasuredHeight()) + (Math.abs(Math.sin(angleC())) * view.getMeasuredWidth())), heightMeasureSpec));
    }

    public final void setAngle(int angle) {
        if (this.angle != angle) {
            this.angle = angle;
            this.angleChanged = true;
            requestLayout();
            invalidate();
        }
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RotateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RotateLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
