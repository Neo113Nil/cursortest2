package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class sq30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final AdapterEntryType d;
    public final oh30 e;
    public Attach f;

    public sq30(jr30 jr30Var, int i, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = adapterEntryType;
        this.e = oh30Var;
    }

    public static sq30 c(sq30 sq30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = sq30Var.b;
        }
        int i2 = sq30Var.c;
        AdapterEntryType adapterEntryType = sq30Var.d;
        if ((i & 8) != 0) {
            oh30Var = sq30Var.e;
        }
        return new sq30(jr30Var, i2, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.e;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        sq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 14);
        c.f = this.f;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        sq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 14);
        c.f = this.f;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq30)) {
            return false;
        }
        sq30 sq30Var = (sq30) obj;
        return epx.f(this.b, sq30Var.b) && this.c == sq30Var.c && this.d == sq30Var.d && epx.f(this.e, sq30Var.e);
    }

    public final int hashCode() {
        int c = pm0.c(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
        oh30 oh30Var = this.e;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.d;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        sq30 c = c(this, null, oh30Var, 7);
        c.f = this.f;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartFwdTimeHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.d);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.e, ')');
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
