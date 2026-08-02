package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class et30 implements ir30 {
    public final AdapterEntryType b;
    public final String c;
    public final String d;
    public final boolean e;
    public Attach f;

    public et30(AdapterEntryType adapterEntryType, String str, String str2, boolean z) {
        this.b = adapterEntryType;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et30)) {
            return false;
        }
        et30 et30Var = (et30) obj;
        return this.b == et30Var.b && epx.f(this.c, et30Var.c) && epx.f(this.d, et30Var.d) && this.e == et30Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartQuestionHolderItem(viewType=");
        sb.append(this.b);
        sb.append(", question=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isIncoming=");
        return defpackage.q0.a(sb, this.e, ')');
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
