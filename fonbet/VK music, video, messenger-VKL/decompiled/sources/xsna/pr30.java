package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.Merchant;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class pr30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final String e;
    public final ImageList f;
    public final float g;
    public final Merchant h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final AdapterEntryType m;
    public final oh30 n;
    public Msg o;
    public NestedMsg p;
    public Attach q;

    public pr30(jr30 jr30Var, int i, String str, String str2, ImageList imageList, float f, Merchant merchant, int i2, int i3, int i4, String str3, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = imageList;
        this.g = f;
        this.h = merchant;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = str3;
        this.m = adapterEntryType;
        this.n = oh30Var;
    }

    public static pr30 c(pr30 pr30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        return new pr30((i & 1) != 0 ? pr30Var.b : jr30Var, pr30Var.c, pr30Var.d, pr30Var.e, pr30Var.f, pr30Var.g, pr30Var.h, pr30Var.i, pr30Var.j, pr30Var.k, pr30Var.l, pr30Var.m, (i & 4096) != 0 ? pr30Var.n : oh30Var);
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
        pr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 8190);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        pr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 8190);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr30)) {
            return false;
        }
        pr30 pr30Var = (pr30) obj;
        return epx.f(this.b, pr30Var.b) && this.c == pr30Var.c && epx.f(this.d, pr30Var.d) && epx.f(this.e, pr30Var.e) && epx.f(this.f, pr30Var.f) && Float.compare(this.g, pr30Var.g) == 0 && this.h == pr30Var.h && this.i == pr30Var.i && this.j == pr30Var.j && this.k == pr30Var.k && epx.f(this.l, pr30Var.l) && this.m == pr30Var.m && epx.f(this.n, pr30Var.n);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.g, fw3.a(urd0.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f.b), 31);
        Merchant merchant = this.h;
        int c = pm0.c(this.m, urd0.a(shy.a(this.k, shy.a(this.j, shy.a(this.i, (a + (merchant == null ? 0 : merchant.hashCode())) * 31, 31), 31), 31), 31, this.l), 31);
        oh30 oh30Var = this.n;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.m;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        pr30 c = c(this, null, oh30Var, 4095);
        c.q = this.q;
        c.p = this.p;
        c.o = this.o;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartLinkProductHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachTitle=");
        sb.append(this.d);
        sb.append(", buttonTitle=");
        sb.append(this.e);
        sb.append(", imageList=");
        sb.append(this.f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", productMerchant=");
        sb.append(this.h);
        sb.append(", productOrdersCount=");
        sb.append(this.i);
        sb.append(", price=");
        sb.append(this.j);
        sb.append(", oldPrice=");
        sb.append(this.k);
        sb.append(", currencyCode=");
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
