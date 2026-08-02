package xsna;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class br30 implements ir30, ol8 {
    public final jr30 b;
    public final CharSequence c;
    public final int d;
    public final User e;
    public final boolean f;
    public final long g;
    public final long h;
    public final boolean i;
    public final AdapterEntryType j;
    public final oh30 k;
    public Msg l;
    public NestedMsg m;
    public Attach n;

    public br30(jr30 jr30Var, CharSequence charSequence, int i, User user, boolean z, long j, long j2, boolean z2, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = charSequence;
        this.d = i;
        this.e = user;
        this.f = z;
        this.g = j;
        this.h = j2;
        this.i = z2;
        this.j = adapterEntryType;
        this.k = oh30Var;
    }

    public static br30 c(br30 br30Var, jr30 jr30Var, User user, oh30 oh30Var, int i) {
        return new br30((i & 1) != 0 ? br30Var.b : jr30Var, br30Var.c, br30Var.d, (i & 8) != 0 ? br30Var.e : user, br30Var.f, br30Var.g, br30Var.h, br30Var.i, br30Var.j, (i & 512) != 0 ? br30Var.k : oh30Var);
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
        br30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.l = this.l;
        c.m = this.m;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        br30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.l = this.l;
        c.m = this.m;
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br30)) {
            return false;
        }
        br30 br30Var = (br30) obj;
        return epx.f(this.b, br30Var.b) && epx.f(this.c, br30Var.c) && this.d == br30Var.d && epx.f(this.e, br30Var.e) && this.f == br30Var.f && this.g == br30Var.g && this.h == br30Var.h && this.i == br30Var.i && this.j == br30Var.j && epx.f(this.k, br30Var.k);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CharSequence charSequence = this.c;
        int a = shy.a(this.d, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        User user = this.e;
        int c = pm0.c(this.j, qoy.b(bh10.a(bh10.a(qoy.b((a + (user == null ? 0 : user.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        br30 c = c(this, null, null, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        c.l = this.l;
        c.m = this.m;
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        br30 c = c(this, null, (User) profilesInfo.b.c.get(Long.valueOf(this.g)), null, 1015);
        c.l = this.l;
        c.m = this.m;
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartGiftHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append((Object) this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", userProfile=");
        sb.append(this.e);
        sb.append(", msgIsIncoming=");
        sb.append(this.f);
        sb.append(", msgDialogId=");
        sb.append(this.g);
        sb.append(", currentUserId=");
        sb.append(this.h);
        sb.append(", isReplyAvailable=");
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
}
