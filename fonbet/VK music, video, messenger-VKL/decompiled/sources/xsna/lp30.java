package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class lp30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final ImageList e;
    public final AdapterEntryType f;
    public final oh30 g;
    public Msg h;
    public NestedMsg i;
    public Attach j;

    public lp30(jr30 jr30Var, int i, String str, ImageList imageList, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = imageList;
        this.f = adapterEntryType;
        this.g = oh30Var;
    }

    public static lp30 c(lp30 lp30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = lp30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = lp30Var.c;
        String str = lp30Var.d;
        ImageList imageList = lp30Var.e;
        AdapterEntryType adapterEntryType = lp30Var.f;
        if ((i & 32) != 0) {
            oh30Var = lp30Var.g;
        }
        return new lp30(jr30Var2, i2, str, imageList, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.g;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        lp30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 62);
        c.j = this.j;
        c.i = this.i;
        c.h = this.h;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        lp30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 62);
        c.j = this.j;
        c.i = this.i;
        c.h = this.h;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp30)) {
            return false;
        }
        lp30 lp30Var = (lp30) obj;
        return epx.f(this.b, lp30Var.b) && this.c == lp30Var.c && epx.f(this.d, lp30Var.d) && epx.f(this.e, lp30Var.e) && this.f == lp30Var.f && epx.f(this.g, lp30Var.g);
    }

    public final int hashCode() {
        int c = pm0.c(this.f, fw3.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e.b), 31);
        oh30 oh30Var = this.g;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        lp30 c = c(this, null, oh30Var, 31);
        c.j = this.j;
        c.i = this.i;
        c.h = this.h;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartCuratorHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachName=");
        sb.append(this.d);
        sb.append(", thumbList=");
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
