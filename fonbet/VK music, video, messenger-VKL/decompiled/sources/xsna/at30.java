package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.polls.Poll;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class at30 implements ir30, suj, tuj {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final Peer f;
    public final CnvMsgId g;
    public final Poll h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final AdapterEntryType m;
    public final abi0 n;
    public final kqb0 o;
    public Msg p;
    public NestedMsg q;
    public Attach r;

    public at30(boolean z, boolean z2, int i, boolean z3, Peer peer, CnvMsgId cnvMsgId, Poll poll, int i2, boolean z4, boolean z5, boolean z6, AdapterEntryType adapterEntryType, abi0 abi0Var, kqb0 kqb0Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = peer;
        this.g = cnvMsgId;
        this.h = poll;
        this.i = i2;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = adapterEntryType;
        this.n = abi0Var;
        this.o = kqb0Var;
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.r;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // xsna.ir30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        boolean z;
        boolean z2;
        oh30 M0;
        int i = this.i;
        boolean z0 = gVar != null ? gVar.z0(super.m(), Integer.valueOf(i)) : false;
        boolean z02 = gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i)) : false;
        if (gVar2 != null ? gVar2.H0() : false) {
            if (gVar2 != null && (M0 = gVar2.M0()) != null) {
                if (M0.f || M0.i) {
                    z2 = true;
                    if (z2) {
                        z = true;
                        at30 at30Var = new at30(z0, z02, this.d, this.e, this.f, this.g, this.h, this.i, this.j, z, this.l, this.m, this.n, this.o);
                        at30Var.r = this.r;
                        at30Var.q = this.q;
                        at30Var.p = this.p;
                        return at30Var;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        z = false;
        at30 at30Var2 = new at30(z0, z02, this.d, this.e, this.f, this.g, this.h, this.i, this.j, z, this.l, this.m, this.n, this.o);
        at30Var2.r = this.r;
        at30Var2.q = this.q;
        at30Var2.p = this.p;
        return at30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at30)) {
            return false;
        }
        at30 at30Var = (at30) obj;
        return this.b == at30Var.b && this.c == at30Var.c && this.d == at30Var.d && this.e == at30Var.e && epx.f(this.f, at30Var.f) && epx.f(this.g, at30Var.g) && epx.f(this.h, at30Var.h) && this.i == at30Var.i && this.j == at30Var.j && this.k == at30Var.k && this.l == at30Var.l && this.m == at30Var.m && epx.f(this.n, at30Var.n) && epx.f(this.o, at30Var.o);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int a = bh10.a(qoy.b(shy.a(this.d, qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31, this.e), 31, this.f.b);
        CnvMsgId cnvMsgId = this.g;
        int c = pm0.c(this.m, qoy.b(qoy.b(qoy.b(shy.a(this.i, (this.h.hashCode() + ((a + (cnvMsgId == null ? 0 : cnvMsgId.hashCode())) * 31)) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31);
        abi0 abi0Var = this.n;
        int hashCode = (c + (abi0Var == null ? 0 : abi0Var.hashCode())) * 31;
        kqb0 kqb0Var = this.o;
        return hashCode + (kqb0Var != null ? kqb0Var.hashCode() : 0);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.k;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.l;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.m;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.suj
    public final int t() {
        return this.d;
    }

    public final String toString() {
        return "MsgPartPollHolderItem(isPrevSameMsgId=" + this.b + ", isNextSameMsgId=" + this.c + ", valueNestedLevel=" + this.d + ", isSelectedOld=" + this.e + ", currentMember=" + this.f + ", msgId=" + this.g + ", attachPoll=" + this.h + ", msgLocalId=" + this.i + ", isNewSnippetsEnabled=" + this.j + ", isNextEntryBubbleTransparent=" + this.k + ", inWallPost=" + this.l + ", viewType=" + this.m + ", selectedMessagesMediator=" + this.n + ", pollMediator=" + this.o + ')';
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
}
