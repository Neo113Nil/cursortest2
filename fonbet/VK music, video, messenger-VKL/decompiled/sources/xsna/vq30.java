package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class vq30 implements ir30 {
    public final AdapterEntryType b;
    public final int c;
    public final CharSequence d;
    public final CharSequence e;
    public final abi0 f;
    public Attach g;

    public vq30(AdapterEntryType adapterEntryType, int i, CharSequence charSequence, CharSequence charSequence2, abi0 abi0Var) {
        this.b = adapterEntryType;
        this.c = i;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = abi0Var;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq30)) {
            return false;
        }
        vq30 vq30Var = (vq30) obj;
        return this.b == vq30Var.b && this.c == vq30Var.c && epx.f(this.d, vq30Var.d) && epx.f(this.e, vq30Var.e) && epx.f(this.f, vq30Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(u11.c(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, false), 31, false);
        CharSequence charSequence = this.e;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        abi0 abi0Var = this.f;
        return hashCode + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.b;
    }

    public final String toString() {
        return "MsgPartFwdWallPostTextHolderItem(viewType=" + this.b + ", msgLocalId=" + this.c + ", wallPostText=" + ((Object) this.d) + ", isSelectedOld=false, isSelectionModeOld=false, attachesDescription=" + ((Object) this.e) + ", selectedMessagesMediator=" + this.f + ')';
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
