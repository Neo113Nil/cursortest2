package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.evu0;
import defpackage.m3u0;
import defpackage.oz40;
import defpackage.rh;
import defpackage.scv;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0003\n\u0002\b\r*\u0002\u001c\u001f\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001*B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R+\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lm3u0;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "<init>", "(ZZZ)V", BackendConfig.Restrictions.ENABLED, "Lzy11;", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "am", "register", "(Landroid/view/accessibility/AccessibilityManager;)V", "unregister", "Z", "getListenToSwitchAccessState", "()Z", "getListenToVoiceAccessState", "<set-?>", "accessibilityEnabled$delegate", "Loz40;", "getAccessibilityEnabled", "setAccessibilityEnabled", "accessibilityEnabled", "androidx/compose/material3/internal/Listener$touchExplorationListener$1", "touchExplorationListener", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "androidx/compose/material3/internal/Listener$otherA11yServicesListener$1", "otherA11yServicesListener", "Landroidx/compose/material3/internal/Listener$otherA11yServicesListener$1;", "getSwitchAccessEnabled", "(Landroid/view/accessibility/AccessibilityManager;)Z", "switchAccessEnabled", "getVoiceAccessEnabled", "voiceAccessEnabled", "getValue", "()Ljava/lang/Boolean;", "value", "rh", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, m3u0 {

    /* renamed from: accessibilityEnabled$delegate, reason: from kotlin metadata */
    private final oz40 accessibilityEnabled = androidx.compose.runtime.f.j(Boolean.FALSE);
    private final boolean listenToSwitchAccessState;
    private final boolean listenToVoiceAccessState;
    private final Listener$otherA11yServicesListener$1 otherA11yServicesListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    public Listener(boolean z, boolean z2, boolean z3) {
        this.listenToSwitchAccessState = z2;
        this.listenToVoiceAccessState = z3;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = null;
        this.touchExplorationListener = z ? new Listener$touchExplorationListener$1() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            listener$otherA11yServicesListener$1 = new Listener$otherA11yServicesListener$1(this);
        }
        this.otherA11yServicesListener = listener$otherA11yServicesListener$1;
    }

    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && evu0.y(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getVoiceAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && evu0.y(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z));
    }

    public final boolean getListenToSwitchAccessState() {
        return this.listenToSwitchAccessState;
    }

    public final boolean getListenToVoiceAccessState() {
        return this.listenToVoiceAccessState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r0.getSwitchAccessEnabled() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r2.getVoiceAccessEnabled() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.getEnabled() == true) goto L24;
     */
    @Override // defpackage.m3u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean getValue() {
        boolean z;
        if (getAccessibilityEnabled()) {
            Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
            z = true;
            if (listener$touchExplorationListener$1 != null) {
            }
            if (this.listenToSwitchAccessState) {
                Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = this.otherA11yServicesListener;
                if (listener$otherA11yServicesListener$1 != null) {
                }
            }
            if (this.listenToVoiceAccessState) {
                Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$12 = this.otherA11yServicesListener;
                if (listener$otherA11yServicesListener$12 != null) {
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        setAccessibilityEnabled(enabled);
    }

    public final void register(AccessibilityManager am) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        setAccessibilityEnabled(am.isEnabled());
        am.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.setEnabled(am.isTouchExplorationEnabled());
            am.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        listener$otherA11yServicesListener$1.setSwitchAccessEnabled(getSwitchAccessEnabled(am));
        listener$otherA11yServicesListener$1.setVoiceAccessEnabled(getVoiceAccessEnabled(am));
        rh.a(am, scv.f(listener$otherA11yServicesListener$1));
    }

    public final void unregister(AccessibilityManager am) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        am.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            am.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        rh.m(am, scv.f(listener$otherA11yServicesListener$1));
    }
}
