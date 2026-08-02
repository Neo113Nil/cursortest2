package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class hur0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final qtd0 c;
    public final Peer d;
    public final boolean e;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c f;
    public final AdapterEntryType g;
    public final long h;
    public final oh30 i;
    public MsgScreenshot j;

    public hur0(long j, Peer peer, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, oh30 oh30Var, qtd0 qtd0Var, boolean z, boolean z2) {
        this.b = z;
        this.c = qtd0Var;
        this.d = peer;
        this.e = z2;
        this.f = cVar;
        this.g = adapterEntryType;
        this.h = j;
        this.i = oh30Var;
    }

    public static hur0 a(hur0 hur0Var, boolean z, qtd0 qtd0Var, boolean z2, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            z = hur0Var.b;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            qtd0Var = hur0Var.c;
        }
        qtd0 qtd0Var2 = qtd0Var;
        Peer peer = hur0Var.d;
        if ((i & 8) != 0) {
            z2 = hur0Var.e;
        }
        boolean z4 = z2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = hur0Var.f;
        AdapterEntryType adapterEntryType = hur0Var.g;
        long j = hur0Var.h;
        if ((i & 128) != 0) {
            oh30Var = hur0Var.i;
        }
        return new hur0(j, peer, cVar, adapterEntryType, oh30Var, qtd0Var2, z3, z4);
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
        return this.f;
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
        return this.i;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        hur0 a = a(this, uk30Var.q, uk30Var.e.Bb(this.d), uk30Var.t, null, 244);
        a.j = this.j;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hur0)) {
            return false;
        }
        hur0 hur0Var = (hur0) obj;
        return this.b == hur0Var.b && epx.f(this.c, hur0Var.c) && epx.f(this.d, hur0Var.d) && this.e == hur0Var.e && epx.f(this.f, hur0Var.f) && this.g == hur0Var.g && this.h == hur0Var.h && epx.f(this.i, hur0Var.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.d;
        int b = qoy.b((hashCode2 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.e);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.f;
        int a = bh10.a(pm0.c(this.g, (b + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.h);
        oh30 oh30Var = this.i;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        hur0 a = a(this, false, null, false, oh30Var, 127);
        a.j = this.j;
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
        StringBuilder sb = new StringBuilder("VhMsgScreenshotItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", memberFrom=");
        sb.append(this.d);
        sb.append(", isChannel=");
        sb.append(this.e);
        sb.append(", msgMeta=");
        sb.append(this.f);
        sb.append(", viewType=");
        sb.append(this.g);
        sb.append(", dateMs=");
        sb.append(this.h);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.i, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.h;
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
