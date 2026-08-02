package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class pp30 implements ir30, tuj, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final jr30 g;
    public final g34 h;
    public final ImageList i;
    public final ImageList j;
    public final boolean k;
    public final int l;
    public final String m;
    public final long n;
    public final int o;
    public final AdapterEntryType p;
    public final oh30 q;
    public final abi0 r;
    public Msg s;
    public NestedMsg t;
    public Attach u;

    public pp30(boolean z, boolean z2, int i, boolean z3, boolean z4, jr30 jr30Var, g34 g34Var, ImageList imageList, ImageList imageList2, boolean z5, int i2, String str, long j, int i3, AdapterEntryType adapterEntryType, oh30 oh30Var, abi0 abi0Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = z4;
        this.g = jr30Var;
        this.h = g34Var;
        this.i = imageList;
        this.j = imageList2;
        this.k = z5;
        this.l = i2;
        this.m = str;
        this.n = j;
        this.o = i3;
        this.p = adapterEntryType;
        this.q = oh30Var;
        this.r = abi0Var;
    }

    public static pp30 h(pp30 pp30Var, boolean z, boolean z2, boolean z3, jr30 jr30Var, g34 g34Var, oh30 oh30Var, int i) {
        return new pp30((i & 1) != 0 ? pp30Var.b : z, (i & 2) != 0 ? pp30Var.c : z2, pp30Var.d, (i & 8) != 0 ? pp30Var.e : z3, pp30Var.f, (i & 32) != 0 ? pp30Var.g : jr30Var, (i & 128) != 0 ? pp30Var.h : g34Var, pp30Var.i, pp30Var.j, pp30Var.k, pp30Var.l, pp30Var.m, pp30Var.n, pp30Var.o, pp30Var.p, (i & 65536) != 0 ? pp30Var.q : oh30Var, pp30Var.r);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.q;
    }

    public final boolean P() {
        abi0 abi0Var = this.r;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.o));
        }
        return false;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.u;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return false;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        pp30 h = h(this, false, false, false, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, null, 1048415);
        h.u = this.u;
        h.t = this.t;
        h.s = this.s;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        int i = this.o;
        pp30 h = h(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i)) : false, false, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 1048540);
        h.u = this.u;
        h.t = this.t;
        h.s = this.s;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        pp30 h = h(this, false, false, bool != null ? bool.booleanValue() : this.e, null, null, null, 1048567);
        h.u = this.u;
        h.t = this.t;
        h.s = this.s;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pp30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pp30 pp30Var = (pp30) obj;
        return this.b == pp30Var.b && this.c == pp30Var.c && this.d == pp30Var.d && this.e == pp30Var.e && epx.f(this.g, pp30Var.g) && P() == pp30Var.P() && epx.f(this.h, pp30Var.h) && epx.f(this.i, pp30Var.i) && epx.f(this.j, pp30Var.j) && this.k == pp30Var.k && this.l == pp30Var.l && epx.f(this.m, pp30Var.m) && this.n == pp30Var.n && this.o == pp30Var.o && this.p == pp30Var.p && epx.f(this.q, pp30Var.q);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(P()) + ar.a(this.g, qoy.b((qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31;
        g34 g34Var = this.h;
        int c = pm0.c(this.p, (bh10.a(urd0.a((qoy.b(fw3.a(fw3.a((hashCode + (g34Var != null ? g34Var.hashCode() : 0)) * 31, 31, this.i.b), 31, this.j.b), 31, this.k) + this.l) * 31, 31, this.m), 31, this.n) + this.o) * 31, 31);
        oh30 oh30Var = this.q;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return false;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.f;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        pp30 h = h(this, false, false, false, null, null, oh30Var, 983039);
        h.u = this.u;
        h.t = this.t;
        h.s = this.s;
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
        return "MsgPartDocPreviewHolderItem(isPrevSameMsgId=" + this.b + ", isNextSameMsgId=" + this.c + ", valueNestedLevel=" + this.d + ", bubbleFitAllWidth=" + this.e + ", inWallPost=" + this.f + ", timeStatus=" + this.g + ", isSelectedOld=false, progressMediator=" + this.h + ", localImageList=" + this.i + ", remoteImageList=" + this.j + ", isGif=" + this.k + ", attachLocalId=" + this.l + ", attachExtension=" + this.m + ", attachSize=" + this.n + ", msgLocalId=" + this.o + ", viewType=" + this.p + ", bubbleStyle=" + this.q + ", selectedMessagesMediator=" + this.r + ", isNewSnippetsEnabled=false, isNextEntryBubbleTransparent=false)";
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
