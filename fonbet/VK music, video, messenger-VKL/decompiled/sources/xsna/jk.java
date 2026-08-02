package xsna;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes12.dex */
public final class jk {

    /* compiled from: AccessibilityEventCompat.java */
    public static class a {
        public static void a(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }

    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static void b(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
