package xsna;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes12.dex */
public class bm {
    public final AccessibilityNodeProvider a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    public static class a extends AccessibilityNodeProvider {
        public final bm a;

        public a(bm bmVar) {
            this.a = bmVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            am b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            am c = this.a.c(i);
            if (c == null) {
                return null;
            }
            return c.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.e(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, new am(accessibilityNodeInfo), str, bundle);
        }
    }

    public bm() {
        this.a = new b(this);
    }

    public am b(int i) {
        return null;
    }

    public am c(int i) {
        return null;
    }

    public final Object d() {
        return this.a;
    }

    public boolean e(int i, int i2, Bundle bundle) {
        return false;
    }

    public bm(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }

    public void a(int i, am amVar, String str, Bundle bundle) {
    }
}
