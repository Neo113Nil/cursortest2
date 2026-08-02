package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class xp30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final ImageList d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final List<ImageList> i;
    public final int j;
    public final int k;
    public final AdapterEntryType l;
    public final oh30 m;
    public Msg n;
    public NestedMsg o;
    public Attach p;

    public xp30(jr30 jr30Var, int i, ImageList imageList, String str, String str2, boolean z, String str3, List<ImageList> list, int i2, int i3, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = imageList;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
        this.i = list;
        this.j = i2;
        this.k = i3;
        this.l = adapterEntryType;
        this.m = oh30Var;
    }

    public static xp30 c(xp30 xp30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        return new xp30((i & 1) != 0 ? xp30Var.b : jr30Var, xp30Var.c, xp30Var.d, xp30Var.e, xp30Var.f, xp30Var.g, xp30Var.h, xp30Var.i, xp30Var.j, xp30Var.k, xp30Var.l, (i & 2048) != 0 ? xp30Var.m : oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.m;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.p;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        xp30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 4094);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        xp30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 4094);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp30)) {
            return false;
        }
        xp30 xp30Var = (xp30) obj;
        return epx.f(this.b, xp30Var.b) && this.c == xp30Var.c && epx.f(this.d, xp30Var.d) && epx.f(this.e, xp30Var.e) && epx.f(this.f, xp30Var.f) && this.g == xp30Var.g && epx.f(this.h, xp30Var.h) && epx.f(this.i, xp30Var.i) && this.j == xp30Var.j && this.k == xp30Var.k && this.l == xp30Var.l && epx.f(this.m, xp30Var.m);
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 31);
        ImageList imageList = this.d;
        int a2 = urd0.a(qoy.b(urd0.a(urd0.a((a + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        List<ImageList> list = this.i;
        int c = pm0.c(this.l, shy.a(this.k, shy.a(this.j, (a2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        oh30 oh30Var = this.m;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        xp30 c = c(this, null, oh30Var, 2047);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartDonutLinkHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", remoteAvatar=");
        sb.append(this.d);
        sb.append(", attachName=");
        sb.append(this.e);
        sb.append(", attachText=");
        sb.append(this.f);
        sb.append(", isVerified=");
        sb.append(this.g);
        sb.append(", buttonTitle=");
        sb.append(this.h);
        sb.append(", friends=");
        sb.append(this.i);
        sb.append(", attachDonorsCount=");
        sb.append(this.j);
        sb.append(", attachFriendsCount=");
        sb.append(this.k);
        sb.append(", viewType=");
        sb.append(this.l);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.m, ')');
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
