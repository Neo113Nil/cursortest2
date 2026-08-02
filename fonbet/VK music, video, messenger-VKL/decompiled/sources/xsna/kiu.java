package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.Objects;

/* compiled from: GroupCallParticipantViewModel.kt */
/* loaded from: classes7.dex */
public final class kiu {
    public CallMember a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public sew0 h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;

    public final boolean a() {
        return this.a.h;
    }

    public final boolean b() {
        return this.a.g;
    }

    public final void c(CallMember callMember) {
        if (this.a.equals(callMember)) {
            return;
        }
        this.a = callMember;
        if (!callMember.o) {
            drm0.d0(callMember.a.b, '-');
        }
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        CallMemberId callMemberId = this.a.a;
        groupCallViewModel.getClass();
        GroupCallViewModel.l.onNext(callMemberId);
    }

    public final void d(whr0 whr0Var) {
        this.b = true;
        this.l = whr0Var.q;
        this.c = whr0Var.s;
        this.d = whr0Var.t;
        this.e = whr0Var.e();
        this.f = whr0Var.u;
        this.g = whr0Var.v;
        this.h = whr0Var.b;
        this.j = whr0Var.d;
        this.i = whr0Var.c;
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        CallMemberId callMemberId = this.a.a;
        groupCallViewModel.getClass();
        GroupCallViewModel.l.onNext(callMemberId);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kiu) && epx.f(this.a.a, ((kiu) obj).a.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCallParticipantViewModel(callMember=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.c);
        sb.append("', photo='");
        sb.append(this.h);
        sb.append("', isFemale=");
        sb.append(this.i);
        sb.append(", isVerified=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
