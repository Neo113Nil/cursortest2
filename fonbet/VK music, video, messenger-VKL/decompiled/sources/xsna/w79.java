package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: CallParticipantSettingsActionsFeatureState.kt */
/* loaded from: classes7.dex */
public final class w79 implements VoipActionsFeatureState {
    public final VoipActionsFeatureState.e a;
    public final VoipActionsFeatureState.p b;
    public final VoipActionsFeatureState.c c;
    public final VoipActionsFeatureState.g d;
    public final VoipActionsFeatureState.h e;

    public w79(VoipActionsFeatureState.e eVar, VoipActionsFeatureState.p pVar, VoipActionsFeatureState.c cVar, VoipActionsFeatureState.g gVar, VoipActionsFeatureState.h hVar) {
        this.a = eVar;
        this.b = pVar;
        this.c = cVar;
        this.d = gVar;
        this.e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w79)) {
            return false;
        }
        w79 w79Var = (w79) obj;
        return epx.f(this.a, w79Var.a) && epx.f(this.b, w79Var.b) && epx.f(this.c, w79Var.c) && epx.f(this.d, w79Var.d) && epx.f(this.e, w79Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CallParticipantSettingsActionsFeatureState(callEffectsPlaceholder=" + this.a + ", noiseSuppressor=" + this.b + ", beautyFilter=" + this.c + ", frontCameraMirroring=" + this.d + ", gesturesFeedback=" + this.e + ')';
    }
}
