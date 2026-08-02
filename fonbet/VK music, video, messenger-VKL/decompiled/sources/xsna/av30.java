package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class av30 implements ir30, nl8 {
    public final boolean b;
    public final int c;
    public final gl8 d;
    public final gl8 e;
    public final Peer f;
    public final nmx0 g;
    public final JSONObject h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final AdapterEntryType m;
    public Attach n;

    public av30(boolean z, int i, gl8 gl8Var, gl8 gl8Var2, Peer peer, nmx0 nmx0Var, JSONObject jSONObject, int i2, boolean z2, boolean z3, long j, AdapterEntryType adapterEntryType) {
        this.b = z;
        this.c = i;
        this.d = gl8Var;
        this.e = gl8Var2;
        this.f = peer;
        this.g = nmx0Var;
        this.h = jSONObject;
        this.i = i2;
        this.j = z2;
        this.k = z3;
        this.l = j;
        this.m = adapterEntryType;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.n;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.l;
        boolean z = this.j;
        BubbleColors c = vk30Var.c(j, z, true);
        BubbleColors c2 = vk30Var.c(j, z, false);
        boolean e = uk30Var.e(z, this.b);
        int i = this.c;
        boolean z2 = this.k;
        av30 av30Var = new av30(e, this.c, vk30Var.b(c, i, z2), vk30Var.b(c2, i, z2), uk30Var.h, uk30Var.M, this.h, this.i, this.j, this.k, this.l, this.m);
        av30Var.n = this.n;
        return av30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av30)) {
            return false;
        }
        av30 av30Var = (av30) obj;
        return this.b == av30Var.b && this.c == av30Var.c && epx.f(this.d, av30Var.d) && epx.f(this.e, av30Var.e) && epx.f(this.f, av30Var.f) && epx.f(this.g, av30Var.g) && epx.f(this.h, av30Var.h) && this.i == av30Var.i && this.j == av30Var.j && this.k == av30Var.k && this.l == av30Var.l && this.m == av30Var.m;
    }

    public final int hashCode() {
        int a = bh10.a((this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, Boolean.hashCode(this.b) * 31, 31)) * 31)) * 31, 31, this.f.b);
        nmx0 nmx0Var = this.g;
        return this.m.hashCode() + bh10.a(qoy.b(qoy.b(shy.a(this.i, (this.h.hashCode() + ((a + (nmx0Var == null ? 0 : nmx0Var.hashCode())) * 31)) * 31, 31), 31, this.j), 31, this.k), 31, this.l);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.m;
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.b;
    }

    public final String toString() {
        return "MsgPartWidgetHolderItem(isAvatarLayout=" + this.b + ", valueNestedLevel=" + this.c + ", bubbleColorDark=" + this.d + ", bubbleColorLight=" + this.e + ", dialogPeer=" + this.f + ", widgetConstructor=" + this.g + ", widget=" + this.h + ", msgLocalId=" + this.i + ", msgIsIncoming=" + this.j + ", isValueMsgExpirable=" + this.k + ", valueMsgUniqSenderThemeChatId=" + this.l + ", viewType=" + this.m + ')';
    }

    @Override // xsna.nl8
    public final void Z(int i) {
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
