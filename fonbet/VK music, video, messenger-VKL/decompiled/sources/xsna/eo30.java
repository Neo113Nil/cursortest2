package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.Arrays;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class eo30 implements ir30, ol8 {
    public final jr30 b;
    public final kq4 c;
    public final int d;
    public final AdapterEntryType e;
    public final oh30 f;
    public final com.vk.im.engine.models.messages.a g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final byte[] o;
    public final int p;
    public Msg q;
    public NestedMsg r;
    public Attach s;

    public eo30(jr30 jr30Var, kq4 kq4Var, int i, AdapterEntryType adapterEntryType, oh30 oh30Var, com.vk.im.engine.models.messages.a aVar, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, boolean z5, byte[] bArr, int i4) {
        this.b = jr30Var;
        this.c = kq4Var;
        this.d = i;
        this.e = adapterEntryType;
        this.f = oh30Var;
        this.g = aVar;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = i2;
        this.m = i3;
        this.n = z5;
        this.o = bArr;
        this.p = i4;
    }

    public static eo30 c(eo30 eo30Var, jr30 jr30Var, kq4 kq4Var, oh30 oh30Var, int i) {
        return new eo30((i & 1) != 0 ? eo30Var.b : jr30Var, (i & 2) != 0 ? eo30Var.c : kq4Var, eo30Var.d, eo30Var.e, (i & 16) != 0 ? eo30Var.f : oh30Var, eo30Var.g, eo30Var.h, eo30Var.i, eo30Var.j, eo30Var.k, eo30Var.l, eo30Var.m, eo30Var.n, eo30Var.o, eo30Var.p);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.s;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        eo30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.K, null, 32764);
        c.s = this.s;
        c.r = this.r;
        c.q = this.q;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        eo30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 32766);
        c.s = this.s;
        c.r = this.r;
        c.q = this.q;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eo30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        eo30 eo30Var = (eo30) obj;
        return epx.f(this.b, eo30Var.b) && epx.f(this.c, eo30Var.c) && this.d == eo30Var.d && this.e == eo30Var.e && epx.f(this.f, eo30Var.f) && epx.f(this.g, eo30Var.g) && this.h == eo30Var.h && this.i == eo30Var.i && this.j == eo30Var.j && this.k == eo30Var.k && this.l == eo30Var.l && this.m == eo30Var.m && Arrays.equals(this.o, eo30Var.o) && this.p == eo30Var.p;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        kq4 kq4Var = this.c;
        int c = pm0.c(this.e, (((hashCode + (kq4Var != null ? kq4Var.hashCode() : 0)) * 31) + this.d) * 31, 31);
        oh30 oh30Var = this.f;
        int hashCode2 = (c + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31;
        com.vk.im.engine.models.messages.a aVar = this.g;
        return ((Arrays.hashCode(this.o) + ((((qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k) + this.l) * 31) + this.m) * 31)) * 31) + this.p;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.e;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        eo30 c = c(this, null, null, oh30Var, 32751);
        c.s = this.s;
        c.r = this.r;
        c.q = this.q;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartAudioMsgHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", audioMediator=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", viewType=");
        sb.append(this.e);
        sb.append(", bubbleStyle=");
        sb.append(this.f);
        sb.append(", itemHolder=");
        sb.append(this.g);
        sb.append(", isNested=");
        sb.append(this.h);
        sb.append(", wasPlayed=");
        sb.append(this.i);
        sb.append(", localTranscriptShown=");
        sb.append(this.j);
        sb.append(", isIncoming=");
        sb.append(this.k);
        sb.append(", attachLocalId=");
        sb.append(this.l);
        sb.append(", attachDuration=");
        sb.append(this.m);
        sb.append(", isTranscriptEnabled=");
        sb.append(this.n);
        sb.append(", waveForm=");
        sb.append(Arrays.toString(this.o));
        sb.append(", transcriptState=");
        return vu5.b(sb, this.p, ')');
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
