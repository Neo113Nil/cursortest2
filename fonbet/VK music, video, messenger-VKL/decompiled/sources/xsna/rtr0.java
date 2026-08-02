package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatStyleUpdate;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class rtr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, yqn0 {
    public final boolean b;
    public final boolean c;
    public final qtd0 d;
    public final Peer e;
    public final String f;
    public final boolean g;
    public final ipo0 h;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c i;
    public final AdapterEntryType j;
    public final long k;
    public final oh30 l;
    public MsgChatStyleUpdate m;

    public rtr0(boolean z, boolean z2, qtd0 qtd0Var, Peer peer, String str, boolean z3, ipo0 ipo0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = z2;
        this.d = qtd0Var;
        this.e = peer;
        this.f = str;
        this.g = z3;
        this.h = ipo0Var;
        this.i = cVar;
        this.j = adapterEntryType;
        this.k = j;
        this.l = oh30Var;
    }

    public static rtr0 a(rtr0 rtr0Var, boolean z, boolean z2, qtd0 qtd0Var, boolean z3, oh30 oh30Var, int i) {
        return new rtr0((i & 1) != 0 ? rtr0Var.b : z, (i & 4) != 0 ? rtr0Var.c : z2, (i & 8) != 0 ? rtr0Var.d : qtd0Var, rtr0Var.e, rtr0Var.f, (i & 128) != 0 ? rtr0Var.g : z3, rtr0Var.h, rtr0Var.i, rtr0Var.j, rtr0Var.k, (i & 4096) != 0 ? rtr0Var.l : oh30Var);
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
        return this.i;
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
        return this.l;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.m;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        qtd0 Bb = uk30Var.e.Bb(this.e);
        rtr0 a = a(this, uk30Var.s, uk30Var.q, Bb, uk30Var.A, null, 8050);
        a.m = this.m;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtr0)) {
            return false;
        }
        rtr0 rtr0Var = (rtr0) obj;
        return this.b == rtr0Var.b && this.c == rtr0Var.c && epx.f(this.d, rtr0Var.d) && epx.f(this.e, rtr0Var.e) && epx.f(this.f, rtr0Var.f) && this.g == rtr0Var.g && epx.f(this.h, rtr0Var.h) && this.i.equals(rtr0Var.i) && this.j == rtr0Var.j && this.k == rtr0Var.k && epx.f(this.l, rtr0Var.l);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, false), 31, this.c);
        qtd0 qtd0Var = this.d;
        int hashCode = (b + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.e;
        int hashCode2 = (hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 961;
        String str = this.f;
        int b2 = qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        ipo0 ipo0Var = this.h;
        int a = bh10.a(pm0.c(this.j, (this.i.hashCode() + ((b2 + (ipo0Var == null ? 0 : ipo0Var.hashCode())) * 31)) * 31, 31), 31, this.k);
        oh30 oh30Var = this.l;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        rtr0 a = a(this, false, false, null, false, oh30Var, 4095);
        a.m = this.m;
        return a;
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
        StringBuilder sb = new StringBuilder("VhMsgChatStyleUpdateItem(canChangeTheme=");
        sb.append(this.b);
        sb.append(", isChatThemeOverriding=false, isBackgroundSet=");
        sb.append(this.c);
        sb.append(", msgFromProfile=");
        sb.append(this.d);
        sb.append(", from=");
        sb.append(this.e);
        sb.append(", styleName=null, styleId=");
        sb.append(this.f);
        sb.append(", isChangeStyleAvailable=");
        sb.append(this.g);
        sb.append(", themeHelperMediator=");
        sb.append(this.h);
        sb.append(", msgMeta=");
        sb.append(this.i);
        sb.append(", viewType=");
        sb.append(this.j);
        sb.append(", dateMs=");
        sb.append(this.k);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.l, ')');
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
