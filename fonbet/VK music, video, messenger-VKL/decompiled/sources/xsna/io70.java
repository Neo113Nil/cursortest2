package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: OKVoipCallInfoManager.kt */
/* loaded from: classes7.dex */
public final class io70 {
    public final k490 a;
    public final viu b;
    public final vrj c;
    public final OKVoipEngine.f d;

    public io70(k490 k490Var, l63 l63Var, viu viuVar, vrj vrjVar, OKVoipEngine.f fVar) {
        this.a = k490Var;
        this.b = viuVar;
        this.c = vrjVar;
        this.d = fVar;
    }

    public final xdw0 a() {
        dhw0 dhw0Var = OKVoipEngine.B;
        if (dhw0Var != null) {
            return dhw0Var.A;
        }
        return null;
    }

    public final CallMemberId b() {
        dhw0 dhw0Var = OKVoipEngine.B;
        if (dhw0Var == null) {
            return null;
        }
        UserId userId = dhw0Var.M;
        return fkq0.c(userId) ? new CallMemberId(String.valueOf(userId.b), 0) : dhw0Var.r() ? new CallMemberId(dhw0Var.A.a, 0) : this.a.a();
    }

    public final boolean c(CallMemberId callMemberId) {
        Conversation conversation;
        if (callMemberId == null || (conversation = this.c.getConversation()) == null) {
            return false;
        }
        return conversation.isParticipantAdmin(callMemberId.b);
    }

    public final boolean d(CallMemberId callMemberId) {
        Conversation conversation;
        if (callMemberId == null || (conversation = this.c.getConversation()) == null) {
            return false;
        }
        return conversation.isParticipantCreator(callMemberId.b);
    }

    public final boolean e() {
        dhw0 dhw0Var = OKVoipEngine.B;
        return dhw0Var != null && dhw0Var.r();
    }

    public final boolean f() {
        dhw0 dhw0Var = OKVoipEngine.B;
        return (dhw0Var == null || dhw0Var.r()) ? false : true;
    }

    public final void g(String str) {
        this.d.invoke(new pw(19, this, str));
    }
}
