package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class k extends AccessibilityDelegateCompat {
    public final TextInputLayout a;

    public k(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        TextInputLayout textInputLayout;
        StartCompoundLayout startCompoundLayout;
        EndCompoundLayout endCompoundLayout;
        h hVar;
        String str;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        TextInputLayout textInputLayout2 = this.a;
        EditText editText = textInputLayout2.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout2.getHint();
        CharSequence helperText = textInputLayout2.getHelperText();
        CharSequence error = textInputLayout2.getError();
        CharSequence placeholderText = textInputLayout2.getPlaceholderText();
        int counterMaxLength = textInputLayout2.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout2.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean isHintExpanded = textInputLayout2.isHintExpanded();
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            textInputLayout = textInputLayout2;
        } else {
            hVar = textInputLayout2.indicatorViewController;
            textInputLayout = textInputLayout2;
            if (hVar.o == 2 && hVar.y != null && !TextUtils.isEmpty(hVar.w)) {
                if (TextUtils.isEmpty(charSequence)) {
                    str = helperText.toString();
                } else {
                    str = charSequence + Extension.FIX_SPACE + ((Object) helperText);
                }
                charSequence = str;
            }
        }
        startCompoundLayout = textInputLayout.startLayout;
        startCompoundLayout.setupAccessibilityNodeInfo(whVar);
        if (!isEmpty) {
            whVar.E(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            whVar.E(charSequence);
            if (!isHintExpanded && placeholderText != null) {
                whVar.E(charSequence + Extension.FIX_SPACE + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            whVar.E(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            whVar.x(charSequence);
            whVar.a.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        whVar.a.setMaxTextLength(counterMaxLength);
        if (z) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            whVar.a.setError(error);
        }
        endCompoundLayout = textInputLayout.endLayout;
        endCompoundLayout.getEndIconDelegate().m(whVar);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        EndCompoundLayout endCompoundLayout;
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        endCompoundLayout = this.a.endLayout;
        endCompoundLayout.getEndIconDelegate().n(accessibilityEvent);
    }
}
