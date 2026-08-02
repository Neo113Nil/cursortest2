package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.leh0;
import defpackage.ph;
import defpackage.uh;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class b extends AccessibilityDelegateCompat {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        SparseArray sparseArray;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        int intValue = ((Integer) view.getTag(leh0.material_value_index)).intValue();
        if (intValue > 0) {
            sparseArray = this.a.textViewPool;
            whVar.F((View) sparseArray.get(intValue - 1));
        }
        whVar.s(uh.a(0, 1, intValue, 1, false, view.isSelected()));
        whVar.q(true);
        whVar.b(ph.g);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        ClockHandView clockHandView;
        ClockHandView clockHandView2;
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.a;
        rect = clockFaceView.textViewRect;
        view.getHitRect(rect);
        rect2 = clockFaceView.textViewRect;
        float centerX = rect2.centerX();
        rect3 = clockFaceView.textViewRect;
        float centerY = rect3.centerY();
        clockHandView = clockFaceView.clockHandView;
        clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockHandView2 = clockFaceView.clockHandView;
        clockHandView2.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
