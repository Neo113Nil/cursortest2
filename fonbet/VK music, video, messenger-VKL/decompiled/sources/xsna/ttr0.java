package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatTitleUpdate;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class ttr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final qtd0 c;
    public final Peer d;
    public final boolean e;
    public final String f;
    public final String g;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c h;
    public final AdapterEntryType i;
    public final long j;
    public final oh30 k;
    public MsgChatTitleUpdate l;

    public ttr0(boolean z, qtd0 qtd0Var, Peer peer, boolean z2, String str, String str2, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = qtd0Var;
        this.d = peer;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = cVar;
        this.i = adapterEntryType;
        this.j = j;
        this.k = oh30Var;
    }

    public static ttr0 a(ttr0 ttr0Var, boolean z, qtd0 qtd0Var, boolean z2, oh30 oh30Var, int i) {
        return new ttr0((i & 1) != 0 ? ttr0Var.b : z, (i & 2) != 0 ? ttr0Var.c : qtd0Var, ttr0Var.d, (i & 8) != 0 ? ttr0Var.e : z2, ttr0Var.f, ttr0Var.g, ttr0Var.h, ttr0Var.i, ttr0Var.j, (i & 512) != 0 ? ttr0Var.k : oh30Var);
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
        return this.h;
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
        return this.k;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.l;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        ttr0 a = a(this, uk30Var.q, uk30Var.e.Bb(this.d), uk30Var.t, null, 1012);
        a.l = this.l;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttr0)) {
            return false;
        }
        ttr0 ttr0Var = (ttr0) obj;
        return this.b == ttr0Var.b && epx.f(this.c, ttr0Var.c) && epx.f(this.d, ttr0Var.d) && this.e == ttr0Var.e && epx.f(this.f, ttr0Var.f) && epx.f(this.g, ttr0Var.g) && epx.f(this.h, ttr0Var.h) && this.i == ttr0Var.i && this.j == ttr0Var.j && epx.f(this.k, ttr0Var.k);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.d;
        int a = urd0.a(qoy.b((hashCode2 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode3 = (a + (str == null ? 0 : str.hashCode())) * 31;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.h;
        int a2 = bh10.a(pm0.c(this.i, (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.j);
        oh30 oh30Var = this.k;
        return a2 + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        ttr0 a = a(this, false, null, false, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        a.l = this.l;
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
        StringBuilder sb = new StringBuilder("VhMsgChatTitleUpdateItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", memberFrom=");
        sb.append(this.d);
        sb.append(", isChannel=");
        sb.append(this.e);
        sb.append(", chatTitle=");
        sb.append(this.f);
        sb.append(", oldTitle=");
        sb.append(this.g);
        sb.append(", msgMeta=");
        sb.append(this.h);
        sb.append(", viewType=");
        sb.append(this.i);
        sb.append(", dateMs=");
        sb.append(this.j);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.k, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.j;
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
