package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class q0x implements wp10, suj, nl8, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final oh30 g;
    public final Msg h;
    public final jr30 i;
    public final AttachWithImage j;
    public final boolean k;
    public final g34 l;
    public final int m;
    public final int n;
    public final AdapterEntryType o;
    public final abi0 p;

    public q0x(boolean z, boolean z2, int i, boolean z3, boolean z4, oh30 oh30Var, Msg msg, jr30 jr30Var, AttachWithImage attachWithImage, boolean z5, g34 g34Var, int i2, int i3, AdapterEntryType adapterEntryType, abi0 abi0Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = z4;
        this.g = oh30Var;
        this.h = msg;
        this.i = jr30Var;
        this.j = attachWithImage;
        this.k = z5;
        this.l = g34Var;
        this.m = i2;
        this.n = i3;
        this.o = adapterEntryType;
        this.p = abi0Var;
    }

    public static q0x T0(q0x q0xVar, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, jr30 jr30Var, g34 g34Var, int i) {
        return new q0x((i & 1) != 0 ? q0xVar.b : z, (i & 2) != 0 ? q0xVar.c : z2, q0xVar.d, (i & 8) != 0 ? q0xVar.e : z3, (i & 16) != 0 ? q0xVar.f : z4, (i & 32) != 0 ? q0xVar.g : oh30Var, q0xVar.h, (i & 128) != 0 ? q0xVar.i : jr30Var, q0xVar.j, q0xVar.k, (i & 2048) != 0 ? q0xVar.l : g34Var, q0xVar.m, q0xVar.n, q0xVar.o, q0xVar.p);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.g;
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    @Override // xsna.wp10
    public final wp10 R0(Boolean bool) {
        return T0(this, false, false, false, bool != null ? bool.booleanValue() : this.f, null, null, null, 65519);
    }

    public final boolean U0() {
        abi0 abi0Var = this.p;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.m));
        }
        return false;
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.wp10
    public final Attach a() {
        return this.j;
    }

    @Override // xsna.wp10
    public final wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return T0(this, false, false, uk30Var.e(this.k, this.e), false, null, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, 63351);
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.wp10
    public final wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.m;
        return T0(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, false, false, null, i, null, 65404);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q0x.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q0x q0xVar = (q0x) obj;
        return this.b == q0xVar.b && this.c == q0xVar.c && this.d == q0xVar.d && this.e == q0xVar.e && this.f == q0xVar.f && epx.f(this.g, q0xVar.g) && epx.f(this.h, q0xVar.h) && epx.f(this.i, q0xVar.i) && epx.f(this.j, q0xVar.j) && U0() == q0xVar.U0() && this.k == q0xVar.k && epx.f(this.l, q0xVar.l) && this.m == q0xVar.m && this.o == q0xVar.o;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c) + this.d) * 31, 31, this.e), 31, this.f);
        oh30 oh30Var = this.g;
        int b2 = qoy.b((Boolean.hashCode(U0()) + ((this.j.hashCode() + ar.a(this.i, pn.a(this.h, (b + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31, 31, this.k);
        g34 g34Var = this.l;
        return this.o.hashCode() + ((((b2 + (g34Var != null ? g34Var.hashCode() : 0)) * 31) + this.m) * 31);
    }

    @Override // xsna.wp10
    public final AdapterEntryType l() {
        return this.o;
    }

    @Override // xsna.wp10
    public final wp10 n(oh30 oh30Var) {
        return T0(this, false, false, false, false, oh30Var, null, null, 65503);
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.e;
    }

    @Override // xsna.suj
    public final int t() {
        return this.d;
    }

    public final String toString() {
        return "InlinePreviewVCItem(isPrevSameMsgId=" + this.b + ", isNextSameMsgId=" + this.c + ", valueNestedLevel=" + this.d + ", isAvatarLayout=" + this.e + ", bubbleFitAllWidth=" + this.f + ", bubbleStyle=" + this.g + ", msg=" + this.h + ", timeStatus=" + this.i + ", attach=" + this.j + ", isSelectedOld=false, msgIsIncoming=" + this.k + ", progressMediator=" + this.l + ", msgLocalId=" + this.m + ", attachLocalId=" + this.n + ", viewType=" + this.o + ", selectedMessagesMediator=" + this.p + ')';
    }

    @Override // xsna.nl8
    public final void Z(int i) {
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 d0(ProfilesInfo profilesInfo) {
        return this;
    }
}
