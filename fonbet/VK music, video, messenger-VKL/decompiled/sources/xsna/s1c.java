package xsna;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: CheckableImageButton.java */
/* loaded from: classes13.dex */
public final class s1c extends hk {
    public final /* synthetic */ CheckableImageButton b;

    public s1c(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.e);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        CheckableImageButton checkableImageButton = this.b;
        amVar.l(checkableImageButton.f);
        amVar.m(checkableImageButton.e);
    }
}
