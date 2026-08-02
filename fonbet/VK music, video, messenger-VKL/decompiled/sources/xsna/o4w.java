package xsna;

import android.content.Context;
import androidx.annotation.CheckResult;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class o4w implements wp10, nl8, suj, ol8 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Msg f;
    public final NestedMsg g;
    public final jr30 h;
    public final gl8 i;
    public final gl8 j;
    public final boolean k;
    public final int[] l;
    public final int[] m;
    public final DialogTheme n;
    public final String o;
    public final boolean p;
    public final long q;
    public final int r;
    public final AttachVideoMsg s;
    public final g34 t;
    public final Integer u;
    public final boolean v;
    public final AdapterEntryType w;
    public final abi0 x;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y;
    public int z;

    public o4w(boolean z, boolean z2, boolean z3, int i, Msg msg, NestedMsg nestedMsg, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, boolean z4, int[] iArr, int[] iArr2, DialogTheme dialogTheme, String str, boolean z5, long j, int i2, AttachVideoMsg attachVideoMsg, g34 g34Var, Integer num, boolean z6, AdapterEntryType adapterEntryType, abi0 abi0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = msg;
        this.g = nestedMsg;
        this.h = jr30Var;
        this.i = gl8Var;
        this.j = gl8Var2;
        this.k = z4;
        this.l = iArr;
        this.m = iArr2;
        this.n = dialogTheme;
        this.o = str;
        this.p = z5;
        this.q = j;
        this.r = i2;
        this.s = attachVideoMsg;
        this.t = g34Var;
        this.u = num;
        this.v = z6;
        this.w = adapterEntryType;
        this.x = abi0Var;
        this.y = gVar;
    }

    public static o4w T0(o4w o4wVar, boolean z, boolean z2, boolean z3, jr30 jr30Var, gl8 gl8Var, gl8 gl8Var2, int[] iArr, int[] iArr2, DialogTheme dialogTheme, String str, g34 g34Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, int i) {
        long j;
        g34 g34Var2;
        boolean z4 = (i & 1) != 0 ? o4wVar.b : z;
        boolean z5 = (i & 2) != 0 ? o4wVar.c : z2;
        boolean z6 = (i & 4) != 0 ? o4wVar.d : z3;
        int i2 = o4wVar.e;
        Msg msg = o4wVar.f;
        NestedMsg nestedMsg = o4wVar.g;
        gl8 gl8Var3 = (i & 128) != 0 ? o4wVar.i : gl8Var;
        gl8 gl8Var4 = (i & 256) != 0 ? o4wVar.j : gl8Var2;
        boolean z7 = o4wVar.k;
        int[] iArr3 = (i & 1024) != 0 ? o4wVar.l : iArr;
        int[] iArr4 = (i & 2048) != 0 ? o4wVar.m : iArr2;
        DialogTheme dialogTheme2 = (i & 4096) != 0 ? o4wVar.n : dialogTheme;
        String str2 = (i & 8192) != 0 ? o4wVar.o : str;
        boolean z8 = o4wVar.p;
        long j2 = o4wVar.q;
        int i3 = o4wVar.r;
        AttachVideoMsg attachVideoMsg = o4wVar.s;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            j = j2;
            g34Var2 = o4wVar.t;
        } else {
            j = j2;
            g34Var2 = g34Var;
        }
        return new o4w(z4, z5, z6, i2, msg, nestedMsg, jr30Var, gl8Var3, gl8Var4, z7, iArr3, iArr4, dialogTheme2, str2, z8, j, i3, attachVideoMsg, g34Var2, o4wVar.u, o4wVar.v, o4wVar.w, o4wVar.x, gVar);
    }

    @Override // xsna.suj
    public final boolean F() {
        return this.c;
    }

    @Override // xsna.nl8
    public final int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return null;
    }

    @Override // xsna.nl8
    public final int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    public final int U0() {
        return (dhr0.M() ? this.i : this.j).a;
    }

    public final boolean V0() {
        abi0 abi0Var = this.x;
        if (abi0Var != null) {
            return abi0Var.d(Integer.valueOf(this.r));
        }
        return false;
    }

    @Override // xsna.nl8
    public final int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    @Override // xsna.nl8
    public final void Z(int i) {
        this.z = i;
    }

    @Override // xsna.wp10
    public final Attach a() {
        return this.s;
    }

    @Override // xsna.wp10
    public final wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        vk30 vk30Var = uk30Var.a;
        long j = this.q;
        boolean z = this.k;
        BubbleColors c = vk30Var.c(j, z, false);
        BubbleColors c2 = vk30Var.c(j, z, true);
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        boolean e = uk30Var.e(z, this.b);
        int i2 = this.e;
        boolean z2 = this.p;
        return T0(this, e, false, false, i, vk30Var.b(c2, i2, z2), vk30Var.b(c, i2, z2), c2.D, c.D, uk30Var.d, cdi.z(this.u, uk30Var.b), uk30Var.P, gVar, 66044478);
    }

    @Override // xsna.suj
    public final int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    @Override // xsna.wp10
    public final wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        jr30 i = uk30Var.i(nsr0Var, gVar2, gVar);
        int i2 = this.r;
        return T0(this, false, gVar != null ? gVar.z0(super.m(), Integer.valueOf(i2)) : false, gVar2 != null ? gVar2.z0(super.m(), Integer.valueOf(i2)) : false, i, null, null, null, null, null, null, null, gVar, 67108793);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (o4w.class.equals(obj != null ? obj.getClass() : null)) {
            o4w o4wVar = (o4w) obj;
            if (this.b == o4wVar.b && this.c == o4wVar.c && this.d == o4wVar.d && this.e == o4wVar.e && epx.f(this.f, o4wVar.f) && epx.f(this.g, o4wVar.g) && this.h.equals(o4wVar.h) && U0() == o4wVar.U0() && this.k == o4wVar.k) {
                if (Arrays.equals(dhr0.M() ? this.l : this.m, dhr0.M() ? o4wVar.l : o4wVar.m) && epx.f(this.n, o4wVar.n) && epx.f(this.o, o4wVar.o)) {
                    abi0 abi0Var = this.x;
                    boolean b = abi0Var != null ? abi0Var.b() : false;
                    abi0 abi0Var2 = o4wVar.x;
                    if (b == (abi0Var2 != null ? abi0Var2.b() : false) && V0() == o4wVar.V0() && this.p == o4wVar.p && this.q == o4wVar.q && this.r == o4wVar.r && epx.f(this.s, o4wVar.s) && epx.f(this.t, o4wVar.t) && epx.f(this.u, o4wVar.u) && this.w == o4wVar.w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.suj
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        int a = pn.a(this.f, (qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d) + this.e) * 31, 31);
        NestedMsg nestedMsg = this.g;
        int hashCode = (this.n.hashCode() + dq.d(qoy.b((Integer.hashCode(U0()) + ar.a(this.h, (a + (nestedMsg != null ? nestedMsg.hashCode() : 0)) * 31, 31)) * 31, 31, this.k), 31, dhr0.M() ? this.l : this.m)) * 31;
        String str = this.o;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abi0 abi0Var = this.x;
        int hashCode3 = (this.s.hashCode() + ((bh10.a(qoy.b((Boolean.hashCode(V0()) + qoy.b(hashCode2, 31, abi0Var != null ? abi0Var.b() : false)) * 31, 31, this.p), 31, this.q) + this.r) * 31)) * 31;
        g34 g34Var = this.t;
        int hashCode4 = (hashCode3 + (g34Var != null ? g34Var.hashCode() : 0)) * 31;
        Integer num = this.u;
        return pm0.c(this.w, (hashCode4 + (num != null ? num.intValue() : 0)) * 31, 31);
    }

    @Override // xsna.wp10
    public final AdapterEntryType l() {
        return this.w;
    }

    @Override // xsna.suj
    public final int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    @Override // xsna.nl8
    public final boolean q() {
        return this.b;
    }

    @Override // xsna.suj
    public final int t() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImInlineVideoMsgPlayerVCItem(isAvatarLayout=");
        sb.append(this.b);
        sb.append(", isPrevSameMsgId=");
        sb.append(this.c);
        sb.append(", isNextSameMsgId=");
        sb.append(this.d);
        sb.append(", valueNestedLevel=");
        sb.append(this.e);
        sb.append(", msg=");
        sb.append(this.f);
        sb.append(", nestedMsg=");
        sb.append(this.g);
        sb.append(", timeStatus=");
        sb.append(this.h);
        sb.append(", bubbleColorDark=");
        sb.append(this.i);
        sb.append(", bubbleColorLight=");
        sb.append(this.j);
        sb.append(", isIncoming=");
        sb.append(this.k);
        sb.append(", bubbleGradientDark=");
        mq.f(this.l, sb, ", bubbleGradientLight=");
        mq.f(this.m, sb, ", dialogTheme=");
        sb.append(this.n);
        sb.append(", videoMessageStencilPath=");
        sb.append(this.o);
        sb.append(", isSelectionModeOld=false, isSelectedOld=false, isValueMsgExpirable=");
        sb.append(this.p);
        sb.append(", valueMsgUniqSenderThemeChatId=");
        sb.append(this.q);
        sb.append(", msgLocalId=");
        sb.append(this.r);
        sb.append(", attach=");
        sb.append(this.s);
        sb.append(", progressMediator=");
        sb.append(this.t);
        sb.append(", shapeId=");
        sb.append(this.u);
        sb.append(", isTranscriptEnabled=");
        sb.append(this.v);
        sb.append(", viewType=");
        sb.append(this.w);
        sb.append(", bubbleStyle=null, selectedMessagesMediator=");
        sb.append(this.x);
        sb.append(", prevItem=");
        sb.append(this.y);
        sb.append(')');
        return sb.toString();
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 R0(Boolean bool) {
        return this;
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 d0(ProfilesInfo profilesInfo) {
        return this;
    }

    @Override // xsna.wp10
    @CheckResult
    public final wp10 n(oh30 oh30Var) {
        return this;
    }
}
