package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class gr30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final ImageList e;
    public final String f;
    public final AdapterEntryType g;
    public final oh30 h;
    public Msg i;
    public NestedMsg j;
    public Attach k;

    public gr30(jr30 jr30Var, int i, String str, ImageList imageList, String str2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = imageList;
        this.f = str2;
        this.g = adapterEntryType;
        this.h = oh30Var;
    }

    public static gr30 c(gr30 gr30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = gr30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = gr30Var.c;
        String str = gr30Var.d;
        ImageList imageList = gr30Var.e;
        String str2 = gr30Var.f;
        AdapterEntryType adapterEntryType = gr30Var.g;
        if ((i & 64) != 0) {
            oh30Var = gr30Var.h;
        }
        return new gr30(jr30Var2, i2, str, imageList, str2, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.h;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        gr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        gr30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr30)) {
            return false;
        }
        gr30 gr30Var = (gr30) obj;
        return epx.f(this.b, gr30Var.b) && this.c == gr30Var.c && epx.f(this.d, gr30Var.d) && epx.f(this.e, gr30Var.e) && epx.f(this.f, gr30Var.f) && this.g == gr30Var.g && epx.f(this.h, gr30Var.h);
    }

    public final int hashCode() {
        int a = fw3.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e.b);
        String str = this.f;
        int c = pm0.c(this.g, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        oh30 oh30Var = this.h;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.g;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        gr30 c = c(this, null, oh30Var, 63);
        c.k = this.k;
        c.j = this.j;
        c.i = this.i;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartHighlightHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachHighlightTitle=");
        sb.append(this.d);
        sb.append(", highlightCoverRemoteImageList=");
        sb.append(this.e);
        sb.append(", highlightOwnerName=");
        sb.append(this.f);
        sb.append(", viewType=");
        sb.append(this.g);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.h, ')');
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
