package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class eq30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final ImageList g;
    public final String h;
    public final float i;
    public final int j;
    public final AdapterEntryType k;
    public final oh30 l;
    public Attach m;
    public Msg n;
    public NestedMsg o;

    public eq30(jr30 jr30Var, int i, String str, String str2, String str3, ImageList imageList, String str4, float f, int i2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = imageList;
        this.h = str4;
        this.i = f;
        this.j = i2;
        this.k = adapterEntryType;
        this.l = oh30Var;
    }

    public static eq30 c(eq30 eq30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = eq30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = eq30Var.c;
        String str = eq30Var.d;
        String str2 = eq30Var.e;
        String str3 = eq30Var.f;
        ImageList imageList = eq30Var.g;
        String str4 = eq30Var.h;
        float f = eq30Var.i;
        int i3 = eq30Var.j;
        AdapterEntryType adapterEntryType = eq30Var.k;
        if ((i & 1024) != 0) {
            oh30Var = eq30Var.l;
        }
        return new eq30(jr30Var2, i2, str, str2, str3, imageList, str4, f, i3, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.l;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.m;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        eq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 2046);
        c.m = this.m;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        eq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 2046);
        c.m = this.m;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq30)) {
            return false;
        }
        eq30 eq30Var = (eq30) obj;
        return epx.f(this.b, eq30Var.b) && this.c == eq30Var.c && epx.f(this.d, eq30Var.d) && epx.f(this.e, eq30Var.e) && epx.f(this.f, eq30Var.f) && epx.f(this.g, eq30Var.g) && epx.f(this.h, eq30Var.h) && Float.compare(this.i, eq30Var.i) == 0 && this.j == eq30Var.j && this.k == eq30Var.k && epx.f(this.l, eq30Var.l);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        String str = this.f;
        int a2 = fw3.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.g.b);
        String str2 = this.h;
        int c = pm0.c(this.k, shy.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, (a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        oh30 oh30Var = this.l;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        eq30 c = c(this, null, oh30Var, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        c.m = this.m;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartExternalMarketHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", caption=");
        sb.append(this.d);
        sb.append(", attachTitle=");
        sb.append(this.e);
        sb.append(", sellerFavicon=");
        sb.append(this.f);
        sb.append(", imageList=");
        sb.append(this.g);
        sb.append(", sellerProductOwnerName=");
        sb.append(this.h);
        sb.append(", rating=");
        sb.append(this.i);
        sb.append(", reviewsCount=");
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
