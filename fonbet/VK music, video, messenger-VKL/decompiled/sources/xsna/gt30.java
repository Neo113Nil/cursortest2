package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class gt30 implements ir30, ol8 {
    public final oh30 b;
    public final Msg c;
    public final jr30 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List<Integer> h;
    public final boolean i;
    public final boolean j;
    public final ProfilesSimpleInfo k;
    public final rxd0 l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final AdapterEntryType q;

    public gt30(oh30 oh30Var, Msg msg, jr30 jr30Var, boolean z, boolean z2, boolean z3, List<Integer> list, boolean z4, boolean z5, ProfilesSimpleInfo profilesSimpleInfo, rxd0 rxd0Var, boolean z6, boolean z7, int i, int i2, AdapterEntryType adapterEntryType) {
        this.b = oh30Var;
        this.c = msg;
        this.d = jr30Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = list;
        this.i = z4;
        this.j = z5;
        this.k = profilesSimpleInfo;
        this.l = rxd0Var;
        this.m = z6;
        this.n = z7;
        this.o = i;
        this.p = i2;
        this.q = adapterEntryType;
    }

    public static gt30 c(gt30 gt30Var, oh30 oh30Var, jr30 jr30Var, boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, int i, int i2) {
        return new gt30((i2 & 1) != 0 ? gt30Var.b : oh30Var, gt30Var.c, (i2 & 4) != 0 ? gt30Var.d : jr30Var, gt30Var.e, (i2 & 16) != 0 ? gt30Var.f : z, (i2 & 32) != 0 ? gt30Var.g : z2, (i2 & 64) != 0 ? gt30Var.h : list, (i2 & 128) != 0 ? gt30Var.i : z3, gt30Var.j, gt30Var.k, gt30Var.l, (i2 & 2048) != 0 ? gt30Var.m : z4, (i2 & 4096) != 0 ? gt30Var.n : z5, gt30Var.o, (i2 & 16384) != 0 ? gt30Var.p : i, gt30Var.q);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.b;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        boolean f = uk30Var.f(nsr0Var, gVar);
        boolean z = uk30Var.w;
        boolean z2 = uk30Var.x;
        List<Integer> list = uk30Var.i;
        int t = c4g0.t(uk30Var.d);
        ChatSettings chatSettings = uk30Var.m;
        return c(this, null, i, z, z2, list, false, f, chatSettings != null && chatSettings.m, t, 42891);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(this, null, uk30Var.i(nsr0Var, gVar2, gVar), false, false, null, false, uk30Var.f(nsr0Var, gVar), false, 0, 63483);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt30)) {
            return false;
        }
        gt30 gt30Var = (gt30) obj;
        return epx.f(this.b, gt30Var.b) && epx.f(this.c, gt30Var.c) && epx.f(this.d, gt30Var.d) && this.e == gt30Var.e && this.f == gt30Var.f && this.g == gt30Var.g && epx.f(this.h, gt30Var.h) && this.i == gt30Var.i && this.j == gt30Var.j && epx.f(this.k, gt30Var.k) && epx.f(this.l, gt30Var.l) && this.m == gt30Var.m && this.n == gt30Var.n && this.o == gt30Var.o && this.p == gt30Var.p && this.q == gt30Var.q;
    }

    public final int hashCode() {
        oh30 oh30Var = this.b;
        int a = io.reactivex.rxjava3.subjects.c.a(this.k, qoy.b(qoy.b(fw3.a(qoy.b(qoy.b(qoy.b(ar.a(this.d, pn.a(this.c, (oh30Var == null ? 0 : oh30Var.hashCode()) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
        rxd0 rxd0Var = this.l;
        return this.q.hashCode() + shy.a(this.p, shy.a(this.o, qoy.b(qoy.b((a + (rxd0Var != null ? rxd0Var.hashCode() : 0)) * 31, 31, this.m), 31, this.n), 31), 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.q;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, oh30Var, null, false, false, null, false, false, false, 0, 65534);
    }

    public final String toString() {
        return "MsgPartReactionsHolderItem(bubbleStyle=" + this.b + ", msg=" + this.c + ", timeStatus=" + this.d + ", isIncoming=" + this.e + ", isReactionsAvailable=" + this.f + ", isPaidReactionAvailable=" + this.g + ", unreadReactions=" + this.h + ", inlineTime=" + this.i + ", hasLargeEmojis=" + this.j + ", profiles=" + this.k + ", profileMediators=" + this.l + ", isGradientBubble=" + this.m + ", isIncognito=" + this.n + ", valueNestedLevel=" + this.o + ", colorAccent=" + this.p + ", viewType=" + this.q + ')';
    }

    @Override // xsna.ir30
    public final ir30 u(boolean z) {
        return c(this, null, null, false, false, null, z, false, false, 0, 65407);
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
