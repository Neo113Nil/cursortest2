package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.ImageSize;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class ws30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final List<ImageSize> g;
    public final String h;
    public final String i;
    public final AdapterEntryType j;
    public final oh30 k;
    public Msg l;
    public NestedMsg m;
    public Attach n;

    public ws30(jr30 jr30Var, int i, boolean z, boolean z2, String str, List<ImageSize> list, String str2, String str3, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = list;
        this.h = str2;
        this.i = str3;
        this.j = adapterEntryType;
        this.k = oh30Var;
    }

    public static ws30 c(ws30 ws30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = ws30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = ws30Var.c;
        boolean z = ws30Var.d;
        boolean z2 = ws30Var.e;
        String str = ws30Var.f;
        List<ImageSize> list = ws30Var.g;
        String str2 = ws30Var.h;
        String str3 = ws30Var.i;
        AdapterEntryType adapterEntryType = ws30Var.j;
        if ((i & 512) != 0) {
            oh30Var = ws30Var.k;
        }
        return new ws30(jr30Var2, i2, z, z2, str, list, str2, str3, adapterEntryType, oh30Var);
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
        ws30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        ws30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws30)) {
            return false;
        }
        ws30 ws30Var = (ws30) obj;
        return epx.f(this.b, ws30Var.b) && this.c == ws30Var.c && this.d == ws30Var.d && this.e == ws30Var.e && epx.f(this.f, ws30Var.f) && epx.f(this.g, ws30Var.g) && epx.f(this.h, ws30Var.h) && epx.f(this.i, ws30Var.i) && this.j == ws30Var.j && epx.f(this.k, ws30Var.k);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        String str = this.f;
        int a = fw3.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int c = pm0.c(this.j, urd0.a((a + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        ws30 c = c(this, null, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartPodcastEpisodeHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", isDonutRestricted=");
        sb.append(this.d);
        sb.append(", hasRestrictionData=");
        sb.append(this.e);
        sb.append(", attachPodcastEpisodeRestrictionButtonTitle=");
        sb.append(this.f);
        sb.append(", attachPodcastEpisodeImages=");
        sb.append(this.g);
        sb.append(", attachPodcastEpisodeRestrictionDescription=");
        sb.append(this.h);
        sb.append(", attachPodcastEpisodeTitle=");
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
