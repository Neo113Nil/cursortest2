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
public final class ct30 implements ir30, ol8, tt30 {
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
    public final g34 m;
    public final int n;
    public final abi0 o;
    public Msg p;
    public NestedMsg q;
    public Attach r;

    public ct30(oh30 oh30Var, jr30 jr30Var, boolean z, boolean z2, d2l0 d2l0Var, boolean z3, int i, AdapterEntryType adapterEntryType, boolean z4, int i2, StickerItem stickerItem, g34 g34Var, int i3, abi0 abi0Var) {
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
        this.m = g34Var;
        this.n = i3;
        this.o = abi0Var;
    }

    public static ct30 h(ct30 ct30Var, oh30 oh30Var, jr30 jr30Var, boolean z, d2l0 d2l0Var, boolean z2, int i) {
        return new ct30((i & 1) != 0 ? ct30Var.b : oh30Var, (i & 2) != 0 ? ct30Var.c : jr30Var, (i & 4) != 0 ? ct30Var.d : z, ct30Var.e, (i & 32) != 0 ? ct30Var.f : d2l0Var, (i & 64) != 0 ? ct30Var.g : z2, ct30Var.h, ct30Var.i, ct30Var.j, ct30Var.k, ct30Var.l, ct30Var.m, ct30Var.n, ct30Var.o);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.b;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.r;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        ct30 h = h(this, null, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.q, uk30Var.Q, uk30Var.f(nsr0Var, gVar), 32665);
        h.r = this.r;
        h.q = this.q;
        h.p = this.p;
        return h;
    }

    @Override // xsna.tt30
    public final boolean c() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        ct30 h = h(this, null, uk30Var.i(nsr0Var, gVar2, gVar), false, null, uk30Var.f(nsr0Var, gVar), 32701);
        h.r = this.r;
        h.q = this.q;
        h.p = this.p;
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
        if (!(obj instanceof ct30)) {
            return false;
        }
        ct30 ct30Var = (ct30) obj;
        return epx.f(this.b, ct30Var.b) && epx.f(this.c, ct30Var.c) && this.d == ct30Var.d && this.e == ct30Var.e && epx.f(this.f, ct30Var.f) && this.g == ct30Var.g && this.h == ct30Var.h && this.i == ct30Var.i && this.j == ct30Var.j && this.k == ct30Var.k && epx.f(this.l, ct30Var.l) && epx.f(this.m, ct30Var.m) && this.n == ct30Var.n && epx.f(this.o, ct30Var.o);
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
        g34 g34Var = this.m;
        int a = shy.a(this.n, (hashCode + (g34Var == null ? 0 : g34Var.hashCode())) * 31, 31);
        abi0 abi0Var = this.o;
        return a + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        ct30 h = h(this, oh30Var, null, false, null, false, 32766);
        h.r = this.r;
        h.q = this.q;
        h.p = this.p;
        return h;
    }

    @Override // xsna.tt30
    public final boolean p() {
        abi0 abi0Var = this.o;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.k));
        }
        return false;
    }

    public final String toString() {
        return "MsgPartPopupStickerHolderItem(bubbleStyle=" + this.b + ", timeStatus=" + this.c + ", isDialogBackgroundSet=" + this.d + ", isSelectedOld=false, isIncoming=" + this.e + ", stickerAnimationStateMediator=" + this.f + ", isGradientBubble=" + this.g + ", valueNestedLevel=" + this.h + ", viewType=" + this.i + ", hasAttachOfTypeAttachStory=" + this.j + ", msgLocalId=" + this.k + ", stickerItem=" + this.l + ", progressMediator=" + this.m + ", attachLocalId=" + this.n + ", selectedMessagesMediator=" + this.o + ')';
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
