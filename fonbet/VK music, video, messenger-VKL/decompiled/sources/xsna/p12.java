package xsna;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: AndroidAccessibilityManager.android.kt */
/* loaded from: classes11.dex */
public final class p12 implements kl {
    public final AccessibilityManager a;

    public p12(Context context) {
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // xsna.kl
    public final long a(long j, boolean z) {
        if (j >= 2147483647L) {
            return j;
        }
        int i = z ? 7 : 3;
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.a;
        if (i2 >= 29) {
            int a = rw2.a(accessibilityManager, (int) j, i);
            if (a != Integer.MAX_VALUE) {
                return a;
            }
        } else if (!z || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
