package xsna;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: SwitchAccessibilityDelegate.kt */
/* loaded from: classes17.dex */
public final class zmn0 extends hk {
    public final WeakReference<SwitchCompat> b;

    public zmn0(SwitchCompat switchCompat) {
        this.b = new WeakReference<>(switchCompat);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        SwitchCompat switchCompat = this.b.get();
        if (switchCompat != null) {
            accessibilityEvent.setClassName("android.widget.Switch");
            accessibilityEvent.setChecked(switchCompat.isChecked());
            accessibilityEvent.setEnabled(view.isEnabled());
        }
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        SwitchCompat switchCompat = this.b.get();
        if (switchCompat != null) {
            amVar.n("android.widget.Switch");
            amVar.m(switchCompat.isChecked());
            amVar.a.setEnabled(view.isEnabled());
            amVar.l(true);
            StringBuilder sb = new StringBuilder();
            sb.append(view.getContentDescription());
            sb.append(' ');
            if (switchCompat.isChecked()) {
                sb.append(switchCompat.getTextOn());
            } else {
                sb.append(switchCompat.getTextOff());
            }
            amVar.A(sb.toString());
            amVar.r("");
            amVar.z("");
        }
    }

    @Override // xsna.hk
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        SwitchCompat switchCompat = this.b.get();
        if (switchCompat == null || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        CharSequence textOn = switchCompat.isChecked() ? switchCompat.getTextOn() : switchCompat.getTextOff();
        if (textOn != null) {
            accessibilityEvent.getText().add(textOn);
        }
    }
}
