package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class js30 implements ir30 {
    public final boolean b;
    public final com.vk.im.engine.models.c c;
    public final Peer d;
    public final boolean e;
    public final boolean f;
    public final Peer g;
    public final int h;
    public final pzv i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Msg m;
    public final AdapterEntryType n;
    public Attach o;

    public js30(boolean z, com.vk.im.engine.models.c cVar, Peer peer, boolean z2, boolean z3, Peer peer2, int i, pzv pzvVar, boolean z4, boolean z5, boolean z6, Msg msg, AdapterEntryType adapterEntryType) {
        this.b = z;
        this.c = cVar;
        this.d = peer;
        this.e = z2;
        this.f = z3;
        this.g = peer2;
        this.h = i;
        this.i = pzvVar;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = msg;
        this.n = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.o;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        boolean z = uk30Var.q;
        Peer peer = uk30Var.l;
        Peer peer2 = uk30Var.h;
        int i = uk30Var.j;
        boolean z2 = uk30Var.z;
        js30 js30Var = new js30(z, uk30Var.G.c(), peer, uk30Var.y, z2, peer2, i, uk30Var.H, this.j, this.k, this.l, this.m, this.n);
        js30Var.o = this.o;
        return js30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js30)) {
            return false;
        }
        js30 js30Var = (js30) obj;
        return this.b == js30Var.b && epx.f(this.c, js30Var.c) && epx.f(this.d, js30Var.d) && this.e == js30Var.e && this.f == js30Var.f && epx.f(this.g, js30Var.g) && this.h == js30Var.h && epx.f(this.i, js30Var.i) && this.j == js30Var.j && this.k == js30Var.k && this.l == js30Var.l && epx.f(this.m, js30Var.m) && this.n == js30Var.n;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.i.hashCode() + shy.a(this.h, bh10.a(qoy.b(qoy.b(bh10.a((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d.b), 31, this.e), 31, this.f), 31, this.g.b), 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
        Msg msg = this.m;
        return this.n.hashCode() + ((b + (msg == null ? 0 : msg.hashCode())) * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.n;
    }

    public final String toString() {
        return "MsgPartMsgTranscriptionRateHolderItem(isDialogBackgroundSet=" + this.b + ", experiments=" + this.c + ", currentMember=" + this.d + ", canWrite=" + this.e + ", msgRequestStatusIsSuccessful=" + this.f + ", dialogPeer=" + this.g + ", dialogPinnedMsgCnvId=" + this.h + ", config=" + this.i + ", isTranscriptRateSent=" + this.j + ", isTranscriptNotEdited=" + this.k + ", hasNegativeTranscriptionRate=" + this.l + ", msg=" + this.m + ", viewType=" + this.n + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
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

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
