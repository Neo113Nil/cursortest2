package xsna;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.bfa;
import xsna.o9t;
import xsna.sjl0;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gr7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ gr7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(a.d.b);
                break;
            case 1:
                this.c.invoke(bfa.a.b);
                break;
            case 2:
                this.c.invoke(zqe.e.a.b);
                break;
            case 3:
                this.c.invoke(SimilarVideoAction.MoreClick);
                break;
            case 4:
                this.c.invoke(o9t.q.a.b);
                break;
            case 5:
                this.c.invoke(i75.b);
                break;
            case 6:
                this.c.invoke(rxe.a);
                break;
            case 7:
                this.c.invoke(PostingAction.Navigation.CloseInCurrentStep.b);
                break;
            default:
                this.c.invoke(sjl0.a.e.b);
                break;
        }
        return s3q0.a;
    }
}
