package xsna;

import com.vk.voip.ui.share.link.pager.view.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class s1x0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1x0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                t1x0 t1x0Var = (t1x0) this.c;
                com.vk.voip.ui.share.link.pager.view.c cVar = t1x0Var.n;
                if (cVar != null) {
                    t1x0Var.l.invoke(new a.C2091a(cVar));
                }
                break;
            default:
                q1y0 q1y0Var = (q1y0) this.c;
                com.vk.metrics.eventtracking.b.a.n("messages_reply_delete");
                q1y0Var.a();
                break;
        }
        return s3q0.a;
    }
}
