package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class co30 implements ir30, ol8, dc4 {
    public final MusicTrack b;
    public final jr30 c;
    public final Peer d;
    public final kq4 e;
    public final com.vk.im.engine.models.messages.a f;
    public final String g;
    public final int h;
    public final long i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final AdapterEntryType p;
    public final oh30 q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public Msg v;
    public NestedMsg w;
    public Attach x;

    public co30(MusicTrack musicTrack, jr30 jr30Var, Peer peer, kq4 kq4Var, com.vk.im.engine.models.messages.a aVar, String str, int i, long j, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z6, boolean z7, int i3, boolean z8) {
        this.b = musicTrack;
        this.c = jr30Var;
        this.d = peer;
        this.e = kq4Var;
        this.f = aVar;
        this.g = str;
        this.h = i;
        this.i = j;
        this.j = i2;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = adapterEntryType;
        this.q = oh30Var;
        this.r = z6;
        this.s = z7;
        this.t = i3;
        this.u = z8;
    }

    public static co30 h(co30 co30Var, jr30 jr30Var, Peer peer, kq4 kq4Var, boolean z, oh30 oh30Var, boolean z2, boolean z3, int i) {
        AdapterEntryType adapterEntryType;
        oh30 oh30Var2;
        MusicTrack musicTrack = co30Var.b;
        jr30 jr30Var2 = (i & 2) != 0 ? co30Var.c : jr30Var;
        Peer peer2 = (i & 4) != 0 ? co30Var.d : peer;
        kq4 kq4Var2 = (i & 8) != 0 ? co30Var.e : kq4Var;
        com.vk.im.engine.models.messages.a aVar = co30Var.f;
        jr30 jr30Var3 = jr30Var2;
        Peer peer3 = peer2;
        kq4 kq4Var3 = kq4Var2;
        String str = co30Var.g;
        int i2 = co30Var.h;
        long j = co30Var.i;
        int i3 = co30Var.j;
        boolean z4 = co30Var.k;
        boolean z5 = co30Var.l;
        boolean z6 = (i & 2048) != 0 ? co30Var.m : z;
        boolean z7 = co30Var.n;
        boolean z8 = z6;
        boolean z9 = co30Var.o;
        AdapterEntryType adapterEntryType2 = co30Var.p;
        if ((i & 32768) != 0) {
            adapterEntryType = adapterEntryType2;
            oh30Var2 = co30Var.q;
        } else {
            adapterEntryType = adapterEntryType2;
            oh30Var2 = oh30Var;
        }
        return new co30(musicTrack, jr30Var3, peer3, kq4Var3, aVar, str, i2, j, i3, z4, z5, z8, z7, z9, adapterEntryType, oh30Var2, (i & 65536) != 0 ? co30Var.r : z2, (i & 131072) != 0 ? co30Var.s : z3, co30Var.t, co30Var.u);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.r;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.q;
    }

    @Override // xsna.dc4
    public final boolean T() {
        return this.o;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.x;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        co30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.h, uk30Var.K, false, null, false, false, 1048561);
        h.x = this.x;
        h.w = this.w;
        h.v = this.v;
        return h;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        int i = this.j;
        boolean z = false;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i)) : false;
        if (gVar2 != null && gVar2.H0() && this.k) {
            z = true;
        }
        co30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, z, null, z0, z02, 849917);
        h.x = this.x;
        h.w = this.w;
        h.v = this.v;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co30)) {
            return false;
        }
        co30 co30Var = (co30) obj;
        return epx.f(this.b, co30Var.b) && epx.f(this.c, co30Var.c) && epx.f(this.d, co30Var.d) && epx.f(this.e, co30Var.e) && epx.f(this.f, co30Var.f) && epx.f(this.g, co30Var.g) && this.h == co30Var.h && this.i == co30Var.i && this.j == co30Var.j && this.k == co30Var.k && this.l == co30Var.l && this.m == co30Var.m && this.n == co30Var.n && this.o == co30Var.o && this.p == co30Var.p && epx.f(this.q, co30Var.q) && this.r == co30Var.r && this.s == co30Var.s && this.t == co30Var.t && this.u == co30Var.u;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.s;
    }

    public final int hashCode() {
        int a = bh10.a(ar.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b);
        kq4 kq4Var = this.e;
        int c = pm0.c(this.p, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.j, bh10.a(shy.a(this.h, urd0.a((this.f.hashCode() + ((a + (kq4Var == null ? 0 : kq4Var.hashCode())) * 31)) * 31, 31, this.g), 31), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31);
        oh30 oh30Var = this.q;
        return Boolean.hashCode(this.u) + shy.a(this.t, qoy.b(qoy.b((c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31, this.r), 31, this.s), 31);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.m;
    }

    @Override // xsna.dc4
    public final boolean j() {
        return this.k;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.u;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        co30 h = h(this, null, null, null, false, oh30Var, false, false, 1015807);
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
        return this.n;
    }

    @Override // xsna.suj
    public final int t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartAudioHolderItem(musicTrack=");
        sb.append(this.b);
        sb.append(", timeStatus=");
        sb.append(this.c);
        sb.append(", dialogPeer=");
        sb.append(this.d);
        sb.append(", audioMediator=");
        sb.append(this.e);
        sb.append(", itemHolder=");
        sb.append(this.f);
        sb.append(", attachTitle=");
        sb.append(this.g);
        sb.append(", contentRestriction=");
        sb.append(this.h);
        sb.append(", attachId=");
        sb.append(this.i);
        sb.append(", msgLocalId=");
        sb.append(this.j);
        sb.append(", isMsgFromUser=");
        sb.append(this.k);
        sb.append(", isNewSnippetsEnabled=");
        sb.append(this.l);
        sb.append(", isNextEntryBubbleTransparent=");
        sb.append(this.m);
        sb.append(", msgHasBody=");
        sb.append(this.n);
        sb.append(", msgHasReply=");
        sb.append(this.o);
        sb.append(", viewType=");
        sb.append(this.p);
        sb.append(", bubbleStyle=");
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
