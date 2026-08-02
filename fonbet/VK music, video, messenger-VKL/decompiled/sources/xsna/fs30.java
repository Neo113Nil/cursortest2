package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniAppButton;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class fs30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final AttachMiniAppButton.State g;
    public final ImageList h;
    public final boolean i;
    public final AdapterEntryType j;
    public final oh30 k;
    public Msg l;
    public NestedMsg m;
    public Attach n;

    public fs30(jr30 jr30Var, int i, String str, String str2, String str3, AttachMiniAppButton.State state, ImageList imageList, boolean z, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = state;
        this.h = imageList;
        this.i = z;
        this.j = adapterEntryType;
        this.k = oh30Var;
    }

    public static fs30 c(fs30 fs30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = fs30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = fs30Var.c;
        String str = fs30Var.d;
        String str2 = fs30Var.e;
        String str3 = fs30Var.f;
        AttachMiniAppButton.State state = fs30Var.g;
        ImageList imageList = fs30Var.h;
        boolean z = fs30Var.i;
        AdapterEntryType adapterEntryType = fs30Var.j;
        if ((i & 512) != 0) {
            oh30Var = fs30Var.k;
        }
        return new fs30(jr30Var2, i2, str, str2, str3, state, imageList, z, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.k;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.n;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        fs30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        fs30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs30)) {
            return false;
        }
        fs30 fs30Var = (fs30) obj;
        return epx.f(this.b, fs30Var.b) && this.c == fs30Var.c && epx.f(this.d, fs30Var.d) && epx.f(this.e, fs30Var.e) && epx.f(this.f, fs30Var.f) && this.g == fs30Var.g && epx.f(this.h, fs30Var.h) && this.i == fs30Var.i && this.j == fs30Var.j && epx.f(this.k, fs30Var.k);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f);
        AttachMiniAppButton.State state = this.g;
        int c = pm0.c(this.j, qoy.b(fw3.a((a + (state == null ? 0 : state.hashCode())) * 31, 31, this.h.b), 31, this.i), 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        fs30 c = c(this, null, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartMiniAppHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachTitle=");
        sb.append(this.d);
        sb.append(", attachDescription=");
        sb.append(this.e);
        sb.append(", buttonText=");
        sb.append(this.f);
        sb.append(", attachMiniAppButtonState=");
        sb.append(this.g);
        sb.append(", images=");
        sb.append(this.h);
        sb.append(", hasAttachedGift=");
        sb.append(this.i);
        sb.append(", viewType=");
        sb.append(this.j);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.k, ')');
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
