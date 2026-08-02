package com.yandex.plus.plaquesdk.design;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.Switch;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.plaquesdk.a;
import com.yandex.plus.plaquesdk.design.SwitchComponent;
import com.yandex.plus.plaquesdk.theme.ThemeType;
import defpackage.cah0;
import defpackage.d9e;
import defpackage.hob1;
import defpackage.mv31;
import defpackage.mxp0;
import defpackage.oo31;
import defpackage.rvg0;
import defpackage.s3i0;
import defpackage.skd0;
import defpackage.tng0;
import defpackage.vg10;
import defpackage.vng;
import defpackage.wuj0;
import defpackage.xpg0;
import defpackage.xqb1;
import defpackage.yyw0;
import defpackage.z0d;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SwitchComponent extends View implements Checkable, mv31 {
    private static final String CHECKED_COLOR_ATTR = "component_switch_track_color";
    private static final long DEFAULT_ANIMATION_DURATION = 150;
    private static final int DEFAULT_COLOR = -65281;
    public static final float DISABLED_ALPHA = 0.5f;
    public static final float ENABLED_ALPHA = 1.0f;
    private static final float MAX_PROGRESS = 1.0f;
    private static final float MIN_PROGRESS = 0.0f;
    private static final String UNCHECKED_COLOR_ATTR = "component_switch_unchecked_color";
    private ExternalAccessibilityDelegate accessibilityDelegate;
    private final Animator.AnimatorListener animatorListener;
    private final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
    private final ArgbEvaluator argbEvaluator;
    private boolean autoToggle;
    private ColorStateList backgroundColorList;
    private Paint backgroundPaint;
    private int checkedBackgroundColor;
    private yyw0 checkedChangedListener;
    private int checkedThumbColor;
    private boolean haptic;
    private boolean isChecked;
    private ValueAnimator progressAnimator;
    private final Interpolator progressInterpolator;
    private ColorStateList thumbColorList;
    private Paint thumbPaint;
    private float thumbProgress;
    private float thumbRadius;
    private int thumbSidePadding;
    private int uncheckedBackgroundColor;
    private int uncheckedThumbColor;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int CHECKED_BACKGROUND_TAG = cah0.plaque_sdk_checked_color_id;
    private static final int UNCHECKED_BACKGROUND_TAG = cah0.plaque_sdk_unchecked_color_id;
    private static final int UNCHECKED_COLOR_STYLE = s3i0.plaque_sdk_SwitchComponent_plaque_sdk_component_switch_unchecked_color;
    private static final int CHECKED_COLOR_STYLE = s3i0.plaque_sdk_SwitchComponent_plaque_sdk_component_switch_track_color;

    public static class ExternalAccessibilityDelegate extends View.AccessibilityDelegate {
        private boolean isChecked = false;

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.isChecked);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.isChecked);
            accessibilityNodeInfo.setClassName(Switch.class.getName());
        }

        public void setChecked(boolean z) {
            this.isChecked = z;
        }
    }

    public SwitchComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animatorUpdateListener = new mxp0(18, this);
        this.animatorListener = new AnimatorListenerAdapter() { // from class: com.yandex.plus.plaquesdk.design.SwitchComponent.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwitchComponent.this.progressAnimator = null;
            }
        };
        this.argbEvaluator = new ArgbEvaluator();
        this.progressInterpolator = new FastOutSlowInInterpolator();
        this.uncheckedBackgroundColor = DEFAULT_COLOR;
        this.checkedBackgroundColor = DEFAULT_COLOR;
        this.autoToggle = true;
        this.haptic = true;
        this.accessibilityDelegate = new ExternalAccessibilityDelegate();
        initAttrs(context, attributeSet, i);
        this.thumbRadius = getResources().getDimension(rvg0.plaque_sdk_component_switch_thumb_radius);
        this.thumbSidePadding = dpAsPx(2);
        setLayerType(1, null);
        initPaints();
    }

    private void animateProgress(float f) {
        cancelProgressAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbProgress, f);
        this.progressAnimator = ofFloat;
        ofFloat.setInterpolator(this.progressInterpolator);
        this.progressAnimator.setDuration(150L);
        this.progressAnimator.addUpdateListener(this.animatorUpdateListener);
        this.progressAnimator.addListener(this.animatorListener);
        this.progressAnimator.start();
    }

    private void cancelProgressAnimation() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.progressAnimator = null;
        }
    }

    private void drawBackground(Canvas canvas) {
        if (this.backgroundPaint == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f = measuredHeight / 2.0f;
        canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
    }

    private void drawThumb(Canvas canvas) {
        if (this.thumbPaint == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = isLayoutRTL() ? (measuredWidth - r3) - this.thumbRadius : this.thumbSidePadding + this.thumbRadius;
        float abs = Math.abs(f - (isLayoutRTL() ? this.thumbSidePadding + this.thumbRadius : (measuredWidth - r4) - this.thumbRadius));
        boolean isLayoutRTL = isLayoutRTL();
        float f2 = this.thumbProgress;
        canvas.drawCircle(isLayoutRTL ? f - (abs * f2) : f + (abs * f2), measuredHeight / 2.0f, this.thumbRadius, this.thumbPaint);
    }

    private static float getProgressForState(boolean z) {
        return z ? 1.0f : 0.0f;
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i) {
        final int i2 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s3i0.plaque_sdk_SwitchComponent, i, 0);
        final int i3 = 1;
        if (attributeSet != null) {
            hob1.d(attributeSet, obtainStyledAttributes, UNCHECKED_COLOR_ATTR, UNCHECKED_COLOR_STYLE, tng0.plaque_sdk_controlMinor, new d9e(this) { // from class: uyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // defpackage.d9e
                public final void a(Integer num) {
                    int i4 = i2;
                    SwitchComponent switchComponent = this.b;
                    int intValue = num.intValue();
                    switch (i4) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            }, new d9e(this) { // from class: uyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // defpackage.d9e
                public final void a(Integer num) {
                    int i4 = i3;
                    SwitchComponent switchComponent = this.b;
                    int intValue = num.intValue();
                    switch (i4) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            });
            int i4 = CHECKED_COLOR_STYLE;
            int i5 = tng0.plaque_sdk_controlMain;
            final int i6 = 2;
            d9e d9eVar = new d9e(this) { // from class: uyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // defpackage.d9e
                public final void a(Integer num) {
                    int i42 = i6;
                    SwitchComponent switchComponent = this.b;
                    int intValue = num.intValue();
                    switch (i42) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            };
            final int i7 = 3;
            hob1.d(attributeSet, obtainStyledAttributes, CHECKED_COLOR_ATTR, i4, i5, d9eVar, new d9e(this) { // from class: uyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // defpackage.d9e
                public final void a(Integer num) {
                    int i42 = i7;
                    SwitchComponent switchComponent = this.b;
                    int intValue = num.intValue();
                    switch (i42) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            });
        } else {
            setUncheckedColorAttr(tng0.plaque_sdk_controlMinor);
            setTrackColorAttr(tng0.plaque_sdk_controlMain);
        }
        int color = color(xpg0.plaque_sdk_component_white);
        this.checkedThumbColor = color;
        this.uncheckedThumbColor = color;
        this.backgroundColorList = z0d.a(this.checkedBackgroundColor, this.uncheckedBackgroundColor);
        this.thumbColorList = z0d.a(this.checkedThumbColor, this.uncheckedThumbColor);
        boolean z = obtainStyledAttributes.getBoolean(s3i0.plaque_sdk_SwitchComponent_plaque_sdk_checked, false);
        boolean z2 = obtainStyledAttributes.getBoolean(s3i0.plaque_sdk_SwitchComponent_plaque_sdk_enabled, true);
        setCheckedInternal(z, false);
        setEnabled(z2);
        setBackgroundColor(color(xpg0.plaque_sdk_transparent));
        obtainStyledAttributes.recycle();
    }

    private void initPaints() {
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.thumbPaint = paint2;
        paint2.setAntiAlias(true);
        updateBackgroundPaint();
        updateThumbPaint();
    }

    private boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        setThumbProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setCheckedInternal(boolean z, boolean z2) {
        if (z != this.isChecked) {
            this.isChecked = z;
            this.accessibilityDelegate.setChecked(z);
            float progressForState = getProgressForState(z);
            refreshDrawableState();
            if (z2) {
                if (this.haptic) {
                    a.a(getContext());
                }
                animateProgress(progressForState);
            } else {
                cancelProgressAnimation();
                setThumbProgress(progressForState);
            }
            sendAccessibilityEvent(0);
        }
    }

    private void setThumbProgress(float f) {
        this.thumbProgress = f;
        updateBackgroundPaint();
        updateThumbPaint();
        invalidate();
    }

    private void updateBackgroundPaint() {
        if (this.backgroundPaint == null) {
            initPaints();
        } else {
            this.backgroundPaint.setColor(((Integer) this.argbEvaluator.evaluate(this.thumbProgress, Integer.valueOf(this.uncheckedBackgroundColor), Integer.valueOf(this.checkedBackgroundColor))).intValue());
        }
    }

    private void updateThumbPaint() {
        if (this.thumbPaint == null) {
            initPaints();
        } else {
            this.thumbPaint.setColor(((Integer) this.argbEvaluator.evaluate(this.thumbProgress, Integer.valueOf(this.uncheckedThumbColor), Integer.valueOf(this.checkedThumbColor))).intValue());
        }
    }

    public void applyTheme(ThemeType themeType) {
        Integer num = (Integer) getTag(UNCHECKED_BACKGROUND_TAG);
        if (num != null) {
            this.uncheckedBackgroundColor = colorAttr(num.intValue());
        }
        Integer num2 = (Integer) getTag(CHECKED_BACKGROUND_TAG);
        if (num2 != null) {
            this.checkedBackgroundColor = colorAttr(num2.intValue());
        }
        setTrackColors(this.checkedBackgroundColor, this.uncheckedBackgroundColor);
    }

    @Override // defpackage.mv31
    public View asView() {
        return this;
    }

    public boolean booleanAttr(int i) {
        Context context = asView().getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type == 18) {
            return typedValue.data != 0;
        }
        vg10.i("Type of ", context.getResources().getResourceName(i), " is not boolean!");
        return false;
    }

    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    public int colorAttr(int i) {
        return xqb1.c(asView().getContext(), i);
    }

    public ColorStateList colorStateList(int i) {
        Context context = asView().getContext();
        return wuj0.a(context.getResources(), i, context.getTheme());
    }

    public int[] colors(int i) {
        return asView().getContext().getResources().getIntArray(i);
    }

    public int dimen(int i) {
        return asView().getContext().getResources().getDimensionPixelSize(i);
    }

    public int dpAsPx(int i) {
        return (int) TypedValue.applyDimension(1, i, asView().getContext().getResources().getDisplayMetrics());
    }

    public float dpToPx(int i) {
        return TypedValue.applyDimension(1, i, asView().getContext().getResources().getDisplayMetrics());
    }

    public Drawable drawable(int i, Resources.Theme theme) {
        return vng.t(i, new ContextThemeWrapper(asView().getContext(), theme));
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] onCreateDrawableState = super.onCreateDrawableState(0);
        int[] copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
        View.mergeDrawableStates(copyOf, CHECKED_STATE_SET);
        this.uncheckedBackgroundColor = this.backgroundColorList.getColorForState(onCreateDrawableState, DEFAULT_COLOR);
        this.checkedBackgroundColor = this.backgroundColorList.getColorForState(copyOf, DEFAULT_COLOR);
        this.uncheckedThumbColor = this.thumbColorList.getColorForState(onCreateDrawableState, DEFAULT_COLOR);
        this.checkedThumbColor = this.thumbColorList.getColorForState(copyOf, DEFAULT_COLOR);
        updateBackgroundPaint();
        updateThumbPaint();
        invalidate();
    }

    public FrameLayout.LayoutParams generateDefaultFrameLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.setMarginStart(dimen(rvg0.plaque_sdk_component_safe_switch_start_margin));
        layoutParams.setMarginEnd(dimen(rvg0.plaque_sdk_component_safe_switch_end_margin));
        return layoutParams;
    }

    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isVisible() {
        return asView().getVisibility() == 0;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setThumbProgress(getProgressForState(isChecked()));
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelProgressAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        drawBackground(canvas);
        drawThumb(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.isChecked);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
        accessibilityNodeInfo.setClassName(Switch.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dpAsPx(56), 1073741824), View.MeasureSpec.makeMeasureSpec(dpAsPx(32), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedInternal(savedState.isChecked, false);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = AbsSavedState.EMPTY_STATE;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.isChecked = isChecked();
        return savedState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!isEnabled() || !this.autoToggle) {
            return super.performClick();
        }
        toggleWithAnimation();
        return super.performClick();
    }

    public View.AccessibilityDelegate provideAccessibilityDelegate() {
        return this.accessibilityDelegate;
    }

    public String quantityString(int i, int i2, Object... objArr) {
        Context context = asView().getContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return context.getResources().getQuantityString(i, i2, Arrays.copyOf(copyOf, copyOf.length));
    }

    public String quantityStringWithFallback(int i, int i2, int i3, Object... objArr) {
        String str;
        Context context = asView().getContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        try {
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            str = context.getResources().getQuantityString(i, i3, Arrays.copyOf(copyOf2, copyOf2.length));
        } catch (Exception e) {
            skd0.c(PlusLogTag.SDK, "Error while getQuantityString", e);
            str = null;
        }
        if (str != null) {
            return str;
        }
        Object[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        return context.getString(i2, Arrays.copyOf(copyOf3, copyOf3.length));
    }

    public void setAutoToggle(boolean z) {
        this.autoToggle = false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z, false);
    }

    public void setCheckedWithAnimation(boolean z) {
        setCheckedInternal(z, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.5f);
        super.setEnabled(z);
    }

    public void setHapticEnabled(boolean z) {
        this.haptic = z;
    }

    public void setOnCheckedChangedListener(yyw0 yyw0Var) {
        if (yyw0Var == null || isClickable()) {
            return;
        }
        setClickable(true);
    }

    public void setTrackColor(int i) {
        setTrackColors(color(i), this.uncheckedBackgroundColor);
    }

    public void setTrackColorAttr(int i) {
        setTag(CHECKED_BACKGROUND_TAG, Integer.valueOf(i));
        setTrackColors(colorAttr(i), this.uncheckedBackgroundColor);
    }

    public void setTrackColors(int i, int i2) {
        this.checkedBackgroundColor = i;
        this.uncheckedBackgroundColor = i2;
        this.backgroundColorList = z0d.a(i, i2);
        updateBackgroundPaint();
        invalidate();
    }

    public void setUncheckedColorAttr(int i) {
        setTag(UNCHECKED_BACKGROUND_TAG, Integer.valueOf(i));
        setTrackColors(this.checkedBackgroundColor, colorAttr(i));
    }

    public void setUncheckedTrackColor(int i) {
        setTrackColors(this.checkedBackgroundColor, color(i));
    }

    public void setVisible(boolean z) {
        asView().setVisibility(z ? 0 : 8);
    }

    public float spToPx(float f) {
        return TypedValue.applyDimension(2, f, asView().getContext().getResources().getDisplayMetrics());
    }

    public String string(int i, Object... objArr) {
        Context context = asView().getContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return context.getString(i, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setCheckedInternal(!isChecked(), false);
    }

    public void toggleWithAnimation() {
        if (isEnabled()) {
            setCheckedInternal(!isChecked(), true);
        }
    }

    public View inflate(int i, boolean z) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, z);
    }

    public int colorAttr(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.yandex.plus.plaquesdk.design.SwitchComponent.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean isChecked;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.isChecked = parcel.readInt() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Drawable drawable(int i) {
        return vng.t(i, asView().getContext());
    }

    public float dpToPx(float f) {
        return TypedValue.applyDimension(1, f, asView().getContext().getResources().getDisplayMetrics());
    }

    public String string(int i) {
        return asView().getContext().getString(i);
    }

    public int dpAsPx(float f) {
        return (int) TypedValue.applyDimension(1, f, asView().getContext().getResources().getDisplayMetrics());
    }

    public SwitchComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tng0.plaque_sdk_switchComponentStyle);
    }

    public SwitchComponent(Context context) {
        this(context, null);
    }
}
