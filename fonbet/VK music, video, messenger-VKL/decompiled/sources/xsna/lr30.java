package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class lr30 implements ir30 {
    public final boolean b;
    public final BotKeyboard c;
    public final long d;
    public final int e;
    public final AdapterEntryType f;

    public lr30(boolean z, BotKeyboard botKeyboard, long j, int i, AdapterEntryType adapterEntryType) {
        this.b = z;
        this.c = botKeyboard;
        this.d = j;
        this.e = i;
        this.f = adapterEntryType;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return new lr30(uk30Var.q, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr30)) {
            return false;
        }
        lr30 lr30Var = (lr30) obj;
        return this.b == lr30Var.b && epx.f(this.c, lr30Var.c) && this.d == lr30Var.d && this.e == lr30Var.e && this.f == lr30Var.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        BotKeyboard botKeyboard = this.c;
        return this.f.hashCode() + shy.a(this.e, bh10.a((hashCode + (botKeyboard == null ? 0 : botKeyboard.hashCode())) * 31, 31, this.d), 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    public final String toString() {
        return "MsgPartKeyboardHolderItem(isDialogBackgroundSet=" + this.b + ", keyboard=" + this.c + ", msgDialogId=" + this.d + ", msgCnvMsgId=" + this.e + ", viewType=" + this.f + ')';
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
