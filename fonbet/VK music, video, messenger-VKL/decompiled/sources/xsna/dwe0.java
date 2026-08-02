package xsna;

import com.vk.voip.ui.accessibility.AccessibilityEvents;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: RaisedHandsAccessibilityDelegate.kt */
/* loaded from: classes7.dex */
public final class dwe0 {
    public final com.vk.voip.b a;
    public final AccessibilityEvents b;
    public final bpn0 c = new bpn0(new u210(this, 20));

    public dwe0(com.vk.voip.b bVar, AccessibilityEvents accessibilityEvents) {
        this.a = bVar;
        this.b = accessibilityEvents;
    }

    public final void a() {
        this.a.h().g((ParticipantStatesManager.Listener) this.c.getValue());
    }
}
