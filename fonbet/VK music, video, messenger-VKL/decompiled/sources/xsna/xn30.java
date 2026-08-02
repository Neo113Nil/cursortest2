package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class xn30 implements ir30, ol8, dc4 {
    public final jr30 b;
    public final String c;
    public final int d;
    public final String e;
    public final Peer f;
    public final boolean g;
    public final ImageList h;
    public final List<MusicTrack> i;
    public final kq4 j;
    public final AdapterEntryType k;
    public final oh30 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public Msg v;
    public NestedMsg w;
    public Attach x;

    public xn30(jr30 jr30Var, String str, int i, String str2, Peer peer, boolean z, ImageList imageList, List<MusicTrack> list, kq4 kq4Var, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, boolean z9) {
        this.b = jr30Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = peer;
        this.g = z;
        this.h = imageList;
        this.i = list;
        this.j = kq4Var;
        this.k = adapterEntryType;
        this.l = oh30Var;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = i2;
        this.u = z9;
    }

    public static xn30 h(xn30 xn30Var, jr30 jr30Var, oh30 oh30Var, boolean z, boolean z2, boolean z3, int i) {
        return new xn30((i & 1) != 0 ? xn30Var.b : jr30Var, xn30Var.c, xn30Var.d, xn30Var.e, xn30Var.f, xn30Var.g, xn30Var.h, xn30Var.i, xn30Var.j, xn30Var.k, (i & 1024) != 0 ? xn30Var.l : oh30Var, xn30Var.m, xn30Var.n, (i & 8192) != 0 ? xn30Var.o : z, xn30Var.p, xn30Var.q, (i & 65536) != 0 ? xn30Var.r : z2, (i & 131072) != 0 ? xn30Var.s : z3, xn30Var.t, xn30Var.u);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.r;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.l;
    }

    @Override // xsna.dc4
    public final boolean T() {
        return this.q;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.x;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.n;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        xn30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), null, false, false, false, 1048574);
        h.x = this.x;
        h.w = this.w;
        h.v = this.v;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        int i = this.d;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i)) : false;
        jr30 i2 = uk30Var.i(nsr0Var, gVar2, gVar);
        if ((gVar2 != null ? gVar2.H0() : false) && super.m()) {
            z = true;
        }
        xn30 h = h(this, i2, null, z, z0, z02, 843774);
        h.x = this.x;
        h.w = this.w;
        h.v = this.v;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn30)) {
            return false;
        }
        xn30 xn30Var = (xn30) obj;
        return epx.f(this.b, xn30Var.b) && epx.f(this.c, xn30Var.c) && this.d == xn30Var.d && epx.f(this.e, xn30Var.e) && epx.f(this.f, xn30Var.f) && this.g == xn30Var.g && epx.f(this.h, xn30Var.h) && epx.f(this.i, xn30Var.i) && epx.f(this.j, xn30Var.j) && this.k == xn30Var.k && epx.f(this.l, xn30Var.l) && this.m == xn30Var.m && this.n == xn30Var.n && this.o == xn30Var.o && this.p == xn30Var.p && this.q == xn30Var.q && this.r == xn30Var.r && this.s == xn30Var.s && this.t == xn30Var.t && this.u == xn30Var.u;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.s;
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(qoy.b(bh10.a(urd0.a(shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e), 31, this.f.b), 31, this.g), 31, this.h.b), 31, this.i);
        kq4 kq4Var = this.j;
        int c = pm0.c(this.k, (a + (kq4Var == null ? 0 : kq4Var.hashCode())) * 31, 31);
        oh30 oh30Var = this.l;
        return Boolean.hashCode(this.u) + shy.a(this.t, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.o;
    }

    @Override // xsna.dc4
    public final boolean j() {
        return this.m;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.u;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        xn30 h = h(this, null, oh30Var, false, false, false, 1047551);
        h.x = this.x;
        h.w = this.w;
        h.v = this.v;
        return h;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.dc4
    public final boolean r() {
        return this.p;
    }

    @Override // xsna.suj
    public final int t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartArtistHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", attachName=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", info=");
        sb.append(this.e);
        sb.append(", dialogPeer=");
        sb.append(this.f);
        sb.append(", hasBlur=");
        sb.append(this.g);
        sb.append(", thumbList=");
        sb.append(this.h);
        sb.append(", tracks=");
        sb.append(this.i);
        sb.append(", audioMediator=");
        sb.append(this.j);
        sb.append(", viewType=");
        sb.append(this.k);
        sb.append(", bubbleStyle=");
        sb.append(this.l);
        sb.append(", isMsgFromUser=");
        sb.append(this.m);
        sb.append(", isNewSnippetsEnabled=");
        sb.append(this.n);
        sb.append(", isNextEntryBubbleTransparent=");
        sb.append(this.o);
        sb.append(", msgHasBody=");
        sb.append(this.p);
        sb.append(", msgHasReply=");
        sb.append(this.q);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.r);
        sb.append(", isNextSameMsgId=");
        sb.append(this.s);
        sb.append(", valueNestedLevel=");
        sb.append(this.t);
        sb.append(", inWallPost=");
        return defpackage.q0.a(sb, this.u, ')');
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
