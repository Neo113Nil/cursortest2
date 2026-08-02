package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class vu30 implements ir30, ol8 {
    public final jr30 b;
    public final String c;
    public final int d;
    public final AdapterEntryType e;
    public final oh30 f;
    public Msg g;
    public NestedMsg h;
    public Attach i;

    public vu30(jr30 jr30Var, String str, int i, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = str;
        this.d = i;
        this.e = adapterEntryType;
        this.f = oh30Var;
    }

    public static vu30 c(vu30 vu30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = vu30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        String str = vu30Var.c;
        int i2 = vu30Var.d;
        AdapterEntryType adapterEntryType = vu30Var.e;
        if ((i & 16) != 0) {
            oh30Var = vu30Var.f;
        }
        return new vu30(jr30Var2, str, i2, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 30);
        c.i = this.i;
        c.h = this.h;
        c.g = this.g;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 30);
        c.i = this.i;
        c.h = this.h;
        c.g = this.g;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu30)) {
            return false;
        }
        vu30 vu30Var = (vu30) obj;
        return epx.f(this.b, vu30Var.b) && epx.f(this.c, vu30Var.c) && this.d == vu30Var.d && this.e == vu30Var.e && epx.f(this.f, vu30Var.f);
    }

    public final int hashCode() {
        int c = pm0.c(this.e, shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31);
        oh30 oh30Var = this.f;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        vu30 c = c(this, null, oh30Var, 15);
        c.i = this.i;
        c.h = this.h;
        c.g = this.g;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartWallPostReplyHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", attachText=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
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
