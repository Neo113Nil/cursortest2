package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.dpp0;
import xsna.dv7;
import xsna.gqx;
import xsna.o3v;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class m77 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m77(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new a.f(o3v.b.a));
                break;
            case 1:
                this.c.invoke(dv7.b.b);
                break;
            case 2:
                this.c.invoke(a.C0969a.b);
                break;
            case 3:
                this.c.invoke(yda.d.b.b);
                break;
            case 4:
                this.c.invoke(PostingAction.Editing.RemoveCoauthors.b);
                break;
            case 5:
                this.c.invoke(gqx.a.b);
                break;
            default:
                this.c.invoke(dpp0.a.b);
                break;
        }
        return s3q0.a;
    }
}
