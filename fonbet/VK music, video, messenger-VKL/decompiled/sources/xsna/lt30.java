package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class lt30 implements ir30 {
    public final com.vk.im.engine.models.messages.a b;
    public final AdapterEntryType c;
    public Attach d;

    public lt30(com.vk.im.engine.models.messages.a aVar, AdapterEntryType adapterEntryType) {
        this.b = aVar;
        this.c = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt30)) {
            return false;
        }
        lt30 lt30Var = (lt30) obj;
        return epx.f(this.b, lt30Var.b) && this.c == lt30Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.c;
    }

    public final String toString() {
        return "MsgPartShowFullFwdMsgItem(itemHolder=" + this.b + ", viewType=" + this.c + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
