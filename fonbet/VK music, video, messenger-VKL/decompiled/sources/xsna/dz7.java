package xsna;

import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.dbe0;
import xsna.fpc;
import xsna.o9t;
import xsna.q7t;
import xsna.sv2;
import xsna.sx40;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dz7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ dz7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(a.b.b);
                break;
            case 1:
                this.c.invoke(fpc.c.b);
                break;
            case 2:
                this.c.invoke(z7k.b.b);
                break;
            case 3:
                this.c.invoke(new o9t.j(q7t.d.a));
                break;
            case 4:
                this.c.invoke(PostingAction.Hints.DonutPrivacyOnboardingShowed.b);
                break;
            case 5:
                this.c.invoke(new sx40.r0(null));
                break;
            case 6:
                this.c.invoke(sv2.d.b);
                break;
            default:
                this.c.invoke(dbe0.n.b);
                break;
        }
        return s3q0.a;
    }
}
