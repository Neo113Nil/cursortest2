package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class g4w implements wp10, tuj, ol8 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final Msg f;
    public final jr30 g;
    public final AttachDoc h;
    public final int i;
    public final g34 j;
    public final AdapterEntryType k;
    public final oh30 l;
    public final abi0 m;

    public g4w(boolean z, boolean z2, int i, boolean z3, Msg msg, jr30 jr30Var, AttachDoc attachDoc, int i2, g34 g34Var, AdapterEntryType adapterEntryType, oh30 oh30Var, abi0 abi0Var) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = msg;
        this.g = jr30Var;
        this.h = attachDoc;
        this.i = i2;
        this.j = g34Var;
        this.k = adapterEntryType;
        this.l = oh30Var;
        this.m = abi0Var;
    }

    public static g4w h(g4w g4wVar, boolean z, boolean z2, jr30 jr30Var, g34 g34Var, oh30 oh30Var, int i) {
        return new g4w((i & 1) != 0 ? g4wVar.b : z, (i & 2) != 0 ? g4wVar.c : z2, g4wVar.d, g4wVar.e, g4wVar.f, (i & 32) != 0 ? g4wVar.g : jr30Var, g4wVar.h, g4wVar.i, (i & 512) != 0 ? g4wVar.j : g34Var, g4wVar.k, (i & 2048) != 0 ? g4wVar.l : oh30Var, g4wVar.m);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.b;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.l;
    }

    public final boolean P() {
        abi0 abi0Var = this.m;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.i));
        }
        return false;
    }

    @Override // xsna.wp10
    public final Attach a() {
        return this.h;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return false;
    }

    @Override // xsna.wp10
    public final wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return h(this, false, false, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, null, 32223);
    }

    @Override // xsna.wp10
    public final wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.i;
        return h(this, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, i, null, null, 32732);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g4w.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        g4w g4wVar = (g4w) obj;
        return this.b == g4wVar.b && this.c == g4wVar.c && this.d == g4wVar.d && epx.f(this.f, g4wVar.f) && epx.f(this.g, g4wVar.g) && epx.f(this.h, g4wVar.h) && P() == g4wVar.P() && this.i == g4wVar.i && epx.f(this.j, g4wVar.j) && this.k == g4wVar.k && epx.f(this.l, g4wVar.l);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (((Boolean.hashCode(P()) + ((this.h.hashCode() + ar.a(this.g, pn.a(this.f, (qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c) + this.d) * 31, 31), 31)) * 31)) * 31) + this.i) * 31;
        g34 g34Var = this.j;
        int c = pm0.c(this.k, (hashCode + (g34Var != null ? g34Var.hashCode() : 0)) * 31, 31);
        oh30 oh30Var = this.l;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return false;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return this.e;
    }

    @Override // xsna.wp10
    public final AdapterEntryType l() {
        return this.k;
    }

    @Override // xsna.wp10
    public final wp10 n(oh30 oh30Var) {
        return h(this, false, false, null, null, oh30Var, 30719);
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
        return "ImInlineGifPlayerVCItem(isPrevSameMsgId=" + this.b + ", isNextSameMsgId=" + this.c + ", valueNestedLevel=" + this.d + ", inWallPost=" + this.e + ", msg=" + this.f + ", timeStatus=" + this.g + ", attach=" + this.h + ", isSelectedOld=false, msgLocalId=" + this.i + ", progressMediator=" + this.j + ", viewType=" + this.k + ", bubbleStyle=" + this.l + ", selectedMessagesMediator=" + this.m + ", isNewSnippetsEnabled=false, isNextEntryBubbleTransparent=false)";
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 R0(Boolean bool) {
        return this;
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 d0(ProfilesInfo profilesInfo) {
        return this;
    }
}
