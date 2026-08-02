package xsna;

import xsna.y670;

/* compiled from: VhMsg.kt */
/* loaded from: classes2.dex */
public final class lsr0 implements y670.a {
    public final /* synthetic */ com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a a;

    public lsr0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.y670.a
    public final void a() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = this.a;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = aVar.p.k;
        Integer valueOf = cVar != null ? Integer.valueOf(cVar.b) : null;
        pk30 pk30Var = aVar.J;
        if (pk30Var == null || valueOf == null || pk30Var == null) {
            return;
        }
        pk30Var.g(valueOf.intValue());
    }

    @Override // xsna.y670.a
    public final void b() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = this.a;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = aVar.p.k;
        Integer valueOf = cVar != null ? Integer.valueOf(cVar.b) : null;
        pk30 pk30Var = aVar.J;
        if (pk30Var == null || valueOf == null || pk30Var == null) {
            return;
        }
        pk30Var.C(valueOf.intValue());
    }

    @Override // xsna.y670.a
    public final void c() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = this.a;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = aVar.p.k;
        Integer valueOf = cVar != null ? Integer.valueOf(cVar.b) : null;
        pk30 pk30Var = aVar.J;
        if (pk30Var == null || valueOf == null || pk30Var == null) {
            return;
        }
        pk30Var.b0(valueOf.intValue());
    }
}
