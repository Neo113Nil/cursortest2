package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.profile.community.details.impl.contacts.a;
import xsna.dv7;
import xsna.ha70;
import xsna.o9t;
import xsna.sdo;
import xsna.sx40;
import xsna.ynh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lv7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ lv7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(dv7.a.b);
                break;
            case 1:
                this.c.invoke(a.b.b);
                break;
            case 2:
                this.c.invoke(ynh0.i.b);
                break;
            case 3:
                this.c.invoke(sdo.l.b);
                break;
            case 4:
                this.c.invoke(ha70.j.a);
                break;
            case 5:
                this.c.invoke(o9t.q.d.b);
                break;
            case 6:
                this.c.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PlacePicker.b));
                break;
            case 7:
                this.c.invoke(sx40.a0.b);
                break;
            default:
                this.c.invoke(new diq0(false));
                break;
        }
        return s3q0.a;
    }
}
