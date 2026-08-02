package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import defpackage.a4c;
import defpackage.b4c;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.org0;
import defpackage.uh6;
import defpackage.z2i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

/* loaded from: classes11.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<b4c> listeners;
    private a4c onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.ClockHandView, i, g2i0.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = kp50.O(context, eng0.motionDurationLong2, 200);
        this.animationInterpolator = kp50.P(context, eng0.motionEasingEmphasizedInterpolator, mj2.b);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(z2i0.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(z2i0.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(org0.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(org0.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(z2i0.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        initRotationAnimator();
    }

    private void adjustLevel(float f, float f2) {
        this.currentLevel = uh6.m((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) getLeveledCircleRadius(2)) + com.google.android.material.internal.e.d(12, getContext()) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f;
        float f2 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f2;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f, f2, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.paint);
        canvas.drawCircle(f, f2, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND : i;
    }

    private int getLeveledCircleRadius(int i) {
        int i2 = this.circleRadius;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }

    private Pair<Float, Float> getValuesForAnimation(float f) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f) > 180.0f) {
            if (handRotation > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (handRotation < 180.0f && f > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f));
    }

    private boolean handleTouchInput(float f, float f2, boolean z, boolean z2, boolean z3) {
        float degreesFromXY = getDegreesFromXY(f, f2);
        boolean z4 = false;
        boolean z5 = getHandRotation() != degreesFromXY;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.animatingOnTouchUp) {
            z4 = true;
        }
        setHandRotation(degreesFromXY, z4);
        return true;
    }

    private void initRotationAnimator() {
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.this.lambda$initRotationAnimator$0(valueAnimator);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationAnimator$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(float f, boolean z) {
        float f2 = f % 360.0f;
        this.originalDeg = f2;
        this.degRad = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + width;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + height;
        RectF rectF = this.selectorBox;
        float f3 = this.selectorRadius;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator<b4c> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f2, z);
        }
        invalidate();
    }

    public void addOnRotateListener(b4c b4cVar) {
        this.listeners.add(b4cVar);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        a4c a4cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.downX);
            int i2 = (int) (y - this.downY);
            this.isInTapRegion = (i2 * i2) + (i * i) > this.scaledTouchSlop;
            boolean z4 = this.changedDuringTouch;
            boolean z5 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x, y);
            }
            z3 = z5;
            z2 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        boolean handleTouchInput = handleTouchInput(x, y, z2, z, z3) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z3 && (a4cVar = this.onActionUpListener) != null) {
            float degreesFromXY = getDegreesFromXY(x, y);
            boolean z6 = this.isInTapRegion;
            f fVar = (f) a4cVar;
            TimeModel timeModel = fVar.b;
            TimePickerView timePickerView = fVar.a;
            fVar.x = true;
            int i3 = timeModel.minute;
            int i4 = timeModel.hour;
            if (timeModel.selection == 10) {
                timePickerView.setHandRotation(fVar.w, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) timePickerView.getContext().getSystemService(AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    fVar.b(12, true);
                }
            } else {
                int round = Math.round(degreesFromXY);
                if (!z6) {
                    timeModel.setMinute(((round + 15) / 30) * 5);
                    fVar.c = timeModel.minute * 6;
                }
                timePickerView.setHandRotation(fVar.c, z6);
            }
            fVar.x = false;
            timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), timeModel.minute);
            if (timeModel.minute != i3 || timeModel.hour != i4) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.animatingOnTouchUp = z;
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        invalidate();
    }

    public void setCurrentLevel(int i) {
        this.currentLevel = i;
        invalidate();
    }

    public void setHandRotation(float f, boolean z) {
        this.rotationAnimator.cancel();
        if (!z) {
            setHandRotationInternal(f, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.start();
    }

    public void setMultiLevel(boolean z) {
        if (this.isMultiLevel && !z) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z;
        invalidate();
    }

    public void setOnActionUpListener(a4c a4cVar) {
        this.onActionUpListener = a4cVar;
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
