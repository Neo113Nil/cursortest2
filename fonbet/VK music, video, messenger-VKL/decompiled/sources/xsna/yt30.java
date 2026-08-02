package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class yt30 implements ir30, ol8 {
    public final int A;
    public final boolean B;
    public final abi0 C;
    public final boolean D;
    public Msg E;
    public NestedMsg F;
    public Attach G;
    public final jr30 b;
    public final Peer c;
    public final boolean d;
    public final qtd0 e;
    public final qtd0 f;
    public final g34 g;
    public final int h;
    public final AdapterEntryType i;
    public final oh30 j;
    public final ImageList k;
    public final ImageList l;
    public final int m;
    public final boolean n;
    public final AttachSyncState o;
    public final boolean p;
    public final Peer q;
    public final Peer r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final UserId v;
    public final boolean w;
    public final int x;
    public final int y;
    public final String z;

    public yt30(jr30 jr30Var, Peer peer, boolean z, qtd0 qtd0Var, qtd0 qtd0Var2, g34 g34Var, int i, AdapterEntryType adapterEntryType, oh30 oh30Var, ImageList imageList, ImageList imageList2, int i2, boolean z2, AttachSyncState attachSyncState, boolean z3, Peer peer2, Peer peer3, boolean z4, boolean z5, boolean z6, UserId userId, boolean z7, int i3, int i4, String str, int i5, boolean z8, abi0 abi0Var, boolean z9) {
        this.b = jr30Var;
        this.c = peer;
        this.d = z;
        this.e = qtd0Var;
        this.f = qtd0Var2;
        this.g = g34Var;
        this.h = i;
        this.i = adapterEntryType;
        this.j = oh30Var;
        this.k = imageList;
        this.l = imageList2;
        this.m = i2;
        this.n = z2;
        this.o = attachSyncState;
        this.p = z3;
        this.q = peer2;
        this.r = peer3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = userId;
        this.w = z7;
        this.x = i3;
        this.y = i4;
        this.z = str;
        this.A = i5;
        this.B = z8;
        this.C = abi0Var;
        this.D = z9;
    }

    public static yt30 c(yt30 yt30Var, jr30 jr30Var, boolean z, qtd0 qtd0Var, qtd0 qtd0Var2, g34 g34Var, oh30 oh30Var, int i) {
        return new yt30((i & 1) != 0 ? yt30Var.b : jr30Var, yt30Var.c, (i & 4) != 0 ? yt30Var.d : z, (i & 16) != 0 ? yt30Var.e : qtd0Var, (i & 32) != 0 ? yt30Var.f : qtd0Var2, (i & 64) != 0 ? yt30Var.g : g34Var, yt30Var.h, yt30Var.i, (i & 512) != 0 ? yt30Var.j : oh30Var, yt30Var.k, yt30Var.l, yt30Var.m, yt30Var.n, yt30Var.o, yt30Var.p, yt30Var.q, yt30Var.r, yt30Var.s, yt30Var.t, yt30Var.u, yt30Var.v, yt30Var.w, yt30Var.x, yt30Var.y, yt30Var.z, yt30Var.A, yt30Var.B, yt30Var.C, yt30Var.D);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.j;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.G;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        yt30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.q, null, null, uk30Var.P, null, 1073741754);
        c.G = this.G;
        c.F = this.F;
        c.E = this.E;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        yt30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), false, null, null, null, null, 1073741822);
        c.G = this.G;
        c.F = this.F;
        c.E = this.E;
        return c;
    }

    public final boolean e() {
        abi0 abi0Var = this.C;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.A));
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yt30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yt30 yt30Var = (yt30) obj;
        return epx.f(this.b, yt30Var.b) && epx.f(this.c, yt30Var.c) && this.d == yt30Var.d && e() == yt30Var.e() && epx.f(this.e, yt30Var.e) && epx.f(this.f, yt30Var.f) && epx.f(this.g, yt30Var.g) && this.h == yt30Var.h && this.i == yt30Var.i && epx.f(this.j, yt30Var.j) && epx.f(this.k, yt30Var.k) && epx.f(this.l, yt30Var.l) && this.m == yt30Var.m && this.n == yt30Var.n && this.o == yt30Var.o && this.p == yt30Var.p && epx.f(this.q, yt30Var.q) && epx.f(this.r, yt30Var.r) && this.s == yt30Var.s && this.t == yt30Var.t && this.u == yt30Var.u && epx.f(this.v, yt30Var.v) && this.w == yt30Var.w && this.x == yt30Var.x && this.y == yt30Var.y && epx.f(this.z, yt30Var.z) && this.A == yt30Var.A && this.B == yt30Var.B;
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(e()) + qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d)) * 31;
        qtd0 qtd0Var = this.e;
        int hashCode2 = (hashCode + (qtd0Var != null ? qtd0Var.hashCode() : 0)) * 31;
        qtd0 qtd0Var2 = this.f;
        int hashCode3 = (hashCode2 + (qtd0Var2 != null ? qtd0Var2.hashCode() : 0)) * 31;
        g34 g34Var = this.g;
        int c = pm0.c(this.i, (((hashCode3 + (g34Var != null ? g34Var.hashCode() : 0)) * 31) + this.h) * 31, 31);
        oh30 oh30Var = this.j;
        return Boolean.hashCode(this.B) + ((urd0.a((((qoy.b(bh10.a(qoy.b(qoy.b(qoy.b(bh10.a(bh10.a(qoy.b(bo.a(this.o, qoy.b((fw3.a(fw3.a((c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31, this.k.b), 31, this.l.b) + this.m) * 31, 31, this.n), 31), 31, this.p), 31, this.q.b), 31, this.r.b), 31, this.s), 31, this.t), 31, this.u), 31, this.v.b), 31, this.w) + this.x) * 31) + this.y) * 31, 31, this.z) + this.A) * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        yt30 c = c(this, null, false, null, null, null, oh30Var, 1073741311);
        c.G = this.G;
        c.F = this.F;
        c.E = this.E;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        yt30 c = c(this, null, false, profilesInfo.Bb(this.r), profilesInfo.Bb(this.q), null, null, 1073741775);
        c.G = this.G;
        c.F = this.F;
        c.E = this.E;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartStoryHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", currentMember=");
        sb.append(this.c);
        sb.append(", isDialogBackgroundSet=");
        sb.append(this.d);
        sb.append(", isSelectedOld=false, profileFrom=");
        sb.append(this.e);
        sb.append(", profileOwner=");
        sb.append(this.f);
        sb.append(", progressMediator=");
        sb.append(this.g);
        sb.append(", valueNestedLevel=");
        sb.append(this.h);
        sb.append(", viewType=");
        sb.append(this.i);
        sb.append(", bubbleStyle=");
        sb.append(this.j);
        sb.append(", remoteImages=");
        sb.append(this.k);
        sb.append(", localImages=");
        sb.append(this.l);
        sb.append(", attachLocalId=");
        sb.append(this.m);
        sb.append(", isAttachOneTime=");
        sb.append(this.n);
        sb.append(", syncState=");
        sb.append(this.o);
        sb.append(", isMsgFromSelf=");
        sb.append(this.p);
        sb.append(", attachOwnerPeer=");
        sb.append(this.q);
        sb.append(", msgFromPeer=");
        sb.append(this.r);
        sb.append(", isAttachExpired=");
        sb.append(this.s);
        sb.append(", isAttachDeleted=");
        sb.append(this.t);
        sb.append(", isAttachCanSee=");
        sb.append(this.u);
        sb.append(", attachStoryOwnerId=");
        sb.append(this.v);
        sb.append(", isAttachExpiredByTime=");
        sb.append(this.w);
        sb.append(", storyNarrativesCount=");
        sb.append(this.x);
        sb.append(", msgAttachListSize=");
        sb.append(this.y);
        sb.append(", msgBody=");
        sb.append(this.z);
        sb.append(", msgLocalId=");
        sb.append(this.A);
        sb.append(", isActiveStory=");
        sb.append(this.B);
        sb.append(", selectedMessagesMediator=");
        sb.append(this.C);
        sb.append(", isCanRepostMention=");
        return defpackage.q0.a(sb, this.D, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    public /* synthetic */ yt30(boolean z, qtd0 qtd0Var, qtd0 qtd0Var2, g34 g34Var, int i, AdapterEntryType adapterEntryType, ImageList imageList, ImageList imageList2, int i2, boolean z2, AttachSyncState attachSyncState, boolean z3, Peer peer, Peer peer2, boolean z4, boolean z5, boolean z6, UserId userId, boolean z7, int i3, int i4, String str, int i5, boolean z8, abi0 abi0Var, boolean z9) {
        this(new jr30(0), Peer.Unknown.e, z, qtd0Var, qtd0Var2, g34Var, i, adapterEntryType, null, imageList, imageList2, i2, z2, attachSyncState, z3, peer, peer2, z4, z5, z6, userId, z7, i3, i4, str, i5, z8, abi0Var, z9);
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }
}
