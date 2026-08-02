package xsna;

import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul30 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.vk.im.ui.components.msg_list.c c;

    public /* synthetic */ ul30(boolean z, com.vk.im.ui.components.msg_list.c cVar) {
        this.b = z;
        this.c = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        xl30 xl30Var = (xl30) obj;
        if (this.b) {
            com.vk.im.ui.components.msg_list.c cVar = this.c;
            cVar.getClass();
            if (xl30Var.c != null && (!r4.isEmpty())) {
                jl30 jl30Var = cVar.d;
                OpenMessagesHistoryReporter openMessagesHistoryReporter = jl30Var.a;
                openMessagesHistoryReporter.f((mdz) jl30Var.j.getValue(), null);
                openMessagesHistoryReporter.f(jl30Var.k(), null);
            }
        }
        return s3q0.a;
    }
}
