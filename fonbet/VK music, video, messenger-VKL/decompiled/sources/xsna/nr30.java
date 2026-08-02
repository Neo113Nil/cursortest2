package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.ButtonIconType;
import com.vk.im.engine.models.attaches.ImageScaleType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class nr30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final ImageList d;
    public final ButtonIconType e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final ImageScaleType l;
    public final AdapterEntryType m;
    public final oh30 n;
    public Msg o;
    public NestedMsg p;
    public Attach q;

    public nr30(jr30 jr30Var, int i, ImageList imageList, ButtonIconType buttonIconType, String str, String str2, String str3, String str4, boolean z, boolean z2, ImageScaleType imageScaleType, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = imageList;
        this.e = buttonIconType;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.l = imageScaleType;
        this.m = adapterEntryType;
        this.n = oh30Var;
    }

    public static nr30 c(nr30 nr30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        return new nr30((i & 1) != 0 ? nr30Var.b : jr30Var, nr30Var.c, nr30Var.d, nr30Var.e, nr30Var.f, nr30Var.g, nr30Var.h, nr30Var.i, nr30Var.j, nr30Var.k, nr30Var.l, nr30Var.m, (i & 4096) != 0 ? nr30Var.n : oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.n;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.q;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        nr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 8190);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        nr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 8190);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    public final boolean e() {
        return brm0.B(this.i, "https://" + a0a.d + "/story", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr30)) {
            return false;
        }
        nr30 nr30Var = (nr30) obj;
        return epx.f(this.b, nr30Var.b) && this.c == nr30Var.c && epx.f(this.d, nr30Var.d) && this.e == nr30Var.e && epx.f(this.f, nr30Var.f) && epx.f(this.g, nr30Var.g) && epx.f(this.h, nr30Var.h) && epx.f(this.i, nr30Var.i) && this.j == nr30Var.j && this.k == nr30Var.k && this.l == nr30Var.l && this.m == nr30Var.m && epx.f(this.n, nr30Var.n);
    }

    public final int hashCode() {
        int c = pm0.c(this.m, (this.l.hashCode() + qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a((this.e.hashCode() + fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31);
        oh30 oh30Var = this.n;
        return c + (oh30Var == null ? 0 : oh30Var.hashCode());
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.m;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        nr30 c = c(this, null, oh30Var, 4095);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartLinkLargeHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", imageList=");
        sb.append(this.d);
        sb.append(", buttonIconType=");
        sb.append(this.e);
        sb.append(", buttonTitle=");
        sb.append(this.f);
        sb.append(", attachTitle=");
        sb.append(this.g);
        sb.append(", caption=");
        sb.append(this.h);
        sb.append(", url=");
        sb.append(this.i);
        sb.append(", isAmp=");
        sb.append(this.j);
        sb.append(", isArticle=");
        sb.append(this.k);
        sb.append(", imageScaleType=");
        sb.append(this.l);
        sb.append(", viewType=");
        sb.append(this.m);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.n, ')');
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
