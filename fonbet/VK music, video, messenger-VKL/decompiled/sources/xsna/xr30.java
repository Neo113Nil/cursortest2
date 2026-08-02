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
public final class xr30 implements ir30, ol8 {
    public final jr30 b;
    public final w530 c;
    public final int d;
    public final c530 e;
    public final ImageList f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final AdapterEntryType l;
    public final oh30 m;
    public Msg n;
    public NestedMsg o;
    public Attach p;

    public xr30(jr30 jr30Var, w530 w530Var, int i, c530 c530Var, ImageList imageList, String str, String str2, String str3, Integer num, Integer num2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = w530Var;
        this.d = i;
        this.e = c530Var;
        this.f = imageList;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = num;
        this.k = num2;
        this.l = adapterEntryType;
        this.m = oh30Var;
    }

    public static xr30 c(xr30 xr30Var, jr30 jr30Var, w530 w530Var, oh30 oh30Var, int i) {
        return new xr30((i & 1) != 0 ? xr30Var.b : jr30Var, (i & 2) != 0 ? xr30Var.c : w530Var, xr30Var.d, xr30Var.e, xr30Var.f, xr30Var.g, xr30Var.h, xr30Var.i, xr30Var.j, xr30Var.k, xr30Var.l, (i & 2048) != 0 ? xr30Var.m : oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.m;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        xr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.N, null, 4092);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        xr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 4094);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr30)) {
            return false;
        }
        xr30 xr30Var = (xr30) obj;
        return epx.f(this.b, xr30Var.b) && epx.f(this.c, xr30Var.c) && this.d == xr30Var.d && epx.f(this.e, xr30Var.e) && epx.f(this.f, xr30Var.f) && epx.f(this.g, xr30Var.g) && epx.f(this.h, xr30Var.h) && epx.f(this.i, xr30Var.i) && epx.f(this.j, xr30Var.j) && epx.f(this.k, xr30Var.k) && this.l == xr30Var.l && epx.f(this.m, xr30Var.m);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        w530 w530Var = this.c;
        int a = urd0.a(urd0.a(urd0.a(fw3.a((this.e.hashCode() + shy.a(this.d, (hashCode + (w530Var == null ? 0 : w530Var.hashCode())) * 31, 31)) * 31, 31, this.f.b), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int c = pm0.c(this.l, (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        oh30 oh30Var = this.m;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        xr30 c = c(this, null, null, oh30Var, 2047);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartMarketLargeHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", moderationWrapperManager=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", moderationItem=");
        sb.append(this.e);
        sb.append(", imageList=");
        sb.append(this.f);
        sb.append(", attachTitle=");
        sb.append(this.g);
        sb.append(", priceText=");
        sb.append(this.h);
        sb.append(", priceOldText=");
        sb.append(this.i);
        sb.append(", rejectDrawable=");
        sb.append(this.j);
        sb.append(", rejectDrawableColor=");
        sb.append(this.k);
        sb.append(", viewType=");
        sb.append(this.l);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.m, ')');
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
