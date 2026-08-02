package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class rs30 implements ir30, tuj, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final jr30 g;
    public final g34 h;
    public final int i;
    public final ImageList j;
    public final ImageList k;
    public final int l;
    public final PhotoRestriction m;
    public final long n;
    public final UserId o;
    public final AdapterEntryType p;
    public final oh30 q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final abi0 u;
    public final boolean v;
    public Msg w;
    public NestedMsg x;
    public Attach y;

    public rs30(boolean z, boolean z2, int i, boolean z3, boolean z4, jr30 jr30Var, g34 g34Var, int i2, ImageList imageList, ImageList imageList2, int i3, PhotoRestriction photoRestriction, long j, UserId userId, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z5, boolean z6, boolean z7, abi0 abi0Var, boolean z8) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = z4;
        this.g = jr30Var;
        this.h = g34Var;
        this.i = i2;
        this.j = imageList;
        this.k = imageList2;
        this.l = i3;
        this.m = photoRestriction;
        this.n = j;
        this.o = userId;
        this.p = adapterEntryType;
        this.q = oh30Var;
        this.r = z5;
        this.s = z6;
        this.t = z7;
        this.u = abi0Var;
        this.v = z8;
    }

    public static rs30 h(rs30 rs30Var, boolean z, boolean z2, boolean z3, boolean z4, jr30 jr30Var, g34 g34Var, oh30 oh30Var, boolean z5, int i) {
        return new rs30((i & 1) != 0 ? rs30Var.b : z, (i & 2) != 0 ? rs30Var.c : z2, rs30Var.d, (i & 8) != 0 ? rs30Var.e : z3, (i & 16) != 0 ? rs30Var.f : z4, (i & 32) != 0 ? rs30Var.g : jr30Var, (i & 128) != 0 ? rs30Var.h : g34Var, rs30Var.i, rs30Var.j, rs30Var.k, rs30Var.l, rs30Var.m, rs30Var.n, rs30Var.o, rs30Var.p, (i & 65536) != 0 ? rs30Var.q : oh30Var, rs30Var.r, rs30Var.s, (i & 524288) != 0 ? rs30Var.t : z5, rs30Var.u, rs30Var.v);
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
        abi0 abi0Var = this.u;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.l));
        }
        return false;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.y;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.s;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        rs30 h = h(this, false, false, false, false, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, null, false, 4194143);
        h.y = this.y;
        h.x = this.x;
        h.w = this.w;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        oh30 oh30Var;
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.l;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false;
        if ((gVar2 != null ? gVar2.H0() : false) && (oh30Var = this.q) != null && !oh30Var.h) {
            z = true;
        }
        rs30 h = h(this, z0, z02, false, false, i, null, null, z, 3669980);
        h.y = this.y;
        h.x = this.x;
        h.w = this.w;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        rs30 h = h(this, false, false, bool2 != null ? bool2.booleanValue() : this.e, bool != null ? bool.booleanValue() : this.f, null, null, null, false, 4194279);
        h.y = this.y;
        h.x = this.x;
        h.w = this.w;
        return h;
    }

    @Override // xsna.tuj
    public final f14 e(Context context) {
        if (!this.s) {
            return new f14(super.m0(context), super.g(context));
        }
        int i = 0;
        boolean z = this.b;
        int d = z ? 0 : e3m.d(R.attr.im_msg_part_corner_radius_big, context);
        if (!this.v && (!this.c || !z)) {
            i = e3m.d(R.attr.im_msg_part_corner_radius_big, context);
        }
        return new f14(d, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rs30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        rs30 rs30Var = (rs30) obj;
        return this.b == rs30Var.b && this.c == rs30Var.c && this.d == rs30Var.d && this.e == rs30Var.e && this.f == rs30Var.f && epx.f(this.g, rs30Var.g) && P() == rs30Var.P() && epx.f(this.h, rs30Var.h) && this.i == rs30Var.i && epx.f(this.j, rs30Var.j) && epx.f(this.k, rs30Var.k) && this.l == rs30Var.l && epx.f(this.m, rs30Var.m) && this.n == rs30Var.n && epx.f(this.o, rs30Var.o) && this.p == rs30Var.p && epx.f(this.q, rs30Var.q) && this.v == rs30Var.v;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(P()) + ar.a(this.g, qoy.b(qoy.b((qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c) + this.d) * 31, 31, this.e), 31, this.f), 31)) * 31;
        g34 g34Var = this.h;
        int a = (fw3.a(fw3.a((((hashCode + (g34Var != null ? g34Var.hashCode() : 0)) * 31) + this.i) * 31, 31, this.j.b), 31, this.k.b) + this.l) * 31;
        PhotoRestriction photoRestriction = this.m;
        int c = pm0.c(this.p, bh10.a(bh10.a((a + (photoRestriction != null ? photoRestriction.hashCode() : 0)) * 31, 31, this.n), 31, this.o.b), 31);
        oh30 oh30Var = this.q;
        return Boolean.hashCode(this.v) + ((c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.t;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.r;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        rs30 h = h(this, false, false, false, false, null, null, oh30Var, false, 4128767);
        h.y = this.y;
        h.x = this.x;
        h.w = this.w;
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
        StringBuilder sb = new StringBuilder("MsgPartPhotoHolderItem(isPrevSameMsgId=");
        sb.append(this.b);
        sb.append(", isNextSameMsgId=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", disableMaxHeight=");
        sb.append(this.e);
        sb.append(", bubbleFitAllWidth=");
        sb.append(this.f);
        sb.append(", timeStatus=");
        sb.append(this.g);
        sb.append(", isSelectedOld=false, progressMediator=");
        sb.append(this.h);
        sb.append(", attachLocalId=");
        sb.append(this.i);
        sb.append(", remoteImageList=");
        sb.append(this.j);
        sb.append(", localImageList=");
        sb.append(this.k);
        sb.append(", msgLocalId=");
        sb.append(this.l);
        sb.append(", restrictions=");
        sb.append(this.m);
        sb.append(", imageAttachId=");
        sb.append(this.n);
        sb.append(", imageAttachOwner=");
        sb.append(this.o);
        sb.append(", viewType=");
        sb.append(this.p);
        sb.append(", bubbleStyle=");
        sb.append(this.q);
        sb.append(", inWallPost=");
        sb.append(this.r);
        sb.append(", isNewSnippetsEnabled=");
        sb.append(this.s);
        sb.append(", isNextEntryBubbleTransparent=");
        sb.append(this.t);
        sb.append(", selectedMessagesMediator=");
        sb.append(this.u);
        sb.append(", donationPhoto=");
        return defpackage.q0.a(sb, this.v, ')');
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
