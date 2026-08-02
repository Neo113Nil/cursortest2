package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipCtaWithDonutDeps.kt */
/* loaded from: classes16.dex */
public final class dpc {
    public final UserId a;
    public final ClipInvolvementActionButton<?> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final q7v0 g;
    public final boolean h;
    public final ClipsInvolvementAttachesState.VkTicketActionState i;
    public final String j;
    public final int k;

    public dpc(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton, boolean z, boolean z2, boolean z3, boolean z4, q7v0 q7v0Var, boolean z5, ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState, String str, int i) {
        this.a = userId;
        this.b = clipInvolvementActionButton;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = q7v0Var;
        this.h = z5;
        this.i = vkTicketActionState;
        this.j = str;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpc)) {
            return false;
        }
        dpc dpcVar = (dpc) obj;
        return epx.f(this.a, dpcVar.a) && epx.f(this.b, dpcVar.b) && this.c == dpcVar.c && this.d == dpcVar.d && this.e == dpcVar.e && this.f == dpcVar.f && epx.f(this.g, dpcVar.g) && this.h == dpcVar.h && epx.f(this.i, dpcVar.i) && epx.f(this.j, dpcVar.j) && this.k == dpcVar.k;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.b;
        int b = qoy.b((this.g.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (clipInvolvementActionButton == null ? 0 : clipInvolvementActionButton.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = this.i;
        return Integer.hashCode(this.k) + urd0.a((b + (vkTicketActionState != null ? vkTicketActionState.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCtaWithDonutDeps(groupId=");
        sb.append(this.a);
        sb.append(", previouslySelectedAttachType=");
        sb.append(this.b);
        sb.append(", isMarketMessagesEnabled=");
        sb.append(this.c);
        sb.append(", isBookingEnabled=");
        sb.append(this.d);
        sb.append(", isOpenChannelEnabled=");
        sb.append(this.e);
        sb.append(", isOpenModalChannelOnboardingAvailable=");
        sb.append(this.f);
        sb.append(", onboardingClient=");
        sb.append(this.g);
        sb.append(", isDonutLevelsAvailable=");
        sb.append(this.h);
        sb.append(", vkTicket=");
        sb.append(this.i);
        sb.append(", entryPoint=");
        sb.append(this.j);
        sb.append(", sessionId=");
        return vu5.b(sb, this.k, ')');
    }
}
