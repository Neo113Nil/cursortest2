package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class tu30 implements ir30 {
    public final String b;
    public final int c;
    public final AdapterEntryType d;
    public final jr30 e;
    public Attach f;

    public tu30(String str, int i, AdapterEntryType adapterEntryType, jr30 jr30Var) {
        this.b = str;
        this.c = i;
        this.d = adapterEntryType;
        this.e = jr30Var;
    }

    public static tu30 c(tu30 tu30Var, jr30 jr30Var) {
        return new tu30(tu30Var.b, tu30Var.c, tu30Var.d, jr30Var);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        tu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.f = this.f;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        tu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar));
        c.f = this.f;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu30)) {
            return false;
        }
        tu30 tu30Var = (tu30) obj;
        return epx.f(this.b, tu30Var.b) && this.c == tu30Var.c && this.d == tu30Var.d && epx.f(this.e, tu30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + pm0.c(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.d;
    }

    public final String toString() {
        return "MsgPartWallPostPlaceholderHolderItem(textPlaceholder=" + this.b + ", iconPlaceholder=" + this.c + ", viewType=" + this.d + ", timeStatus=" + this.e + ')';
    }

    public /* synthetic */ tu30(String str, int i, AdapterEntryType adapterEntryType) {
        this(str, i, adapterEntryType, new jr30(0));
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
