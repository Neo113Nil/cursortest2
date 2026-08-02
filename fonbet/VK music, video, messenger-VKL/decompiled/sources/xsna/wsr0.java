package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatAvatarUpdate;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class wsr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g {
    public final boolean b;
    public final qtd0 c;
    public final Peer d;
    public final boolean e;
    public final ImageList f;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c g;
    public final AdapterEntryType h;
    public final long i;
    public final oh30 j;
    public MsgChatAvatarUpdate k;

    public wsr0(boolean z, qtd0 qtd0Var, Peer peer, boolean z2, ImageList imageList, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, AdapterEntryType adapterEntryType, long j, oh30 oh30Var) {
        this.b = z;
        this.c = qtd0Var;
        this.d = peer;
        this.e = z2;
        this.f = imageList;
        this.g = cVar;
        this.h = adapterEntryType;
        this.i = j;
        this.j = oh30Var;
    }

    public static wsr0 a(wsr0 wsr0Var, boolean z, qtd0 qtd0Var, boolean z2, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            z = wsr0Var.b;
        }
        return new wsr0(z, (i & 2) != 0 ? wsr0Var.c : qtd0Var, wsr0Var.d, (i & 8) != 0 ? wsr0Var.e : z2, wsr0Var.f, wsr0Var.g, wsr0Var.h, wsr0Var.i, (i & 512) != 0 ? wsr0Var.j : oh30Var);
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
        return this.g;
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
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.k;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        wsr0 a = a(this, uk30Var.q, uk30Var.e.Bb(this.d), uk30Var.t, null, 1012);
        a.k = this.k;
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsr0)) {
            return false;
        }
        wsr0 wsr0Var = (wsr0) obj;
        return this.b == wsr0Var.b && epx.f(this.c, wsr0Var.c) && epx.f(this.d, wsr0Var.d) && this.e == wsr0Var.e && epx.f(this.f, wsr0Var.f) && this.g.equals(wsr0Var.g) && this.h == wsr0Var.h && this.i == wsr0Var.i && epx.f(this.j, wsr0Var.j);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        qtd0 qtd0Var = this.c;
        int hashCode2 = (hashCode + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.d;
        int a = bh10.a(pm0.c(this.h, (this.g.hashCode() + fw3.a(qoy.b((hashCode2 + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, this.e), 961, this.f.b)) * 31, 31), 31, this.i);
        oh30 oh30Var = this.j;
        return a + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        wsr0 a = a(this, false, null, false, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        a.k = this.k;
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
        StringBuilder sb = new StringBuilder("VhMsgChatAvatarUpdateItem(isBackgroundSet=");
        sb.append(this.b);
        sb.append(", msgFromProfile=");
        sb.append(this.c);
        sb.append(", memberFrom=");
        sb.append(this.d);
        sb.append(", isChannel=");
        sb.append(this.e);
        sb.append(", avatar=");
        sb.append(this.f);
        sb.append(", msg=null, msgMeta=");
        sb.append(this.g);
        sb.append(", viewType=");
        sb.append(this.h);
        sb.append(", dateMs=");
        sb.append(this.i);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.j, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.i;
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
