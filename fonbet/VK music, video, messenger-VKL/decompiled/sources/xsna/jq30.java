package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class jq30 implements ir30 {
    public final UserId b;
    public final Peer c;
    public final String d;
    public final ImageList e;
    public final boolean f;
    public final boolean g;
    public final AdapterEntryType h;
    public final rxd0 i;
    public Attach j;
    public Msg k;

    public jq30(UserId userId, Peer peer, String str, ImageList imageList, boolean z, boolean z2, AdapterEntryType adapterEntryType, rxd0 rxd0Var) {
        this.b = userId;
        this.c = peer;
        this.d = str;
        this.e = imageList;
        this.f = z;
        this.g = z2;
        this.h = adapterEntryType;
        this.i = rxd0Var;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq30)) {
            return false;
        }
        jq30 jq30Var = (jq30) obj;
        return epx.f(this.b, jq30Var.b) && epx.f(this.c, jq30Var.c) && epx.f(this.d, jq30Var.d) && epx.f(this.e, jq30Var.e) && this.f == jq30Var.f && this.g == jq30Var.g && this.h == jq30Var.h && epx.f(this.i, jq30Var.i);
    }

    public final int hashCode() {
        int c = pm0.c(this.h, qoy.b(qoy.b(fw3.a(urd0.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31, this.d), 31, this.e.b), 31, this.f), 31, this.g), 31);
        rxd0 rxd0Var = this.i;
        return c + (rxd0Var == null ? 0 : rxd0Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        qtd0 Bb = profilesInfo.Bb(new Peer.Channel(this.b.b));
        if (Bb == null) {
            return this;
        }
        jq30 jq30Var = new jq30(this.b, this.c, Bb.name(), Bb.C8(), Bb.q9().b, this.g, this.h, this.i);
        jq30Var.j = this.j;
        return jq30Var;
    }

    public final String toString() {
        return "MsgPartFwdChannelMessageHeaderHolderItem(ownerId=" + this.b + ", parentId=" + this.c + ", channelName=" + this.d + ", avatarImages=" + this.e + ", isVerified=" + this.f + ", hasDonateBadge=" + this.g + ", viewType=" + this.h + ", profileMediators=" + this.i + ')';
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
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
