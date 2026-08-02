package xsna;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes12.dex */
public final class ml implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final q7 b;

    public ml(q7 q7Var) {
        this.b = q7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ml) {
            return this.b.equals(((ml) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        tmo tmoVar = (tmo) this.b.c;
        AutoCompleteTextView autoCompleteTextView = tmoVar.h;
        if (autoCompleteTextView == null || gcd0.m(autoCompleteTextView)) {
            return;
        }
        CheckableImageButton checkableImageButton = tmoVar.d;
        int i = z ? 2 : 1;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
