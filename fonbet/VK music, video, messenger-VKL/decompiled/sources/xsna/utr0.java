package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class utr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g {
    public final AdapterEntryType b;
    public final int c;
    public final boolean d;
    public final long e;
    public final oh30 f;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c g;
    public Msg h;

    public utr0(AdapterEntryType adapterEntryType, int i, boolean z, long j, oh30 oh30Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar) {
        this.b = adapterEntryType;
        this.c = i;
        this.d = z;
        this.e = j;
        this.f = oh30Var;
        this.g = cVar;
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
        return this.d;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.h;
    }

    public final boolean a(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = E0();
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = gVar != null ? gVar.E0() : null;
        if (E0 != null && E02 != null) {
            boolean f = epx.f(E0.j, E02.j);
            boolean z = Math.abs(E0.h - E02.h) < xh30.a;
            if (f && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utr0)) {
            return false;
        }
        utr0 utr0Var = (utr0) obj;
        return this.b == utr0Var.b && this.c == utr0Var.c && this.d == utr0Var.d && this.e == utr0Var.e && epx.f(this.f, utr0Var.f) && epx.f(this.g, utr0Var.g);
    }

    public final int hashCode() {
        int a = bh10.a(qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        oh30 oh30Var = this.f;
        int hashCode = (a + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.g;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.b;
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
        return this.c;
    }

    public final String toString() {
        return "VhMsgContentBoundsMetaData(viewType=" + this.b + ", valueNestedLevel=" + this.c + ", hasLargeEmojis=" + this.d + ", dateMs=" + this.e + ", bubbleStyle=" + this.f + ", msgMeta=" + this.g + ')';
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
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
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
