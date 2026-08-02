package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class hs30 implements ir30 {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final AdapterEntryType i;
    public Attach j;

    public hs30(int i, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, AdapterEntryType adapterEntryType) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = z4;
        this.h = z5;
        this.i = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs30)) {
            return false;
        }
        hs30 hs30Var = (hs30) obj;
        return this.b == hs30Var.b && this.c == hs30Var.c && this.d == hs30Var.d && this.e == hs30Var.e && epx.f(this.f, hs30Var.f) && this.g == hs30Var.g && this.h == hs30Var.h && this.i == hs30Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + qoy.b(qoy.b(urd0.a(qoy.b(qoy.b(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    public final String toString() {
        return "MsgPartMsgTranscriptHolderItem(msgLocalId=" + this.b + ", isTranscriptDone=" + this.c + ", isTranscriptInProgress=" + this.d + ", isTranscriptUnavailable=" + this.e + ", transcript=" + this.f + ", isTranscriptEdited=" + this.g + ", isAttachVideoMsg=" + this.h + ", viewType=" + this.i + ')';
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
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
