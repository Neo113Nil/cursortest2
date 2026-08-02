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
public final class lu30 implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final ImageList d;
    public final String e;
    public final String f;
    public final Integer g;
    public final AdapterEntryType h;
    public final oh30 i;
    public Msg j;
    public NestedMsg k;
    public Attach l;

    public lu30(jr30 jr30Var, int i, ImageList imageList, String str, String str2, Integer num, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = imageList;
        this.e = str;
        this.f = str2;
        this.g = num;
        this.h = adapterEntryType;
        this.i = oh30Var;
    }

    public static lu30 c(lu30 lu30Var, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = lu30Var.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = lu30Var.c;
        ImageList imageList = lu30Var.d;
        String str = lu30Var.e;
        String str2 = lu30Var.f;
        Integer num = lu30Var.g;
        AdapterEntryType adapterEntryType = lu30Var.h;
        if ((i & 128) != 0) {
            oh30Var = lu30Var.i;
        }
        return new lu30(jr30Var2, i2, imageList, str, str2, num, adapterEntryType, oh30Var);
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
        lu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 254);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        lu30 c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, 254);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu30)) {
            return false;
        }
        lu30 lu30Var = (lu30) obj;
        return epx.f(this.b, lu30Var.b) && this.c == lu30Var.c && epx.f(this.d, lu30Var.d) && epx.f(this.e, lu30Var.e) && epx.f(this.f, lu30Var.f) && epx.f(this.g, lu30Var.g) && this.h == lu30Var.h && epx.f(this.i, lu30Var.i);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31, this.e), 31, this.f);
        Integer num = this.g;
        int c = pm0.c(this.h, (a + (num == null ? 0 : num.hashCode())) * 31, 31);
        oh30 oh30Var = this.i;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.h;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        lu30 c = c(this, null, oh30Var, 127);
        c.l = this.l;
        c.k = this.k;
        c.j = this.j;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartVmojiCharactHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", imageList=");
        sb.append(this.d);
        sb.append(", attachTitle=");
        sb.append(this.e);
        sb.append(", attachCaption=");
        sb.append(this.f);
        sb.append(", vmojiAttachBackgroundColor=");
        sb.append(this.g);
        sb.append(", viewType=");
        sb.append(this.h);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.i, ')');
    }

    public /* synthetic */ lu30(int i, ImageList imageList, String str, String str2, Integer num, AdapterEntryType adapterEntryType) {
        this(new jr30(0), i, imageList, str, str2, num, adapterEntryType, null);
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
