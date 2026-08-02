package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class yu30 implements ir30 {
    public final CharSequence b;
    public final int c;
    public final AdapterEntryType d;
    public final abi0 e;
    public final jr30 f;
    public Attach g;

    public yu30(CharSequence charSequence, int i, AdapterEntryType adapterEntryType, abi0 abi0Var, jr30 jr30Var) {
        this.b = charSequence;
        this.c = i;
        this.d = adapterEntryType;
        this.e = abi0Var;
        this.f = jr30Var;
    }

    public static yu30 c(yu30 yu30Var, jr30 jr30Var) {
        return new yu30(yu30Var.b, yu30Var.c, yu30Var.d, yu30Var.e, jr30Var);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.g;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        yu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.g = this.g;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        yu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.g = this.g;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu30)) {
            return false;
        }
        yu30 yu30Var = (yu30) obj;
        return this.b.equals(yu30Var.b) && this.c == yu30Var.c && this.d == yu30Var.d && epx.f(this.e, yu30Var.e) && this.f.equals(yu30Var.f);
    }

    public final int hashCode() {
        int c = pm0.c(this.d, shy.a(this.c, qoy.b(qoy.b(this.b.hashCode() * 31, 31, false), 31, false), 31), 31);
        abi0 abi0Var = this.e;
        return this.f.hashCode() + ((c + (abi0Var != null ? abi0Var.hashCode() : 0)) * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.d;
    }

    public final String toString() {
        return "MsgPartWallPostTextHolderItem(body=" + ((Object) this.b) + ", isSelectedOld=false, isSelectionModeOld=false, msgLocalId=" + this.c + ", viewType=" + this.d + ", selectedMessagesMediator=" + this.e + ", timeStatus=" + this.f + ')';
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
}
