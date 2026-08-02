package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.dpp0;
import xsna.dv7;
import xsna.oa70;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ to0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new sx40.p(false));
                break;
            case 1:
                this.c.invoke(dv7.e.b);
                break;
            case 2:
                this.c.invoke(PostingAction.Hints.RemoveCoauthorsOnboardingHint.b);
                break;
            case 3:
                this.c.invoke(oa70.l.b);
                break;
            case 4:
                this.c.invoke(g8o0.b);
                break;
            default:
                this.c.invoke(dpp0.c.b);
                break;
        }
        return s3q0.a;
    }
}
