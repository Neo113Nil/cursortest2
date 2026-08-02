package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: CallParticipantPermissionsActionsFeatureState.kt */
/* loaded from: classes7.dex */
public final class n79 implements VoipActionsFeatureState {
    public final VoipActionsFeatureState.n a;
    public final VoipActionsFeatureState.o b;
    public final VoipActionsFeatureState.y c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public n79(VoipActionsFeatureState.n nVar, VoipActionsFeatureState.o oVar, VoipActionsFeatureState.y yVar, boolean z, boolean z2, boolean z3) {
        this.a = nVar;
        this.b = oVar;
        this.c = yVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n79)) {
            return false;
        }
        n79 n79Var = (n79) obj;
        return epx.f(this.a, n79Var.a) && epx.f(this.b, n79Var.b) && epx.f(this.c, n79Var.c) && this.d == n79Var.d && this.e == n79Var.e && this.f == n79Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantPermissionsActionsFeatureState(mediaSettingMicrophone=");
        sb.append(this.a);
        sb.append(", mediaSettingVideo=");
        sb.append(this.b);
        sb.append(", watchTogether=");
        sb.append(this.c);
        sb.append(", isRecordEnabled=");
        sb.append(this.d);
        sb.append(", isScreenSharingEnabled=");
        sb.append(this.e);
        sb.append(", isShowChatHistoryEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
