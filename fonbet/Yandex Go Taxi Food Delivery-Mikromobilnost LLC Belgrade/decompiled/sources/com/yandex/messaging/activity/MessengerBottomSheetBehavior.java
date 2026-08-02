package com.yandex.messaging.activity;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.dlp0;
import defpackage.z83;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/messaging/activity/MessengerBottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessengerBottomSheetBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() <= 0.0f) {
            return super.h(coordinatorLayout, view, motionEvent);
        }
        coordinatorLayout.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.i(coordinatorLayout, view, i);
        if (view.getHeight() > 0) {
            z83.b(null, Integer.valueOf(coordinatorLayout.getHeight()), Integer.valueOf(view.getHeight()));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (!(view2 instanceof dlp0) || ((dlp0) view2).computeVerticalScrollOffset() == 0) {
            super.l(coordinatorLayout, view, view2, i, i2, iArr, i3);
        } else {
            view2.stopNestedScroll();
        }
    }
}
