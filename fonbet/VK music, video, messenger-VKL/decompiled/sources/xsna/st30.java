package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.stickers.StickerItem;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class st30 implements ir30, ol8, tt30 {
    public final oh30 b;
    public final jr30 c;
    public final boolean d;
    public final boolean e;
    public final d2l0 f;
    public final boolean g;
    public final int h;
    public final AdapterEntryType i;
    public final boolean j;
    public final int k;
    public StickerItem l;
    public final abi0 m;
    public Msg n;
    public NestedMsg o;
    public Attach p;

    public st30(oh30 oh30Var, jr30 jr30Var, boolean z, boolean z2, d2l0 d2l0Var, boolean z3, int i, AdapterEntryType adapterEntryType, boolean z4, int i2, StickerItem stickerItem, abi0 abi0Var) {
        this.b = oh30Var;
        this.c = jr30Var;
        this.d = z;
        this.e = z2;
        this.f = d2l0Var;
        this.g = z3;
        this.h = i;
        this.i = adapterEntryType;
        this.j = z4;
        this.k = i2;
        this.l = stickerItem;
        this.m = abi0Var;
    }

    public static st30 h(st30 st30Var, oh30 oh30Var, jr30 jr30Var, boolean z, d2l0 d2l0Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            oh30Var = st30Var.b;
        }
        return new st30(oh30Var, (i & 2) != 0 ? st30Var.c : jr30Var, (i & 4) != 0 ? st30Var.d : z, st30Var.e, (i & 32) != 0 ? st30Var.f : d2l0Var, (i & 64) != 0 ? st30Var.g : z2, st30Var.h, st30Var.i, st30Var.j, st30Var.k, st30Var.l, st30Var.m);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.b;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        st30 h = h(this, null, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.q, uk30Var.Q, uk30Var.f(nsr0Var, gVar), 8089);
        h.p = this.p;
        h.o = this.o;
        h.n = this.n;
        return h;
    }

    @Override // xsna.tt30
    public final boolean c() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        st30 h = h(this, null, uk30Var.i(nsr0Var, gVar2, gVar), false, null, uk30Var.f(nsr0Var, gVar), 8125);
        h.p = this.p;
        h.o = this.o;
        h.n = this.n;
        return h;
    }

    @Override // xsna.tt30
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st30)) {
            return false;
        }
        st30 st30Var = (st30) obj;
        return epx.f(this.b, st30Var.b) && epx.f(this.c, st30Var.c) && this.d == st30Var.d && this.e == st30Var.e && epx.f(this.f, st30Var.f) && this.g == st30Var.g && this.h == st30Var.h && this.i == st30Var.i && this.j == st30Var.j && this.k == st30Var.k && epx.f(this.l, st30Var.l) && epx.f(this.m, st30Var.m);
    }

    @Override // xsna.tt30
    public final boolean f() {
        return this.d;
    }

    @Override // xsna.tt30
    public final boolean g() {
        return super.p0();
    }

    public final int hashCode() {
        oh30 oh30Var = this.b;
        int b = qoy.b(qoy.b(qoy.b(ar.a(this.c, (oh30Var == null ? 0 : oh30Var.hashCode()) * 31, 31), 31, this.d), 31, false), 31, this.e);
        d2l0 d2l0Var = this.f;
        int hashCode = (this.l.hashCode() + shy.a(this.k, qoy.b(pm0.c(this.i, shy.a(this.h, qoy.b((b + (d2l0Var == null ? 0 : d2l0Var.hashCode())) * 31, 31, this.g), 31), 31), 31, this.j), 31)) * 31;
        abi0 abi0Var = this.m;
        return hashCode + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        st30 h = h(this, oh30Var, null, false, null, false, 8190);
        h.p = this.p;
        h.o = this.o;
        h.n = this.n;
        return h;
    }

    @Override // xsna.tt30
    public final boolean p() {
        abi0 abi0Var = this.m;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.k));
        }
        return false;
    }

    public final String toString() {
        return "MsgPartStickerHolderItem(bubbleStyle=" + this.b + ", timeStatus=" + this.c + ", isDialogBackgroundSet=" + this.d + ", isSelectedOld=false, isIncoming=" + this.e + ", stickerAnimationStateMediator=" + this.f + ", isGradientBubble=" + this.g + ", valueNestedLevel=" + this.h + ", viewType=" + this.i + ", hasAttachOfTypeAttachStory=" + this.j + ", msgLocalId=" + this.k + ", stickerItem=" + this.l + ", selectedMessagesMediator=" + this.m + ')';
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
