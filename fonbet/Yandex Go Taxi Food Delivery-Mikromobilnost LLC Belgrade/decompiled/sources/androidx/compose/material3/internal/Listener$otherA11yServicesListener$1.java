package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import defpackage.oz40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/compose/material3/internal/Listener$otherA11yServicesListener$1", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "am", "Lzy11;", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "<set-?>", "switchAccessEnabled$delegate", "Loz40;", "getSwitchAccessEnabled", "()Z", "setSwitchAccessEnabled", "(Z)V", "switchAccessEnabled", "voiceAccessEnabled$delegate", "getVoiceAccessEnabled", "setVoiceAccessEnabled", "voiceAccessEnabled", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Listener$otherA11yServicesListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: switchAccessEnabled$delegate, reason: from kotlin metadata */
    private final oz40 switchAccessEnabled;
    final /* synthetic */ Listener this$0;

    /* renamed from: voiceAccessEnabled$delegate, reason: from kotlin metadata */
    private final oz40 voiceAccessEnabled;

    public Listener$otherA11yServicesListener$1(Listener listener) {
        this.this$0 = listener;
        Boolean bool = Boolean.FALSE;
        this.switchAccessEnabled = androidx.compose.runtime.f.j(bool);
        this.voiceAccessEnabled = androidx.compose.runtime.f.j(bool);
    }

    public final boolean getSwitchAccessEnabled() {
        return ((Boolean) this.switchAccessEnabled.getValue()).booleanValue();
    }

    public final boolean getVoiceAccessEnabled() {
        return ((Boolean) this.voiceAccessEnabled.getValue()).booleanValue();
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager am) {
        boolean switchAccessEnabled;
        boolean voiceAccessEnabled;
        switchAccessEnabled = this.this$0.getSwitchAccessEnabled(am);
        setSwitchAccessEnabled(switchAccessEnabled);
        voiceAccessEnabled = this.this$0.getVoiceAccessEnabled(am);
        setVoiceAccessEnabled(voiceAccessEnabled);
    }

    public final void setSwitchAccessEnabled(boolean z) {
        this.switchAccessEnabled.setValue(Boolean.valueOf(z));
    }

    public final void setVoiceAccessEnabled(boolean z) {
        this.voiceAccessEnabled.setValue(Boolean.valueOf(z));
    }
}
