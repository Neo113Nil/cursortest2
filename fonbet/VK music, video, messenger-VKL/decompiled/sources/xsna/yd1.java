package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import xsna.a080;
import xsna.cd1;
import xsna.lbf;
import xsna.mbf;
import xsna.nue;
import xsna.r2c;
import xsna.t44;
import xsna.wml0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yd1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ yd1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(cd1.a.b);
                break;
            case 1:
                this.c.invoke(r2c.u.b);
                break;
            case 2:
                this.c.invoke(nue.c.b);
                break;
            case 3:
                this.c.invoke(mbf.c.C3333c.a);
                break;
            case 4:
                this.c.invoke(lbf.c.C3251c.b);
                break;
            case 5:
                this.c.invoke(new a080.a(false));
                break;
            case 6:
                this.c.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PlacePicker.b));
                break;
            case 7:
                this.c.invoke(new diq0(true));
                break;
            case 8:
                this.c.invoke(t44.j.b);
                break;
            default:
                this.c.invoke(wml0.a.k.b);
                break;
        }
        return s3q0.a;
    }
}
