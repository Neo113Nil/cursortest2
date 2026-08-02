package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class atr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c b;
    public final boolean c;
    public final AdapterEntryType d;
    public final long e;
    public final oh30 f;
    public Msg g;

    public atr0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, boolean z, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = cVar;
        this.c = z;
        this.d = adapterEntryType;
        this.e = j;
        this.f = oh30Var;
    }

    public static atr0 a(atr0 atr0Var, boolean z, oh30 oh30Var, int i) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = atr0Var.b;
        if ((i & 2) != 0) {
            z = atr0Var.c;
        }
        boolean z2 = z;
        AdapterEntryType adapterEntryType = atr0Var.d;
        long j = atr0Var.e;
        if ((i & 16) != 0) {
            oh30Var = atr0Var.f;
        }
        return new atr0(cVar, z2, adapterEntryType, j, oh30Var);
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
        return this.b;
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
        return this.f;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        atr0 a = a(this, uk30Var.q, null, 29);
        a.g = this.g;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atr0)) {
            return false;
        }
        atr0 atr0Var = (atr0) obj;
        return epx.f(this.b, atr0Var.b) && this.c == atr0Var.c && this.d == atr0Var.d && this.e == atr0Var.e && epx.f(this.f, atr0Var.f);
    }

    public final int hashCode() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.b;
        int a = bh10.a(pm0.c(this.d, qoy.b((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.c), 31), 31, this.e);
        oh30 oh30Var = this.f;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.d;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        atr0 a = a(this, false, oh30Var, 15);
        a.g = this.g;
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
        StringBuilder sb = new StringBuilder("VhMsgChatDonKickItem(msgMeta=");
        sb.append(this.b);
        sb.append(", isBackgroundSet=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.d);
        sb.append(", dateMs=");
        sb.append(this.e);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.f, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.e;
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
