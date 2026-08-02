package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatCreate;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class ysr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final qtd0 c;
    public final Peer d;
    public final boolean e;
    public final String f;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c g;
    public final AdapterEntryType h;
    public final long i;
    public final oh30 j;
    public MsgChatCreate k;

    public ysr0(boolean z, qtd0 qtd0Var, Peer peer, boolean z2, String str, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = qtd0Var;
        this.d = peer;
        this.e = z2;
        this.f = str;
        this.g = cVar;
        this.h = adapterEntryType;
        this.i = j;
        this.j = oh30Var;
    }

    public static ysr0 a(ysr0 ysr0Var, boolean z, qtd0 qtd0Var, boolean z2, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            z = ysr0Var.b;
        }
        return new ysr0(z, (i & 2) != 0 ? ysr0Var.c : qtd0Var, ysr0Var.d, (i & 8) != 0 ? ysr0Var.e : z2, ysr0Var.f, ysr0Var.g, ysr0Var.h, ysr0Var.i, (i & 256) != 0 ? ysr0Var.j : oh30Var);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.k;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        ysr0 a = a(this, uk30Var.q, uk30Var.e.Bb(this.d), uk30Var.t, null, 500);
        a.k = this.k;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysr0)) {
            return false;
        }
        ysr0 ysr0Var = (ysr0) obj;
        return this.b == ysr0Var.b && epx.f(this.c, ysr0Var.c) && epx.f(this.d, ysr0Var.d) && this.e == ysr0Var.e && epx.f(this.f, ysr0Var.f) && epx.f(this.g, ysr0Var.g) && this.h == ysr0Var.h && this.i == ysr0Var.i && epx.f(this.j, ysr0Var.j);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.d;
        int a = urd0.a(qoy.b((hashCode2 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.e), 31, this.f);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.g;
        int a2 = bh10.a(pm0.c(this.h, (a + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.i);
        oh30 oh30Var = this.j;
        return a2 + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        ysr0 a = a(this, false, null, false, oh30Var, 255);
        a.k = this.k;
        return a;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VhMsgChatCreateItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", memberFrom=");
        sb.append(this.d);
        sb.append(", isChannel=");
        sb.append(this.e);
        sb.append(", chatTitle=");
        sb.append(this.f);
        sb.append(", msgMeta=");
        sb.append(this.g);
        sb.append(", viewType=");
        sb.append(this.h);
        sb.append(", dateMs=");
        sb.append(this.i);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.j, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.i;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g u(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g B0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g H(Boolean bool, Boolean bool2, Integer num) {
        return this;
    }
}
