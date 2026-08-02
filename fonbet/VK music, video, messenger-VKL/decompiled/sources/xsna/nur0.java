package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class nur0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c b;
    public final boolean c;
    public final CharSequence d;
    public final AdapterEntryType e;
    public final long f;
    public final oh30 g;
    public MsgServiceCustom h;

    public nur0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, boolean z, CharSequence charSequence, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = cVar;
        this.c = z;
        this.d = charSequence;
        this.e = adapterEntryType;
        this.f = j;
        this.g = oh30Var;
    }

    public static nur0 a(nur0 nur0Var, boolean z, oh30 oh30Var, int i) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = nur0Var.b;
        if ((i & 2) != 0) {
            z = nur0Var.c;
        }
        boolean z2 = z;
        CharSequence charSequence = nur0Var.d;
        AdapterEntryType adapterEntryType = nur0Var.e;
        long j = nur0Var.f;
        if ((i & 32) != 0) {
            oh30Var = nur0Var.g;
        }
        return new nur0(cVar, z2, charSequence, adapterEntryType, j, oh30Var);
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
        return this.d;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        nur0 a = a(this, uk30Var.q, null, 61);
        a.h = this.h;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nur0)) {
            return false;
        }
        nur0 nur0Var = (nur0) obj;
        return epx.f(this.b, nur0Var.b) && this.c == nur0Var.c && epx.f(this.d, nur0Var.d) && this.e == nur0Var.e && this.f == nur0Var.f && epx.f(this.g, nur0Var.g);
    }

    public final int hashCode() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.b;
        int b = qoy.b((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int a = bh10.a(pm0.c(this.e, (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31, this.f);
        oh30 oh30Var = this.g;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        nur0 a = a(this, false, oh30Var, 31);
        a.h = this.h;
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
        StringBuilder sb = new StringBuilder("VhMsgServiceCustomItem(msgMeta=");
        sb.append(this.b);
        sb.append(", isBackgroundSet=");
        sb.append(this.c);
        sb.append(", valueBody=");
        sb.append((Object) this.d);
        sb.append(", viewType=");
        sb.append(this.e);
        sb.append(", dateMs=");
        sb.append(this.f);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.g, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.f;
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
