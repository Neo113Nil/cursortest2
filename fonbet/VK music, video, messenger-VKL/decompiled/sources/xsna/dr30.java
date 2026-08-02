package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class dr30 implements ir30, suj, ol8 {
    public final int b;
    public final jr30 c;
    public final boolean d;
    public final g34 e;
    public final ImageList f;
    public final ImageList g;
    public final int h;
    public final int i;
    public final AdapterEntryType j;
    public final oh30 k;
    public final abi0 l;
    public Msg m;
    public NestedMsg n;
    public Attach o;

    public dr30(int i, jr30 jr30Var, boolean z, g34 g34Var, ImageList imageList, ImageList imageList2, int i2, int i3, AdapterEntryType adapterEntryType, oh30 oh30Var, abi0 abi0Var) {
        this.b = i;
        this.c = jr30Var;
        this.d = z;
        this.e = g34Var;
        this.f = imageList;
        this.g = imageList2;
        this.h = i2;
        this.i = i3;
        this.j = adapterEntryType;
        this.k = oh30Var;
        this.l = abi0Var;
    }

    public static dr30 h(dr30 dr30Var, jr30 jr30Var, g34 g34Var, oh30 oh30Var, int i) {
        int i2 = dr30Var.b;
        if ((i & 8) != 0) {
            jr30Var = dr30Var.c;
        }
        jr30 jr30Var2 = jr30Var;
        boolean z = dr30Var.d;
        if ((i & 64) != 0) {
            g34Var = dr30Var.e;
        }
        return new dr30(i2, jr30Var2, z, g34Var, dr30Var.f, dr30Var.g, dr30Var.h, dr30Var.i, dr30Var.j, (i & 4096) != 0 ? dr30Var.k : oh30Var, dr30Var.l);
    }

    @Override // xsna.suj
    public final boolean F() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.k;
    }

    public final boolean P() {
        abi0 abi0Var = this.l;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.i));
        }
        return false;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.o;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        dr30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.P, null, 16311);
        h.o = this.o;
        h.n = this.n;
        h.m = this.m;
        return h;
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        dr30 h = h(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 16375);
        h.o = this.o;
        h.n = this.n;
        h.m = this.m;
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dr30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dr30 dr30Var = (dr30) obj;
        dr30Var.getClass();
        return this.b == dr30Var.b && epx.f(this.c, dr30Var.c) && P() == dr30Var.P() && this.d == dr30Var.d && epx.f(this.e, dr30Var.e) && epx.f(this.f, dr30Var.f) && epx.f(this.g, dr30Var.g) && this.h == dr30Var.h && this.i == dr30Var.i && this.j == dr30Var.j && epx.f(this.k, dr30Var.k);
    }

    @Override // xsna.suj
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int b = qoy.b((Boolean.hashCode(P()) + ar.a(this.c, (qoy.b(Boolean.hashCode(false) * 31, 31, false) + this.b) * 31, 31)) * 31, 31, this.d);
        g34 g34Var = this.e;
        int c = pm0.c(this.j, (((fw3.a(fw3.a((b + (g34Var != null ? g34Var.hashCode() : 0)) * 31, 31, this.f.b), 31, this.g.b) + this.h) * 31) + this.i) * 31, 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        dr30 h = h(this, null, null, oh30Var, 12287);
        h.o = this.o;
        h.n = this.n;
        h.m = this.m;
        return h;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.suj
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "MsgPartGraffitiHolderItem(isPrevSameMsgId=false, isNextSameMsgId=false, valueNestedLevel=" + this.b + ", timeStatus=" + this.c + ", isSelectedOld=false, isIncoming=" + this.d + ", progressMediator=" + this.e + ", localImageList=" + this.f + ", remoteImageList=" + this.g + ", attachLocalId=" + this.h + ", msgLocalId=" + this.i + ", viewType=" + this.j + ", bubbleStyle=" + this.k + ", selectedMessagesMediator=" + this.l + ')';
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
