package com.google.android.material.timepicker;

import defpackage.a4c;
import defpackage.a7z0;
import defpackage.b4c;
import defpackage.kxh0;
import defpackage.x6z0;
import defpackage.z6z0;

/* loaded from: classes11.dex */
public final class f implements b4c, a7z0, z6z0, a4c, x6z0 {
    public final TimePickerView a;
    public final TimeModel b;
    public float c;
    public float w;
    public boolean x = false;
    public static final String[] y = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] z = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] A = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public f(TimePickerView timePickerView, TimeModel timeModel) {
        this.a = timePickerView;
        this.b = timeModel;
        if (timeModel.format == 0) {
            timePickerView.showToggle();
        }
        timePickerView.addOnRotateListener(this);
        timePickerView.setOnSelectionChangeListener(this);
        timePickerView.setOnPeriodChangeListener(this);
        timePickerView.setOnActionUpListener(this);
        c(TimeModel.NUMBER_FORMAT, y);
        c(TimeModel.NUMBER_FORMAT, z);
        c(TimeModel.ZERO_LEADING_NUMBER_FORMAT, A);
        invalidate();
    }

    @Override // defpackage.a7z0
    public final void a(int i) {
        b(i, true);
    }

    public final void b(int i, boolean z2) {
        boolean z3 = i == 12;
        TimePickerView timePickerView = this.a;
        timePickerView.setAnimateOnTouchUp(z3);
        TimeModel timeModel = this.b;
        timeModel.selection = i;
        timePickerView.setValues(z3 ? A : timeModel.format == 1 ? z : y, z3 ? kxh0.material_minute_suffix : timeModel.getHourContentDescriptionResId());
        timePickerView.setCurrentLevel((timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) ? 2 : 1);
        timePickerView.setHandRotation(z3 ? this.c : this.w, z2);
        timePickerView.setActiveSelection(i);
        timePickerView.setMinuteHourDelegate(new e(this, timePickerView.getContext(), kxh0.material_hour_selection, 0));
        timePickerView.setHourClickDelegate(new e(this, timePickerView.getContext(), kxh0.material_minute_selection, 1));
    }

    public final void c(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.formatText(this.a.getResources(), strArr[i], str);
        }
    }

    @Override // defpackage.x6z0
    public final void hide() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.x6z0
    public final void invalidate() {
        TimeModel timeModel = this.b;
        this.w = (timeModel.getHourForDisplay() * 30) % 360;
        this.c = timeModel.minute * 6;
        b(timeModel.selection, false);
        this.a.updateTime(timeModel.period, timeModel.getHourForDisplay(), timeModel.minute);
    }

    @Override // defpackage.b4c
    public final void onRotate(float f, boolean z2) {
        if (this.x || z2) {
            return;
        }
        TimeModel timeModel = this.b;
        int i = timeModel.hour;
        int i2 = timeModel.minute;
        int round = Math.round(f);
        int i3 = timeModel.selection;
        TimePickerView timePickerView = this.a;
        if (i3 == 12) {
            timeModel.setMinute((round + 3) / 6);
            this.c = (float) Math.floor(timeModel.minute * 6);
        } else {
            int i4 = (round + 15) / 30;
            if (timeModel.format == 1) {
                i4 %= 12;
                if (timePickerView.getCurrentLevel() == 2) {
                    i4 += 12;
                }
            }
            timeModel.setHour(i4);
            this.w = (timeModel.getHourForDisplay() * 30) % 360;
        }
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), timeModel.minute);
        if (timeModel.minute == i2 && timeModel.hour == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // defpackage.x6z0
    public final void show() {
        this.a.setVisibility(0);
    }
}
