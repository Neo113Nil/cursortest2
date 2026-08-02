package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class vp30 implements ir30, ol8, suj {
    public final jr30 b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final ImageList f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final AdapterEntryType k;
    public final oh30 l;
    public final boolean m;
    public final boolean n;
    public final int o;

    public vp30(jr30 jr30Var, String str, CharSequence charSequence, String str2, ImageList imageList, boolean z, int i, boolean z2, boolean z3, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z4, boolean z5, int i2) {
        this.b = jr30Var;
        this.c = str;
        this.d = charSequence;
        this.e = str2;
        this.f = imageList;
        this.g = z;
        this.h = i;
        this.i = z2;
        this.j = z3;
        this.k = adapterEntryType;
        this.l = oh30Var;
        this.m = z4;
        this.n = z5;
        this.o = i2;
    }

    public static vp30 h(vp30 vp30Var, jr30 jr30Var, boolean z, oh30 oh30Var, boolean z2, boolean z3, int i) {
        return new vp30((i & 1) != 0 ? vp30Var.b : jr30Var, vp30Var.c, vp30Var.d, vp30Var.e, vp30Var.f, vp30Var.g, vp30Var.h, vp30Var.i, (i & 512) != 0 ? vp30Var.j : z, vp30Var.k, (i & 2048) != 0 ? vp30Var.l : oh30Var, (i & 4096) != 0 ? vp30Var.m : z2, (i & 8192) != 0 ? vp30Var.n : z3, vp30Var.o);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.m;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.l;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        com.vk.im.engine.models.dialogs.c cVar = uk30Var.d.b;
        return h(this, i, cVar.equals(c.C1124c.c) || cVar.equals(c.g.c), null, false, false, 32254);
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.h;
        return h(this, i, false, null, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, 20478);
    }

    @Override // xsna.ir30
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return h(this, null, false, null, false, false, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vp30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vp30 vp30Var = (vp30) obj;
        return this.g == vp30Var.g && this.h == vp30Var.h && this.i == vp30Var.i && this.j == vp30Var.j && this.m == vp30Var.m && this.n == vp30Var.n && this.o == vp30Var.o && epx.f(this.b, vp30Var.b) && this.c.equals(vp30Var.c) && this.d.equals(vp30Var.d) && epx.f(this.e, vp30Var.e) && epx.f(this.f, vp30Var.f) && this.k == vp30Var.k && epx.f(this.l, vp30Var.l);
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.n;
    }

    public final int hashCode() {
        int c = u11.c(urd0.a(ar.a(this.b, (qoy.b(qoy.b(qoy.b(qoy.b(((Boolean.hashCode(this.g) * 31) + this.h) * 31, 31, this.i), 31, this.j), 31, this.m), 31, this.n) + this.o) * 31, 31), 31, this.c), 961, this.d);
        String str = this.e;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
        ImageList imageList = this.f;
        int c2 = pm0.c(this.k, (hashCode + (imageList != null ? imageList.b.hashCode() : 0)) * 31, 31);
        oh30 oh30Var = this.l;
        return (c2 + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31;
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.k;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return h(this, null, false, oh30Var, false, false, 30719);
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.suj
    public final int t() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartDonatePlaceholderRedesignHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append((Object) this.d);
        sb.append(", shortButtonText=null, buttonUrl=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", isIncoming=");
        sb.append(this.g);
        sb.append(", msgLocalId=");
        sb.append(this.h);
        sb.append(", isInsideAttachChannelMsg=");
        sb.append(this.i);
        sb.append(", dialogThemeDefault=");
        sb.append(this.j);
        sb.append(", viewType=");
        sb.append(this.k);
        sb.append(", bubbleStyle=");
        sb.append(this.l);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.m);
        sb.append(", isNextSameMsgId=");
        sb.append(this.n);
        sb.append(", valueNestedLevel=");
        return vu5.b(sb, this.o, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
