package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class rp30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final gl8 d;
    public final gl8 e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final long j;
    public final DownloadState k;
    public final String l;
    public final g34 m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final long q;
    public final AdapterEntryType r;
    public final oh30 s;
    public Msg t;
    public NestedMsg u;
    public Attach v;

    public rp30(jr30 jr30Var, int i, gl8 gl8Var, gl8 gl8Var2, boolean z, int i2, boolean z2, String str, long j, DownloadState downloadState, String str2, g34 g34Var, int i3, boolean z3, boolean z4, long j2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = gl8Var;
        this.e = gl8Var2;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = str;
        this.j = j;
        this.k = downloadState;
        this.l = str2;
        this.m = g34Var;
        this.n = i3;
        this.o = z3;
        this.p = z4;
        this.q = j2;
        this.r = adapterEntryType;
        this.s = oh30Var;
    }

    public static rp30 c(rp30 rp30Var, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, boolean z, g34 g34Var, oh30 oh30Var, int i) {
        return new rp30((i & 1) != 0 ? rp30Var.b : jr30Var, rp30Var.c, (i & 4) != 0 ? rp30Var.d : gl8Var, (i & 8) != 0 ? rp30Var.e : gl8Var2, (i & 16) != 0 ? rp30Var.f : z, rp30Var.g, rp30Var.h, rp30Var.i, rp30Var.j, rp30Var.k, rp30Var.l, (i & 2048) != 0 ? rp30Var.m : g34Var, rp30Var.n, rp30Var.o, rp30Var.p, rp30Var.q, rp30Var.r, (i & 131072) != 0 ? rp30Var.s : oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.s;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.v;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.q;
        boolean z = this.o;
        BubbleColors c = vk30Var.c(j, z, true);
        BubbleColors c2 = vk30Var.c(j, z, false);
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        boolean f = uk30Var.f(nsr0Var, gVar);
        int i2 = this.c;
        boolean z2 = this.p;
        rp30 c3 = c(this, i, vk30Var.b(c, i2, z2), vk30Var.b(c2, i2, z2), f, uk30Var.P, null, 260066);
        c3.v = this.v;
        c3.u = this.u;
        c3.t = this.t;
        return c3;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        rp30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, uk30Var.f(nsr0Var, gVar), null, null, 262126);
        c.v = this.v;
        c.u = this.u;
        c.t = this.t;
        return c;
    }

    public final int e() {
        return (dhr0.M() ? this.d : this.e).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rp30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        rp30 rp30Var = (rp30) obj;
        return epx.f(this.b, rp30Var.b) && this.c == rp30Var.c && e() == rp30Var.e() && this.f == rp30Var.f && this.g == rp30Var.g && this.h == rp30Var.h && epx.f(this.i, rp30Var.i) && this.j == rp30Var.j && this.k == rp30Var.k && epx.f(this.l, rp30Var.l) && epx.f(this.m, rp30Var.m) && this.n == rp30Var.n && this.o == rp30Var.o && this.p == rp30Var.p && this.q == rp30Var.q && this.r == rp30Var.r && epx.f(this.s, rp30Var.s);
    }

    public final int hashCode() {
        int a = urd0.a((this.k.hashCode() + bh10.a(urd0.a(qoy.b((qoy.b((Integer.hashCode(e()) + (((this.b.hashCode() * 31) + this.c) * 31)) * 31, 31, this.f) + this.g) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l);
        g34 g34Var = this.m;
        int c = pm0.c(this.r, bh10.a(qoy.b(qoy.b((((a + (g34Var != null ? g34Var.hashCode() : 0)) * 31) + this.n) * 31, 31, this.o), 31, this.p), 31, this.q), 31);
        oh30 oh30Var = this.s;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.r;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        rp30 c = c(this, null, null, null, false, null, oh30Var, 131071);
        c.v = this.v;
        c.u = this.u;
        c.t = this.t;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartDocSimpleHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", bubbleColorDark=");
        sb.append(this.d);
        sb.append(", bubbleColorLight=");
        sb.append(this.e);
        sb.append(", isGradientBubble=");
        sb.append(this.f);
        sb.append(", attachLocalId=");
        sb.append(this.g);
        sb.append(", isWithProgress=");
        sb.append(this.h);
        sb.append(", attachExtension=");
        sb.append(this.i);
        sb.append(", attachSize=");
        sb.append(this.j);
        sb.append(", downloadState=");
        sb.append(this.k);
        sb.append(", attachTitle=");
        sb.append(this.l);
        sb.append(", progressMediator=");
        sb.append(this.m);
        sb.append(", msgLocalId=");
        sb.append(this.n);
        sb.append(", isIncoming=");
        sb.append(this.o);
        sb.append(", isValueMsgExpirable=");
        sb.append(this.p);
        sb.append(", valueMsgUniqSenderThemeChatId=");
        sb.append(this.q);
        sb.append(", viewType=");
        sb.append(this.r);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.s, ')');
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
