package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class ju30 implements ir30 {
    public final jr30 b;
    public final String c;
    public final zh30 d;
    public final AdapterEntryType e;
    public Attach f;

    public ju30(jr30 jr30Var, String str, zh30 zh30Var, AdapterEntryType adapterEntryType) {
        this.b = jr30Var;
        this.c = str;
        this.d = zh30Var;
        this.e = adapterEntryType;
    }

    public static ju30 c(ju30 ju30Var, jr30 jr30Var) {
        return new ju30(jr30Var, ju30Var.c, ju30Var.d, ju30Var.e);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar));
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, uk30Var.i(nsr0Var, gVar2, gVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju30)) {
            return false;
        }
        ju30 ju30Var = (ju30) obj;
        return epx.f(this.b, ju30Var.b) && epx.f(this.c, ju30Var.c) && epx.f(this.d, ju30Var.d) && this.e == ju30Var.e;
    }

    public final int hashCode() {
        int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
        zh30 zh30Var = this.d;
        return this.e.hashCode() + ((a + (zh30Var == null ? 0 : zh30Var.hashCode())) * 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    public final String toString() {
        return "MsgPartViewsAndTimeItem(timeStatus=" + this.b + ", viewsCount=" + this.c + ", msgCounters=" + this.d + ", viewType=" + this.e + ')';
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
}
