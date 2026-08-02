package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class b extends AccessibilityDelegateCompat {
    public final /* synthetic */ BottomSheetDialog a;

    public b(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (!this.a.cancelable) {
            whVar.u(false);
        } else {
            whVar.a(1048576);
            whVar.u(true);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            BottomSheetDialog bottomSheetDialog = this.a;
            if (bottomSheetDialog.cancelable) {
                bottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
