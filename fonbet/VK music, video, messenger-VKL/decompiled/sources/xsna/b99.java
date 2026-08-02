package xsna;

import com.vk.voip.ui.imcalls.model.AudioMuteOption;
import com.vk.voip.ui.imcalls.model.SreenshareMuteOption;
import com.vk.voip.ui.imcalls.model.VideoMuteOption;

/* compiled from: CallSettings.kt */
/* loaded from: classes7.dex */
public final class b99 {
    public final boolean a;
    public final AudioMuteOption b;
    public final VideoMuteOption c;
    public final boolean d;
    public final boolean e;
    public final SreenshareMuteOption f;
    public final Boolean g;

    public b99(boolean z, AudioMuteOption audioMuteOption, VideoMuteOption videoMuteOption, boolean z2, boolean z3, SreenshareMuteOption sreenshareMuteOption, Boolean bool) {
        this.a = z;
        this.b = audioMuteOption;
        this.c = videoMuteOption;
        this.d = z2;
        this.e = z3;
        this.f = sreenshareMuteOption;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b99)) {
            return false;
        }
        b99 b99Var = (b99) obj;
        b99Var.getClass();
        return this.a == b99Var.a && this.b == b99Var.b && this.c == b99Var.c && this.d == b99Var.d && this.e == b99Var.e && this.f == b99Var.f && this.g.equals(b99Var.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, false), 31, this.d), 31, false), 31, false), 31, this.e);
        SreenshareMuteOption sreenshareMuteOption = this.f;
        return (this.g.hashCode() + ((b + (sreenshareMuteOption != null ? sreenshareMuteOption.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallSettings(groupId=null, feedback=");
        sb.append(this.a);
        sb.append(", muteAudio=");
        sb.append(this.b);
        sb.append(", muteVideo=");
        sb.append(this.c);
        sb.append(", onlyAdminCanShareMovie=false, onlyAuthUsers=");
        sb.append(this.d);
        sb.append(", skipNotification=false, waitingHall=false, shouldShowChatHistory=");
        sb.append(this.e);
        sb.append(", muteScreenSharing=");
        sb.append(this.f);
        sb.append(", onlyAdminCanRecord=");
        return xq.d(sb, this.g, ", onlyAdminCanStartAsr=null)");
    }
}
