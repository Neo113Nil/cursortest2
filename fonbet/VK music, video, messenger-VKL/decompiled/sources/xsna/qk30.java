package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.messages.MsgIdType;
import java.util.List;

/* compiled from: MsgListAdapterHelper.kt */
/* loaded from: classes2.dex */
public final class qk30 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(RecyclerView.Adapter<RecyclerView.e0> adapter, MsgIdType msgIdType, int i) {
        if (adapter instanceof bv30) {
            return ((bv30) adapter).A(msgIdType, i);
        }
        return -1;
    }

    public static final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b(int i, RecyclerView.Adapter adapter) {
        if (adapter instanceof ok30) {
            return (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i, ((ok30) adapter).f);
        }
        return null;
    }

    public static final long c(int i, RecyclerView.Adapter adapter) {
        if (adapter instanceof ok30) {
            return ((ok30) adapter).getItemId(i);
        }
        return -1L;
    }

    public static final int d(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        if (adapter instanceof ok30) {
            return e43.h(((ok30) adapter).f);
        }
        return -1;
    }

    public static final boolean e(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        return (adapter instanceof ok30) && !((ok30) adapter).f.isEmpty();
    }

    public static final void f(RecyclerView.Adapter<RecyclerView.e0> adapter, List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, m.d dVar) {
        if (adapter instanceof ok30) {
            ok30 ok30Var = (ok30) adapter;
            if (dVar == null) {
                dVar = androidx.recyclerview.widget.m.a(new ll30(ok30Var.f, list), false);
            }
            dVar.b(ok30Var);
            ok30Var.f = list;
        }
    }
}
