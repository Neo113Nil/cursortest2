package xsna;

import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import kotlin.NoWhenBranchMatchedException;
import xsna.dra0;
import xsna.fis;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ndh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ndh(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gqx iqxVar;
        switch (this.b) {
            case 0:
                this.c.invoke((ProductTileCtaButtonType) obj);
                return s3q0.a;
            case 1:
                fis fisVar = (fis) obj;
                if (fisVar instanceof fis.a) {
                    iqxVar = new pqx(((fis.a) fisVar).a);
                } else {
                    if (!(fisVar instanceof fis.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jis jisVar = ((fis.b) fisVar).a;
                    iqxVar = new iqx(jisVar.a, jisVar.c, jisVar.b);
                }
                this.c.invoke(iqxVar);
                return s3q0.a;
            default:
                return (io.reactivex.rxjava3.core.b0) this.c.invoke((dra0.c) obj);
        }
    }
}
