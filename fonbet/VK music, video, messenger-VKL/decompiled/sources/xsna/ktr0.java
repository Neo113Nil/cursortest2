package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class ktr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final qtd0 c;
    public final qtd0 d;
    public final Peer e;
    public final Peer f;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c g;
    public final AdapterEntryType h;
    public final long i;
    public final oh30 j;
    public MsgChatMemberKick k;

    public ktr0(boolean z, qtd0 qtd0Var, qtd0 qtd0Var2, Peer peer, Peer peer2, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = qtd0Var;
        this.d = qtd0Var2;
        this.e = peer;
        this.f = peer2;
        this.g = cVar;
        this.h = adapterEntryType;
        this.i = j;
        this.j = oh30Var;
    }

    public static ktr0 a(ktr0 ktr0Var, boolean z, qtd0 qtd0Var, qtd0 qtd0Var2, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            z = ktr0Var.b;
        }
        return new ktr0(z, (i & 2) != 0 ? ktr0Var.c : qtd0Var, (i & 4) != 0 ? ktr0Var.d : qtd0Var2, ktr0Var.e, ktr0Var.f, ktr0Var.g, ktr0Var.h, ktr0Var.i, (i & 256) != 0 ? ktr0Var.j : oh30Var);
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
        ProfilesInfo profilesInfo = uk30Var.e;
        qtd0 Bb = profilesInfo.Bb(this.f);
        ktr0 a = a(this, uk30Var.q, profilesInfo.Bb(this.e), Bb, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        a.k = this.k;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktr0)) {
            return false;
        }
        ktr0 ktr0Var = (ktr0) obj;
        return this.b == ktr0Var.b && epx.f(this.c, ktr0Var.c) && epx.f(this.d, ktr0Var.d) && epx.f(this.e, ktr0Var.e) && epx.f(this.f, ktr0Var.f) && epx.f(this.g, ktr0Var.g) && this.h == ktr0Var.h && this.i == ktr0Var.i && epx.f(this.j, ktr0Var.j);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        qtd0 qtd0Var2 = this.d;
        int hashCode3 = (hashCode2 + (qtd0Var2 == null ? 0 : qtd0Var2.hashCode())) * 31;
        Peer peer = this.e;
        int hashCode4 = (hashCode3 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31;
        Peer peer2 = this.f;
        int hashCode5 = (hashCode4 + (peer2 == null ? 0 : Long.hashCode(peer2.b))) * 31;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.g;
        int a = bh10.a(pm0.c(this.h, (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.i);
        oh30 oh30Var = this.j;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        ktr0 a = a(this, false, null, null, oh30Var, 255);
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
        StringBuilder sb = new StringBuilder("VhMsgChatMemberKickItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", msgToProfile=");
        sb.append(this.d);
        sb.append(", memberFrom=");
        sb.append(this.e);
        sb.append(", memberTo=");
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
