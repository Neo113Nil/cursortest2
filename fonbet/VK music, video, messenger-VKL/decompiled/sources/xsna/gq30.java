package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class gq30 implements ir30, ol8, tuj, nl8 {
    public final AdapterEntryType b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final oh30 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final boolean p;
    public final ImageList q;
    public final VideoRestriction r;
    public final jr30 s;
    public final abi0 t;
    public Msg u;
    public NestedMsg v;
    public Attach w;

    public gq30(AdapterEntryType adapterEntryType, int i, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, boolean z5, boolean z6, boolean z7, int i2, int i3, String str, String str2, boolean z8, ImageList imageList, VideoRestriction videoRestriction, jr30 jr30Var, abi0 abi0Var) {
        this.b = adapterEntryType;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = oh30Var;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = i2;
        this.m = i3;
        this.n = str;
        this.o = str2;
        this.p = z8;
        this.q = imageList;
        this.r = videoRestriction;
        this.s = jr30Var;
        this.t = abi0Var;
    }

    public static gq30 R0(gq30 gq30Var, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, boolean z5, jr30 jr30Var, int i) {
        VideoRestriction videoRestriction;
        jr30 jr30Var2;
        AdapterEntryType adapterEntryType = gq30Var.b;
        int i2 = gq30Var.c;
        boolean z6 = (i & 4) != 0 ? gq30Var.d : z;
        boolean z7 = (i & 8) != 0 ? gq30Var.e : z2;
        boolean z8 = (i & 16) != 0 ? gq30Var.f : z3;
        boolean z9 = (i & 32) != 0 ? gq30Var.g : z4;
        oh30 oh30Var2 = (i & 64) != 0 ? gq30Var.h : oh30Var;
        boolean z10 = gq30Var.i;
        boolean z11 = z6;
        boolean z12 = z7;
        boolean z13 = z8;
        boolean z14 = z9;
        oh30 oh30Var3 = oh30Var2;
        boolean z15 = gq30Var.j;
        boolean z16 = (i & 512) != 0 ? gq30Var.k : z5;
        int i3 = gq30Var.l;
        boolean z17 = z16;
        int i4 = gq30Var.m;
        String str = gq30Var.n;
        String str2 = gq30Var.o;
        boolean z18 = gq30Var.p;
        ImageList imageList = gq30Var.q;
        VideoRestriction videoRestriction2 = gq30Var.r;
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            videoRestriction = videoRestriction2;
            jr30Var2 = gq30Var.s;
        } else {
            videoRestriction = videoRestriction2;
            jr30Var2 = jr30Var;
        }
        return new gq30(adapterEntryType, i2, z11, z12, z13, z14, oh30Var3, z10, z15, z17, i3, i4, str, str2, z18, imageList, videoRestriction, jr30Var2, gq30Var.t);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.e;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.h;
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.w;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        gq30 R0 = R0(this, uk30Var.e(this.p, this.d), false, false, false, null, false, uk30Var.i(nsr0Var, gVar2, gVar), 786427);
        R0.w = this.w;
        R0.v = this.v;
        R0.u = this.u;
        return R0;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.l;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false;
        if ((gVar2 != null ? gVar2.H0() : false) && super.m()) {
            z = true;
        }
        gq30 R0 = R0(this, false, z0, z02, false, null, z, i, 785895);
        R0.w = this.w;
        R0.v = this.v;
        R0.u = this.u;
        return R0;
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        gq30 R0 = R0(this, false, false, false, bool != null ? bool.booleanValue() : this.g, null, false, null, 1048543);
        R0.w = this.w;
        R0.v = this.v;
        R0.u = this.u;
        return R0;
    }

    @Override // xsna.tuj
    public final f14 e(Context context) {
        int m0 = super.m0(context);
        if (!this.j) {
            return new f14(m0, super.c(context));
        }
        if (this.e) {
            m0 = 0;
        }
        return new f14(m0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq30)) {
            return false;
        }
        gq30 gq30Var = (gq30) obj;
        return this.b == gq30Var.b && this.c == gq30Var.c && this.d == gq30Var.d && this.e == gq30Var.e && this.f == gq30Var.f && this.g == gq30Var.g && epx.f(this.h, gq30Var.h) && this.i == gq30Var.i && this.j == gq30Var.j && this.k == gq30Var.k && this.l == gq30Var.l && this.m == gq30Var.m && this.n.equals(gq30Var.n) && this.o.equals(gq30Var.o) && this.p == gq30Var.p && epx.f(this.q, gq30Var.q) && epx.f(this.r, gq30Var.r) && epx.f(this.s, gq30Var.s) && epx.f(this.t, gq30Var.t);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        oh30 oh30Var = this.h;
        int b2 = qoy.b(fw3.a(qoy.b(urd0.a(urd0.a(shy.a(this.m, shy.a(this.l, qoy.b(qoy.b(qoy.b((b + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q.b), 31, false);
        VideoRestriction videoRestriction = this.r;
        int a = ar.a(this.s, (b2 + (videoRestriction == null ? 0 : videoRestriction.hashCode())) * 31, 31);
        abi0 abi0Var = this.t;
        return a + (abi0Var != null ? abi0Var.hashCode() : 0);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.k;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.i;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.b;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        gq30 R0 = R0(this, false, false, false, false, oh30Var, false, null, 1048511);
        R0.w = this.w;
        R0.v = this.v;
        R0.u = this.u;
        return R0;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.d;
    }

    @Override // xsna.suj
    public final int t() {
        return this.c;
    }

    public final String toString() {
        return "MsgPartExternalVideoHolderItem(viewType=" + this.b + ", valueNestedLevel=" + this.c + ", isAvatarLayout=" + this.d + ", isPrevSameMsgId=" + this.e + ", isNextSameMsgId=" + this.f + ", bubbleFitAllWidth=" + this.g + ", bubbleStyle=" + this.h + ", inWallPost=" + this.i + ", isNewSnippetsEnabled=" + this.j + ", isNextEntryBubbleTransparent=" + this.k + ", msgLocalId=" + this.l + ", duration=" + this.m + ", platform=" + this.n + ", videoTitle=" + this.o + ", msgIsIncoming=" + this.p + ", remoteImageList=" + this.q + ", isSelectedOld=false, videoRestriction=" + this.r + ", timeStatus=" + this.s + ", selectedMessagesMediator=" + this.t + ')';
    }

    @Override // xsna.nl8
    public final void Z(int i) {
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
