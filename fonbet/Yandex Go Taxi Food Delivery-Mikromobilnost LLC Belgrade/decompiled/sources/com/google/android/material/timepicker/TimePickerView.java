package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.a4c;
import defpackage.a7z0;
import defpackage.b4c;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.y6z0;
import defpackage.z6z0;
import java.util.Locale;

/* loaded from: classes11.dex */
class TimePickerView extends ConstraintLayout {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private y6z0 onDoubleTapListener;
    private z6z0 onPeriodChangeListener;
    private a7z0 onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectionListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimePickerView.this.onSelectionChangeListener != null) {
                    TimePickerView.this.onSelectionChangeListener.a(((Integer) view.getTag(leh0.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(jvh0.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(leh0.material_clock_face);
        this.clockFace = clockFaceView;
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(leh0.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new g(1, this));
        this.minuteView = (Chip) findViewById(leh0.material_minute_tv);
        this.hourView = (Chip) findViewById(leh0.material_hour_tv);
        this.clockHandView = (ClockHandView) findViewById(leh0.material_clock_hand);
        clockFaceView.setOnEnterKeyPressedListener(new j(this));
        setupDoubleTap();
        setUpDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        z6z0 z6z0Var;
        if (z && (z6z0Var = this.onPeriodChangeListener) != null) {
            ((f) z6z0Var).b.setPeriod(i == leh0.material_clock_period_pm_button ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        a7z0 a7z0Var;
        if (!this.hourView.isChecked() || (a7z0Var = this.onSelectionChangeListener) == null) {
            return;
        }
        a7z0Var.a(12);
    }

    private void setUpDisplay() {
        this.minuteView.setTag(leh0.selection_type, 12);
        this.hourView.setTag(leh0.selection_type, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName("android.view.View");
        this.hourView.setAccessibilityClassName("android.view.View");
    }

    private void setupDoubleTap() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                y6z0 y6z0Var = TimePickerView.this.onDoubleTapListener;
                if (y6z0Var == null) {
                    return false;
                }
                y6z0Var.onDoubleTap();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.minuteView.setOnTouchListener(onTouchListener);
        this.hourView.setOnTouchListener(onTouchListener);
    }

    private void updateSelection(Chip chip, boolean z) {
        chip.setChecked(z);
        chip.setAccessibilityLiveRegion(z ? 2 : 0);
    }

    public void addOnRotateListener(b4c b4cVar) {
        this.clockHandView.addOnRotateListener(b4cVar);
    }

    public int getCurrentLevel() {
        return this.clockFace.getCurrentLevel();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.hourView.sendAccessibilityEvent(8);
        }
    }

    public void setActiveSelection(int i) {
        updateSelection(this.minuteView, i == 12);
        updateSelection(this.hourView, i == 10);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.clockHandView.setAnimateOnTouchUp(z);
    }

    public void setCurrentLevel(int i) {
        this.clockFace.setCurrentLevel(i);
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        androidx.core.view.b.p(this.minuteView, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        androidx.core.view.b.p(this.hourView, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(a4c a4cVar) {
        this.clockHandView.setOnActionUpListener(a4cVar);
    }

    public void setOnDoubleTapListener(y6z0 y6z0Var) {
        this.onDoubleTapListener = y6z0Var;
    }

    public void setOnPeriodChangeListener(z6z0 z6z0Var) {
        this.onPeriodChangeListener = z6z0Var;
    }

    public void setOnSelectionChangeListener(a7z0 a7z0Var) {
        this.onSelectionChangeListener = a7z0Var;
    }

    public void setValues(String[] strArr, int i) {
        this.clockFace.setValues(strArr, i);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    public void updateTime(int i, int i2, int i3) {
        this.toggle.check(i == 1 ? leh0.material_clock_period_pm_button : leh0.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        String format2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        if (!TextUtils.equals(this.minuteView.getText(), format)) {
            this.minuteView.setText(format);
        }
        if (TextUtils.equals(this.hourView.getText(), format2)) {
            return;
        }
        this.hourView.setText(format2);
    }

    public void setHandRotation(float f, boolean z) {
        this.clockHandView.setHandRotation(f, z);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
