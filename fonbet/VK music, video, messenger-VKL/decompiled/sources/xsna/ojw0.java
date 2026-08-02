package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import xsna.gy50;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final class ojw0 implements OKVoipEngine.e {
    public final /* synthetic */ mjw0 a;

    public ojw0(mjw0 mjw0Var) {
        this.a = mjw0Var;
    }

    @Override // com.vk.voip.OKVoipEngine.e
    public final void a() {
        GroupCallViewModel.b.getClass();
        liu liuVar = GroupCallViewModel.r;
        if (liuVar.e != null) {
            liuVar.e = null;
            liuVar.f = null;
            liuVar.d = null;
            liuVar.c = null;
            liuVar.a();
        }
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.D0();
    }

    @Override // com.vk.voip.OKVoipEngine.e
    public final void b(CallMemberId callMemberId, boolean z, boolean z2) {
        GroupCallViewModel.b.getClass();
        liu liuVar = GroupCallViewModel.r;
        if (epx.f(liuVar.e, callMemberId)) {
            return;
        }
        if (!callMemberId.equals(liuVar.e)) {
            liuVar.e = callMemberId;
            liuVar.f = callMemberId;
            liuVar.d = null;
            liuVar.c = null;
            liuVar.a();
        }
        GroupCallViewModel.p(GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        if (z2) {
            mjw0 mjw0Var = this.a;
            if (z) {
                com.vk.voip.ui.c.b.getClass();
                if (!com.vk.voip.ui.c.v) {
                    mjw0Var.S0.a(gy50.n.a);
                    return;
                }
            }
            mjw0Var.W.f(callMemberId, z);
        }
    }
}
