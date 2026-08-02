package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.Map;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class au30 implements ir30, ol8 {
    public final jr30 b;
    public final eew c;
    public final wvw d;
    public final CharSequence e;
    public final boolean f;
    public final int g;
    public final int h;
    public final CnvMsgId i;
    public final AdapterEntryType j;
    public final oh30 k;
    public final abi0 l;
    public final Map<String, WebApiApplication> m;
    public Attach n;

    public au30(jr30 jr30Var, eew eewVar, wvw wvwVar, CharSequence charSequence, boolean z, int i, int i2, CnvMsgId cnvMsgId, AdapterEntryType adapterEntryType, oh30 oh30Var, abi0 abi0Var, Map map) {
        this.b = jr30Var;
        this.c = eewVar;
        this.d = wvwVar;
        this.e = charSequence;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = cnvMsgId;
        this.j = adapterEntryType;
        this.k = oh30Var;
        this.l = abi0Var;
        this.m = map;
    }

    public static au30 c(au30 au30Var, jr30 jr30Var, eew eewVar, wvw wvwVar, oh30 oh30Var, int i) {
        return new au30((i & 1) != 0 ? au30Var.b : jr30Var, (i & 2) != 0 ? au30Var.c : eewVar, (i & 4) != 0 ? au30Var.d : wvwVar, au30Var.e, au30Var.f, au30Var.g, au30Var.h, au30Var.i, au30Var.j, (i & 2048) != 0 ? au30Var.k : oh30Var, au30Var.l, au30Var.m);
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
        au30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.I, uk30Var.J, null, 16376);
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        au30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, null, 16382);
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!au30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        au30 au30Var = (au30) obj;
        return epx.f(this.b, au30Var.b) && epx.f(this.c, au30Var.c) && epx.f(this.d, au30Var.d) && epx.f(this.e, au30Var.e) && this.f == au30Var.f && this.g == au30Var.g && this.h == au30Var.h && epx.f(this.i, au30Var.i) && this.j == au30Var.j && epx.f(this.k, au30Var.k);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        eew eewVar = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (eewVar != null ? eewVar.hashCode() : 0)) * 31)) * 31;
        CharSequence charSequence = this.e;
        int b = (((qoy.b((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.f) + this.g) * 31) + this.h) * 31;
        CnvMsgId cnvMsgId = this.i;
        int c = pm0.c(this.j, (b + (cnvMsgId != null ? cnvMsgId.hashCode() : 0)) * 31, 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        au30 c = c(this, null, null, null, oh30Var, 14335);
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartTextHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", uiReporters=");
        sb.append(this.c);
        sb.append(", infoBridge=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append((Object) this.e);
        sb.append(", isSelectionModeOld=false, isSelectedOld=false, hasLargeEmojis=");
        sb.append(this.f);
        sb.append(", valueNestedLevel=");
        sb.append(this.g);
        sb.append(", msgLocalId=");
        sb.append(this.h);
        sb.append(", msgId=");
        sb.append(this.i);
        sb.append(", viewType=");
        sb.append(this.j);
        sb.append(", bubbleStyle=");
        sb.append(this.k);
        sb.append(", selectedMessagesMediator=");
        sb.append(this.l);
        sb.append(", urlsToMiniApps=");
        return cjl0.a(sb, this.m, ')');
    }

    public au30(eew eewVar, wvw wvwVar, CharSequence charSequence, boolean z, int i, int i2, CnvMsgId cnvMsgId, AdapterEntryType adapterEntryType, abi0 abi0Var, Map map, int i3) {
        this(new jr30(0), eewVar, wvwVar, charSequence, z, i, i2, cnvMsgId, adapterEntryType, null, abi0Var, (i3 & 8192) != 0 ? jgp.b : map);
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
