package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class j4w implements wp10, tuj, nl8 {
    public final boolean A;
    public final abi0 B;
    public final boolean C;
    public final boolean D;
    public final AdapterEntryType b;
    public final AttachVideo c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Msg j;
    public final boolean k;
    public final int l;
    public final jr30 m;
    public final String n;
    public final String o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final VideoFile s;
    public final ImageList t;
    public final ImageList u;
    public final ImageList v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public j4w(AdapterEntryType adapterEntryType, AttachVideo attachVideo, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, Msg msg, boolean z6, int i2, jr30 jr30Var, String str, String str2, int i3, boolean z7, boolean z8, VideoFile videoFile, ImageList imageList, ImageList imageList2, ImageList imageList3, String str3, boolean z9, boolean z10, boolean z11, boolean z12, abi0 abi0Var, boolean z13, boolean z14) {
        this.b = adapterEntryType;
        this.c = attachVideo;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = z4;
        this.i = z5;
        this.j = msg;
        this.k = z6;
        this.l = i2;
        this.m = jr30Var;
        this.n = str;
        this.o = str2;
        this.p = i3;
        this.q = z7;
        this.r = z8;
        this.s = videoFile;
        this.t = imageList;
        this.u = imageList2;
        this.v = imageList3;
        this.w = str3;
        this.x = z9;
        this.y = z10;
        this.z = z11;
        this.A = z12;
        this.B = abi0Var;
        this.C = z13;
        this.D = z14;
    }

    public static j4w o(j4w j4wVar, boolean z, boolean z2, boolean z3, jr30 jr30Var, int i) {
        return new j4w(j4wVar.b, j4wVar.c, (i & 4) != 0 ? j4wVar.d : z, (i & 8) != 0 ? j4wVar.e : z2, (i & 16) != 0 ? j4wVar.f : z3, j4wVar.g, j4wVar.h, j4wVar.i, j4wVar.j, j4wVar.k, j4wVar.l, jr30Var, j4wVar.n, j4wVar.o, j4wVar.p, j4wVar.q, j4wVar.r, j4wVar.s, j4wVar.t, j4wVar.u, j4wVar.v, j4wVar.w, j4wVar.x, j4wVar.y, j4wVar.z, j4wVar.A, j4wVar.B, j4wVar.C, j4wVar.D);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.d;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.wp10
    public final Attach a() {
        return this.c;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.i;
    }

    @Override // xsna.wp10
    public final wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return o(this, false, false, uk30Var.e(this.k, this.f), uk30Var.i(nsr0Var, gVar2, gVar), -16401);
    }

    @Override // xsna.wp10
    public final wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.l;
        return o(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, false, i, -16397);
    }

    @Override // xsna.tuj
    public final f14 e(Context context) {
        int m0 = super.m0(context);
        int c = super.c(context);
        if (!this.i) {
            return new f14(m0, c);
        }
        if (this.d) {
            m0 = 0;
        }
        return new f14(m0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4w)) {
            return false;
        }
        j4w j4wVar = (j4w) obj;
        return this.b == j4wVar.b && epx.f(this.c, j4wVar.c) && this.d == j4wVar.d && this.e == j4wVar.e && this.f == j4wVar.f && this.g == j4wVar.g && this.h == j4wVar.h && this.i == j4wVar.i && epx.f(this.j, j4wVar.j) && this.k == j4wVar.k && this.l == j4wVar.l && this.m.equals(j4wVar.m) && epx.f(this.n, j4wVar.n) && this.o.equals(j4wVar.o) && this.p == j4wVar.p && this.q == j4wVar.q && this.r == j4wVar.r && epx.f(this.s, j4wVar.s) && epx.f(this.t, j4wVar.t) && epx.f(this.u, j4wVar.u) && epx.f(this.v, j4wVar.v) && this.w.equals(j4wVar.w) && this.x == j4wVar.x && this.y == j4wVar.y && this.z == j4wVar.z && this.A == j4wVar.A && epx.f(this.B, j4wVar.B) && this.C == j4wVar.C && this.D == j4wVar.D;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(fw3.a(fw3.a(fw3.a(jq.b(this.s, qoy.b(qoy.b(shy.a(this.p, urd0.a(urd0.a(ar.a(this.m, shy.a(this.l, qoy.b(qoy.b(qoy.b(pn.a(this.j, qoy.b(qoy.b(qoy.b(shy.a(this.g, qoy.b(qoy.b(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, false), 31), 31, false), 31, false), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r), 31), 31, this.t.b), 31, this.u.b), 31, this.v.b), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
        abi0 abi0Var = this.B;
        return Boolean.hashCode(this.D) + qoy.b((b + (abi0Var != null ? abi0Var.hashCode() : 0)) * 31, 31, this.C);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return false;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.h;
    }

    @Override // xsna.wp10
    public final AdapterEntryType l() {
        return this.b;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.f;
    }

    public final boolean s() {
        abi0 abi0Var = this.B;
        if (abi0Var != null) {
            return abi0Var.b();
        }
        return false;
    }

    @Override // xsna.suj
    public final int t() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImInlinePublicVideoPlayerVCItem(viewType=");
        sb.append(this.b);
        sb.append(", attach=");
        sb.append(this.c);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.d);
        sb.append(", isNextSameMsgId=");
        sb.append(this.e);
        sb.append(", isAvatarLayout=");
        sb.append(this.f);
        sb.append(", valueNestedLevel=");
        sb.append(this.g);
        sb.append(", inWallPost=");
        sb.append(this.h);
        sb.append(", isNewSnippetsEnabled=");
        sb.append(this.i);
        sb.append(", isNextEntryBubbleTransparent=false, msg=");
        sb.append(this.j);
        sb.append(", isSelectedOld=false, isSelectionModeOld=false, msgIsIncoming=");
        sb.append(this.k);
        sb.append(", msgLocalId=");
        sb.append(this.l);
        sb.append(", timeStatus=");
        sb.append(this.m);
        sb.append(", title=");
        sb.append(this.n);
        sb.append(", ownerName=");
        sb.append(this.o);
        sb.append(", viewsCount=");
        sb.append(this.p);
        sb.append(", isOwnerVerified=");
        sb.append(this.q);
        sb.append(", hasVideoStartTime=");
        sb.append(this.r);
        sb.append(", videoFile=");
        sb.append(this.s);
        sb.append(", localVideoImageList=");
        sb.append(this.t);
        sb.append(", remoteVideoImageList=");
        sb.append(this.u);
        sb.append(", firstFrameVideoImageList=");
        sb.append(this.v);
        sb.append(", platform=");
        sb.append(this.w);
        sb.append(", isLive=");
        sb.append(this.x);
        sb.append(", isLiveUpcoming=");
        sb.append(this.y);
        sb.append(", isLiveNotFinished=");
        sb.append(this.z);
        sb.append(", isVideoRestricted=");
        sb.append(this.A);
        sb.append(", selectedMessagesMediator=");
        sb.append(this.B);
        sb.append(", isFooterVisible=");
        sb.append(this.C);
        sb.append(", isMsgFromUser=");
        return defpackage.q0.a(sb, this.D, ')');
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 R0(Boolean bool) {
        return this;
    }

    @Override // xsna.nl8
    public final void Z(int i) {
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 d0(ProfilesInfo profilesInfo) {
        return this;
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 n(oh30 oh30Var) {
        return this;
    }
}
