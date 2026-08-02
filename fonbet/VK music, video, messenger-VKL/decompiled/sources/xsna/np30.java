package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class np30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final int d;
    public final AttachDeleted e;
    public final AdapterEntryType f;
    public final oh30 g;

    public np30(jr30 jr30Var, int i, int i2, AttachDeleted attachDeleted, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = i2;
        this.e = attachDeleted;
        this.f = adapterEntryType;
        this.g = oh30Var;
    }

    public static np30 c(np30 np30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = np30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = np30Var.c;
        int i3 = np30Var.d;
        AttachDeleted attachDeleted = np30Var.e;
        AdapterEntryType adapterEntryType = np30Var.f;
        if ((i & 32) != 0) {
            oh30Var = np30Var.g;
        }
        return new np30(jr30Var2, i2, i3, attachDeleted, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.g;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 62);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np30)) {
            return false;
        }
        np30 np30Var = (np30) obj;
        return epx.f(this.b, np30Var.b) && this.c == np30Var.c && this.d == np30Var.d && epx.f(this.e, np30Var.e) && this.f == np30Var.f && epx.f(this.g, np30Var.g);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
        AttachDeleted attachDeleted = this.e;
        int c = pm0.c(this.f, (a + (attachDeleted == null ? 0 : attachDeleted.hashCode())) * 31, 31);
        oh30 oh30Var = this.g;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, null, oh30Var, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartDeletedHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachListSize=");
        sb.append(this.d);
        sb.append(", attachDeleted=");
        sb.append(this.e);
        sb.append(", viewType=");
        sb.append(this.f);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.g, ')');
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
