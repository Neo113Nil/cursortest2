package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class tr30 implements ir30, suj, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final oh30 f;
    public final jr30 g;
    public final gl8 h;
    public final gl8 i;
    public final double j;
    public final double k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final AdapterEntryType p;
    public final abi0 q;
    public Msg r;
    public NestedMsg s;
    public Attach t;

    public tr30(boolean z, boolean z2, int i, boolean z3, oh30 oh30Var, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, double d, double d2, int i2, boolean z4, boolean z5, long j, AdapterEntryType adapterEntryType, abi0 abi0Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = oh30Var;
        this.g = jr30Var;
        this.h = gl8Var;
        this.i = gl8Var2;
        this.j = d;
        this.k = d2;
        this.l = i2;
        this.m = z4;
        this.n = z5;
        this.o = j;
        this.p = adapterEntryType;
        this.q = abi0Var;
    }

    public static tr30 h(tr30 tr30Var, boolean z, boolean z2, boolean z3, oh30 oh30Var, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, int i) {
        return new tr30((i & 1) != 0 ? tr30Var.b : z, (i & 2) != 0 ? tr30Var.c : z2, tr30Var.d, (i & 8) != 0 ? tr30Var.e : z3, (i & 16) != 0 ? tr30Var.f : oh30Var, (i & 32) != 0 ? tr30Var.g : jr30Var, (i & 64) != 0 ? tr30Var.h : gl8Var, (i & 128) != 0 ? tr30Var.i : gl8Var2, tr30Var.j, tr30Var.k, tr30Var.l, tr30Var.m, tr30Var.n, tr30Var.o, tr30Var.p, tr30Var.q);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.t;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.o;
        boolean z = this.m;
        BubbleColors c = vk30Var.c(j, z, true);
        BubbleColors c2 = vk30Var.c(j, z, false);
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.d;
        boolean z2 = this.n;
        tr30 h = h(this, false, false, false, null, i, vk30Var.b(c, i2, z2), vk30Var.b(c2, i2, z2), 130847);
        h.t = this.t;
        h.s = this.s;
        h.r = this.r;
        return h;
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.l;
        tr30 h = h(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, false, null, i, null, null, 131036);
        h.t = this.t;
        h.s = this.s;
        h.r = this.r;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        tr30 h = h(this, false, false, bool != null ? bool.booleanValue() : this.e, null, null, null, null, 131063);
        h.t = this.t;
        h.s = this.s;
        h.r = this.r;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr30)) {
            return false;
        }
        tr30 tr30Var = (tr30) obj;
        return this.b == tr30Var.b && this.c == tr30Var.c && this.d == tr30Var.d && this.e == tr30Var.e && epx.f(this.f, tr30Var.f) && epx.f(this.g, tr30Var.g) && epx.f(this.h, tr30Var.h) && epx.f(this.i, tr30Var.i) && Double.compare(this.j, tr30Var.j) == 0 && Double.compare(this.k, tr30Var.k) == 0 && this.l == tr30Var.l && this.m == tr30Var.m && this.n == tr30Var.n && this.o == tr30Var.o && this.p == tr30Var.p && epx.f(this.q, tr30Var.q);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.d, qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31, this.e);
        oh30 oh30Var = this.f;
        int b2 = qoy.b(pm0.c(this.p, bh10.a(qoy.b(qoy.b(shy.a(this.l, zjh0.b(this.k, zjh0.b(this.j, (this.i.hashCode() + ((this.h.hashCode() + ar.a(this.g, (b + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31, 31)) * 31)) * 31, 31), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31), 31, false);
        abi0 abi0Var = this.q;
        return b2 + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        tr30 h = h(this, false, false, false, oh30Var, null, null, null, 131055);
        h.t = this.t;
        h.s = this.s;
        h.r = this.r;
        return h;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.suj
    public final int t() {
        return this.d;
    }

    public final String toString() {
        return "MsgPartMapHolderItem(isPrevSameMsgId=" + this.b + ", isNextSameMsgId=" + this.c + ", valueNestedLevel=" + this.d + ", bubbleFitAllWidth=" + this.e + ", bubbleStyle=" + this.f + ", timeStatus=" + this.g + ", bubbleColorDark=" + this.h + ", bubbleColorLight=" + this.i + ", latitude=" + this.j + ", longitude=" + this.k + ", msgLocalId=" + this.l + ", isIncoming=" + this.m + ", isValueMsgExpirable=" + this.n + ", valueMsgUniqSenderThemeChatId=" + this.o + ", viewType=" + this.p + ", isSelectedOld=false, selectedMessagesMediator=" + this.q + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
