package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class ssr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final BubbleColors f;
    public final BubbleColors g;
    public final int h;
    public final int i;
    public final AdapterEntryType j;
    public final long k;

    public ssr0(String str, String str2, String str3, boolean z, BubbleColors bubbleColors, BubbleColors bubbleColors2, int i, int i2, AdapterEntryType adapterEntryType, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = bubbleColors;
        this.g = bubbleColors2;
        this.h = i;
        this.i = i2;
        this.j = adapterEntryType;
        this.k = j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        vk30 vk30Var = uk30Var.a;
        BubbleColors c = vk30Var.c(0L, true, false);
        BubbleColors c2 = vk30Var.c(0L, true, true);
        int i = vk30Var.b(c, 0, false).a;
        return new ssr0(this.b, this.c, this.d, this.e, c, c2, vk30Var.b(c2, 0, false).a, i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssr0)) {
            return false;
        }
        ssr0 ssr0Var = (ssr0) obj;
        return epx.f(this.b, ssr0Var.b) && epx.f(this.c, ssr0Var.c) && epx.f(this.d, ssr0Var.d) && this.e == ssr0Var.e && epx.f(this.f, ssr0Var.f) && epx.f(this.g, ssr0Var.g) && this.h == ssr0Var.h && this.i == ssr0Var.i && this.j == ssr0Var.j && this.k == ssr0Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + pm0.c(this.j, shy.a(this.i, shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + qoy.b(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31), 31), 31);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VhMsgCallSettingsSnippetItem(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", onlySystemSettingsForce=");
        sb.append(this.e);
        sb.append(", bubbleColorsLight=");
        sb.append(this.f);
        sb.append(", bubbleColorsDark=");
        sb.append(this.g);
        sb.append(", bubbleColorDark=");
        sb.append(this.h);
        sb.append(", bubbleColorLight=");
        sb.append(this.i);
        sb.append(", viewType=");
        sb.append(this.j);
        sb.append(", dateMs=");
        return vu5.a(')', this.k, sb);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.k;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g u(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g B0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g H(Boolean bool, Boolean bool2, Integer num) {
        return this;
    }
}
