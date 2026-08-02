package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class hu30 implements ir30 {
    public final Peer b;
    public final qtd0 c;
    public final boolean d;
    public final AdapterEntryType e;

    public hu30(Peer peer, qtd0 qtd0Var, boolean z, AdapterEntryType adapterEntryType) {
        this.b = peer;
        this.c = qtd0Var;
        this.d = z;
        this.e = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu30)) {
            return false;
        }
        hu30 hu30Var = (hu30) obj;
        return epx.f(this.b, hu30Var.b) && epx.f(this.c, hu30Var.c) && this.d == hu30Var.d && this.e == hu30Var.e;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        qtd0 qtd0Var = this.c;
        return this.e.hashCode() + qoy.b((hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31, 31, this.d);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        Peer peer = this.b;
        qtd0 Bb = profilesInfo.Bb(peer);
        return new hu30(peer, Bb, Bb != null && o25.b(o25.a()) && Bb.t1() && Bb.q9().b, this.e);
    }

    public final String toString() {
        return "MsgPartUserNameHolderItem(msgFromPeer=" + this.b + ", profileFrom=" + this.c + ", isProfileHasTeacherIndicator=" + this.d + ", viewType=" + this.e + ')';
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
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
