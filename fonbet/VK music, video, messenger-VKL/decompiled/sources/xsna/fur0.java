package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class fur0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final qtd0 c;
    public final Peer d;
    public final Peer e;
    public final MsgPin f;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c g;
    public final AdapterEntryType h;
    public final long i;
    public final oh30 j;
    public MsgPin k;

    public fur0(boolean z, qtd0 qtd0Var, Peer peer, Peer peer2, MsgPin msgPin, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = qtd0Var;
        this.d = peer;
        this.e = peer2;
        this.f = msgPin;
        this.g = cVar;
        this.h = adapterEntryType;
        this.i = j;
        this.j = oh30Var;
    }

    public static fur0 a(fur0 fur0Var, boolean z, qtd0 qtd0Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            z = fur0Var.b;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            qtd0Var = fur0Var.c;
        }
        qtd0 qtd0Var2 = qtd0Var;
        Peer peer = fur0Var.d;
        Peer peer2 = fur0Var.e;
        MsgPin msgPin = fur0Var.f;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fur0Var.g;
        AdapterEntryType adapterEntryType = fur0Var.h;
        long j = fur0Var.i;
        if ((i & 256) != 0) {
            oh30Var = fur0Var.j;
        }
        return new fur0(z2, qtd0Var2, peer, peer2, msgPin, cVar, adapterEntryType, j, oh30Var);
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
        fur0 a = a(this, uk30Var.q, uk30Var.e.Bb(this.d), null, IronSourceError.ERROR_CODE_INIT_FAILED);
        a.k = this.k;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fur0)) {
            return false;
        }
        fur0 fur0Var = (fur0) obj;
        return this.b == fur0Var.b && epx.f(this.c, fur0Var.c) && epx.f(this.d, fur0Var.d) && epx.f(this.e, fur0Var.e) && epx.f(this.f, fur0Var.f) && epx.f(this.g, fur0Var.g) && this.h == fur0Var.h && this.i == fur0Var.i && epx.f(this.j, fur0Var.j);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.d;
        int hashCode3 = (this.f.hashCode() + bh10.a((hashCode2 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.e.b)) * 31;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.g;
        int a = bh10.a(pm0.c(this.h, (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.i);
        oh30 oh30Var = this.j;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        fur0 a = a(this, false, null, oh30Var, 255);
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
        StringBuilder sb = new StringBuilder("VhMsgPinItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", memberFrom=");
        sb.append(this.d);
        sb.append(", currentMember=");
        sb.append(this.e);
        sb.append(", pinMsg=");
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
