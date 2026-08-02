package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class po30 implements ir30, ol8 {
    public final jr30 b;
    public final Peer c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final CallState h;
    public final AdapterEntryType i;
    public final oh30 j;
    public Msg k;
    public NestedMsg l;
    public Attach m;

    public po30(jr30 jr30Var, Peer peer, int i, boolean z, boolean z2, int i2, CallState callState, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = peer;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = i2;
        this.h = callState;
        this.i = adapterEntryType;
        this.j = oh30Var;
    }

    public static po30 c(po30 po30Var, jr30 jr30Var, Peer peer, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = po30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        if ((i & 2) != 0) {
            peer = po30Var.c;
        }
        Peer peer2 = peer;
        int i2 = po30Var.d;
        boolean z = po30Var.e;
        boolean z2 = po30Var.f;
        int i3 = po30Var.g;
        CallState callState = po30Var.h;
        AdapterEntryType adapterEntryType = po30Var.i;
        if ((i & 256) != 0) {
            oh30Var = po30Var.j;
        }
        return new po30(jr30Var2, peer2, i2, z, z2, i3, callState, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.j;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.m;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        po30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.l, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        c.m = this.m;
        c.l = this.l;
        c.k = this.k;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        po30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 510);
        c.m = this.m;
        c.l = this.l;
        c.k = this.k;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po30)) {
            return false;
        }
        po30 po30Var = (po30) obj;
        return epx.f(this.b, po30Var.b) && epx.f(this.c, po30Var.c) && this.d == po30Var.d && this.e == po30Var.e && this.f == po30Var.f && this.g == po30Var.g && this.h == po30Var.h && this.i == po30Var.i && epx.f(this.j, po30Var.j);
    }

    public final int hashCode() {
        int c = pm0.c(this.i, (this.h.hashCode() + shy.a(this.g, qoy.b(qoy.b(shy.a(this.d, bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31), 31, this.e), 31, this.f), 31)) * 31, 31);
        oh30 oh30Var = this.j;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        po30 c = c(this, null, null, oh30Var, 255);
        c.m = this.m;
        c.l = this.l;
        c.k = this.k;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartCallHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", currentMember=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", isCallOutgoing=");
        sb.append(this.e);
        sb.append(", isVideo=");
        sb.append(this.f);
        sb.append(", callDuration=");
        sb.append(this.g);
        sb.append(", callState=");
        sb.append(this.h);
        sb.append(", viewType=");
        sb.append(this.i);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.j, ')');
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
