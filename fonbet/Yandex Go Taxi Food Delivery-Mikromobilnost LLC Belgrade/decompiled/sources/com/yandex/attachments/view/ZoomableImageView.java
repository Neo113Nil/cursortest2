package com.yandex.attachments.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ai91;
import defpackage.bhv;
import defpackage.gjb1;
import defpackage.jhv;
import defpackage.nf61;
import defpackage.of61;
import defpackage.pf61;
import defpackage.qf61;
import defpackage.s14;
import defpackage.z83;

/* loaded from: classes11.dex */
public class ZoomableImageView extends AppCompatImageView {
    private static final int ANIMATION_DURATION_MS = 250;
    private static final float FLING_VELOCITY_THRESHOLD = 30.0f;
    private static final Interpolator INTERPOLATOR = new LinearInterpolator();
    private static final int INVALID_POINTER_ID = -1;
    private static final int MIN_ANIMATION_DURATION_MS = 50;
    private static final long MIN_FLING_DELTA_TIME = 150;
    private static final float ZOOM_THRESHOLD = 10.0f;
    private int mActivePointerId;
    private final a mAnimator;
    private qf61 mBaseViewport;
    private qf61 mCurrentViewport;
    private RectF mDrawableRect;
    private final GestureDetector mGestureDetector;
    private boolean mIsAnimating;
    private final Matrix mMatrix;
    private int mPaddingBottom;
    private boolean mPaddingChanged;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private nf61 mSingleFlingCallback;
    private State mState;
    private VelocityTracker mVelocityTracker;
    private RectF mViewRect;
    private of61 mZoomCallback;
    private long mZoomEventTimestamp;
    private boolean mZoomLocked;
    private float mZoomPreviousDistance;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State STATE_ANIM;
        public static final State STATE_DRAG;
        public static final State STATE_NONE;
        public static final State STATE_ZOOM;

        static {
            State state = new State("STATE_NONE", 0);
            STATE_NONE = state;
            State state2 = new State("STATE_DRAG", 1);
            STATE_DRAG = state2;
            State state3 = new State("STATE_ZOOM", 2);
            STATE_ZOOM = state3;
            State state4 = new State("STATE_ANIM", 3);
            STATE_ANIM = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public ZoomableImageView(Context context) {
        super(context);
        this.mMatrix = new Matrix();
        this.mAnimator = new a(this);
        this.mActivePointerId = -1;
        this.mZoomPreviousDistance = 1.0f;
        this.mState = State.STATE_NONE;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.mGestureDetector = new GestureDetector(context, new TapListener(this, 0));
    }

    private void animateTransform(pf61 pf61Var, pf61 pf61Var2) {
        if (gjb1.c(pf61Var.a, pf61Var2.a) && gjb1.c(pf61Var.b, pf61Var2.b) && gjb1.c(pf61Var.c, pf61Var2.c)) {
            return;
        }
        a aVar = this.mAnimator;
        aVar.a = pf61Var;
        aVar.b = pf61Var2;
        aVar.w = System.currentTimeMillis();
        this.mIsAnimating = true;
        post(this.mAnimator);
    }

    private long calcFlingDuration(float f, float f2) {
        return (long) Math.min((250.0f / (Math.max(Math.abs(f), Math.abs(f2)) / 250.0f)) + 50.0f, 250.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixBoundsIfNeeded() {
        if (this.mCurrentViewport == null || this.mViewRect == null || isZoomAnimation()) {
            return;
        }
        qf61 qf61Var = this.mCurrentViewport;
        if (qf61Var.f < 1.0f) {
            zoomOut();
            return;
        }
        qf61 qf61Var2 = new qf61(qf61Var);
        qf61Var2.a(this.mViewRect);
        animateTransform(this.mCurrentViewport, qf61Var2);
    }

    private boolean fling() {
        if (this.mVelocityTracker == null || this.mViewRect == null || this.mCurrentViewport == null || isZoomAnimation()) {
            return false;
        }
        this.mVelocityTracker.computeCurrentVelocity(100);
        float xVelocity = this.mVelocityTracker.getXVelocity();
        float yVelocity = this.mVelocityTracker.getYVelocity();
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
        if (SystemClock.uptimeMillis() - this.mZoomEventTimestamp < 150) {
            return false;
        }
        if (Math.abs(xVelocity) < FLING_VELOCITY_THRESHOLD && Math.abs(yVelocity) < FLING_VELOCITY_THRESHOLD) {
            return false;
        }
        float f = this.mCurrentViewport.f;
        float f2 = xVelocity * f;
        float f3 = yVelocity * f;
        this.mAnimator.x = calcFlingDuration(f2, f3);
        qf61 qf61Var = new qf61(this.mCurrentViewport);
        qf61Var.c.offset(f2, f3);
        qf61Var.a(this.mViewRect);
        animateTransform(this.mCurrentViewport, qf61Var);
        return true;
    }

    private float getPointersDistance(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    private boolean isZoomAnimation() {
        return this.mState == State.STATE_ANIM;
    }

    private void onUp() {
        if (isZoomAnimation()) {
            return;
        }
        this.mState = State.STATE_NONE;
        if (fling()) {
            return;
        }
        fixBoundsIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateScene(pf61 pf61Var) {
        qf61 qf61Var = this.mCurrentViewport;
        if (qf61Var == null) {
            return;
        }
        float f = qf61Var.g;
        if (f > 0.0f) {
            qf61Var.f = pf61Var.a / f;
            qf61Var.c.set(pf61Var.b, pf61Var.c);
        } else {
            z83.j("mScale <= 0");
        }
        updateScene();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zoomIn(float f, float f2) {
        bhv bhvVar;
        jhv jhvVar;
        jhv jhvVar2;
        qf61 qf61Var = this.mBaseViewport;
        if (qf61Var == null || this.mCurrentViewport == null) {
            return;
        }
        qf61 qf61Var2 = new qf61(qf61Var);
        qf61Var2.d.set(f, f2);
        qf61Var2.c(2.0f);
        animateTransform(this.mCurrentViewport, qf61Var2);
        of61 of61Var = this.mZoomCallback;
        if (of61Var == null || (jhvVar = (bhvVar = (bhv) of61Var).i) == null) {
            return;
        }
        s14 s14Var = jhvVar.D;
        if (((ViewGroup) s14Var.e).getVisibility() == 0 && ((ViewGroup) s14Var.c).getVisibility() == 0 && (jhvVar2 = bhvVar.i) != null) {
            s14 s14Var2 = jhvVar2.D;
            ai91.c((ViewGroup) s14Var2.e, true);
            ai91.c((ViewGroup) s14Var2.c, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zoomOut() {
        qf61 qf61Var;
        qf61 qf61Var2 = this.mBaseViewport;
        if (qf61Var2 == null || (qf61Var = this.mCurrentViewport) == null) {
            return;
        }
        animateTransform(qf61Var, qf61Var2);
        of61 of61Var = this.mZoomCallback;
        if (of61Var != null) {
            of61Var.getClass();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mCurrentViewport == null) {
            return false;
        }
        return !gjb1.c(r0.f, 1.0f);
    }

    public RectF getCurrentDisplayRect() {
        return this.mCurrentViewport.b();
    }

    public int getCustomPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getCustomPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getCustomPaddingRight() {
        return this.mPaddingRight;
    }

    public int getCustomPaddingTop() {
        return this.mPaddingTop;
    }

    public RectF getDrawableRect() {
        return this.mDrawableRect;
    }

    public boolean isInteractingOrAnimating() {
        return this.mState != State.STATE_NONE || this.mIsAnimating;
    }

    public boolean isZoomLocked() {
        return this.mZoomLocked;
    }

    public void lockZoom() {
        this.mZoomLocked = true;
    }

    public void onActionEnd() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r8.bottom >= r4.bottom) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.mCurrentViewport != null && this.mViewRect != null && !this.mZoomLocked) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.mState == State.STATE_ZOOM && motionEvent.getPointerCount() > 1) {
                            float pointersDistance = getPointersDistance(motionEvent);
                            if (pointersDistance > ZOOM_THRESHOLD) {
                                this.mCurrentViewport.c(pointersDistance / this.mZoomPreviousDistance);
                                this.mZoomPreviousDistance = pointersDistance;
                                this.mZoomEventTimestamp = motionEvent.getEventTime();
                            }
                        } else if (this.mState == State.STATE_DRAG && (velocityTracker = this.mVelocityTracker) != null) {
                            velocityTracker.addMovement(motionEvent);
                            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                            float x = motionEvent.getX(findPointerIndex);
                            float y = motionEvent.getY(findPointerIndex);
                            qf61 qf61Var = this.mCurrentViewport;
                            RectF rectF = this.mViewRect;
                            PointF pointF = qf61Var.e;
                            float f = x - pointF.x;
                            float f2 = y - pointF.y;
                            if (qf61Var.f > 1.0f) {
                                RectF b = qf61Var.b();
                                if (b.left > rectF.left || b.right < rectF.right) {
                                    f *= 0.3f;
                                }
                                if (b.top <= rectF.top) {
                                }
                            } else {
                                f *= 0.3f;
                            }
                            f2 *= 0.3f;
                            qf61Var.c.offset(f, f2);
                            pointF.set(x, y);
                        }
                        updateScene();
                    } else if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                this.mState = State.STATE_DRAG;
                                int i = ((motionEvent.getAction() & 65280) >> 8) == 0 ? 1 : 0;
                                this.mCurrentViewport.e.set(motionEvent.getX(i), motionEvent.getY(i));
                                this.mActivePointerId = motionEvent.getPointerId(i);
                            }
                        } else if (motionEvent.getPointerCount() > 1) {
                            float pointersDistance2 = getPointersDistance(motionEvent);
                            this.mZoomPreviousDistance = pointersDistance2;
                            if (pointersDistance2 > ZOOM_THRESHOLD) {
                                this.mState = State.STATE_ZOOM;
                                this.mCurrentViewport.d.set((motionEvent.getX(1) + motionEvent.getX(0)) * 0.5f, (motionEvent.getY(1) + motionEvent.getY(0)) * 0.5f);
                            }
                        }
                    }
                }
                onUp();
            } else {
                a aVar = this.mAnimator;
                aVar.a = null;
                aVar.b = null;
                aVar.y.mIsAnimating = false;
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                this.mState = State.STATE_DRAG;
                this.mCurrentViewport.e.set(motionEvent.getX(), motionEvent.getY());
                this.mActivePointerId = motionEvent.getPointerId(0);
            }
            this.mGestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    public void resetZoom() {
        zoomOut();
    }

    public void setCurrentViewport(qf61 qf61Var) {
        qf61 qf61Var2 = new qf61(qf61Var);
        this.mCurrentViewport = qf61Var2;
        Matrix matrix = this.mMatrix;
        float f = qf61Var2.g * qf61Var2.f;
        matrix.setScale(f, f);
        PointF pointF = qf61Var2.c;
        matrix.postTranslate(pointF.x, pointF.y);
        setImageMatrix(this.mMatrix);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean z = super.setFrame(i, i2, i3, i4) || this.mPaddingChanged;
        if (z) {
            RectF rectF = new RectF(new Rect(i + this.mPaddingLeft, i2 + this.mPaddingTop, i3 - this.mPaddingRight, i4 - this.mPaddingBottom));
            this.mViewRect = rectF;
            RectF rectF2 = this.mDrawableRect;
            if (rectF2 != null) {
                qf61 qf61Var = new qf61(rectF2, rectF);
                this.mBaseViewport = qf61Var;
                setCurrentViewport(qf61Var);
            }
            this.mPaddingChanged = false;
        }
        return z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            RectF rectF = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.mDrawableRect = rectF;
            RectF rectF2 = this.mViewRect;
            if (rectF2 != null) {
                qf61 qf61Var = new qf61(rectF, rectF2);
                this.mBaseViewport = qf61Var;
                setCurrentViewport(qf61Var);
            }
        }
    }

    public void setImagePadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
        this.mPaddingChanged = true;
        requestLayout();
    }

    public void setSingleFlingCallback(nf61 nf61Var) {
    }

    public void setZoomCallback(of61 of61Var) {
        this.mZoomCallback = of61Var;
    }

    public void unlockZoom() {
        this.mZoomLocked = false;
    }

    public class TapListener extends GestureDetector.SimpleOnGestureListener {
        private TapListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ZoomableImageView.this.mCurrentViewport == null) {
                return false;
            }
            ZoomableImageView.this.mState = State.STATE_ANIM;
            boolean c = gjb1.c(ZoomableImageView.this.mCurrentViewport.f, 1.0f);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            if (c) {
                zoomableImageView.zoomIn(motionEvent.getX(), motionEvent.getY());
                return true;
            }
            zoomableImageView.zoomOut();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return ZoomableImageView.this.performClick();
        }

        public /* synthetic */ TapListener(ZoomableImageView zoomableImageView, int i) {
            this();
        }
    }

    private void updateScene() {
        qf61 qf61Var = this.mCurrentViewport;
        if (qf61Var == null) {
            return;
        }
        Matrix matrix = this.mMatrix;
        float f = qf61Var.g * qf61Var.f;
        matrix.setScale(f, f);
        PointF pointF = qf61Var.c;
        matrix.postTranslate(pointF.x, pointF.y);
        setImageMatrix(this.mMatrix);
        invalidate();
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMatrix = new Matrix();
        this.mAnimator = new a(this);
        this.mActivePointerId = -1;
        this.mZoomPreviousDistance = 1.0f;
        this.mState = State.STATE_NONE;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.mGestureDetector = new GestureDetector(context, new TapListener(this, 0));
    }

    private void animateTransform(qf61 qf61Var, qf61 qf61Var2) {
        float f = qf61Var.f * qf61Var.g;
        PointF pointF = qf61Var.c;
        pf61 pf61Var = new pf61(f, pointF.x, pointF.y);
        float f2 = qf61Var2.f * qf61Var2.g;
        PointF pointF2 = qf61Var2.c;
        animateTransform(pf61Var, new pf61(f2, pointF2.x, pointF2.y));
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMatrix = new Matrix();
        this.mAnimator = new a(this);
        this.mActivePointerId = -1;
        this.mZoomPreviousDistance = 1.0f;
        this.mState = State.STATE_NONE;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.mGestureDetector = new GestureDetector(context, new TapListener(this, 0));
    }
}
