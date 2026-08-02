package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.formatters.DisplayNameFormatter;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class qq30 implements ir30 {
    public final Peer b;
    public final long c;
    public final String d;
    public final CharSequence e;
    public final ImageList f;
    public final boolean g;
    public final Integer h;
    public final AdapterEntryType i = AdapterEntryType.TYPE_FWD_SENDER;

    public qq30(Peer peer, long j, String str, CharSequence charSequence, ImageList imageList, boolean z, Integer num) {
        this.b = peer;
        this.c = j;
        this.d = str;
        this.e = charSequence;
        this.f = imageList;
        this.g = z;
        this.h = num;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq30)) {
            return false;
        }
        qq30 qq30Var = (qq30) obj;
        return epx.f(this.b, qq30Var.b) && this.c == qq30Var.c && epx.f(this.d, qq30Var.d) && epx.f(this.e, qq30Var.e) && epx.f(this.f, qq30Var.f) && this.g == qq30Var.g && epx.f(this.h, qq30Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode = (a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ImageList imageList = this.f;
        int b = qoy.b((hashCode + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.g);
        Integer num = this.h;
        return b + (num != null ? num.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.i;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        qtd0 Bb = profilesInfo.Bb(this.b);
        DisplayNameFormatter displayNameFormatter = uk30Var.f0;
        displayNameFormatter.getClass();
        String e = displayNameFormatter.e(Bb, UserNameCase.NOM);
        ImageList C8 = Bb != null ? Bb.C8() : null;
        String name = Bb != null ? Bb.name() : null;
        if (name == null) {
            name = "";
        }
        return new qq30(this.b, this.c, name, e, C8, Bb != null ? Bb.n9() : false, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartFwdSenderHolderItem(nestedMsgPeer=");
        sb.append(this.b);
        sb.append(", nestedTime=");
        sb.append(this.c);
        sb.append(", profileName=");
        sb.append(this.d);
        sb.append(", formattedName=");
        sb.append((Object) this.e);
        sb.append(", avatarImages=");
        sb.append(this.f);
        sb.append(", isNftAvatar=");
        sb.append(this.g);
        sb.append(", cnvMsgId=");
        return uqi.b(sb, this.h, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
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
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
