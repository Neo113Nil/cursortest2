package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class zo30 implements ir30 {
    public final Peer b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final AdapterEntryType f;
    public Attach g;

    public zo30(Peer peer, String str, boolean z, boolean z2, AdapterEntryType adapterEntryType) {
        this.b = peer;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo30)) {
            return false;
        }
        zo30 zo30Var = (zo30) obj;
        return epx.f(this.b, zo30Var.b) && epx.f(this.c, zo30Var.c) && this.d == zo30Var.d && this.e == zo30Var.e && this.f == zo30Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        String str;
        Peer peer = this.b;
        qtd0 Bb = profilesInfo.Bb(peer);
        String name = Bb != null ? Bb.name() : null;
        qtd0 Bb2 = profilesInfo.Bb(peer);
        String Ra = Bb2 != null ? Bb2.Ra() : null;
        long j = peer.d;
        String obj = name != null ? drm0.p0(name).toString() : null;
        if (obj == null || drm0.N(obj)) {
            if (Ra != null && !drm0.N(Ra)) {
                str = Ra;
                zo30 zo30Var = new zo30(this.b, str, this.d, this.e, this.f);
                zo30Var.g = this.g;
                return zo30Var;
            }
            name = defpackage.k0.a(j, "id");
        }
        str = name;
        zo30 zo30Var2 = new zo30(this.b, str, this.d, this.e, this.f);
        zo30Var2.g = this.g;
        return zo30Var2;
    }

    public final String toString() {
        return "MsgPartChannelPostHeaderHolderItem(authorId=" + this.b + ", authorDisplayedName=" + this.c + ", isAuthorAd=" + this.d + ", isDonut=" + this.e + ", viewType=" + this.f + ')';
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
