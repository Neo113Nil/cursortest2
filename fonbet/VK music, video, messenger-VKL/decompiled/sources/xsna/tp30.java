package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class tp30 implements ir30, ol8 {
    public final jr30 b;
    public final String c;
    public final String d;
    public final int e;
    public final AdapterEntryType f;
    public final oh30 g;
    public final int h;

    public tp30(jr30 jr30Var, String str, String str2, int i, AdapterEntryType adapterEntryType, oh30 oh30Var, int i2) {
        this.b = jr30Var;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = adapterEntryType;
        this.g = oh30Var;
        this.h = i2;
    }

    public static tp30 c(tp30 tp30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = tp30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        String str = tp30Var.c;
        String str2 = tp30Var.d;
        int i2 = tp30Var.e;
        AdapterEntryType adapterEntryType = tp30Var.f;
        if ((i & 32) != 0) {
            oh30Var = tp30Var.g;
        }
        return new tp30(jr30Var2, str, str2, i2, adapterEntryType, oh30Var, tp30Var.h);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.g;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 510);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 510);
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return c(this, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tp30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tp30 tp30Var = (tp30) obj;
        tp30Var.getClass();
        return this.h == tp30Var.h && epx.f(this.b, tp30Var.b) && this.c.equals(tp30Var.c) && epx.f(this.d, tp30Var.d) && this.f == tp30Var.f && epx.f(this.g, tp30Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ar.a(this.b, (qoy.b(Boolean.hashCode(false) * 31, 31, false) + this.h) * 31, 31)) * 31;
        String str = this.d;
        int c = pm0.c(this.f, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        oh30 oh30Var = this.g;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, null, oh30Var, 479);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartDonateButtonHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append((Object) this.c);
        sb.append(", buttonUrl=");
        sb.append(this.d);
        sb.append(", cnvMsgId=");
        sb.append(this.e);
        sb.append(", viewType=");
        sb.append(this.f);
        sb.append(", bubbleStyle=");
        sb.append(this.g);
        sb.append(", isPrevSameMsgId=false, isNextSameMsgId=false, valueNestedLevel=");
        return vu5.b(sb, this.h, ')');
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
}
