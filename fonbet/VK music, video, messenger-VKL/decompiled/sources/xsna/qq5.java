package xsna;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.community.impl.ui.events.a;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.sjl0;
import xsna.sx40;
import xsna.wiw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qq5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ qq5(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new biq0(null));
                break;
            case 1:
                this.c.invoke(a.b.b);
                break;
            case 2:
                this.c.invoke(a.d.b);
                break;
            case 3:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            case 4:
                this.c.invoke(PostingAction.Editing.Attach.RemoveFile.b);
                break;
            case 5:
                this.c.invoke(wiw.a.a);
                break;
            case 6:
                this.c.invoke(rr40.b);
                break;
            case 7:
                this.c.invoke(sx40.v.b);
                break;
            case 8:
                this.c.invoke(qxe.a);
                break;
            default:
                this.c.invoke(sjl0.a.c.b);
                break;
        }
        return s3q0.a;
    }
}
