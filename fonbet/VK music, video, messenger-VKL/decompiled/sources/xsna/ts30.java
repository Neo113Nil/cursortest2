package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class ts30 implements ir30, ol8, dc4 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public Msg D;
    public NestedMsg E;
    public Attach F;
    public final jr30 b;
    public final String c;
    public final List<Thumb> d;
    public final ImageList e;
    public final ImageList f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final List<MusicTrack> j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final Peer o;
    public final Image p;
    public final int q;
    public final kq4 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final AdapterEntryType y;
    public final oh30 z;

    public ts30(jr30 jr30Var, String str, List<Thumb> list, ImageList imageList, ImageList imageList2, boolean z, boolean z2, String str2, List<MusicTrack> list2, boolean z3, String str3, String str4, String str5, Peer peer, Image image, int i, kq4 kq4Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z9, boolean z10, boolean z11) {
        this.b = jr30Var;
        this.c = str;
        this.d = list;
        this.e = imageList;
        this.f = imageList2;
        this.g = z;
        this.h = z2;
        this.i = str2;
        this.j = list2;
        this.k = z3;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = peer;
        this.p = image;
        this.q = i;
        this.r = kq4Var;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = i2;
        this.y = adapterEntryType;
        this.z = oh30Var;
        this.A = z9;
        this.B = z10;
        this.C = z11;
    }

    public static ts30 h(ts30 ts30Var, jr30 jr30Var, boolean z, oh30 oh30Var, boolean z2, boolean z3, int i) {
        return new ts30((i & 1) != 0 ? ts30Var.b : jr30Var, ts30Var.c, ts30Var.d, ts30Var.e, ts30Var.f, ts30Var.g, ts30Var.h, ts30Var.i, ts30Var.j, ts30Var.k, ts30Var.l, ts30Var.m, ts30Var.n, ts30Var.o, ts30Var.p, ts30Var.q, ts30Var.r, ts30Var.s, ts30Var.t, (i & 524288) != 0 ? ts30Var.u : z, ts30Var.v, ts30Var.w, ts30Var.x, ts30Var.y, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? ts30Var.z : oh30Var, (i & 33554432) != 0 ? ts30Var.A : z2, (i & 67108864) != 0 ? ts30Var.B : z3, ts30Var.C);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.A;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.z;
    }

    @Override // xsna.dc4
    public final boolean T() {
        return this.w;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.F;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.t;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        ts30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), false, null, false, false, 268435454);
        h.F = this.F;
        h.E = this.E;
        h.D = this.D;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        int i = this.q;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i)) : false;
        jr30 i2 = uk30Var.i(nsr0Var, gVar2, gVar);
        if ((gVar2 != null ? gVar2.H0() : false) && super.m()) {
            z = true;
        }
        ts30 h = h(this, i2, z, null, z0, z02, 167247870);
        h.F = this.F;
        h.E = this.E;
        h.D = this.D;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts30)) {
            return false;
        }
        ts30 ts30Var = (ts30) obj;
        return epx.f(this.b, ts30Var.b) && epx.f(this.c, ts30Var.c) && epx.f(this.d, ts30Var.d) && epx.f(this.e, ts30Var.e) && epx.f(this.f, ts30Var.f) && this.g == ts30Var.g && this.h == ts30Var.h && epx.f(this.i, ts30Var.i) && epx.f(this.j, ts30Var.j) && this.k == ts30Var.k && epx.f(this.l, ts30Var.l) && epx.f(this.m, ts30Var.m) && epx.f(this.n, ts30Var.n) && epx.f(this.o, ts30Var.o) && epx.f(this.p, ts30Var.p) && this.q == ts30Var.q && epx.f(this.r, ts30Var.r) && this.s == ts30Var.s && this.t == ts30Var.t && this.u == ts30Var.u && this.v == ts30Var.v && this.w == ts30Var.w && this.x == ts30Var.x && this.y == ts30Var.y && epx.f(this.z, ts30Var.z) && this.A == ts30Var.A && this.B == ts30Var.B && this.C == ts30Var.C;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.B;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(fw3.a(fw3.a(fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b), 31, this.f.b), 31, this.g), 31, this.h);
        String str = this.i;
        int a = bh10.a(urd0.a(urd0.a(urd0.a(qoy.b(fw3.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o.b);
        Image image = this.p;
        int a2 = shy.a(this.q, (a + (image == null ? 0 : image.hashCode())) * 31, 31);
        kq4 kq4Var = this.r;
        int c = pm0.c(this.y, shy.a(this.x, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((a2 + (kq4Var == null ? 0 : kq4Var.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31), 31);
        oh30 oh30Var = this.z;
        return Boolean.hashCode(this.C) + qoy.b(qoy.b((c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31, this.A), 31, this.B);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.u;
    }

    @Override // xsna.dc4
    public final boolean j() {
        return this.s;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.C;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.y;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        ts30 h = h(this, null, false, oh30Var, false, false, 251658239);
        h.F = this.F;
        h.E = this.E;
        h.D = this.D;
        return h;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.dc4
    public final boolean r() {
        return this.v;
    }

    @Override // xsna.suj
    public final int t() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartPlaylistHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", attachTitle=");
        sb.append(this.c);
        sb.append(", thumbsList=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", thumbAttachList=");
        sb.append(this.f);
        sb.append(", isPlaylistChat=");
        sb.append(this.g);
        sb.append(", isAlbum=");
        sb.append(this.h);
        sb.append(", playlistSubtitle=");
        sb.append(this.i);
        sb.append(", tracks=");
        sb.append(this.j);
        sb.append(", isExplicit=");
        sb.append(this.k);
        sb.append(", playListOwnerName=");
        sb.append(this.l);
        sb.append(", playListTitle=");
        sb.append(this.m);
        sb.append(", playListInfo=");
        sb.append(this.n);
        sb.append(", dialogPeer=");
        sb.append(this.o);
        sb.append(", playListOwnerImage=");
        sb.append(this.p);
        sb.append(", msgLocalId=");
        sb.append(this.q);
        sb.append(", audioMediator=");
        sb.append(this.r);
        sb.append(", isMsgFromUser=");
        sb.append(this.s);
        sb.append(", isNewSnippetsEnabled=");
        sb.append(this.t);
        sb.append(", isNextEntryBubbleTransparent=");
        sb.append(this.u);
        sb.append(", msgHasBody=");
        sb.append(this.v);
        sb.append(", msgHasReply=");
        sb.append(this.w);
        sb.append(", valueNestedLevel=");
        sb.append(this.x);
        sb.append(", viewType=");
        sb.append(this.y);
        sb.append(", bubbleStyle=");
        sb.append(this.z);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.A);
        sb.append(", isNextSameMsgId=");
        sb.append(this.B);
        sb.append(", inWallPost=");
        return defpackage.q0.a(sb, this.C, ')');
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
