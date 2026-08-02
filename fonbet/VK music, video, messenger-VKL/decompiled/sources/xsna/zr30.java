package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class zr30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final AdapterEntryType g;
    public final oh30 h;
    public Msg i;
    public NestedMsg j;
    public Attach k;

    public zr30(jr30 jr30Var, int i, String str, Integer num, Integer num2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = adapterEntryType;
        this.h = oh30Var;
    }

    public static zr30 c(zr30 zr30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = zr30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = zr30Var.c;
        String str = zr30Var.d;
        Integer num = zr30Var.e;
        Integer num2 = zr30Var.f;
        AdapterEntryType adapterEntryType = zr30Var.g;
        if ((i & 64) != 0) {
            oh30Var = zr30Var.h;
        }
        return new zr30(jr30Var2, i2, str, num, num2, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.h;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        zr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        zr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr30)) {
            return false;
        }
        zr30 zr30Var = (zr30) obj;
        return epx.f(this.b, zr30Var.b) && this.c == zr30Var.c && epx.f(this.d, zr30Var.d) && epx.f(this.e, zr30Var.e) && epx.f(this.f, zr30Var.f) && this.g == zr30Var.g && epx.f(this.h, zr30Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int c = pm0.c(this.g, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        oh30 oh30Var = this.h;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.g;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        zr30 c = c(this, null, oh30Var, 63);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartMarketSmallHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachTitle=");
        sb.append(this.d);
        sb.append(", rejectDrawable=");
        sb.append(this.e);
        sb.append(", rejectDrawableColor=");
        sb.append(this.f);
        sb.append(", viewType=");
        sb.append(this.g);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.h, ')');
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
