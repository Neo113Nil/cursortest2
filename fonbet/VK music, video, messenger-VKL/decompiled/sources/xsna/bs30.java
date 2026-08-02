package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class bs30 implements ir30 {
    public final Msg b;
    public final wp10 c;
    public final NestedMsg d;
    public final AdapterEntryType e;
    public final rxd0 f;

    public bs30(Msg msg, wp10 wp10Var, NestedMsg nestedMsg, AdapterEntryType adapterEntryType, rxd0 rxd0Var) {
        this.b = msg;
        this.c = wp10Var;
        this.d = nestedMsg;
        this.e = adapterEntryType;
        this.f = rxd0Var;
    }

    public static bs30 c(bs30 bs30Var, wp10 wp10Var) {
        return new bs30(bs30Var.b, wp10Var, bs30Var.d, bs30Var.e, bs30Var.f);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.c.a();
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, this.c.b(uk30Var, nsr0Var, gVar, gVar2));
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, this.c.d(uk30Var, nsr0Var, gVar, gVar2));
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return c(this, this.c.R0(bool));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs30)) {
            return false;
        }
        bs30 bs30Var = (bs30) obj;
        return epx.f(this.b, bs30Var.b) && epx.f(this.c, bs30Var.c) && epx.f(this.d, bs30Var.d) && this.e == bs30Var.e && epx.f(this.f, bs30Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        NestedMsg nestedMsg = this.d;
        int c = pm0.c(this.e, (hashCode + (nestedMsg == null ? 0 : nestedMsg.hashCode())) * 31, 31);
        rxd0 rxd0Var = this.f;
        return c + (rxd0Var != null ? rxd0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, this.c.n(oh30Var));
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return c(this, this.c.d0(profilesInfo));
    }

    public final String toString() {
        return "MsgPartMediaHolderItem(msg=" + this.b + ", mediaBindArgs=" + this.c + ", nestedMsg=" + this.d + ", viewType=" + this.e + ", profileMediators=" + this.f + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }
}
