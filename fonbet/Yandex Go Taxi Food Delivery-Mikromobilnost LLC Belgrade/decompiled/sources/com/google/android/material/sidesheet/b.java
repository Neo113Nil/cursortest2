package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class b extends AccessibilityDelegateCompat {
    public final /* synthetic */ SheetDialog a;

    public b(SheetDialog sheetDialog) {
        this.a = sheetDialog;
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
            SheetDialog sheetDialog = this.a;
            if (sheetDialog.cancelable) {
                sheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
