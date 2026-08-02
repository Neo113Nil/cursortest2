package xsna;

import android.content.Context;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class t4w implements wp10, nl8, suj, ol8, tuj {
    public final io2 A;
    public final Peer B;
    public final boolean C;
    public final w530 D;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final oh30 g;
    public final boolean h;
    public final boolean i;
    public final Msg j;
    public final jr30 k;
    public final int l;
    public final gl8 m;
    public final gl8 n;
    public final qtd0 o;
    public final gzs<qtd0> p;
    public final g34 q;
    public final hzm0 r;
    public final boolean s;
    public final UserId t;
    public final boolean u;
    public final long v;
    public final AdapterEntryType w;
    public final AttachWithVideo x;
    public final abi0 y;
    public final boolean z;

    public t4w(boolean z, boolean z2, boolean z3, int i, boolean z4, oh30 oh30Var, boolean z5, boolean z6, Msg msg, jr30 jr30Var, int i2, gl8 gl8Var, gl8 gl8Var2, qtd0 qtd0Var, gzs gzsVar, g34 g34Var, hzm0 hzm0Var, boolean z7, UserId userId, boolean z8, long j, AdapterEntryType adapterEntryType, AttachWithVideo attachWithVideo, abi0 abi0Var, boolean z9, io2 io2Var, Peer peer, boolean z10, w530 w530Var) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = z4;
        this.g = oh30Var;
        this.h = z5;
        this.i = z6;
        this.j = msg;
        this.k = jr30Var;
        this.l = i2;
        this.m = gl8Var;
        this.n = gl8Var2;
        this.o = qtd0Var;
        this.p = gzsVar;
        this.q = g34Var;
        this.r = hzm0Var;
        this.s = z7;
        this.t = userId;
        this.u = z8;
        this.v = j;
        this.w = adapterEntryType;
        this.x = attachWithVideo;
        this.y = abi0Var;
        this.z = z9;
        this.A = io2Var;
        this.B = peer;
        this.C = z10;
        this.D = w530Var;
    }

    public static t4w T0(t4w t4wVar, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, boolean z5, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, qtd0 qtd0Var, g34 g34Var, w530 w530Var, int i) {
        return new t4w((i & 1) != 0 ? t4wVar.b : z, (i & 2) != 0 ? t4wVar.c : z2, (i & 4) != 0 ? t4wVar.d : z3, t4wVar.e, (i & 16) != 0 ? t4wVar.f : z4, (i & 32) != 0 ? t4wVar.g : oh30Var, t4wVar.h, (i & 128) != 0 ? t4wVar.i : z5, t4wVar.j, (i & 1024) != 0 ? t4wVar.k : jr30Var, t4wVar.l, (i & 16384) != 0 ? t4wVar.m : gl8Var, (32768 & i) != 0 ? t4wVar.n : gl8Var2, (65536 & i) != 0 ? t4wVar.o : qtd0Var, t4wVar.p, (262144 & i) != 0 ? t4wVar.q : g34Var, t4wVar.r, t4wVar.s, t4wVar.t, t4wVar.u, t4wVar.v, t4wVar.w, t4wVar.x, t4wVar.y, t4wVar.z, t4wVar.A, t4wVar.B, t4wVar.C, (i & Integer.MIN_VALUE) != 0 ? t4wVar.D : w530Var);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.c;
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
        return T0(this, false, false, false, bool != null ? bool.booleanValue() : this.f, null, false, null, null, null, null, null, null, -17);
    }

    public final int U0() {
        gl8 gl8Var = dhr0.M() ? this.m : this.n;
        abi0 abi0Var = this.y;
        return abi0Var != null ? abi0Var.d(Integer.valueOf(this.l)) : false ? gl8Var.b : gl8Var.a;
    }

    public final boolean V0() {
        abi0 abi0Var = this.y;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.l));
        }
        return false;
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    public final boolean W0() {
        abi0 abi0Var = this.y;
        if (abi0Var != null) {
            return abi0Var.b();
        }
        return false;
    }

    @Override // xsna.wp10
    public final Attach a() {
        return this.x;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.h;
    }

    @Override // xsna.wp10
    public final wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.v;
        boolean z = this.s;
        BubbleColors c = vk30Var.c(j, z, true);
        BubbleColors c2 = vk30Var.c(j, z, false);
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.e;
        boolean z2 = this.u;
        return T0(this, uk30Var.e(z, this.b), false, false, false, null, false, i, vk30Var.b(c, i2, z2), vk30Var.b(c2, i2, z2), null, uk30Var.P, uk30Var.N, 2147171326);
    }

    @Override // xsna.wp10
    public final wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.l;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false;
        if ((gVar2 != null ? gVar2.H0() : false) && super.m()) {
            z = true;
        }
        return T0(this, false, z0, z02, false, null, z, i, null, null, null, null, null, -1159);
    }

    @Override // xsna.wp10
    public final wp10 d0(ProfilesInfo profilesInfo) {
        return T0(this, false, false, false, false, null, false, null, null, null, profilesInfo.Bb(com.vk.dto.common.a.a(this.t)), null, null, -65537);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t4w.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t4w t4wVar = (t4w) obj;
        return this.b == t4wVar.b && this.c == t4wVar.c && this.d == t4wVar.d && this.e == t4wVar.e && this.f == t4wVar.f && epx.f(this.g, t4wVar.g) && epx.f(this.j, t4wVar.j) && epx.f(this.k, t4wVar.k) && W0() == t4wVar.W0() && this.l == t4wVar.l && U0() == t4wVar.U0() && V0() == t4wVar.V0() && epx.f(this.o, t4wVar.o) && epx.f(this.p.invoke(), t4wVar.p.invoke()) && epx.f(this.q, t4wVar.q) && this.s == t4wVar.s && epx.f(this.t, t4wVar.t) && this.u == t4wVar.u && this.v == t4wVar.v && this.w == t4wVar.w && epx.f(this.x, t4wVar.x) && epx.f(this.B, t4wVar.B);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        int b = qoy.b((qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d) + this.e) * 31, 31, this.f);
        oh30 oh30Var = this.g;
        int hashCode = (Boolean.hashCode(V0()) + ((Integer.hashCode(U0()) + ((((Boolean.hashCode(W0()) + ar.a(this.k, pn.a(this.j, (b + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31), 31)) * 31) + this.l) * 31)) * 31)) * 31;
        qtd0 qtd0Var = this.o;
        int hashCode2 = (hashCode + (qtd0Var != null ? qtd0Var.hashCode() : 0)) * 31;
        qtd0 invoke = this.p.invoke();
        int hashCode3 = (hashCode2 + (invoke != null ? invoke.hashCode() : 0)) * 31;
        g34 g34Var = this.q;
        return Long.hashCode(this.B.b) + ((this.x.hashCode() + pm0.c(this.w, bh10.a(qoy.b(bh10.a(qoy.b((hashCode3 + (g34Var != null ? g34Var.hashCode() : 0)) * 31, 31, this.s), 31, this.t.b), 31, this.u), 31, this.v), 31)) * 31);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.i;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return false;
    }

    @Override // xsna.wp10
    public final AdapterEntryType l() {
        return this.w;
    }

    @Override // xsna.wp10
    public final wp10 n(oh30 oh30Var) {
        return T0(this, false, false, false, false, oh30Var, false, null, null, null, null, null, null, -33);
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.b;
    }

    @Override // xsna.suj
    public final int t() {
        return this.e;
    }

    public final String toString() {
        return "ImInlineVideoPlayerVCItem(isAvatarLayout=" + this.b + ", isPrevSameMsgId=" + this.c + ", isNextSameMsgId=" + this.d + ", valueNestedLevel=" + this.e + ", bubbleFitAllWidth=" + this.f + ", bubbleStyle=" + this.g + ", isNewSnippetsEnabled=" + this.h + ", isNextEntryBubbleTransparent=" + this.i + ", inWallPost=false, msg=" + this.j + ", timeStatus=" + this.k + ", isSelectionModeOld=false, isSelectedOld=false, msgLocalId=" + this.l + ", bubbleColorDark=" + this.m + ", bubbleColorLight=" + this.n + ", profileOwner=" + this.o + ", profileOwnerProvider=" + this.p + ", progressMediator=" + this.q + ", subscriptionProgressMediator=" + this.r + ", msgIsIncoming=" + this.s + ", attachOwnerId=" + this.t + ", isValueMsgExpirable=" + this.u + ", valueMsgUniqSenderThemeChatId=" + this.v + ", viewType=" + this.w + ", attach=" + this.x + ", selectedMessagesMediator=" + this.y + ", canWrite=" + this.z + ", animationDialogCallback=" + this.A + ", currentMember=" + this.B + ", wasPlayed=" + this.C + ", moderationWrapperManager=" + this.D + ')';
    }

    @Override // xsna.nl8
    public final void Z(int i) {
    }
}
