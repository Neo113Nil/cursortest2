package com.yandex.div.core.view2;

import android.view.View;
import xsna.am;
import xsna.hk;

/* compiled from: DivAccessibilityBinder.kt */
/* loaded from: classes7.dex */
final class ExtensiveAccessibilityDelegate extends hk {
    private final String className;
    private final boolean isCheckable;
    private Boolean isChecked;
    private final boolean isHeading;

    public ExtensiveAccessibilityDelegate(String str, boolean z, boolean z2) {
        this.className = str;
        this.isHeading = z;
        this.isCheckable = z2;
    }

    @Override // xsna.hk
    public void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (this.className.length() > 0) {
            amVar.n(this.className);
        }
        amVar.u(this.isHeading);
        if (this.isCheckable) {
            amVar.l(true);
            Boolean bool = this.isChecked;
            if (bool != null) {
                amVar.m(bool.booleanValue());
            }
        }
    }

    public final void setChecked(Boolean bool) {
        this.isChecked = bool;
    }
}
