package com.google.android.material.timepicker;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class a extends AccessibilityDelegateCompat {
    public final /* synthetic */ ChipTextInputComboView a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.a = chipTextInputComboView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        TextView textView;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.E(((EditText) view).getText());
        textView = this.a.label;
        whVar.x(textView.getText());
        whVar.a.setMaxTextLength(2);
    }
}
