package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.b4c;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.leh0;
import defpackage.org0;
import defpackage.th;
import defpackage.uqg0;
import defpackage.wuj0;
import defpackage.z2i0;
import defpackage.z3c;
import java.util.Arrays;

/* loaded from: classes11.dex */
class ClockFaceView extends RadialViewGroup implements b4c {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private z3c onEnterKeyPressedListener;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.ClockFaceView, i, g2i0.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList o = jx81.o(context, obtainStyledAttributes, z2i0.ClockFaceView_clockNumberTextColor);
        this.textColor = o;
        LayoutInflater.from(context).inflate(jvh0.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(leh0.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(org0.material_clock_hand_padding);
        int colorForState = o.getColorForState(new int[]{R.attr.state_selected}, o.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, o.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = wuj0.a(context.getResources(), uqg0.material_timepicker_clockface, context.getTheme()).getDefaultColor();
        ColorStateList o2 = jx81.o(context, obtainStyledAttributes, z2i0.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(o2 != null ? o2.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        });
        setFocusable(true);
        setClipToOutline(true);
        this.valueAccessibilityDelegate = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(org0.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(org0.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(org0.material_clock_size);
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i = 0; i < this.textViewPool.size(); i++) {
            TextView textView = this.textViewPool.get(i);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private int getSelectedIndex() {
        for (int i = 0; i < this.textViewPool.size(); i++) {
            TextView valueAt = this.textViewPool.valueAt(i);
            if (valueAt.isSelected()) {
                return ((Integer) valueAt.getTag(leh0.material_value_index)).intValue();
            }
        }
        return -1;
    }

    private TextView getSelectedTextView(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.textViewPool.size(); i++) {
            TextView textView2 = this.textViewPool.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float height = this.scratch.height() * this.scratch.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
        }
        return textView;
    }

    private static float max3(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    private void updateTextViews(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.values.length, size); i2++) {
            TextView textView = this.textViewPool.get(i2);
            if (i2 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(jvh0.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.values[i2]);
                textView.setTag(leh0.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(leh0.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                androidx.core.view.b.p(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.values[i2]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) th.a(1, this.values.length, 1, false).a);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int length;
        int selectedIndex = getSelectedIndex();
        if (!isShown() || selectedIndex == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            switch (i) {
                case 19:
                case 22:
                    length = (selectedIndex + 1) % this.values.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.values;
                    length = ((selectedIndex - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == selectedIndex) {
                return super.onKeyDown(i, keyEvent);
            }
            int i2 = (length / 12) + 1;
            if (i2 != getCurrentLevel()) {
                setCurrentLevel(i2);
            }
            setHandRotation((length % 12) * 30.0f);
            return true;
        }
        z3c z3cVar = this.onEnterKeyPressedListener;
        if (z3cVar != null) {
            ((j) z3cVar).a.lambda$new$1();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            max3 = Math.min(max3, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            max3 = Math.min(max3, View.MeasureSpec.getSize(i2));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max3, 1073741824);
        int selectorRadius = ((max3 / 2) - this.clockHandView.getSelectorRadius()) - this.clockHandPadding;
        if (selectorRadius != getRadius()) {
            setRadius(selectorRadius);
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // defpackage.b4c
    public void onRotate(float f, boolean z) {
        if (Math.abs(this.currentHandRotation - f) > EPSILON) {
            this.currentHandRotation = f;
            findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int i) {
        this.clockHandView.setCurrentLevel(i);
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
        findIntersectingTextView();
    }

    public void setOnEnterKeyPressedListener(z3c z3cVar) {
        this.onEnterKeyPressedListener = z3cVar;
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, int i) {
        this.values = strArr;
        updateTextViews(i);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i = 0; i < this.textViewPool.size(); i++) {
            this.textViewPool.get(i).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialClockStyle);
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
