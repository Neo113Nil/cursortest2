package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ehs0;

/* compiled from: GroupCallGridViewPager.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ohu implements ehs0.a, g0t {
    public final /* synthetic */ GroupCallViewModel b;

    public ohu(GroupCallViewModel groupCallViewModel) {
        this.b = groupCallViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ehs0.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, GroupCallViewModel.class, "findByMemberId", "findByMemberId(Lcom/vk/voip/dto/call_member/CallMemberId;)Lcom/vk/voip/ui/groupcalls/GroupCallParticipantViewModel;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
