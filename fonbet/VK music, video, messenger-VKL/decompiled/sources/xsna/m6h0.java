package xsna;

import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;

/* compiled from: ScheduledCallSettings.kt */
/* loaded from: classes7.dex */
public final class m6h0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ScheduledAudioMuteOption d;
    public final ScheduledVideoMuteOption e;
    public final ScheduledWatchTogetherOption f;
    public final ScheduledScreenSharingMuteOption g;
    public final boolean h;
    public final boolean i;

    public m6h0(boolean z, boolean z2, boolean z3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = scheduledAudioMuteOption;
        this.e = scheduledVideoMuteOption;
        this.f = scheduledWatchTogetherOption;
        this.g = scheduledScreenSharingMuteOption;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6h0)) {
            return false;
        }
        m6h0 m6h0Var = (m6h0) obj;
        return this.a == m6h0Var.a && this.b == m6h0Var.b && this.c == m6h0Var.c && this.d == m6h0Var.d && this.e == m6h0Var.e && epx.f(this.f, m6h0Var.f) && this.g == m6h0Var.g && this.h == m6h0Var.h && this.i == m6h0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledCallSettings(isWaitingHallEnabled=");
        sb.append(this.a);
        sb.append(", isAnonymousJoinEnabled=");
        sb.append(this.b);
        sb.append(", isFeedbackEnabled=");
        sb.append(this.c);
        sb.append(", audioMuteOption=");
        sb.append(this.d);
        sb.append(", videoMuteOption=");
        sb.append(this.e);
        sb.append(", isWatchTogetherOption=");
        sb.append(this.f);
        sb.append(", screenSharingMuteOption=");
        sb.append(this.g);
        sb.append(", onlyAdminCanRecord=");
        sb.append(this.h);
        sb.append(", shouldShowChatHistory=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
