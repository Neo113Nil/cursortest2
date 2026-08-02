package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class so30 implements ir30, ol8, dc4 {
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final AdapterEntryType f;
    public final jr30 g;
    public final boolean h;
    public final oh30 i;
    public final boolean j;
    public final boolean k;

    public so30(String str, String str2, int i, int i2, AdapterEntryType adapterEntryType, jr30 jr30Var, boolean z, oh30 oh30Var, boolean z2, boolean z3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = adapterEntryType;
        this.g = jr30Var;
        this.h = z;
        this.i = oh30Var;
        this.j = z2;
        this.k = z3;
    }

    public static so30 h(so30 so30Var, jr30 jr30Var, oh30 oh30Var, boolean z, boolean z2, int i) {
        String str = so30Var.b;
        String str2 = so30Var.c;
        int i2 = so30Var.d;
        int i3 = so30Var.e;
        AdapterEntryType adapterEntryType = so30Var.f;
        if ((i & 32) != 0) {
            jr30Var = so30Var.g;
        }
        jr30 jr30Var2 = jr30Var;
        boolean z3 = (i & 64) != 0 ? so30Var.h : false;
        if ((i & 128) != 0) {
            oh30Var = so30Var.i;
        }
        oh30 oh30Var2 = oh30Var;
        if ((i & 256) != 0) {
            z = so30Var.j;
        }
        return new so30(str, str2, i2, i3, adapterEntryType, jr30Var2, z3, oh30Var2, z, (i & 512) != 0 ? so30Var.k : z2);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.j;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.i;
    }

    @Override // xsna.dc4
    public final boolean T() {
        return false;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.tuj
    public final boolean a0() {
        return true;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return h(this, uk30Var.i(nsr0Var, gVar2, gVar), null, false, false, 991);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        int i = this.d;
        boolean z = gVar != null && gVar.z0(super.m(), Integer.valueOf(i));
        boolean z2 = gVar2 != null && gVar2.z0(super.m(), Integer.valueOf(i));
        if (gVar2 != null) {
            gVar2.H0();
        }
        return h(this, uk30Var.i(nsr0Var, gVar2, gVar), null, z, z2, 159);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so30)) {
            return false;
        }
        so30 so30Var = (so30) obj;
        return epx.f(this.b, so30Var.b) && epx.f(this.c, so30Var.c) && this.d == so30Var.d && this.e == so30Var.e && this.f == so30Var.f && epx.f(this.g, so30Var.g) && this.h == so30Var.h && epx.f(this.i, so30Var.i) && this.j == so30Var.j && this.k == so30Var.k;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.k;
    }

    public final int hashCode() {
        int b = qoy.b(ar.a(this.g, pm0.c(this.f, shy.a(this.e, shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31), 31), 31, this.h);
        oh30 oh30Var = this.i;
        return Boolean.hashCode(this.k) + qoy.b((b + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31, 31, this.j);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.h;
    }

    @Override // xsna.dc4
    public final boolean j() {
        return false;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return false;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.f;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return h(this, null, oh30Var, false, false, 895);
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.dc4
    public final boolean r() {
        return false;
    }

    @Override // xsna.suj
    public final int t() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartChannelAttachStubAudioHolderItem(title=");
        sb.append(this.b);
        sb.append(", artist=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", valueNestedLevel=");
        sb.append(this.e);
        sb.append(", viewType=");
        sb.append(this.f);
        sb.append(", timeStatus=");
        sb.append(this.g);
        sb.append(", isNextEntryBubbleTransparent=");
        sb.append(this.h);
        sb.append(", bubbleStyle=");
        sb.append(this.i);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.j);
        sb.append(", isNextSameMsgId=");
        return defpackage.q0.a(sb, this.k, ')');
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
