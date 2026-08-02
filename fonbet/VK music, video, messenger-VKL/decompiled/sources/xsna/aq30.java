package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class aq30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final int d;
    public final AdapterEntryType e;
    public final oh30 f;

    public aq30(jr30 jr30Var, int i, int i2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = i2;
        this.e = adapterEntryType;
        this.f = oh30Var;
    }

    public static aq30 c(aq30 aq30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = aq30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = aq30Var.c;
        int i3 = aq30Var.d;
        AdapterEntryType adapterEntryType = aq30Var.e;
        if ((i & 16) != 0) {
            oh30Var = aq30Var.f;
        }
        return new aq30(jr30Var2, i2, i3, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 30);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq30)) {
            return false;
        }
        aq30 aq30Var = (aq30) obj;
        return epx.f(this.b, aq30Var.b) && this.c == aq30Var.c && this.d == aq30Var.d && this.e == aq30Var.e && epx.f(this.f, aq30Var.f);
    }

    public final int hashCode() {
        int c = pm0.c(this.e, shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31);
        oh30 oh30Var = this.f;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, null, oh30Var, 15);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartEmptyHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", viewType=");
        sb.append(this.e);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.f, ')');
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
