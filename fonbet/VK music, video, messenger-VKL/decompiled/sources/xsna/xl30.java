package xsna;

import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import java.util.List;

/* compiled from: MsgListState.kt */
/* loaded from: classes2.dex */
public final class xl30 {
    public final int a;
    public final int b;
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> c;
    public final MsgListOpenMode d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final li30 h;

    public xl30() {
        this(0);
    }

    public static xl30 a(xl30 xl30Var, int i, int i2, List list, MsgListOpenMode msgListOpenMode, boolean z, boolean z2, li30 li30Var, int i3) {
        if ((i3 & 1) != 0) {
            i = xl30Var.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = xl30Var.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            list = xl30Var.c;
        }
        List list2 = list;
        boolean z3 = (i3 & 16) != 0 ? xl30Var.e : z;
        boolean z4 = (i3 & 32) != 0 ? xl30Var.f : false;
        boolean z5 = (i3 & 64) != 0 ? xl30Var.g : z2;
        li30 li30Var2 = (i3 & 128) != 0 ? xl30Var.h : li30Var;
        xl30Var.getClass();
        return new xl30(i4, i5, list2, msgListOpenMode, z3, z4, z5, li30Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl30)) {
            return false;
        }
        xl30 xl30Var = (xl30) obj;
        return this.a == xl30Var.a && this.b == xl30Var.b && epx.f(this.c, xl30Var.c) && epx.f(this.d, xl30Var.d) && this.e == xl30Var.e && this.f == xl30Var.f && this.g == xl30Var.g && epx.f(this.h, xl30Var.h);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = this.c;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        MsgListOpenMode msgListOpenMode = this.d;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (msgListOpenMode == null ? 0 : msgListOpenMode.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        li30 li30Var = this.h;
        return b + (li30Var != null ? li30Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "MsgListState(unreadDividerPositionAsCnvId=" + this.a + ", msgEditLocalId=" + this.b + ", entryList=" + this.c + ", openMode=" + this.d + ", useOldScrollParams=" + this.e + ", shouldSmoothScroll=" + this.f + ", shouldScrollToLatest=" + this.g + ", msgDisplayedOnUiReportInfo=" + this.h + ')';
    }

    public /* synthetic */ xl30(int i) {
        this(0, -1, null, null, false, false, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xl30(int i, int i2, List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, MsgListOpenMode msgListOpenMode, boolean z, boolean z2, boolean z3, li30 li30Var) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = msgListOpenMode;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = li30Var;
    }
}
