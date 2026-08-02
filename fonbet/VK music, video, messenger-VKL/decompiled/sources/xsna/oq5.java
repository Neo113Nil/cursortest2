package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.aiq0;
import xsna.cro;
import xsna.d78;
import xsna.hjl0;
import xsna.sx40;
import xsna.wed0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oq5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ oq5(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(aiq0.a.C2544a.b);
                break;
            case 1:
                this.c.invoke(d78.e.b);
                break;
            case 2:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            case 3:
                this.c.invoke(cro.q.b);
                break;
            case 4:
                this.c.invoke(hjl0.a.f.b);
                break;
            case 5:
                this.c.invoke(new sx40.r0(null));
                break;
            case 6:
                this.c.invoke(new sx40.r0(null));
                break;
            case 7:
                this.c.invoke(rr40.b);
                break;
            case 8:
                this.c.invoke(OrderListAction.h.b);
                break;
            case 9:
                this.c.invoke(new wed0.e(true));
                break;
            case 10:
                this.c.invoke(nxe.a);
                break;
            case 11:
                PostingAction.Navigation.CloseInCurrentStep closeInCurrentStep = PostingAction.Navigation.CloseInCurrentStep.b;
                izs izsVar = this.c;
                izsVar.invoke(closeInCurrentStep);
                izsVar.invoke(PostingAction.Editing.Attach.RemovePoll.b);
                break;
            default:
                this.c.invoke(hjl0.a.n.b);
                break;
        }
        return s3q0.a;
    }
}
