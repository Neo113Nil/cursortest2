package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class jo30 implements ir30 {
    public final eew b;
    public final CharSequence c;
    public final int d;
    public final int e;
    public final CnvMsgId f;
    public final AdapterEntryType g;
    public final boolean h;
    public Attach i;

    public jo30(eew eewVar, CharSequence charSequence, int i, int i2, CnvMsgId cnvMsgId, AdapterEntryType adapterEntryType, boolean z) {
        this.b = eewVar;
        this.c = charSequence;
        this.d = i;
        this.e = i2;
        this.f = cnvMsgId;
        this.g = adapterEntryType;
        this.h = z;
    }

    public static jo30 c(jo30 jo30Var, eew eewVar, boolean z, int i) {
        if ((i & 1) != 0) {
            eewVar = jo30Var.b;
        }
        eew eewVar2 = eewVar;
        CharSequence charSequence = jo30Var.c;
        int i2 = jo30Var.d;
        int i3 = jo30Var.e;
        CnvMsgId cnvMsgId = jo30Var.f;
        AdapterEntryType adapterEntryType = jo30Var.g;
        if ((i & 64) != 0) {
            z = jo30Var.h;
        }
        return new jo30(eewVar2, charSequence, i2, i3, cnvMsgId, adapterEntryType, z);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jo30 c = c(this, uk30Var.I, false, 254);
        c.i = this.i;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        jo30 c = c(this, null, bool != null ? bool.booleanValue() : this.h, 191);
        c.i = this.i;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo30)) {
            return false;
        }
        jo30 jo30Var = (jo30) obj;
        return epx.f(this.b, jo30Var.b) && this.c.equals(jo30Var.c) && this.d == jo30Var.d && this.e == jo30Var.e && this.f.equals(jo30Var.f) && this.g == jo30Var.g && this.h == jo30Var.h;
    }

    public final int hashCode() {
        eew eewVar = this.b;
        return Boolean.hashCode(false) + qoy.b(pm0.c(this.g, (this.f.hashCode() + shy.a(this.e, shy.a(this.d, u11.c((eewVar == null ? 0 : eewVar.hashCode()) * 31, 31, this.c), 31), 31)) * 31, 31), 31, this.h);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartBlockedHolderItem(uiReporters=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append((Object) this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", msgLocalId=");
        sb.append(this.e);
        sb.append(", msgId=");
        sb.append(this.f);
        sb.append(", viewType=");
        sb.append(this.g);
        sb.append(", bubbleFitAllWidth=");
        return n23.b(sb, this.h, ", disableMaxHeight=false)");
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
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
