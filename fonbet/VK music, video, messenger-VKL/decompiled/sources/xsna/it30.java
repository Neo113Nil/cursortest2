package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.Arrays;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class it30 implements ir30, ol8 {
    public final oh30 b;
    public final Msg c;
    public final int d;
    public final NestedMsg e;
    public final String f;
    public final DialogTheme g;
    public final boolean h;
    public final int[] i;
    public final int[] j;
    public final gl8 k;
    public final gl8 l;
    public final ProfilesSimpleInfo m;
    public final rxd0 n;
    public final long o;
    public final Integer p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final AdapterEntryType t;

    public it30(oh30 oh30Var, Msg msg, int i, NestedMsg nestedMsg, String str, DialogTheme dialogTheme, boolean z, int[] iArr, int[] iArr2, gl8 gl8Var, gl8 gl8Var2, ProfilesSimpleInfo profilesSimpleInfo, rxd0 rxd0Var, long j, Integer num, int i2, boolean z2, boolean z3, AdapterEntryType adapterEntryType) {
        this.b = oh30Var;
        this.c = msg;
        this.d = i;
        this.e = nestedMsg;
        this.f = str;
        this.g = dialogTheme;
        this.h = z;
        this.i = iArr;
        this.j = iArr2;
        this.k = gl8Var;
        this.l = gl8Var2;
        this.m = profilesSimpleInfo;
        this.n = rxd0Var;
        this.o = j;
        this.p = num;
        this.q = i2;
        this.r = z2;
        this.s = z3;
        this.t = adapterEntryType;
    }

    public static it30 c(it30 it30Var, oh30 oh30Var, String str, DialogTheme dialogTheme, int[] iArr, int[] iArr2, gl8 gl8Var, gl8 gl8Var2, int i) {
        return new it30((i & 1) != 0 ? it30Var.b : oh30Var, it30Var.c, it30Var.d, it30Var.e, (i & 16) != 0 ? it30Var.f : str, (i & 32) != 0 ? it30Var.g : dialogTheme, it30Var.h, (i & 128) != 0 ? it30Var.i : iArr, (i & 256) != 0 ? it30Var.j : iArr2, (i & 512) != 0 ? it30Var.k : gl8Var, (i & 1024) != 0 ? it30Var.l : gl8Var2, it30Var.m, it30Var.n, it30Var.o, it30Var.p, it30Var.q, it30Var.r, it30Var.s, it30Var.t);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.b;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.o;
        boolean z = this.h;
        BubbleColors c = vk30Var.c(j, z, true);
        BubbleColors c2 = vk30Var.c(j, z, false);
        DialogTheme dialogTheme = uk30Var.d;
        int i = this.d;
        boolean z2 = this.r;
        gl8 b = vk30Var.b(c, i, z2);
        gl8 b2 = vk30Var.b(c2, i, z2);
        return c(this, null, cdi.z(this.p, uk30Var.b), dialogTheme, c.D, c2.D, b, b2, 522319);
    }

    public final int e() {
        return (dhr0.M() ? this.k : this.l).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!it30.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        it30 it30Var = (it30) obj;
        if (epx.f(this.b, it30Var.b) && epx.f(this.c, it30Var.c) && this.d == it30Var.d && epx.f(this.e, it30Var.e) && epx.f(this.f, it30Var.f) && epx.f(this.g, it30Var.g) && this.h == it30Var.h) {
            return Arrays.equals(dhr0.M() ? this.i : this.j, dhr0.M() ? it30Var.i : it30Var.j) && e() == it30Var.e() && this.m.equals(it30Var.m) && this.o == it30Var.o && epx.f(this.p, it30Var.p) && this.q == it30Var.q && this.r == it30Var.r && this.s == it30Var.s && this.t == it30Var.t;
        }
        return false;
    }

    public final int hashCode() {
        oh30 oh30Var = this.b;
        int a = (pn.a(this.c, (oh30Var != null ? oh30Var.hashCode() : 0) * 31, 31) + this.d) * 31;
        NestedMsg nestedMsg = this.e;
        int hashCode = (a + (nestedMsg != null ? nestedMsg.hashCode() : 0)) * 31;
        String str = this.f;
        int a2 = bh10.a(io.reactivex.rxjava3.subjects.c.a(this.m, (Integer.hashCode(e()) + dq.d(qoy.b((this.g.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.h), 31, dhr0.M() ? this.i : this.j)) * 31, 31), 31, this.o);
        Integer num = this.p;
        return this.t.hashCode() + qoy.b(qoy.b((((a2 + (num != null ? num.intValue() : 0)) * 31) + this.q) * 31, 31, this.r), 31, this.s);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.t;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        return c(this, oh30Var, null, null, null, null, null, null, 524286);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartReplyHolderItem(bubbleStyle=");
        sb.append(this.b);
        sb.append(", msg=");
        sb.append(this.c);
        sb.append(", valueNestedLevel=");
        sb.append(this.d);
        sb.append(", nestedMsg=");
        sb.append(this.e);
        sb.append(", videoMessageStencilPath=");
        sb.append(this.f);
        sb.append(", theme=");
        sb.append(this.g);
        sb.append(", isIncoming=");
        sb.append(this.h);
        sb.append(", bubbleGradientDark=");
        mq.f(this.i, sb, ", bubbleGradientLight=");
        mq.f(this.j, sb, ", bubbleColorDark=");
        sb.append(this.k);
        sb.append(", bubbleColorLight=");
        sb.append(this.l);
        sb.append(", profiles=");
        sb.append(this.m);
        sb.append(", profileMediators=");
        sb.append(this.n);
        sb.append(", valueMsgUniqSenderThemeChatId=");
        sb.append(this.o);
        sb.append(", shareId=");
        sb.append(this.p);
        sb.append(", msgLocalId=");
        sb.append(this.q);
        sb.append(", isValueMsgExpirable=");
        sb.append(this.r);
        sb.append(", isSubtitleStylePrimary=");
        sb.append(this.s);
        sb.append(", viewType=");
        sb.append(this.t);
        sb.append(')');
        return sb.toString();
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

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
