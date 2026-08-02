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
public final class ds30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final ImageList d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final List<ImageList> i;
    public final String j;
    public final boolean k;
    public final AdapterEntryType l;
    public final oh30 m;
    public Msg n;
    public NestedMsg o;
    public Attach p;

    public ds30(jr30 jr30Var, int i, ImageList imageList, String str, String str2, String str3, boolean z, List<ImageList> list, String str4, boolean z2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = imageList;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = list;
        this.j = str4;
        this.k = z2;
        this.l = adapterEntryType;
        this.m = oh30Var;
    }

    public static ds30 c(ds30 ds30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        return new ds30((i & 1) != 0 ? ds30Var.b : jr30Var, ds30Var.c, ds30Var.d, ds30Var.e, ds30Var.f, ds30Var.g, ds30Var.h, ds30Var.i, ds30Var.j, ds30Var.k, ds30Var.l, (i & 2048) != 0 ? ds30Var.m : oh30Var);
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
        ds30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 4094);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        ds30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 4094);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds30)) {
            return false;
        }
        ds30 ds30Var = (ds30) obj;
        return epx.f(this.b, ds30Var.b) && this.c == ds30Var.c && epx.f(this.d, ds30Var.d) && epx.f(this.e, ds30Var.e) && epx.f(this.f, ds30Var.f) && epx.f(this.g, ds30Var.g) && this.h == ds30Var.h && epx.f(this.i, ds30Var.i) && epx.f(this.j, ds30Var.j) && this.k == ds30Var.k && this.l == ds30Var.l && epx.f(this.m, ds30Var.m);
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 31);
        ImageList imageList = this.d;
        int b = qoy.b(urd0.a(urd0.a(urd0.a((a + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        List<ImageList> list = this.i;
        int c = pm0.c(this.l, qoy.b(urd0.a((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.j), 31, this.k), 31);
        oh30 oh30Var = this.m;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        ds30 c = c(this, null, oh30Var, 2047);
        c.p = this.p;
        c.o = this.o;
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartMiniAppActionSnippetHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", actionTitle=");
        sb.append(this.e);
        sb.append(", actionDescription=");
        sb.append(this.f);
        sb.append(", buttonText=");
        sb.append(this.g);
        sb.append(", isGame=");
        sb.append(this.h);
        sb.append(", stackProfiles=");
        sb.append(this.i);
        sb.append(", stackDescription=");
        sb.append(this.j);
        sb.append(", isOutgoing=");
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
