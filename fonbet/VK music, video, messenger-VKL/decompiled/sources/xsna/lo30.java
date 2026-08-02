package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class lo30 implements ir30, suj, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Msg e;
    public final jr30 f;
    public final List<? extends Attach> g;
    public final NestedMsg h;
    public final int i;
    public final g34 j;
    public final AdapterEntryType k;
    public final oh30 l;

    public lo30(boolean z, boolean z2, int i, Msg msg, jr30 jr30Var, List<? extends Attach> list, NestedMsg nestedMsg, int i2, g34 g34Var, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = msg;
        this.f = jr30Var;
        this.g = list;
        this.h = nestedMsg;
        this.i = i2;
        this.j = g34Var;
        this.k = adapterEntryType;
        this.l = oh30Var;
    }

    public static lo30 h(lo30 lo30Var, boolean z, boolean z2, jr30 jr30Var, g34 g34Var, oh30 oh30Var, int i) {
        return new lo30((i & 1) != 0 ? lo30Var.b : z, (i & 2) != 0 ? lo30Var.c : z2, lo30Var.d, lo30Var.e, (i & 16) != 0 ? lo30Var.f : jr30Var, lo30Var.g, lo30Var.h, lo30Var.i, (i & 256) != 0 ? lo30Var.j : g34Var, lo30Var.k, (i & 1024) != 0 ? lo30Var.l : oh30Var);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.l;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return h(this, false, false, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, null, 1775);
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.i;
        return h(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, i, null, null, 2028);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lo30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lo30 lo30Var = (lo30) obj;
        return this.b == lo30Var.b && this.c == lo30Var.c && this.d == lo30Var.d && epx.f(this.e, lo30Var.e) && epx.f(this.f, lo30Var.f) && epx.f(this.g, lo30Var.g) && epx.f(this.h, lo30Var.h) && this.i == lo30Var.i && epx.f(this.j, lo30Var.j) && this.k == lo30Var.k && epx.f(this.l, lo30Var.l);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int a = fw3.a(ar.a(this.f, pn.a(this.e, (qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c) + this.d) * 31, 31), 31), 31, this.g);
        NestedMsg nestedMsg = this.h;
        int hashCode = (((a + (nestedMsg != null ? nestedMsg.hashCode() : 0)) * 31) + this.i) * 31;
        g34 g34Var = this.j;
        int c = pm0.c(this.k, (hashCode + (g34Var != null ? g34Var.hashCode() : 0)) * 31, 31);
        oh30 oh30Var = this.l;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return h(this, false, false, null, null, oh30Var, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
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
        StringBuilder sb = new StringBuilder("MsgPartBoxDocPreviewHolderItem(isPrevSameMsgId=");
        sb.append(this.b);
        sb.append(", isNextSameMsgId=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", msg=");
        sb.append(this.e);
        sb.append(", timeStatus=");
        sb.append(this.f);
        sb.append(", attachList=");
        sb.append(this.g);
        sb.append(", nestedMsg=");
        sb.append(this.h);
        sb.append(", msgLocalId=");
        sb.append(this.i);
        sb.append(", progressMediator=");
        sb.append(this.j);
        sb.append(", viewType=");
        sb.append(this.k);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.l, ')');
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
