package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.nsr0;

/* compiled from: MsgListDiffCallback.kt */
/* loaded from: classes2.dex */
public final class ll30 extends m.b {
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> b;
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ll30(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = this.b.get(i);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = this.c.get(i2);
        if (gVar.l() != gVar2.l() || gVar.r0() != gVar2.r0()) {
            return false;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0 = gVar.s0();
        Integer valueOf = s0 != null ? Integer.valueOf(s0.a) : null;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s02 = gVar2.s0();
        return epx.f(valueOf, s02 != null ? Integer.valueOf(s02.a) : null);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i2, this.c);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i, this.b);
        if (!(gVar instanceof nsr0) || !(gVar2 instanceof nsr0)) {
            return super.getChangePayload(i, i2);
        }
        nsr0 nsr0Var = (nsr0) gVar2;
        nsr0 nsr0Var2 = (nsr0) gVar;
        ir30 ir30Var = nsr0Var2.c;
        ListBuilder e = e43.e();
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = nsr0Var.b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar2 = nsr0Var2.b;
        if (!epx.f(fVar, fVar2)) {
            e.add(new nsr0.a.C3411a(fVar2));
        }
        if (!epx.f(nsr0Var.c, ir30Var)) {
            e.add(new nsr0.a.b(ir30Var));
        }
        return e.g();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
