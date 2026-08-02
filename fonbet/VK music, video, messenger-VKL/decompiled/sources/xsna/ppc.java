package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import xsna.g0o;

/* compiled from: ClipCtaWithDonutMviState.kt */
/* loaded from: classes16.dex */
public final class ppc implements lm50 {
    public final ClipInvolvementActionButton<?> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g0o f;
    public final boolean g;
    public final boolean h;
    public final q7v0 i;
    public final ClipsInvolvementAttachesState.VkTicketActionState j;

    public ppc(ClipInvolvementActionButton<?> clipInvolvementActionButton, boolean z, boolean z2, boolean z3, g0o g0oVar, boolean z4, boolean z5, q7v0 q7v0Var, ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState) {
        this.b = clipInvolvementActionButton;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = g0oVar;
        this.g = z4;
        this.h = z5;
        this.i = q7v0Var;
        this.j = vkTicketActionState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [xsna.g0o] */
    public static ppc a(ppc ppcVar, ClipInvolvementActionButton clipInvolvementActionButton, g0o.a aVar, boolean z, int i) {
        if ((i & 1) != 0) {
            clipInvolvementActionButton = ppcVar.b;
        }
        ClipInvolvementActionButton clipInvolvementActionButton2 = clipInvolvementActionButton;
        boolean z2 = ppcVar.c;
        boolean z3 = ppcVar.d;
        boolean z4 = ppcVar.e;
        g0o.a aVar2 = aVar;
        if ((i & 16) != 0) {
            aVar2 = ppcVar.f;
        }
        g0o.a aVar3 = aVar2;
        if ((i & 32) != 0) {
            z = ppcVar.g;
        }
        boolean z5 = ppcVar.h;
        q7v0 q7v0Var = ppcVar.i;
        ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = ppcVar.j;
        ppcVar.getClass();
        return new ppc(clipInvolvementActionButton2, z2, z3, z4, aVar3, z, z5, q7v0Var, vkTicketActionState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppc)) {
            return false;
        }
        ppc ppcVar = (ppc) obj;
        return epx.f(this.b, ppcVar.b) && this.c == ppcVar.c && this.d == ppcVar.d && this.e == ppcVar.e && epx.f(this.f, ppcVar.f) && this.g == ppcVar.g && this.h == ppcVar.h && epx.f(this.i, ppcVar.i) && epx.f(this.j, ppcVar.j);
    }

    public final int hashCode() {
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.b;
        int hashCode = (this.i.hashCode() + qoy.b(qoy.b((this.f.hashCode() + qoy.b(qoy.b(qoy.b((clipInvolvementActionButton == null ? 0 : clipInvolvementActionButton.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h)) * 31;
        ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = this.j;
        return hashCode + (vkTicketActionState != null ? vkTicketActionState.hashCode() : 0);
    }

    public final String toString() {
        return "ClipCtaWithDonutMviState(selected=" + this.b + ", isMarketMessagesEnabled=" + this.c + ", isBookingEnabled=" + this.d + ", isOpenChannelEnabled=" + this.e + ", donutLevels=" + this.f + ", doneButtonEnabled=" + this.g + ", isOpenModalChannelOnboardingAvailable=" + this.h + ", onboardingClient=" + this.i + ", vkTicket=" + this.j + ')';
    }
}
