package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.a080;
import xsna.avm0;
import xsna.dv7;
import xsna.rma0;
import xsna.us70;
import xsna.wml0;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mv7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ mv7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(dv7.c.b);
                break;
            case 1:
                this.c.invoke(yda.e.b);
                break;
            case 2:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            case 3:
                this.c.invoke(us70.c.b);
                break;
            case 4:
                this.c.invoke(a080.e.b);
                break;
            case 5:
                this.c.invoke(rma0.d.b);
                break;
            case 6:
                this.c.invoke(PostingAction.Editing.Attach.RemovePlace.b);
                break;
            case 7:
                this.c.invoke(avm0.a.b);
                break;
            default:
                this.c.invoke(wml0.a.g.b);
                break;
        }
        return s3q0.a;
    }
}
