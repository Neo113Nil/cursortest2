package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class du30 implements ir30, ol8, tt30 {
    public final oh30 b;
    public final jr30 c;
    public final boolean d;
    public final d2l0 e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public UGCStickerModel j;
    public final int k;
    public final AdapterEntryType l;
    public final abi0 m;
    public Msg n;
    public NestedMsg o;
    public Attach p;

    public du30(oh30 oh30Var, jr30 jr30Var, boolean z, d2l0 d2l0Var, boolean z2, boolean z3, int i, boolean z4, UGCStickerModel uGCStickerModel, int i2, AdapterEntryType adapterEntryType, abi0 abi0Var) {
        this.b = oh30Var;
        this.c = jr30Var;
        this.d = z;
        this.e = d2l0Var;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = z4;
        this.j = uGCStickerModel;
        this.k = i2;
        this.l = adapterEntryType;
        this.m = abi0Var;
    }

    public static du30 h(du30 du30Var, oh30 oh30Var, jr30 jr30Var, boolean z, d2l0 d2l0Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            oh30Var = du30Var.b;
        }
        return new du30(oh30Var, (i & 2) != 0 ? du30Var.c : jr30Var, (i & 4) != 0 ? du30Var.d : z, (i & 16) != 0 ? du30Var.e : d2l0Var, du30Var.f, (i & 64) != 0 ? du30Var.g : z2, du30Var.h, du30Var.i, du30Var.j, du30Var.k, du30Var.l, du30Var.m);
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
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        boolean f = uk30Var.f(nsr0Var, gVar);
        du30 h = h(this, null, i, uk30Var.q, uk30Var.Q, f, 8105);
        h.p = this.p;
        h.o = this.o;
        h.n = this.n;
        return h;
    }

    @Override // xsna.tt30
    public final boolean c() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        du30 h = h(this, null, uk30Var.i(nsr0Var, gVar2, gVar), false, null, uk30Var.f(nsr0Var, gVar), 8125);
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
        if (!(obj instanceof du30)) {
            return false;
        }
        du30 du30Var = (du30) obj;
        return epx.f(this.b, du30Var.b) && epx.f(this.c, du30Var.c) && this.d == du30Var.d && epx.f(this.e, du30Var.e) && this.f == du30Var.f && this.g == du30Var.g && this.h == du30Var.h && this.i == du30Var.i && epx.f(this.j, du30Var.j) && this.k == du30Var.k && this.l == du30Var.l && epx.f(this.m, du30Var.m);
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
        int b = qoy.b(qoy.b(ar.a(this.c, (oh30Var == null ? 0 : oh30Var.hashCode()) * 31, 31), 31, this.d), 31, false);
        d2l0 d2l0Var = this.e;
        int c = pm0.c(this.l, shy.a(this.k, (this.j.hashCode() + qoy.b(shy.a(this.h, qoy.b(qoy.b((b + (d2l0Var == null ? 0 : d2l0Var.hashCode())) * 31, 31, this.f), 31, this.g), 31), 31, this.i)) * 31, 31), 31);
        abi0 abi0Var = this.m;
        return c + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        du30 h = h(this, oh30Var, null, false, null, false, 8190);
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
        return "MsgPartUgcStickerHolderItem(bubbleStyle=" + this.b + ", timeStatus=" + this.c + ", isDialogBackgroundSet=" + this.d + ", isSelectedOld=false, stickerAnimationStateMediator=" + this.e + ", isIncoming=" + this.f + ", isGradientBubble=" + this.g + ", valueNestedLevel=" + this.h + ", hasAttachOfTypeAttachStory=" + this.i + ", stickerItem=" + this.j + ", msgLocalId=" + this.k + ", viewType=" + this.l + ", selectedMessagesMediator=" + this.m + ')';
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
