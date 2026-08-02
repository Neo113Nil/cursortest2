package com.yandex.messaging.views;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class a extends AccessibilityDelegateCompat {
    public final /* synthetic */ ExpandedBottomSheetDialog a;

    public a(ExpandedBottomSheetDialog expandedBottomSheetDialog) {
        this.a = expandedBottomSheetDialog;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (!this.a.mCancelable) {
            whVar.u(false);
        } else {
            whVar.a(1048576);
            whVar.u(true);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ExpandedBottomSheetDialog expandedBottomSheetDialog = this.a;
            if (expandedBottomSheetDialog.mCancelable) {
                expandedBottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
