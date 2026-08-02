package xsna;

import com.vk.fullscreenvideo.a;
import com.vk.profile.community.core.communityleave.LeaveAction;
import xsna.qg00;
import xsna.t6h;
import xsna.xcd0;
import xsna.ynh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y6h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ y6h(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new t6h.b(LeaveAction.REJECT_ADMIN));
                break;
            case 1:
                this.c.invoke(a.f.a);
                break;
            case 2:
                this.c.invoke(ynh0.k.b);
                break;
            case 3:
                this.c.invoke(qg00.g.b);
                break;
            default:
                this.c.invoke(xcd0.a.C3994a.b);
                break;
        }
        return s3q0.a;
    }
}
