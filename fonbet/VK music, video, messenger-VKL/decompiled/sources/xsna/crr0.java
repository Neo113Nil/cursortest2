package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class crr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, e7i0 {
    public final List<Integer> b;
    public final int c;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c d;
    public final AdapterEntryType e;
    public final long f;
    public final oh30 g;
    public final abi0 h;
    public Msg i;

    public crr0(List list, int i, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var, abi0 abi0Var) {
        this.b = list;
        this.c = i;
        this.d = cVar;
        this.e = adapterEntryType;
        this.f = j;
        this.g = oh30Var;
        this.h = abi0Var;
    }

    public static crr0 a(crr0 crr0Var, List list, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            list = crr0Var.b;
        }
        List list2 = list;
        int i2 = crr0Var.c;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = crr0Var.d;
        AdapterEntryType adapterEntryType = crr0Var.e;
        long j = crr0Var.f;
        if ((i & 128) != 0) {
            oh30Var = crr0Var.g;
        }
        return new crr0(list2, i2, cVar, adapterEntryType, j, oh30Var, crr0Var.h);
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
        return this.d;
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
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crr0)) {
            return false;
        }
        crr0 crr0Var = (crr0) obj;
        return epx.f(this.b, crr0Var.b) && this.c == crr0Var.c && this.d.equals(crr0Var.d) && this.e == crr0Var.e && this.f == crr0Var.f && epx.f(this.g, crr0Var.g) && epx.f(this.h, crr0Var.h);
    }

    public final int hashCode() {
        int a = bh10.a(pm0.c(this.e, (this.d.hashCode() + qoy.b(qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, false), 31, false)) * 31, 31), 31, this.f);
        oh30 oh30Var = this.g;
        int hashCode = (a + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31;
        abi0 abi0Var = this.h;
        return hashCode + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        crr0 a = a(this, null, oh30Var, 383);
        a.i = this.i;
        return a;
    }

    @Override // xsna.e7i0
    public final boolean p() {
        abi0 abi0Var = this.h;
        if (abi0Var == null) {
            return false;
        }
        Msg msg = this.i;
        return abi0Var.d(msg != null ? Integer.valueOf(msg.b) : null);
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
        return "VhDisappearedMsgItem(msgIdsBunch=" + this.b + ", msgLocalId=" + this.c + ", isSelectedOld=false, isSelectionModeOld=false, msgMeta=" + this.d + ", viewType=" + this.e + ", dateMs=" + this.f + ", bubbleStyle=" + this.g + ", selectedMessagesMediator=" + this.h + ')';
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
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        return this;
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
