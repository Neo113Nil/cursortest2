package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import xsna.mbf;
import xsna.uvo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qpd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ qpd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new mbf.b.g((zoa) obj));
                break;
            default:
                this.c.invoke(new uvo.f(FaqSource.BUDGET));
                break;
        }
        return s3q0.a;
    }
}
