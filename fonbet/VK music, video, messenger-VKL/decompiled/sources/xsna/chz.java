package xsna;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;

/* compiled from: AccessibilityServiceStateProvider.android.kt */
/* loaded from: classes11.dex */
public final class chz implements AccessibilityManager.AccessibilityStateChangeListener, mtk0<Boolean> {
    public final boolean b;
    public final boolean c;
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final c e;
    public final b f;

    /* compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class a {
        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    /* compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {
        public final wh50 a;
        public final wh50 b;

        public b(chz chzVar) {
            Boolean bool = Boolean.FALSE;
            this.a = androidx.compose.runtime.k.b(bool);
            this.b = androidx.compose.runtime.k.b(bool);
        }

        public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            ((zak0) this.a).setValue(Boolean.valueOf(chz.c(accessibilityManager)));
            ((zak0) this.b).setValue(Boolean.valueOf(chz.h(accessibilityManager)));
        }
    }

    /* compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            ((zak0) this.b).setValue(Boolean.valueOf(z));
        }
    }

    public chz(boolean z, boolean z2, boolean z3) {
        this.b = z2;
        this.c = z3;
        b bVar = null;
        this.e = z ? new c() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b(this);
        }
        this.f = bVar;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && drm0.D(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && drm0.D(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (((java.lang.Boolean) ((xsna.zak0) r2.a).getValue()).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (((java.lang.Boolean) ((xsna.zak0) r2.b).getValue()).booleanValue() == true) goto L22;
     */
    @Override // xsna.mtk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean getValue() {
        boolean z;
        if (((Boolean) ((zak0) this.d).getValue()).booleanValue()) {
            z = true;
            c cVar = this.e;
            if (cVar == null || !((Boolean) ((zak0) cVar.b).getValue()).booleanValue()) {
                boolean z2 = this.b;
                b bVar = this.f;
                if (z2) {
                    if (bVar != null) {
                    }
                }
                if (this.c) {
                    if (bVar != null) {
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        ((zak0) this.d).setValue(Boolean.valueOf(z));
    }
}
