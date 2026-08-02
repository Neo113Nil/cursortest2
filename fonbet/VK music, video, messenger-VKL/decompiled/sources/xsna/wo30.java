package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class wo30 implements ir30, tuj, ol8 {
    public final AttachChannelStub b;
    public final int c;
    public final jr30 d;
    public final long e;
    public final gl8 f;
    public final gl8 g;
    public final int h;
    public final AdapterEntryType i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final oh30 n;
    public final boolean o;

    public wo30(AttachChannelStub attachChannelStub, int i, jr30 jr30Var, long j, gl8 gl8Var, gl8 gl8Var2, int i2, AdapterEntryType adapterEntryType, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, boolean z5) {
        this.b = attachChannelStub;
        this.c = i;
        this.d = jr30Var;
        this.e = j;
        this.f = gl8Var;
        this.g = gl8Var2;
        this.h = i2;
        this.i = adapterEntryType;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = oh30Var;
        this.o = z5;
    }

    public static wo30 h(wo30 wo30Var, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, boolean z, boolean z2, boolean z3, boolean z4, oh30 oh30Var, boolean z5, int i) {
        AttachChannelStub attachChannelStub = wo30Var.b;
        int i2 = wo30Var.c;
        jr30 jr30Var2 = (i & 4) != 0 ? wo30Var.d : jr30Var;
        long j = wo30Var.e;
        gl8 gl8Var3 = (i & 16) != 0 ? wo30Var.f : gl8Var;
        gl8 gl8Var4 = (i & 32) != 0 ? wo30Var.g : gl8Var2;
        return new wo30(attachChannelStub, i2, jr30Var2, j, gl8Var3, gl8Var4, wo30Var.h, wo30Var.i, (i & 256) != 0 ? wo30Var.j : z, (i & 512) != 0 ? wo30Var.k : z2, (i & 1024) != 0 ? wo30Var.l : z3, (i & 2048) != 0 ? wo30Var.m : z4, (i & 4096) != 0 ? wo30Var.n : oh30Var, (i & 8192) != 0 ? wo30Var.o : z5);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.j;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.n;
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
        vk30 vk30Var = uk30Var.a;
        long j = this.e;
        BubbleColors c = vk30Var.c(j, true, true);
        BubbleColors c2 = vk30Var.c(j, true, false);
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.h;
        return h(this, i, vk30Var.b(c2, i2, false), vk30Var.b(c, i2, false), false, false, false, false, null, false, 16331);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        oh30 oh30Var;
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.c;
        return h(this, i, null, null, gVar != null && gVar.z0(super.m(), Integer.valueOf(i2)), gVar2 != null && gVar2.z0(super.m(), Integer.valueOf(i2)), false, false, null, (gVar2 == null || !gVar2.H0() || (oh30Var = this.n) == null || oh30Var.h) ? false : true, 7419);
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return h(this, null, null, null, false, false, bool2 != null ? bool2.booleanValue() : this.l, bool != null ? bool.booleanValue() : this.m, this.n, false, 9215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo30)) {
            return false;
        }
        wo30 wo30Var = (wo30) obj;
        return epx.f(this.b, wo30Var.b) && this.c == wo30Var.c && epx.f(this.d, wo30Var.d) && this.e == wo30Var.e && epx.f(this.f, wo30Var.f) && epx.f(this.g, wo30Var.g) && this.h == wo30Var.h && this.i == wo30Var.i && this.j == wo30Var.j && this.k == wo30Var.k && this.l == wo30Var.l && this.m == wo30Var.m && epx.f(this.n, wo30Var.n) && this.o == wo30Var.o;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.k;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(pm0.c(this.i, shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + bh10.a(ar.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e)) * 31)) * 31, 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        oh30 oh30Var = this.n;
        return Boolean.hashCode(this.o) + ((b + (oh30Var == null ? 0 : oh30Var.hashCode())) * 31);
    }

    @Override // xsna.tuj
    public final boolean i() {
        return this.o;
    }

    @Override // xsna.tuj
    public final boolean k() {
        return false;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return h(this, null, null, null, false, false, false, false, oh30Var, false, 12287);
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.suj
    public final int t() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartChannelAttachStubHolderItem(stubData=");
        sb.append(this.b);
        sb.append(", msgLocalId=");
        sb.append(this.c);
        sb.append(", timeStatus=");
        sb.append(this.d);
        sb.append(", senderThemeId=");
        sb.append(this.e);
        sb.append(", bubbleColorLight=");
        sb.append(this.f);
        sb.append(", bubbleColorDark=");
        sb.append(this.g);
        sb.append(", valueNestedLevel=");
        sb.append(this.h);
        sb.append(", viewType=");
        sb.append(this.i);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.j);
        sb.append(", isNextSameMsgId=");
        sb.append(this.k);
        sb.append(", disableMaxHeight=");
        sb.append(this.l);
        sb.append(", bubbleFitAllWidth=");
        sb.append(this.m);
        sb.append(", bubbleStyle=");
        sb.append(this.n);
        sb.append(", isNextEntryBubbleTransparent=");
        return defpackage.q0.a(sb, this.o, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
