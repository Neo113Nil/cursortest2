package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class cq30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final ImageList d;
    public final String e;
    public final long f;
    public final String g;
    public final AdapterEntryType h;
    public final oh30 i;
    public Msg j;
    public NestedMsg k;
    public Attach l;

    public cq30(jr30 jr30Var, int i, ImageList imageList, String str, long j, String str2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = imageList;
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = adapterEntryType;
        this.i = oh30Var;
    }

    public static cq30 c(cq30 cq30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = cq30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = cq30Var.c;
        ImageList imageList = cq30Var.d;
        String str = cq30Var.e;
        long j = cq30Var.f;
        String str2 = cq30Var.g;
        AdapterEntryType adapterEntryType = cq30Var.h;
        if ((i & 128) != 0) {
            oh30Var = cq30Var.i;
        }
        return new cq30(jr30Var2, i2, imageList, str, j, str2, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.i;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.l;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        cq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 254);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        cq30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 254);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq30)) {
            return false;
        }
        cq30 cq30Var = (cq30) obj;
        return epx.f(this.b, cq30Var.b) && this.c == cq30Var.c && epx.f(this.d, cq30Var.d) && epx.f(this.e, cq30Var.e) && this.f == cq30Var.f && epx.f(this.g, cq30Var.g) && this.h == cq30Var.h && epx.f(this.i, cq30Var.i);
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 31);
        ImageList imageList = this.d;
        int c = pm0.c(this.h, urd0.a(bh10.a(urd0.a((a + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
        oh30 oh30Var = this.i;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        cq30 c = c(this, null, oh30Var, 127);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartEventHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", remoteAvatar=");
        sb.append(this.d);
        sb.append(", attachName=");
        sb.append(this.e);
        sb.append(", attachTimeMs=");
        sb.append(this.f);
        sb.append(", address=");
        sb.append(this.g);
        sb.append(", viewType=");
        sb.append(this.h);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.i, ')');
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
