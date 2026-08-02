package xsna;

import androidx.recyclerview.widget.m;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.ufh0;

/* compiled from: AdapterEntryListState.kt */
/* loaded from: classes16.dex */
public final class oj0 {
    public final m.d a;
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> b;
    public final MsgListOpenMode c;
    public final ufh0 d;
    public final int e;
    public final boolean f;
    public final Set<Integer> g;

    public oj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj0)) {
            return false;
        }
        oj0 oj0Var = (oj0) obj;
        return epx.f(this.a, oj0Var.a) && epx.f(this.b, oj0Var.b) && epx.f(this.c, oj0Var.c) && epx.f(this.d, oj0Var.d) && this.e == oj0Var.e && this.f == oj0Var.f && epx.f(this.g, oj0Var.g);
    }

    public final int hashCode() {
        m.d dVar = this.a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MsgListOpenMode msgListOpenMode = this.c;
        return this.g.hashCode() + qoy.b(shy.a(this.e, (this.d.hashCode() + ((hashCode2 + (msgListOpenMode != null ? msgListOpenMode.hashCode() : 0)) * 31)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdapterEntryListState(diffEntryList=");
        sb.append(this.a);
        sb.append(", entryList=");
        sb.append(this.b);
        sb.append(", mode=");
        sb.append(this.c);
        sb.append(", scrollMode=");
        sb.append(this.d);
        sb.append(", readTill=");
        sb.append(this.e);
        sb.append(", isNewMessage=");
        sb.append(this.f);
        sb.append(", newMsgLocalIds=");
        return ur.c(sb, this.g, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oj0(m.d dVar, List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, MsgListOpenMode msgListOpenMode, ufh0 ufh0Var, int i, boolean z, Set<Integer> set) {
        this.a = dVar;
        this.b = list;
        this.c = msgListOpenMode;
        this.d = ufh0Var;
        this.e = i;
        this.f = z;
        this.g = set;
    }

    public oj0(int i) {
        this(null, null, null, ufh0.a.a, -1, false, EmptySet.b);
    }
}
